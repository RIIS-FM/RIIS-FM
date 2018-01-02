package com.crscd.riis.freightmarket.authority.entity;

import java.util.Date;

public class FmPerRoleEntity {
    private Integer iPermissionId;

    private Integer iRoleId;

    private Integer iCreaterId;

    private Date dCreatedTime;

    public Integer getiPermissionId() {
        return iPermissionId;
    }

    public void setiPermissionId(Integer iPermissionId) {
        this.iPermissionId = iPermissionId;
    }

    public Integer getiRoleId() {
        return iRoleId;
    }

    public void setiRoleId(Integer iRoleId) {
        this.iRoleId = iRoleId;
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