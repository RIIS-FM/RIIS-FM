package com.crscd.riis.freightmarket.authority.entity;

public class FmAccountEntity {
    private Integer id;

    private String cLoginName;

    private String cLoginPwd;

    private String cLoginPwdSalt;

    private Integer iLoginFlag;

    private Integer iLockFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcLoginName() {
        return cLoginName;
    }

    public void setcLoginName(String cLoginName) {
        this.cLoginName = cLoginName == null ? null : cLoginName.trim();
    }

    public String getcLoginPwd() {
        return cLoginPwd;
    }

    public void setcLoginPwd(String cLoginPwd) {
        this.cLoginPwd = cLoginPwd == null ? null : cLoginPwd.trim();
    }

    public String getcLoginPwdSalt() {
        return cLoginPwdSalt;
    }

    public void setcLoginPwdSalt(String cLoginPwdSalt) {
        this.cLoginPwdSalt = cLoginPwdSalt == null ? null : cLoginPwdSalt.trim();
    }

    public Integer getiLoginFlag() {
        return iLoginFlag;
    }

    public void setiLoginFlag(Integer iLoginFlag) {
        this.iLoginFlag = iLoginFlag;
    }

    public Integer getiLockFlag() {
        return iLockFlag;
    }

    public void setiLockFlag(Integer iLockFlag) {
        this.iLockFlag = iLockFlag;
    }
}