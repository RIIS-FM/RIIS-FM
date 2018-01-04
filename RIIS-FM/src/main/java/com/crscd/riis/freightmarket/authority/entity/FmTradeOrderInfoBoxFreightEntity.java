package com.crscd.riis.freightmarket.authority.entity;

import java.util.Date;

public class FmTradeOrderInfoBoxFreightEntity {
    private Integer id;

    private Integer iOrderId;

    private String cGoodsName;

    private String cGoodsCode;

    private String cGoodsFeature;

    private Integer iBoxGetType;

    private Integer iBoxNumber;

    private Integer iBoxType;

    private Integer iBoxNum;

    private Integer iBoxSealNum;

    private Date dBoxRecverTime;

    private Float fGoodsWeight;

    private String cSenderBoxStation;

    private Integer iFullboxInStation;

    private Integer iSenderLineId;

    private Integer iRecverLineId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getiOrderId() {
        return iOrderId;
    }

    public void setiOrderId(Integer iOrderId) {
        this.iOrderId = iOrderId;
    }

    public String getcGoodsName() {
        return cGoodsName;
    }

    public void setcGoodsName(String cGoodsName) {
        this.cGoodsName = cGoodsName == null ? null : cGoodsName.trim();
    }

    public String getcGoodsCode() {
        return cGoodsCode;
    }

    public void setcGoodsCode(String cGoodsCode) {
        this.cGoodsCode = cGoodsCode == null ? null : cGoodsCode.trim();
    }

    public String getcGoodsFeature() {
        return cGoodsFeature;
    }

    public void setcGoodsFeature(String cGoodsFeature) {
        this.cGoodsFeature = cGoodsFeature == null ? null : cGoodsFeature.trim();
    }

    public Integer getiBoxGetType() {
        return iBoxGetType;
    }

    public void setiBoxGetType(Integer iBoxGetType) {
        this.iBoxGetType = iBoxGetType;
    }

    public Integer getiBoxNumber() {
        return iBoxNumber;
    }

    public void setiBoxNumber(Integer iBoxNumber) {
        this.iBoxNumber = iBoxNumber;
    }

    public Integer getiBoxType() {
        return iBoxType;
    }

    public void setiBoxType(Integer iBoxType) {
        this.iBoxType = iBoxType;
    }

    public Integer getiBoxNum() {
        return iBoxNum;
    }

    public void setiBoxNum(Integer iBoxNum) {
        this.iBoxNum = iBoxNum;
    }

    public Integer getiBoxSealNum() {
        return iBoxSealNum;
    }

    public void setiBoxSealNum(Integer iBoxSealNum) {
        this.iBoxSealNum = iBoxSealNum;
    }

    public Date getdBoxRecverTime() {
        return dBoxRecverTime;
    }

    public void setdBoxRecverTime(Date dBoxRecverTime) {
        this.dBoxRecverTime = dBoxRecverTime;
    }

    public Float getfGoodsWeight() {
        return fGoodsWeight;
    }

    public void setfGoodsWeight(Float fGoodsWeight) {
        this.fGoodsWeight = fGoodsWeight;
    }

    public String getcSenderBoxStation() {
        return cSenderBoxStation;
    }

    public void setcSenderBoxStation(String cSenderBoxStation) {
        this.cSenderBoxStation = cSenderBoxStation == null ? null : cSenderBoxStation.trim();
    }

    public Integer getiFullboxInStation() {
        return iFullboxInStation;
    }

    public void setiFullboxInStation(Integer iFullboxInStation) {
        this.iFullboxInStation = iFullboxInStation;
    }

    public Integer getiSenderLineId() {
        return iSenderLineId;
    }

    public void setiSenderLineId(Integer iSenderLineId) {
        this.iSenderLineId = iSenderLineId;
    }

    public Integer getiRecverLineId() {
        return iRecverLineId;
    }

    public void setiRecverLineId(Integer iRecverLineId) {
        this.iRecverLineId = iRecverLineId;
    }
}