package com.crscd.riis.freightmarket.trade.entity;

import java.util.ArrayList;
import java.util.List;

public class FmTradeOrderInfoWholeVegicleFreightEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmTradeOrderInfoWholeVegicleFreightEntityExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIOrderIdIsNull() {
            addCriterion("I_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andIOrderIdIsNotNull() {
            addCriterion("I_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIOrderIdEqualTo(Integer value) {
            addCriterion("I_ORDER_ID =", value, "iOrderId");
            return (Criteria) this;
        }

        public Criteria andIOrderIdNotEqualTo(Integer value) {
            addCriterion("I_ORDER_ID <>", value, "iOrderId");
            return (Criteria) this;
        }

        public Criteria andIOrderIdGreaterThan(Integer value) {
            addCriterion("I_ORDER_ID >", value, "iOrderId");
            return (Criteria) this;
        }

        public Criteria andIOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_ORDER_ID >=", value, "iOrderId");
            return (Criteria) this;
        }

        public Criteria andIOrderIdLessThan(Integer value) {
            addCriterion("I_ORDER_ID <", value, "iOrderId");
            return (Criteria) this;
        }

        public Criteria andIOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("I_ORDER_ID <=", value, "iOrderId");
            return (Criteria) this;
        }

        public Criteria andIOrderIdIn(List<Integer> values) {
            addCriterion("I_ORDER_ID in", values, "iOrderId");
            return (Criteria) this;
        }

        public Criteria andIOrderIdNotIn(List<Integer> values) {
            addCriterion("I_ORDER_ID not in", values, "iOrderId");
            return (Criteria) this;
        }

        public Criteria andIOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("I_ORDER_ID between", value1, value2, "iOrderId");
            return (Criteria) this;
        }

        public Criteria andIOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("I_ORDER_ID not between", value1, value2, "iOrderId");
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

        public Criteria andCGoodsCodeIsNull() {
            addCriterion("C_GOODS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCGoodsCodeIsNotNull() {
            addCriterion("C_GOODS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCGoodsCodeEqualTo(String value) {
            addCriterion("C_GOODS_CODE =", value, "cGoodsCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCodeNotEqualTo(String value) {
            addCriterion("C_GOODS_CODE <>", value, "cGoodsCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCodeGreaterThan(String value) {
            addCriterion("C_GOODS_CODE >", value, "cGoodsCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_GOODS_CODE >=", value, "cGoodsCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCodeLessThan(String value) {
            addCriterion("C_GOODS_CODE <", value, "cGoodsCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("C_GOODS_CODE <=", value, "cGoodsCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCodeLike(String value) {
            addCriterion("C_GOODS_CODE like", value, "cGoodsCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCodeNotLike(String value) {
            addCriterion("C_GOODS_CODE not like", value, "cGoodsCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCodeIn(List<String> values) {
            addCriterion("C_GOODS_CODE in", values, "cGoodsCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCodeNotIn(List<String> values) {
            addCriterion("C_GOODS_CODE not in", values, "cGoodsCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCodeBetween(String value1, String value2) {
            addCriterion("C_GOODS_CODE between", value1, value2, "cGoodsCode");
            return (Criteria) this;
        }

        public Criteria andCGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("C_GOODS_CODE not between", value1, value2, "cGoodsCode");
            return (Criteria) this;
        }

        public Criteria andFGoodsWightIsNull() {
            addCriterion("F_GOODS_WIGHT is null");
            return (Criteria) this;
        }

        public Criteria andFGoodsWightIsNotNull() {
            addCriterion("F_GOODS_WIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andFGoodsWightEqualTo(Float value) {
            addCriterion("F_GOODS_WIGHT =", value, "fGoodsWight");
            return (Criteria) this;
        }

        public Criteria andFGoodsWightNotEqualTo(Float value) {
            addCriterion("F_GOODS_WIGHT <>", value, "fGoodsWight");
            return (Criteria) this;
        }

        public Criteria andFGoodsWightGreaterThan(Float value) {
            addCriterion("F_GOODS_WIGHT >", value, "fGoodsWight");
            return (Criteria) this;
        }

        public Criteria andFGoodsWightGreaterThanOrEqualTo(Float value) {
            addCriterion("F_GOODS_WIGHT >=", value, "fGoodsWight");
            return (Criteria) this;
        }

        public Criteria andFGoodsWightLessThan(Float value) {
            addCriterion("F_GOODS_WIGHT <", value, "fGoodsWight");
            return (Criteria) this;
        }

        public Criteria andFGoodsWightLessThanOrEqualTo(Float value) {
            addCriterion("F_GOODS_WIGHT <=", value, "fGoodsWight");
            return (Criteria) this;
        }

        public Criteria andFGoodsWightIn(List<Float> values) {
            addCriterion("F_GOODS_WIGHT in", values, "fGoodsWight");
            return (Criteria) this;
        }

        public Criteria andFGoodsWightNotIn(List<Float> values) {
            addCriterion("F_GOODS_WIGHT not in", values, "fGoodsWight");
            return (Criteria) this;
        }

        public Criteria andFGoodsWightBetween(Float value1, Float value2) {
            addCriterion("F_GOODS_WIGHT between", value1, value2, "fGoodsWight");
            return (Criteria) this;
        }

        public Criteria andFGoodsWightNotBetween(Float value1, Float value2) {
            addCriterion("F_GOODS_WIGHT not between", value1, value2, "fGoodsWight");
            return (Criteria) this;
        }

        public Criteria andFGoodsVolumeIsNull() {
            addCriterion("F_GOODS_VOLUME is null");
            return (Criteria) this;
        }

        public Criteria andFGoodsVolumeIsNotNull() {
            addCriterion("F_GOODS_VOLUME is not null");
            return (Criteria) this;
        }

        public Criteria andFGoodsVolumeEqualTo(Float value) {
            addCriterion("F_GOODS_VOLUME =", value, "fGoodsVolume");
            return (Criteria) this;
        }

        public Criteria andFGoodsVolumeNotEqualTo(Float value) {
            addCriterion("F_GOODS_VOLUME <>", value, "fGoodsVolume");
            return (Criteria) this;
        }

        public Criteria andFGoodsVolumeGreaterThan(Float value) {
            addCriterion("F_GOODS_VOLUME >", value, "fGoodsVolume");
            return (Criteria) this;
        }

        public Criteria andFGoodsVolumeGreaterThanOrEqualTo(Float value) {
            addCriterion("F_GOODS_VOLUME >=", value, "fGoodsVolume");
            return (Criteria) this;
        }

        public Criteria andFGoodsVolumeLessThan(Float value) {
            addCriterion("F_GOODS_VOLUME <", value, "fGoodsVolume");
            return (Criteria) this;
        }

        public Criteria andFGoodsVolumeLessThanOrEqualTo(Float value) {
            addCriterion("F_GOODS_VOLUME <=", value, "fGoodsVolume");
            return (Criteria) this;
        }

        public Criteria andFGoodsVolumeIn(List<Float> values) {
            addCriterion("F_GOODS_VOLUME in", values, "fGoodsVolume");
            return (Criteria) this;
        }

        public Criteria andFGoodsVolumeNotIn(List<Float> values) {
            addCriterion("F_GOODS_VOLUME not in", values, "fGoodsVolume");
            return (Criteria) this;
        }

        public Criteria andFGoodsVolumeBetween(Float value1, Float value2) {
            addCriterion("F_GOODS_VOLUME between", value1, value2, "fGoodsVolume");
            return (Criteria) this;
        }

        public Criteria andFGoodsVolumeNotBetween(Float value1, Float value2) {
            addCriterion("F_GOODS_VOLUME not between", value1, value2, "fGoodsVolume");
            return (Criteria) this;
        }

        public Criteria andCGoodsFeatureIsNull() {
            addCriterion("C_GOODS_FEATURE is null");
            return (Criteria) this;
        }

        public Criteria andCGoodsFeatureIsNotNull() {
            addCriterion("C_GOODS_FEATURE is not null");
            return (Criteria) this;
        }

        public Criteria andCGoodsFeatureEqualTo(String value) {
            addCriterion("C_GOODS_FEATURE =", value, "cGoodsFeature");
            return (Criteria) this;
        }

        public Criteria andCGoodsFeatureNotEqualTo(String value) {
            addCriterion("C_GOODS_FEATURE <>", value, "cGoodsFeature");
            return (Criteria) this;
        }

        public Criteria andCGoodsFeatureGreaterThan(String value) {
            addCriterion("C_GOODS_FEATURE >", value, "cGoodsFeature");
            return (Criteria) this;
        }

        public Criteria andCGoodsFeatureGreaterThanOrEqualTo(String value) {
            addCriterion("C_GOODS_FEATURE >=", value, "cGoodsFeature");
            return (Criteria) this;
        }

        public Criteria andCGoodsFeatureLessThan(String value) {
            addCriterion("C_GOODS_FEATURE <", value, "cGoodsFeature");
            return (Criteria) this;
        }

        public Criteria andCGoodsFeatureLessThanOrEqualTo(String value) {
            addCriterion("C_GOODS_FEATURE <=", value, "cGoodsFeature");
            return (Criteria) this;
        }

        public Criteria andCGoodsFeatureLike(String value) {
            addCriterion("C_GOODS_FEATURE like", value, "cGoodsFeature");
            return (Criteria) this;
        }

        public Criteria andCGoodsFeatureNotLike(String value) {
            addCriterion("C_GOODS_FEATURE not like", value, "cGoodsFeature");
            return (Criteria) this;
        }

        public Criteria andCGoodsFeatureIn(List<String> values) {
            addCriterion("C_GOODS_FEATURE in", values, "cGoodsFeature");
            return (Criteria) this;
        }

        public Criteria andCGoodsFeatureNotIn(List<String> values) {
            addCriterion("C_GOODS_FEATURE not in", values, "cGoodsFeature");
            return (Criteria) this;
        }

        public Criteria andCGoodsFeatureBetween(String value1, String value2) {
            addCriterion("C_GOODS_FEATURE between", value1, value2, "cGoodsFeature");
            return (Criteria) this;
        }

        public Criteria andCGoodsFeatureNotBetween(String value1, String value2) {
            addCriterion("C_GOODS_FEATURE not between", value1, value2, "cGoodsFeature");
            return (Criteria) this;
        }

        public Criteria andFEachGoodsMaxWeightIsNull() {
            addCriterion("F_EACH_GOODS_MAX_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andFEachGoodsMaxWeightIsNotNull() {
            addCriterion("F_EACH_GOODS_MAX_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andFEachGoodsMaxWeightEqualTo(Float value) {
            addCriterion("F_EACH_GOODS_MAX_WEIGHT =", value, "fEachGoodsMaxWeight");
            return (Criteria) this;
        }

        public Criteria andFEachGoodsMaxWeightNotEqualTo(Float value) {
            addCriterion("F_EACH_GOODS_MAX_WEIGHT <>", value, "fEachGoodsMaxWeight");
            return (Criteria) this;
        }

        public Criteria andFEachGoodsMaxWeightGreaterThan(Float value) {
            addCriterion("F_EACH_GOODS_MAX_WEIGHT >", value, "fEachGoodsMaxWeight");
            return (Criteria) this;
        }

        public Criteria andFEachGoodsMaxWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("F_EACH_GOODS_MAX_WEIGHT >=", value, "fEachGoodsMaxWeight");
            return (Criteria) this;
        }

        public Criteria andFEachGoodsMaxWeightLessThan(Float value) {
            addCriterion("F_EACH_GOODS_MAX_WEIGHT <", value, "fEachGoodsMaxWeight");
            return (Criteria) this;
        }

        public Criteria andFEachGoodsMaxWeightLessThanOrEqualTo(Float value) {
            addCriterion("F_EACH_GOODS_MAX_WEIGHT <=", value, "fEachGoodsMaxWeight");
            return (Criteria) this;
        }

        public Criteria andFEachGoodsMaxWeightIn(List<Float> values) {
            addCriterion("F_EACH_GOODS_MAX_WEIGHT in", values, "fEachGoodsMaxWeight");
            return (Criteria) this;
        }

        public Criteria andFEachGoodsMaxWeightNotIn(List<Float> values) {
            addCriterion("F_EACH_GOODS_MAX_WEIGHT not in", values, "fEachGoodsMaxWeight");
            return (Criteria) this;
        }

        public Criteria andFEachGoodsMaxWeightBetween(Float value1, Float value2) {
            addCriterion("F_EACH_GOODS_MAX_WEIGHT between", value1, value2, "fEachGoodsMaxWeight");
            return (Criteria) this;
        }

        public Criteria andFEachGoodsMaxWeightNotBetween(Float value1, Float value2) {
            addCriterion("F_EACH_GOODS_MAX_WEIGHT not between", value1, value2, "fEachGoodsMaxWeight");
            return (Criteria) this;
        }

        public Criteria andIGoodsRequestTrainNumberIsNull() {
            addCriterion("I_GOODS_REQUEST_TRAIN_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andIGoodsRequestTrainNumberIsNotNull() {
            addCriterion("I_GOODS_REQUEST_TRAIN_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andIGoodsRequestTrainNumberEqualTo(Integer value) {
            addCriterion("I_GOODS_REQUEST_TRAIN_NUMBER =", value, "iGoodsRequestTrainNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsRequestTrainNumberNotEqualTo(Integer value) {
            addCriterion("I_GOODS_REQUEST_TRAIN_NUMBER <>", value, "iGoodsRequestTrainNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsRequestTrainNumberGreaterThan(Integer value) {
            addCriterion("I_GOODS_REQUEST_TRAIN_NUMBER >", value, "iGoodsRequestTrainNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsRequestTrainNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_GOODS_REQUEST_TRAIN_NUMBER >=", value, "iGoodsRequestTrainNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsRequestTrainNumberLessThan(Integer value) {
            addCriterion("I_GOODS_REQUEST_TRAIN_NUMBER <", value, "iGoodsRequestTrainNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsRequestTrainNumberLessThanOrEqualTo(Integer value) {
            addCriterion("I_GOODS_REQUEST_TRAIN_NUMBER <=", value, "iGoodsRequestTrainNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsRequestTrainNumberIn(List<Integer> values) {
            addCriterion("I_GOODS_REQUEST_TRAIN_NUMBER in", values, "iGoodsRequestTrainNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsRequestTrainNumberNotIn(List<Integer> values) {
            addCriterion("I_GOODS_REQUEST_TRAIN_NUMBER not in", values, "iGoodsRequestTrainNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsRequestTrainNumberBetween(Integer value1, Integer value2) {
            addCriterion("I_GOODS_REQUEST_TRAIN_NUMBER between", value1, value2, "iGoodsRequestTrainNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsRequestTrainNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("I_GOODS_REQUEST_TRAIN_NUMBER not between", value1, value2, "iGoodsRequestTrainNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsSealNumIsNull() {
            addCriterion("I_GOODS_SEAL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andIGoodsSealNumIsNotNull() {
            addCriterion("I_GOODS_SEAL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andIGoodsSealNumEqualTo(Integer value) {
            addCriterion("I_GOODS_SEAL_NUM =", value, "iGoodsSealNum");
            return (Criteria) this;
        }

        public Criteria andIGoodsSealNumNotEqualTo(Integer value) {
            addCriterion("I_GOODS_SEAL_NUM <>", value, "iGoodsSealNum");
            return (Criteria) this;
        }

        public Criteria andIGoodsSealNumGreaterThan(Integer value) {
            addCriterion("I_GOODS_SEAL_NUM >", value, "iGoodsSealNum");
            return (Criteria) this;
        }

        public Criteria andIGoodsSealNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_GOODS_SEAL_NUM >=", value, "iGoodsSealNum");
            return (Criteria) this;
        }

        public Criteria andIGoodsSealNumLessThan(Integer value) {
            addCriterion("I_GOODS_SEAL_NUM <", value, "iGoodsSealNum");
            return (Criteria) this;
        }

        public Criteria andIGoodsSealNumLessThanOrEqualTo(Integer value) {
            addCriterion("I_GOODS_SEAL_NUM <=", value, "iGoodsSealNum");
            return (Criteria) this;
        }

        public Criteria andIGoodsSealNumIn(List<Integer> values) {
            addCriterion("I_GOODS_SEAL_NUM in", values, "iGoodsSealNum");
            return (Criteria) this;
        }

        public Criteria andIGoodsSealNumNotIn(List<Integer> values) {
            addCriterion("I_GOODS_SEAL_NUM not in", values, "iGoodsSealNum");
            return (Criteria) this;
        }

        public Criteria andIGoodsSealNumBetween(Integer value1, Integer value2) {
            addCriterion("I_GOODS_SEAL_NUM between", value1, value2, "iGoodsSealNum");
            return (Criteria) this;
        }

        public Criteria andIGoodsSealNumNotBetween(Integer value1, Integer value2) {
            addCriterion("I_GOODS_SEAL_NUM not between", value1, value2, "iGoodsSealNum");
            return (Criteria) this;
        }

        public Criteria andIGoodsReinforceIsNull() {
            addCriterion("I_GOODS_REINFORCE is null");
            return (Criteria) this;
        }

        public Criteria andIGoodsReinforceIsNotNull() {
            addCriterion("I_GOODS_REINFORCE is not null");
            return (Criteria) this;
        }

        public Criteria andIGoodsReinforceEqualTo(Integer value) {
            addCriterion("I_GOODS_REINFORCE =", value, "iGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIGoodsReinforceNotEqualTo(Integer value) {
            addCriterion("I_GOODS_REINFORCE <>", value, "iGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIGoodsReinforceGreaterThan(Integer value) {
            addCriterion("I_GOODS_REINFORCE >", value, "iGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIGoodsReinforceGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_GOODS_REINFORCE >=", value, "iGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIGoodsReinforceLessThan(Integer value) {
            addCriterion("I_GOODS_REINFORCE <", value, "iGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIGoodsReinforceLessThanOrEqualTo(Integer value) {
            addCriterion("I_GOODS_REINFORCE <=", value, "iGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIGoodsReinforceIn(List<Integer> values) {
            addCriterion("I_GOODS_REINFORCE in", values, "iGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIGoodsReinforceNotIn(List<Integer> values) {
            addCriterion("I_GOODS_REINFORCE not in", values, "iGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIGoodsReinforceBetween(Integer value1, Integer value2) {
            addCriterion("I_GOODS_REINFORCE between", value1, value2, "iGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIGoodsReinforceNotBetween(Integer value1, Integer value2) {
            addCriterion("I_GOODS_REINFORCE not between", value1, value2, "iGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIGoodsWrapperIsNull() {
            addCriterion("I_GOODS_WRAPPER is null");
            return (Criteria) this;
        }

        public Criteria andIGoodsWrapperIsNotNull() {
            addCriterion("I_GOODS_WRAPPER is not null");
            return (Criteria) this;
        }

        public Criteria andIGoodsWrapperEqualTo(Integer value) {
            addCriterion("I_GOODS_WRAPPER =", value, "iGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andIGoodsWrapperNotEqualTo(Integer value) {
            addCriterion("I_GOODS_WRAPPER <>", value, "iGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andIGoodsWrapperGreaterThan(Integer value) {
            addCriterion("I_GOODS_WRAPPER >", value, "iGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andIGoodsWrapperGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_GOODS_WRAPPER >=", value, "iGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andIGoodsWrapperLessThan(Integer value) {
            addCriterion("I_GOODS_WRAPPER <", value, "iGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andIGoodsWrapperLessThanOrEqualTo(Integer value) {
            addCriterion("I_GOODS_WRAPPER <=", value, "iGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andIGoodsWrapperIn(List<Integer> values) {
            addCriterion("I_GOODS_WRAPPER in", values, "iGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andIGoodsWrapperNotIn(List<Integer> values) {
            addCriterion("I_GOODS_WRAPPER not in", values, "iGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andIGoodsWrapperBetween(Integer value1, Integer value2) {
            addCriterion("I_GOODS_WRAPPER between", value1, value2, "iGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andIGoodsWrapperNotBetween(Integer value1, Integer value2) {
            addCriterion("I_GOODS_WRAPPER not between", value1, value2, "iGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andICanvasNumberIsNull() {
            addCriterion("I_CANVAS_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andICanvasNumberIsNotNull() {
            addCriterion("I_CANVAS_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andICanvasNumberEqualTo(Integer value) {
            addCriterion("I_CANVAS_NUMBER =", value, "iCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andICanvasNumberNotEqualTo(Integer value) {
            addCriterion("I_CANVAS_NUMBER <>", value, "iCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andICanvasNumberGreaterThan(Integer value) {
            addCriterion("I_CANVAS_NUMBER >", value, "iCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andICanvasNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_CANVAS_NUMBER >=", value, "iCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andICanvasNumberLessThan(Integer value) {
            addCriterion("I_CANVAS_NUMBER <", value, "iCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andICanvasNumberLessThanOrEqualTo(Integer value) {
            addCriterion("I_CANVAS_NUMBER <=", value, "iCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andICanvasNumberIn(List<Integer> values) {
            addCriterion("I_CANVAS_NUMBER in", values, "iCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andICanvasNumberNotIn(List<Integer> values) {
            addCriterion("I_CANVAS_NUMBER not in", values, "iCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andICanvasNumberBetween(Integer value1, Integer value2) {
            addCriterion("I_CANVAS_NUMBER between", value1, value2, "iCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andICanvasNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("I_CANVAS_NUMBER not between", value1, value2, "iCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andITrainTypeIsNull() {
            addCriterion("I_TRAIN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andITrainTypeIsNotNull() {
            addCriterion("I_TRAIN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andITrainTypeEqualTo(Integer value) {
            addCriterion("I_TRAIN_TYPE =", value, "iTrainType");
            return (Criteria) this;
        }

        public Criteria andITrainTypeNotEqualTo(Integer value) {
            addCriterion("I_TRAIN_TYPE <>", value, "iTrainType");
            return (Criteria) this;
        }

        public Criteria andITrainTypeGreaterThan(Integer value) {
            addCriterion("I_TRAIN_TYPE >", value, "iTrainType");
            return (Criteria) this;
        }

        public Criteria andITrainTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_TRAIN_TYPE >=", value, "iTrainType");
            return (Criteria) this;
        }

        public Criteria andITrainTypeLessThan(Integer value) {
            addCriterion("I_TRAIN_TYPE <", value, "iTrainType");
            return (Criteria) this;
        }

        public Criteria andITrainTypeLessThanOrEqualTo(Integer value) {
            addCriterion("I_TRAIN_TYPE <=", value, "iTrainType");
            return (Criteria) this;
        }

        public Criteria andITrainTypeIn(List<Integer> values) {
            addCriterion("I_TRAIN_TYPE in", values, "iTrainType");
            return (Criteria) this;
        }

        public Criteria andITrainTypeNotIn(List<Integer> values) {
            addCriterion("I_TRAIN_TYPE not in", values, "iTrainType");
            return (Criteria) this;
        }

        public Criteria andITrainTypeBetween(Integer value1, Integer value2) {
            addCriterion("I_TRAIN_TYPE between", value1, value2, "iTrainType");
            return (Criteria) this;
        }

        public Criteria andITrainTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("I_TRAIN_TYPE not between", value1, value2, "iTrainType");
            return (Criteria) this;
        }

        public Criteria andISenderLineIdIsNull() {
            addCriterion("I_SENDER_LINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andISenderLineIdIsNotNull() {
            addCriterion("I_SENDER_LINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andISenderLineIdEqualTo(Integer value) {
            addCriterion("I_SENDER_LINE_ID =", value, "iSenderLineId");
            return (Criteria) this;
        }

        public Criteria andISenderLineIdNotEqualTo(Integer value) {
            addCriterion("I_SENDER_LINE_ID <>", value, "iSenderLineId");
            return (Criteria) this;
        }

        public Criteria andISenderLineIdGreaterThan(Integer value) {
            addCriterion("I_SENDER_LINE_ID >", value, "iSenderLineId");
            return (Criteria) this;
        }

        public Criteria andISenderLineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_SENDER_LINE_ID >=", value, "iSenderLineId");
            return (Criteria) this;
        }

        public Criteria andISenderLineIdLessThan(Integer value) {
            addCriterion("I_SENDER_LINE_ID <", value, "iSenderLineId");
            return (Criteria) this;
        }

        public Criteria andISenderLineIdLessThanOrEqualTo(Integer value) {
            addCriterion("I_SENDER_LINE_ID <=", value, "iSenderLineId");
            return (Criteria) this;
        }

        public Criteria andISenderLineIdIn(List<Integer> values) {
            addCriterion("I_SENDER_LINE_ID in", values, "iSenderLineId");
            return (Criteria) this;
        }

        public Criteria andISenderLineIdNotIn(List<Integer> values) {
            addCriterion("I_SENDER_LINE_ID not in", values, "iSenderLineId");
            return (Criteria) this;
        }

        public Criteria andISenderLineIdBetween(Integer value1, Integer value2) {
            addCriterion("I_SENDER_LINE_ID between", value1, value2, "iSenderLineId");
            return (Criteria) this;
        }

        public Criteria andISenderLineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("I_SENDER_LINE_ID not between", value1, value2, "iSenderLineId");
            return (Criteria) this;
        }

        public Criteria andIRecverLineIdIsNull() {
            addCriterion("I_RECVER_LINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andIRecverLineIdIsNotNull() {
            addCriterion("I_RECVER_LINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIRecverLineIdEqualTo(Integer value) {
            addCriterion("I_RECVER_LINE_ID =", value, "iRecverLineId");
            return (Criteria) this;
        }

        public Criteria andIRecverLineIdNotEqualTo(Integer value) {
            addCriterion("I_RECVER_LINE_ID <>", value, "iRecverLineId");
            return (Criteria) this;
        }

        public Criteria andIRecverLineIdGreaterThan(Integer value) {
            addCriterion("I_RECVER_LINE_ID >", value, "iRecverLineId");
            return (Criteria) this;
        }

        public Criteria andIRecverLineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_RECVER_LINE_ID >=", value, "iRecverLineId");
            return (Criteria) this;
        }

        public Criteria andIRecverLineIdLessThan(Integer value) {
            addCriterion("I_RECVER_LINE_ID <", value, "iRecverLineId");
            return (Criteria) this;
        }

        public Criteria andIRecverLineIdLessThanOrEqualTo(Integer value) {
            addCriterion("I_RECVER_LINE_ID <=", value, "iRecverLineId");
            return (Criteria) this;
        }

        public Criteria andIRecverLineIdIn(List<Integer> values) {
            addCriterion("I_RECVER_LINE_ID in", values, "iRecverLineId");
            return (Criteria) this;
        }

        public Criteria andIRecverLineIdNotIn(List<Integer> values) {
            addCriterion("I_RECVER_LINE_ID not in", values, "iRecverLineId");
            return (Criteria) this;
        }

        public Criteria andIRecverLineIdBetween(Integer value1, Integer value2) {
            addCriterion("I_RECVER_LINE_ID between", value1, value2, "iRecverLineId");
            return (Criteria) this;
        }

        public Criteria andIRecverLineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("I_RECVER_LINE_ID not between", value1, value2, "iRecverLineId");
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