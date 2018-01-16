package com.crscd.riis.freightmarket.trade.entity;

import java.util.ArrayList;
import java.util.List;

public class FmTradeGoodsEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmTradeGoodsEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellAllIsNull() {
            addCriterion("C_GOODS_NAME_SPELL_ALL is null");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellAllIsNotNull() {
            addCriterion("C_GOODS_NAME_SPELL_ALL is not null");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellAllEqualTo(String value) {
            addCriterion("C_GOODS_NAME_SPELL_ALL =", value, "cGoodsNameSpellAll");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellAllNotEqualTo(String value) {
            addCriterion("C_GOODS_NAME_SPELL_ALL <>", value, "cGoodsNameSpellAll");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellAllGreaterThan(String value) {
            addCriterion("C_GOODS_NAME_SPELL_ALL >", value, "cGoodsNameSpellAll");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellAllGreaterThanOrEqualTo(String value) {
            addCriterion("C_GOODS_NAME_SPELL_ALL >=", value, "cGoodsNameSpellAll");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellAllLessThan(String value) {
            addCriterion("C_GOODS_NAME_SPELL_ALL <", value, "cGoodsNameSpellAll");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellAllLessThanOrEqualTo(String value) {
            addCriterion("C_GOODS_NAME_SPELL_ALL <=", value, "cGoodsNameSpellAll");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellAllLike(String value) {
            addCriterion("C_GOODS_NAME_SPELL_ALL like", value, "cGoodsNameSpellAll");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellAllNotLike(String value) {
            addCriterion("C_GOODS_NAME_SPELL_ALL not like", value, "cGoodsNameSpellAll");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellAllIn(List<String> values) {
            addCriterion("C_GOODS_NAME_SPELL_ALL in", values, "cGoodsNameSpellAll");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellAllNotIn(List<String> values) {
            addCriterion("C_GOODS_NAME_SPELL_ALL not in", values, "cGoodsNameSpellAll");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellAllBetween(String value1, String value2) {
            addCriterion("C_GOODS_NAME_SPELL_ALL between", value1, value2, "cGoodsNameSpellAll");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellAllNotBetween(String value1, String value2) {
            addCriterion("C_GOODS_NAME_SPELL_ALL not between", value1, value2, "cGoodsNameSpellAll");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellShorthIsNull() {
            addCriterion("C_GOODS_NAME_SPELL_SHORTH is null");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellShorthIsNotNull() {
            addCriterion("C_GOODS_NAME_SPELL_SHORTH is not null");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellShorthEqualTo(String value) {
            addCriterion("C_GOODS_NAME_SPELL_SHORTH =", value, "cGoodsNameSpellShorth");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellShorthNotEqualTo(String value) {
            addCriterion("C_GOODS_NAME_SPELL_SHORTH <>", value, "cGoodsNameSpellShorth");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellShorthGreaterThan(String value) {
            addCriterion("C_GOODS_NAME_SPELL_SHORTH >", value, "cGoodsNameSpellShorth");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellShorthGreaterThanOrEqualTo(String value) {
            addCriterion("C_GOODS_NAME_SPELL_SHORTH >=", value, "cGoodsNameSpellShorth");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellShorthLessThan(String value) {
            addCriterion("C_GOODS_NAME_SPELL_SHORTH <", value, "cGoodsNameSpellShorth");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellShorthLessThanOrEqualTo(String value) {
            addCriterion("C_GOODS_NAME_SPELL_SHORTH <=", value, "cGoodsNameSpellShorth");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellShorthLike(String value) {
            addCriterion("C_GOODS_NAME_SPELL_SHORTH like", value, "cGoodsNameSpellShorth");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellShorthNotLike(String value) {
            addCriterion("C_GOODS_NAME_SPELL_SHORTH not like", value, "cGoodsNameSpellShorth");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellShorthIn(List<String> values) {
            addCriterion("C_GOODS_NAME_SPELL_SHORTH in", values, "cGoodsNameSpellShorth");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellShorthNotIn(List<String> values) {
            addCriterion("C_GOODS_NAME_SPELL_SHORTH not in", values, "cGoodsNameSpellShorth");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellShorthBetween(String value1, String value2) {
            addCriterion("C_GOODS_NAME_SPELL_SHORTH between", value1, value2, "cGoodsNameSpellShorth");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameSpellShorthNotBetween(String value1, String value2) {
            addCriterion("C_GOODS_NAME_SPELL_SHORTH not between", value1, value2, "cGoodsNameSpellShorth");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameIsNull() {
            addCriterion("C_GOODS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameIsNotNull() {
            addCriterion("C_GOODS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameEqualTo(String value) {
            addCriterion("C_GOODS_NAME =", value, "cGoodsName");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameNotEqualTo(String value) {
            addCriterion("C_GOODS_NAME <>", value, "cGoodsName");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameGreaterThan(String value) {
            addCriterion("C_GOODS_NAME >", value, "cGoodsName");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_GOODS_NAME >=", value, "cGoodsName");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameLessThan(String value) {
            addCriterion("C_GOODS_NAME <", value, "cGoodsName");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("C_GOODS_NAME <=", value, "cGoodsName");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameLike(String value) {
            addCriterion("C_GOODS_NAME like", value, "cGoodsName");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameNotLike(String value) {
            addCriterion("C_GOODS_NAME not like", value, "cGoodsName");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameIn(List<String> values) {
            addCriterion("C_GOODS_NAME in", values, "cGoodsName");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameNotIn(List<String> values) {
            addCriterion("C_GOODS_NAME not in", values, "cGoodsName");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameBetween(String value1, String value2) {
            addCriterion("C_GOODS_NAME between", value1, value2, "cGoodsName");
            return (Criteria) this;
        }

        public Criteria andCGoodsNameNotBetween(String value1, String value2) {
            addCriterion("C_GOODS_NAME not between", value1, value2, "cGoodsName");
            return (Criteria) this;
        }

        public Criteria andCGoodsCategoryCodeIsNull() {
            addCriterion("C_GOODS_CATEGORY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCGoodsCategoryCodeIsNotNull() {
            addCriterion("C_GOODS_CATEGORY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCGoodsCategoryCodeEqualTo(String value) {
            addCriterion("C_GOODS_CATEGORY_CODE =", value, "cGoodsCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCategoryCodeNotEqualTo(String value) {
            addCriterion("C_GOODS_CATEGORY_CODE <>", value, "cGoodsCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCategoryCodeGreaterThan(String value) {
            addCriterion("C_GOODS_CATEGORY_CODE >", value, "cGoodsCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_GOODS_CATEGORY_CODE >=", value, "cGoodsCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCategoryCodeLessThan(String value) {
            addCriterion("C_GOODS_CATEGORY_CODE <", value, "cGoodsCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("C_GOODS_CATEGORY_CODE <=", value, "cGoodsCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCategoryCodeLike(String value) {
            addCriterion("C_GOODS_CATEGORY_CODE like", value, "cGoodsCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCategoryCodeNotLike(String value) {
            addCriterion("C_GOODS_CATEGORY_CODE not like", value, "cGoodsCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCategoryCodeIn(List<String> values) {
            addCriterion("C_GOODS_CATEGORY_CODE in", values, "cGoodsCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCategoryCodeNotIn(List<String> values) {
            addCriterion("C_GOODS_CATEGORY_CODE not in", values, "cGoodsCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCategoryCodeBetween(String value1, String value2) {
            addCriterion("C_GOODS_CATEGORY_CODE between", value1, value2, "cGoodsCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("C_GOODS_CATEGORY_CODE not between", value1, value2, "cGoodsCategoryCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeIdIsNull() {
            addCriterion("C_GOODS_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeIdIsNotNull() {
            addCriterion("C_GOODS_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeIdEqualTo(Integer value) {
            addCriterion("C_GOODS_TYPE_ID =", value, "cGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeIdNotEqualTo(Integer value) {
            addCriterion("C_GOODS_TYPE_ID <>", value, "cGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeIdGreaterThan(Integer value) {
            addCriterion("C_GOODS_TYPE_ID >", value, "cGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_GOODS_TYPE_ID >=", value, "cGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeIdLessThan(Integer value) {
            addCriterion("C_GOODS_TYPE_ID <", value, "cGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_GOODS_TYPE_ID <=", value, "cGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeIdIn(List<Integer> values) {
            addCriterion("C_GOODS_TYPE_ID in", values, "cGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeIdNotIn(List<Integer> values) {
            addCriterion("C_GOODS_TYPE_ID not in", values, "cGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("C_GOODS_TYPE_ID between", value1, value2, "cGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_GOODS_TYPE_ID not between", value1, value2, "cGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andIGoodsDangerIsNull() {
            addCriterion("I_GOODS_DANGER is null");
            return (Criteria) this;
        }

        public Criteria andIGoodsDangerIsNotNull() {
            addCriterion("I_GOODS_DANGER is not null");
            return (Criteria) this;
        }

        public Criteria andIGoodsDangerEqualTo(Integer value) {
            addCriterion("I_GOODS_DANGER =", value, "iGoodsDanger");
            return (Criteria) this;
        }

        public Criteria andIGoodsDangerNotEqualTo(Integer value) {
            addCriterion("I_GOODS_DANGER <>", value, "iGoodsDanger");
            return (Criteria) this;
        }

        public Criteria andIGoodsDangerGreaterThan(Integer value) {
            addCriterion("I_GOODS_DANGER >", value, "iGoodsDanger");
            return (Criteria) this;
        }

        public Criteria andIGoodsDangerGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_GOODS_DANGER >=", value, "iGoodsDanger");
            return (Criteria) this;
        }

        public Criteria andIGoodsDangerLessThan(Integer value) {
            addCriterion("I_GOODS_DANGER <", value, "iGoodsDanger");
            return (Criteria) this;
        }

        public Criteria andIGoodsDangerLessThanOrEqualTo(Integer value) {
            addCriterion("I_GOODS_DANGER <=", value, "iGoodsDanger");
            return (Criteria) this;
        }

        public Criteria andIGoodsDangerIn(List<Integer> values) {
            addCriterion("I_GOODS_DANGER in", values, "iGoodsDanger");
            return (Criteria) this;
        }

        public Criteria andIGoodsDangerNotIn(List<Integer> values) {
            addCriterion("I_GOODS_DANGER not in", values, "iGoodsDanger");
            return (Criteria) this;
        }

        public Criteria andIGoodsDangerBetween(Integer value1, Integer value2) {
            addCriterion("I_GOODS_DANGER between", value1, value2, "iGoodsDanger");
            return (Criteria) this;
        }

        public Criteria andIGoodsDangerNotBetween(Integer value1, Integer value2) {
            addCriterion("I_GOODS_DANGER not between", value1, value2, "iGoodsDanger");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuredRateIsNull() {
            addCriterion("F_GOODS_INSURED_RATE is null");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuredRateIsNotNull() {
            addCriterion("F_GOODS_INSURED_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuredRateEqualTo(Float value) {
            addCriterion("F_GOODS_INSURED_RATE =", value, "fGoodsInsuredRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuredRateNotEqualTo(Float value) {
            addCriterion("F_GOODS_INSURED_RATE <>", value, "fGoodsInsuredRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuredRateGreaterThan(Float value) {
            addCriterion("F_GOODS_INSURED_RATE >", value, "fGoodsInsuredRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuredRateGreaterThanOrEqualTo(Float value) {
            addCriterion("F_GOODS_INSURED_RATE >=", value, "fGoodsInsuredRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuredRateLessThan(Float value) {
            addCriterion("F_GOODS_INSURED_RATE <", value, "fGoodsInsuredRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuredRateLessThanOrEqualTo(Float value) {
            addCriterion("F_GOODS_INSURED_RATE <=", value, "fGoodsInsuredRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuredRateIn(List<Float> values) {
            addCriterion("F_GOODS_INSURED_RATE in", values, "fGoodsInsuredRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuredRateNotIn(List<Float> values) {
            addCriterion("F_GOODS_INSURED_RATE not in", values, "fGoodsInsuredRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuredRateBetween(Float value1, Float value2) {
            addCriterion("F_GOODS_INSURED_RATE between", value1, value2, "fGoodsInsuredRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuredRateNotBetween(Float value1, Float value2) {
            addCriterion("F_GOODS_INSURED_RATE not between", value1, value2, "fGoodsInsuredRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuranceValueIsNull() {
            addCriterion("F_GOODS_INSURANCE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuranceValueIsNotNull() {
            addCriterion("F_GOODS_INSURANCE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuranceValueEqualTo(Float value) {
            addCriterion("F_GOODS_INSURANCE_VALUE =", value, "fGoodsInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuranceValueNotEqualTo(Float value) {
            addCriterion("F_GOODS_INSURANCE_VALUE <>", value, "fGoodsInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuranceValueGreaterThan(Float value) {
            addCriterion("F_GOODS_INSURANCE_VALUE >", value, "fGoodsInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuranceValueGreaterThanOrEqualTo(Float value) {
            addCriterion("F_GOODS_INSURANCE_VALUE >=", value, "fGoodsInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuranceValueLessThan(Float value) {
            addCriterion("F_GOODS_INSURANCE_VALUE <", value, "fGoodsInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuranceValueLessThanOrEqualTo(Float value) {
            addCriterion("F_GOODS_INSURANCE_VALUE <=", value, "fGoodsInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuranceValueIn(List<Float> values) {
            addCriterion("F_GOODS_INSURANCE_VALUE in", values, "fGoodsInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuranceValueNotIn(List<Float> values) {
            addCriterion("F_GOODS_INSURANCE_VALUE not in", values, "fGoodsInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuranceValueBetween(Float value1, Float value2) {
            addCriterion("F_GOODS_INSURANCE_VALUE between", value1, value2, "fGoodsInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFGoodsInsuranceValueNotBetween(Float value1, Float value2) {
            addCriterion("F_GOODS_INSURANCE_VALUE not between", value1, value2, "fGoodsInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFGoodsLoadAndUnloadRateIsNull() {
            addCriterion("F_GOODS_LOAD_AND_UNLOAD_RATE is null");
            return (Criteria) this;
        }

        public Criteria andFGoodsLoadAndUnloadRateIsNotNull() {
            addCriterion("F_GOODS_LOAD_AND_UNLOAD_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andFGoodsLoadAndUnloadRateEqualTo(Float value) {
            addCriterion("F_GOODS_LOAD_AND_UNLOAD_RATE =", value, "fGoodsLoadAndUnloadRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsLoadAndUnloadRateNotEqualTo(Float value) {
            addCriterion("F_GOODS_LOAD_AND_UNLOAD_RATE <>", value, "fGoodsLoadAndUnloadRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsLoadAndUnloadRateGreaterThan(Float value) {
            addCriterion("F_GOODS_LOAD_AND_UNLOAD_RATE >", value, "fGoodsLoadAndUnloadRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsLoadAndUnloadRateGreaterThanOrEqualTo(Float value) {
            addCriterion("F_GOODS_LOAD_AND_UNLOAD_RATE >=", value, "fGoodsLoadAndUnloadRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsLoadAndUnloadRateLessThan(Float value) {
            addCriterion("F_GOODS_LOAD_AND_UNLOAD_RATE <", value, "fGoodsLoadAndUnloadRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsLoadAndUnloadRateLessThanOrEqualTo(Float value) {
            addCriterion("F_GOODS_LOAD_AND_UNLOAD_RATE <=", value, "fGoodsLoadAndUnloadRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsLoadAndUnloadRateIn(List<Float> values) {
            addCriterion("F_GOODS_LOAD_AND_UNLOAD_RATE in", values, "fGoodsLoadAndUnloadRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsLoadAndUnloadRateNotIn(List<Float> values) {
            addCriterion("F_GOODS_LOAD_AND_UNLOAD_RATE not in", values, "fGoodsLoadAndUnloadRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsLoadAndUnloadRateBetween(Float value1, Float value2) {
            addCriterion("F_GOODS_LOAD_AND_UNLOAD_RATE between", value1, value2, "fGoodsLoadAndUnloadRate");
            return (Criteria) this;
        }

        public Criteria andFGoodsLoadAndUnloadRateNotBetween(Float value1, Float value2) {
            addCriterion("F_GOODS_LOAD_AND_UNLOAD_RATE not between", value1, value2, "fGoodsLoadAndUnloadRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsWholeVegicleRateIsNull() {
            addCriterion("C_GOODS_WHOLE_VEGICLE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andCGoodsWholeVegicleRateIsNotNull() {
            addCriterion("C_GOODS_WHOLE_VEGICLE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andCGoodsWholeVegicleRateEqualTo(String value) {
            addCriterion("C_GOODS_WHOLE_VEGICLE_RATE =", value, "cGoodsWholeVegicleRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsWholeVegicleRateNotEqualTo(String value) {
            addCriterion("C_GOODS_WHOLE_VEGICLE_RATE <>", value, "cGoodsWholeVegicleRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsWholeVegicleRateGreaterThan(String value) {
            addCriterion("C_GOODS_WHOLE_VEGICLE_RATE >", value, "cGoodsWholeVegicleRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsWholeVegicleRateGreaterThanOrEqualTo(String value) {
            addCriterion("C_GOODS_WHOLE_VEGICLE_RATE >=", value, "cGoodsWholeVegicleRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsWholeVegicleRateLessThan(String value) {
            addCriterion("C_GOODS_WHOLE_VEGICLE_RATE <", value, "cGoodsWholeVegicleRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsWholeVegicleRateLessThanOrEqualTo(String value) {
            addCriterion("C_GOODS_WHOLE_VEGICLE_RATE <=", value, "cGoodsWholeVegicleRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsWholeVegicleRateLike(String value) {
            addCriterion("C_GOODS_WHOLE_VEGICLE_RATE like", value, "cGoodsWholeVegicleRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsWholeVegicleRateNotLike(String value) {
            addCriterion("C_GOODS_WHOLE_VEGICLE_RATE not like", value, "cGoodsWholeVegicleRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsWholeVegicleRateIn(List<String> values) {
            addCriterion("C_GOODS_WHOLE_VEGICLE_RATE in", values, "cGoodsWholeVegicleRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsWholeVegicleRateNotIn(List<String> values) {
            addCriterion("C_GOODS_WHOLE_VEGICLE_RATE not in", values, "cGoodsWholeVegicleRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsWholeVegicleRateBetween(String value1, String value2) {
            addCriterion("C_GOODS_WHOLE_VEGICLE_RATE between", value1, value2, "cGoodsWholeVegicleRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsWholeVegicleRateNotBetween(String value1, String value2) {
            addCriterion("C_GOODS_WHOLE_VEGICLE_RATE not between", value1, value2, "cGoodsWholeVegicleRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsFastFreightRateIsNull() {
            addCriterion("C_GOODS_FAST_FREIGHT_RATE is null");
            return (Criteria) this;
        }

        public Criteria andCGoodsFastFreightRateIsNotNull() {
            addCriterion("C_GOODS_FAST_FREIGHT_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andCGoodsFastFreightRateEqualTo(String value) {
            addCriterion("C_GOODS_FAST_FREIGHT_RATE =", value, "cGoodsFastFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsFastFreightRateNotEqualTo(String value) {
            addCriterion("C_GOODS_FAST_FREIGHT_RATE <>", value, "cGoodsFastFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsFastFreightRateGreaterThan(String value) {
            addCriterion("C_GOODS_FAST_FREIGHT_RATE >", value, "cGoodsFastFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsFastFreightRateGreaterThanOrEqualTo(String value) {
            addCriterion("C_GOODS_FAST_FREIGHT_RATE >=", value, "cGoodsFastFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsFastFreightRateLessThan(String value) {
            addCriterion("C_GOODS_FAST_FREIGHT_RATE <", value, "cGoodsFastFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsFastFreightRateLessThanOrEqualTo(String value) {
            addCriterion("C_GOODS_FAST_FREIGHT_RATE <=", value, "cGoodsFastFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsFastFreightRateLike(String value) {
            addCriterion("C_GOODS_FAST_FREIGHT_RATE like", value, "cGoodsFastFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsFastFreightRateNotLike(String value) {
            addCriterion("C_GOODS_FAST_FREIGHT_RATE not like", value, "cGoodsFastFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsFastFreightRateIn(List<String> values) {
            addCriterion("C_GOODS_FAST_FREIGHT_RATE in", values, "cGoodsFastFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsFastFreightRateNotIn(List<String> values) {
            addCriterion("C_GOODS_FAST_FREIGHT_RATE not in", values, "cGoodsFastFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsFastFreightRateBetween(String value1, String value2) {
            addCriterion("C_GOODS_FAST_FREIGHT_RATE between", value1, value2, "cGoodsFastFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsFastFreightRateNotBetween(String value1, String value2) {
            addCriterion("C_GOODS_FAST_FREIGHT_RATE not between", value1, value2, "cGoodsFastFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsBoxFreightRateIsNull() {
            addCriterion("C_GOODS_BOX_FREIGHT_RATE is null");
            return (Criteria) this;
        }

        public Criteria andCGoodsBoxFreightRateIsNotNull() {
            addCriterion("C_GOODS_BOX_FREIGHT_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andCGoodsBoxFreightRateEqualTo(String value) {
            addCriterion("C_GOODS_BOX_FREIGHT_RATE =", value, "cGoodsBoxFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsBoxFreightRateNotEqualTo(String value) {
            addCriterion("C_GOODS_BOX_FREIGHT_RATE <>", value, "cGoodsBoxFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsBoxFreightRateGreaterThan(String value) {
            addCriterion("C_GOODS_BOX_FREIGHT_RATE >", value, "cGoodsBoxFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsBoxFreightRateGreaterThanOrEqualTo(String value) {
            addCriterion("C_GOODS_BOX_FREIGHT_RATE >=", value, "cGoodsBoxFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsBoxFreightRateLessThan(String value) {
            addCriterion("C_GOODS_BOX_FREIGHT_RATE <", value, "cGoodsBoxFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsBoxFreightRateLessThanOrEqualTo(String value) {
            addCriterion("C_GOODS_BOX_FREIGHT_RATE <=", value, "cGoodsBoxFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsBoxFreightRateLike(String value) {
            addCriterion("C_GOODS_BOX_FREIGHT_RATE like", value, "cGoodsBoxFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsBoxFreightRateNotLike(String value) {
            addCriterion("C_GOODS_BOX_FREIGHT_RATE not like", value, "cGoodsBoxFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsBoxFreightRateIn(List<String> values) {
            addCriterion("C_GOODS_BOX_FREIGHT_RATE in", values, "cGoodsBoxFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsBoxFreightRateNotIn(List<String> values) {
            addCriterion("C_GOODS_BOX_FREIGHT_RATE not in", values, "cGoodsBoxFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsBoxFreightRateBetween(String value1, String value2) {
            addCriterion("C_GOODS_BOX_FREIGHT_RATE between", value1, value2, "cGoodsBoxFreightRate");
            return (Criteria) this;
        }

        public Criteria andCGoodsBoxFreightRateNotBetween(String value1, String value2) {
            addCriterion("C_GOODS_BOX_FREIGHT_RATE not between", value1, value2, "cGoodsBoxFreightRate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}