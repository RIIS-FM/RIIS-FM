package com.crscd.riis.freightmarket.authority.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FmAccountGroupEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmAccountGroupEntityExample() {
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

        public Criteria andIGroupIdIsNull() {
            addCriterion("I_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andIGroupIdIsNotNull() {
            addCriterion("I_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIGroupIdEqualTo(Integer value) {
            addCriterion("I_GROUP_ID =", value, "iGroupId");
            return (Criteria) this;
        }

        public Criteria andIGroupIdNotEqualTo(Integer value) {
            addCriterion("I_GROUP_ID <>", value, "iGroupId");
            return (Criteria) this;
        }

        public Criteria andIGroupIdGreaterThan(Integer value) {
            addCriterion("I_GROUP_ID >", value, "iGroupId");
            return (Criteria) this;
        }

        public Criteria andIGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_GROUP_ID >=", value, "iGroupId");
            return (Criteria) this;
        }

        public Criteria andIGroupIdLessThan(Integer value) {
            addCriterion("I_GROUP_ID <", value, "iGroupId");
            return (Criteria) this;
        }

        public Criteria andIGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("I_GROUP_ID <=", value, "iGroupId");
            return (Criteria) this;
        }

        public Criteria andIGroupIdIn(List<Integer> values) {
            addCriterion("I_GROUP_ID in", values, "iGroupId");
            return (Criteria) this;
        }

        public Criteria andIGroupIdNotIn(List<Integer> values) {
            addCriterion("I_GROUP_ID not in", values, "iGroupId");
            return (Criteria) this;
        }

        public Criteria andIGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("I_GROUP_ID between", value1, value2, "iGroupId");
            return (Criteria) this;
        }

        public Criteria andIGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("I_GROUP_ID not between", value1, value2, "iGroupId");
            return (Criteria) this;
        }

        public Criteria andIAccountIdIsNull() {
            addCriterion("I_ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andIAccountIdIsNotNull() {
            addCriterion("I_ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIAccountIdEqualTo(Integer value) {
            addCriterion("I_ACCOUNT_ID =", value, "iAccountId");
            return (Criteria) this;
        }

        public Criteria andIAccountIdNotEqualTo(Integer value) {
            addCriterion("I_ACCOUNT_ID <>", value, "iAccountId");
            return (Criteria) this;
        }

        public Criteria andIAccountIdGreaterThan(Integer value) {
            addCriterion("I_ACCOUNT_ID >", value, "iAccountId");
            return (Criteria) this;
        }

        public Criteria andIAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_ACCOUNT_ID >=", value, "iAccountId");
            return (Criteria) this;
        }

        public Criteria andIAccountIdLessThan(Integer value) {
            addCriterion("I_ACCOUNT_ID <", value, "iAccountId");
            return (Criteria) this;
        }

        public Criteria andIAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("I_ACCOUNT_ID <=", value, "iAccountId");
            return (Criteria) this;
        }

        public Criteria andIAccountIdIn(List<Integer> values) {
            addCriterion("I_ACCOUNT_ID in", values, "iAccountId");
            return (Criteria) this;
        }

        public Criteria andIAccountIdNotIn(List<Integer> values) {
            addCriterion("I_ACCOUNT_ID not in", values, "iAccountId");
            return (Criteria) this;
        }

        public Criteria andIAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("I_ACCOUNT_ID between", value1, value2, "iAccountId");
            return (Criteria) this;
        }

        public Criteria andIAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("I_ACCOUNT_ID not between", value1, value2, "iAccountId");
            return (Criteria) this;
        }

        public Criteria andICreatorIsNull() {
            addCriterion("I_CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andICreatorIsNotNull() {
            addCriterion("I_CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andICreatorEqualTo(Integer value) {
            addCriterion("I_CREATOR =", value, "iCreator");
            return (Criteria) this;
        }

        public Criteria andICreatorNotEqualTo(Integer value) {
            addCriterion("I_CREATOR <>", value, "iCreator");
            return (Criteria) this;
        }

        public Criteria andICreatorGreaterThan(Integer value) {
            addCriterion("I_CREATOR >", value, "iCreator");
            return (Criteria) this;
        }

        public Criteria andICreatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_CREATOR >=", value, "iCreator");
            return (Criteria) this;
        }

        public Criteria andICreatorLessThan(Integer value) {
            addCriterion("I_CREATOR <", value, "iCreator");
            return (Criteria) this;
        }

        public Criteria andICreatorLessThanOrEqualTo(Integer value) {
            addCriterion("I_CREATOR <=", value, "iCreator");
            return (Criteria) this;
        }

        public Criteria andICreatorIn(List<Integer> values) {
            addCriterion("I_CREATOR in", values, "iCreator");
            return (Criteria) this;
        }

        public Criteria andICreatorNotIn(List<Integer> values) {
            addCriterion("I_CREATOR not in", values, "iCreator");
            return (Criteria) this;
        }

        public Criteria andICreatorBetween(Integer value1, Integer value2) {
            addCriterion("I_CREATOR between", value1, value2, "iCreator");
            return (Criteria) this;
        }

        public Criteria andICreatorNotBetween(Integer value1, Integer value2) {
            addCriterion("I_CREATOR not between", value1, value2, "iCreator");
            return (Criteria) this;
        }

        public Criteria andDDateIsNull() {
            addCriterion("D_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDDateIsNotNull() {
            addCriterion("D_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDDateEqualTo(Date value) {
            addCriterion("D_DATE =", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateNotEqualTo(Date value) {
            addCriterion("D_DATE <>", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateGreaterThan(Date value) {
            addCriterion("D_DATE >", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateGreaterThanOrEqualTo(Date value) {
            addCriterion("D_DATE >=", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateLessThan(Date value) {
            addCriterion("D_DATE <", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateLessThanOrEqualTo(Date value) {
            addCriterion("D_DATE <=", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateIn(List<Date> values) {
            addCriterion("D_DATE in", values, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateNotIn(List<Date> values) {
            addCriterion("D_DATE not in", values, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateBetween(Date value1, Date value2) {
            addCriterion("D_DATE between", value1, value2, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateNotBetween(Date value1, Date value2) {
            addCriterion("D_DATE not between", value1, value2, "dDate");
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