package com.crscd.riis.freightmarket.authority.entity;

import java.util.Date;

public class FmRoleEntity {
    private Integer id;

    private String cRoleName;

    private String cRoleDesp;

    private Integer iCreaterId;

    private Date dCreatedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcRoleName() {
        return cRoleName;
    }

    public void setcRoleName(String cRoleName) {
        this.cRoleName = cRoleName == null ? null : cRoleName.trim();
    }

    public String getcRoleDesp() {
        return cRoleDesp;
    }

    public void setcRoleDesp(String cRoleDesp) {
        this.cRoleDesp = cRoleDesp == null ? null : cRoleDesp.trim();
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