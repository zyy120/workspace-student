/*
 * 文件名：UserRoomDetail.java	 
 * 时     间：下午2:40:03
 * 作     者：zhengshengfei       
 * 版     权：2014-2022  牵手互动, 公司保留所有权利.
 * 
 */
package com.qs.sync.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

/** 
 * @ClassName: UserRoomDetail 
 * @描述: 负责同步房间数据明细表的转换
 * @author zhengshengfei
 * @date 2017年11月13日 下午2:40:03 
 */
public class UserRoomDetail extends SyncObject{
		
	private String uuid;
	
    private Map<String,Object> unit;  //单位  胡息

    private Map<String,Object> integral;  //积分
    
    private Map<String,Object> mid;  //mid
    
    private Integer gameRecord;  //局数
    
    private String appId;//代表當前游戲



	public String getUuid()
	{
		return uuid;
	}

	public void setUuid(String uuid)
	{
		this.uuid = uuid;
	}

	

	public Map<String, Object> getUnit()
	{
		return unit;
	}

	public void setUnit(Map<String, Object> unit)
	{
		this.unit = unit;
	}

	public Map<String, Object> getIntegral()
	{
		return integral;
	}

	public void setIntegral(Map<String, Object> integral)
	{
		this.integral = integral;
	}

	public Map<String, Object> getMid()
	{
		return mid;
	}

	public void setMid(Map<String, Object> mid)
	{
		this.mid = mid;
	}

	public Integer getGameRecord()
	{
		return gameRecord;
	}

	public void setGameRecord(Integer gameRecord)
	{
		this.gameRecord = gameRecord;
	}

		
	public String getAppId()
	{
		return appId;
	}

	public void setAppId(String appId)
	{
		this.appId = appId;
	}

	@Override
	public String toString()
	{
		return "UserRoomDetail [uuid=" + uuid + ", unit=" + unit + ", integral="
				+ integral + ", mid=" + mid + ", gameRecord=" + gameRecord
				+ ", appId=" + appId + "]";
	}





}
