package com.crscd.riis.freightmarket.authority.entity;

import java.util.ArrayList;
import java.util.List;

public class FmAccountEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmAccountEntityExample() {
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

        public Criteria andCLoginNameIsNull() {
            addCriterion("C_LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCLoginNameIsNotNull() {
            addCriterion("C_LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCLoginNameEqualTo(String value) {
            addCriterion("C_LOGIN_NAME =", value, "cLoginName");
            return (Criteria) this;
        }

        public Criteria andCLoginNameNotEqualTo(String value) {
            addCriterion("C_LOGIN_NAME <>", value, "cLoginName");
            return (Criteria) this;
        }

        public Criteria andCLoginNameGreaterThan(String value) {
            addCriterion("C_LOGIN_NAME >", value, "cLoginName");
            return (Criteria) this;
        }

        public Criteria andCLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_LOGIN_NAME >=", value, "cLoginName");
            return (Criteria) this;
        }

        public Criteria andCLoginNameLessThan(String value) {
            addCriterion("C_LOGIN_NAME <", value, "cLoginName");
            return (Criteria) this;
        }

        public Criteria andCLoginNameLessThanOrEqualTo(String value) {
            addCriterion("C_LOGIN_NAME <=", value, "cLoginName");
            return (Criteria) this;
        }

        public Criteria andCLoginNameLike(String value) {
            addCriterion("C_LOGIN_NAME like", value, "cLoginName");
            return (Criteria) this;
        }

        public Criteria andCLoginNameNotLike(String value) {
            addCriterion("C_LOGIN_NAME not like", value, "cLoginName");
            return (Criteria) this;
        }

        public Criteria andCLoginNameIn(List<String> values) {
            addCriterion("C_LOGIN_NAME in", values, "cLoginName");
            return (Criteria) this;
        }

        public Criteria andCLoginNameNotIn(List<String> values) {
            addCriterion("C_LOGIN_NAME not in", values, "cLoginName");
            return (Criteria) this;
        }

        public Criteria andCLoginNameBetween(String value1, String value2) {
            addCriterion("C_LOGIN_NAME between", value1, value2, "cLoginName");
            return (Criteria) this;
        }

        public Criteria andCLoginNameNotBetween(String value1, String value2) {
            addCriterion("C_LOGIN_NAME not between", value1, value2, "cLoginName");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdIsNull() {
            addCriterion("C_LOGIN_PWD is null");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdIsNotNull() {
            addCriterion("C_LOGIN_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdEqualTo(String value) {
            addCriterion("C_LOGIN_PWD =", value, "cLoginPwd");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdNotEqualTo(String value) {
            addCriterion("C_LOGIN_PWD <>", value, "cLoginPwd");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdGreaterThan(String value) {
            addCriterion("C_LOGIN_PWD >", value, "cLoginPwd");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdGreaterThanOrEqualTo(String value) {
            addCriterion("C_LOGIN_PWD >=", value, "cLoginPwd");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdLessThan(String value) {
            addCriterion("C_LOGIN_PWD <", value, "cLoginPwd");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdLessThanOrEqualTo(String value) {
            addCriterion("C_LOGIN_PWD <=", value, "cLoginPwd");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdLike(String value) {
            addCriterion("C_LOGIN_PWD like", value, "cLoginPwd");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdNotLike(String value) {
            addCriterion("C_LOGIN_PWD not like", value, "cLoginPwd");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdIn(List<String> values) {
            addCriterion("C_LOGIN_PWD in", values, "cLoginPwd");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdNotIn(List<String> values) {
            addCriterion("C_LOGIN_PWD not in", values, "cLoginPwd");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdBetween(String value1, String value2) {
            addCriterion("C_LOGIN_PWD between", value1, value2, "cLoginPwd");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdNotBetween(String value1, String value2) {
            addCriterion("C_LOGIN_PWD not between", value1, value2, "cLoginPwd");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdSaltIsNull() {
            addCriterion("C_LOGIN_PWD_SALT is null");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdSaltIsNotNull() {
            addCriterion("C_LOGIN_PWD_SALT is not null");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdSaltEqualTo(String value) {
            addCriterion("C_LOGIN_PWD_SALT =", value, "cLoginPwdSalt");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdSaltNotEqualTo(String value) {
            addCriterion("C_LOGIN_PWD_SALT <>", value, "cLoginPwdSalt");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdSaltGreaterThan(String value) {
            addCriterion("C_LOGIN_PWD_SALT >", value, "cLoginPwdSalt");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdSaltGreaterThanOrEqualTo(String value) {
            addCriterion("C_LOGIN_PWD_SALT >=", value, "cLoginPwdSalt");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdSaltLessThan(String value) {
            addCriterion("C_LOGIN_PWD_SALT <", value, "cLoginPwdSalt");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdSaltLessThanOrEqualTo(String value) {
            addCriterion("C_LOGIN_PWD_SALT <=", value, "cLoginPwdSalt");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdSaltLike(String value) {
            addCriterion("C_LOGIN_PWD_SALT like", value, "cLoginPwdSalt");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdSaltNotLike(String value) {
            addCriterion("C_LOGIN_PWD_SALT not like", value, "cLoginPwdSalt");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdSaltIn(List<String> values) {
            addCriterion("C_LOGIN_PWD_SALT in", values, "cLoginPwdSalt");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdSaltNotIn(List<String> values) {
            addCriterion("C_LOGIN_PWD_SALT not in", values, "cLoginPwdSalt");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdSaltBetween(String value1, String value2) {
            addCriterion("C_LOGIN_PWD_SALT between", value1, value2, "cLoginPwdSalt");
            return (Criteria) this;
        }

        public Criteria andCLoginPwdSaltNotBetween(String value1, String value2) {
            addCriterion("C_LOGIN_PWD_SALT not between", value1, value2, "cLoginPwdSalt");
            return (Criteria) this;
        }

        public Criteria andILoginFlagIsNull() {
            addCriterion("I_LOGIN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andILoginFlagIsNotNull() {
            addCriterion("I_LOGIN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andILoginFlagEqualTo(Integer value) {
            addCriterion("I_LOGIN_FLAG =", value, "iLoginFlag");
            return (Criteria) this;
        }

        public Criteria andILoginFlagNotEqualTo(Integer value) {
            addCriterion("I_LOGIN_FLAG <>", value, "iLoginFlag");
            return (Criteria) this;
        }

        public Criteria andILoginFlagGreaterThan(Integer value) {
            addCriterion("I_LOGIN_FLAG >", value, "iLoginFlag");
            return (Criteria) this;
        }

        public Criteria andILoginFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_LOGIN_FLAG >=", value, "iLoginFlag");
            return (Criteria) this;
        }

        public Criteria andILoginFlagLessThan(Integer value) {
            addCriterion("I_LOGIN_FLAG <", value, "iLoginFlag");
            return (Criteria) this;
        }

        public Criteria andILoginFlagLessThanOrEqualTo(Integer value) {
            addCriterion("I_LOGIN_FLAG <=", value, "iLoginFlag");
            return (Criteria) this;
        }

        public Criteria andILoginFlagIn(List<Integer> values) {
            addCriterion("I_LOGIN_FLAG in", values, "iLoginFlag");
            return (Criteria) this;
        }

        public Criteria andILoginFlagNotIn(List<Integer> values) {
            addCriterion("I_LOGIN_FLAG not in", values, "iLoginFlag");
            return (Criteria) this;
        }

        public Criteria andILoginFlagBetween(Integer value1, Integer value2) {
            addCriterion("I_LOGIN_FLAG between", value1, value2, "iLoginFlag");
            return (Criteria) this;
        }

        public Criteria andILoginFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("I_LOGIN_FLAG not between", value1, value2, "iLoginFlag");
            return (Criteria) this;
        }

        public Criteria andILockFlagIsNull() {
            addCriterion("I_LOCK_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andILockFlagIsNotNull() {
            addCriterion("I_LOCK_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andILockFlagEqualTo(Integer value) {
            addCriterion("I_LOCK_FLAG =", value, "iLockFlag");
            return (Criteria) this;
        }

        public Criteria andILockFlagNotEqualTo(Integer value) {
            addCriterion("I_LOCK_FLAG <>", value, "iLockFlag");
            return (Criteria) this;
        }

        public Criteria andILockFlagGreaterThan(Integer value) {
            addCriterion("I_LOCK_FLAG >", value, "iLockFlag");
            return (Criteria) this;
        }

        public Criteria andILockFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_LOCK_FLAG >=", value, "iLockFlag");
            return (Criteria) this;
        }

        public Criteria andILockFlagLessThan(Integer value) {
            addCriterion("I_LOCK_FLAG <", value, "iLockFlag");
            return (Criteria) this;
        }

        public Criteria andILockFlagLessThanOrEqualTo(Integer value) {
            addCriterion("I_LOCK_FLAG <=", value, "iLockFlag");
            return (Criteria) this;
        }

        public Criteria andILockFlagIn(List<Integer> values) {
            addCriterion("I_LOCK_FLAG in", values, "iLockFlag");
            return (Criteria) this;
        }

        public Criteria andILockFlagNotIn(List<Integer> values) {
            addCriterion("I_LOCK_FLAG not in", values, "iLockFlag");
            return (Criteria) this;
        }

        public Criteria andILockFlagBetween(Integer value1, Integer value2) {
            addCriterion("I_LOCK_FLAG between", value1, value2, "iLockFlag");
            return (Criteria) this;
        }

        public Criteria andILockFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("I_LOCK_FLAG not between", value1, value2, "iLockFlag");
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