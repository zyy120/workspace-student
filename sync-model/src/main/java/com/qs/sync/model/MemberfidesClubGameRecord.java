package com.qs.sync.model;

import java.util.Date;

public class MemberfidesClubGameRecord {
    private Integer num;

    private Integer master;

    private Integer clubId;

    private Integer clubCreateRoomTotals;

    private String extend1;

    private String extend2;

    private String extend3;
    
    
    private Integer mid;

    private Date date;

    private String appId;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    
    public Integer getMaster()
	{
		return master;
	}

	public void setMaster(Integer master)
	{
		this.master = master;
	}

	public Integer getClubId()
	{
		return clubId;
	}

	public void setClubId(Integer clubId)
	{
		this.clubId = clubId;
	}

	public Integer getClubCreateRoomTotals() {
        return clubCreateRoomTotals;
    }

    public void setClubCreateRoomTotals(Integer clubCreateRoomTotals) {
        this.clubCreateRoomTotals = clubCreateRoomTotals;
    }

    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1 == null ? null : extend1.trim();
    }

    public String getExtend2() {
        return extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2 == null ? null : extend2.trim();
    }

    public String getExtend3() {
        return extend3;
    }

    public void setExtend3(String extend3) {
        this.extend3 = extend3 == null ? null : extend3.trim();
    }
}