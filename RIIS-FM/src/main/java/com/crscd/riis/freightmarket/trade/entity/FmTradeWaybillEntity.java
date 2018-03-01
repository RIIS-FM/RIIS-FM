package com.crscd.riis.freightmarket.trade.entity;

import java.util.Date;

public class FmTradeWaybillEntity {
    private Integer id;

    private Integer iOrderId;
    
    private Integer iOrderTypeId;

    private Integer iOrderTypeNum;

    private String cWaybillCode;

    private Date dWaybillCreateTime;

    private Integer iWaybillState;

    private Date dWaybillTime;

    private Date dWaybillDateline;

    private Date dWaybillPredictArriveTime;

    private Date dWaybillPredictUnloadStartTime;

    private Date dWaybillPredictUnloadEndTime;

    private Date dWaybillPredictSenderTime;

    private Date dWaybillPredictLoadStartTime;

    private Date dWaybillPredictLoadEndTime;

    private Integer iWaybillBoxSealNum;

    private Integer iWaybillBoxType;

    private Integer iWaybillBoxNum;

    private Integer iWaybillGoodsReinforce;

    private Integer iWaybillGoodsWrapper;

    private Float fWaybillCanvasNumber;

    private Float fWaybillTrainType;

    private String cWaybillTrainNum;

    private Integer iWaybillTrainNumberCharge;

    private Integer iWaybillBoxNumberCharge;

    private Integer iWaybillGoodsNumberCharge;

    private Integer iPriceNo;

    private Float fPriceRate;

    private Float fWaybillIncidentalsPaid;

    private Float fWaybillElectrictFee;

    private Float fWaybillConstructFee;

    private Integer iWaybillPaymentMethod;

    private Integer iWaybillPaymentState;

    private Float fWaybillSenderReportWeight;

    private Float fWaybillRecverReportWeight;

    private Float fWaybillWeightCharge;

    private Integer iWaybillSenderReportTrainNumber;

    private Integer iWaybillRecverReportTrainNumber;

    private Integer iWaybillSenderReportBoxNumber;

    private Integer iWaybillRecverReportBoxNumber;

    private Integer iWaybillSenderReportGoodsNumber;

    private Integer iWaybillRecverReportGoodsNumber;

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

    public Integer getiOrderTypeId() {
        return iOrderTypeId;
    }

    public void setiOrderTypeId(Integer iOrderTypeId) {
        this.iOrderTypeId = iOrderTypeId;
    }

    public Integer getiOrderTypeNum() {
        return iOrderTypeNum;
    }

    public void setiOrderTypeNum(Integer iOrderTypeNum) {
        this.iOrderTypeNum = iOrderTypeNum;
    }

    public String getcWaybillCode() {
        return cWaybillCode;
    }

    public void setcWaybillCode(String cWaybillCode) {
        this.cWaybillCode = cWaybillCode == null ? null : cWaybillCode.trim();
    }

    public Date getdWaybillCreateTime() {
        return dWaybillCreateTime;
    }

    public void setdWaybillCreateTime(Date dWaybillCreateTime) {
        this.dWaybillCreateTime = dWaybillCreateTime;
    }

    public Integer getiWaybillState() {
        return iWaybillState;
    }

    public void setiWaybillState(Integer iWaybillState) {
        this.iWaybillState = iWaybillState;
    }

    public Date getdWaybillTime() {
        return dWaybillTime;
    }

    public void setdWaybillTime(Date dWaybillTime) {
        this.dWaybillTime = dWaybillTime;
    }

    public Date getdWaybillDateline() {
        return dWaybillDateline;
    }

    public void setdWaybillDateline(Date dWaybillDateline) {
        this.dWaybillDateline = dWaybillDateline;
    }

    public Date getdWaybillPredictArriveTime() {
        return dWaybillPredictArriveTime;
    }

    public void setdWaybillPredictArriveTime(Date dWaybillPredictArriveTime) {
        this.dWaybillPredictArriveTime = dWaybillPredictArriveTime;
    }

    public Date getdWaybillPredictUnloadStartTime() {
        return dWaybillPredictUnloadStartTime;
    }

    public void setdWaybillPredictUnloadStartTime(Date dWaybillPredictUnloadStartTime) {
        this.dWaybillPredictUnloadStartTime = dWaybillPredictUnloadStartTime;
    }

    public Date getdWaybillPredictUnloadEndTime() {
        return dWaybillPredictUnloadEndTime;
    }

    public void setdWaybillPredictUnloadEndTime(Date dWaybillPredictUnloadEndTime) {
        this.dWaybillPredictUnloadEndTime = dWaybillPredictUnloadEndTime;
    }

    public Date getdWaybillPredictSenderTime() {
        return dWaybillPredictSenderTime;
    }

    public void setdWaybillPredictSenderTime(Date dWaybillPredictSenderTime) {
        this.dWaybillPredictSenderTime = dWaybillPredictSenderTime;
    }

    public Date getdWaybillPredictLoadStartTime() {
        return dWaybillPredictLoadStartTime;
    }

    public void setdWaybillPredictLoadStartTime(Date dWaybillPredictLoadStartTime) {
        this.dWaybillPredictLoadStartTime = dWaybillPredictLoadStartTime;
    }

    public Date getdWaybillPredictLoadEndTime() {
        return dWaybillPredictLoadEndTime;
    }

    public void setdWaybillPredictLoadEndTime(Date dWaybillPredictLoadEndTime) {
        this.dWaybillPredictLoadEndTime = dWaybillPredictLoadEndTime;
    }

    public Integer getiWaybillBoxSealNum() {
        return iWaybillBoxSealNum;
    }

    public void setiWaybillBoxSealNum(Integer iWaybillBoxSealNum) {
        this.iWaybillBoxSealNum = iWaybillBoxSealNum;
    }

    public Integer getiWaybillBoxType() {
        return iWaybillBoxType;
    }

    public void setiWaybillBoxType(Integer iWaybillBoxType) {
        this.iWaybillBoxType = iWaybillBoxType;
    }

    public Integer getiWaybillBoxNum() {
        return iWaybillBoxNum;
    }

    public void setiWaybillBoxNum(Integer iWaybillBoxNum) {
        this.iWaybillBoxNum = iWaybillBoxNum;
    }

    public Integer getiWaybillGoodsReinforce() {
        return iWaybillGoodsReinforce;
    }

    public void setiWaybillGoodsReinforce(Integer iWaybillGoodsReinforce) {
        this.iWaybillGoodsReinforce = iWaybillGoodsReinforce;
    }

    public Integer getiWaybillGoodsWrapper() {
        return iWaybillGoodsWrapper;
    }

    public void setiWaybillGoodsWrapper(Integer iWaybillGoodsWrapper) {
        this.iWaybillGoodsWrapper = iWaybillGoodsWrapper;
    }

    public Float getfWaybillCanvasNumber() {
        return fWaybillCanvasNumber;
    }

    public void setfWaybillCanvasNumber(Float fWaybillCanvasNumber) {
        this.fWaybillCanvasNumber = fWaybillCanvasNumber;
    }

    public Float getfWaybillTrainType() {
        return fWaybillTrainType;
    }

    public void setfWaybillTrainType(Float fWaybillTrainType) {
        this.fWaybillTrainType = fWaybillTrainType;
    }

    public String getcWaybillTrainNum() {
        return cWaybillTrainNum;
    }

    public void setcWaybillTrainNum(String cWaybillTrainNum) {
        this.cWaybillTrainNum = cWaybillTrainNum == null ? null : cWaybillTrainNum.trim();
    }

    public Integer getiWaybillTrainNumberCharge() {
        return iWaybillTrainNumberCharge;
    }

    public void setiWaybillTrainNumberCharge(Integer iWaybillTrainNumberCharge) {
        this.iWaybillTrainNumberCharge = iWaybillTrainNumberCharge;
    }

    public Integer getiWaybillBoxNumberCharge() {
        return iWaybillBoxNumberCharge;
    }

    public void setiWaybillBoxNumberCharge(Integer iWaybillBoxNumberCharge) {
        this.iWaybillBoxNumberCharge = iWaybillBoxNumberCharge;
    }

    public Integer getiWaybillGoodsNumberCharge() {
        return iWaybillGoodsNumberCharge;
    }

    public void setiWaybillGoodsNumberCharge(Integer iWaybillGoodsNumberCharge) {
        this.iWaybillGoodsNumberCharge = iWaybillGoodsNumberCharge;
    }

    public Integer getiPriceNo() {
        return iPriceNo;
    }

    public void setiPriceNo(Integer iPriceNo) {
        this.iPriceNo = iPriceNo;
    }

    public Float getfPriceRate() {
        return fPriceRate;
    }

    public void setfPriceRate(Float fPriceRate) {
        this.fPriceRate = fPriceRate;
    }

    public Float getfWaybillIncidentalsPaid() {
        return fWaybillIncidentalsPaid;
    }

    public void setfWaybillIncidentalsPaid(Float fWaybillIncidentalsPaid) {
        this.fWaybillIncidentalsPaid = fWaybillIncidentalsPaid;
    }

    public Float getfWaybillElectrictFee() {
        return fWaybillElectrictFee;
    }

    public void setfWaybillElectrictFee(Float fWaybillElectrictFee) {
        this.fWaybillElectrictFee = fWaybillElectrictFee;
    }

    public Float getfWaybillConstructFee() {
        return fWaybillConstructFee;
    }

    public void setfWaybillConstructFee(Float fWaybillConstructFee) {
        this.fWaybillConstructFee = fWaybillConstructFee;
    }

    public Integer getiWaybillPaymentMethod() {
        return iWaybillPaymentMethod;
    }

    public void setiWaybillPaymentMethod(Integer iWaybillPaymentMethod) {
        this.iWaybillPaymentMethod = iWaybillPaymentMethod;
    }

    public Integer getiWaybillPaymentState() {
        return iWaybillPaymentState;
    }

    public void setiWaybillPaymentState(Integer iWaybillPaymentState) {
        this.iWaybillPaymentState = iWaybillPaymentState;
    }

    public Float getfWaybillSenderReportWeight() {
        return fWaybillSenderReportWeight;
    }

    public void setfWaybillSenderReportWeight(Float fWaybillSenderReportWeight) {
        this.fWaybillSenderReportWeight = fWaybillSenderReportWeight;
    }

    public Float getfWaybillRecverReportWeight() {
        return fWaybillRecverReportWeight;
    }

    public void setfWaybillRecverReportWeight(Float fWaybillRecverReportWeight) {
        this.fWaybillRecverReportWeight = fWaybillRecverReportWeight;
    }

    public Float getfWaybillWeightCharge() {
        return fWaybillWeightCharge;
    }

    public void setfWaybillWeightCharge(Float fWaybillWeightCharge) {
        this.fWaybillWeightCharge = fWaybillWeightCharge;
    }

    public Integer getiWaybillSenderReportTrainNumber() {
        return iWaybillSenderReportTrainNumber;
    }

    public void setiWaybillSenderReportTrainNumber(Integer iWaybillSenderReportTrainNumber) {
        this.iWaybillSenderReportTrainNumber = iWaybillSenderReportTrainNumber;
    }

    public Integer getiWaybillRecverReportTrainNumber() {
        return iWaybillRecverReportTrainNumber;
    }

    public void setiWaybillRecverReportTrainNumber(Integer iWaybillRecverReportTrainNumber) {
        this.iWaybillRecverReportTrainNumber = iWaybillRecverReportTrainNumber;
    }

    public Integer getiWaybillSenderReportBoxNumber() {
        return iWaybillSenderReportBoxNumber;
    }

    public void setiWaybillSenderReportBoxNumber(Integer iWaybillSenderReportBoxNumber) {
        this.iWaybillSenderReportBoxNumber = iWaybillSenderReportBoxNumber;
    }

    public Integer getiWaybillRecverReportBoxNumber() {
        return iWaybillRecverReportBoxNumber;
    }

    public void setiWaybillRecverReportBoxNumber(Integer iWaybillRecverReportBoxNumber) {
        this.iWaybillRecverReportBoxNumber = iWaybillRecverReportBoxNumber;
    }

    public Integer getiWaybillSenderReportGoodsNumber() {
        return iWaybillSenderReportGoodsNumber;
    }

    public void setiWaybillSenderReportGoodsNumber(Integer iWaybillSenderReportGoodsNumber) {
        this.iWaybillSenderReportGoodsNumber = iWaybillSenderReportGoodsNumber;
    }

    public Integer getiWaybillRecverReportGoodsNumber() {
        return iWaybillRecverReportGoodsNumber;
    }

    public void setiWaybillRecverReportGoodsNumber(Integer iWaybillRecverReportGoodsNumber) {
        this.iWaybillRecverReportGoodsNumber = iWaybillRecverReportGoodsNumber;
    }
}