package com.qs.sync.model;

import java.util.Date;

public class SyncCreateRoom extends SyncObject{
    /** 
	 * @Fields serialVersionUID : 
	 */ 
	private static final long serialVersionUID = -1939614250617164142L;

	private Integer id;

    private Integer mid;

    private Integer appId;
    private String appName;
    private String playId;
    private String playName;
    private Integer gold;
    

    private Date createRoomTime;
    
    private Integer totals;
    //创建房间总数
    private Integer playNum;
    
    private Integer master;
    private Integer clubId;
    private String extend1;
    private String extend2;
    private String extend3;
    
  
    
    
    

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

	public String getExtend1()
	{
		return extend1;
	}

	public void setExtend1(String extend1)
	{
		this.extend1 = extend1;
	}

	public String getExtend2()
	{
		return extend2;
	}

	public void setExtend2(String extend2)
	{
		this.extend2 = extend2;
	}

	public String getExtend3()
	{
		return extend3;
	}

	public void setExtend3(String extend3)
	{
		this.extend3 = extend3;
	}

	public Integer getGold()
	{
		return gold;
	}

	public void setGold(Integer gold)
	{
		this.gold = gold;
	}

	public Integer getPlayNum()
	{
		return playNum;
	}

	public void setPlayNum(Integer playNum)
	{
		this.playNum = playNum;
	}

	public String getAppName()
	{
		return appName;
	}

	public void setAppName(String appName)
	{
		this.appName = appName;
	}

	public Integer getTotals()
	{
		return totals;
	}

	public void setTotals(Integer totals)
	{
		this.totals = totals;
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


    public Date getCreateRoomTime() {
        return createRoomTime;
    }

    public void setCreateRoomTime(Date createRoomTime) {
        this.createRoomTime = new Date();
    }

	public String getPlayId()
	{
		return playId;
	}

	public void setPlayId(String playId)
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
    
    
}