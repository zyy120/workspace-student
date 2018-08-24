package com.qs.sync.model;


import java.util.Date;

/**
 * 上报游戏属性配置
 */
public class GameSettingsConfig extends SyncObject {

    private static final long serialVersionUID = 4837318576047714610L;

    private String appId;

    private Date date;

    private String mid;

    /**
     * 属性名称
     */
    private  String itemName;

    /**
     * 属性值
     */
    private  String itemId;

    /**
     * 游戏玩法Id
     */
    private  String playId;

    private  String ext1;

    private  String ext2;

    private  String ext3;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getPlayId() {
        return playId;
    }

    public void setPlayId(String playId) {
        this.playId = playId;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GameSettingsConfig{");
        sb.append("appId='").append(appId).append('\'');
        sb.append(", date=").append(date);
        sb.append(", mid='").append(mid).append('\'');
        sb.append(", itemName='").append(itemName).append('\'');
        sb.append(", itemId='").append(itemId).append('\'');
        sb.append(", playId='").append(playId).append('\'');
        sb.append(", ext1='").append(ext1).append('\'');
        sb.append(", ext2='").append(ext2).append('\'');
        sb.append(", ext3='").append(ext3).append('\'');
        sb.append('}');
        return sb.toString();
    }
}