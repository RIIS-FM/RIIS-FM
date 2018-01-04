package com.crscd.riis.freightmarket.authority.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FmTradeOrderAuditEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmTradeOrderAuditEntityExample() {
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

        public Criteria andIAuditTypeIsNull() {
            addCriterion("I_AUDIT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIAuditTypeIsNotNull() {
            addCriterion("I_AUDIT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIAuditTypeEqualTo(Integer value) {
            addCriterion("I_AUDIT_TYPE =", value, "iAuditType");
            return (Criteria) this;
        }

        public Criteria andIAuditTypeNotEqualTo(Integer value) {
            addCriterion("I_AUDIT_TYPE <>", value, "iAuditType");
            return (Criteria) this;
        }

        public Criteria andIAuditTypeGreaterThan(Integer value) {
            addCriterion("I_AUDIT_TYPE >", value, "iAuditType");
            return (Criteria) this;
        }

        public Criteria andIAuditTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_AUDIT_TYPE >=", value, "iAuditType");
            return (Criteria) this;
        }

        public Criteria andIAuditTypeLessThan(Integer value) {
            addCriterion("I_AUDIT_TYPE <", value, "iAuditType");
            return (Criteria) this;
        }

        public Criteria andIAuditTypeLessThanOrEqualTo(Integer value) {
            addCriterion("I_AUDIT_TYPE <=", value, "iAuditType");
            return (Criteria) this;
        }

        public Criteria andIAuditTypeIn(List<Integer> values) {
            addCriterion("I_AUDIT_TYPE in", values, "iAuditType");
            return (Criteria) this;
        }

        public Criteria andIAuditTypeNotIn(List<Integer> values) {
            addCriterion("I_AUDIT_TYPE not in", values, "iAuditType");
            return (Criteria) this;
        }

        public Criteria andIAuditTypeBetween(Integer value1, Integer value2) {
            addCriterion("I_AUDIT_TYPE between", value1, value2, "iAuditType");
            return (Criteria) this;
        }

        public Criteria andIAuditTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("I_AUDIT_TYPE not between", value1, value2, "iAuditType");
            return (Criteria) this;
        }

        public Criteria andIAuditAuditorIdIsNull() {
            addCriterion("I_AUDIT_AUDITOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andIAuditAuditorIdIsNotNull() {
            addCriterion("I_AUDIT_AUDITOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIAuditAuditorIdEqualTo(Integer value) {
            addCriterion("I_AUDIT_AUDITOR_ID =", value, "iAuditAuditorId");
            return (Criteria) this;
        }

        public Criteria andIAuditAuditorIdNotEqualTo(Integer value) {
            addCriterion("I_AUDIT_AUDITOR_ID <>", value, "iAuditAuditorId");
            return (Criteria) this;
        }

        public Criteria andIAuditAuditorIdGreaterThan(Integer value) {
            addCriterion("I_AUDIT_AUDITOR_ID >", value, "iAuditAuditorId");
            return (Criteria) this;
        }

        public Criteria andIAuditAuditorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_AUDIT_AUDITOR_ID >=", value, "iAuditAuditorId");
            return (Criteria) this;
        }

        public Criteria andIAuditAuditorIdLessThan(Integer value) {
            addCriterion("I_AUDIT_AUDITOR_ID <", value, "iAuditAuditorId");
            return (Criteria) this;
        }

        public Criteria andIAuditAuditorIdLessThanOrEqualTo(Integer value) {
            addCriterion("I_AUDIT_AUDITOR_ID <=", value, "iAuditAuditorId");
            return (Criteria) this;
        }

        public Criteria andIAuditAuditorIdIn(List<Integer> values) {
            addCriterion("I_AUDIT_AUDITOR_ID in", values, "iAuditAuditorId");
            return (Criteria) this;
        }

        public Criteria andIAuditAuditorIdNotIn(List<Integer> values) {
            addCriterion("I_AUDIT_AUDITOR_ID not in", values, "iAuditAuditorId");
            return (Criteria) this;
        }

        public Criteria andIAuditAuditorIdBetween(Integer value1, Integer value2) {
            addCriterion("I_AUDIT_AUDITOR_ID between", value1, value2, "iAuditAuditorId");
            return (Criteria) this;
        }

        public Criteria andIAuditAuditorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("I_AUDIT_AUDITOR_ID not between", value1, value2, "iAuditAuditorId");
            return (Criteria) this;
        }

        public Criteria andDAuditStartTimeIsNull() {
            addCriterion("D_AUDIT_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDAuditStartTimeIsNotNull() {
            addCriterion("D_AUDIT_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDAuditStartTimeEqualTo(Date value) {
            addCriterion("D_AUDIT_START_TIME =", value, "dAuditStartTime");
            return (Criteria) this;
        }

        public Criteria andDAuditStartTimeNotEqualTo(Date value) {
            addCriterion("D_AUDIT_START_TIME <>", value, "dAuditStartTime");
            return (Criteria) this;
        }

        public Criteria andDAuditStartTimeGreaterThan(Date value) {
            addCriterion("D_AUDIT_START_TIME >", value, "dAuditStartTime");
            return (Criteria) this;
        }

        public Criteria andDAuditStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_AUDIT_START_TIME >=", value, "dAuditStartTime");
            return (Criteria) this;
        }

        public Criteria andDAuditStartTimeLessThan(Date value) {
            addCriterion("D_AUDIT_START_TIME <", value, "dAuditStartTime");
            return (Criteria) this;
        }

        public Criteria andDAuditStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_AUDIT_START_TIME <=", value, "dAuditStartTime");
            return (Criteria) this;
        }

        public Criteria andDAuditStartTimeIn(List<Date> values) {
            addCriterion("D_AUDIT_START_TIME in", values, "dAuditStartTime");
            return (Criteria) this;
        }

        public Criteria andDAuditStartTimeNotIn(List<Date> values) {
            addCriterion("D_AUDIT_START_TIME not in", values, "dAuditStartTime");
            return (Criteria) this;
        }

        public Criteria andDAuditStartTimeBetween(Date value1, Date value2) {
            addCriterion("D_AUDIT_START_TIME between", value1, value2, "dAuditStartTime");
            return (Criteria) this;
        }

        public Criteria andDAuditStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_AUDIT_START_TIME not between", value1, value2, "dAuditStartTime");
            return (Criteria) this;
        }

        public Criteria andDAuditEndTimeIsNull() {
            addCriterion("D_AUDIT_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDAuditEndTimeIsNotNull() {
            addCriterion("D_AUDIT_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDAuditEndTimeEqualTo(Date value) {
            addCriterion("D_AUDIT_END_TIME =", value, "dAuditEndTime");
            return (Criteria) this;
        }

        public Criteria andDAuditEndTimeNotEqualTo(Date value) {
            addCriterion("D_AUDIT_END_TIME <>", value, "dAuditEndTime");
            return (Criteria) this;
        }

        public Criteria andDAuditEndTimeGreaterThan(Date value) {
            addCriterion("D_AUDIT_END_TIME >", value, "dAuditEndTime");
            return (Criteria) this;
        }

        public Criteria andDAuditEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_AUDIT_END_TIME >=", value, "dAuditEndTime");
            return (Criteria) this;
        }

        public Criteria andDAuditEndTimeLessThan(Date value) {
            addCriterion("D_AUDIT_END_TIME <", value, "dAuditEndTime");
            return (Criteria) this;
        }

        public Criteria andDAuditEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_AUDIT_END_TIME <=", value, "dAuditEndTime");
            return (Criteria) this;
        }

        public Criteria andDAuditEndTimeIn(List<Date> values) {
            addCriterion("D_AUDIT_END_TIME in", values, "dAuditEndTime");
            return (Criteria) this;
        }

        public Criteria andDAuditEndTimeNotIn(List<Date> values) {
            addCriterion("D_AUDIT_END_TIME not in", values, "dAuditEndTime");
            return (Criteria) this;
        }

        public Criteria andDAuditEndTimeBetween(Date value1, Date value2) {
            addCriterion("D_AUDIT_END_TIME between", value1, value2, "dAuditEndTime");
            return (Criteria) this;
        }

        public Criteria andDAuditEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_AUDIT_END_TIME not between", value1, value2, "dAuditEndTime");
            return (Criteria) this;
        }

        public Criteria andCAuditSuggestionIsNull() {
            addCriterion("C_AUDIT_SUGGESTION is null");
            return (Criteria) this;
        }

        public Criteria andCAuditSuggestionIsNotNull() {
            addCriterion("C_AUDIT_SUGGESTION is not null");
            return (Criteria) this;
        }

        public Criteria andCAuditSuggestionEqualTo(String value) {
            addCriterion("C_AUDIT_SUGGESTION =", value, "cAuditSuggestion");
            return (Criteria) this;
        }

        public Criteria andCAuditSuggestionNotEqualTo(String value) {
            addCriterion("C_AUDIT_SUGGESTION <>", value, "cAuditSuggestion");
            return (Criteria) this;
        }

        public Criteria andCAuditSuggestionGreaterThan(String value) {
            addCriterion("C_AUDIT_SUGGESTION >", value, "cAuditSuggestion");
            return (Criteria) this;
        }

        public Criteria andCAuditSuggestionGreaterThanOrEqualTo(String value) {
            addCriterion("C_AUDIT_SUGGESTION >=", value, "cAuditSuggestion");
            return (Criteria) this;
        }

        public Criteria andCAuditSuggestionLessThan(String value) {
            addCriterion("C_AUDIT_SUGGESTION <", value, "cAuditSuggestion");
            return (Criteria) this;
        }

        public Criteria andCAuditSuggestionLessThanOrEqualTo(String value) {
            addCriterion("C_AUDIT_SUGGESTION <=", value, "cAuditSuggestion");
            return (Criteria) this;
        }

        public Criteria andCAuditSuggestionLike(String value) {
            addCriterion("C_AUDIT_SUGGESTION like", value, "cAuditSuggestion");
            return (Criteria) this;
        }

        public Criteria andCAuditSuggestionNotLike(String value) {
            addCriterion("C_AUDIT_SUGGESTION not like", value, "cAuditSuggestion");
            return (Criteria) this;
        }

        public Criteria andCAuditSuggestionIn(List<String> values) {
            addCriterion("C_AUDIT_SUGGESTION in", values, "cAuditSuggestion");
            return (Criteria) this;
        }

        public Criteria andCAuditSuggestionNotIn(List<String> values) {
            addCriterion("C_AUDIT_SUGGESTION not in", values, "cAuditSuggestion");
            return (Criteria) this;
        }

        public Criteria andCAuditSuggestionBetween(String value1, String value2) {
            addCriterion("C_AUDIT_SUGGESTION between", value1, value2, "cAuditSuggestion");
            return (Criteria) this;
        }

        public Criteria andCAuditSuggestionNotBetween(String value1, String value2) {
            addCriterion("C_AUDIT_SUGGESTION not between", value1, value2, "cAuditSuggestion");
            return (Criteria) this;
        }

        public Criteria andIAuditResultIsNull() {
            addCriterion("I_AUDIT_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andIAuditResultIsNotNull() {
            addCriterion("I_AUDIT_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andIAuditResultEqualTo(Integer value) {
            addCriterion("I_AUDIT_RESULT =", value, "iAuditResult");
            return (Criteria) this;
        }

        public Criteria andIAuditResultNotEqualTo(Integer value) {
            addCriterion("I_AUDIT_RESULT <>", value, "iAuditResult");
            return (Criteria) this;
        }

        public Criteria andIAuditResultGreaterThan(Integer value) {
            addCriterion("I_AUDIT_RESULT >", value, "iAuditResult");
            return (Criteria) this;
        }

        public Criteria andIAuditResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_AUDIT_RESULT >=", value, "iAuditResult");
            return (Criteria) this;
        }

        public Criteria andIAuditResultLessThan(Integer value) {
            addCriterion("I_AUDIT_RESULT <", value, "iAuditResult");
            return (Criteria) this;
        }

        public Criteria andIAuditResultLessThanOrEqualTo(Integer value) {
            addCriterion("I_AUDIT_RESULT <=", value, "iAuditResult");
            return (Criteria) this;
        }

        public Criteria andIAuditResultIn(List<Integer> values) {
            addCriterion("I_AUDIT_RESULT in", values, "iAuditResult");
            return (Criteria) this;
        }

        public Criteria andIAuditResultNotIn(List<Integer> values) {
            addCriterion("I_AUDIT_RESULT not in", values, "iAuditResult");
            return (Criteria) this;
        }

        public Criteria andIAuditResultBetween(Integer value1, Integer value2) {
            addCriterion("I_AUDIT_RESULT between", value1, value2, "iAuditResult");
            return (Criteria) this;
        }

        public Criteria andIAuditResultNotBetween(Integer value1, Integer value2) {
            addCriterion("I_AUDIT_RESULT not between", value1, value2, "iAuditResult");
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