package com.crscd.riis.freightmarket.authority.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FmTradeOrderTypeEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmTradeOrderTypeEntityExample() {
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

        public Criteria andCTypeLabelIsNull() {
            addCriterion("C_TYPE_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andCTypeLabelIsNotNull() {
            addCriterion("C_TYPE_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andCTypeLabelEqualTo(String value) {
            addCriterion("C_TYPE_LABEL =", value, "cTypeLabel");
            return (Criteria) this;
        }

        public Criteria andCTypeLabelNotEqualTo(String value) {
            addCriterion("C_TYPE_LABEL <>", value, "cTypeLabel");
            return (Criteria) this;
        }

        public Criteria andCTypeLabelGreaterThan(String value) {
            addCriterion("C_TYPE_LABEL >", value, "cTypeLabel");
            return (Criteria) this;
        }

        public Criteria andCTypeLabelGreaterThanOrEqualTo(String value) {
            addCriterion("C_TYPE_LABEL >=", value, "cTypeLabel");
            return (Criteria) this;
        }

        public Criteria andCTypeLabelLessThan(String value) {
            addCriterion("C_TYPE_LABEL <", value, "cTypeLabel");
            return (Criteria) this;
        }

        public Criteria andCTypeLabelLessThanOrEqualTo(String value) {
            addCriterion("C_TYPE_LABEL <=", value, "cTypeLabel");
            return (Criteria) this;
        }

        public Criteria andCTypeLabelLike(String value) {
            addCriterion("C_TYPE_LABEL like", value, "cTypeLabel");
            return (Criteria) this;
        }

        public Criteria andCTypeLabelNotLike(String value) {
            addCriterion("C_TYPE_LABEL not like", value, "cTypeLabel");
            return (Criteria) this;
        }

        public Criteria andCTypeLabelIn(List<String> values) {
            addCriterion("C_TYPE_LABEL in", values, "cTypeLabel");
            return (Criteria) this;
        }

        public Criteria andCTypeLabelNotIn(List<String> values) {
            addCriterion("C_TYPE_LABEL not in", values, "cTypeLabel");
            return (Criteria) this;
        }

        public Criteria andCTypeLabelBetween(String value1, String value2) {
            addCriterion("C_TYPE_LABEL between", value1, value2, "cTypeLabel");
            return (Criteria) this;
        }

        public Criteria andCTypeLabelNotBetween(String value1, String value2) {
            addCriterion("C_TYPE_LABEL not between", value1, value2, "cTypeLabel");
            return (Criteria) this;
        }

        public Criteria andCTypeValueIsNull() {
            addCriterion("C_TYPE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andCTypeValueIsNotNull() {
            addCriterion("C_TYPE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andCTypeValueEqualTo(String value) {
            addCriterion("C_TYPE_VALUE =", value, "cTypeValue");
            return (Criteria) this;
        }

        public Criteria andCTypeValueNotEqualTo(String value) {
            addCriterion("C_TYPE_VALUE <>", value, "cTypeValue");
            return (Criteria) this;
        }

        public Criteria andCTypeValueGreaterThan(String value) {
            addCriterion("C_TYPE_VALUE >", value, "cTypeValue");
            return (Criteria) this;
        }

        public Criteria andCTypeValueGreaterThanOrEqualTo(String value) {
            addCriterion("C_TYPE_VALUE >=", value, "cTypeValue");
            return (Criteria) this;
        }

        public Criteria andCTypeValueLessThan(String value) {
            addCriterion("C_TYPE_VALUE <", value, "cTypeValue");
            return (Criteria) this;
        }

        public Criteria andCTypeValueLessThanOrEqualTo(String value) {
            addCriterion("C_TYPE_VALUE <=", value, "cTypeValue");
            return (Criteria) this;
        }

        public Criteria andCTypeValueLike(String value) {
            addCriterion("C_TYPE_VALUE like", value, "cTypeValue");
            return (Criteria) this;
        }

        public Criteria andCTypeValueNotLike(String value) {
            addCriterion("C_TYPE_VALUE not like", value, "cTypeValue");
            return (Criteria) this;
        }

        public Criteria andCTypeValueIn(List<String> values) {
            addCriterion("C_TYPE_VALUE in", values, "cTypeValue");
            return (Criteria) this;
        }

        public Criteria andCTypeValueNotIn(List<String> values) {
            addCriterion("C_TYPE_VALUE not in", values, "cTypeValue");
            return (Criteria) this;
        }

        public Criteria andCTypeValueBetween(String value1, String value2) {
            addCriterion("C_TYPE_VALUE between", value1, value2, "cTypeValue");
            return (Criteria) this;
        }

        public Criteria andCTypeValueNotBetween(String value1, String value2) {
            addCriterion("C_TYPE_VALUE not between", value1, value2, "cTypeValue");
            return (Criteria) this;
        }

        public Criteria andDTypeCreateTimeIsNull() {
            addCriterion("D_TYPE_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTypeCreateTimeIsNotNull() {
            addCriterion("D_TYPE_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTypeCreateTimeEqualTo(Date value) {
            addCriterion("D_TYPE_CREATE_TIME =", value, "dTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTypeCreateTimeNotEqualTo(Date value) {
            addCriterion("D_TYPE_CREATE_TIME <>", value, "dTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTypeCreateTimeGreaterThan(Date value) {
            addCriterion("D_TYPE_CREATE_TIME >", value, "dTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTypeCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TYPE_CREATE_TIME >=", value, "dTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTypeCreateTimeLessThan(Date value) {
            addCriterion("D_TYPE_CREATE_TIME <", value, "dTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTypeCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TYPE_CREATE_TIME <=", value, "dTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTypeCreateTimeIn(List<Date> values) {
            addCriterion("D_TYPE_CREATE_TIME in", values, "dTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTypeCreateTimeNotIn(List<Date> values) {
            addCriterion("D_TYPE_CREATE_TIME not in", values, "dTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTypeCreateTimeBetween(Date value1, Date value2) {
            addCriterion("D_TYPE_CREATE_TIME between", value1, value2, "dTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTypeCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TYPE_CREATE_TIME not between", value1, value2, "dTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTypeModifyTimeIsNull() {
            addCriterion("D_TYPE_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTypeModifyTimeIsNotNull() {
            addCriterion("D_TYPE_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTypeModifyTimeEqualTo(Date value) {
            addCriterion("D_TYPE_MODIFY_TIME =", value, "dTypeModifyTime");
            return (Criteria) this;
        }

        public Criteria andDTypeModifyTimeNotEqualTo(Date value) {
            addCriterion("D_TYPE_MODIFY_TIME <>", value, "dTypeModifyTime");
            return (Criteria) this;
        }

        public Criteria andDTypeModifyTimeGreaterThan(Date value) {
            addCriterion("D_TYPE_MODIFY_TIME >", value, "dTypeModifyTime");
            return (Criteria) this;
        }

        public Criteria andDTypeModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TYPE_MODIFY_TIME >=", value, "dTypeModifyTime");
            return (Criteria) this;
        }

        public Criteria andDTypeModifyTimeLessThan(Date value) {
            addCriterion("D_TYPE_MODIFY_TIME <", value, "dTypeModifyTime");
            return (Criteria) this;
        }

        public Criteria andDTypeModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TYPE_MODIFY_TIME <=", value, "dTypeModifyTime");
            return (Criteria) this;
        }

        public Criteria andDTypeModifyTimeIn(List<Date> values) {
            addCriterion("D_TYPE_MODIFY_TIME in", values, "dTypeModifyTime");
            return (Criteria) this;
        }

        public Criteria andDTypeModifyTimeNotIn(List<Date> values) {
            addCriterion("D_TYPE_MODIFY_TIME not in", values, "dTypeModifyTime");
            return (Criteria) this;
        }

        public Criteria andDTypeModifyTimeBetween(Date value1, Date value2) {
            addCriterion("D_TYPE_MODIFY_TIME between", value1, value2, "dTypeModifyTime");
            return (Criteria) this;
        }

        public Criteria andDTypeModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TYPE_MODIFY_TIME not between", value1, value2, "dTypeModifyTime");
            return (Criteria) this;
        }

        public Criteria andDTypeDeleteTimeIsNull() {
            addCriterion("D_TYPE_DELETE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTypeDeleteTimeIsNotNull() {
            addCriterion("D_TYPE_DELETE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTypeDeleteTimeEqualTo(Date value) {
            addCriterion("D_TYPE_DELETE_TIME =", value, "dTypeDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDTypeDeleteTimeNotEqualTo(Date value) {
            addCriterion("D_TYPE_DELETE_TIME <>", value, "dTypeDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDTypeDeleteTimeGreaterThan(Date value) {
            addCriterion("D_TYPE_DELETE_TIME >", value, "dTypeDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDTypeDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TYPE_DELETE_TIME >=", value, "dTypeDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDTypeDeleteTimeLessThan(Date value) {
            addCriterion("D_TYPE_DELETE_TIME <", value, "dTypeDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDTypeDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TYPE_DELETE_TIME <=", value, "dTypeDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDTypeDeleteTimeIn(List<Date> values) {
            addCriterion("D_TYPE_DELETE_TIME in", values, "dTypeDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDTypeDeleteTimeNotIn(List<Date> values) {
            addCriterion("D_TYPE_DELETE_TIME not in", values, "dTypeDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDTypeDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("D_TYPE_DELETE_TIME between", value1, value2, "dTypeDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDTypeDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TYPE_DELETE_TIME not between", value1, value2, "dTypeDeleteTime");
            return (Criteria) this;
        }

        public Criteria andITypeCreaterIsNull() {
            addCriterion("I_TYPE_CREATER is null");
            return (Criteria) this;
        }

        public Criteria andITypeCreaterIsNotNull() {
            addCriterion("I_TYPE_CREATER is not null");
            return (Criteria) this;
        }

        public Criteria andITypeCreaterEqualTo(Integer value) {
            addCriterion("I_TYPE_CREATER =", value, "iTypeCreater");
            return (Criteria) this;
        }

        public Criteria andITypeCreaterNotEqualTo(Integer value) {
            addCriterion("I_TYPE_CREATER <>", value, "iTypeCreater");
            return (Criteria) this;
        }

        public Criteria andITypeCreaterGreaterThan(Integer value) {
            addCriterion("I_TYPE_CREATER >", value, "iTypeCreater");
            return (Criteria) this;
        }

        public Criteria andITypeCreaterGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_TYPE_CREATER >=", value, "iTypeCreater");
            return (Criteria) this;
        }

        public Criteria andITypeCreaterLessThan(Integer value) {
            addCriterion("I_TYPE_CREATER <", value, "iTypeCreater");
            return (Criteria) this;
        }

        public Criteria andITypeCreaterLessThanOrEqualTo(Integer value) {
            addCriterion("I_TYPE_CREATER <=", value, "iTypeCreater");
            return (Criteria) this;
        }

        public Criteria andITypeCreaterIn(List<Integer> values) {
            addCriterion("I_TYPE_CREATER in", values, "iTypeCreater");
            return (Criteria) this;
        }

        public Criteria andITypeCreaterNotIn(List<Integer> values) {
            addCriterion("I_TYPE_CREATER not in", values, "iTypeCreater");
            return (Criteria) this;
        }

        public Criteria andITypeCreaterBetween(Integer value1, Integer value2) {
            addCriterion("I_TYPE_CREATER between", value1, value2, "iTypeCreater");
            return (Criteria) this;
        }

        public Criteria andITypeCreaterNotBetween(Integer value1, Integer value2) {
            addCriterion("I_TYPE_CREATER not between", value1, value2, "iTypeCreater");
            return (Criteria) this;
        }

        public Criteria andITypeModifierIsNull() {
            addCriterion("I_TYPE_MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andITypeModifierIsNotNull() {
            addCriterion("I_TYPE_MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andITypeModifierEqualTo(Integer value) {
            addCriterion("I_TYPE_MODIFIER =", value, "iTypeModifier");
            return (Criteria) this;
        }

        public Criteria andITypeModifierNotEqualTo(Integer value) {
            addCriterion("I_TYPE_MODIFIER <>", value, "iTypeModifier");
            return (Criteria) this;
        }

        public Criteria andITypeModifierGreaterThan(Integer value) {
            addCriterion("I_TYPE_MODIFIER >", value, "iTypeModifier");
            return (Criteria) this;
        }

        public Criteria andITypeModifierGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_TYPE_MODIFIER >=", value, "iTypeModifier");
            return (Criteria) this;
        }

        public Criteria andITypeModifierLessThan(Integer value) {
            addCriterion("I_TYPE_MODIFIER <", value, "iTypeModifier");
            return (Criteria) this;
        }

        public Criteria andITypeModifierLessThanOrEqualTo(Integer value) {
            addCriterion("I_TYPE_MODIFIER <=", value, "iTypeModifier");
            return (Criteria) this;
        }

        public Criteria andITypeModifierIn(List<Integer> values) {
            addCriterion("I_TYPE_MODIFIER in", values, "iTypeModifier");
            return (Criteria) this;
        }

        public Criteria andITypeModifierNotIn(List<Integer> values) {
            addCriterion("I_TYPE_MODIFIER not in", values, "iTypeModifier");
            return (Criteria) this;
        }

        public Criteria andITypeModifierBetween(Integer value1, Integer value2) {
            addCriterion("I_TYPE_MODIFIER between", value1, value2, "iTypeModifier");
            return (Criteria) this;
        }

        public Criteria andITypeModifierNotBetween(Integer value1, Integer value2) {
            addCriterion("I_TYPE_MODIFIER not between", value1, value2, "iTypeModifier");
            return (Criteria) this;
        }

        public Criteria andITypeDeleteIsNull() {
            addCriterion("I_TYPE_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andITypeDeleteIsNotNull() {
            addCriterion("I_TYPE_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andITypeDeleteEqualTo(Integer value) {
            addCriterion("I_TYPE_DELETE =", value, "iTypeDelete");
            return (Criteria) this;
        }

        public Criteria andITypeDeleteNotEqualTo(Integer value) {
            addCriterion("I_TYPE_DELETE <>", value, "iTypeDelete");
            return (Criteria) this;
        }

        public Criteria andITypeDeleteGreaterThan(Integer value) {
            addCriterion("I_TYPE_DELETE >", value, "iTypeDelete");
            return (Criteria) this;
        }

        public Criteria andITypeDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_TYPE_DELETE >=", value, "iTypeDelete");
            return (Criteria) this;
        }

        public Criteria andITypeDeleteLessThan(Integer value) {
            addCriterion("I_TYPE_DELETE <", value, "iTypeDelete");
            return (Criteria) this;
        }

        public Criteria andITypeDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("I_TYPE_DELETE <=", value, "iTypeDelete");
            return (Criteria) this;
        }

        public Criteria andITypeDeleteIn(List<Integer> values) {
            addCriterion("I_TYPE_DELETE in", values, "iTypeDelete");
            return (Criteria) this;
        }

        public Criteria andITypeDeleteNotIn(List<Integer> values) {
            addCriterion("I_TYPE_DELETE not in", values, "iTypeDelete");
            return (Criteria) this;
        }

        public Criteria andITypeDeleteBetween(Integer value1, Integer value2) {
            addCriterion("I_TYPE_DELETE between", value1, value2, "iTypeDelete");
            return (Criteria) this;
        }

        public Criteria andITypeDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("I_TYPE_DELETE not between", value1, value2, "iTypeDelete");
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