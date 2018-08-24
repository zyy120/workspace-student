package com.qs.sync.sender.util;

import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQTopic;

import com.qs.sync.model.DouniuGameRecord;
import com.qs.sync.model.DouniuGameRecordSub;
import com.qs.sync.model.GameRecord;
import com.qs.sync.model.GameRecordSub;
import com.qs.sync.model.GoldLog;
import com.qs.sync.model.MajiangGameRecord;
import com.qs.sync.model.MajiangGameRecordSub;
import com.qs.sync.model.PlayerRecord;
import com.qs.sync.model.RoomRecord;
import com.qs.sync.model.RunfastUserRoomDetail;
import com.qs.sync.model.SyncCreateRoom;
import com.qs.sync.model.SyncGameRule;
import com.qs.sync.model.SyncMemberagents;
import com.qs.sync.model.SyncMemberbusiness;
import com.qs.sync.model.SyncMemberfides;
import com.qs.sync.model.SyncObject;
import com.qs.sync.model.SyncPlaying;
import com.qs.sync.model.SyncRunfastGameRule;
import com.qs.sync.model.SyncUserKeep;
import com.qs.sync.model.SyncUserLoginLog;
import com.qs.sync.model.SyncUserRoom;
import com.qs.sync.model.UserIntegral;
import com.qs.sync.model.UserIntegralVo;
import com.qs.sync.model.UserRoomDetail;


/**
 * @ClassName: DataUtil
 * @Description: (数据操作工具类.)
 * @author moyousheng
 */
public class DataUtil {
	private static ActiveMQTopic dataCenter = new ActiveMQTopic(TopicConstants.TOPIC_NAME_DATACENTER);
	
	private static ActiveMQTopic playing = new ActiveMQTopic(TopicConstants.TOPIC_NAME_PLAYING);
	private static ActiveMQTopic createRoom = new ActiveMQTopic(TopicConstants.TOPIC_NAME_CREATE_ROOM);
	private static ActiveMQTopic userLoginLog = new ActiveMQTopic(TopicConstants.TOPIC_NAME_USER_LOGIN);
	private static ActiveMQTopic userKeep = new ActiveMQTopic(TopicConstants.TOPIC_NAME_USER_Add);
	private static ActiveMQTopic gameRule = new ActiveMQTopic(TopicConstants.TOPIC_NAME_GAME_RULE);
	private static ActiveMQTopic runfastGameRule = new ActiveMQTopic(TopicConstants.TOPIC_NAME_RUNFAST_GAME_RULE);
	
	
	private static ActiveMQTopic memberfides = new ActiveMQTopic(TopicConstants.TOPIC_NAME_MEMBERFIDES);
	private static ActiveMQTopic memberagents = new ActiveMQTopic(TopicConstants.TOPIC_NAME_MEMBERAGENTS);
	private static ActiveMQTopic memberbusiness = new ActiveMQTopic(TopicConstants.TOPIC_NAME_MEMBERBUSINESS);
	
	
	private static ActiveMQTopic gameRecord = new ActiveMQTopic(TopicConstants.TOPIC_NAME_GAME_RECORD);
	private static ActiveMQTopic gameRecordSub = new ActiveMQTopic(TopicConstants.TOPIC_NAME_GAME_RECORD_SUB);
	private static ActiveMQTopic goldLog = new ActiveMQTopic(TopicConstants.TOPIC_NAME_GOLD_LOG);
	private static ActiveMQTopic playerRecord = new ActiveMQTopic(TopicConstants.TOPIC_NAME_PLAYER_RECORD);
	private static ActiveMQTopic roomRecord = new ActiveMQTopic(TopicConstants.TOPIC_NAME_ROOM_RECORD);
	private static ActiveMQTopic douniuGameRecord = new ActiveMQTopic(TopicConstants.TOPIC_NAME_DOUNIU_GAME_RECORD);
	private static ActiveMQTopic douniuGameRecordSub = new ActiveMQTopic(TopicConstants.TOPIC_NAME_DOUNIU_GAME_RECORD_SUB);
	private static ActiveMQTopic majiangGameRecord = new ActiveMQTopic(TopicConstants.TOPIC_NAME_MAJIANG_GAME_RECORD);
	private static ActiveMQTopic majiangGameRecordSub = new ActiveMQTopic(TopicConstants.TOPIC_NAME_MAJIANG_GAME_RECORD_SUB);
	
	private static ActiveMQTopic userRoom = new ActiveMQTopic(TopicConstants.TOPIC_NAME_USER_ROOM);
	private static ActiveMQTopic userRoomDetail = new ActiveMQTopic(TopicConstants.TOPIC_NAME_USER_ROOM_DETAIL);
	private static ActiveMQTopic userIntegral = new ActiveMQTopic(TopicConstants.TOPIC_NAME_USER_INTEGRAL);
	private static ActiveMQTopic runfastUserRoomDetail = new ActiveMQTopic(TopicConstants.TOPIC_NAME_RUNFAST_USER_ROOM_DETAIL);
	
	/**
     * 
     * @标题: checkSendObject 
     * @描述: 根据对象类型得到JMS发送目的地
     *
     * @参数信息
     *    @param model
     *    @return 否则返回null 返回空则为平台不支持的对象类型
     */
	public static Destination getJmsDestination(Object model)
	{
		if (model instanceof SyncPlaying)
		{
			return playing;
		} else if (model instanceof SyncCreateRoom)
		{
			return createRoom;
		} else if (model instanceof SyncUserLoginLog)
		{
			return userLoginLog;
		} else if (model instanceof SyncUserKeep)
		{
			return userKeep;
		} else if (model instanceof SyncGameRule)
		{
			return gameRule;
		}  else if (model instanceof SyncRunfastGameRule)
		{
			return runfastGameRule;
		} else if (model instanceof SyncMemberagents)
		{
			return memberagents;
		} else if (model instanceof SyncMemberbusiness)
		{
			return memberbusiness;
		} else if (model instanceof GameRecord)
		{
			return gameRecord;
		} else if (model instanceof GameRecordSub)
		{
			return gameRecordSub;
		} else if (model instanceof GoldLog)
		{
			return goldLog;
		} else if (model instanceof PlayerRecord)
		{
			return playerRecord;
		} else if (model instanceof RoomRecord)
		{
			return roomRecord;
		} else if (model instanceof DouniuGameRecord)
		{
			return douniuGameRecord;
		} else if (model instanceof DouniuGameRecordSub)
		{
			return douniuGameRecordSub;
		} else if (model instanceof MajiangGameRecord)
		{
			return majiangGameRecord;
		} else if (model instanceof MajiangGameRecordSub)
		{
			return majiangGameRecordSub;
		} else if (model instanceof SyncUserRoom)
		{
			return userRoom;
		}else if (model instanceof UserRoomDetail)
		{
			return userRoomDetail;
		} else if (model instanceof UserIntegralVo)
		{
			return userIntegral;
		}else if (model instanceof RunfastUserRoomDetail)
		{
			return runfastUserRoomDetail;
		}else{
			
			return dataCenter;
		}
		
	}
    
    /**
     * 
     * @标题: checkObjectParam 
     * @描述: 数据发送入参检查
     *
     * @参数信息
     *    @param model
     *    @return
     */
    public static boolean checkObjectParam(SyncObject syncObj){
		if(null == syncObj.getFromSysCode()){
			//传的对象数据不合法
			throw new RuntimeException("model类不合法，请传入来源系统代码：fromSysCode ");
		}
    	return true;
    }
    
    
}
