package com.crscd.riis.freightmarket.authority.entity;

import java.util.Date;

public class FmGroupEntity {
    private Integer id;

    private String cGroupName;

    private Integer iFatherGroupId;

    private Integer iCreaterId;

    private Date dCreatedTime;

    private String cRemark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcGroupName() {
        return cGroupName;
    }

    public void setcGroupName(String cGroupName) {
        this.cGroupName = cGroupName == null ? null : cGroupName.trim();
    }

    public Integer getiFatherGroupId() {
        return iFatherGroupId;
    }

    public void setiFatherGroupId(Integer iFatherGroupId) {
        this.iFatherGroupId = iFatherGroupId;
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

    public String getcRemark() {
        return cRemark;
    }

    public void setcRemark(String cRemark) {
        this.cRemark = cRemark == null ? null : cRemark.trim();
    }
}