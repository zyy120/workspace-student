package com.qs.sync.model;

import java.util.Date;

public class GoldLog extends SyncObject {
    /** 
	 * @Fields serialVersionUID : 
	 */ 
	private static final long serialVersionUID = 1579016419216325386L;

	private Long id;

    private Integer mid;

    private Integer type;

    private Long gold;

    private Long nowgold;

    private Integer action;

    private Date date;

    private String remark;

    private Integer gametype;

    private Integer formid;

    private Integer colltype;

    //数据库名字，动态插入
    private String dbName;

    public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }



    public Integer getType()
	{
		return type;
	}

	public void setType(Integer type)
	{
		this.type = type;
	}

	public Integer getAction()
	{
		return action;
	}

	public void setAction(Integer action)
	{
		this.action = action;
	}

	public Integer getGametype()
	{
		return gametype;
	}

	public void setGametype(Integer gametype)
	{
		this.gametype = gametype;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	public Long getGold() {
        return gold;
    }

    public void setGold(Long gold) {
        this.gold = gold;
    }

    public Long getNowgold() {
        return nowgold;
    }

    public void setNowgold(Long nowgold) {
        this.nowgold = nowgold;
    }



    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }


    public Integer getFormid() {
        return formid;
    }

    public void setFormid(Integer formid) {
        this.formid = formid;
    }

    public Integer getColltype() {
        return colltype;
    }

    public void setColltype(Integer colltype) {
        this.colltype = colltype;
    }

    @Override
    public String toString() {
        return "GoldLog{" +
                "id=" + id +
                ", mid=" + mid +
                ", type=" + type +
                ", gold=" + gold +
                ", nowgold=" + nowgold +
                ", action=" + action +
                ", date=" + date +
                ", remark='" + remark + '\'' +
                ", gametype=" + gametype +
                ", formid=" + formid +
                ", colltype=" + colltype +
                ", dbName='" + dbName + '\'' +
                '}';
    }
}