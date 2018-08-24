package com.qs.sync.model;

public class MemberfidesGameRecord extends MemberfidesGameRecordKey {
    private Integer num;

    private Integer glod;

    private Integer createRoomTotals;

    private Integer clubCreateRoomTotals;

    private String extend1;

    private String extend2;

    private String extend3;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getGlod() {
        return glod;
    }

    public void setGlod(Integer glod) {
        this.glod = glod;
    }

    public Integer getCreateRoomTotals() {
        return createRoomTotals;
    }

    public void setCreateRoomTotals(Integer createRoomTotals) {
        this.createRoomTotals = createRoomTotals;
    }

    public Integer getClubCreateRoomTotals() {
        return clubCreateRoomTotals;
    }

    public void setClubCreateRoomTotals(Integer clubCreateRoomTotals) {
        this.clubCreateRoomTotals = clubCreateRoomTotals;
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