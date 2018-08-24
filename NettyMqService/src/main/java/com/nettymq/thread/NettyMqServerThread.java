package com.nettymq.thread;

import com.nettymq.server.MqSender;
import com.nettymq.server.NettyMqServerChannelInitializer;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class NettyMqServerThread implements Runnable {
    
	private ChannelFuture f;
	private int port;
	private MqSender mqSender;

    public NettyMqServerThread(int nettyport) {
        this.port = nettyport;
        this.mqSender=new MqSender();
    }

    /**
     * isActiveSocketServer
     *
     * @return boolean
     */
    public boolean isActiveSocketServer() {
        try {
            if (f != null) {
                return f.channel().isActive();
            } else {
                return false;
            }

        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 关闭Socket
     */
    public boolean doCloseSocket() {
        try {
            if (f != null) {
                if (isActiveSocketServer()) {
                    f.channel().close();
                    f = null;
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public void run() {

        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap b = new ServerBootstrap();

        	b.group(bossGroup, workGroup)
			.channel(NioServerSocketChannel.class)
			.childHandler(new NettyMqServerChannelInitializer(mqSender));
			b.option(ChannelOption.SO_BACKLOG, 128);
			b.childOption(ChannelOption.SO_KEEPALIVE, false);
			b.childOption(ChannelOption.TCP_NODELAY, true);
			b.childOption(ChannelOption.SO_REUSEADDR, true);

            f = b.bind(port).sync();

            f.channel().closeFuture().sync();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bossGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }

    }
}
