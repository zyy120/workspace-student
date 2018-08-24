package com.qs.sync.model;

import java.util.Date;

public class BeardGameRecord  extends SyncObject {
	
    /** 
	 * @Fields serialVersionUID : 
	 */ 
	private static final long serialVersionUID = 4277930457431021329L;

	private Long id;

    private String uid;

    private Integer roomid;

    private Integer num;

    private Integer player1;

    private Integer player2;

    private Integer player3;

    private Integer player4;

    private String dataGame;

    private Date date;

    private Byte type;

    private Integer master;

    private Integer pay;

    private Integer clubId;
    
  //数据库名字，动态插入
    private String dbName;
    

    public String getDbName()
	{
		return dbName;
	}

	public void setDbName(String dbName)
	{
		this.dbName = dbName;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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

    public String getDataGame() {
        return dataGame;
    }

    public void setDataGame(String dataGame) {
        this.dataGame = dataGame == null ? null : dataGame.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getMaster() {
        return master;
    }

    public void setMaster(Integer master) {
        this.master = master;
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }
}