package com.crscd.riis.freightmarket.authority.entity;

public class FmTradeGoodsTypeEntity {
    private Integer id;

    private String cGoodsTypeName;

    private String cCoodsCode;

    private String cGoodsNameSpellAll;

    private String cGoodsNameSpellShorth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcGoodsTypeName() {
        return cGoodsTypeName;
    }

    public void setcGoodsTypeName(String cGoodsTypeName) {
        this.cGoodsTypeName = cGoodsTypeName == null ? null : cGoodsTypeName.trim();
    }

    public String getcCoodsCode() {
        return cCoodsCode;
    }

    public void setcCoodsCode(String cCoodsCode) {
        this.cCoodsCode = cCoodsCode == null ? null : cCoodsCode.trim();
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
}