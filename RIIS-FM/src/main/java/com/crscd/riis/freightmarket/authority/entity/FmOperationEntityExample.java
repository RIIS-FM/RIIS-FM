package com.crscd.riis.freightmarket.authority.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FmOperationEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmOperationEntityExample() {
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

        public Criteria andCOperationNameIsNull() {
            addCriterion("C_OPERATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCOperationNameIsNotNull() {
            addCriterion("C_OPERATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCOperationNameEqualTo(String value) {
            addCriterion("C_OPERATION_NAME =", value, "cOperationName");
            return (Criteria) this;
        }

        public Criteria andCOperationNameNotEqualTo(String value) {
            addCriterion("C_OPERATION_NAME <>", value, "cOperationName");
            return (Criteria) this;
        }

        public Criteria andCOperationNameGreaterThan(String value) {
            addCriterion("C_OPERATION_NAME >", value, "cOperationName");
            return (Criteria) this;
        }

        public Criteria andCOperationNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_OPERATION_NAME >=", value, "cOperationName");
            return (Criteria) this;
        }

        public Criteria andCOperationNameLessThan(String value) {
            addCriterion("C_OPERATION_NAME <", value, "cOperationName");
            return (Criteria) this;
        }

        public Criteria andCOperationNameLessThanOrEqualTo(String value) {
            addCriterion("C_OPERATION_NAME <=", value, "cOperationName");
            return (Criteria) this;
        }

        public Criteria andCOperationNameLike(String value) {
            addCriterion("C_OPERATION_NAME like", value, "cOperationName");
            return (Criteria) this;
        }

        public Criteria andCOperationNameNotLike(String value) {
            addCriterion("C_OPERATION_NAME not like", value, "cOperationName");
            return (Criteria) this;
        }

        public Criteria andCOperationNameIn(List<String> values) {
            addCriterion("C_OPERATION_NAME in", values, "cOperationName");
            return (Criteria) this;
        }

        public Criteria andCOperationNameNotIn(List<String> values) {
            addCriterion("C_OPERATION_NAME not in", values, "cOperationName");
            return (Criteria) this;
        }

        public Criteria andCOperationNameBetween(String value1, String value2) {
            addCriterion("C_OPERATION_NAME between", value1, value2, "cOperationName");
            return (Criteria) this;
        }

        public Criteria andCOperationNameNotBetween(String value1, String value2) {
            addCriterion("C_OPERATION_NAME not between", value1, value2, "cOperationName");
            return (Criteria) this;
        }

        public Criteria andCOperationUrlIsNull() {
            addCriterion("C_OPERATION_URL is null");
            return (Criteria) this;
        }

        public Criteria andCOperationUrlIsNotNull() {
            addCriterion("C_OPERATION_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCOperationUrlEqualTo(String value) {
            addCriterion("C_OPERATION_URL =", value, "cOperationUrl");
            return (Criteria) this;
        }

        public Criteria andCOperationUrlNotEqualTo(String value) {
            addCriterion("C_OPERATION_URL <>", value, "cOperationUrl");
            return (Criteria) this;
        }

        public Criteria andCOperationUrlGreaterThan(String value) {
            addCriterion("C_OPERATION_URL >", value, "cOperationUrl");
            return (Criteria) this;
        }

        public Criteria andCOperationUrlGreaterThanOrEqualTo(String value) {
            addCriterion("C_OPERATION_URL >=", value, "cOperationUrl");
            return (Criteria) this;
        }

        public Criteria andCOperationUrlLessThan(String value) {
            addCriterion("C_OPERATION_URL <", value, "cOperationUrl");
            return (Criteria) this;
        }

        public Criteria andCOperationUrlLessThanOrEqualTo(String value) {
            addCriterion("C_OPERATION_URL <=", value, "cOperationUrl");
            return (Criteria) this;
        }

        public Criteria andCOperationUrlLike(String value) {
            addCriterion("C_OPERATION_URL like", value, "cOperationUrl");
            return (Criteria) this;
        }

        public Criteria andCOperationUrlNotLike(String value) {
            addCriterion("C_OPERATION_URL not like", value, "cOperationUrl");
            return (Criteria) this;
        }

        public Criteria andCOperationUrlIn(List<String> values) {
            addCriterion("C_OPERATION_URL in", values, "cOperationUrl");
            return (Criteria) this;
        }

        public Criteria andCOperationUrlNotIn(List<String> values) {
            addCriterion("C_OPERATION_URL not in", values, "cOperationUrl");
            return (Criteria) this;
        }

        public Criteria andCOperationUrlBetween(String value1, String value2) {
            addCriterion("C_OPERATION_URL between", value1, value2, "cOperationUrl");
            return (Criteria) this;
        }

        public Criteria andCOperationUrlNotBetween(String value1, String value2) {
            addCriterion("C_OPERATION_URL not between", value1, value2, "cOperationUrl");
            return (Criteria) this;
        }

        public Criteria andICreaterIdIsNull() {
            addCriterion("I_CREATER_ID is null");
            return (Criteria) this;
        }

        public Criteria andICreaterIdIsNotNull() {
            addCriterion("I_CREATER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andICreaterIdEqualTo(Integer value) {
            addCriterion("I_CREATER_ID =", value, "iCreaterId");
            return (Criteria) this;
        }

        public Criteria andICreaterIdNotEqualTo(Integer value) {
            addCriterion("I_CREATER_ID <>", value, "iCreaterId");
            return (Criteria) this;
        }

        public Criteria andICreaterIdGreaterThan(Integer value) {
            addCriterion("I_CREATER_ID >", value, "iCreaterId");
            return (Criteria) this;
        }

        public Criteria andICreaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_CREATER_ID >=", value, "iCreaterId");
            return (Criteria) this;
        }

        public Criteria andICreaterIdLessThan(Integer value) {
            addCriterion("I_CREATER_ID <", value, "iCreaterId");
            return (Criteria) this;
        }

        public Criteria andICreaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("I_CREATER_ID <=", value, "iCreaterId");
            return (Criteria) this;
        }

        public Criteria andICreaterIdIn(List<Integer> values) {
            addCriterion("I_CREATER_ID in", values, "iCreaterId");
            return (Criteria) this;
        }

        public Criteria andICreaterIdNotIn(List<Integer> values) {
            addCriterion("I_CREATER_ID not in", values, "iCreaterId");
            return (Criteria) this;
        }

        public Criteria andICreaterIdBetween(Integer value1, Integer value2) {
            addCriterion("I_CREATER_ID between", value1, value2, "iCreaterId");
            return (Criteria) this;
        }

        public Criteria andICreaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("I_CREATER_ID not between", value1, value2, "iCreaterId");
            return (Criteria) this;
        }

        public Criteria andDCreatedTimeIsNull() {
            addCriterion("D_CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDCreatedTimeIsNotNull() {
            addCriterion("D_CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDCreatedTimeEqualTo(Date value) {
            addCriterion("D_CREATED_TIME =", value, "dCreatedTime");
            return (Criteria) this;
        }

        public Criteria andDCreatedTimeNotEqualTo(Date value) {
            addCriterion("D_CREATED_TIME <>", value, "dCreatedTime");
            return (Criteria) this;
        }

        public Criteria andDCreatedTimeGreaterThan(Date value) {
            addCriterion("D_CREATED_TIME >", value, "dCreatedTime");
            return (Criteria) this;
        }

        public Criteria andDCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_CREATED_TIME >=", value, "dCreatedTime");
            return (Criteria) this;
        }

        public Criteria andDCreatedTimeLessThan(Date value) {
            addCriterion("D_CREATED_TIME <", value, "dCreatedTime");
            return (Criteria) this;
        }

        public Criteria andDCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_CREATED_TIME <=", value, "dCreatedTime");
            return (Criteria) this;
        }

        public Criteria andDCreatedTimeIn(List<Date> values) {
            addCriterion("D_CREATED_TIME in", values, "dCreatedTime");
            return (Criteria) this;
        }

        public Criteria andDCreatedTimeNotIn(List<Date> values) {
            addCriterion("D_CREATED_TIME not in", values, "dCreatedTime");
            return (Criteria) this;
        }

        public Criteria andDCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("D_CREATED_TIME between", value1, value2, "dCreatedTime");
            return (Criteria) this;
        }

        public Criteria andDCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_CREATED_TIME not between", value1, value2, "dCreatedTime");
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