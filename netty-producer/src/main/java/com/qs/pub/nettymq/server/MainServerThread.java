package com.qs.pub.nettymq.server;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Main Program
 */
public class MainServerThread {
	
    private static int port = 18866;
	
	public static void main(String[] args) throws IOException {
		MqSender sender=new MqSender();
		 //实例化socket服务
		NettyMqServerThread server = new NettyMqServerThread(sender,port);
        // 开启线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        //启动
        executorService.execute(server);
        //logger.info("启动Netty服务完成v0.6,port="+port);
        System.out.println("启动Netty服务完成v0.6,port="+port);
        //定
        System.in.read();
	}
}
