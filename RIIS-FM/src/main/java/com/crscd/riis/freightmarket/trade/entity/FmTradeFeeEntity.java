package com.crscd.riis.freightmarket.trade.entity;

public class FmTradeFeeEntity {
    private Integer id;

    private Integer iFeeType;

    private Integer iTransportType;

    private String cPriceNo;

    private Float fBasePriceOne;

    private Float fBasePriceTwo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getiFeeType() {
        return iFeeType;
    }

    public void setiFeeType(Integer iFeeType) {
        this.iFeeType = iFeeType;
    }

    public Integer getiTransportType() {
        return iTransportType;
    }

    public void setiTransportType(Integer iTransportType) {
        this.iTransportType = iTransportType;
    }

    public String getcPriceNo() {
        return cPriceNo;
    }

    public void setcPriceNo(String cPriceNo) {
        this.cPriceNo = cPriceNo == null ? null : cPriceNo.trim();
    }

    public Float getfBasePriceOne() {
        return fBasePriceOne;
    }

    public void setfBasePriceOne(Float fBasePriceOne) {
        this.fBasePriceOne = fBasePriceOne;
    }

    public Float getfBasePriceTwo() {
        return fBasePriceTwo;
    }

    public void setfBasePriceTwo(Float fBasePriceTwo) {
        this.fBasePriceTwo = fBasePriceTwo;
    }
}