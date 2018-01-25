package com.crscd.riis.freightmarket.trade.entity;

import java.util.Date;

public class FmTradeOrderAuditEntity {
    private Integer id;

    private Integer iOrderId;

    private Integer iOrderTypeId;

    private Integer iAuditType;

    private Integer iAuditorId;

    private Date dAuditStartTime;

    private Date dAuditEndTime;

    private String cPeopleAuditSuggestion;

    private String cSysAuditSuggestion;

    private Integer iAuditResult;

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

    public Integer getiAuditType() {
        return iAuditType;
    }

    public void setiAuditType(Integer iAuditType) {
        this.iAuditType = iAuditType;
    }

    public Integer getiAuditorId() {
        return iAuditorId;
    }

    public void setiAuditorId(Integer iAuditorId) {
        this.iAuditorId = iAuditorId;
    }

    public Date getdAuditStartTime() {
        return dAuditStartTime;
    }

    public void setdAuditStartTime(Date dAuditStartTime) {
        this.dAuditStartTime = dAuditStartTime;
    }

    public Date getdAuditEndTime() {
        return dAuditEndTime;
    }

    public void setdAuditEndTime(Date dAuditEndTime) {
        this.dAuditEndTime = dAuditEndTime;
    }

    public String getcPeopleAuditSuggestion() {
        return cPeopleAuditSuggestion;
    }

    public void setcPeopleAuditSuggestion(String cPeopleAuditSuggestion) {
        this.cPeopleAuditSuggestion = cPeopleAuditSuggestion == null ? null : cPeopleAuditSuggestion.trim();
    }

    public String getcSysAuditSuggestion() {
        return cSysAuditSuggestion;
    }

    public void setcSysAuditSuggestion(String cSysAuditSuggestion) {
        this.cSysAuditSuggestion = cSysAuditSuggestion == null ? null : cSysAuditSuggestion.trim();
    }

    public Integer getiAuditResult() {
        return iAuditResult;
    }

    public void setiAuditResult(Integer iAuditResult) {
        this.iAuditResult = iAuditResult;
    }
}