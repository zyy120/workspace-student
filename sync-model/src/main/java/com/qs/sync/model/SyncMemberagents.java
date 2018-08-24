package com.qs.sync.model;

public class SyncMemberagents extends SyncObject{
    /** 
	 * @Fields serialVersionUID : 
	 */ 
	private static final long serialVersionUID = 7019182679221193396L;

	private Integer id;

    private Integer mid;

    private String passwd;

    private String salt;

    private String bank;

    private String bankcard;

    private String alipay;

    private String realname;

    private String phone;

    private String qq;

    private String systempasswd;

    private Byte status;

    private Byte scale;

    private Integer mktime;

    private Integer lastlogintime;

    private Integer parentId;

    private Byte alevel;

    private String remark;

    private Short belongid;

    private Integer areaid;

    private Integer firstmid;

    private Byte glevel;

    private Byte company;

    private String sitemid;

    private String code;

    private String openid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard == null ? null : bankcard.trim();
    }

    public String getAlipay() {
        return alipay;
    }

    public void setAlipay(String alipay) {
        this.alipay = alipay == null ? null : alipay.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getSystempasswd() {
        return systempasswd;
    }

    public void setSystempasswd(String systempasswd) {
        this.systempasswd = systempasswd == null ? null : systempasswd.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getScale() {
        return scale;
    }

    public void setScale(Byte scale) {
        this.scale = scale;
    }

    public Integer getMktime() {
        return mktime;
    }

    public void setMktime(Integer mktime) {
        this.mktime = mktime;
    }

    public Integer getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Integer lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Byte getAlevel() {
        return alevel;
    }

    public void setAlevel(Byte alevel) {
        this.alevel = alevel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getBelongid() {
        return belongid;
    }

    public void setBelongid(Short belongid) {
        this.belongid = belongid;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public Integer getFirstmid() {
        return firstmid;
    }

    public void setFirstmid(Integer firstmid) {
        this.firstmid = firstmid;
    }

    public Byte getGlevel() {
        return glevel;
    }

    public void setGlevel(Byte glevel) {
        this.glevel = glevel;
    }

    public Byte getCompany() {
        return company;
    }

    public void setCompany(Byte company) {
        this.company = company;
    }

    public String getSitemid() {
        return sitemid;
    }

    public void setSitemid(String sitemid) {
        this.sitemid = sitemid == null ? null : sitemid.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }
}