package com.qs.sync.model;

import java.util.Date;

public class SyncUserRoomDetail extends SyncObject {
	private Integer id;
	
	private String uuid;
	
	private Date createTime;
	 
    private String optionType;

    private Integer player1;

    private Integer player2;

    private Integer player3;

    private Integer player4;

    private Integer gameRecord;

    private String ext1;

    private String ext2;

    private String ext3;
    
    private String appId;
    
    

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}



	public String getUuid()
	{
		return uuid;
	}

	public void setUuid(String uuid)
	{
		this.uuid = uuid;
	}

	public Date getCreateTime()
	{
		return createTime;
	}

	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}

	public String getOptionType() {
        return optionType;
    }

    public void setOptionType(String optionType) {
        this.optionType = optionType == null ? null : optionType.trim();
    }


    public Integer getPlayer1() {
        return player1;
    }

    public void setPlayer1(Integer player1) {
        this.player1 = player1;
    }

    public Integer getPlayer2() {
        return player2;
    }

    public void setPlayer2(Integer player2) {
        this.player2 = player2;
    }

    public Integer getPlayer3() {
        return player3;
    }

    public void setPlayer3(Integer player3) {
        this.player3 = player3;
    }

    public Integer getPlayer4() {
        return player4;
    }

    public void setPlayer4(Integer player4) {
        this.player4 = player4;
    }

    public Integer getGameRecord() {
        return gameRecord;
    }

    public void setGameRecord(Integer gameRecord) {
        this.gameRecord = gameRecord;
    }


    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
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
		return "SyncUserRoomDetail [id=" + id + ", uuid=" + uuid
				+ ", createTime=" + createTime + ", optionType=" + optionType
				+ ", player1=" + player1 + ", player2=" + player2 + ", player3="
				+ player3 + ", player4=" + player4 + ", gameRecord="
				+ gameRecord + ", ext1=" + ext1 + ", ext2=" + ext2 + ", ext3="
				+ ext3 + ", appId=" + appId + "]";
	}


    
}