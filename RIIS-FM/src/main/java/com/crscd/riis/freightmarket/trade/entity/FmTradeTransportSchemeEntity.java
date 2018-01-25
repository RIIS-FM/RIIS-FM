package com.crscd.riis.freightmarket.trade.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FmTradeTransportSchemeEntity {
    private Integer id;

    private Integer iOrderId;

    private Float fTradeOrderTransportSchemeFee;

    private String cTradeOrderTransportSchemeCode;

    private Date dTradeOrderTransportSchemeStartTime;

    private Date dTradeOrderTransportSchemeEndTime;

    private String cTradeOrderTransportSchemeLoadStation;

    private String cTradeOrderTransportSchemeUnloadStation;

    private String cTradeOrderTransportSchemeLoadLocation;

    private String cTradeOrderTransportSchemeUnloadLocation;

    private String cTradeOrderTransportSchemeTrainNum;

    private String cTradeOrderTransportSchemeTrainType;

    private Date dTradeOrderTransportSchemeUnloadStartTime;

    private Date dTradeOrderTransportSchemeUnloadEndTime;

    private Date dTradeOrderTransportSchemeLoadStartTime;

    private Date dTradeOrderTransportSchemeLoadEndTime;

    private Integer iIsSelect;

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

    public Float getfTradeOrderTransportSchemeFee() {
        return fTradeOrderTransportSchemeFee;
    }

    public void setfTradeOrderTransportSchemeFee(Float fTradeOrderTransportSchemeFee) {
        this.fTradeOrderTransportSchemeFee = fTradeOrderTransportSchemeFee;
    }

    public String getcTradeOrderTransportSchemeCode() {
        return cTradeOrderTransportSchemeCode;
    }

    public void setcTradeOrderTransportSchemeCode(String cTradeOrderTransportSchemeCode) {
        this.cTradeOrderTransportSchemeCode = cTradeOrderTransportSchemeCode == null ? null : cTradeOrderTransportSchemeCode.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getdTradeOrderTransportSchemeStartTime() {
        return dTradeOrderTransportSchemeStartTime;
    }

    public void setdTradeOrderTransportSchemeStartTime(Date dTradeOrderTransportSchemeStartTime) {
        this.dTradeOrderTransportSchemeStartTime = dTradeOrderTransportSchemeStartTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getdTradeOrderTransportSchemeEndTime() {
        return dTradeOrderTransportSchemeEndTime;
    }

    public void setdTradeOrderTransportSchemeEndTime(Date dTradeOrderTransportSchemeEndTime) {
        this.dTradeOrderTransportSchemeEndTime = dTradeOrderTransportSchemeEndTime;
    }

    public String getcTradeOrderTransportSchemeLoadStation() {
        return cTradeOrderTransportSchemeLoadStation;
    }

    public void setcTradeOrderTransportSchemeLoadStation(String cTradeOrderTransportSchemeLoadStation) {
        this.cTradeOrderTransportSchemeLoadStation = cTradeOrderTransportSchemeLoadStation == null ? null : cTradeOrderTransportSchemeLoadStation.trim();
    }

    public String getcTradeOrderTransportSchemeUnloadStation() {
        return cTradeOrderTransportSchemeUnloadStation;
    }

    public void setcTradeOrderTransportSchemeUnloadStation(String cTradeOrderTransportSchemeUnloadStation) {
        this.cTradeOrderTransportSchemeUnloadStation = cTradeOrderTransportSchemeUnloadStation == null ? null : cTradeOrderTransportSchemeUnloadStation.trim();
    }

    public String getcTradeOrderTransportSchemeLoadLocation() {
        return cTradeOrderTransportSchemeLoadLocation;
    }

    public void setcTradeOrderTransportSchemeLoadLocation(String cTradeOrderTransportSchemeLoadLocation) {
        this.cTradeOrderTransportSchemeLoadLocation = cTradeOrderTransportSchemeLoadLocation == null ? null : cTradeOrderTransportSchemeLoadLocation.trim();
    }

    public String getcTradeOrderTransportSchemeUnloadLocation() {
        return cTradeOrderTransportSchemeUnloadLocation;
    }

    public void setcTradeOrderTransportSchemeUnloadLocation(String cTradeOrderTransportSchemeUnloadLocation) {
        this.cTradeOrderTransportSchemeUnloadLocation = cTradeOrderTransportSchemeUnloadLocation == null ? null : cTradeOrderTransportSchemeUnloadLocation.trim();
    }

    public String getcTradeOrderTransportSchemeTrainNum() {
        return cTradeOrderTransportSchemeTrainNum;
    }

    public void setcTradeOrderTransportSchemeTrainNum(String cTradeOrderTransportSchemeTrainNum) {
        this.cTradeOrderTransportSchemeTrainNum = cTradeOrderTransportSchemeTrainNum == null ? null : cTradeOrderTransportSchemeTrainNum.trim();
    }

    public String getcTradeOrderTransportSchemeTrainType() {
        return cTradeOrderTransportSchemeTrainType;
    }

    public void setcTradeOrderTransportSchemeTrainType(String cTradeOrderTransportSchemeTrainType) {
        this.cTradeOrderTransportSchemeTrainType = cTradeOrderTransportSchemeTrainType == null ? null : cTradeOrderTransportSchemeTrainType.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getdTradeOrderTransportSchemeUnloadStartTime() {
        return dTradeOrderTransportSchemeUnloadStartTime;
    }

    public void setdTradeOrderTransportSchemeUnloadStartTime(Date dTradeOrderTransportSchemeUnloadStartTime) {
        this.dTradeOrderTransportSchemeUnloadStartTime = dTradeOrderTransportSchemeUnloadStartTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getdTradeOrderTransportSchemeUnloadEndTime() {
        return dTradeOrderTransportSchemeUnloadEndTime;
    }

    public void setdTradeOrderTransportSchemeUnloadEndTime(Date dTradeOrderTransportSchemeUnloadEndTime) {
        this.dTradeOrderTransportSchemeUnloadEndTime = dTradeOrderTransportSchemeUnloadEndTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getdTradeOrderTransportSchemeLoadStartTime() {
        return dTradeOrderTransportSchemeLoadStartTime;
    }

    public void setdTradeOrderTransportSchemeLoadStartTime(Date dTradeOrderTransportSchemeLoadStartTime) {
        this.dTradeOrderTransportSchemeLoadStartTime = dTradeOrderTransportSchemeLoadStartTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getdTradeOrderTransportSchemeLoadEndTime() {
        return dTradeOrderTransportSchemeLoadEndTime;
    }

    public void setdTradeOrderTransportSchemeLoadEndTime(Date dTradeOrderTransportSchemeLoadEndTime) {
        this.dTradeOrderTransportSchemeLoadEndTime = dTradeOrderTransportSchemeLoadEndTime;
    }

    public Integer getiIsSelect() {
        return iIsSelect;
    }

    public void setiIsSelect(Integer iIsSelect) {
        this.iIsSelect = iIsSelect;
    }
}