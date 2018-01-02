package com.crscd.riis.freightmarket.authority.entity;

import java.util.ArrayList;
import java.util.List;

public class FmUserEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmUserEntityExample() {
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

        public Criteria andCRailwayBureauIsNull() {
            addCriterion("C_RAILWAY_BUREAU is null");
            return (Criteria) this;
        }

        public Criteria andCRailwayBureauIsNotNull() {
            addCriterion("C_RAILWAY_BUREAU is not null");
            return (Criteria) this;
        }

        public Criteria andCRailwayBureauEqualTo(String value) {
            addCriterion("C_RAILWAY_BUREAU =", value, "cRailwayBureau");
            return (Criteria) this;
        }

        public Criteria andCRailwayBureauNotEqualTo(String value) {
            addCriterion("C_RAILWAY_BUREAU <>", value, "cRailwayBureau");
            return (Criteria) this;
        }

        public Criteria andCRailwayBureauGreaterThan(String value) {
            addCriterion("C_RAILWAY_BUREAU >", value, "cRailwayBureau");
            return (Criteria) this;
        }

        public Criteria andCRailwayBureauGreaterThanOrEqualTo(String value) {
            addCriterion("C_RAILWAY_BUREAU >=", value, "cRailwayBureau");
            return (Criteria) this;
        }

        public Criteria andCRailwayBureauLessThan(String value) {
            addCriterion("C_RAILWAY_BUREAU <", value, "cRailwayBureau");
            return (Criteria) this;
        }

        public Criteria andCRailwayBureauLessThanOrEqualTo(String value) {
            addCriterion("C_RAILWAY_BUREAU <=", value, "cRailwayBureau");
            return (Criteria) this;
        }

        public Criteria andCRailwayBureauLike(String value) {
            addCriterion("C_RAILWAY_BUREAU like", value, "cRailwayBureau");
            return (Criteria) this;
        }

        public Criteria andCRailwayBureauNotLike(String value) {
            addCriterion("C_RAILWAY_BUREAU not like", value, "cRailwayBureau");
            return (Criteria) this;
        }

        public Criteria andCRailwayBureauIn(List<String> values) {
            addCriterion("C_RAILWAY_BUREAU in", values, "cRailwayBureau");
            return (Criteria) this;
        }

        public Criteria andCRailwayBureauNotIn(List<String> values) {
            addCriterion("C_RAILWAY_BUREAU not in", values, "cRailwayBureau");
            return (Criteria) this;
        }

        public Criteria andCRailwayBureauBetween(String value1, String value2) {
            addCriterion("C_RAILWAY_BUREAU between", value1, value2, "cRailwayBureau");
            return (Criteria) this;
        }

        public Criteria andCRailwayBureauNotBetween(String value1, String value2) {
            addCriterion("C_RAILWAY_BUREAU not between", value1, value2, "cRailwayBureau");
            return (Criteria) this;
        }

        public Criteria andCUserNameIsNull() {
            addCriterion("C_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCUserNameIsNotNull() {
            addCriterion("C_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCUserNameEqualTo(String value) {
            addCriterion("C_USER_NAME =", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameNotEqualTo(String value) {
            addCriterion("C_USER_NAME <>", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameGreaterThan(String value) {
            addCriterion("C_USER_NAME >", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_USER_NAME >=", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameLessThan(String value) {
            addCriterion("C_USER_NAME <", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameLessThanOrEqualTo(String value) {
            addCriterion("C_USER_NAME <=", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameLike(String value) {
            addCriterion("C_USER_NAME like", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameNotLike(String value) {
            addCriterion("C_USER_NAME not like", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameIn(List<String> values) {
            addCriterion("C_USER_NAME in", values, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameNotIn(List<String> values) {
            addCriterion("C_USER_NAME not in", values, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameBetween(String value1, String value2) {
            addCriterion("C_USER_NAME between", value1, value2, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameNotBetween(String value1, String value2) {
            addCriterion("C_USER_NAME not between", value1, value2, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserAddressIsNull() {
            addCriterion("C_USER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCUserAddressIsNotNull() {
            addCriterion("C_USER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCUserAddressEqualTo(String value) {
            addCriterion("C_USER_ADDRESS =", value, "cUserAddress");
            return (Criteria) this;
        }

        public Criteria andCUserAddressNotEqualTo(String value) {
            addCriterion("C_USER_ADDRESS <>", value, "cUserAddress");
            return (Criteria) this;
        }

        public Criteria andCUserAddressGreaterThan(String value) {
            addCriterion("C_USER_ADDRESS >", value, "cUserAddress");
            return (Criteria) this;
        }

        public Criteria andCUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("C_USER_ADDRESS >=", value, "cUserAddress");
            return (Criteria) this;
        }

        public Criteria andCUserAddressLessThan(String value) {
            addCriterion("C_USER_ADDRESS <", value, "cUserAddress");
            return (Criteria) this;
        }

        public Criteria andCUserAddressLessThanOrEqualTo(String value) {
            addCriterion("C_USER_ADDRESS <=", value, "cUserAddress");
            return (Criteria) this;
        }

        public Criteria andCUserAddressLike(String value) {
            addCriterion("C_USER_ADDRESS like", value, "cUserAddress");
            return (Criteria) this;
        }

        public Criteria andCUserAddressNotLike(String value) {
            addCriterion("C_USER_ADDRESS not like", value, "cUserAddress");
            return (Criteria) this;
        }

        public Criteria andCUserAddressIn(List<String> values) {
            addCriterion("C_USER_ADDRESS in", values, "cUserAddress");
            return (Criteria) this;
        }

        public Criteria andCUserAddressNotIn(List<String> values) {
            addCriterion("C_USER_ADDRESS not in", values, "cUserAddress");
            return (Criteria) this;
        }

        public Criteria andCUserAddressBetween(String value1, String value2) {
            addCriterion("C_USER_ADDRESS between", value1, value2, "cUserAddress");
            return (Criteria) this;
        }

        public Criteria andCUserAddressNotBetween(String value1, String value2) {
            addCriterion("C_USER_ADDRESS not between", value1, value2, "cUserAddress");
            return (Criteria) this;
        }

        public Criteria andCUserIdNumIsNull() {
            addCriterion("C_USER_ID_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCUserIdNumIsNotNull() {
            addCriterion("C_USER_ID_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCUserIdNumEqualTo(String value) {
            addCriterion("C_USER_ID_NUM =", value, "cUserIdNum");
            return (Criteria) this;
        }

        public Criteria andCUserIdNumNotEqualTo(String value) {
            addCriterion("C_USER_ID_NUM <>", value, "cUserIdNum");
            return (Criteria) this;
        }

        public Criteria andCUserIdNumGreaterThan(String value) {
            addCriterion("C_USER_ID_NUM >", value, "cUserIdNum");
            return (Criteria) this;
        }

        public Criteria andCUserIdNumGreaterThanOrEqualTo(String value) {
            addCriterion("C_USER_ID_NUM >=", value, "cUserIdNum");
            return (Criteria) this;
        }

        public Criteria andCUserIdNumLessThan(String value) {
            addCriterion("C_USER_ID_NUM <", value, "cUserIdNum");
            return (Criteria) this;
        }

        public Criteria andCUserIdNumLessThanOrEqualTo(String value) {
            addCriterion("C_USER_ID_NUM <=", value, "cUserIdNum");
            return (Criteria) this;
        }

        public Criteria andCUserIdNumLike(String value) {
            addCriterion("C_USER_ID_NUM like", value, "cUserIdNum");
            return (Criteria) this;
        }

        public Criteria andCUserIdNumNotLike(String value) {
            addCriterion("C_USER_ID_NUM not like", value, "cUserIdNum");
            return (Criteria) this;
        }

        public Criteria andCUserIdNumIn(List<String> values) {
            addCriterion("C_USER_ID_NUM in", values, "cUserIdNum");
            return (Criteria) this;
        }

        public Criteria andCUserIdNumNotIn(List<String> values) {
            addCriterion("C_USER_ID_NUM not in", values, "cUserIdNum");
            return (Criteria) this;
        }

        public Criteria andCUserIdNumBetween(String value1, String value2) {
            addCriterion("C_USER_ID_NUM between", value1, value2, "cUserIdNum");
            return (Criteria) this;
        }

        public Criteria andCUserIdNumNotBetween(String value1, String value2) {
            addCriterion("C_USER_ID_NUM not between", value1, value2, "cUserIdNum");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneIsNull() {
            addCriterion("C_USER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneIsNotNull() {
            addCriterion("C_USER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneEqualTo(String value) {
            addCriterion("C_USER_PHONE =", value, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneNotEqualTo(String value) {
            addCriterion("C_USER_PHONE <>", value, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneGreaterThan(String value) {
            addCriterion("C_USER_PHONE >", value, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("C_USER_PHONE >=", value, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneLessThan(String value) {
            addCriterion("C_USER_PHONE <", value, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("C_USER_PHONE <=", value, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneLike(String value) {
            addCriterion("C_USER_PHONE like", value, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneNotLike(String value) {
            addCriterion("C_USER_PHONE not like", value, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneIn(List<String> values) {
            addCriterion("C_USER_PHONE in", values, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneNotIn(List<String> values) {
            addCriterion("C_USER_PHONE not in", values, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneBetween(String value1, String value2) {
            addCriterion("C_USER_PHONE between", value1, value2, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneNotBetween(String value1, String value2) {
            addCriterion("C_USER_PHONE not between", value1, value2, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserMailIsNull() {
            addCriterion("C_USER_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andCUserMailIsNotNull() {
            addCriterion("C_USER_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCUserMailEqualTo(String value) {
            addCriterion("C_USER_MAIL =", value, "cUserMail");
            return (Criteria) this;
        }

        public Criteria andCUserMailNotEqualTo(String value) {
            addCriterion("C_USER_MAIL <>", value, "cUserMail");
            return (Criteria) this;
        }

        public Criteria andCUserMailGreaterThan(String value) {
            addCriterion("C_USER_MAIL >", value, "cUserMail");
            return (Criteria) this;
        }

        public Criteria andCUserMailGreaterThanOrEqualTo(String value) {
            addCriterion("C_USER_MAIL >=", value, "cUserMail");
            return (Criteria) this;
        }

        public Criteria andCUserMailLessThan(String value) {
            addCriterion("C_USER_MAIL <", value, "cUserMail");
            return (Criteria) this;
        }

        public Criteria andCUserMailLessThanOrEqualTo(String value) {
            addCriterion("C_USER_MAIL <=", value, "cUserMail");
            return (Criteria) this;
        }

        public Criteria andCUserMailLike(String value) {
            addCriterion("C_USER_MAIL like", value, "cUserMail");
            return (Criteria) this;
        }

        public Criteria andCUserMailNotLike(String value) {
            addCriterion("C_USER_MAIL not like", value, "cUserMail");
            return (Criteria) this;
        }

        public Criteria andCUserMailIn(List<String> values) {
            addCriterion("C_USER_MAIL in", values, "cUserMail");
            return (Criteria) this;
        }

        public Criteria andCUserMailNotIn(List<String> values) {
            addCriterion("C_USER_MAIL not in", values, "cUserMail");
            return (Criteria) this;
        }

        public Criteria andCUserMailBetween(String value1, String value2) {
            addCriterion("C_USER_MAIL between", value1, value2, "cUserMail");
            return (Criteria) this;
        }

        public Criteria andCUserMailNotBetween(String value1, String value2) {
            addCriterion("C_USER_MAIL not between", value1, value2, "cUserMail");
            return (Criteria) this;
        }

        public Criteria andCUserTelIsNull() {
            addCriterion("C_USER_TEL is null");
            return (Criteria) this;
        }

        public Criteria andCUserTelIsNotNull() {
            addCriterion("C_USER_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andCUserTelEqualTo(String value) {
            addCriterion("C_USER_TEL =", value, "cUserTel");
            return (Criteria) this;
        }

        public Criteria andCUserTelNotEqualTo(String value) {
            addCriterion("C_USER_TEL <>", value, "cUserTel");
            return (Criteria) this;
        }

        public Criteria andCUserTelGreaterThan(String value) {
            addCriterion("C_USER_TEL >", value, "cUserTel");
            return (Criteria) this;
        }

        public Criteria andCUserTelGreaterThanOrEqualTo(String value) {
            addCriterion("C_USER_TEL >=", value, "cUserTel");
            return (Criteria) this;
        }

        public Criteria andCUserTelLessThan(String value) {
            addCriterion("C_USER_TEL <", value, "cUserTel");
            return (Criteria) this;
        }

        public Criteria andCUserTelLessThanOrEqualTo(String value) {
            addCriterion("C_USER_TEL <=", value, "cUserTel");
            return (Criteria) this;
        }

        public Criteria andCUserTelLike(String value) {
            addCriterion("C_USER_TEL like", value, "cUserTel");
            return (Criteria) this;
        }

        public Criteria andCUserTelNotLike(String value) {
            addCriterion("C_USER_TEL not like", value, "cUserTel");
            return (Criteria) this;
        }

        public Criteria andCUserTelIn(List<String> values) {
            addCriterion("C_USER_TEL in", values, "cUserTel");
            return (Criteria) this;
        }

        public Criteria andCUserTelNotIn(List<String> values) {
            addCriterion("C_USER_TEL not in", values, "cUserTel");
            return (Criteria) this;
        }

        public Criteria andCUserTelBetween(String value1, String value2) {
            addCriterion("C_USER_TEL between", value1, value2, "cUserTel");
            return (Criteria) this;
        }

        public Criteria andCUserTelNotBetween(String value1, String value2) {
            addCriterion("C_USER_TEL not between", value1, value2, "cUserTel");
            return (Criteria) this;
        }

        public Criteria andCPwdQIsNull() {
            addCriterion("C_PWD_Q is null");
            return (Criteria) this;
        }

        public Criteria andCPwdQIsNotNull() {
            addCriterion("C_PWD_Q is not null");
            return (Criteria) this;
        }

        public Criteria andCPwdQEqualTo(String value) {
            addCriterion("C_PWD_Q =", value, "cPwdQ");
            return (Criteria) this;
        }

        public Criteria andCPwdQNotEqualTo(String value) {
            addCriterion("C_PWD_Q <>", value, "cPwdQ");
            return (Criteria) this;
        }

        public Criteria andCPwdQGreaterThan(String value) {
            addCriterion("C_PWD_Q >", value, "cPwdQ");
            return (Criteria) this;
        }

        public Criteria andCPwdQGreaterThanOrEqualTo(String value) {
            addCriterion("C_PWD_Q >=", value, "cPwdQ");
            return (Criteria) this;
        }

        public Criteria andCPwdQLessThan(String value) {
            addCriterion("C_PWD_Q <", value, "cPwdQ");
            return (Criteria) this;
        }

        public Criteria andCPwdQLessThanOrEqualTo(String value) {
            addCriterion("C_PWD_Q <=", value, "cPwdQ");
            return (Criteria) this;
        }

        public Criteria andCPwdQLike(String value) {
            addCriterion("C_PWD_Q like", value, "cPwdQ");
            return (Criteria) this;
        }

        public Criteria andCPwdQNotLike(String value) {
            addCriterion("C_PWD_Q not like", value, "cPwdQ");
            return (Criteria) this;
        }

        public Criteria andCPwdQIn(List<String> values) {
            addCriterion("C_PWD_Q in", values, "cPwdQ");
            return (Criteria) this;
        }

        public Criteria andCPwdQNotIn(List<String> values) {
            addCriterion("C_PWD_Q not in", values, "cPwdQ");
            return (Criteria) this;
        }

        public Criteria andCPwdQBetween(String value1, String value2) {
            addCriterion("C_PWD_Q between", value1, value2, "cPwdQ");
            return (Criteria) this;
        }

        public Criteria andCPwdQNotBetween(String value1, String value2) {
            addCriterion("C_PWD_Q not between", value1, value2, "cPwdQ");
            return (Criteria) this;
        }

        public Criteria andCPwdAIsNull() {
            addCriterion("C_PWD_A is null");
            return (Criteria) this;
        }

        public Criteria andCPwdAIsNotNull() {
            addCriterion("C_PWD_A is not null");
            return (Criteria) this;
        }

        public Criteria andCPwdAEqualTo(String value) {
            addCriterion("C_PWD_A =", value, "cPwdA");
            return (Criteria) this;
        }

        public Criteria andCPwdANotEqualTo(String value) {
            addCriterion("C_PWD_A <>", value, "cPwdA");
            return (Criteria) this;
        }

        public Criteria andCPwdAGreaterThan(String value) {
            addCriterion("C_PWD_A >", value, "cPwdA");
            return (Criteria) this;
        }

        public Criteria andCPwdAGreaterThanOrEqualTo(String value) {
            addCriterion("C_PWD_A >=", value, "cPwdA");
            return (Criteria) this;
        }

        public Criteria andCPwdALessThan(String value) {
            addCriterion("C_PWD_A <", value, "cPwdA");
            return (Criteria) this;
        }

        public Criteria andCPwdALessThanOrEqualTo(String value) {
            addCriterion("C_PWD_A <=", value, "cPwdA");
            return (Criteria) this;
        }

        public Criteria andCPwdALike(String value) {
            addCriterion("C_PWD_A like", value, "cPwdA");
            return (Criteria) this;
        }

        public Criteria andCPwdANotLike(String value) {
            addCriterion("C_PWD_A not like", value, "cPwdA");
            return (Criteria) this;
        }

        public Criteria andCPwdAIn(List<String> values) {
            addCriterion("C_PWD_A in", values, "cPwdA");
            return (Criteria) this;
        }

        public Criteria andCPwdANotIn(List<String> values) {
            addCriterion("C_PWD_A not in", values, "cPwdA");
            return (Criteria) this;
        }

        public Criteria andCPwdABetween(String value1, String value2) {
            addCriterion("C_PWD_A between", value1, value2, "cPwdA");
            return (Criteria) this;
        }

        public Criteria andCPwdANotBetween(String value1, String value2) {
            addCriterion("C_PWD_A not between", value1, value2, "cPwdA");
            return (Criteria) this;
        }

        public Criteria andIFreightFlagIsNull() {
            addCriterion("I_FREIGHT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andIFreightFlagIsNotNull() {
            addCriterion("I_FREIGHT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIFreightFlagEqualTo(Integer value) {
            addCriterion("I_FREIGHT_FLAG =", value, "iFreightFlag");
            return (Criteria) this;
        }

        public Criteria andIFreightFlagNotEqualTo(Integer value) {
            addCriterion("I_FREIGHT_FLAG <>", value, "iFreightFlag");
            return (Criteria) this;
        }

        public Criteria andIFreightFlagGreaterThan(Integer value) {
            addCriterion("I_FREIGHT_FLAG >", value, "iFreightFlag");
            return (Criteria) this;
        }

        public Criteria andIFreightFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_FREIGHT_FLAG >=", value, "iFreightFlag");
            return (Criteria) this;
        }

        public Criteria andIFreightFlagLessThan(Integer value) {
            addCriterion("I_FREIGHT_FLAG <", value, "iFreightFlag");
            return (Criteria) this;
        }

        public Criteria andIFreightFlagLessThanOrEqualTo(Integer value) {
            addCriterion("I_FREIGHT_FLAG <=", value, "iFreightFlag");
            return (Criteria) this;
        }

        public Criteria andIFreightFlagIn(List<Integer> values) {
            addCriterion("I_FREIGHT_FLAG in", values, "iFreightFlag");
            return (Criteria) this;
        }

        public Criteria andIFreightFlagNotIn(List<Integer> values) {
            addCriterion("I_FREIGHT_FLAG not in", values, "iFreightFlag");
            return (Criteria) this;
        }

        public Criteria andIFreightFlagBetween(Integer value1, Integer value2) {
            addCriterion("I_FREIGHT_FLAG between", value1, value2, "iFreightFlag");
            return (Criteria) this;
        }

        public Criteria andIFreightFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("I_FREIGHT_FLAG not between", value1, value2, "iFreightFlag");
            return (Criteria) this;
        }

        public Criteria andCShipperNameIsNull() {
            addCriterion("C_SHIPPER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCShipperNameIsNotNull() {
            addCriterion("C_SHIPPER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCShipperNameEqualTo(String value) {
            addCriterion("C_SHIPPER_NAME =", value, "cShipperName");
            return (Criteria) this;
        }

        public Criteria andCShipperNameNotEqualTo(String value) {
            addCriterion("C_SHIPPER_NAME <>", value, "cShipperName");
            return (Criteria) this;
        }

        public Criteria andCShipperNameGreaterThan(String value) {
            addCriterion("C_SHIPPER_NAME >", value, "cShipperName");
            return (Criteria) this;
        }

        public Criteria andCShipperNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_SHIPPER_NAME >=", value, "cShipperName");
            return (Criteria) this;
        }

        public Criteria andCShipperNameLessThan(String value) {
            addCriterion("C_SHIPPER_NAME <", value, "cShipperName");
            return (Criteria) this;
        }

        public Criteria andCShipperNameLessThanOrEqualTo(String value) {
            addCriterion("C_SHIPPER_NAME <=", value, "cShipperName");
            return (Criteria) this;
        }

        public Criteria andCShipperNameLike(String value) {
            addCriterion("C_SHIPPER_NAME like", value, "cShipperName");
            return (Criteria) this;
        }

        public Criteria andCShipperNameNotLike(String value) {
            addCriterion("C_SHIPPER_NAME not like", value, "cShipperName");
            return (Criteria) this;
        }

        public Criteria andCShipperNameIn(List<String> values) {
            addCriterion("C_SHIPPER_NAME in", values, "cShipperName");
            return (Criteria) this;
        }

        public Criteria andCShipperNameNotIn(List<String> values) {
            addCriterion("C_SHIPPER_NAME not in", values, "cShipperName");
            return (Criteria) this;
        }

        public Criteria andCShipperNameBetween(String value1, String value2) {
            addCriterion("C_SHIPPER_NAME between", value1, value2, "cShipperName");
            return (Criteria) this;
        }

        public Criteria andCShipperNameNotBetween(String value1, String value2) {
            addCriterion("C_SHIPPER_NAME not between", value1, value2, "cShipperName");
            return (Criteria) this;
        }

        public Criteria andCLoadingStationIsNull() {
            addCriterion("C_LOADING_STATION is null");
            return (Criteria) this;
        }

        public Criteria andCLoadingStationIsNotNull() {
            addCriterion("C_LOADING_STATION is not null");
            return (Criteria) this;
        }

        public Criteria andCLoadingStationEqualTo(String value) {
            addCriterion("C_LOADING_STATION =", value, "cLoadingStation");
            return (Criteria) this;
        }

        public Criteria andCLoadingStationNotEqualTo(String value) {
            addCriterion("C_LOADING_STATION <>", value, "cLoadingStation");
            return (Criteria) this;
        }

        public Criteria andCLoadingStationGreaterThan(String value) {
            addCriterion("C_LOADING_STATION >", value, "cLoadingStation");
            return (Criteria) this;
        }

        public Criteria andCLoadingStationGreaterThanOrEqualTo(String value) {
            addCriterion("C_LOADING_STATION >=", value, "cLoadingStation");
            return (Criteria) this;
        }

        public Criteria andCLoadingStationLessThan(String value) {
            addCriterion("C_LOADING_STATION <", value, "cLoadingStation");
            return (Criteria) this;
        }

        public Criteria andCLoadingStationLessThanOrEqualTo(String value) {
            addCriterion("C_LOADING_STATION <=", value, "cLoadingStation");
            return (Criteria) this;
        }

        public Criteria andCLoadingStationLike(String value) {
            addCriterion("C_LOADING_STATION like", value, "cLoadingStation");
            return (Criteria) this;
        }

        public Criteria andCLoadingStationNotLike(String value) {
            addCriterion("C_LOADING_STATION not like", value, "cLoadingStation");
            return (Criteria) this;
        }

        public Criteria andCLoadingStationIn(List<String> values) {
            addCriterion("C_LOADING_STATION in", values, "cLoadingStation");
            return (Criteria) this;
        }

        public Criteria andCLoadingStationNotIn(List<String> values) {
            addCriterion("C_LOADING_STATION not in", values, "cLoadingStation");
            return (Criteria) this;
        }

        public Criteria andCLoadingStationBetween(String value1, String value2) {
            addCriterion("C_LOADING_STATION between", value1, value2, "cLoadingStation");
            return (Criteria) this;
        }

        public Criteria andCLoadingStationNotBetween(String value1, String value2) {
            addCriterion("C_LOADING_STATION not between", value1, value2, "cLoadingStation");
            return (Criteria) this;
        }

        public Criteria andCLoadingLocationIsNull() {
            addCriterion("C_LOADING_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andCLoadingLocationIsNotNull() {
            addCriterion("C_LOADING_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andCLoadingLocationEqualTo(String value) {
            addCriterion("C_LOADING_LOCATION =", value, "cLoadingLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadingLocationNotEqualTo(String value) {
            addCriterion("C_LOADING_LOCATION <>", value, "cLoadingLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadingLocationGreaterThan(String value) {
            addCriterion("C_LOADING_LOCATION >", value, "cLoadingLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadingLocationGreaterThanOrEqualTo(String value) {
            addCriterion("C_LOADING_LOCATION >=", value, "cLoadingLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadingLocationLessThan(String value) {
            addCriterion("C_LOADING_LOCATION <", value, "cLoadingLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadingLocationLessThanOrEqualTo(String value) {
            addCriterion("C_LOADING_LOCATION <=", value, "cLoadingLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadingLocationLike(String value) {
            addCriterion("C_LOADING_LOCATION like", value, "cLoadingLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadingLocationNotLike(String value) {
            addCriterion("C_LOADING_LOCATION not like", value, "cLoadingLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadingLocationIn(List<String> values) {
            addCriterion("C_LOADING_LOCATION in", values, "cLoadingLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadingLocationNotIn(List<String> values) {
            addCriterion("C_LOADING_LOCATION not in", values, "cLoadingLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadingLocationBetween(String value1, String value2) {
            addCriterion("C_LOADING_LOCATION between", value1, value2, "cLoadingLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadingLocationNotBetween(String value1, String value2) {
            addCriterion("C_LOADING_LOCATION not between", value1, value2, "cLoadingLocation");
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

        public Criteria andCUnloadingStationIsNull() {
            addCriterion("C_UNLOADING_STATION is null");
            return (Criteria) this;
        }

        public Criteria andCUnloadingStationIsNotNull() {
            addCriterion("C_UNLOADING_STATION is not null");
            return (Criteria) this;
        }

        public Criteria andCUnloadingStationEqualTo(String value) {
            addCriterion("C_UNLOADING_STATION =", value, "cUnloadingStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingStationNotEqualTo(String value) {
            addCriterion("C_UNLOADING_STATION <>", value, "cUnloadingStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingStationGreaterThan(String value) {
            addCriterion("C_UNLOADING_STATION >", value, "cUnloadingStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingStationGreaterThanOrEqualTo(String value) {
            addCriterion("C_UNLOADING_STATION >=", value, "cUnloadingStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingStationLessThan(String value) {
            addCriterion("C_UNLOADING_STATION <", value, "cUnloadingStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingStationLessThanOrEqualTo(String value) {
            addCriterion("C_UNLOADING_STATION <=", value, "cUnloadingStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingStationLike(String value) {
            addCriterion("C_UNLOADING_STATION like", value, "cUnloadingStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingStationNotLike(String value) {
            addCriterion("C_UNLOADING_STATION not like", value, "cUnloadingStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingStationIn(List<String> values) {
            addCriterion("C_UNLOADING_STATION in", values, "cUnloadingStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingStationNotIn(List<String> values) {
            addCriterion("C_UNLOADING_STATION not in", values, "cUnloadingStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingStationBetween(String value1, String value2) {
            addCriterion("C_UNLOADING_STATION between", value1, value2, "cUnloadingStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingStationNotBetween(String value1, String value2) {
            addCriterion("C_UNLOADING_STATION not between", value1, value2, "cUnloadingStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingLocationIsNull() {
            addCriterion("C_UNLOADING_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andCUnloadingLocationIsNotNull() {
            addCriterion("C_UNLOADING_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andCUnloadingLocationEqualTo(String value) {
            addCriterion("C_UNLOADING_LOCATION =", value, "cUnloadingLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingLocationNotEqualTo(String value) {
            addCriterion("C_UNLOADING_LOCATION <>", value, "cUnloadingLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingLocationGreaterThan(String value) {
            addCriterion("C_UNLOADING_LOCATION >", value, "cUnloadingLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingLocationGreaterThanOrEqualTo(String value) {
            addCriterion("C_UNLOADING_LOCATION >=", value, "cUnloadingLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingLocationLessThan(String value) {
            addCriterion("C_UNLOADING_LOCATION <", value, "cUnloadingLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingLocationLessThanOrEqualTo(String value) {
            addCriterion("C_UNLOADING_LOCATION <=", value, "cUnloadingLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingLocationLike(String value) {
            addCriterion("C_UNLOADING_LOCATION like", value, "cUnloadingLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingLocationNotLike(String value) {
            addCriterion("C_UNLOADING_LOCATION not like", value, "cUnloadingLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingLocationIn(List<String> values) {
            addCriterion("C_UNLOADING_LOCATION in", values, "cUnloadingLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingLocationNotIn(List<String> values) {
            addCriterion("C_UNLOADING_LOCATION not in", values, "cUnloadingLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingLocationBetween(String value1, String value2) {
            addCriterion("C_UNLOADING_LOCATION between", value1, value2, "cUnloadingLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadingLocationNotBetween(String value1, String value2) {
            addCriterion("C_UNLOADING_LOCATION not between", value1, value2, "cUnloadingLocation");
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