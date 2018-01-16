package com.crscd.riis.freightmarket.trade.entity;

public class FmTradeTransportEntity {
    private Integer id;

    private Integer iOrderId;

    private Integer iOrderTypeId;

    private String cOrderCode;

    private Integer iEstimateId;

    private Integer iEstimateTransport;

    private Integer iEstimatePartity;

    private Integer iEstimateConvininet;

    private Integer iEstimateOutline;

    private Integer iEstimateContent;

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

    public String getcOrderCode() {
        return cOrderCode;
    }

    public void setcOrderCode(String cOrderCode) {
        this.cOrderCode = cOrderCode == null ? null : cOrderCode.trim();
    }

    public Integer getiEstimateId() {
        return iEstimateId;
    }

    public void setiEstimateId(Integer iEstimateId) {
        this.iEstimateId = iEstimateId;
    }

    public Integer getiEstimateTransport() {
        return iEstimateTransport;
    }

    public void setiEstimateTransport(Integer iEstimateTransport) {
        this.iEstimateTransport = iEstimateTransport;
    }

    public Integer getiEstimatePartity() {
        return iEstimatePartity;
    }

    public void setiEstimatePartity(Integer iEstimatePartity) {
        this.iEstimatePartity = iEstimatePartity;
    }

    public Integer getiEstimateConvininet() {
        return iEstimateConvininet;
    }

    public void setiEstimateConvininet(Integer iEstimateConvininet) {
        this.iEstimateConvininet = iEstimateConvininet;
    }

    public Integer getiEstimateOutline() {
        return iEstimateOutline;
    }

    public void setiEstimateOutline(Integer iEstimateOutline) {
        this.iEstimateOutline = iEstimateOutline;
    }

    public Integer getiEstimateContent() {
        return iEstimateContent;
    }

    public void setiEstimateContent(Integer iEstimateContent) {
        this.iEstimateContent = iEstimateContent;
    }
}