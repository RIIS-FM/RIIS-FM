package com.crscd.riis.freightmarket.trade.entity;

import java.util.Date;

public class FmTradeOrderAuditEntity {
    private Integer id;

    private Integer iOrderId;

    private Integer iOrderTypeId;

    private Integer iAuditType;

    private Integer iAuditAuditorId;

    private Date dAuditStartTime;

    private Date dAuditEndTime;

    private String cAuditSuggestion;

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

    public Integer getiAuditAuditorId() {
        return iAuditAuditorId;
    }

    public void setiAuditAuditorId(Integer iAuditAuditorId) {
        this.iAuditAuditorId = iAuditAuditorId;
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

    public String getcAuditSuggestion() {
        return cAuditSuggestion;
    }

    public void setcAuditSuggestion(String cAuditSuggestion) {
        this.cAuditSuggestion = cAuditSuggestion == null ? null : cAuditSuggestion.trim();
    }

    public Integer getiAuditResult() {
        return iAuditResult;
    }

    public void setiAuditResult(Integer iAuditResult) {
        this.iAuditResult = iAuditResult;
    }
}