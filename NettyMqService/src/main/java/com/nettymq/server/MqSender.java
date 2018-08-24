package com.nettymq.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qs.sync.model.SyncPlaying;
import com.qs.sync.sender.SendDataFacade;

/**
 * RabbitMQ Sender based on Spring AMQP
 */
public class MqSender {

	//private RabbitTemplate rabbitTemplate;

	private SendDataFacade sendDataFacade;
	
	public MqSender() {
	   	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-applicationContext.xml" });
	     sendDataFacade = (SendDataFacade)context.getBean("sendDataFacade");
	}

	public void send(String data) {
		System.out.println("send data===::"+data);
		System.out.println("send sendDataFacade===::"+sendDataFacade);
		 SyncPlaying ptest =new SyncPlaying();
		 ptest.setExtend2(data);
		 ptest.setFromSysCode("sync-data");
		 sendDataFacade.sendByJms(ptest);
		 System.out.println("send ok===::"+ptest);
		//rabbitTemplate.convertAndSend("NettyMqServerSenderExchange", "", data);
	}
}
