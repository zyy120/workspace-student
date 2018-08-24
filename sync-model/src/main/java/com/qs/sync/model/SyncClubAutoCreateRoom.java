package com.qs.sync.model;

import java.util.Date;

public class SyncClubAutoCreateRoom  extends SyncObject{


    private static final long serialVersionUID = 859236821454912753L;
    private Integer mid;

    private Integer roomTotals;

    private String extend1;

    private String extend2;

    private String extend3;

    private String appId;

    private Integer clubId;

    private Date createDate;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = new Date();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getRoomTotals() {
        return roomTotals;
    }

    public void setRoomTotals(Integer roomTotals) {
        this.roomTotals = roomTotals;
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