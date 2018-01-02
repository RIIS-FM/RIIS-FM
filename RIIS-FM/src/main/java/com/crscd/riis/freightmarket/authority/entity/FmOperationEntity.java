package com.crscd.riis.freightmarket.authority.entity;

import java.util.Date;

public class FmOperationEntity {
    private Integer id;

    private String cOperationName;

    private String cOperationUrl;

    private Integer iCreaterId;

    private Date dCreatedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcOperationName() {
        return cOperationName;
    }

    public void setcOperationName(String cOperationName) {
        this.cOperationName = cOperationName == null ? null : cOperationName.trim();
    }

    public String getcOperationUrl() {
        return cOperationUrl;
    }

    public void setcOperationUrl(String cOperationUrl) {
        this.cOperationUrl = cOperationUrl == null ? null : cOperationUrl.trim();
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