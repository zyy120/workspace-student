/*
 * 文件名：SyncUserRoom.java	 
 * 时     间：上午9:41:15
 * 作     者：zhengshengfei       
 * 版     权：2014-2022  牵手互动, 公司保留所有权利.
 * 
 */
package com.qs.sync.model;

import java.util.Date;
import java.util.List;

/** 
 * @ClassName: SyncUserRoom 
 * @描述: 用户房间实体类
 * @author zhengshengfei
 * @date 2017年11月13日 上午9:41:15 
 */
public class SyncUserRoom extends SyncObject{
	private Integer roomId;
	private Integer clubId;
	private Integer isopenroom;
	private String type;
	private Integer playId;
	private String playName;
	private Date  createTime;
	private Date  endTime;
	private String  createTimeStr;//用于将C++的时间戳转为时间
	private String  endTimeStr;//用于将C++的时间戳转为时间
	private Integer dissolvedId;
	private String dissolvedName;
	private Integer appId;
	private String uuid;
	private String  ext1;
	private String  ext2;
	private String  ext3;
	
	public Integer getAppId()
	{
		return appId;
	}
	public void setAppId(Integer appId)
	{
		this.appId = appId;
	}
	public Integer getRoomId()
	{
		return roomId;
	}
	public void setRoomId(Integer roomId)
	{
		this.roomId = roomId;
	}
	public Integer getClubId()
	{
		return clubId;
	}
	public void setClubId(Integer cludId)
	{
		this.clubId = cludId;
	}
	public Integer getIsopenroom()
	{
		return isopenroom;
	}
	public void setIsopenroom(Integer isopenroom)
	{
		this.isopenroom = isopenroom;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	
	public Integer getPlayId()
	{
		return playId;
	}
	public void setPlayId(Integer playId)
	{
		this.playId = playId;
	}
	public String getPlayName()
	{
		return playName;
	}
	public void setPlayName(String playName)
	{
		this.playName = playName;
	}
	public Date getCreateTime()
	{
		return createTime;
	}
	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}
	public Date getEndTime()
	{
		return endTime;
	}
	public void setEndTime(Date endTime)
	{
		this.endTime = endTime;
	}
	public String getCreateTimeStr()
	{
		return createTimeStr;
	}
	public void setCreateTimeStr(String createTimeStr)
	{
		this.createTimeStr = createTimeStr;
	}
	public String getEndTimeStr()
	{
		return endTimeStr;
	}
	public void setEndTimeStr(String endTimeStr)
	{
		this.endTimeStr = endTimeStr;
	}
	public Integer getDissolvedId()
	{
		return dissolvedId;
	}
	public void setDissolvedId(Integer dissolvedId)
	{
		this.dissolvedId = dissolvedId;
	}
	public String getDissolvedName()
	{
		return dissolvedName;
	}
	public void setDissolvedName(String dissolvedName)
	{
		this.dissolvedName = dissolvedName;
	}

	public String getUuid()
	{
		return uuid;
	}
	public void setUuid(String uuid)
	{
		this.uuid = uuid;
	}
	public String getExt1()
	{
		return ext1;
	}
	public void setExt1(String ext1)
	{
		this.ext1 = ext1;
	}
	public String getExt2()
	{
		return ext2;
	}
	public void setExt2(String ext2)
	{
		this.ext2 = ext2;
	}
	public String getExt3()
	{
		return ext3;
	}
	public void setExt3(String ext3)
	{
		this.ext3 = ext3;
	}
	@Override
	public String toString()
	{
		return "SyncUserRoom [roomId=" + roomId + ", clubId=" + clubId
				+ ", isopenroom=" + isopenroom + ", type=" + type + ", playId="
				+ playId + ", playName=" + playName + ", createTime="
				+ createTime + ", endTime=" + endTime + ", createTimeStr="
				+ createTimeStr + ", endTimeStr=" + endTimeStr
				+ ", dissolvedId=" + dissolvedId + ", dissolvedName="
				+ dissolvedName + ", appId=" + appId + ", uuid=" + uuid
				+ ", ext1=" + ext1 + ", ext2=" + ext2 + ", ext3=" + ext3 + "]";
	}

}
