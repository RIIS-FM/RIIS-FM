package com.crscd.riis.freightmarket.trade.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FmTradeTransportSchemeEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmTradeTransportSchemeEntityExample() {
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

        public Criteria andFTradeOrderTransportSchemeFeeIsNull() {
            addCriterion("F_TRADE_ORDER_TRANSPORT_SCHEME_FEE is null");
            return (Criteria) this;
        }

        public Criteria andFTradeOrderTransportSchemeFeeIsNotNull() {
            addCriterion("F_TRADE_ORDER_TRANSPORT_SCHEME_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andFTradeOrderTransportSchemeFeeEqualTo(Float value) {
            addCriterion("F_TRADE_ORDER_TRANSPORT_SCHEME_FEE =", value, "fTradeOrderTransportSchemeFee");
            return (Criteria) this;
        }

        public Criteria andFTradeOrderTransportSchemeFeeNotEqualTo(Float value) {
            addCriterion("F_TRADE_ORDER_TRANSPORT_SCHEME_FEE <>", value, "fTradeOrderTransportSchemeFee");
            return (Criteria) this;
        }

        public Criteria andFTradeOrderTransportSchemeFeeGreaterThan(Float value) {
            addCriterion("F_TRADE_ORDER_TRANSPORT_SCHEME_FEE >", value, "fTradeOrderTransportSchemeFee");
            return (Criteria) this;
        }

        public Criteria andFTradeOrderTransportSchemeFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("F_TRADE_ORDER_TRANSPORT_SCHEME_FEE >=", value, "fTradeOrderTransportSchemeFee");
            return (Criteria) this;
        }

        public Criteria andFTradeOrderTransportSchemeFeeLessThan(Float value) {
            addCriterion("F_TRADE_ORDER_TRANSPORT_SCHEME_FEE <", value, "fTradeOrderTransportSchemeFee");
            return (Criteria) this;
        }

        public Criteria andFTradeOrderTransportSchemeFeeLessThanOrEqualTo(Float value) {
            addCriterion("F_TRADE_ORDER_TRANSPORT_SCHEME_FEE <=", value, "fTradeOrderTransportSchemeFee");
            return (Criteria) this;
        }

        public Criteria andFTradeOrderTransportSchemeFeeIn(List<Float> values) {
            addCriterion("F_TRADE_ORDER_TRANSPORT_SCHEME_FEE in", values, "fTradeOrderTransportSchemeFee");
            return (Criteria) this;
        }

        public Criteria andFTradeOrderTransportSchemeFeeNotIn(List<Float> values) {
            addCriterion("F_TRADE_ORDER_TRANSPORT_SCHEME_FEE not in", values, "fTradeOrderTransportSchemeFee");
            return (Criteria) this;
        }

        public Criteria andFTradeOrderTransportSchemeFeeBetween(Float value1, Float value2) {
            addCriterion("F_TRADE_ORDER_TRANSPORT_SCHEME_FEE between", value1, value2, "fTradeOrderTransportSchemeFee");
            return (Criteria) this;
        }

        public Criteria andFTradeOrderTransportSchemeFeeNotBetween(Float value1, Float value2) {
            addCriterion("F_TRADE_ORDER_TRANSPORT_SCHEME_FEE not between", value1, value2, "fTradeOrderTransportSchemeFee");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeCodeIsNull() {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeCodeIsNotNull() {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeCodeEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE =", value, "cTradeOrderTransportSchemeCode");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeCodeNotEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE <>", value, "cTradeOrderTransportSchemeCode");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeCodeGreaterThan(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE >", value, "cTradeOrderTransportSchemeCode");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE >=", value, "cTradeOrderTransportSchemeCode");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeCodeLessThan(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE <", value, "cTradeOrderTransportSchemeCode");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeCodeLessThanOrEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE <=", value, "cTradeOrderTransportSchemeCode");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeCodeLike(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE like", value, "cTradeOrderTransportSchemeCode");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeCodeNotLike(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE not like", value, "cTradeOrderTransportSchemeCode");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeCodeIn(List<String> values) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE in", values, "cTradeOrderTransportSchemeCode");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeCodeNotIn(List<String> values) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE not in", values, "cTradeOrderTransportSchemeCode");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeCodeBetween(String value1, String value2) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE between", value1, value2, "cTradeOrderTransportSchemeCode");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeCodeNotBetween(String value1, String value2) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE not between", value1, value2, "cTradeOrderTransportSchemeCode");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeStartTimeIsNull() {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeStartTimeIsNotNull() {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeStartTimeEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME =", value, "dTradeOrderTransportSchemeStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeStartTimeNotEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME <>", value, "dTradeOrderTransportSchemeStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeStartTimeGreaterThan(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME >", value, "dTradeOrderTransportSchemeStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME >=", value, "dTradeOrderTransportSchemeStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeStartTimeLessThan(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME <", value, "dTradeOrderTransportSchemeStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME <=", value, "dTradeOrderTransportSchemeStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeStartTimeIn(List<Date> values) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME in", values, "dTradeOrderTransportSchemeStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeStartTimeNotIn(List<Date> values) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME not in", values, "dTradeOrderTransportSchemeStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeStartTimeBetween(Date value1, Date value2) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME between", value1, value2, "dTradeOrderTransportSchemeStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME not between", value1, value2, "dTradeOrderTransportSchemeStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeEndTimeIsNull() {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeEndTimeIsNotNull() {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeEndTimeEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME =", value, "dTradeOrderTransportSchemeEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeEndTimeNotEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME <>", value, "dTradeOrderTransportSchemeEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeEndTimeGreaterThan(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME >", value, "dTradeOrderTransportSchemeEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME >=", value, "dTradeOrderTransportSchemeEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeEndTimeLessThan(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME <", value, "dTradeOrderTransportSchemeEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME <=", value, "dTradeOrderTransportSchemeEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeEndTimeIn(List<Date> values) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME in", values, "dTradeOrderTransportSchemeEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeEndTimeNotIn(List<Date> values) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME not in", values, "dTradeOrderTransportSchemeEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeEndTimeBetween(Date value1, Date value2) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME between", value1, value2, "dTradeOrderTransportSchemeEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME not between", value1, value2, "dTradeOrderTransportSchemeEndTime");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadStationIsNull() {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION is null");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadStationIsNotNull() {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION is not null");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadStationEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION =", value, "cTradeOrderTransportSchemeLoadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadStationNotEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION <>", value, "cTradeOrderTransportSchemeLoadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadStationGreaterThan(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION >", value, "cTradeOrderTransportSchemeLoadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadStationGreaterThanOrEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION >=", value, "cTradeOrderTransportSchemeLoadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadStationLessThan(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION <", value, "cTradeOrderTransportSchemeLoadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadStationLessThanOrEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION <=", value, "cTradeOrderTransportSchemeLoadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadStationLike(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION like", value, "cTradeOrderTransportSchemeLoadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadStationNotLike(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION not like", value, "cTradeOrderTransportSchemeLoadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadStationIn(List<String> values) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION in", values, "cTradeOrderTransportSchemeLoadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadStationNotIn(List<String> values) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION not in", values, "cTradeOrderTransportSchemeLoadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadStationBetween(String value1, String value2) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION between", value1, value2, "cTradeOrderTransportSchemeLoadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadStationNotBetween(String value1, String value2) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION not between", value1, value2, "cTradeOrderTransportSchemeLoadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadStationIsNull() {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION is null");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadStationIsNotNull() {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION is not null");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadStationEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION =", value, "cTradeOrderTransportSchemeUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadStationNotEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION <>", value, "cTradeOrderTransportSchemeUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadStationGreaterThan(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION >", value, "cTradeOrderTransportSchemeUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadStationGreaterThanOrEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION >=", value, "cTradeOrderTransportSchemeUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadStationLessThan(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION <", value, "cTradeOrderTransportSchemeUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadStationLessThanOrEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION <=", value, "cTradeOrderTransportSchemeUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadStationLike(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION like", value, "cTradeOrderTransportSchemeUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadStationNotLike(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION not like", value, "cTradeOrderTransportSchemeUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadStationIn(List<String> values) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION in", values, "cTradeOrderTransportSchemeUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadStationNotIn(List<String> values) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION not in", values, "cTradeOrderTransportSchemeUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadStationBetween(String value1, String value2) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION between", value1, value2, "cTradeOrderTransportSchemeUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadStationNotBetween(String value1, String value2) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION not between", value1, value2, "cTradeOrderTransportSchemeUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadLocationIsNull() {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadLocationIsNotNull() {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadLocationEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION =", value, "cTradeOrderTransportSchemeLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadLocationNotEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION <>", value, "cTradeOrderTransportSchemeLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadLocationGreaterThan(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION >", value, "cTradeOrderTransportSchemeLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadLocationGreaterThanOrEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION >=", value, "cTradeOrderTransportSchemeLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadLocationLessThan(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION <", value, "cTradeOrderTransportSchemeLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadLocationLessThanOrEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION <=", value, "cTradeOrderTransportSchemeLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadLocationLike(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION like", value, "cTradeOrderTransportSchemeLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadLocationNotLike(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION not like", value, "cTradeOrderTransportSchemeLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadLocationIn(List<String> values) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION in", values, "cTradeOrderTransportSchemeLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadLocationNotIn(List<String> values) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION not in", values, "cTradeOrderTransportSchemeLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadLocationBetween(String value1, String value2) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION between", value1, value2, "cTradeOrderTransportSchemeLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeLoadLocationNotBetween(String value1, String value2) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION not between", value1, value2, "cTradeOrderTransportSchemeLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadLocationIsNull() {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadLocationIsNotNull() {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadLocationEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION =", value, "cTradeOrderTransportSchemeUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadLocationNotEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION <>", value, "cTradeOrderTransportSchemeUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadLocationGreaterThan(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION >", value, "cTradeOrderTransportSchemeUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadLocationGreaterThanOrEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION >=", value, "cTradeOrderTransportSchemeUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadLocationLessThan(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION <", value, "cTradeOrderTransportSchemeUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadLocationLessThanOrEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION <=", value, "cTradeOrderTransportSchemeUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadLocationLike(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION like", value, "cTradeOrderTransportSchemeUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadLocationNotLike(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION not like", value, "cTradeOrderTransportSchemeUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadLocationIn(List<String> values) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION in", values, "cTradeOrderTransportSchemeUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadLocationNotIn(List<String> values) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION not in", values, "cTradeOrderTransportSchemeUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadLocationBetween(String value1, String value2) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION between", value1, value2, "cTradeOrderTransportSchemeUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeUnloadLocationNotBetween(String value1, String value2) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION not between", value1, value2, "cTradeOrderTransportSchemeUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainNumIsNull() {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainNumIsNotNull() {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainNumEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM =", value, "cTradeOrderTransportSchemeTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainNumNotEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM <>", value, "cTradeOrderTransportSchemeTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainNumGreaterThan(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM >", value, "cTradeOrderTransportSchemeTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainNumGreaterThanOrEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM >=", value, "cTradeOrderTransportSchemeTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainNumLessThan(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM <", value, "cTradeOrderTransportSchemeTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainNumLessThanOrEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM <=", value, "cTradeOrderTransportSchemeTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainNumLike(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM like", value, "cTradeOrderTransportSchemeTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainNumNotLike(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM not like", value, "cTradeOrderTransportSchemeTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainNumIn(List<String> values) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM in", values, "cTradeOrderTransportSchemeTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainNumNotIn(List<String> values) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM not in", values, "cTradeOrderTransportSchemeTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainNumBetween(String value1, String value2) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM between", value1, value2, "cTradeOrderTransportSchemeTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainNumNotBetween(String value1, String value2) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM not between", value1, value2, "cTradeOrderTransportSchemeTrainNum");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainTypeIsNull() {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainTypeIsNotNull() {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainTypeEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE =", value, "cTradeOrderTransportSchemeTrainType");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainTypeNotEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE <>", value, "cTradeOrderTransportSchemeTrainType");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainTypeGreaterThan(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE >", value, "cTradeOrderTransportSchemeTrainType");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE >=", value, "cTradeOrderTransportSchemeTrainType");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainTypeLessThan(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE <", value, "cTradeOrderTransportSchemeTrainType");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainTypeLessThanOrEqualTo(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE <=", value, "cTradeOrderTransportSchemeTrainType");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainTypeLike(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE like", value, "cTradeOrderTransportSchemeTrainType");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainTypeNotLike(String value) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE not like", value, "cTradeOrderTransportSchemeTrainType");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainTypeIn(List<String> values) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE in", values, "cTradeOrderTransportSchemeTrainType");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainTypeNotIn(List<String> values) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE not in", values, "cTradeOrderTransportSchemeTrainType");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainTypeBetween(String value1, String value2) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE between", value1, value2, "cTradeOrderTransportSchemeTrainType");
            return (Criteria) this;
        }

        public Criteria andCTradeOrderTransportSchemeTrainTypeNotBetween(String value1, String value2) {
            addCriterion("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE not between", value1, value2, "cTradeOrderTransportSchemeTrainType");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadStartTimeIsNull() {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadStartTimeIsNotNull() {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadStartTimeEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME =", value, "dTradeOrderTransportSchemeUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadStartTimeNotEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME <>", value, "dTradeOrderTransportSchemeUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadStartTimeGreaterThan(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME >", value, "dTradeOrderTransportSchemeUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME >=", value, "dTradeOrderTransportSchemeUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadStartTimeLessThan(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME <", value, "dTradeOrderTransportSchemeUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME <=", value, "dTradeOrderTransportSchemeUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadStartTimeIn(List<Date> values) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME in", values, "dTradeOrderTransportSchemeUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadStartTimeNotIn(List<Date> values) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME not in", values, "dTradeOrderTransportSchemeUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadStartTimeBetween(Date value1, Date value2) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME between", value1, value2, "dTradeOrderTransportSchemeUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME not between", value1, value2, "dTradeOrderTransportSchemeUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadEndTimeIsNull() {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadEndTimeIsNotNull() {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadEndTimeEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME =", value, "dTradeOrderTransportSchemeUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadEndTimeNotEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME <>", value, "dTradeOrderTransportSchemeUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadEndTimeGreaterThan(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME >", value, "dTradeOrderTransportSchemeUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME >=", value, "dTradeOrderTransportSchemeUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadEndTimeLessThan(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME <", value, "dTradeOrderTransportSchemeUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME <=", value, "dTradeOrderTransportSchemeUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadEndTimeIn(List<Date> values) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME in", values, "dTradeOrderTransportSchemeUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadEndTimeNotIn(List<Date> values) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME not in", values, "dTradeOrderTransportSchemeUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadEndTimeBetween(Date value1, Date value2) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME between", value1, value2, "dTradeOrderTransportSchemeUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeUnloadEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME not between", value1, value2, "dTradeOrderTransportSchemeUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadStartTimeIsNull() {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadStartTimeIsNotNull() {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadStartTimeEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME =", value, "dTradeOrderTransportSchemeLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadStartTimeNotEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME <>", value, "dTradeOrderTransportSchemeLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadStartTimeGreaterThan(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME >", value, "dTradeOrderTransportSchemeLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME >=", value, "dTradeOrderTransportSchemeLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadStartTimeLessThan(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME <", value, "dTradeOrderTransportSchemeLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME <=", value, "dTradeOrderTransportSchemeLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadStartTimeIn(List<Date> values) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME in", values, "dTradeOrderTransportSchemeLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadStartTimeNotIn(List<Date> values) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME not in", values, "dTradeOrderTransportSchemeLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadStartTimeBetween(Date value1, Date value2) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME between", value1, value2, "dTradeOrderTransportSchemeLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME not between", value1, value2, "dTradeOrderTransportSchemeLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadEndTimeIsNull() {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadEndTimeIsNotNull() {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadEndTimeEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME =", value, "dTradeOrderTransportSchemeLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadEndTimeNotEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME <>", value, "dTradeOrderTransportSchemeLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadEndTimeGreaterThan(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME >", value, "dTradeOrderTransportSchemeLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME >=", value, "dTradeOrderTransportSchemeLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadEndTimeLessThan(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME <", value, "dTradeOrderTransportSchemeLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME <=", value, "dTradeOrderTransportSchemeLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadEndTimeIn(List<Date> values) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME in", values, "dTradeOrderTransportSchemeLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadEndTimeNotIn(List<Date> values) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME not in", values, "dTradeOrderTransportSchemeLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadEndTimeBetween(Date value1, Date value2) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME between", value1, value2, "dTradeOrderTransportSchemeLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTradeOrderTransportSchemeLoadEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME not between", value1, value2, "dTradeOrderTransportSchemeLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andIIsSelectIsNull() {
            addCriterion("I_IS_SELECT is null");
            return (Criteria) this;
        }

        public Criteria andIIsSelectIsNotNull() {
            addCriterion("I_IS_SELECT is not null");
            return (Criteria) this;
        }

        public Criteria andIIsSelectEqualTo(Integer value) {
            addCriterion("I_IS_SELECT =", value, "iIsSelect");
            return (Criteria) this;
        }

        public Criteria andIIsSelectNotEqualTo(Integer value) {
            addCriterion("I_IS_SELECT <>", value, "iIsSelect");
            return (Criteria) this;
        }

        public Criteria andIIsSelectGreaterThan(Integer value) {
            addCriterion("I_IS_SELECT >", value, "iIsSelect");
            return (Criteria) this;
        }

        public Criteria andIIsSelectGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_IS_SELECT >=", value, "iIsSelect");
            return (Criteria) this;
        }

        public Criteria andIIsSelectLessThan(Integer value) {
            addCriterion("I_IS_SELECT <", value, "iIsSelect");
            return (Criteria) this;
        }

        public Criteria andIIsSelectLessThanOrEqualTo(Integer value) {
            addCriterion("I_IS_SELECT <=", value, "iIsSelect");
            return (Criteria) this;
        }

        public Criteria andIIsSelectIn(List<Integer> values) {
            addCriterion("I_IS_SELECT in", values, "iIsSelect");
            return (Criteria) this;
        }

        public Criteria andIIsSelectNotIn(List<Integer> values) {
            addCriterion("I_IS_SELECT not in", values, "iIsSelect");
            return (Criteria) this;
        }

        public Criteria andIIsSelectBetween(Integer value1, Integer value2) {
            addCriterion("I_IS_SELECT between", value1, value2, "iIsSelect");
            return (Criteria) this;
        }

        public Criteria andIIsSelectNotBetween(Integer value1, Integer value2) {
            addCriterion("I_IS_SELECT not between", value1, value2, "iIsSelect");
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