package com.qs.sync.model;

import java.util.Date;
/**
 * 
 * @ClassName: RoomCardCount 
 * @描述: 房卡统计  
 * @author zhengshengfei
 * @date 2017年10月18日 下午2:29:53
 */
public class RoomCardCount {
    private Integer id;

    private Date date;

    private Integer dailyDecr;

    private Integer allCard;

    private Integer agentCard;

    private Integer userCard;

    private String remark;

    private String descr;

    private String ext1;

    private String ext2;

    private String ext3;

    private String dbName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getDailyDecr() {
        return dailyDecr;
    }

    public void setDailyDecr(Integer dailyDecr) {
        this.dailyDecr = dailyDecr;
    }

    public Integer getAllCard() {
        return allCard;
    }

    public void setAllCard(Integer allCard) {
        this.allCard = allCard;
    }

    public Integer getAgentCard() {
        return agentCard;
    }

    public void setAgentCard(Integer agentCard) {
        this.agentCard = agentCard;
    }

    public Integer getUserCard() {
        return userCard;
    }

    public void setUserCard(Integer userCard) {
        this.userCard = userCard;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
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

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName == null ? null : dbName.trim();
    }
}