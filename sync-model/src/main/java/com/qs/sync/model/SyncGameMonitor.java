package com.qs.sync.model;

import java.util.Date;

public class SyncGameMonitor extends SyncObject {
    private static final long serialVersionUID = -7231046034023922230L;
    private Integer id;

    private Date createTime;

    private String ip;

    private String port;

    private Integer createConn;

    private Integer connTotal;

    private Integer loginFailTotal;

    private Integer dupLoginTotal;

    private Integer registerTimeoutTotal;

    private Integer notActiveTotal;

    private String appId;

    private String ext1;

    private String ext2;

    private String ext3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = new Date();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    public Integer getCreateConn() {
        return createConn;
    }

    public void setCreateConn(Integer createConn) {
        this.createConn = createConn;
    }

    public Integer getConnTotal() {
        return connTotal;
    }

    public void setConnTotal(Integer connTotal) {
        this.connTotal = connTotal;
    }

    public Integer getLoginFailTotal() {
        return loginFailTotal;
    }

    public void setLoginFailTotal(Integer loginFailTotal) {
        this.loginFailTotal = loginFailTotal;
    }

    public Integer getDupLoginTotal() {
        return dupLoginTotal;
    }

    public void setDupLoginTotal(Integer dupLoginTotal) {
        this.dupLoginTotal = dupLoginTotal;
    }

    public Integer getRegisterTimeoutTotal() {
        return registerTimeoutTotal;
    }

    public void setRegisterTimeoutTotal(Integer registerTimeoutTotal) {
        this.registerTimeoutTotal = registerTimeoutTotal;
    }

    public Integer getNotActiveTotal() {
        return notActiveTotal;
    }

    public void setNotActiveTotal(Integer notActiveTotal) {
        this.notActiveTotal = notActiveTotal;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
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