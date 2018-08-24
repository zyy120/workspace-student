package com.qs.sync.model;

import java.util.Date;

public class ClubUserLog extends SyncObject{
    /** 
	 * @Fields serialVersionUID : 
	 */ 
	private static final long serialVersionUID = -4427368405481801181L;

	private Integer optionVal;

    private String extend1;

    private String extend2;

    private String extend3;
    
    

    private Integer mid;

    private Integer clubId;

    private Date createDate;

    private String appId;

    private Integer clubMid;

    private String clubName;

    private Integer clubMtime;

    private Integer mtime;

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public Integer getClubMtime() {
        return clubMtime;
    }

    public void setClubMtime(Integer clubMtime) {
        this.clubMtime = clubMtime;
    }

    public Integer getMtime() {
        return mtime;
    }

    public void setMtime(Integer mtime) {
        this.mtime = mtime;
    }

    public Integer getClubMid() {
        return clubMid;
    }

    public void setClubMid(Integer clubMid) {
        this.clubMid = clubMid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
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

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }


    public Integer getOptionVal() {
        return optionVal;
    }

    public void setOptionVal(Integer optionVal) {
        this.optionVal = optionVal;
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