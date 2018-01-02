package com.crscd.riis.freightmarket.authority.entity;

import java.util.Date;

public class FmAccountRoleEntity {
    private Integer iRoleId;

    private Integer iAccountId;

    private Integer iCreaterId;

    private Date dCreatedTime;

    public Integer getiRoleId() {
        return iRoleId;
    }

    public void setiRoleId(Integer iRoleId) {
        this.iRoleId = iRoleId;
    }

    public Integer getiAccountId() {
        return iAccountId;
    }

    public void setiAccountId(Integer iAccountId) {
        this.iAccountId = iAccountId;
    }

    public Integer getiCreaterId() {
        return iCreaterId;
    }

    public void setiCreaterId(Integer iCreaterId) {
        this.iCreaterId = iCreaterId;
    }

    public Date getdCreatedTime() {
        return dCreatedTime;
    }

    public void setdCreatedTime(Date dCreatedTime) {
        this.dCreatedTime = dCreatedTime;
    }
}