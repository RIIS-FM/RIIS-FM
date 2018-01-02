package com.crscd.riis.freightmarket.authority.entity;

import java.util.Date;

public class FmPermissionEntity {
    private Integer id;

    private String cPermissionName;

    private Integer iPermissionType;

    private Integer iCreaterId;

    private Date dCreatedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcPermissionName() {
        return cPermissionName;
    }

    public void setcPermissionName(String cPermissionName) {
        this.cPermissionName = cPermissionName == null ? null : cPermissionName.trim();
    }

    public Integer getiPermissionType() {
        return iPermissionType;
    }

    public void setiPermissionType(Integer iPermissionType) {
        this.iPermissionType = iPermissionType;
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