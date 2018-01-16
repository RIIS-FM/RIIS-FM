package com.crscd.riis.freightmarket.trade.entity;

public class FmTradeOrderInfoWholeVegicleFreightEntity {
    private Integer id;

    private Integer iOrderId;

    private String cGoodsName;

    private String cGoodsCode;

    private Float fGoodsWight;

    private Float fGoodsVolume;

    private String cGoodsFeature;

    private Float fEachGoodsMaxWeight;

    private Integer iGoodsRequestTrainNumber;

    private Integer iGoodsSealNum;

    private Integer iGoodsReinforce;

    private String cGoodsWrapper;

    private Integer iCanvasNumber;

    private Integer iTrainType;

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

    public Float getfGoodsWight() {
        return fGoodsWight;
    }

    public void setfGoodsWight(Float fGoodsWight) {
        this.fGoodsWight = fGoodsWight;
    }

    public Float getfGoodsVolume() {
        return fGoodsVolume;
    }

    public void setfGoodsVolume(Float fGoodsVolume) {
        this.fGoodsVolume = fGoodsVolume;
    }

    public String getcGoodsFeature() {
        return cGoodsFeature;
    }

    public void setcGoodsFeature(String cGoodsFeature) {
        this.cGoodsFeature = cGoodsFeature == null ? null : cGoodsFeature.trim();
    }

    public Float getfEachGoodsMaxWeight() {
        return fEachGoodsMaxWeight;
    }

    public void setfEachGoodsMaxWeight(Float fEachGoodsMaxWeight) {
        this.fEachGoodsMaxWeight = fEachGoodsMaxWeight;
    }

    public Integer getiGoodsRequestTrainNumber() {
        return iGoodsRequestTrainNumber;
    }

    public void setiGoodsRequestTrainNumber(Integer iGoodsRequestTrainNumber) {
        this.iGoodsRequestTrainNumber = iGoodsRequestTrainNumber;
    }

    public Integer getiGoodsSealNum() {
        return iGoodsSealNum;
    }

    public void setiGoodsSealNum(Integer iGoodsSealNum) {
        this.iGoodsSealNum = iGoodsSealNum;
    }

    public Integer getiGoodsReinforce() {
        return iGoodsReinforce;
    }

    public void setiGoodsReinforce(Integer iGoodsReinforce) {
        this.iGoodsReinforce = iGoodsReinforce;
    }

    public String getcGoodsWrapper() {
        return cGoodsWrapper;
    }

    public void setcGoodsWrapper(String cGoodsWrapper) {
        this.cGoodsWrapper = cGoodsWrapper == null ? null : cGoodsWrapper.trim();
    }

    public Integer getiCanvasNumber() {
        return iCanvasNumber;
    }

    public void setiCanvasNumber(Integer iCanvasNumber) {
        this.iCanvasNumber = iCanvasNumber;
    }

    public Integer getiTrainType() {
        return iTrainType;
    }

    public void setiTrainType(Integer iTrainType) {
        this.iTrainType = iTrainType;
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