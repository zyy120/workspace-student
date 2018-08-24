package com.qs.sync.model;


/**
 * 上报活动操作信息
 */
public class SyncActivityOperateInfo extends SyncObject {

    private static final long serialVersionUID = 5030333646866737567L;
    /**
     * 游戏编码
     */
    private int appId;

    /**
     * 活动编码
     */
    private int activityId;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 操作人ID
     */
    private int operatorId;

    /**
     * 操作时间
     */
    private String operateTime;

    /**
     * 操作类型：1=点击预测，2=分享朋友圈
     */
    private int type;

    /**
     * 操作信息
     */
    private String info;

    /**
     * 扩展字段1
     */
    private String extend1;

    /**
     * 扩展字段2
     */
    private String extend2;

    /**
     * 扩展字段3
     */
    private String extend3;

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    public String getExtend2() {
        return extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    public String getExtend3() {
        return extend3;
    }

    public void setExtend3(String extend3) {
        this.extend3 = extend3;
    }
}