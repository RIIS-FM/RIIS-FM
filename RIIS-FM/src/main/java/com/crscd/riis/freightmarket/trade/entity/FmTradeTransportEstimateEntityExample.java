package com.crscd.riis.freightmarket.trade.entity;

import java.util.ArrayList;
import java.util.List;

public class FmTradeTransportEstimateEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmTradeTransportEstimateEntityExample() {
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

        public Criteria andCOrderCodeIsNull() {
            addCriterion("C_ORDER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCOrderCodeIsNotNull() {
            addCriterion("C_ORDER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCOrderCodeEqualTo(String value) {
            addCriterion("C_ORDER_CODE =", value, "cOrderCode");
            return (Criteria) this;
        }

        public Criteria andCOrderCodeNotEqualTo(String value) {
            addCriterion("C_ORDER_CODE <>", value, "cOrderCode");
            return (Criteria) this;
        }

        public Criteria andCOrderCodeGreaterThan(String value) {
            addCriterion("C_ORDER_CODE >", value, "cOrderCode");
            return (Criteria) this;
        }

        public Criteria andCOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_ORDER_CODE >=", value, "cOrderCode");
            return (Criteria) this;
        }

        public Criteria andCOrderCodeLessThan(String value) {
            addCriterion("C_ORDER_CODE <", value, "cOrderCode");
            return (Criteria) this;
        }

        public Criteria andCOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("C_ORDER_CODE <=", value, "cOrderCode");
            return (Criteria) this;
        }

        public Criteria andCOrderCodeLike(String value) {
            addCriterion("C_ORDER_CODE like", value, "cOrderCode");
            return (Criteria) this;
        }

        public Criteria andCOrderCodeNotLike(String value) {
            addCriterion("C_ORDER_CODE not like", value, "cOrderCode");
            return (Criteria) this;
        }

        public Criteria andCOrderCodeIn(List<String> values) {
            addCriterion("C_ORDER_CODE in", values, "cOrderCode");
            return (Criteria) this;
        }

        public Criteria andCOrderCodeNotIn(List<String> values) {
            addCriterion("C_ORDER_CODE not in", values, "cOrderCode");
            return (Criteria) this;
        }

        public Criteria andCOrderCodeBetween(String value1, String value2) {
            addCriterion("C_ORDER_CODE between", value1, value2, "cOrderCode");
            return (Criteria) this;
        }

        public Criteria andCOrderCodeNotBetween(String value1, String value2) {
            addCriterion("C_ORDER_CODE not between", value1, value2, "cOrderCode");
            return (Criteria) this;
        }

        public Criteria andIEstimateServiceEfficiencyIsNull() {
            addCriterion("I_ESTIMATE_SERVICE_EFFICIENCY is null");
            return (Criteria) this;
        }

        public Criteria andIEstimateServiceEfficiencyIsNotNull() {
            addCriterion("I_ESTIMATE_SERVICE_EFFICIENCY is not null");
            return (Criteria) this;
        }

        public Criteria andIEstimateServiceEfficiencyEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_SERVICE_EFFICIENCY =", value, "iEstimateServiceEfficiency");
            return (Criteria) this;
        }

        public Criteria andIEstimateServiceEfficiencyNotEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_SERVICE_EFFICIENCY <>", value, "iEstimateServiceEfficiency");
            return (Criteria) this;
        }

        public Criteria andIEstimateServiceEfficiencyGreaterThan(Integer value) {
            addCriterion("I_ESTIMATE_SERVICE_EFFICIENCY >", value, "iEstimateServiceEfficiency");
            return (Criteria) this;
        }

        public Criteria andIEstimateServiceEfficiencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_SERVICE_EFFICIENCY >=", value, "iEstimateServiceEfficiency");
            return (Criteria) this;
        }

        public Criteria andIEstimateServiceEfficiencyLessThan(Integer value) {
            addCriterion("I_ESTIMATE_SERVICE_EFFICIENCY <", value, "iEstimateServiceEfficiency");
            return (Criteria) this;
        }

        public Criteria andIEstimateServiceEfficiencyLessThanOrEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_SERVICE_EFFICIENCY <=", value, "iEstimateServiceEfficiency");
            return (Criteria) this;
        }

        public Criteria andIEstimateServiceEfficiencyIn(List<Integer> values) {
            addCriterion("I_ESTIMATE_SERVICE_EFFICIENCY in", values, "iEstimateServiceEfficiency");
            return (Criteria) this;
        }

        public Criteria andIEstimateServiceEfficiencyNotIn(List<Integer> values) {
            addCriterion("I_ESTIMATE_SERVICE_EFFICIENCY not in", values, "iEstimateServiceEfficiency");
            return (Criteria) this;
        }

        public Criteria andIEstimateServiceEfficiencyBetween(Integer value1, Integer value2) {
            addCriterion("I_ESTIMATE_SERVICE_EFFICIENCY between", value1, value2, "iEstimateServiceEfficiency");
            return (Criteria) this;
        }

        public Criteria andIEstimateServiceEfficiencyNotBetween(Integer value1, Integer value2) {
            addCriterion("I_ESTIMATE_SERVICE_EFFICIENCY not between", value1, value2, "iEstimateServiceEfficiency");
            return (Criteria) this;
        }

        public Criteria andIEstimateTransportIsNull() {
            addCriterion("I_ESTIMATE_TRANSPORT is null");
            return (Criteria) this;
        }

        public Criteria andIEstimateTransportIsNotNull() {
            addCriterion("I_ESTIMATE_TRANSPORT is not null");
            return (Criteria) this;
        }

        public Criteria andIEstimateTransportEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_TRANSPORT =", value, "iEstimateTransport");
            return (Criteria) this;
        }

        public Criteria andIEstimateTransportNotEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_TRANSPORT <>", value, "iEstimateTransport");
            return (Criteria) this;
        }

        public Criteria andIEstimateTransportGreaterThan(Integer value) {
            addCriterion("I_ESTIMATE_TRANSPORT >", value, "iEstimateTransport");
            return (Criteria) this;
        }

        public Criteria andIEstimateTransportGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_TRANSPORT >=", value, "iEstimateTransport");
            return (Criteria) this;
        }

        public Criteria andIEstimateTransportLessThan(Integer value) {
            addCriterion("I_ESTIMATE_TRANSPORT <", value, "iEstimateTransport");
            return (Criteria) this;
        }

        public Criteria andIEstimateTransportLessThanOrEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_TRANSPORT <=", value, "iEstimateTransport");
            return (Criteria) this;
        }

        public Criteria andIEstimateTransportIn(List<Integer> values) {
            addCriterion("I_ESTIMATE_TRANSPORT in", values, "iEstimateTransport");
            return (Criteria) this;
        }

        public Criteria andIEstimateTransportNotIn(List<Integer> values) {
            addCriterion("I_ESTIMATE_TRANSPORT not in", values, "iEstimateTransport");
            return (Criteria) this;
        }

        public Criteria andIEstimateTransportBetween(Integer value1, Integer value2) {
            addCriterion("I_ESTIMATE_TRANSPORT between", value1, value2, "iEstimateTransport");
            return (Criteria) this;
        }

        public Criteria andIEstimateTransportNotBetween(Integer value1, Integer value2) {
            addCriterion("I_ESTIMATE_TRANSPORT not between", value1, value2, "iEstimateTransport");
            return (Criteria) this;
        }

        public Criteria andIEstimatePartityIsNull() {
            addCriterion("I_ESTIMATE_PARTITY is null");
            return (Criteria) this;
        }

        public Criteria andIEstimatePartityIsNotNull() {
            addCriterion("I_ESTIMATE_PARTITY is not null");
            return (Criteria) this;
        }

        public Criteria andIEstimatePartityEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_PARTITY =", value, "iEstimatePartity");
            return (Criteria) this;
        }

        public Criteria andIEstimatePartityNotEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_PARTITY <>", value, "iEstimatePartity");
            return (Criteria) this;
        }

        public Criteria andIEstimatePartityGreaterThan(Integer value) {
            addCriterion("I_ESTIMATE_PARTITY >", value, "iEstimatePartity");
            return (Criteria) this;
        }

        public Criteria andIEstimatePartityGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_PARTITY >=", value, "iEstimatePartity");
            return (Criteria) this;
        }

        public Criteria andIEstimatePartityLessThan(Integer value) {
            addCriterion("I_ESTIMATE_PARTITY <", value, "iEstimatePartity");
            return (Criteria) this;
        }

        public Criteria andIEstimatePartityLessThanOrEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_PARTITY <=", value, "iEstimatePartity");
            return (Criteria) this;
        }

        public Criteria andIEstimatePartityIn(List<Integer> values) {
            addCriterion("I_ESTIMATE_PARTITY in", values, "iEstimatePartity");
            return (Criteria) this;
        }

        public Criteria andIEstimatePartityNotIn(List<Integer> values) {
            addCriterion("I_ESTIMATE_PARTITY not in", values, "iEstimatePartity");
            return (Criteria) this;
        }

        public Criteria andIEstimatePartityBetween(Integer value1, Integer value2) {
            addCriterion("I_ESTIMATE_PARTITY between", value1, value2, "iEstimatePartity");
            return (Criteria) this;
        }

        public Criteria andIEstimatePartityNotBetween(Integer value1, Integer value2) {
            addCriterion("I_ESTIMATE_PARTITY not between", value1, value2, "iEstimatePartity");
            return (Criteria) this;
        }

        public Criteria andIEstimateConvininetIsNull() {
            addCriterion("I_ESTIMATE_CONVININET is null");
            return (Criteria) this;
        }

        public Criteria andIEstimateConvininetIsNotNull() {
            addCriterion("I_ESTIMATE_CONVININET is not null");
            return (Criteria) this;
        }

        public Criteria andIEstimateConvininetEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_CONVININET =", value, "iEstimateConvininet");
            return (Criteria) this;
        }

        public Criteria andIEstimateConvininetNotEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_CONVININET <>", value, "iEstimateConvininet");
            return (Criteria) this;
        }

        public Criteria andIEstimateConvininetGreaterThan(Integer value) {
            addCriterion("I_ESTIMATE_CONVININET >", value, "iEstimateConvininet");
            return (Criteria) this;
        }

        public Criteria andIEstimateConvininetGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_CONVININET >=", value, "iEstimateConvininet");
            return (Criteria) this;
        }

        public Criteria andIEstimateConvininetLessThan(Integer value) {
            addCriterion("I_ESTIMATE_CONVININET <", value, "iEstimateConvininet");
            return (Criteria) this;
        }

        public Criteria andIEstimateConvininetLessThanOrEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_CONVININET <=", value, "iEstimateConvininet");
            return (Criteria) this;
        }

        public Criteria andIEstimateConvininetIn(List<Integer> values) {
            addCriterion("I_ESTIMATE_CONVININET in", values, "iEstimateConvininet");
            return (Criteria) this;
        }

        public Criteria andIEstimateConvininetNotIn(List<Integer> values) {
            addCriterion("I_ESTIMATE_CONVININET not in", values, "iEstimateConvininet");
            return (Criteria) this;
        }

        public Criteria andIEstimateConvininetBetween(Integer value1, Integer value2) {
            addCriterion("I_ESTIMATE_CONVININET between", value1, value2, "iEstimateConvininet");
            return (Criteria) this;
        }

        public Criteria andIEstimateConvininetNotBetween(Integer value1, Integer value2) {
            addCriterion("I_ESTIMATE_CONVININET not between", value1, value2, "iEstimateConvininet");
            return (Criteria) this;
        }

        public Criteria andIEstimateOutlineIsNull() {
            addCriterion("I_ESTIMATE_OUTLINE is null");
            return (Criteria) this;
        }

        public Criteria andIEstimateOutlineIsNotNull() {
            addCriterion("I_ESTIMATE_OUTLINE is not null");
            return (Criteria) this;
        }

        public Criteria andIEstimateOutlineEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_OUTLINE =", value, "iEstimateOutline");
            return (Criteria) this;
        }

        public Criteria andIEstimateOutlineNotEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_OUTLINE <>", value, "iEstimateOutline");
            return (Criteria) this;
        }

        public Criteria andIEstimateOutlineGreaterThan(Integer value) {
            addCriterion("I_ESTIMATE_OUTLINE >", value, "iEstimateOutline");
            return (Criteria) this;
        }

        public Criteria andIEstimateOutlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_OUTLINE >=", value, "iEstimateOutline");
            return (Criteria) this;
        }

        public Criteria andIEstimateOutlineLessThan(Integer value) {
            addCriterion("I_ESTIMATE_OUTLINE <", value, "iEstimateOutline");
            return (Criteria) this;
        }

        public Criteria andIEstimateOutlineLessThanOrEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_OUTLINE <=", value, "iEstimateOutline");
            return (Criteria) this;
        }

        public Criteria andIEstimateOutlineIn(List<Integer> values) {
            addCriterion("I_ESTIMATE_OUTLINE in", values, "iEstimateOutline");
            return (Criteria) this;
        }

        public Criteria andIEstimateOutlineNotIn(List<Integer> values) {
            addCriterion("I_ESTIMATE_OUTLINE not in", values, "iEstimateOutline");
            return (Criteria) this;
        }

        public Criteria andIEstimateOutlineBetween(Integer value1, Integer value2) {
            addCriterion("I_ESTIMATE_OUTLINE between", value1, value2, "iEstimateOutline");
            return (Criteria) this;
        }

        public Criteria andIEstimateOutlineNotBetween(Integer value1, Integer value2) {
            addCriterion("I_ESTIMATE_OUTLINE not between", value1, value2, "iEstimateOutline");
            return (Criteria) this;
        }

        public Criteria andIEstimateContentIsNull() {
            addCriterion("I_ESTIMATE_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andIEstimateContentIsNotNull() {
            addCriterion("I_ESTIMATE_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andIEstimateContentEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_CONTENT =", value, "iEstimateContent");
            return (Criteria) this;
        }

        public Criteria andIEstimateContentNotEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_CONTENT <>", value, "iEstimateContent");
            return (Criteria) this;
        }

        public Criteria andIEstimateContentGreaterThan(Integer value) {
            addCriterion("I_ESTIMATE_CONTENT >", value, "iEstimateContent");
            return (Criteria) this;
        }

        public Criteria andIEstimateContentGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_CONTENT >=", value, "iEstimateContent");
            return (Criteria) this;
        }

        public Criteria andIEstimateContentLessThan(Integer value) {
            addCriterion("I_ESTIMATE_CONTENT <", value, "iEstimateContent");
            return (Criteria) this;
        }

        public Criteria andIEstimateContentLessThanOrEqualTo(Integer value) {
            addCriterion("I_ESTIMATE_CONTENT <=", value, "iEstimateContent");
            return (Criteria) this;
        }

        public Criteria andIEstimateContentIn(List<Integer> values) {
            addCriterion("I_ESTIMATE_CONTENT in", values, "iEstimateContent");
            return (Criteria) this;
        }

        public Criteria andIEstimateContentNotIn(List<Integer> values) {
            addCriterion("I_ESTIMATE_CONTENT not in", values, "iEstimateContent");
            return (Criteria) this;
        }

        public Criteria andIEstimateContentBetween(Integer value1, Integer value2) {
            addCriterion("I_ESTIMATE_CONTENT between", value1, value2, "iEstimateContent");
            return (Criteria) this;
        }

        public Criteria andIEstimateContentNotBetween(Integer value1, Integer value2) {
            addCriterion("I_ESTIMATE_CONTENT not between", value1, value2, "iEstimateContent");
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