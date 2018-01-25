package com.crscd.riis.freightmarket.trade.entity;

import java.util.Date;

public class FmTradeOrderTypeEntity {
    private Integer id;

    private Integer iTypeLabel;

    private String cTypeValue;

    private Date dTypeCreateTime;

    private Date dTypeModifyTime;

    private Date dTypeDeleteTime;

    private Integer iTypeCreater;

    private Integer iTypeModifier;

    private Integer iTypeDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getiTypeLabel() {
        return iTypeLabel;
    }

    public void setiTypeLabel(Integer iTypeLabel) {
        this.iTypeLabel = iTypeLabel;
    }

    public String getcTypeValue() {
        return cTypeValue;
    }

    public void setcTypeValue(String cTypeValue) {
        this.cTypeValue = cTypeValue == null ? null : cTypeValue.trim();
    }

    public Date getdTypeCreateTime() {
        return dTypeCreateTime;
    }

    public void setdTypeCreateTime(Date dTypeCreateTime) {
        this.dTypeCreateTime = dTypeCreateTime;
    }

    public Date getdTypeModifyTime() {
        return dTypeModifyTime;
    }

    public void setdTypeModifyTime(Date dTypeModifyTime) {
        this.dTypeModifyTime = dTypeModifyTime;
    }

    public Date getdTypeDeleteTime() {
        return dTypeDeleteTime;
    }

    public void setdTypeDeleteTime(Date dTypeDeleteTime) {
        this.dTypeDeleteTime = dTypeDeleteTime;
    }

    public Integer getiTypeCreater() {
        return iTypeCreater;
    }

    public void setiTypeCreater(Integer iTypeCreater) {
        this.iTypeCreater = iTypeCreater;
    }

    public Integer getiTypeModifier() {
        return iTypeModifier;
    }

    public void setiTypeModifier(Integer iTypeModifier) {
        this.iTypeModifier = iTypeModifier;
    }

    public Integer getiTypeDelete() {
        return iTypeDelete;
    }

    public void setiTypeDelete(Integer iTypeDelete) {
        this.iTypeDelete = iTypeDelete;
    }
}