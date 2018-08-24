package com.qs.sync.model;

import java.util.Date;

public class SyncUserPlayingTime extends SyncObject {
    private static final long serialVersionUID = 7541502674686899373L;
    private Integer buringTime;

    private String extend1;

    private String extend2;

    private String extend3;

    private Integer mid;

    private Date loginDate;

    private Integer appId;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = new Date();
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getBuringTime() {
        return buringTime;
    }

    public void setBuringTime(Integer buringTime) {
        this.buringTime = buringTime;
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