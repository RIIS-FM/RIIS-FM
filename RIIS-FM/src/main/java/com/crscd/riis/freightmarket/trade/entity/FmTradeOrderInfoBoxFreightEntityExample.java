package com.crscd.riis.freightmarket.trade.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FmTradeOrderInfoBoxFreightEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmTradeOrderInfoBoxFreightEntityExample() {
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

        public Criteria andIBoxGetTypeIsNull() {
            addCriterion("I_BOX_GET_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIBoxGetTypeIsNotNull() {
            addCriterion("I_BOX_GET_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIBoxGetTypeEqualTo(Integer value) {
            addCriterion("I_BOX_GET_TYPE =", value, "iBoxGetType");
            return (Criteria) this;
        }

        public Criteria andIBoxGetTypeNotEqualTo(Integer value) {
            addCriterion("I_BOX_GET_TYPE <>", value, "iBoxGetType");
            return (Criteria) this;
        }

        public Criteria andIBoxGetTypeGreaterThan(Integer value) {
            addCriterion("I_BOX_GET_TYPE >", value, "iBoxGetType");
            return (Criteria) this;
        }

        public Criteria andIBoxGetTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_BOX_GET_TYPE >=", value, "iBoxGetType");
            return (Criteria) this;
        }

        public Criteria andIBoxGetTypeLessThan(Integer value) {
            addCriterion("I_BOX_GET_TYPE <", value, "iBoxGetType");
            return (Criteria) this;
        }

        public Criteria andIBoxGetTypeLessThanOrEqualTo(Integer value) {
            addCriterion("I_BOX_GET_TYPE <=", value, "iBoxGetType");
            return (Criteria) this;
        }

        public Criteria andIBoxGetTypeIn(List<Integer> values) {
            addCriterion("I_BOX_GET_TYPE in", values, "iBoxGetType");
            return (Criteria) this;
        }

        public Criteria andIBoxGetTypeNotIn(List<Integer> values) {
            addCriterion("I_BOX_GET_TYPE not in", values, "iBoxGetType");
            return (Criteria) this;
        }

        public Criteria andIBoxGetTypeBetween(Integer value1, Integer value2) {
            addCriterion("I_BOX_GET_TYPE between", value1, value2, "iBoxGetType");
            return (Criteria) this;
        }

        public Criteria andIBoxGetTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("I_BOX_GET_TYPE not between", value1, value2, "iBoxGetType");
            return (Criteria) this;
        }

        public Criteria andIBoxNumberIsNull() {
            addCriterion("I_BOX_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andIBoxNumberIsNotNull() {
            addCriterion("I_BOX_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andIBoxNumberEqualTo(Integer value) {
            addCriterion("I_BOX_NUMBER =", value, "iBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIBoxNumberNotEqualTo(Integer value) {
            addCriterion("I_BOX_NUMBER <>", value, "iBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIBoxNumberGreaterThan(Integer value) {
            addCriterion("I_BOX_NUMBER >", value, "iBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIBoxNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_BOX_NUMBER >=", value, "iBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIBoxNumberLessThan(Integer value) {
            addCriterion("I_BOX_NUMBER <", value, "iBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIBoxNumberLessThanOrEqualTo(Integer value) {
            addCriterion("I_BOX_NUMBER <=", value, "iBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIBoxNumberIn(List<Integer> values) {
            addCriterion("I_BOX_NUMBER in", values, "iBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIBoxNumberNotIn(List<Integer> values) {
            addCriterion("I_BOX_NUMBER not in", values, "iBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIBoxNumberBetween(Integer value1, Integer value2) {
            addCriterion("I_BOX_NUMBER between", value1, value2, "iBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIBoxNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("I_BOX_NUMBER not between", value1, value2, "iBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIBoxTypeIsNull() {
            addCriterion("I_BOX_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIBoxTypeIsNotNull() {
            addCriterion("I_BOX_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIBoxTypeEqualTo(Integer value) {
            addCriterion("I_BOX_TYPE =", value, "iBoxType");
            return (Criteria) this;
        }

        public Criteria andIBoxTypeNotEqualTo(Integer value) {
            addCriterion("I_BOX_TYPE <>", value, "iBoxType");
            return (Criteria) this;
        }

        public Criteria andIBoxTypeGreaterThan(Integer value) {
            addCriterion("I_BOX_TYPE >", value, "iBoxType");
            return (Criteria) this;
        }

        public Criteria andIBoxTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_BOX_TYPE >=", value, "iBoxType");
            return (Criteria) this;
        }

        public Criteria andIBoxTypeLessThan(Integer value) {
            addCriterion("I_BOX_TYPE <", value, "iBoxType");
            return (Criteria) this;
        }

        public Criteria andIBoxTypeLessThanOrEqualTo(Integer value) {
            addCriterion("I_BOX_TYPE <=", value, "iBoxType");
            return (Criteria) this;
        }

        public Criteria andIBoxTypeIn(List<Integer> values) {
            addCriterion("I_BOX_TYPE in", values, "iBoxType");
            return (Criteria) this;
        }

        public Criteria andIBoxTypeNotIn(List<Integer> values) {
            addCriterion("I_BOX_TYPE not in", values, "iBoxType");
            return (Criteria) this;
        }

        public Criteria andIBoxTypeBetween(Integer value1, Integer value2) {
            addCriterion("I_BOX_TYPE between", value1, value2, "iBoxType");
            return (Criteria) this;
        }

        public Criteria andIBoxTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("I_BOX_TYPE not between", value1, value2, "iBoxType");
            return (Criteria) this;
        }

        public Criteria andIBoxNumIsNull() {
            addCriterion("I_BOX_NUM is null");
            return (Criteria) this;
        }

        public Criteria andIBoxNumIsNotNull() {
            addCriterion("I_BOX_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andIBoxNumEqualTo(Integer value) {
            addCriterion("I_BOX_NUM =", value, "iBoxNum");
            return (Criteria) this;
        }

        public Criteria andIBoxNumNotEqualTo(Integer value) {
            addCriterion("I_BOX_NUM <>", value, "iBoxNum");
            return (Criteria) this;
        }

        public Criteria andIBoxNumGreaterThan(Integer value) {
            addCriterion("I_BOX_NUM >", value, "iBoxNum");
            return (Criteria) this;
        }

        public Criteria andIBoxNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_BOX_NUM >=", value, "iBoxNum");
            return (Criteria) this;
        }

        public Criteria andIBoxNumLessThan(Integer value) {
            addCriterion("I_BOX_NUM <", value, "iBoxNum");
            return (Criteria) this;
        }

        public Criteria andIBoxNumLessThanOrEqualTo(Integer value) {
            addCriterion("I_BOX_NUM <=", value, "iBoxNum");
            return (Criteria) this;
        }

        public Criteria andIBoxNumIn(List<Integer> values) {
            addCriterion("I_BOX_NUM in", values, "iBoxNum");
            return (Criteria) this;
        }

        public Criteria andIBoxNumNotIn(List<Integer> values) {
            addCriterion("I_BOX_NUM not in", values, "iBoxNum");
            return (Criteria) this;
        }

        public Criteria andIBoxNumBetween(Integer value1, Integer value2) {
            addCriterion("I_BOX_NUM between", value1, value2, "iBoxNum");
            return (Criteria) this;
        }

        public Criteria andIBoxNumNotBetween(Integer value1, Integer value2) {
            addCriterion("I_BOX_NUM not between", value1, value2, "iBoxNum");
            return (Criteria) this;
        }

        public Criteria andIBoxSealNumIsNull() {
            addCriterion("I_BOX_SEAL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andIBoxSealNumIsNotNull() {
            addCriterion("I_BOX_SEAL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andIBoxSealNumEqualTo(Integer value) {
            addCriterion("I_BOX_SEAL_NUM =", value, "iBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIBoxSealNumNotEqualTo(Integer value) {
            addCriterion("I_BOX_SEAL_NUM <>", value, "iBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIBoxSealNumGreaterThan(Integer value) {
            addCriterion("I_BOX_SEAL_NUM >", value, "iBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIBoxSealNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_BOX_SEAL_NUM >=", value, "iBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIBoxSealNumLessThan(Integer value) {
            addCriterion("I_BOX_SEAL_NUM <", value, "iBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIBoxSealNumLessThanOrEqualTo(Integer value) {
            addCriterion("I_BOX_SEAL_NUM <=", value, "iBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIBoxSealNumIn(List<Integer> values) {
            addCriterion("I_BOX_SEAL_NUM in", values, "iBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIBoxSealNumNotIn(List<Integer> values) {
            addCriterion("I_BOX_SEAL_NUM not in", values, "iBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIBoxSealNumBetween(Integer value1, Integer value2) {
            addCriterion("I_BOX_SEAL_NUM between", value1, value2, "iBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIBoxSealNumNotBetween(Integer value1, Integer value2) {
            addCriterion("I_BOX_SEAL_NUM not between", value1, value2, "iBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andDBoxRecverTimeIsNull() {
            addCriterion("D_BOX_RECVER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDBoxRecverTimeIsNotNull() {
            addCriterion("D_BOX_RECVER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDBoxRecverTimeEqualTo(Date value) {
            addCriterion("D_BOX_RECVER_TIME =", value, "dBoxRecverTime");
            return (Criteria) this;
        }

        public Criteria andDBoxRecverTimeNotEqualTo(Date value) {
            addCriterion("D_BOX_RECVER_TIME <>", value, "dBoxRecverTime");
            return (Criteria) this;
        }

        public Criteria andDBoxRecverTimeGreaterThan(Date value) {
            addCriterion("D_BOX_RECVER_TIME >", value, "dBoxRecverTime");
            return (Criteria) this;
        }

        public Criteria andDBoxRecverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_BOX_RECVER_TIME >=", value, "dBoxRecverTime");
            return (Criteria) this;
        }

        public Criteria andDBoxRecverTimeLessThan(Date value) {
            addCriterion("D_BOX_RECVER_TIME <", value, "dBoxRecverTime");
            return (Criteria) this;
        }

        public Criteria andDBoxRecverTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_BOX_RECVER_TIME <=", value, "dBoxRecverTime");
            return (Criteria) this;
        }

        public Criteria andDBoxRecverTimeIn(List<Date> values) {
            addCriterion("D_BOX_RECVER_TIME in", values, "dBoxRecverTime");
            return (Criteria) this;
        }

        public Criteria andDBoxRecverTimeNotIn(List<Date> values) {
            addCriterion("D_BOX_RECVER_TIME not in", values, "dBoxRecverTime");
            return (Criteria) this;
        }

        public Criteria andDBoxRecverTimeBetween(Date value1, Date value2) {
            addCriterion("D_BOX_RECVER_TIME between", value1, value2, "dBoxRecverTime");
            return (Criteria) this;
        }

        public Criteria andDBoxRecverTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_BOX_RECVER_TIME not between", value1, value2, "dBoxRecverTime");
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

        public Criteria andCSenderBoxStationIsNull() {
            addCriterion("C_SENDER_BOX_STATION is null");
            return (Criteria) this;
        }

        public Criteria andCSenderBoxStationIsNotNull() {
            addCriterion("C_SENDER_BOX_STATION is not null");
            return (Criteria) this;
        }

        public Criteria andCSenderBoxStationEqualTo(String value) {
            addCriterion("C_SENDER_BOX_STATION =", value, "cSenderBoxStation");
            return (Criteria) this;
        }

        public Criteria andCSenderBoxStationNotEqualTo(String value) {
            addCriterion("C_SENDER_BOX_STATION <>", value, "cSenderBoxStation");
            return (Criteria) this;
        }

        public Criteria andCSenderBoxStationGreaterThan(String value) {
            addCriterion("C_SENDER_BOX_STATION >", value, "cSenderBoxStation");
            return (Criteria) this;
        }

        public Criteria andCSenderBoxStationGreaterThanOrEqualTo(String value) {
            addCriterion("C_SENDER_BOX_STATION >=", value, "cSenderBoxStation");
            return (Criteria) this;
        }

        public Criteria andCSenderBoxStationLessThan(String value) {
            addCriterion("C_SENDER_BOX_STATION <", value, "cSenderBoxStation");
            return (Criteria) this;
        }

        public Criteria andCSenderBoxStationLessThanOrEqualTo(String value) {
            addCriterion("C_SENDER_BOX_STATION <=", value, "cSenderBoxStation");
            return (Criteria) this;
        }

        public Criteria andCSenderBoxStationLike(String value) {
            addCriterion("C_SENDER_BOX_STATION like", value, "cSenderBoxStation");
            return (Criteria) this;
        }

        public Criteria andCSenderBoxStationNotLike(String value) {
            addCriterion("C_SENDER_BOX_STATION not like", value, "cSenderBoxStation");
            return (Criteria) this;
        }

        public Criteria andCSenderBoxStationIn(List<String> values) {
            addCriterion("C_SENDER_BOX_STATION in", values, "cSenderBoxStation");
            return (Criteria) this;
        }

        public Criteria andCSenderBoxStationNotIn(List<String> values) {
            addCriterion("C_SENDER_BOX_STATION not in", values, "cSenderBoxStation");
            return (Criteria) this;
        }

        public Criteria andCSenderBoxStationBetween(String value1, String value2) {
            addCriterion("C_SENDER_BOX_STATION between", value1, value2, "cSenderBoxStation");
            return (Criteria) this;
        }

        public Criteria andCSenderBoxStationNotBetween(String value1, String value2) {
            addCriterion("C_SENDER_BOX_STATION not between", value1, value2, "cSenderBoxStation");
            return (Criteria) this;
        }

        public Criteria andIFullboxInStationIsNull() {
            addCriterion("I_FULLBOX_IN_STATION is null");
            return (Criteria) this;
        }

        public Criteria andIFullboxInStationIsNotNull() {
            addCriterion("I_FULLBOX_IN_STATION is not null");
            return (Criteria) this;
        }

        public Criteria andIFullboxInStationEqualTo(Integer value) {
            addCriterion("I_FULLBOX_IN_STATION =", value, "iFullboxInStation");
            return (Criteria) this;
        }

        public Criteria andIFullboxInStationNotEqualTo(Integer value) {
            addCriterion("I_FULLBOX_IN_STATION <>", value, "iFullboxInStation");
            return (Criteria) this;
        }

        public Criteria andIFullboxInStationGreaterThan(Integer value) {
            addCriterion("I_FULLBOX_IN_STATION >", value, "iFullboxInStation");
            return (Criteria) this;
        }

        public Criteria andIFullboxInStationGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_FULLBOX_IN_STATION >=", value, "iFullboxInStation");
            return (Criteria) this;
        }

        public Criteria andIFullboxInStationLessThan(Integer value) {
            addCriterion("I_FULLBOX_IN_STATION <", value, "iFullboxInStation");
            return (Criteria) this;
        }

        public Criteria andIFullboxInStationLessThanOrEqualTo(Integer value) {
            addCriterion("I_FULLBOX_IN_STATION <=", value, "iFullboxInStation");
            return (Criteria) this;
        }

        public Criteria andIFullboxInStationIn(List<Integer> values) {
            addCriterion("I_FULLBOX_IN_STATION in", values, "iFullboxInStation");
            return (Criteria) this;
        }

        public Criteria andIFullboxInStationNotIn(List<Integer> values) {
            addCriterion("I_FULLBOX_IN_STATION not in", values, "iFullboxInStation");
            return (Criteria) this;
        }

        public Criteria andIFullboxInStationBetween(Integer value1, Integer value2) {
            addCriterion("I_FULLBOX_IN_STATION between", value1, value2, "iFullboxInStation");
            return (Criteria) this;
        }

        public Criteria andIFullboxInStationNotBetween(Integer value1, Integer value2) {
            addCriterion("I_FULLBOX_IN_STATION not between", value1, value2, "iFullboxInStation");
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