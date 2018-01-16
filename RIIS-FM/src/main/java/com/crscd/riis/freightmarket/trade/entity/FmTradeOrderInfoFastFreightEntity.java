package com.crscd.riis.freightmarket.trade.entity;

public class FmTradeOrderInfoFastFreightEntity {
    private Integer id;

    private Integer iOrderId;

    private String cGoodsName;

    private String cGoodsCode;

    private Float fGoodsWeight;

    private Float fGoodsVolume;

    private Float fEachGoodsMaxWeight;

    private String cGoodsWrapper;

    private String cGoodsFeature;

    private String cTrainNum;

    private Integer iGoodsNumber;

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

    public Float getfGoodsWeight() {
        return fGoodsWeight;
    }

    public void setfGoodsWeight(Float fGoodsWeight) {
        this.fGoodsWeight = fGoodsWeight;
    }

    public Float getfGoodsVolume() {
        return fGoodsVolume;
    }

    public void setfGoodsVolume(Float fGoodsVolume) {
        this.fGoodsVolume = fGoodsVolume;
    }

    public Float getfEachGoodsMaxWeight() {
        return fEachGoodsMaxWeight;
    }

    public void setfEachGoodsMaxWeight(Float fEachGoodsMaxWeight) {
        this.fEachGoodsMaxWeight = fEachGoodsMaxWeight;
    }

    public String getcGoodsWrapper() {
        return cGoodsWrapper;
    }

    public void setcGoodsWrapper(String cGoodsWrapper) {
        this.cGoodsWrapper = cGoodsWrapper == null ? null : cGoodsWrapper.trim();
    }

    public String getcGoodsFeature() {
        return cGoodsFeature;
    }

    public void setcGoodsFeature(String cGoodsFeature) {
        this.cGoodsFeature = cGoodsFeature == null ? null : cGoodsFeature.trim();
    }

    public String getcTrainNum() {
        return cTrainNum;
    }

    public void setcTrainNum(String cTrainNum) {
        this.cTrainNum = cTrainNum == null ? null : cTrainNum.trim();
    }

    public Integer getiGoodsNumber() {
        return iGoodsNumber;
    }

    public void setiGoodsNumber(Integer iGoodsNumber) {
        this.iGoodsNumber = iGoodsNumber;
    }
}