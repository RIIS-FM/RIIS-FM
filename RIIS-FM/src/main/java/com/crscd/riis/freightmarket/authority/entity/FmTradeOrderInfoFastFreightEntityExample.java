package com.crscd.riis.freightmarket.authority.entity;

import java.util.ArrayList;
import java.util.List;

public class FmTradeOrderInfoFastFreightEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmTradeOrderInfoFastFreightEntityExample() {
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

        public Criteria andFGoodsWeightIsNull() {
            addCriterion("F_GOODS_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andFGoodsWeightIsNotNull() {
            addCriterion("F_GOODS_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andFGoodsWeightEqualTo(Float value) {
            addCriterion("F_GOODS_WEIGHT =", value, "fGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andFGoodsWeightNotEqualTo(Float value) {
            addCriterion("F_GOODS_WEIGHT <>", value, "fGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andFGoodsWeightGreaterThan(Float value) {
            addCriterion("F_GOODS_WEIGHT >", value, "fGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andFGoodsWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("F_GOODS_WEIGHT >=", value, "fGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andFGoodsWeightLessThan(Float value) {
            addCriterion("F_GOODS_WEIGHT <", value, "fGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andFGoodsWeightLessThanOrEqualTo(Float value) {
            addCriterion("F_GOODS_WEIGHT <=", value, "fGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andFGoodsWeightIn(List<Float> values) {
            addCriterion("F_GOODS_WEIGHT in", values, "fGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andFGoodsWeightNotIn(List<Float> values) {
            addCriterion("F_GOODS_WEIGHT not in", values, "fGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andFGoodsWeightBetween(Float value1, Float value2) {
            addCriterion("F_GOODS_WEIGHT between", value1, value2, "fGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andFGoodsWeightNotBetween(Float value1, Float value2) {
            addCriterion("F_GOODS_WEIGHT not between", value1, value2, "fGoodsWeight");
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

        public Criteria andCGoodsWrapperIsNull() {
            addCriterion("C_GOODS_WRAPPER is null");
            return (Criteria) this;
        }

        public Criteria andCGoodsWrapperIsNotNull() {
            addCriterion("C_GOODS_WRAPPER is not null");
            return (Criteria) this;
        }

        public Criteria andCGoodsWrapperEqualTo(String value) {
            addCriterion("C_GOODS_WRAPPER =", value, "cGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andCGoodsWrapperNotEqualTo(String value) {
            addCriterion("C_GOODS_WRAPPER <>", value, "cGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andCGoodsWrapperGreaterThan(String value) {
            addCriterion("C_GOODS_WRAPPER >", value, "cGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andCGoodsWrapperGreaterThanOrEqualTo(String value) {
            addCriterion("C_GOODS_WRAPPER >=", value, "cGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andCGoodsWrapperLessThan(String value) {
            addCriterion("C_GOODS_WRAPPER <", value, "cGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andCGoodsWrapperLessThanOrEqualTo(String value) {
            addCriterion("C_GOODS_WRAPPER <=", value, "cGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andCGoodsWrapperLike(String value) {
            addCriterion("C_GOODS_WRAPPER like", value, "cGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andCGoodsWrapperNotLike(String value) {
            addCriterion("C_GOODS_WRAPPER not like", value, "cGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andCGoodsWrapperIn(List<String> values) {
            addCriterion("C_GOODS_WRAPPER in", values, "cGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andCGoodsWrapperNotIn(List<String> values) {
            addCriterion("C_GOODS_WRAPPER not in", values, "cGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andCGoodsWrapperBetween(String value1, String value2) {
            addCriterion("C_GOODS_WRAPPER between", value1, value2, "cGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andCGoodsWrapperNotBetween(String value1, String value2) {
            addCriterion("C_GOODS_WRAPPER not between", value1, value2, "cGoodsWrapper");
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

        public Criteria andCTrainNumIsNull() {
            addCriterion("C_TRAIN_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCTrainNumIsNotNull() {
            addCriterion("C_TRAIN_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCTrainNumEqualTo(String value) {
            addCriterion("C_TRAIN_NUM =", value, "cTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTrainNumNotEqualTo(String value) {
            addCriterion("C_TRAIN_NUM <>", value, "cTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTrainNumGreaterThan(String value) {
            addCriterion("C_TRAIN_NUM >", value, "cTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTrainNumGreaterThanOrEqualTo(String value) {
            addCriterion("C_TRAIN_NUM >=", value, "cTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTrainNumLessThan(String value) {
            addCriterion("C_TRAIN_NUM <", value, "cTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTrainNumLessThanOrEqualTo(String value) {
            addCriterion("C_TRAIN_NUM <=", value, "cTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTrainNumLike(String value) {
            addCriterion("C_TRAIN_NUM like", value, "cTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTrainNumNotLike(String value) {
            addCriterion("C_TRAIN_NUM not like", value, "cTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTrainNumIn(List<String> values) {
            addCriterion("C_TRAIN_NUM in", values, "cTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTrainNumNotIn(List<String> values) {
            addCriterion("C_TRAIN_NUM not in", values, "cTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTrainNumBetween(String value1, String value2) {
            addCriterion("C_TRAIN_NUM between", value1, value2, "cTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTrainNumNotBetween(String value1, String value2) {
            addCriterion("C_TRAIN_NUM not between", value1, value2, "cTrainNum");
            return (Criteria) this;
        }

        public Criteria andIGoodsNumberIsNull() {
            addCriterion("I_GOODS_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andIGoodsNumberIsNotNull() {
            addCriterion("I_GOODS_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andIGoodsNumberEqualTo(Integer value) {
            addCriterion("I_GOODS_NUMBER =", value, "iGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsNumberNotEqualTo(Integer value) {
            addCriterion("I_GOODS_NUMBER <>", value, "iGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsNumberGreaterThan(Integer value) {
            addCriterion("I_GOODS_NUMBER >", value, "iGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_GOODS_NUMBER >=", value, "iGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsNumberLessThan(Integer value) {
            addCriterion("I_GOODS_NUMBER <", value, "iGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("I_GOODS_NUMBER <=", value, "iGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsNumberIn(List<Integer> values) {
            addCriterion("I_GOODS_NUMBER in", values, "iGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsNumberNotIn(List<Integer> values) {
            addCriterion("I_GOODS_NUMBER not in", values, "iGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsNumberBetween(Integer value1, Integer value2) {
            addCriterion("I_GOODS_NUMBER between", value1, value2, "iGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andIGoodsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("I_GOODS_NUMBER not between", value1, value2, "iGoodsNumber");
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