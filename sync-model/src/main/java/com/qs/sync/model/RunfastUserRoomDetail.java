package com.qs.sync.model;

import java.util.Date;

public class RunfastUserRoomDetail  extends SyncObject {
	private Integer id;

	private Date createTime;
	
    private String uuid;

    private Integer type1;

    private Integer type2;

    private Integer type3;

    private Integer type4;

    private Integer type5;

    private Integer type6;

    private Integer type7;

    private Integer type8;
    
    private String type9;

    private Integer player1;

    private Integer player2;

    private Integer player3;

    private Integer player4;

    private Integer gameRecord;

    private String ext1;

    private String ext2;

    private String ext3;
    

    public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Date getCreateTime()
	{
		return createTime;
	}

	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}

	public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getType1() {
        return type1;
    }

    public void setType1(Integer type1) {
        this.type1 = type1;
    }

    public Integer getType2() {
        return type2;
    }

    public void setType2(Integer type2) {
        this.type2 = type2;
    }

    public Integer getType3() {
        return type3;
    }

    public void setType3(Integer type3) {
        this.type3 = type3;
    }

    public Integer getType4() {
        return type4;
    }

    public void setType4(Integer type4) {
        this.type4 = type4;
    }

    public Integer getType5() {
        return type5;
    }

    public void setType5(Integer type5) {
        this.type5 = type5;
    }

    public Integer getType6() {
        return type6;
    }

    public void setType6(Integer type6) {
        this.type6 = type6;
    }

    public Integer getType7() {
        return type7;
    }

    public void setType7(Integer type7) {
        this.type7 = type7;
    }

    public Integer getType8() {
        return type8;
    }

    public void setType8(Integer type8) {
        this.type8 = type8;
    }

    	
    public String getType9()
	{
		return type9;
	}

	public void setType9(String type9)
	{
		this.type9 = type9;
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
}