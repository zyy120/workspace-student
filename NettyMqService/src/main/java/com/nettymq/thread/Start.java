package com.nettymq.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Start {

	private static Logger logger = LoggerFactory.getLogger(Start.class);
 
    private static int port = 18866;
    private static String ip = "127.0.0.1";

    //protected static ApplicationContext context = null;

    
    public static void main(String[] args)  throws Exception{
        //logger.info("启动Netty服务开始");
    
        //实例化socket服务
        NettyMqServerThread serverSocket = new NettyMqServerThread(port);
        // 开启线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        //启动
        executorService.execute(serverSocket);
        logger.info("启动Netty服务完成v0.6,port="+port);
        //定
        System.in.read();
    }

	

}
 