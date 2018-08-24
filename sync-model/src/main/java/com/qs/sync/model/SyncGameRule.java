package com.qs.sync.model;

import java.util.Date;

/**
 * C++调用接口，主要处理统计炸弹，春天的记录
 * @author zhengshengfei
 *
 */
public class SyncGameRule extends SyncObject {
	private Integer id;				//id
	private Integer mid;			//用户id
	private Integer appId;			//游戏id
	private Date createTime;		//创建时间
	private String name;			//名称 如炸弹，春天等
	private String type;			//0是炸弹  1是春天
	private String playId;			//玩法id
	private String playName;		//玩法名字
	private Integer totals;			//总数
	private String ext1;			//扩展字段1
	private String ext2;			//扩展字段2
	private String ext3;			//扩展字段3
	public String getPlayId() {
		return playId;
	}
	public void setPlayId(String playId) {
		this.playId = playId;
	}
	public String getPlayName() {
		return playName;
	}
	public void setPlayName(String playName) {
		this.playName = playName;
	}
	public Integer getTotals() {
		return totals;
	}
	public void setTotals(Integer totals) {
		this.totals = totals;
	}
	public String getExt1() {
		return ext1;
	}
	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}
	public String getExt2() {
		return ext2;
	}
	public void setExt2(String ext2) {
		this.ext2 = ext2;
	}
	public String getExt3() {
		return ext3;
	}
	public void setExt3(String ext3) {
		this.ext3 = ext3;
	}	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = new Date();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "SyncGameRule [id=" + id + ", mid=" + mid + ", appId=" + appId + ", createTime=" + createTime + ", name="
				+ name + ", type=" + type + ", playId=" + playId + ", playName=" + playName + ", totals=" + totals
				+ ", ext1=" + ext1 + ", ext2=" + ext2 + ", ext3=" + ext3 + "]";
	}
	
}
