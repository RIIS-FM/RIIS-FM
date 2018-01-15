package com.crscd.riis.freightmarket.authority.entity;

public class FmTradeGoodsEntity {
    private Integer id;

    private String cGoodsNameSpellAll;

    private String cGoodsNameSpellShorth;

    private String cGoodsName;

    private String cGoodsCategoryCode;

    private Integer cGoodsTypeId;

    private Integer iGoodsDanger;

    private Float fGoodsInsuredRate;

    private Float fGoodsInsuranceValue;

    private Float fGoodsLoadAndUnloadRate;

    private String cGoodsWholeVegicleRate;

    private String cGoodsFastFreightRate;

    private String cGoodsBoxFreightRate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcGoodsNameSpellAll() {
        return cGoodsNameSpellAll;
    }

    public void setcGoodsNameSpellAll(String cGoodsNameSpellAll) {
        this.cGoodsNameSpellAll = cGoodsNameSpellAll == null ? null : cGoodsNameSpellAll.trim();
    }

    public String getcGoodsNameSpellShorth() {
        return cGoodsNameSpellShorth;
    }

    public void setcGoodsNameSpellShorth(String cGoodsNameSpellShorth) {
        this.cGoodsNameSpellShorth = cGoodsNameSpellShorth == null ? null : cGoodsNameSpellShorth.trim();
    }

    public String getcGoodsName() {
        return cGoodsName;
    }

    public void setcGoodsName(String cGoodsName) {
        this.cGoodsName = cGoodsName == null ? null : cGoodsName.trim();
    }

    public String getcGoodsCategoryCode() {
        return cGoodsCategoryCode;
    }

    public void setcGoodsCategoryCode(String cGoodsCategoryCode) {
        this.cGoodsCategoryCode = cGoodsCategoryCode == null ? null : cGoodsCategoryCode.trim();
    }

    public Integer getcGoodsTypeId() {
        return cGoodsTypeId;
    }

    public void setcGoodsTypeId(Integer cGoodsTypeId) {
        this.cGoodsTypeId = cGoodsTypeId;
    }

    public Integer getiGoodsDanger() {
        return iGoodsDanger;
    }

    public void setiGoodsDanger(Integer iGoodsDanger) {
        this.iGoodsDanger = iGoodsDanger;
    }

    public Float getfGoodsInsuredRate() {
        return fGoodsInsuredRate;
    }

    public void setfGoodsInsuredRate(Float fGoodsInsuredRate) {
        this.fGoodsInsuredRate = fGoodsInsuredRate;
    }

    public Float getfGoodsInsuranceValue() {
        return fGoodsInsuranceValue;
    }

    public void setfGoodsInsuranceValue(Float fGoodsInsuranceValue) {
        this.fGoodsInsuranceValue = fGoodsInsuranceValue;
    }

    public Float getfGoodsLoadAndUnloadRate() {
        return fGoodsLoadAndUnloadRate;
    }

    public void setfGoodsLoadAndUnloadRate(Float fGoodsLoadAndUnloadRate) {
        this.fGoodsLoadAndUnloadRate = fGoodsLoadAndUnloadRate;
    }

    public String getcGoodsWholeVegicleRate() {
        return cGoodsWholeVegicleRate;
    }

    public void setcGoodsWholeVegicleRate(String cGoodsWholeVegicleRate) {
        this.cGoodsWholeVegicleRate = cGoodsWholeVegicleRate == null ? null : cGoodsWholeVegicleRate.trim();
    }

    public String getcGoodsFastFreightRate() {
        return cGoodsFastFreightRate;
    }

    public void setcGoodsFastFreightRate(String cGoodsFastFreightRate) {
        this.cGoodsFastFreightRate = cGoodsFastFreightRate == null ? null : cGoodsFastFreightRate.trim();
    }

    public String getcGoodsBoxFreightRate() {
        return cGoodsBoxFreightRate;
    }

    public void setcGoodsBoxFreightRate(String cGoodsBoxFreightRate) {
        this.cGoodsBoxFreightRate = cGoodsBoxFreightRate == null ? null : cGoodsBoxFreightRate.trim();
    }
}