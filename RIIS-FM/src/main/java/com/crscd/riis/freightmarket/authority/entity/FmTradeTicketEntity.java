package com.crscd.riis.freightmarket.authority.entity;

import java.util.Date;

public class FmTradeTicketEntity {
    private Integer id;

    private Integer iWaybillId;

    private Integer iWaybillCode;

    private Integer iTicketCode;

    private Date dTicketCreateTime;

    private String cTicketContent;

    private Date dTicketRecverTime;

    private Integer iIncidentalsType;

    private Float fIncidentalsValue;

    private Float fDistance;

    private Integer iIncidentalsAymentState;

    private Integer iIncidentalsAymentType;

    private Date dTicketRealityArriveTime;

    private Date dTicketRealityUnloadStartTime;

    private Date dTicketRealityUnloadEndTime;

    private Date dTicketRealitySenderTime;

    private Date dTicketRealityLoadStartTime;

    private Date dTicketRealityLoadEndTime;

    private Date dTicketPredictArriveTime;

    private Date dTicketPredictUnloadStartTime;

    private Date dTicketPredictUnloadEndTime;

    private Date dTicketPredictSenderTime;

    private Date dTicketPredictLoadStartTime;

    private Date dTicketPredictLoadEndTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getiWaybillId() {
        return iWaybillId;
    }

    public void setiWaybillId(Integer iWaybillId) {
        this.iWaybillId = iWaybillId;
    }

    public Integer getiWaybillCode() {
        return iWaybillCode;
    }

    public void setiWaybillCode(Integer iWaybillCode) {
        this.iWaybillCode = iWaybillCode;
    }

    public Integer getiTicketCode() {
        return iTicketCode;
    }

    public void setiTicketCode(Integer iTicketCode) {
        this.iTicketCode = iTicketCode;
    }

    public Date getdTicketCreateTime() {
        return dTicketCreateTime;
    }

    public void setdTicketCreateTime(Date dTicketCreateTime) {
        this.dTicketCreateTime = dTicketCreateTime;
    }

    public String getcTicketContent() {
        return cTicketContent;
    }

    public void setcTicketContent(String cTicketContent) {
        this.cTicketContent = cTicketContent == null ? null : cTicketContent.trim();
    }

    public Date getdTicketRecverTime() {
        return dTicketRecverTime;
    }

    public void setdTicketRecverTime(Date dTicketRecverTime) {
        this.dTicketRecverTime = dTicketRecverTime;
    }

    public Integer getiIncidentalsType() {
        return iIncidentalsType;
    }

    public void setiIncidentalsType(Integer iIncidentalsType) {
        this.iIncidentalsType = iIncidentalsType;
    }

    public Float getfIncidentalsValue() {
        return fIncidentalsValue;
    }

    public void setfIncidentalsValue(Float fIncidentalsValue) {
        this.fIncidentalsValue = fIncidentalsValue;
    }

    public Float getfDistance() {
        return fDistance;
    }

    public void setfDistance(Float fDistance) {
        this.fDistance = fDistance;
    }

    public Integer getiIncidentalsAymentState() {
        return iIncidentalsAymentState;
    }

    public void setiIncidentalsAymentState(Integer iIncidentalsAymentState) {
        this.iIncidentalsAymentState = iIncidentalsAymentState;
    }

    public Integer getiIncidentalsAymentType() {
        return iIncidentalsAymentType;
    }

    public void setiIncidentalsAymentType(Integer iIncidentalsAymentType) {
        this.iIncidentalsAymentType = iIncidentalsAymentType;
    }

    public Date getdTicketRealityArriveTime() {
        return dTicketRealityArriveTime;
    }

    public void setdTicketRealityArriveTime(Date dTicketRealityArriveTime) {
        this.dTicketRealityArriveTime = dTicketRealityArriveTime;
    }

    public Date getdTicketRealityUnloadStartTime() {
        return dTicketRealityUnloadStartTime;
    }

    public void setdTicketRealityUnloadStartTime(Date dTicketRealityUnloadStartTime) {
        this.dTicketRealityUnloadStartTime = dTicketRealityUnloadStartTime;
    }

    public Date getdTicketRealityUnloadEndTime() {
        return dTicketRealityUnloadEndTime;
    }

    public void setdTicketRealityUnloadEndTime(Date dTicketRealityUnloadEndTime) {
        this.dTicketRealityUnloadEndTime = dTicketRealityUnloadEndTime;
    }

    public Date getdTicketRealitySenderTime() {
        return dTicketRealitySenderTime;
    }

    public void setdTicketRealitySenderTime(Date dTicketRealitySenderTime) {
        this.dTicketRealitySenderTime = dTicketRealitySenderTime;
    }

    public Date getdTicketRealityLoadStartTime() {
        return dTicketRealityLoadStartTime;
    }

    public void setdTicketRealityLoadStartTime(Date dTicketRealityLoadStartTime) {
        this.dTicketRealityLoadStartTime = dTicketRealityLoadStartTime;
    }

    public Date getdTicketRealityLoadEndTime() {
        return dTicketRealityLoadEndTime;
    }

    public void setdTicketRealityLoadEndTime(Date dTicketRealityLoadEndTime) {
        this.dTicketRealityLoadEndTime = dTicketRealityLoadEndTime;
    }

    public Date getdTicketPredictArriveTime() {
        return dTicketPredictArriveTime;
    }

    public void setdTicketPredictArriveTime(Date dTicketPredictArriveTime) {
        this.dTicketPredictArriveTime = dTicketPredictArriveTime;
    }

    public Date getdTicketPredictUnloadStartTime() {
        return dTicketPredictUnloadStartTime;
    }

    public void setdTicketPredictUnloadStartTime(Date dTicketPredictUnloadStartTime) {
        this.dTicketPredictUnloadStartTime = dTicketPredictUnloadStartTime;
    }

    public Date getdTicketPredictUnloadEndTime() {
        return dTicketPredictUnloadEndTime;
    }

    public void setdTicketPredictUnloadEndTime(Date dTicketPredictUnloadEndTime) {
        this.dTicketPredictUnloadEndTime = dTicketPredictUnloadEndTime;
    }

    public Date getdTicketPredictSenderTime() {
        return dTicketPredictSenderTime;
    }

    public void setdTicketPredictSenderTime(Date dTicketPredictSenderTime) {
        this.dTicketPredictSenderTime = dTicketPredictSenderTime;
    }

    public Date getdTicketPredictLoadStartTime() {
        return dTicketPredictLoadStartTime;
    }

    public void setdTicketPredictLoadStartTime(Date dTicketPredictLoadStartTime) {
        this.dTicketPredictLoadStartTime = dTicketPredictLoadStartTime;
    }

    public Date getdTicketPredictLoadEndTime() {
        return dTicketPredictLoadEndTime;
    }

    public void setdTicketPredictLoadEndTime(Date dTicketPredictLoadEndTime) {
        this.dTicketPredictLoadEndTime = dTicketPredictLoadEndTime;
    }
}