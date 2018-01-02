package com.crscd.riis.freightmarket.authority.entity;

import java.util.Date;

public class FmAccountGroupEntity {
    private Integer iGroupId;

    private Integer iAccountId;

    private Integer iCreator;

    private Date dDate;

    public Integer getiGroupId() {
        return iGroupId;
    }

    public void setiGroupId(Integer iGroupId) {
        this.iGroupId = iGroupId;
    }

    public Integer getiAccountId() {
        return iAccountId;
    }

    public void setiAccountId(Integer iAccountId) {
        this.iAccountId = iAccountId;
    }

    public Integer getiCreator() {
        return iCreator;
    }

    public void setiCreator(Integer iCreator) {
        this.iCreator = iCreator;
    }

    public Date getdDate() {
        return dDate;
    }

    public void setdDate(Date dDate) {
        this.dDate = dDate;
    }
}