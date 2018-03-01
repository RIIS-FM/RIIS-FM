package com.crscd.riis.freightmarket.trade.entity;

import java.util.ArrayList;
import java.util.List;

public class FmTradeContactEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmTradeContactEntityExample() {
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

        public Criteria andCContactNameIsNull() {
            addCriterion("C_CONTACT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCContactNameIsNotNull() {
            addCriterion("C_CONTACT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCContactNameEqualTo(String value) {
            addCriterion("C_CONTACT_NAME =", value, "cContactName");
            return (Criteria) this;
        }

        public Criteria andCContactNameNotEqualTo(String value) {
            addCriterion("C_CONTACT_NAME <>", value, "cContactName");
            return (Criteria) this;
        }

        public Criteria andCContactNameGreaterThan(String value) {
            addCriterion("C_CONTACT_NAME >", value, "cContactName");
            return (Criteria) this;
        }

        public Criteria andCContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_CONTACT_NAME >=", value, "cContactName");
            return (Criteria) this;
        }

        public Criteria andCContactNameLessThan(String value) {
            addCriterion("C_CONTACT_NAME <", value, "cContactName");
            return (Criteria) this;
        }

        public Criteria andCContactNameLessThanOrEqualTo(String value) {
            addCriterion("C_CONTACT_NAME <=", value, "cContactName");
            return (Criteria) this;
        }

        public Criteria andCContactNameLike(String value) {
            addCriterion("C_CONTACT_NAME like", value, "cContactName");
            return (Criteria) this;
        }

        public Criteria andCContactNameNotLike(String value) {
            addCriterion("C_CONTACT_NAME not like", value, "cContactName");
            return (Criteria) this;
        }

        public Criteria andCContactNameIn(List<String> values) {
            addCriterion("C_CONTACT_NAME in", values, "cContactName");
            return (Criteria) this;
        }

        public Criteria andCContactNameNotIn(List<String> values) {
            addCriterion("C_CONTACT_NAME not in", values, "cContactName");
            return (Criteria) this;
        }

        public Criteria andCContactNameBetween(String value1, String value2) {
            addCriterion("C_CONTACT_NAME between", value1, value2, "cContactName");
            return (Criteria) this;
        }

        public Criteria andCContactNameNotBetween(String value1, String value2) {
            addCriterion("C_CONTACT_NAME not between", value1, value2, "cContactName");
            return (Criteria) this;
        }

        public Criteria andCContactAddressIsNull() {
            addCriterion("C_CONTACT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCContactAddressIsNotNull() {
            addCriterion("C_CONTACT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCContactAddressEqualTo(String value) {
            addCriterion("C_CONTACT_ADDRESS =", value, "cContactAddress");
            return (Criteria) this;
        }

        public Criteria andCContactAddressNotEqualTo(String value) {
            addCriterion("C_CONTACT_ADDRESS <>", value, "cContactAddress");
            return (Criteria) this;
        }

        public Criteria andCContactAddressGreaterThan(String value) {
            addCriterion("C_CONTACT_ADDRESS >", value, "cContactAddress");
            return (Criteria) this;
        }

        public Criteria andCContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("C_CONTACT_ADDRESS >=", value, "cContactAddress");
            return (Criteria) this;
        }

        public Criteria andCContactAddressLessThan(String value) {
            addCriterion("C_CONTACT_ADDRESS <", value, "cContactAddress");
            return (Criteria) this;
        }

        public Criteria andCContactAddressLessThanOrEqualTo(String value) {
            addCriterion("C_CONTACT_ADDRESS <=", value, "cContactAddress");
            return (Criteria) this;
        }

        public Criteria andCContactAddressLike(String value) {
            addCriterion("C_CONTACT_ADDRESS like", value, "cContactAddress");
            return (Criteria) this;
        }

        public Criteria andCContactAddressNotLike(String value) {
            addCriterion("C_CONTACT_ADDRESS not like", value, "cContactAddress");
            return (Criteria) this;
        }

        public Criteria andCContactAddressIn(List<String> values) {
            addCriterion("C_CONTACT_ADDRESS in", values, "cContactAddress");
            return (Criteria) this;
        }

        public Criteria andCContactAddressNotIn(List<String> values) {
            addCriterion("C_CONTACT_ADDRESS not in", values, "cContactAddress");
            return (Criteria) this;
        }

        public Criteria andCContactAddressBetween(String value1, String value2) {
            addCriterion("C_CONTACT_ADDRESS between", value1, value2, "cContactAddress");
            return (Criteria) this;
        }

        public Criteria andCContactAddressNotBetween(String value1, String value2) {
            addCriterion("C_CONTACT_ADDRESS not between", value1, value2, "cContactAddress");
            return (Criteria) this;
        }

        public Criteria andIContactPostcodeIsNull() {
            addCriterion("I_CONTACT_POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andIContactPostcodeIsNotNull() {
            addCriterion("I_CONTACT_POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andIContactPostcodeEqualTo(Integer value) {
            addCriterion("I_CONTACT_POSTCODE =", value, "iContactPostcode");
            return (Criteria) this;
        }

        public Criteria andIContactPostcodeNotEqualTo(Integer value) {
            addCriterion("I_CONTACT_POSTCODE <>", value, "iContactPostcode");
            return (Criteria) this;
        }

        public Criteria andIContactPostcodeGreaterThan(Integer value) {
            addCriterion("I_CONTACT_POSTCODE >", value, "iContactPostcode");
            return (Criteria) this;
        }

        public Criteria andIContactPostcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_CONTACT_POSTCODE >=", value, "iContactPostcode");
            return (Criteria) this;
        }

        public Criteria andIContactPostcodeLessThan(Integer value) {
            addCriterion("I_CONTACT_POSTCODE <", value, "iContactPostcode");
            return (Criteria) this;
        }

        public Criteria andIContactPostcodeLessThanOrEqualTo(Integer value) {
            addCriterion("I_CONTACT_POSTCODE <=", value, "iContactPostcode");
            return (Criteria) this;
        }

        public Criteria andIContactPostcodeIn(List<Integer> values) {
            addCriterion("I_CONTACT_POSTCODE in", values, "iContactPostcode");
            return (Criteria) this;
        }

        public Criteria andIContactPostcodeNotIn(List<Integer> values) {
            addCriterion("I_CONTACT_POSTCODE not in", values, "iContactPostcode");
            return (Criteria) this;
        }

        public Criteria andIContactPostcodeBetween(Integer value1, Integer value2) {
            addCriterion("I_CONTACT_POSTCODE between", value1, value2, "iContactPostcode");
            return (Criteria) this;
        }

        public Criteria andIContactPostcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("I_CONTACT_POSTCODE not between", value1, value2, "iContactPostcode");
            return (Criteria) this;
        }

        public Criteria andCContactPhoneIsNull() {
            addCriterion("C_CONTACT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCContactPhoneIsNotNull() {
            addCriterion("C_CONTACT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCContactPhoneEqualTo(String value) {
            addCriterion("C_CONTACT_PHONE =", value, "cContactPhone");
            return (Criteria) this;
        }

        public Criteria andCContactPhoneNotEqualTo(String value) {
            addCriterion("C_CONTACT_PHONE <>", value, "cContactPhone");
            return (Criteria) this;
        }

        public Criteria andCContactPhoneGreaterThan(String value) {
            addCriterion("C_CONTACT_PHONE >", value, "cContactPhone");
            return (Criteria) this;
        }

        public Criteria andCContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("C_CONTACT_PHONE >=", value, "cContactPhone");
            return (Criteria) this;
        }

        public Criteria andCContactPhoneLessThan(String value) {
            addCriterion("C_CONTACT_PHONE <", value, "cContactPhone");
            return (Criteria) this;
        }

        public Criteria andCContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("C_CONTACT_PHONE <=", value, "cContactPhone");
            return (Criteria) this;
        }

        public Criteria andCContactPhoneLike(String value) {
            addCriterion("C_CONTACT_PHONE like", value, "cContactPhone");
            return (Criteria) this;
        }

        public Criteria andCContactPhoneNotLike(String value) {
            addCriterion("C_CONTACT_PHONE not like", value, "cContactPhone");
            return (Criteria) this;
        }

        public Criteria andCContactPhoneIn(List<String> values) {
            addCriterion("C_CONTACT_PHONE in", values, "cContactPhone");
            return (Criteria) this;
        }

        public Criteria andCContactPhoneNotIn(List<String> values) {
            addCriterion("C_CONTACT_PHONE not in", values, "cContactPhone");
            return (Criteria) this;
        }

        public Criteria andCContactPhoneBetween(String value1, String value2) {
            addCriterion("C_CONTACT_PHONE between", value1, value2, "cContactPhone");
            return (Criteria) this;
        }

        public Criteria andCContactPhoneNotBetween(String value1, String value2) {
            addCriterion("C_CONTACT_PHONE not between", value1, value2, "cContactPhone");
            return (Criteria) this;
        }

        public Criteria andCContactEmailIsNull() {
            addCriterion("C_CONTACT_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCContactEmailIsNotNull() {
            addCriterion("C_CONTACT_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCContactEmailEqualTo(String value) {
            addCriterion("C_CONTACT_EMAIL =", value, "cContactEmail");
            return (Criteria) this;
        }

        public Criteria andCContactEmailNotEqualTo(String value) {
            addCriterion("C_CONTACT_EMAIL <>", value, "cContactEmail");
            return (Criteria) this;
        }

        public Criteria andCContactEmailGreaterThan(String value) {
            addCriterion("C_CONTACT_EMAIL >", value, "cContactEmail");
            return (Criteria) this;
        }

        public Criteria andCContactEmailGreaterThanOrEqualTo(String value) {
            addCriterion("C_CONTACT_EMAIL >=", value, "cContactEmail");
            return (Criteria) this;
        }

        public Criteria andCContactEmailLessThan(String value) {
            addCriterion("C_CONTACT_EMAIL <", value, "cContactEmail");
            return (Criteria) this;
        }

        public Criteria andCContactEmailLessThanOrEqualTo(String value) {
            addCriterion("C_CONTACT_EMAIL <=", value, "cContactEmail");
            return (Criteria) this;
        }

        public Criteria andCContactEmailLike(String value) {
            addCriterion("C_CONTACT_EMAIL like", value, "cContactEmail");
            return (Criteria) this;
        }

        public Criteria andCContactEmailNotLike(String value) {
            addCriterion("C_CONTACT_EMAIL not like", value, "cContactEmail");
            return (Criteria) this;
        }

        public Criteria andCContactEmailIn(List<String> values) {
            addCriterion("C_CONTACT_EMAIL in", values, "cContactEmail");
            return (Criteria) this;
        }

        public Criteria andCContactEmailNotIn(List<String> values) {
            addCriterion("C_CONTACT_EMAIL not in", values, "cContactEmail");
            return (Criteria) this;
        }

        public Criteria andCContactEmailBetween(String value1, String value2) {
            addCriterion("C_CONTACT_EMAIL between", value1, value2, "cContactEmail");
            return (Criteria) this;
        }

        public Criteria andCContactEmailNotBetween(String value1, String value2) {
            addCriterion("C_CONTACT_EMAIL not between", value1, value2, "cContactEmail");
            return (Criteria) this;
        }

        public Criteria andIContactFlagIsNull() {
            addCriterion("I_CONTACT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andIContactFlagIsNotNull() {
            addCriterion("I_CONTACT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIContactFlagEqualTo(Integer value) {
            addCriterion("I_CONTACT_FLAG =", value, "iContactFlag");
            return (Criteria) this;
        }

        public Criteria andIContactFlagNotEqualTo(Integer value) {
            addCriterion("I_CONTACT_FLAG <>", value, "iContactFlag");
            return (Criteria) this;
        }

        public Criteria andIContactFlagGreaterThan(Integer value) {
            addCriterion("I_CONTACT_FLAG >", value, "iContactFlag");
            return (Criteria) this;
        }

        public Criteria andIContactFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_CONTACT_FLAG >=", value, "iContactFlag");
            return (Criteria) this;
        }

        public Criteria andIContactFlagLessThan(Integer value) {
            addCriterion("I_CONTACT_FLAG <", value, "iContactFlag");
            return (Criteria) this;
        }

        public Criteria andIContactFlagLessThanOrEqualTo(Integer value) {
            addCriterion("I_CONTACT_FLAG <=", value, "iContactFlag");
            return (Criteria) this;
        }

        public Criteria andIContactFlagIn(List<Integer> values) {
            addCriterion("I_CONTACT_FLAG in", values, "iContactFlag");
            return (Criteria) this;
        }

        public Criteria andIContactFlagNotIn(List<Integer> values) {
            addCriterion("I_CONTACT_FLAG not in", values, "iContactFlag");
            return (Criteria) this;
        }

        public Criteria andIContactFlagBetween(Integer value1, Integer value2) {
            addCriterion("I_CONTACT_FLAG between", value1, value2, "iContactFlag");
            return (Criteria) this;
        }

        public Criteria andIContactFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("I_CONTACT_FLAG not between", value1, value2, "iContactFlag");
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

        public Criteria andIAccountFlagIsNull() {
            addCriterion("I_ACCOUNT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andIAccountFlagIsNotNull() {
            addCriterion("I_ACCOUNT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIAccountFlagEqualTo(Integer value) {
            addCriterion("I_ACCOUNT_FLAG =", value, "iAccountFlag");
            return (Criteria) this;
        }

        public Criteria andIAccountFlagNotEqualTo(Integer value) {
            addCriterion("I_ACCOUNT_FLAG <>", value, "iAccountFlag");
            return (Criteria) this;
        }

        public Criteria andIAccountFlagGreaterThan(Integer value) {
            addCriterion("I_ACCOUNT_FLAG >", value, "iAccountFlag");
            return (Criteria) this;
        }

        public Criteria andIAccountFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_ACCOUNT_FLAG >=", value, "iAccountFlag");
            return (Criteria) this;
        }

        public Criteria andIAccountFlagLessThan(Integer value) {
            addCriterion("I_ACCOUNT_FLAG <", value, "iAccountFlag");
            return (Criteria) this;
        }

        public Criteria andIAccountFlagLessThanOrEqualTo(Integer value) {
            addCriterion("I_ACCOUNT_FLAG <=", value, "iAccountFlag");
            return (Criteria) this;
        }

        public Criteria andIAccountFlagIn(List<Integer> values) {
            addCriterion("I_ACCOUNT_FLAG in", values, "iAccountFlag");
            return (Criteria) this;
        }

        public Criteria andIAccountFlagNotIn(List<Integer> values) {
            addCriterion("I_ACCOUNT_FLAG not in", values, "iAccountFlag");
            return (Criteria) this;
        }

        public Criteria andIAccountFlagBetween(Integer value1, Integer value2) {
            addCriterion("I_ACCOUNT_FLAG between", value1, value2, "iAccountFlag");
            return (Criteria) this;
        }

        public Criteria andIAccountFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("I_ACCOUNT_FLAG not between", value1, value2, "iAccountFlag");
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