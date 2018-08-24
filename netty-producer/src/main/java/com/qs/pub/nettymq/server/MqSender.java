package com.qs.pub.nettymq.server;

import java.util.HashMap;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qs.common.constant.LogType;
import com.qs.sync.model.SyncCreateRoom;
import com.qs.sync.model.SyncPlaying;
import com.qs.sync.sender.SendDataFacade;


/**
 * MQ Sender based on Spring AMQP
 */
public class MqSender
{
	
	private SendDataFacade sendDataFacade;
	
	public MqSender()
	{
	
	   	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
					"spring/spring-applicationContext.xml" });
				
		sendDataFacade = (SendDataFacade)context.getBean("sendDataFacade");
		// 原来的
		// SendDataFacade sendDataFacade =
		// ContextUtil.getBeanByType(SendDataFacade.class);
	}
	
	public void send(String params){
		boolean sendResult = false;
		Map<String, Object> map = new HashMap<String, Object>();
		
		 System.out.println("params0000="+params);
		 System.out.println("sendDataFacade="+sendDataFacade);
		 SyncPlaying ptest =new SyncPlaying();
		 ptest.setExtend2(params);
		 ptest.setFromSysCode("sync-data");
		 sendDataFacade.sendByJms(ptest);
		
		if (null != sendDataFacade){
			JSONObject obj = JSON.parseObject(params);
			String logType = obj.getString("logType");
	
			 System.out.println("params11111111111111111111="+params);
			 
			
			if (logType != null && !logType.trim().equals("")){
				if (logType.equals(LogType.PLAYING)){
					SyncPlaying pl = JSON.parseObject(params,
							SyncPlaying.class);
					pl.setFromSysCode("sync-data");
					sendResult = sendDataFacade.sendByJms(pl);
				} else if (logType.equals(LogType.CREATE_ROOM)){
					SyncCreateRoom sc = JSON.parseObject(params,SyncCreateRoom.class);
					sc.setFromSysCode("sync-data");
					sendResult = sendDataFacade.sendByJms(sc);
				}
		   }
			
			
			
		}
		
	}
			
}
