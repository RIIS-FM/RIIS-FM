package com.crscd.riis.freightmarket.trade.entity;

public class FmTradeContactEntity {
    private Integer id;

    private String cContactName;

    private String cContactAddress;

    private Integer iContactPostcode;

    private String cContactPhone;

    private String cContactEmail;

    private Integer iContactFlag;

    private Integer iAccountId;

    private Integer iAccountFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcContactName() {
        return cContactName;
    }

    public void setcContactName(String cContactName) {
        this.cContactName = cContactName == null ? null : cContactName.trim();
    }

    public String getcContactAddress() {
        return cContactAddress;
    }

    public void setcContactAddress(String cContactAddress) {
        this.cContactAddress = cContactAddress == null ? null : cContactAddress.trim();
    }

    public Integer getiContactPostcode() {
        return iContactPostcode;
    }

    public void setiContactPostcode(Integer iContactPostcode) {
        this.iContactPostcode = iContactPostcode;
    }

    public String getcContactPhone() {
        return cContactPhone;
    }

    public void setcContactPhone(String cContactPhone) {
        this.cContactPhone = cContactPhone == null ? null : cContactPhone.trim();
    }

    public String getcContactEmail() {
        return cContactEmail;
    }

    public void setcContactEmail(String cContactEmail) {
        this.cContactEmail = cContactEmail == null ? null : cContactEmail.trim();
    }

    public Integer getiContactFlag() {
        return iContactFlag;
    }

    public void setiContactFlag(Integer iContactFlag) {
        this.iContactFlag = iContactFlag;
    }

    public Integer getiAccountId() {
        return iAccountId;
    }

    public void setiAccountId(Integer iAccountId) {
        this.iAccountId = iAccountId;
    }

    public Integer getiAccountFlag() {
        return iAccountFlag;
    }

    public void setiAccountFlag(Integer iAccountFlag) {
        this.iAccountFlag = iAccountFlag;
    }
}