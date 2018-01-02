package com.crscd.riis.freightmarket.authority.entity;

public class FmUserEntity {
    private Integer id;

    private Integer iAccountId;

    private String cRailwayBureau;

    private String cUserName;

    private String cUserAddress;

    private String cUserIdNum;

    private String cUserPhone;

    private String cUserMail;

    private String cUserTel;

    private String cPwdQ;

    private String cPwdA;

    private Integer iFreightFlag;

    private String cShipperName;

    private String cLoadingStation;

    private String cLoadingLocation;

    private String cGoodsName;

    private String cUnloadingStation;

    private String cUnloadingLocation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getiAccountId() {
        return iAccountId;
    }

    public void setiAccountId(Integer iAccountId) {
        this.iAccountId = iAccountId;
    }

    public String getcRailwayBureau() {
        return cRailwayBureau;
    }

    public void setcRailwayBureau(String cRailwayBureau) {
        this.cRailwayBureau = cRailwayBureau == null ? null : cRailwayBureau.trim();
    }

    public String getcUserName() {
        return cUserName;
    }

    public void setcUserName(String cUserName) {
        this.cUserName = cUserName == null ? null : cUserName.trim();
    }

    public String getcUserAddress() {
        return cUserAddress;
    }

    public void setcUserAddress(String cUserAddress) {
        this.cUserAddress = cUserAddress == null ? null : cUserAddress.trim();
    }

    public String getcUserIdNum() {
        return cUserIdNum;
    }

    public void setcUserIdNum(String cUserIdNum) {
        this.cUserIdNum = cUserIdNum == null ? null : cUserIdNum.trim();
    }

    public String getcUserPhone() {
        return cUserPhone;
    }

    public void setcUserPhone(String cUserPhone) {
        this.cUserPhone = cUserPhone == null ? null : cUserPhone.trim();
    }

    public String getcUserMail() {
        return cUserMail;
    }

    public void setcUserMail(String cUserMail) {
        this.cUserMail = cUserMail == null ? null : cUserMail.trim();
    }

    public String getcUserTel() {
        return cUserTel;
    }

    public void setcUserTel(String cUserTel) {
        this.cUserTel = cUserTel == null ? null : cUserTel.trim();
    }

    public String getcPwdQ() {
        return cPwdQ;
    }

    public void setcPwdQ(String cPwdQ) {
        this.cPwdQ = cPwdQ == null ? null : cPwdQ.trim();
    }

    public String getcPwdA() {
        return cPwdA;
    }

    public void setcPwdA(String cPwdA) {
        this.cPwdA = cPwdA == null ? null : cPwdA.trim();
    }

    public Integer getiFreightFlag() {
        return iFreightFlag;
    }

    public void setiFreightFlag(Integer iFreightFlag) {
        this.iFreightFlag = iFreightFlag;
    }

    public String getcShipperName() {
        return cShipperName;
    }

    public void setcShipperName(String cShipperName) {
        this.cShipperName = cShipperName == null ? null : cShipperName.trim();
    }

    public String getcLoadingStation() {
        return cLoadingStation;
    }

    public void setcLoadingStation(String cLoadingStation) {
        this.cLoadingStation = cLoadingStation == null ? null : cLoadingStation.trim();
    }

    public String getcLoadingLocation() {
        return cLoadingLocation;
    }

    public void setcLoadingLocation(String cLoadingLocation) {
        this.cLoadingLocation = cLoadingLocation == null ? null : cLoadingLocation.trim();
    }

    public String getcGoodsName() {
        return cGoodsName;
    }

    public void setcGoodsName(String cGoodsName) {
        this.cGoodsName = cGoodsName == null ? null : cGoodsName.trim();
    }

    public String getcUnloadingStation() {
        return cUnloadingStation;
    }

    public void setcUnloadingStation(String cUnloadingStation) {
        this.cUnloadingStation = cUnloadingStation == null ? null : cUnloadingStation.trim();
    }

    public String getcUnloadingLocation() {
        return cUnloadingLocation;
    }

    public void setcUnloadingLocation(String cUnloadingLocation) {
        this.cUnloadingLocation = cUnloadingLocation == null ? null : cUnloadingLocation.trim();
    }
}