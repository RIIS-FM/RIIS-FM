package com.crscd.riis.freightmarket.authority.entity;

import java.util.Date;

public class FmGroupRoleEntity {
    private Integer iRoleId;

    private Integer iGroupId;

    private Integer iCreaterId;

    private Date dCreatedTime;

    public Integer getiRoleId() {
        return iRoleId;
    }

    public void setiRoleId(Integer iRoleId) {
        this.iRoleId = iRoleId;
    }

    public Integer getiGroupId() {
        return iGroupId;
    }

    public void setiGroupId(Integer iGroupId) {
        this.iGroupId = iGroupId;
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