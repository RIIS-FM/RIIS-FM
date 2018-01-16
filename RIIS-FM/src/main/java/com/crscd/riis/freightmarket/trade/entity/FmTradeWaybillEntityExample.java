package com.crscd.riis.freightmarket.trade.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FmTradeWaybillEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmTradeWaybillEntityExample() {
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

        public Criteria andIOrderTypeIdIsNull() {
            addCriterion("I_ORDER_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeIdIsNotNull() {
            addCriterion("I_ORDER_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeIdEqualTo(Integer value) {
            addCriterion("I_ORDER_TYPE_ID =", value, "iOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeIdNotEqualTo(Integer value) {
            addCriterion("I_ORDER_TYPE_ID <>", value, "iOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeIdGreaterThan(Integer value) {
            addCriterion("I_ORDER_TYPE_ID >", value, "iOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_ORDER_TYPE_ID >=", value, "iOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeIdLessThan(Integer value) {
            addCriterion("I_ORDER_TYPE_ID <", value, "iOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("I_ORDER_TYPE_ID <=", value, "iOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeIdIn(List<Integer> values) {
            addCriterion("I_ORDER_TYPE_ID in", values, "iOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeIdNotIn(List<Integer> values) {
            addCriterion("I_ORDER_TYPE_ID not in", values, "iOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("I_ORDER_TYPE_ID between", value1, value2, "iOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("I_ORDER_TYPE_ID not between", value1, value2, "iOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeNumIsNull() {
            addCriterion("I_ORDER_TYPE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeNumIsNotNull() {
            addCriterion("I_ORDER_TYPE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeNumEqualTo(Integer value) {
            addCriterion("I_ORDER_TYPE_NUM =", value, "iOrderTypeNum");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeNumNotEqualTo(Integer value) {
            addCriterion("I_ORDER_TYPE_NUM <>", value, "iOrderTypeNum");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeNumGreaterThan(Integer value) {
            addCriterion("I_ORDER_TYPE_NUM >", value, "iOrderTypeNum");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_ORDER_TYPE_NUM >=", value, "iOrderTypeNum");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeNumLessThan(Integer value) {
            addCriterion("I_ORDER_TYPE_NUM <", value, "iOrderTypeNum");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeNumLessThanOrEqualTo(Integer value) {
            addCriterion("I_ORDER_TYPE_NUM <=", value, "iOrderTypeNum");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeNumIn(List<Integer> values) {
            addCriterion("I_ORDER_TYPE_NUM in", values, "iOrderTypeNum");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeNumNotIn(List<Integer> values) {
            addCriterion("I_ORDER_TYPE_NUM not in", values, "iOrderTypeNum");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeNumBetween(Integer value1, Integer value2) {
            addCriterion("I_ORDER_TYPE_NUM between", value1, value2, "iOrderTypeNum");
            return (Criteria) this;
        }

        public Criteria andIOrderTypeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("I_ORDER_TYPE_NUM not between", value1, value2, "iOrderTypeNum");
            return (Criteria) this;
        }

        public Criteria andCWaybillCodeIsNull() {
            addCriterion("C_WAYBILL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCWaybillCodeIsNotNull() {
            addCriterion("C_WAYBILL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCWaybillCodeEqualTo(String value) {
            addCriterion("C_WAYBILL_CODE =", value, "cWaybillCode");
            return (Criteria) this;
        }

        public Criteria andCWaybillCodeNotEqualTo(String value) {
            addCriterion("C_WAYBILL_CODE <>", value, "cWaybillCode");
            return (Criteria) this;
        }

        public Criteria andCWaybillCodeGreaterThan(String value) {
            addCriterion("C_WAYBILL_CODE >", value, "cWaybillCode");
            return (Criteria) this;
        }

        public Criteria andCWaybillCodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_WAYBILL_CODE >=", value, "cWaybillCode");
            return (Criteria) this;
        }

        public Criteria andCWaybillCodeLessThan(String value) {
            addCriterion("C_WAYBILL_CODE <", value, "cWaybillCode");
            return (Criteria) this;
        }

        public Criteria andCWaybillCodeLessThanOrEqualTo(String value) {
            addCriterion("C_WAYBILL_CODE <=", value, "cWaybillCode");
            return (Criteria) this;
        }

        public Criteria andCWaybillCodeLike(String value) {
            addCriterion("C_WAYBILL_CODE like", value, "cWaybillCode");
            return (Criteria) this;
        }

        public Criteria andCWaybillCodeNotLike(String value) {
            addCriterion("C_WAYBILL_CODE not like", value, "cWaybillCode");
            return (Criteria) this;
        }

        public Criteria andCWaybillCodeIn(List<String> values) {
            addCriterion("C_WAYBILL_CODE in", values, "cWaybillCode");
            return (Criteria) this;
        }

        public Criteria andCWaybillCodeNotIn(List<String> values) {
            addCriterion("C_WAYBILL_CODE not in", values, "cWaybillCode");
            return (Criteria) this;
        }

        public Criteria andCWaybillCodeBetween(String value1, String value2) {
            addCriterion("C_WAYBILL_CODE between", value1, value2, "cWaybillCode");
            return (Criteria) this;
        }

        public Criteria andCWaybillCodeNotBetween(String value1, String value2) {
            addCriterion("C_WAYBILL_CODE not between", value1, value2, "cWaybillCode");
            return (Criteria) this;
        }

        public Criteria andDWaybillCreateTimeIsNull() {
            addCriterion("D_WAYBILL_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDWaybillCreateTimeIsNotNull() {
            addCriterion("D_WAYBILL_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDWaybillCreateTimeEqualTo(Date value) {
            addCriterion("D_WAYBILL_CREATE_TIME =", value, "dWaybillCreateTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillCreateTimeNotEqualTo(Date value) {
            addCriterion("D_WAYBILL_CREATE_TIME <>", value, "dWaybillCreateTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillCreateTimeGreaterThan(Date value) {
            addCriterion("D_WAYBILL_CREATE_TIME >", value, "dWaybillCreateTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_WAYBILL_CREATE_TIME >=", value, "dWaybillCreateTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillCreateTimeLessThan(Date value) {
            addCriterion("D_WAYBILL_CREATE_TIME <", value, "dWaybillCreateTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_WAYBILL_CREATE_TIME <=", value, "dWaybillCreateTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillCreateTimeIn(List<Date> values) {
            addCriterion("D_WAYBILL_CREATE_TIME in", values, "dWaybillCreateTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillCreateTimeNotIn(List<Date> values) {
            addCriterion("D_WAYBILL_CREATE_TIME not in", values, "dWaybillCreateTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillCreateTimeBetween(Date value1, Date value2) {
            addCriterion("D_WAYBILL_CREATE_TIME between", value1, value2, "dWaybillCreateTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_WAYBILL_CREATE_TIME not between", value1, value2, "dWaybillCreateTime");
            return (Criteria) this;
        }

        public Criteria andIWaybillStateIsNull() {
            addCriterion("I_WAYBILL_STATE is null");
            return (Criteria) this;
        }

        public Criteria andIWaybillStateIsNotNull() {
            addCriterion("I_WAYBILL_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andIWaybillStateEqualTo(Integer value) {
            addCriterion("I_WAYBILL_STATE =", value, "iWaybillState");
            return (Criteria) this;
        }

        public Criteria andIWaybillStateNotEqualTo(Integer value) {
            addCriterion("I_WAYBILL_STATE <>", value, "iWaybillState");
            return (Criteria) this;
        }

        public Criteria andIWaybillStateGreaterThan(Integer value) {
            addCriterion("I_WAYBILL_STATE >", value, "iWaybillState");
            return (Criteria) this;
        }

        public Criteria andIWaybillStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_STATE >=", value, "iWaybillState");
            return (Criteria) this;
        }

        public Criteria andIWaybillStateLessThan(Integer value) {
            addCriterion("I_WAYBILL_STATE <", value, "iWaybillState");
            return (Criteria) this;
        }

        public Criteria andIWaybillStateLessThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_STATE <=", value, "iWaybillState");
            return (Criteria) this;
        }

        public Criteria andIWaybillStateIn(List<Integer> values) {
            addCriterion("I_WAYBILL_STATE in", values, "iWaybillState");
            return (Criteria) this;
        }

        public Criteria andIWaybillStateNotIn(List<Integer> values) {
            addCriterion("I_WAYBILL_STATE not in", values, "iWaybillState");
            return (Criteria) this;
        }

        public Criteria andIWaybillStateBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_STATE between", value1, value2, "iWaybillState");
            return (Criteria) this;
        }

        public Criteria andIWaybillStateNotBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_STATE not between", value1, value2, "iWaybillState");
            return (Criteria) this;
        }

        public Criteria andDWaybillTimeIsNull() {
            addCriterion("D_WAYBILL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDWaybillTimeIsNotNull() {
            addCriterion("D_WAYBILL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDWaybillTimeEqualTo(Date value) {
            addCriterion("D_WAYBILL_TIME =", value, "dWaybillTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillTimeNotEqualTo(Date value) {
            addCriterion("D_WAYBILL_TIME <>", value, "dWaybillTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillTimeGreaterThan(Date value) {
            addCriterion("D_WAYBILL_TIME >", value, "dWaybillTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_WAYBILL_TIME >=", value, "dWaybillTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillTimeLessThan(Date value) {
            addCriterion("D_WAYBILL_TIME <", value, "dWaybillTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_WAYBILL_TIME <=", value, "dWaybillTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillTimeIn(List<Date> values) {
            addCriterion("D_WAYBILL_TIME in", values, "dWaybillTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillTimeNotIn(List<Date> values) {
            addCriterion("D_WAYBILL_TIME not in", values, "dWaybillTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillTimeBetween(Date value1, Date value2) {
            addCriterion("D_WAYBILL_TIME between", value1, value2, "dWaybillTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_WAYBILL_TIME not between", value1, value2, "dWaybillTime");
            return (Criteria) this;
        }

        public Criteria andIWaybillDatelineIsNull() {
            addCriterion("I_WAYBILL_DATELINE is null");
            return (Criteria) this;
        }

        public Criteria andIWaybillDatelineIsNotNull() {
            addCriterion("I_WAYBILL_DATELINE is not null");
            return (Criteria) this;
        }

        public Criteria andIWaybillDatelineEqualTo(Integer value) {
            addCriterion("I_WAYBILL_DATELINE =", value, "iWaybillDateline");
            return (Criteria) this;
        }

        public Criteria andIWaybillDatelineNotEqualTo(Integer value) {
            addCriterion("I_WAYBILL_DATELINE <>", value, "iWaybillDateline");
            return (Criteria) this;
        }

        public Criteria andIWaybillDatelineGreaterThan(Integer value) {
            addCriterion("I_WAYBILL_DATELINE >", value, "iWaybillDateline");
            return (Criteria) this;
        }

        public Criteria andIWaybillDatelineGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_DATELINE >=", value, "iWaybillDateline");
            return (Criteria) this;
        }

        public Criteria andIWaybillDatelineLessThan(Integer value) {
            addCriterion("I_WAYBILL_DATELINE <", value, "iWaybillDateline");
            return (Criteria) this;
        }

        public Criteria andIWaybillDatelineLessThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_DATELINE <=", value, "iWaybillDateline");
            return (Criteria) this;
        }

        public Criteria andIWaybillDatelineIn(List<Integer> values) {
            addCriterion("I_WAYBILL_DATELINE in", values, "iWaybillDateline");
            return (Criteria) this;
        }

        public Criteria andIWaybillDatelineNotIn(List<Integer> values) {
            addCriterion("I_WAYBILL_DATELINE not in", values, "iWaybillDateline");
            return (Criteria) this;
        }

        public Criteria andIWaybillDatelineBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_DATELINE between", value1, value2, "iWaybillDateline");
            return (Criteria) this;
        }

        public Criteria andIWaybillDatelineNotBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_DATELINE not between", value1, value2, "iWaybillDateline");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictArriveTimeIsNull() {
            addCriterion("D_WAYBILL_PREDICT_ARRIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictArriveTimeIsNotNull() {
            addCriterion("D_WAYBILL_PREDICT_ARRIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictArriveTimeEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_ARRIVE_TIME =", value, "dWaybillPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictArriveTimeNotEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_ARRIVE_TIME <>", value, "dWaybillPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictArriveTimeGreaterThan(Date value) {
            addCriterion("D_WAYBILL_PREDICT_ARRIVE_TIME >", value, "dWaybillPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictArriveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_ARRIVE_TIME >=", value, "dWaybillPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictArriveTimeLessThan(Date value) {
            addCriterion("D_WAYBILL_PREDICT_ARRIVE_TIME <", value, "dWaybillPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictArriveTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_ARRIVE_TIME <=", value, "dWaybillPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictArriveTimeIn(List<Date> values) {
            addCriterion("D_WAYBILL_PREDICT_ARRIVE_TIME in", values, "dWaybillPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictArriveTimeNotIn(List<Date> values) {
            addCriterion("D_WAYBILL_PREDICT_ARRIVE_TIME not in", values, "dWaybillPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictArriveTimeBetween(Date value1, Date value2) {
            addCriterion("D_WAYBILL_PREDICT_ARRIVE_TIME between", value1, value2, "dWaybillPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictArriveTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_WAYBILL_PREDICT_ARRIVE_TIME not between", value1, value2, "dWaybillPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadStartTimeIsNull() {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadStartTimeIsNotNull() {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadStartTimeEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_START_TIME =", value, "dWaybillPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadStartTimeNotEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_START_TIME <>", value, "dWaybillPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadStartTimeGreaterThan(Date value) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_START_TIME >", value, "dWaybillPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_START_TIME >=", value, "dWaybillPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadStartTimeLessThan(Date value) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_START_TIME <", value, "dWaybillPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_START_TIME <=", value, "dWaybillPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadStartTimeIn(List<Date> values) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_START_TIME in", values, "dWaybillPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadStartTimeNotIn(List<Date> values) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_START_TIME not in", values, "dWaybillPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadStartTimeBetween(Date value1, Date value2) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_START_TIME between", value1, value2, "dWaybillPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_START_TIME not between", value1, value2, "dWaybillPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadEndTimeIsNull() {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadEndTimeIsNotNull() {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadEndTimeEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_END_TIME =", value, "dWaybillPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadEndTimeNotEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_END_TIME <>", value, "dWaybillPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadEndTimeGreaterThan(Date value) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_END_TIME >", value, "dWaybillPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_END_TIME >=", value, "dWaybillPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadEndTimeLessThan(Date value) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_END_TIME <", value, "dWaybillPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_END_TIME <=", value, "dWaybillPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadEndTimeIn(List<Date> values) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_END_TIME in", values, "dWaybillPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadEndTimeNotIn(List<Date> values) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_END_TIME not in", values, "dWaybillPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadEndTimeBetween(Date value1, Date value2) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_END_TIME between", value1, value2, "dWaybillPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictUnloadEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_WAYBILL_PREDICT_UNLOAD_END_TIME not between", value1, value2, "dWaybillPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictSenderTimeIsNull() {
            addCriterion("D_WAYBILL_PREDICT_SENDER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictSenderTimeIsNotNull() {
            addCriterion("D_WAYBILL_PREDICT_SENDER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictSenderTimeEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_SENDER_TIME =", value, "dWaybillPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictSenderTimeNotEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_SENDER_TIME <>", value, "dWaybillPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictSenderTimeGreaterThan(Date value) {
            addCriterion("D_WAYBILL_PREDICT_SENDER_TIME >", value, "dWaybillPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictSenderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_SENDER_TIME >=", value, "dWaybillPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictSenderTimeLessThan(Date value) {
            addCriterion("D_WAYBILL_PREDICT_SENDER_TIME <", value, "dWaybillPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictSenderTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_SENDER_TIME <=", value, "dWaybillPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictSenderTimeIn(List<Date> values) {
            addCriterion("D_WAYBILL_PREDICT_SENDER_TIME in", values, "dWaybillPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictSenderTimeNotIn(List<Date> values) {
            addCriterion("D_WAYBILL_PREDICT_SENDER_TIME not in", values, "dWaybillPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictSenderTimeBetween(Date value1, Date value2) {
            addCriterion("D_WAYBILL_PREDICT_SENDER_TIME between", value1, value2, "dWaybillPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictSenderTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_WAYBILL_PREDICT_SENDER_TIME not between", value1, value2, "dWaybillPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadStartTimeIsNull() {
            addCriterion("D_WAYBILL_PREDICT_LOAD_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadStartTimeIsNotNull() {
            addCriterion("D_WAYBILL_PREDICT_LOAD_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadStartTimeEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_START_TIME =", value, "dWaybillPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadStartTimeNotEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_START_TIME <>", value, "dWaybillPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadStartTimeGreaterThan(Date value) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_START_TIME >", value, "dWaybillPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_START_TIME >=", value, "dWaybillPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadStartTimeLessThan(Date value) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_START_TIME <", value, "dWaybillPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_START_TIME <=", value, "dWaybillPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadStartTimeIn(List<Date> values) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_START_TIME in", values, "dWaybillPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadStartTimeNotIn(List<Date> values) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_START_TIME not in", values, "dWaybillPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadStartTimeBetween(Date value1, Date value2) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_START_TIME between", value1, value2, "dWaybillPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_START_TIME not between", value1, value2, "dWaybillPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadEndTimeIsNull() {
            addCriterion("D_WAYBILL_PREDICT_LOAD_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadEndTimeIsNotNull() {
            addCriterion("D_WAYBILL_PREDICT_LOAD_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadEndTimeEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_END_TIME =", value, "dWaybillPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadEndTimeNotEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_END_TIME <>", value, "dWaybillPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadEndTimeGreaterThan(Date value) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_END_TIME >", value, "dWaybillPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_END_TIME >=", value, "dWaybillPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadEndTimeLessThan(Date value) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_END_TIME <", value, "dWaybillPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_END_TIME <=", value, "dWaybillPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadEndTimeIn(List<Date> values) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_END_TIME in", values, "dWaybillPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadEndTimeNotIn(List<Date> values) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_END_TIME not in", values, "dWaybillPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadEndTimeBetween(Date value1, Date value2) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_END_TIME between", value1, value2, "dWaybillPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDWaybillPredictLoadEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_WAYBILL_PREDICT_LOAD_END_TIME not between", value1, value2, "dWaybillPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxSealNumIsNull() {
            addCriterion("I_WAYBILL_BOX_SEAL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxSealNumIsNotNull() {
            addCriterion("I_WAYBILL_BOX_SEAL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxSealNumEqualTo(Integer value) {
            addCriterion("I_WAYBILL_BOX_SEAL_NUM =", value, "iWaybillBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxSealNumNotEqualTo(Integer value) {
            addCriterion("I_WAYBILL_BOX_SEAL_NUM <>", value, "iWaybillBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxSealNumGreaterThan(Integer value) {
            addCriterion("I_WAYBILL_BOX_SEAL_NUM >", value, "iWaybillBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxSealNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_BOX_SEAL_NUM >=", value, "iWaybillBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxSealNumLessThan(Integer value) {
            addCriterion("I_WAYBILL_BOX_SEAL_NUM <", value, "iWaybillBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxSealNumLessThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_BOX_SEAL_NUM <=", value, "iWaybillBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxSealNumIn(List<Integer> values) {
            addCriterion("I_WAYBILL_BOX_SEAL_NUM in", values, "iWaybillBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxSealNumNotIn(List<Integer> values) {
            addCriterion("I_WAYBILL_BOX_SEAL_NUM not in", values, "iWaybillBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxSealNumBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_BOX_SEAL_NUM between", value1, value2, "iWaybillBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxSealNumNotBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_BOX_SEAL_NUM not between", value1, value2, "iWaybillBoxSealNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxTypeIsNull() {
            addCriterion("I_WAYBILL_BOX_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxTypeIsNotNull() {
            addCriterion("I_WAYBILL_BOX_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxTypeEqualTo(Integer value) {
            addCriterion("I_WAYBILL_BOX_TYPE =", value, "iWaybillBoxType");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxTypeNotEqualTo(Integer value) {
            addCriterion("I_WAYBILL_BOX_TYPE <>", value, "iWaybillBoxType");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxTypeGreaterThan(Integer value) {
            addCriterion("I_WAYBILL_BOX_TYPE >", value, "iWaybillBoxType");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_BOX_TYPE >=", value, "iWaybillBoxType");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxTypeLessThan(Integer value) {
            addCriterion("I_WAYBILL_BOX_TYPE <", value, "iWaybillBoxType");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxTypeLessThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_BOX_TYPE <=", value, "iWaybillBoxType");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxTypeIn(List<Integer> values) {
            addCriterion("I_WAYBILL_BOX_TYPE in", values, "iWaybillBoxType");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxTypeNotIn(List<Integer> values) {
            addCriterion("I_WAYBILL_BOX_TYPE not in", values, "iWaybillBoxType");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxTypeBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_BOX_TYPE between", value1, value2, "iWaybillBoxType");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_BOX_TYPE not between", value1, value2, "iWaybillBoxType");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumIsNull() {
            addCriterion("I_WAYBILL_BOX_NUM is null");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumIsNotNull() {
            addCriterion("I_WAYBILL_BOX_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumEqualTo(Integer value) {
            addCriterion("I_WAYBILL_BOX_NUM =", value, "iWaybillBoxNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumNotEqualTo(Integer value) {
            addCriterion("I_WAYBILL_BOX_NUM <>", value, "iWaybillBoxNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumGreaterThan(Integer value) {
            addCriterion("I_WAYBILL_BOX_NUM >", value, "iWaybillBoxNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_BOX_NUM >=", value, "iWaybillBoxNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumLessThan(Integer value) {
            addCriterion("I_WAYBILL_BOX_NUM <", value, "iWaybillBoxNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumLessThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_BOX_NUM <=", value, "iWaybillBoxNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumIn(List<Integer> values) {
            addCriterion("I_WAYBILL_BOX_NUM in", values, "iWaybillBoxNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumNotIn(List<Integer> values) {
            addCriterion("I_WAYBILL_BOX_NUM not in", values, "iWaybillBoxNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_BOX_NUM between", value1, value2, "iWaybillBoxNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumNotBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_BOX_NUM not between", value1, value2, "iWaybillBoxNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsReinforceIsNull() {
            addCriterion("I_WAYBILL_GOODS_REINFORCE is null");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsReinforceIsNotNull() {
            addCriterion("I_WAYBILL_GOODS_REINFORCE is not null");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsReinforceEqualTo(Integer value) {
            addCriterion("I_WAYBILL_GOODS_REINFORCE =", value, "iWaybillGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsReinforceNotEqualTo(Integer value) {
            addCriterion("I_WAYBILL_GOODS_REINFORCE <>", value, "iWaybillGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsReinforceGreaterThan(Integer value) {
            addCriterion("I_WAYBILL_GOODS_REINFORCE >", value, "iWaybillGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsReinforceGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_GOODS_REINFORCE >=", value, "iWaybillGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsReinforceLessThan(Integer value) {
            addCriterion("I_WAYBILL_GOODS_REINFORCE <", value, "iWaybillGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsReinforceLessThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_GOODS_REINFORCE <=", value, "iWaybillGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsReinforceIn(List<Integer> values) {
            addCriterion("I_WAYBILL_GOODS_REINFORCE in", values, "iWaybillGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsReinforceNotIn(List<Integer> values) {
            addCriterion("I_WAYBILL_GOODS_REINFORCE not in", values, "iWaybillGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsReinforceBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_GOODS_REINFORCE between", value1, value2, "iWaybillGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsReinforceNotBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_GOODS_REINFORCE not between", value1, value2, "iWaybillGoodsReinforce");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsWrapperIsNull() {
            addCriterion("I_WAYBILL_GOODS_WRAPPER is null");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsWrapperIsNotNull() {
            addCriterion("I_WAYBILL_GOODS_WRAPPER is not null");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsWrapperEqualTo(Integer value) {
            addCriterion("I_WAYBILL_GOODS_WRAPPER =", value, "iWaybillGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsWrapperNotEqualTo(Integer value) {
            addCriterion("I_WAYBILL_GOODS_WRAPPER <>", value, "iWaybillGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsWrapperGreaterThan(Integer value) {
            addCriterion("I_WAYBILL_GOODS_WRAPPER >", value, "iWaybillGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsWrapperGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_GOODS_WRAPPER >=", value, "iWaybillGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsWrapperLessThan(Integer value) {
            addCriterion("I_WAYBILL_GOODS_WRAPPER <", value, "iWaybillGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsWrapperLessThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_GOODS_WRAPPER <=", value, "iWaybillGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsWrapperIn(List<Integer> values) {
            addCriterion("I_WAYBILL_GOODS_WRAPPER in", values, "iWaybillGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsWrapperNotIn(List<Integer> values) {
            addCriterion("I_WAYBILL_GOODS_WRAPPER not in", values, "iWaybillGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsWrapperBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_GOODS_WRAPPER between", value1, value2, "iWaybillGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsWrapperNotBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_GOODS_WRAPPER not between", value1, value2, "iWaybillGoodsWrapper");
            return (Criteria) this;
        }

        public Criteria andFWaybillCanvasNumberIsNull() {
            addCriterion("F_WAYBILL_CANVAS_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andFWaybillCanvasNumberIsNotNull() {
            addCriterion("F_WAYBILL_CANVAS_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andFWaybillCanvasNumberEqualTo(Float value) {
            addCriterion("F_WAYBILL_CANVAS_NUMBER =", value, "fWaybillCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andFWaybillCanvasNumberNotEqualTo(Float value) {
            addCriterion("F_WAYBILL_CANVAS_NUMBER <>", value, "fWaybillCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andFWaybillCanvasNumberGreaterThan(Float value) {
            addCriterion("F_WAYBILL_CANVAS_NUMBER >", value, "fWaybillCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andFWaybillCanvasNumberGreaterThanOrEqualTo(Float value) {
            addCriterion("F_WAYBILL_CANVAS_NUMBER >=", value, "fWaybillCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andFWaybillCanvasNumberLessThan(Float value) {
            addCriterion("F_WAYBILL_CANVAS_NUMBER <", value, "fWaybillCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andFWaybillCanvasNumberLessThanOrEqualTo(Float value) {
            addCriterion("F_WAYBILL_CANVAS_NUMBER <=", value, "fWaybillCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andFWaybillCanvasNumberIn(List<Float> values) {
            addCriterion("F_WAYBILL_CANVAS_NUMBER in", values, "fWaybillCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andFWaybillCanvasNumberNotIn(List<Float> values) {
            addCriterion("F_WAYBILL_CANVAS_NUMBER not in", values, "fWaybillCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andFWaybillCanvasNumberBetween(Float value1, Float value2) {
            addCriterion("F_WAYBILL_CANVAS_NUMBER between", value1, value2, "fWaybillCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andFWaybillCanvasNumberNotBetween(Float value1, Float value2) {
            addCriterion("F_WAYBILL_CANVAS_NUMBER not between", value1, value2, "fWaybillCanvasNumber");
            return (Criteria) this;
        }

        public Criteria andFWaybillTrainTypeIsNull() {
            addCriterion("F_WAYBILL_TRAIN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFWaybillTrainTypeIsNotNull() {
            addCriterion("F_WAYBILL_TRAIN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFWaybillTrainTypeEqualTo(Float value) {
            addCriterion("F_WAYBILL_TRAIN_TYPE =", value, "fWaybillTrainType");
            return (Criteria) this;
        }

        public Criteria andFWaybillTrainTypeNotEqualTo(Float value) {
            addCriterion("F_WAYBILL_TRAIN_TYPE <>", value, "fWaybillTrainType");
            return (Criteria) this;
        }

        public Criteria andFWaybillTrainTypeGreaterThan(Float value) {
            addCriterion("F_WAYBILL_TRAIN_TYPE >", value, "fWaybillTrainType");
            return (Criteria) this;
        }

        public Criteria andFWaybillTrainTypeGreaterThanOrEqualTo(Float value) {
            addCriterion("F_WAYBILL_TRAIN_TYPE >=", value, "fWaybillTrainType");
            return (Criteria) this;
        }

        public Criteria andFWaybillTrainTypeLessThan(Float value) {
            addCriterion("F_WAYBILL_TRAIN_TYPE <", value, "fWaybillTrainType");
            return (Criteria) this;
        }

        public Criteria andFWaybillTrainTypeLessThanOrEqualTo(Float value) {
            addCriterion("F_WAYBILL_TRAIN_TYPE <=", value, "fWaybillTrainType");
            return (Criteria) this;
        }

        public Criteria andFWaybillTrainTypeIn(List<Float> values) {
            addCriterion("F_WAYBILL_TRAIN_TYPE in", values, "fWaybillTrainType");
            return (Criteria) this;
        }

        public Criteria andFWaybillTrainTypeNotIn(List<Float> values) {
            addCriterion("F_WAYBILL_TRAIN_TYPE not in", values, "fWaybillTrainType");
            return (Criteria) this;
        }

        public Criteria andFWaybillTrainTypeBetween(Float value1, Float value2) {
            addCriterion("F_WAYBILL_TRAIN_TYPE between", value1, value2, "fWaybillTrainType");
            return (Criteria) this;
        }

        public Criteria andFWaybillTrainTypeNotBetween(Float value1, Float value2) {
            addCriterion("F_WAYBILL_TRAIN_TYPE not between", value1, value2, "fWaybillTrainType");
            return (Criteria) this;
        }

        public Criteria andCWaybillTrainNumIsNull() {
            addCriterion("C_WAYBILL_TRAIN_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCWaybillTrainNumIsNotNull() {
            addCriterion("C_WAYBILL_TRAIN_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCWaybillTrainNumEqualTo(String value) {
            addCriterion("C_WAYBILL_TRAIN_NUM =", value, "cWaybillTrainNum");
            return (Criteria) this;
        }

        public Criteria andCWaybillTrainNumNotEqualTo(String value) {
            addCriterion("C_WAYBILL_TRAIN_NUM <>", value, "cWaybillTrainNum");
            return (Criteria) this;
        }

        public Criteria andCWaybillTrainNumGreaterThan(String value) {
            addCriterion("C_WAYBILL_TRAIN_NUM >", value, "cWaybillTrainNum");
            return (Criteria) this;
        }

        public Criteria andCWaybillTrainNumGreaterThanOrEqualTo(String value) {
            addCriterion("C_WAYBILL_TRAIN_NUM >=", value, "cWaybillTrainNum");
            return (Criteria) this;
        }

        public Criteria andCWaybillTrainNumLessThan(String value) {
            addCriterion("C_WAYBILL_TRAIN_NUM <", value, "cWaybillTrainNum");
            return (Criteria) this;
        }

        public Criteria andCWaybillTrainNumLessThanOrEqualTo(String value) {
            addCriterion("C_WAYBILL_TRAIN_NUM <=", value, "cWaybillTrainNum");
            return (Criteria) this;
        }

        public Criteria andCWaybillTrainNumLike(String value) {
            addCriterion("C_WAYBILL_TRAIN_NUM like", value, "cWaybillTrainNum");
            return (Criteria) this;
        }

        public Criteria andCWaybillTrainNumNotLike(String value) {
            addCriterion("C_WAYBILL_TRAIN_NUM not like", value, "cWaybillTrainNum");
            return (Criteria) this;
        }

        public Criteria andCWaybillTrainNumIn(List<String> values) {
            addCriterion("C_WAYBILL_TRAIN_NUM in", values, "cWaybillTrainNum");
            return (Criteria) this;
        }

        public Criteria andCWaybillTrainNumNotIn(List<String> values) {
            addCriterion("C_WAYBILL_TRAIN_NUM not in", values, "cWaybillTrainNum");
            return (Criteria) this;
        }

        public Criteria andCWaybillTrainNumBetween(String value1, String value2) {
            addCriterion("C_WAYBILL_TRAIN_NUM between", value1, value2, "cWaybillTrainNum");
            return (Criteria) this;
        }

        public Criteria andCWaybillTrainNumNotBetween(String value1, String value2) {
            addCriterion("C_WAYBILL_TRAIN_NUM not between", value1, value2, "cWaybillTrainNum");
            return (Criteria) this;
        }

        public Criteria andIWaybillTrainNumberChargeIsNull() {
            addCriterion("I_WAYBILL_TRAIN_NUMBER_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andIWaybillTrainNumberChargeIsNotNull() {
            addCriterion("I_WAYBILL_TRAIN_NUMBER_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andIWaybillTrainNumberChargeEqualTo(Integer value) {
            addCriterion("I_WAYBILL_TRAIN_NUMBER_CHARGE =", value, "iWaybillTrainNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillTrainNumberChargeNotEqualTo(Integer value) {
            addCriterion("I_WAYBILL_TRAIN_NUMBER_CHARGE <>", value, "iWaybillTrainNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillTrainNumberChargeGreaterThan(Integer value) {
            addCriterion("I_WAYBILL_TRAIN_NUMBER_CHARGE >", value, "iWaybillTrainNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillTrainNumberChargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_TRAIN_NUMBER_CHARGE >=", value, "iWaybillTrainNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillTrainNumberChargeLessThan(Integer value) {
            addCriterion("I_WAYBILL_TRAIN_NUMBER_CHARGE <", value, "iWaybillTrainNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillTrainNumberChargeLessThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_TRAIN_NUMBER_CHARGE <=", value, "iWaybillTrainNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillTrainNumberChargeIn(List<Integer> values) {
            addCriterion("I_WAYBILL_TRAIN_NUMBER_CHARGE in", values, "iWaybillTrainNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillTrainNumberChargeNotIn(List<Integer> values) {
            addCriterion("I_WAYBILL_TRAIN_NUMBER_CHARGE not in", values, "iWaybillTrainNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillTrainNumberChargeBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_TRAIN_NUMBER_CHARGE between", value1, value2, "iWaybillTrainNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillTrainNumberChargeNotBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_TRAIN_NUMBER_CHARGE not between", value1, value2, "iWaybillTrainNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumberChargeIsNull() {
            addCriterion("I_WAYBILL_BOX_NUMBER_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumberChargeIsNotNull() {
            addCriterion("I_WAYBILL_BOX_NUMBER_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumberChargeEqualTo(Integer value) {
            addCriterion("I_WAYBILL_BOX_NUMBER_CHARGE =", value, "iWaybillBoxNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumberChargeNotEqualTo(Integer value) {
            addCriterion("I_WAYBILL_BOX_NUMBER_CHARGE <>", value, "iWaybillBoxNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumberChargeGreaterThan(Integer value) {
            addCriterion("I_WAYBILL_BOX_NUMBER_CHARGE >", value, "iWaybillBoxNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumberChargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_BOX_NUMBER_CHARGE >=", value, "iWaybillBoxNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumberChargeLessThan(Integer value) {
            addCriterion("I_WAYBILL_BOX_NUMBER_CHARGE <", value, "iWaybillBoxNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumberChargeLessThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_BOX_NUMBER_CHARGE <=", value, "iWaybillBoxNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumberChargeIn(List<Integer> values) {
            addCriterion("I_WAYBILL_BOX_NUMBER_CHARGE in", values, "iWaybillBoxNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumberChargeNotIn(List<Integer> values) {
            addCriterion("I_WAYBILL_BOX_NUMBER_CHARGE not in", values, "iWaybillBoxNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumberChargeBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_BOX_NUMBER_CHARGE between", value1, value2, "iWaybillBoxNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillBoxNumberChargeNotBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_BOX_NUMBER_CHARGE not between", value1, value2, "iWaybillBoxNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsNumberChargeIsNull() {
            addCriterion("I_WAYBILL_GOODS_NUMBER_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsNumberChargeIsNotNull() {
            addCriterion("I_WAYBILL_GOODS_NUMBER_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsNumberChargeEqualTo(Integer value) {
            addCriterion("I_WAYBILL_GOODS_NUMBER_CHARGE =", value, "iWaybillGoodsNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsNumberChargeNotEqualTo(Integer value) {
            addCriterion("I_WAYBILL_GOODS_NUMBER_CHARGE <>", value, "iWaybillGoodsNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsNumberChargeGreaterThan(Integer value) {
            addCriterion("I_WAYBILL_GOODS_NUMBER_CHARGE >", value, "iWaybillGoodsNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsNumberChargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_GOODS_NUMBER_CHARGE >=", value, "iWaybillGoodsNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsNumberChargeLessThan(Integer value) {
            addCriterion("I_WAYBILL_GOODS_NUMBER_CHARGE <", value, "iWaybillGoodsNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsNumberChargeLessThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_GOODS_NUMBER_CHARGE <=", value, "iWaybillGoodsNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsNumberChargeIn(List<Integer> values) {
            addCriterion("I_WAYBILL_GOODS_NUMBER_CHARGE in", values, "iWaybillGoodsNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsNumberChargeNotIn(List<Integer> values) {
            addCriterion("I_WAYBILL_GOODS_NUMBER_CHARGE not in", values, "iWaybillGoodsNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsNumberChargeBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_GOODS_NUMBER_CHARGE between", value1, value2, "iWaybillGoodsNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIWaybillGoodsNumberChargeNotBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_GOODS_NUMBER_CHARGE not between", value1, value2, "iWaybillGoodsNumberCharge");
            return (Criteria) this;
        }

        public Criteria andIPriceNoIsNull() {
            addCriterion("I_PRICE_NO is null");
            return (Criteria) this;
        }

        public Criteria andIPriceNoIsNotNull() {
            addCriterion("I_PRICE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIPriceNoEqualTo(Integer value) {
            addCriterion("I_PRICE_NO =", value, "iPriceNo");
            return (Criteria) this;
        }

        public Criteria andIPriceNoNotEqualTo(Integer value) {
            addCriterion("I_PRICE_NO <>", value, "iPriceNo");
            return (Criteria) this;
        }

        public Criteria andIPriceNoGreaterThan(Integer value) {
            addCriterion("I_PRICE_NO >", value, "iPriceNo");
            return (Criteria) this;
        }

        public Criteria andIPriceNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_PRICE_NO >=", value, "iPriceNo");
            return (Criteria) this;
        }

        public Criteria andIPriceNoLessThan(Integer value) {
            addCriterion("I_PRICE_NO <", value, "iPriceNo");
            return (Criteria) this;
        }

        public Criteria andIPriceNoLessThanOrEqualTo(Integer value) {
            addCriterion("I_PRICE_NO <=", value, "iPriceNo");
            return (Criteria) this;
        }

        public Criteria andIPriceNoIn(List<Integer> values) {
            addCriterion("I_PRICE_NO in", values, "iPriceNo");
            return (Criteria) this;
        }

        public Criteria andIPriceNoNotIn(List<Integer> values) {
            addCriterion("I_PRICE_NO not in", values, "iPriceNo");
            return (Criteria) this;
        }

        public Criteria andIPriceNoBetween(Integer value1, Integer value2) {
            addCriterion("I_PRICE_NO between", value1, value2, "iPriceNo");
            return (Criteria) this;
        }

        public Criteria andIPriceNoNotBetween(Integer value1, Integer value2) {
            addCriterion("I_PRICE_NO not between", value1, value2, "iPriceNo");
            return (Criteria) this;
        }

        public Criteria andFPriceRateIsNull() {
            addCriterion("F_PRICE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andFPriceRateIsNotNull() {
            addCriterion("F_PRICE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andFPriceRateEqualTo(Float value) {
            addCriterion("F_PRICE_RATE =", value, "fPriceRate");
            return (Criteria) this;
        }

        public Criteria andFPriceRateNotEqualTo(Float value) {
            addCriterion("F_PRICE_RATE <>", value, "fPriceRate");
            return (Criteria) this;
        }

        public Criteria andFPriceRateGreaterThan(Float value) {
            addCriterion("F_PRICE_RATE >", value, "fPriceRate");
            return (Criteria) this;
        }

        public Criteria andFPriceRateGreaterThanOrEqualTo(Float value) {
            addCriterion("F_PRICE_RATE >=", value, "fPriceRate");
            return (Criteria) this;
        }

        public Criteria andFPriceRateLessThan(Float value) {
            addCriterion("F_PRICE_RATE <", value, "fPriceRate");
            return (Criteria) this;
        }

        public Criteria andFPriceRateLessThanOrEqualTo(Float value) {
            addCriterion("F_PRICE_RATE <=", value, "fPriceRate");
            return (Criteria) this;
        }

        public Criteria andFPriceRateIn(List<Float> values) {
            addCriterion("F_PRICE_RATE in", values, "fPriceRate");
            return (Criteria) this;
        }

        public Criteria andFPriceRateNotIn(List<Float> values) {
            addCriterion("F_PRICE_RATE not in", values, "fPriceRate");
            return (Criteria) this;
        }

        public Criteria andFPriceRateBetween(Float value1, Float value2) {
            addCriterion("F_PRICE_RATE between", value1, value2, "fPriceRate");
            return (Criteria) this;
        }

        public Criteria andFPriceRateNotBetween(Float value1, Float value2) {
            addCriterion("F_PRICE_RATE not between", value1, value2, "fPriceRate");
            return (Criteria) this;
        }

        public Criteria andFWaybillIncidentalsPaidIsNull() {
            addCriterion("F_WAYBILL_INCIDENTALS_PAID is null");
            return (Criteria) this;
        }

        public Criteria andFWaybillIncidentalsPaidIsNotNull() {
            addCriterion("F_WAYBILL_INCIDENTALS_PAID is not null");
            return (Criteria) this;
        }

        public Criteria andFWaybillIncidentalsPaidEqualTo(Float value) {
            addCriterion("F_WAYBILL_INCIDENTALS_PAID =", value, "fWaybillIncidentalsPaid");
            return (Criteria) this;
        }

        public Criteria andFWaybillIncidentalsPaidNotEqualTo(Float value) {
            addCriterion("F_WAYBILL_INCIDENTALS_PAID <>", value, "fWaybillIncidentalsPaid");
            return (Criteria) this;
        }

        public Criteria andFWaybillIncidentalsPaidGreaterThan(Float value) {
            addCriterion("F_WAYBILL_INCIDENTALS_PAID >", value, "fWaybillIncidentalsPaid");
            return (Criteria) this;
        }

        public Criteria andFWaybillIncidentalsPaidGreaterThanOrEqualTo(Float value) {
            addCriterion("F_WAYBILL_INCIDENTALS_PAID >=", value, "fWaybillIncidentalsPaid");
            return (Criteria) this;
        }

        public Criteria andFWaybillIncidentalsPaidLessThan(Float value) {
            addCriterion("F_WAYBILL_INCIDENTALS_PAID <", value, "fWaybillIncidentalsPaid");
            return (Criteria) this;
        }

        public Criteria andFWaybillIncidentalsPaidLessThanOrEqualTo(Float value) {
            addCriterion("F_WAYBILL_INCIDENTALS_PAID <=", value, "fWaybillIncidentalsPaid");
            return (Criteria) this;
        }

        public Criteria andFWaybillIncidentalsPaidIn(List<Float> values) {
            addCriterion("F_WAYBILL_INCIDENTALS_PAID in", values, "fWaybillIncidentalsPaid");
            return (Criteria) this;
        }

        public Criteria andFWaybillIncidentalsPaidNotIn(List<Float> values) {
            addCriterion("F_WAYBILL_INCIDENTALS_PAID not in", values, "fWaybillIncidentalsPaid");
            return (Criteria) this;
        }

        public Criteria andFWaybillIncidentalsPaidBetween(Float value1, Float value2) {
            addCriterion("F_WAYBILL_INCIDENTALS_PAID between", value1, value2, "fWaybillIncidentalsPaid");
            return (Criteria) this;
        }

        public Criteria andFWaybillIncidentalsPaidNotBetween(Float value1, Float value2) {
            addCriterion("F_WAYBILL_INCIDENTALS_PAID not between", value1, value2, "fWaybillIncidentalsPaid");
            return (Criteria) this;
        }

        public Criteria andFWaybillElectrictFeeIsNull() {
            addCriterion("F_WAYBILL_ELECTRICT_FEE is null");
            return (Criteria) this;
        }

        public Criteria andFWaybillElectrictFeeIsNotNull() {
            addCriterion("F_WAYBILL_ELECTRICT_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andFWaybillElectrictFeeEqualTo(Float value) {
            addCriterion("F_WAYBILL_ELECTRICT_FEE =", value, "fWaybillElectrictFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillElectrictFeeNotEqualTo(Float value) {
            addCriterion("F_WAYBILL_ELECTRICT_FEE <>", value, "fWaybillElectrictFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillElectrictFeeGreaterThan(Float value) {
            addCriterion("F_WAYBILL_ELECTRICT_FEE >", value, "fWaybillElectrictFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillElectrictFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("F_WAYBILL_ELECTRICT_FEE >=", value, "fWaybillElectrictFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillElectrictFeeLessThan(Float value) {
            addCriterion("F_WAYBILL_ELECTRICT_FEE <", value, "fWaybillElectrictFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillElectrictFeeLessThanOrEqualTo(Float value) {
            addCriterion("F_WAYBILL_ELECTRICT_FEE <=", value, "fWaybillElectrictFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillElectrictFeeIn(List<Float> values) {
            addCriterion("F_WAYBILL_ELECTRICT_FEE in", values, "fWaybillElectrictFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillElectrictFeeNotIn(List<Float> values) {
            addCriterion("F_WAYBILL_ELECTRICT_FEE not in", values, "fWaybillElectrictFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillElectrictFeeBetween(Float value1, Float value2) {
            addCriterion("F_WAYBILL_ELECTRICT_FEE between", value1, value2, "fWaybillElectrictFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillElectrictFeeNotBetween(Float value1, Float value2) {
            addCriterion("F_WAYBILL_ELECTRICT_FEE not between", value1, value2, "fWaybillElectrictFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillConstructFeeIsNull() {
            addCriterion("F_WAYBILL_CONSTRUCT_FEE is null");
            return (Criteria) this;
        }

        public Criteria andFWaybillConstructFeeIsNotNull() {
            addCriterion("F_WAYBILL_CONSTRUCT_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andFWaybillConstructFeeEqualTo(Float value) {
            addCriterion("F_WAYBILL_CONSTRUCT_FEE =", value, "fWaybillConstructFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillConstructFeeNotEqualTo(Float value) {
            addCriterion("F_WAYBILL_CONSTRUCT_FEE <>", value, "fWaybillConstructFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillConstructFeeGreaterThan(Float value) {
            addCriterion("F_WAYBILL_CONSTRUCT_FEE >", value, "fWaybillConstructFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillConstructFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("F_WAYBILL_CONSTRUCT_FEE >=", value, "fWaybillConstructFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillConstructFeeLessThan(Float value) {
            addCriterion("F_WAYBILL_CONSTRUCT_FEE <", value, "fWaybillConstructFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillConstructFeeLessThanOrEqualTo(Float value) {
            addCriterion("F_WAYBILL_CONSTRUCT_FEE <=", value, "fWaybillConstructFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillConstructFeeIn(List<Float> values) {
            addCriterion("F_WAYBILL_CONSTRUCT_FEE in", values, "fWaybillConstructFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillConstructFeeNotIn(List<Float> values) {
            addCriterion("F_WAYBILL_CONSTRUCT_FEE not in", values, "fWaybillConstructFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillConstructFeeBetween(Float value1, Float value2) {
            addCriterion("F_WAYBILL_CONSTRUCT_FEE between", value1, value2, "fWaybillConstructFee");
            return (Criteria) this;
        }

        public Criteria andFWaybillConstructFeeNotBetween(Float value1, Float value2) {
            addCriterion("F_WAYBILL_CONSTRUCT_FEE not between", value1, value2, "fWaybillConstructFee");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentMethodIsNull() {
            addCriterion("I_WAYBILL_PAYMENT_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentMethodIsNotNull() {
            addCriterion("I_WAYBILL_PAYMENT_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentMethodEqualTo(Integer value) {
            addCriterion("I_WAYBILL_PAYMENT_METHOD =", value, "iWaybillPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentMethodNotEqualTo(Integer value) {
            addCriterion("I_WAYBILL_PAYMENT_METHOD <>", value, "iWaybillPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentMethodGreaterThan(Integer value) {
            addCriterion("I_WAYBILL_PAYMENT_METHOD >", value, "iWaybillPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_PAYMENT_METHOD >=", value, "iWaybillPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentMethodLessThan(Integer value) {
            addCriterion("I_WAYBILL_PAYMENT_METHOD <", value, "iWaybillPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentMethodLessThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_PAYMENT_METHOD <=", value, "iWaybillPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentMethodIn(List<Integer> values) {
            addCriterion("I_WAYBILL_PAYMENT_METHOD in", values, "iWaybillPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentMethodNotIn(List<Integer> values) {
            addCriterion("I_WAYBILL_PAYMENT_METHOD not in", values, "iWaybillPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentMethodBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_PAYMENT_METHOD between", value1, value2, "iWaybillPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_PAYMENT_METHOD not between", value1, value2, "iWaybillPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentStateIsNull() {
            addCriterion("I_WAYBILL_PAYMENT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentStateIsNotNull() {
            addCriterion("I_WAYBILL_PAYMENT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentStateEqualTo(Integer value) {
            addCriterion("I_WAYBILL_PAYMENT_STATE =", value, "iWaybillPaymentState");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentStateNotEqualTo(Integer value) {
            addCriterion("I_WAYBILL_PAYMENT_STATE <>", value, "iWaybillPaymentState");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentStateGreaterThan(Integer value) {
            addCriterion("I_WAYBILL_PAYMENT_STATE >", value, "iWaybillPaymentState");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_PAYMENT_STATE >=", value, "iWaybillPaymentState");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentStateLessThan(Integer value) {
            addCriterion("I_WAYBILL_PAYMENT_STATE <", value, "iWaybillPaymentState");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentStateLessThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_PAYMENT_STATE <=", value, "iWaybillPaymentState");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentStateIn(List<Integer> values) {
            addCriterion("I_WAYBILL_PAYMENT_STATE in", values, "iWaybillPaymentState");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentStateNotIn(List<Integer> values) {
            addCriterion("I_WAYBILL_PAYMENT_STATE not in", values, "iWaybillPaymentState");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentStateBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_PAYMENT_STATE between", value1, value2, "iWaybillPaymentState");
            return (Criteria) this;
        }

        public Criteria andIWaybillPaymentStateNotBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_PAYMENT_STATE not between", value1, value2, "iWaybillPaymentState");
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