package com.crscd.riis.freightmarket.authority.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FmTradeOrderInfoBaseEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmTradeOrderInfoBaseEntityExample() {
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

        public Criteria andDOrderDatelineIsNull() {
            addCriterion("D_ORDER_DATELINE is null");
            return (Criteria) this;
        }

        public Criteria andDOrderDatelineIsNotNull() {
            addCriterion("D_ORDER_DATELINE is not null");
            return (Criteria) this;
        }

        public Criteria andDOrderDatelineEqualTo(Date value) {
            addCriterion("D_ORDER_DATELINE =", value, "dOrderDateline");
            return (Criteria) this;
        }

        public Criteria andDOrderDatelineNotEqualTo(Date value) {
            addCriterion("D_ORDER_DATELINE <>", value, "dOrderDateline");
            return (Criteria) this;
        }

        public Criteria andDOrderDatelineGreaterThan(Date value) {
            addCriterion("D_ORDER_DATELINE >", value, "dOrderDateline");
            return (Criteria) this;
        }

        public Criteria andDOrderDatelineGreaterThanOrEqualTo(Date value) {
            addCriterion("D_ORDER_DATELINE >=", value, "dOrderDateline");
            return (Criteria) this;
        }

        public Criteria andDOrderDatelineLessThan(Date value) {
            addCriterion("D_ORDER_DATELINE <", value, "dOrderDateline");
            return (Criteria) this;
        }

        public Criteria andDOrderDatelineLessThanOrEqualTo(Date value) {
            addCriterion("D_ORDER_DATELINE <=", value, "dOrderDateline");
            return (Criteria) this;
        }

        public Criteria andDOrderDatelineIn(List<Date> values) {
            addCriterion("D_ORDER_DATELINE in", values, "dOrderDateline");
            return (Criteria) this;
        }

        public Criteria andDOrderDatelineNotIn(List<Date> values) {
            addCriterion("D_ORDER_DATELINE not in", values, "dOrderDateline");
            return (Criteria) this;
        }

        public Criteria andDOrderDatelineBetween(Date value1, Date value2) {
            addCriterion("D_ORDER_DATELINE between", value1, value2, "dOrderDateline");
            return (Criteria) this;
        }

        public Criteria andDOrderDatelineNotBetween(Date value1, Date value2) {
            addCriterion("D_ORDER_DATELINE not between", value1, value2, "dOrderDateline");
            return (Criteria) this;
        }

        public Criteria andIUserTypeIsNull() {
            addCriterion("I_USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIUserTypeIsNotNull() {
            addCriterion("I_USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIUserTypeEqualTo(Integer value) {
            addCriterion("I_USER_TYPE =", value, "iUserType");
            return (Criteria) this;
        }

        public Criteria andIUserTypeNotEqualTo(Integer value) {
            addCriterion("I_USER_TYPE <>", value, "iUserType");
            return (Criteria) this;
        }

        public Criteria andIUserTypeGreaterThan(Integer value) {
            addCriterion("I_USER_TYPE >", value, "iUserType");
            return (Criteria) this;
        }

        public Criteria andIUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_USER_TYPE >=", value, "iUserType");
            return (Criteria) this;
        }

        public Criteria andIUserTypeLessThan(Integer value) {
            addCriterion("I_USER_TYPE <", value, "iUserType");
            return (Criteria) this;
        }

        public Criteria andIUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("I_USER_TYPE <=", value, "iUserType");
            return (Criteria) this;
        }

        public Criteria andIUserTypeIn(List<Integer> values) {
            addCriterion("I_USER_TYPE in", values, "iUserType");
            return (Criteria) this;
        }

        public Criteria andIUserTypeNotIn(List<Integer> values) {
            addCriterion("I_USER_TYPE not in", values, "iUserType");
            return (Criteria) this;
        }

        public Criteria andIUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("I_USER_TYPE between", value1, value2, "iUserType");
            return (Criteria) this;
        }

        public Criteria andIUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("I_USER_TYPE not between", value1, value2, "iUserType");
            return (Criteria) this;
        }

        public Criteria andISenderIdIsNull() {
            addCriterion("I_SENDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andISenderIdIsNotNull() {
            addCriterion("I_SENDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andISenderIdEqualTo(Integer value) {
            addCriterion("I_SENDER_ID =", value, "iSenderId");
            return (Criteria) this;
        }

        public Criteria andISenderIdNotEqualTo(Integer value) {
            addCriterion("I_SENDER_ID <>", value, "iSenderId");
            return (Criteria) this;
        }

        public Criteria andISenderIdGreaterThan(Integer value) {
            addCriterion("I_SENDER_ID >", value, "iSenderId");
            return (Criteria) this;
        }

        public Criteria andISenderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_SENDER_ID >=", value, "iSenderId");
            return (Criteria) this;
        }

        public Criteria andISenderIdLessThan(Integer value) {
            addCriterion("I_SENDER_ID <", value, "iSenderId");
            return (Criteria) this;
        }

        public Criteria andISenderIdLessThanOrEqualTo(Integer value) {
            addCriterion("I_SENDER_ID <=", value, "iSenderId");
            return (Criteria) this;
        }

        public Criteria andISenderIdIn(List<Integer> values) {
            addCriterion("I_SENDER_ID in", values, "iSenderId");
            return (Criteria) this;
        }

        public Criteria andISenderIdNotIn(List<Integer> values) {
            addCriterion("I_SENDER_ID not in", values, "iSenderId");
            return (Criteria) this;
        }

        public Criteria andISenderIdBetween(Integer value1, Integer value2) {
            addCriterion("I_SENDER_ID between", value1, value2, "iSenderId");
            return (Criteria) this;
        }

        public Criteria andISenderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("I_SENDER_ID not between", value1, value2, "iSenderId");
            return (Criteria) this;
        }

        public Criteria andIRecverIdIsNull() {
            addCriterion("I_RECVER_ID is null");
            return (Criteria) this;
        }

        public Criteria andIRecverIdIsNotNull() {
            addCriterion("I_RECVER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIRecverIdEqualTo(Integer value) {
            addCriterion("I_RECVER_ID =", value, "iRecverId");
            return (Criteria) this;
        }

        public Criteria andIRecverIdNotEqualTo(Integer value) {
            addCriterion("I_RECVER_ID <>", value, "iRecverId");
            return (Criteria) this;
        }

        public Criteria andIRecverIdGreaterThan(Integer value) {
            addCriterion("I_RECVER_ID >", value, "iRecverId");
            return (Criteria) this;
        }

        public Criteria andIRecverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_RECVER_ID >=", value, "iRecverId");
            return (Criteria) this;
        }

        public Criteria andIRecverIdLessThan(Integer value) {
            addCriterion("I_RECVER_ID <", value, "iRecverId");
            return (Criteria) this;
        }

        public Criteria andIRecverIdLessThanOrEqualTo(Integer value) {
            addCriterion("I_RECVER_ID <=", value, "iRecverId");
            return (Criteria) this;
        }

        public Criteria andIRecverIdIn(List<Integer> values) {
            addCriterion("I_RECVER_ID in", values, "iRecverId");
            return (Criteria) this;
        }

        public Criteria andIRecverIdNotIn(List<Integer> values) {
            addCriterion("I_RECVER_ID not in", values, "iRecverId");
            return (Criteria) this;
        }

        public Criteria andIRecverIdBetween(Integer value1, Integer value2) {
            addCriterion("I_RECVER_ID between", value1, value2, "iRecverId");
            return (Criteria) this;
        }

        public Criteria andIRecverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("I_RECVER_ID not between", value1, value2, "iRecverId");
            return (Criteria) this;
        }

        public Criteria andISenderOperatorIdIsNull() {
            addCriterion("I_SENDER_OPERATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andISenderOperatorIdIsNotNull() {
            addCriterion("I_SENDER_OPERATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andISenderOperatorIdEqualTo(Integer value) {
            addCriterion("I_SENDER_OPERATOR_ID =", value, "iSenderOperatorId");
            return (Criteria) this;
        }

        public Criteria andISenderOperatorIdNotEqualTo(Integer value) {
            addCriterion("I_SENDER_OPERATOR_ID <>", value, "iSenderOperatorId");
            return (Criteria) this;
        }

        public Criteria andISenderOperatorIdGreaterThan(Integer value) {
            addCriterion("I_SENDER_OPERATOR_ID >", value, "iSenderOperatorId");
            return (Criteria) this;
        }

        public Criteria andISenderOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_SENDER_OPERATOR_ID >=", value, "iSenderOperatorId");
            return (Criteria) this;
        }

        public Criteria andISenderOperatorIdLessThan(Integer value) {
            addCriterion("I_SENDER_OPERATOR_ID <", value, "iSenderOperatorId");
            return (Criteria) this;
        }

        public Criteria andISenderOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("I_SENDER_OPERATOR_ID <=", value, "iSenderOperatorId");
            return (Criteria) this;
        }

        public Criteria andISenderOperatorIdIn(List<Integer> values) {
            addCriterion("I_SENDER_OPERATOR_ID in", values, "iSenderOperatorId");
            return (Criteria) this;
        }

        public Criteria andISenderOperatorIdNotIn(List<Integer> values) {
            addCriterion("I_SENDER_OPERATOR_ID not in", values, "iSenderOperatorId");
            return (Criteria) this;
        }

        public Criteria andISenderOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("I_SENDER_OPERATOR_ID between", value1, value2, "iSenderOperatorId");
            return (Criteria) this;
        }

        public Criteria andISenderOperatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("I_SENDER_OPERATOR_ID not between", value1, value2, "iSenderOperatorId");
            return (Criteria) this;
        }

        public Criteria andIRecverOperatorIdIsNull() {
            addCriterion("I_RECVER_OPERATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andIRecverOperatorIdIsNotNull() {
            addCriterion("I_RECVER_OPERATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIRecverOperatorIdEqualTo(Integer value) {
            addCriterion("I_RECVER_OPERATOR_ID =", value, "iRecverOperatorId");
            return (Criteria) this;
        }

        public Criteria andIRecverOperatorIdNotEqualTo(Integer value) {
            addCriterion("I_RECVER_OPERATOR_ID <>", value, "iRecverOperatorId");
            return (Criteria) this;
        }

        public Criteria andIRecverOperatorIdGreaterThan(Integer value) {
            addCriterion("I_RECVER_OPERATOR_ID >", value, "iRecverOperatorId");
            return (Criteria) this;
        }

        public Criteria andIRecverOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_RECVER_OPERATOR_ID >=", value, "iRecverOperatorId");
            return (Criteria) this;
        }

        public Criteria andIRecverOperatorIdLessThan(Integer value) {
            addCriterion("I_RECVER_OPERATOR_ID <", value, "iRecverOperatorId");
            return (Criteria) this;
        }

        public Criteria andIRecverOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("I_RECVER_OPERATOR_ID <=", value, "iRecverOperatorId");
            return (Criteria) this;
        }

        public Criteria andIRecverOperatorIdIn(List<Integer> values) {
            addCriterion("I_RECVER_OPERATOR_ID in", values, "iRecverOperatorId");
            return (Criteria) this;
        }

        public Criteria andIRecverOperatorIdNotIn(List<Integer> values) {
            addCriterion("I_RECVER_OPERATOR_ID not in", values, "iRecverOperatorId");
            return (Criteria) this;
        }

        public Criteria andIRecverOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("I_RECVER_OPERATOR_ID between", value1, value2, "iRecverOperatorId");
            return (Criteria) this;
        }

        public Criteria andIRecverOperatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("I_RECVER_OPERATOR_ID not between", value1, value2, "iRecverOperatorId");
            return (Criteria) this;
        }

        public Criteria andCSenderNameIsNull() {
            addCriterion("C_SENDER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCSenderNameIsNotNull() {
            addCriterion("C_SENDER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCSenderNameEqualTo(String value) {
            addCriterion("C_SENDER_NAME =", value, "cSenderName");
            return (Criteria) this;
        }

        public Criteria andCSenderNameNotEqualTo(String value) {
            addCriterion("C_SENDER_NAME <>", value, "cSenderName");
            return (Criteria) this;
        }

        public Criteria andCSenderNameGreaterThan(String value) {
            addCriterion("C_SENDER_NAME >", value, "cSenderName");
            return (Criteria) this;
        }

        public Criteria andCSenderNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_SENDER_NAME >=", value, "cSenderName");
            return (Criteria) this;
        }

        public Criteria andCSenderNameLessThan(String value) {
            addCriterion("C_SENDER_NAME <", value, "cSenderName");
            return (Criteria) this;
        }

        public Criteria andCSenderNameLessThanOrEqualTo(String value) {
            addCriterion("C_SENDER_NAME <=", value, "cSenderName");
            return (Criteria) this;
        }

        public Criteria andCSenderNameLike(String value) {
            addCriterion("C_SENDER_NAME like", value, "cSenderName");
            return (Criteria) this;
        }

        public Criteria andCSenderNameNotLike(String value) {
            addCriterion("C_SENDER_NAME not like", value, "cSenderName");
            return (Criteria) this;
        }

        public Criteria andCSenderNameIn(List<String> values) {
            addCriterion("C_SENDER_NAME in", values, "cSenderName");
            return (Criteria) this;
        }

        public Criteria andCSenderNameNotIn(List<String> values) {
            addCriterion("C_SENDER_NAME not in", values, "cSenderName");
            return (Criteria) this;
        }

        public Criteria andCSenderNameBetween(String value1, String value2) {
            addCriterion("C_SENDER_NAME between", value1, value2, "cSenderName");
            return (Criteria) this;
        }

        public Criteria andCSenderNameNotBetween(String value1, String value2) {
            addCriterion("C_SENDER_NAME not between", value1, value2, "cSenderName");
            return (Criteria) this;
        }

        public Criteria andCSenderAddressIsNull() {
            addCriterion("C_SENDER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCSenderAddressIsNotNull() {
            addCriterion("C_SENDER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCSenderAddressEqualTo(String value) {
            addCriterion("C_SENDER_ADDRESS =", value, "cSenderAddress");
            return (Criteria) this;
        }

        public Criteria andCSenderAddressNotEqualTo(String value) {
            addCriterion("C_SENDER_ADDRESS <>", value, "cSenderAddress");
            return (Criteria) this;
        }

        public Criteria andCSenderAddressGreaterThan(String value) {
            addCriterion("C_SENDER_ADDRESS >", value, "cSenderAddress");
            return (Criteria) this;
        }

        public Criteria andCSenderAddressGreaterThanOrEqualTo(String value) {
            addCriterion("C_SENDER_ADDRESS >=", value, "cSenderAddress");
            return (Criteria) this;
        }

        public Criteria andCSenderAddressLessThan(String value) {
            addCriterion("C_SENDER_ADDRESS <", value, "cSenderAddress");
            return (Criteria) this;
        }

        public Criteria andCSenderAddressLessThanOrEqualTo(String value) {
            addCriterion("C_SENDER_ADDRESS <=", value, "cSenderAddress");
            return (Criteria) this;
        }

        public Criteria andCSenderAddressLike(String value) {
            addCriterion("C_SENDER_ADDRESS like", value, "cSenderAddress");
            return (Criteria) this;
        }

        public Criteria andCSenderAddressNotLike(String value) {
            addCriterion("C_SENDER_ADDRESS not like", value, "cSenderAddress");
            return (Criteria) this;
        }

        public Criteria andCSenderAddressIn(List<String> values) {
            addCriterion("C_SENDER_ADDRESS in", values, "cSenderAddress");
            return (Criteria) this;
        }

        public Criteria andCSenderAddressNotIn(List<String> values) {
            addCriterion("C_SENDER_ADDRESS not in", values, "cSenderAddress");
            return (Criteria) this;
        }

        public Criteria andCSenderAddressBetween(String value1, String value2) {
            addCriterion("C_SENDER_ADDRESS between", value1, value2, "cSenderAddress");
            return (Criteria) this;
        }

        public Criteria andCSenderAddressNotBetween(String value1, String value2) {
            addCriterion("C_SENDER_ADDRESS not between", value1, value2, "cSenderAddress");
            return (Criteria) this;
        }

        public Criteria andCSenderPhoneIsNull() {
            addCriterion("C_SENDER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCSenderPhoneIsNotNull() {
            addCriterion("C_SENDER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCSenderPhoneEqualTo(String value) {
            addCriterion("C_SENDER_PHONE =", value, "cSenderPhone");
            return (Criteria) this;
        }

        public Criteria andCSenderPhoneNotEqualTo(String value) {
            addCriterion("C_SENDER_PHONE <>", value, "cSenderPhone");
            return (Criteria) this;
        }

        public Criteria andCSenderPhoneGreaterThan(String value) {
            addCriterion("C_SENDER_PHONE >", value, "cSenderPhone");
            return (Criteria) this;
        }

        public Criteria andCSenderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("C_SENDER_PHONE >=", value, "cSenderPhone");
            return (Criteria) this;
        }

        public Criteria andCSenderPhoneLessThan(String value) {
            addCriterion("C_SENDER_PHONE <", value, "cSenderPhone");
            return (Criteria) this;
        }

        public Criteria andCSenderPhoneLessThanOrEqualTo(String value) {
            addCriterion("C_SENDER_PHONE <=", value, "cSenderPhone");
            return (Criteria) this;
        }

        public Criteria andCSenderPhoneLike(String value) {
            addCriterion("C_SENDER_PHONE like", value, "cSenderPhone");
            return (Criteria) this;
        }

        public Criteria andCSenderPhoneNotLike(String value) {
            addCriterion("C_SENDER_PHONE not like", value, "cSenderPhone");
            return (Criteria) this;
        }

        public Criteria andCSenderPhoneIn(List<String> values) {
            addCriterion("C_SENDER_PHONE in", values, "cSenderPhone");
            return (Criteria) this;
        }

        public Criteria andCSenderPhoneNotIn(List<String> values) {
            addCriterion("C_SENDER_PHONE not in", values, "cSenderPhone");
            return (Criteria) this;
        }

        public Criteria andCSenderPhoneBetween(String value1, String value2) {
            addCriterion("C_SENDER_PHONE between", value1, value2, "cSenderPhone");
            return (Criteria) this;
        }

        public Criteria andCSenderPhoneNotBetween(String value1, String value2) {
            addCriterion("C_SENDER_PHONE not between", value1, value2, "cSenderPhone");
            return (Criteria) this;
        }

        public Criteria andCSenderEmailIsNull() {
            addCriterion("C_SENDER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCSenderEmailIsNotNull() {
            addCriterion("C_SENDER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCSenderEmailEqualTo(String value) {
            addCriterion("C_SENDER_EMAIL =", value, "cSenderEmail");
            return (Criteria) this;
        }

        public Criteria andCSenderEmailNotEqualTo(String value) {
            addCriterion("C_SENDER_EMAIL <>", value, "cSenderEmail");
            return (Criteria) this;
        }

        public Criteria andCSenderEmailGreaterThan(String value) {
            addCriterion("C_SENDER_EMAIL >", value, "cSenderEmail");
            return (Criteria) this;
        }

        public Criteria andCSenderEmailGreaterThanOrEqualTo(String value) {
            addCriterion("C_SENDER_EMAIL >=", value, "cSenderEmail");
            return (Criteria) this;
        }

        public Criteria andCSenderEmailLessThan(String value) {
            addCriterion("C_SENDER_EMAIL <", value, "cSenderEmail");
            return (Criteria) this;
        }

        public Criteria andCSenderEmailLessThanOrEqualTo(String value) {
            addCriterion("C_SENDER_EMAIL <=", value, "cSenderEmail");
            return (Criteria) this;
        }

        public Criteria andCSenderEmailLike(String value) {
            addCriterion("C_SENDER_EMAIL like", value, "cSenderEmail");
            return (Criteria) this;
        }

        public Criteria andCSenderEmailNotLike(String value) {
            addCriterion("C_SENDER_EMAIL not like", value, "cSenderEmail");
            return (Criteria) this;
        }

        public Criteria andCSenderEmailIn(List<String> values) {
            addCriterion("C_SENDER_EMAIL in", values, "cSenderEmail");
            return (Criteria) this;
        }

        public Criteria andCSenderEmailNotIn(List<String> values) {
            addCriterion("C_SENDER_EMAIL not in", values, "cSenderEmail");
            return (Criteria) this;
        }

        public Criteria andCSenderEmailBetween(String value1, String value2) {
            addCriterion("C_SENDER_EMAIL between", value1, value2, "cSenderEmail");
            return (Criteria) this;
        }

        public Criteria andCSenderEmailNotBetween(String value1, String value2) {
            addCriterion("C_SENDER_EMAIL not between", value1, value2, "cSenderEmail");
            return (Criteria) this;
        }

        public Criteria andCSenderPostcodeIsNull() {
            addCriterion("C_SENDER_POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andCSenderPostcodeIsNotNull() {
            addCriterion("C_SENDER_POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCSenderPostcodeEqualTo(String value) {
            addCriterion("C_SENDER_POSTCODE =", value, "cSenderPostcode");
            return (Criteria) this;
        }

        public Criteria andCSenderPostcodeNotEqualTo(String value) {
            addCriterion("C_SENDER_POSTCODE <>", value, "cSenderPostcode");
            return (Criteria) this;
        }

        public Criteria andCSenderPostcodeGreaterThan(String value) {
            addCriterion("C_SENDER_POSTCODE >", value, "cSenderPostcode");
            return (Criteria) this;
        }

        public Criteria andCSenderPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_SENDER_POSTCODE >=", value, "cSenderPostcode");
            return (Criteria) this;
        }

        public Criteria andCSenderPostcodeLessThan(String value) {
            addCriterion("C_SENDER_POSTCODE <", value, "cSenderPostcode");
            return (Criteria) this;
        }

        public Criteria andCSenderPostcodeLessThanOrEqualTo(String value) {
            addCriterion("C_SENDER_POSTCODE <=", value, "cSenderPostcode");
            return (Criteria) this;
        }

        public Criteria andCSenderPostcodeLike(String value) {
            addCriterion("C_SENDER_POSTCODE like", value, "cSenderPostcode");
            return (Criteria) this;
        }

        public Criteria andCSenderPostcodeNotLike(String value) {
            addCriterion("C_SENDER_POSTCODE not like", value, "cSenderPostcode");
            return (Criteria) this;
        }

        public Criteria andCSenderPostcodeIn(List<String> values) {
            addCriterion("C_SENDER_POSTCODE in", values, "cSenderPostcode");
            return (Criteria) this;
        }

        public Criteria andCSenderPostcodeNotIn(List<String> values) {
            addCriterion("C_SENDER_POSTCODE not in", values, "cSenderPostcode");
            return (Criteria) this;
        }

        public Criteria andCSenderPostcodeBetween(String value1, String value2) {
            addCriterion("C_SENDER_POSTCODE between", value1, value2, "cSenderPostcode");
            return (Criteria) this;
        }

        public Criteria andCSenderPostcodeNotBetween(String value1, String value2) {
            addCriterion("C_SENDER_POSTCODE not between", value1, value2, "cSenderPostcode");
            return (Criteria) this;
        }

        public Criteria andCSenderNoteIsNull() {
            addCriterion("C_SENDER_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andCSenderNoteIsNotNull() {
            addCriterion("C_SENDER_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andCSenderNoteEqualTo(String value) {
            addCriterion("C_SENDER_NOTE =", value, "cSenderNote");
            return (Criteria) this;
        }

        public Criteria andCSenderNoteNotEqualTo(String value) {
            addCriterion("C_SENDER_NOTE <>", value, "cSenderNote");
            return (Criteria) this;
        }

        public Criteria andCSenderNoteGreaterThan(String value) {
            addCriterion("C_SENDER_NOTE >", value, "cSenderNote");
            return (Criteria) this;
        }

        public Criteria andCSenderNoteGreaterThanOrEqualTo(String value) {
            addCriterion("C_SENDER_NOTE >=", value, "cSenderNote");
            return (Criteria) this;
        }

        public Criteria andCSenderNoteLessThan(String value) {
            addCriterion("C_SENDER_NOTE <", value, "cSenderNote");
            return (Criteria) this;
        }

        public Criteria andCSenderNoteLessThanOrEqualTo(String value) {
            addCriterion("C_SENDER_NOTE <=", value, "cSenderNote");
            return (Criteria) this;
        }

        public Criteria andCSenderNoteLike(String value) {
            addCriterion("C_SENDER_NOTE like", value, "cSenderNote");
            return (Criteria) this;
        }

        public Criteria andCSenderNoteNotLike(String value) {
            addCriterion("C_SENDER_NOTE not like", value, "cSenderNote");
            return (Criteria) this;
        }

        public Criteria andCSenderNoteIn(List<String> values) {
            addCriterion("C_SENDER_NOTE in", values, "cSenderNote");
            return (Criteria) this;
        }

        public Criteria andCSenderNoteNotIn(List<String> values) {
            addCriterion("C_SENDER_NOTE not in", values, "cSenderNote");
            return (Criteria) this;
        }

        public Criteria andCSenderNoteBetween(String value1, String value2) {
            addCriterion("C_SENDER_NOTE between", value1, value2, "cSenderNote");
            return (Criteria) this;
        }

        public Criteria andCSenderNoteNotBetween(String value1, String value2) {
            addCriterion("C_SENDER_NOTE not between", value1, value2, "cSenderNote");
            return (Criteria) this;
        }

        public Criteria andCSenderCityIsNull() {
            addCriterion("C_SENDER_CITY is null");
            return (Criteria) this;
        }

        public Criteria andCSenderCityIsNotNull() {
            addCriterion("C_SENDER_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCSenderCityEqualTo(String value) {
            addCriterion("C_SENDER_CITY =", value, "cSenderCity");
            return (Criteria) this;
        }

        public Criteria andCSenderCityNotEqualTo(String value) {
            addCriterion("C_SENDER_CITY <>", value, "cSenderCity");
            return (Criteria) this;
        }

        public Criteria andCSenderCityGreaterThan(String value) {
            addCriterion("C_SENDER_CITY >", value, "cSenderCity");
            return (Criteria) this;
        }

        public Criteria andCSenderCityGreaterThanOrEqualTo(String value) {
            addCriterion("C_SENDER_CITY >=", value, "cSenderCity");
            return (Criteria) this;
        }

        public Criteria andCSenderCityLessThan(String value) {
            addCriterion("C_SENDER_CITY <", value, "cSenderCity");
            return (Criteria) this;
        }

        public Criteria andCSenderCityLessThanOrEqualTo(String value) {
            addCriterion("C_SENDER_CITY <=", value, "cSenderCity");
            return (Criteria) this;
        }

        public Criteria andCSenderCityLike(String value) {
            addCriterion("C_SENDER_CITY like", value, "cSenderCity");
            return (Criteria) this;
        }

        public Criteria andCSenderCityNotLike(String value) {
            addCriterion("C_SENDER_CITY not like", value, "cSenderCity");
            return (Criteria) this;
        }

        public Criteria andCSenderCityIn(List<String> values) {
            addCriterion("C_SENDER_CITY in", values, "cSenderCity");
            return (Criteria) this;
        }

        public Criteria andCSenderCityNotIn(List<String> values) {
            addCriterion("C_SENDER_CITY not in", values, "cSenderCity");
            return (Criteria) this;
        }

        public Criteria andCSenderCityBetween(String value1, String value2) {
            addCriterion("C_SENDER_CITY between", value1, value2, "cSenderCity");
            return (Criteria) this;
        }

        public Criteria andCSenderCityNotBetween(String value1, String value2) {
            addCriterion("C_SENDER_CITY not between", value1, value2, "cSenderCity");
            return (Criteria) this;
        }

        public Criteria andCLoadStationIsNull() {
            addCriterion("C_LOAD_STATION is null");
            return (Criteria) this;
        }

        public Criteria andCLoadStationIsNotNull() {
            addCriterion("C_LOAD_STATION is not null");
            return (Criteria) this;
        }

        public Criteria andCLoadStationEqualTo(String value) {
            addCriterion("C_LOAD_STATION =", value, "cLoadStation");
            return (Criteria) this;
        }

        public Criteria andCLoadStationNotEqualTo(String value) {
            addCriterion("C_LOAD_STATION <>", value, "cLoadStation");
            return (Criteria) this;
        }

        public Criteria andCLoadStationGreaterThan(String value) {
            addCriterion("C_LOAD_STATION >", value, "cLoadStation");
            return (Criteria) this;
        }

        public Criteria andCLoadStationGreaterThanOrEqualTo(String value) {
            addCriterion("C_LOAD_STATION >=", value, "cLoadStation");
            return (Criteria) this;
        }

        public Criteria andCLoadStationLessThan(String value) {
            addCriterion("C_LOAD_STATION <", value, "cLoadStation");
            return (Criteria) this;
        }

        public Criteria andCLoadStationLessThanOrEqualTo(String value) {
            addCriterion("C_LOAD_STATION <=", value, "cLoadStation");
            return (Criteria) this;
        }

        public Criteria andCLoadStationLike(String value) {
            addCriterion("C_LOAD_STATION like", value, "cLoadStation");
            return (Criteria) this;
        }

        public Criteria andCLoadStationNotLike(String value) {
            addCriterion("C_LOAD_STATION not like", value, "cLoadStation");
            return (Criteria) this;
        }

        public Criteria andCLoadStationIn(List<String> values) {
            addCriterion("C_LOAD_STATION in", values, "cLoadStation");
            return (Criteria) this;
        }

        public Criteria andCLoadStationNotIn(List<String> values) {
            addCriterion("C_LOAD_STATION not in", values, "cLoadStation");
            return (Criteria) this;
        }

        public Criteria andCLoadStationBetween(String value1, String value2) {
            addCriterion("C_LOAD_STATION between", value1, value2, "cLoadStation");
            return (Criteria) this;
        }

        public Criteria andCLoadStationNotBetween(String value1, String value2) {
            addCriterion("C_LOAD_STATION not between", value1, value2, "cLoadStation");
            return (Criteria) this;
        }

        public Criteria andCLoadLocationIsNull() {
            addCriterion("C_LOAD_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andCLoadLocationIsNotNull() {
            addCriterion("C_LOAD_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andCLoadLocationEqualTo(String value) {
            addCriterion("C_LOAD_LOCATION =", value, "cLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadLocationNotEqualTo(String value) {
            addCriterion("C_LOAD_LOCATION <>", value, "cLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadLocationGreaterThan(String value) {
            addCriterion("C_LOAD_LOCATION >", value, "cLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadLocationGreaterThanOrEqualTo(String value) {
            addCriterion("C_LOAD_LOCATION >=", value, "cLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadLocationLessThan(String value) {
            addCriterion("C_LOAD_LOCATION <", value, "cLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadLocationLessThanOrEqualTo(String value) {
            addCriterion("C_LOAD_LOCATION <=", value, "cLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadLocationLike(String value) {
            addCriterion("C_LOAD_LOCATION like", value, "cLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadLocationNotLike(String value) {
            addCriterion("C_LOAD_LOCATION not like", value, "cLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadLocationIn(List<String> values) {
            addCriterion("C_LOAD_LOCATION in", values, "cLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadLocationNotIn(List<String> values) {
            addCriterion("C_LOAD_LOCATION not in", values, "cLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadLocationBetween(String value1, String value2) {
            addCriterion("C_LOAD_LOCATION between", value1, value2, "cLoadLocation");
            return (Criteria) this;
        }

        public Criteria andCLoadLocationNotBetween(String value1, String value2) {
            addCriterion("C_LOAD_LOCATION not between", value1, value2, "cLoadLocation");
            return (Criteria) this;
        }

        public Criteria andDPredictSendTimeIsNull() {
            addCriterion("D_PREDICT_SEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDPredictSendTimeIsNotNull() {
            addCriterion("D_PREDICT_SEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDPredictSendTimeEqualTo(Date value) {
            addCriterion("D_PREDICT_SEND_TIME =", value, "dPredictSendTime");
            return (Criteria) this;
        }

        public Criteria andDPredictSendTimeNotEqualTo(Date value) {
            addCriterion("D_PREDICT_SEND_TIME <>", value, "dPredictSendTime");
            return (Criteria) this;
        }

        public Criteria andDPredictSendTimeGreaterThan(Date value) {
            addCriterion("D_PREDICT_SEND_TIME >", value, "dPredictSendTime");
            return (Criteria) this;
        }

        public Criteria andDPredictSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_PREDICT_SEND_TIME >=", value, "dPredictSendTime");
            return (Criteria) this;
        }

        public Criteria andDPredictSendTimeLessThan(Date value) {
            addCriterion("D_PREDICT_SEND_TIME <", value, "dPredictSendTime");
            return (Criteria) this;
        }

        public Criteria andDPredictSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_PREDICT_SEND_TIME <=", value, "dPredictSendTime");
            return (Criteria) this;
        }

        public Criteria andDPredictSendTimeIn(List<Date> values) {
            addCriterion("D_PREDICT_SEND_TIME in", values, "dPredictSendTime");
            return (Criteria) this;
        }

        public Criteria andDPredictSendTimeNotIn(List<Date> values) {
            addCriterion("D_PREDICT_SEND_TIME not in", values, "dPredictSendTime");
            return (Criteria) this;
        }

        public Criteria andDPredictSendTimeBetween(Date value1, Date value2) {
            addCriterion("D_PREDICT_SEND_TIME between", value1, value2, "dPredictSendTime");
            return (Criteria) this;
        }

        public Criteria andDPredictSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_PREDICT_SEND_TIME not between", value1, value2, "dPredictSendTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadStartTimeIsNull() {
            addCriterion("D_PREDICT_LOAD_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadStartTimeIsNotNull() {
            addCriterion("D_PREDICT_LOAD_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadStartTimeEqualTo(Date value) {
            addCriterion("D_PREDICT_LOAD_START_TIME =", value, "dPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadStartTimeNotEqualTo(Date value) {
            addCriterion("D_PREDICT_LOAD_START_TIME <>", value, "dPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadStartTimeGreaterThan(Date value) {
            addCriterion("D_PREDICT_LOAD_START_TIME >", value, "dPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_PREDICT_LOAD_START_TIME >=", value, "dPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadStartTimeLessThan(Date value) {
            addCriterion("D_PREDICT_LOAD_START_TIME <", value, "dPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_PREDICT_LOAD_START_TIME <=", value, "dPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadStartTimeIn(List<Date> values) {
            addCriterion("D_PREDICT_LOAD_START_TIME in", values, "dPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadStartTimeNotIn(List<Date> values) {
            addCriterion("D_PREDICT_LOAD_START_TIME not in", values, "dPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadStartTimeBetween(Date value1, Date value2) {
            addCriterion("D_PREDICT_LOAD_START_TIME between", value1, value2, "dPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_PREDICT_LOAD_START_TIME not between", value1, value2, "dPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadEndTimeIsNull() {
            addCriterion("D_PREDICT_LOAD_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadEndTimeIsNotNull() {
            addCriterion("D_PREDICT_LOAD_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadEndTimeEqualTo(Date value) {
            addCriterion("D_PREDICT_LOAD_END_TIME =", value, "dPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadEndTimeNotEqualTo(Date value) {
            addCriterion("D_PREDICT_LOAD_END_TIME <>", value, "dPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadEndTimeGreaterThan(Date value) {
            addCriterion("D_PREDICT_LOAD_END_TIME >", value, "dPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_PREDICT_LOAD_END_TIME >=", value, "dPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadEndTimeLessThan(Date value) {
            addCriterion("D_PREDICT_LOAD_END_TIME <", value, "dPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_PREDICT_LOAD_END_TIME <=", value, "dPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadEndTimeIn(List<Date> values) {
            addCriterion("D_PREDICT_LOAD_END_TIME in", values, "dPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadEndTimeNotIn(List<Date> values) {
            addCriterion("D_PREDICT_LOAD_END_TIME not in", values, "dPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadEndTimeBetween(Date value1, Date value2) {
            addCriterion("D_PREDICT_LOAD_END_TIME between", value1, value2, "dPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDPredictLoadEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_PREDICT_LOAD_END_TIME not between", value1, value2, "dPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andCRecverAddressIsNull() {
            addCriterion("C_RECVER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCRecverAddressIsNotNull() {
            addCriterion("C_RECVER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCRecverAddressEqualTo(String value) {
            addCriterion("C_RECVER_ADDRESS =", value, "cRecverAddress");
            return (Criteria) this;
        }

        public Criteria andCRecverAddressNotEqualTo(String value) {
            addCriterion("C_RECVER_ADDRESS <>", value, "cRecverAddress");
            return (Criteria) this;
        }

        public Criteria andCRecverAddressGreaterThan(String value) {
            addCriterion("C_RECVER_ADDRESS >", value, "cRecverAddress");
            return (Criteria) this;
        }

        public Criteria andCRecverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("C_RECVER_ADDRESS >=", value, "cRecverAddress");
            return (Criteria) this;
        }

        public Criteria andCRecverAddressLessThan(String value) {
            addCriterion("C_RECVER_ADDRESS <", value, "cRecverAddress");
            return (Criteria) this;
        }

        public Criteria andCRecverAddressLessThanOrEqualTo(String value) {
            addCriterion("C_RECVER_ADDRESS <=", value, "cRecverAddress");
            return (Criteria) this;
        }

        public Criteria andCRecverAddressLike(String value) {
            addCriterion("C_RECVER_ADDRESS like", value, "cRecverAddress");
            return (Criteria) this;
        }

        public Criteria andCRecverAddressNotLike(String value) {
            addCriterion("C_RECVER_ADDRESS not like", value, "cRecverAddress");
            return (Criteria) this;
        }

        public Criteria andCRecverAddressIn(List<String> values) {
            addCriterion("C_RECVER_ADDRESS in", values, "cRecverAddress");
            return (Criteria) this;
        }

        public Criteria andCRecverAddressNotIn(List<String> values) {
            addCriterion("C_RECVER_ADDRESS not in", values, "cRecverAddress");
            return (Criteria) this;
        }

        public Criteria andCRecverAddressBetween(String value1, String value2) {
            addCriterion("C_RECVER_ADDRESS between", value1, value2, "cRecverAddress");
            return (Criteria) this;
        }

        public Criteria andCRecverAddressNotBetween(String value1, String value2) {
            addCriterion("C_RECVER_ADDRESS not between", value1, value2, "cRecverAddress");
            return (Criteria) this;
        }

        public Criteria andCRecverPhoneIsNull() {
            addCriterion("C_RECVER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCRecverPhoneIsNotNull() {
            addCriterion("C_RECVER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCRecverPhoneEqualTo(String value) {
            addCriterion("C_RECVER_PHONE =", value, "cRecverPhone");
            return (Criteria) this;
        }

        public Criteria andCRecverPhoneNotEqualTo(String value) {
            addCriterion("C_RECVER_PHONE <>", value, "cRecverPhone");
            return (Criteria) this;
        }

        public Criteria andCRecverPhoneGreaterThan(String value) {
            addCriterion("C_RECVER_PHONE >", value, "cRecverPhone");
            return (Criteria) this;
        }

        public Criteria andCRecverPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("C_RECVER_PHONE >=", value, "cRecverPhone");
            return (Criteria) this;
        }

        public Criteria andCRecverPhoneLessThan(String value) {
            addCriterion("C_RECVER_PHONE <", value, "cRecverPhone");
            return (Criteria) this;
        }

        public Criteria andCRecverPhoneLessThanOrEqualTo(String value) {
            addCriterion("C_RECVER_PHONE <=", value, "cRecverPhone");
            return (Criteria) this;
        }

        public Criteria andCRecverPhoneLike(String value) {
            addCriterion("C_RECVER_PHONE like", value, "cRecverPhone");
            return (Criteria) this;
        }

        public Criteria andCRecverPhoneNotLike(String value) {
            addCriterion("C_RECVER_PHONE not like", value, "cRecverPhone");
            return (Criteria) this;
        }

        public Criteria andCRecverPhoneIn(List<String> values) {
            addCriterion("C_RECVER_PHONE in", values, "cRecverPhone");
            return (Criteria) this;
        }

        public Criteria andCRecverPhoneNotIn(List<String> values) {
            addCriterion("C_RECVER_PHONE not in", values, "cRecverPhone");
            return (Criteria) this;
        }

        public Criteria andCRecverPhoneBetween(String value1, String value2) {
            addCriterion("C_RECVER_PHONE between", value1, value2, "cRecverPhone");
            return (Criteria) this;
        }

        public Criteria andCRecverPhoneNotBetween(String value1, String value2) {
            addCriterion("C_RECVER_PHONE not between", value1, value2, "cRecverPhone");
            return (Criteria) this;
        }

        public Criteria andCRecverEmailIsNull() {
            addCriterion("C_RECVER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCRecverEmailIsNotNull() {
            addCriterion("C_RECVER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCRecverEmailEqualTo(String value) {
            addCriterion("C_RECVER_EMAIL =", value, "cRecverEmail");
            return (Criteria) this;
        }

        public Criteria andCRecverEmailNotEqualTo(String value) {
            addCriterion("C_RECVER_EMAIL <>", value, "cRecverEmail");
            return (Criteria) this;
        }

        public Criteria andCRecverEmailGreaterThan(String value) {
            addCriterion("C_RECVER_EMAIL >", value, "cRecverEmail");
            return (Criteria) this;
        }

        public Criteria andCRecverEmailGreaterThanOrEqualTo(String value) {
            addCriterion("C_RECVER_EMAIL >=", value, "cRecverEmail");
            return (Criteria) this;
        }

        public Criteria andCRecverEmailLessThan(String value) {
            addCriterion("C_RECVER_EMAIL <", value, "cRecverEmail");
            return (Criteria) this;
        }

        public Criteria andCRecverEmailLessThanOrEqualTo(String value) {
            addCriterion("C_RECVER_EMAIL <=", value, "cRecverEmail");
            return (Criteria) this;
        }

        public Criteria andCRecverEmailLike(String value) {
            addCriterion("C_RECVER_EMAIL like", value, "cRecverEmail");
            return (Criteria) this;
        }

        public Criteria andCRecverEmailNotLike(String value) {
            addCriterion("C_RECVER_EMAIL not like", value, "cRecverEmail");
            return (Criteria) this;
        }

        public Criteria andCRecverEmailIn(List<String> values) {
            addCriterion("C_RECVER_EMAIL in", values, "cRecverEmail");
            return (Criteria) this;
        }

        public Criteria andCRecverEmailNotIn(List<String> values) {
            addCriterion("C_RECVER_EMAIL not in", values, "cRecverEmail");
            return (Criteria) this;
        }

        public Criteria andCRecverEmailBetween(String value1, String value2) {
            addCriterion("C_RECVER_EMAIL between", value1, value2, "cRecverEmail");
            return (Criteria) this;
        }

        public Criteria andCRecverEmailNotBetween(String value1, String value2) {
            addCriterion("C_RECVER_EMAIL not between", value1, value2, "cRecverEmail");
            return (Criteria) this;
        }

        public Criteria andCRecverPostcodeIsNull() {
            addCriterion("C_RECVER_POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andCRecverPostcodeIsNotNull() {
            addCriterion("C_RECVER_POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCRecverPostcodeEqualTo(String value) {
            addCriterion("C_RECVER_POSTCODE =", value, "cRecverPostcode");
            return (Criteria) this;
        }

        public Criteria andCRecverPostcodeNotEqualTo(String value) {
            addCriterion("C_RECVER_POSTCODE <>", value, "cRecverPostcode");
            return (Criteria) this;
        }

        public Criteria andCRecverPostcodeGreaterThan(String value) {
            addCriterion("C_RECVER_POSTCODE >", value, "cRecverPostcode");
            return (Criteria) this;
        }

        public Criteria andCRecverPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_RECVER_POSTCODE >=", value, "cRecverPostcode");
            return (Criteria) this;
        }

        public Criteria andCRecverPostcodeLessThan(String value) {
            addCriterion("C_RECVER_POSTCODE <", value, "cRecverPostcode");
            return (Criteria) this;
        }

        public Criteria andCRecverPostcodeLessThanOrEqualTo(String value) {
            addCriterion("C_RECVER_POSTCODE <=", value, "cRecverPostcode");
            return (Criteria) this;
        }

        public Criteria andCRecverPostcodeLike(String value) {
            addCriterion("C_RECVER_POSTCODE like", value, "cRecverPostcode");
            return (Criteria) this;
        }

        public Criteria andCRecverPostcodeNotLike(String value) {
            addCriterion("C_RECVER_POSTCODE not like", value, "cRecverPostcode");
            return (Criteria) this;
        }

        public Criteria andCRecverPostcodeIn(List<String> values) {
            addCriterion("C_RECVER_POSTCODE in", values, "cRecverPostcode");
            return (Criteria) this;
        }

        public Criteria andCRecverPostcodeNotIn(List<String> values) {
            addCriterion("C_RECVER_POSTCODE not in", values, "cRecverPostcode");
            return (Criteria) this;
        }

        public Criteria andCRecverPostcodeBetween(String value1, String value2) {
            addCriterion("C_RECVER_POSTCODE between", value1, value2, "cRecverPostcode");
            return (Criteria) this;
        }

        public Criteria andCRecverPostcodeNotBetween(String value1, String value2) {
            addCriterion("C_RECVER_POSTCODE not between", value1, value2, "cRecverPostcode");
            return (Criteria) this;
        }

        public Criteria andCRecverCityIsNull() {
            addCriterion("C_RECVER_CITY is null");
            return (Criteria) this;
        }

        public Criteria andCRecverCityIsNotNull() {
            addCriterion("C_RECVER_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCRecverCityEqualTo(String value) {
            addCriterion("C_RECVER_CITY =", value, "cRecverCity");
            return (Criteria) this;
        }

        public Criteria andCRecverCityNotEqualTo(String value) {
            addCriterion("C_RECVER_CITY <>", value, "cRecverCity");
            return (Criteria) this;
        }

        public Criteria andCRecverCityGreaterThan(String value) {
            addCriterion("C_RECVER_CITY >", value, "cRecverCity");
            return (Criteria) this;
        }

        public Criteria andCRecverCityGreaterThanOrEqualTo(String value) {
            addCriterion("C_RECVER_CITY >=", value, "cRecverCity");
            return (Criteria) this;
        }

        public Criteria andCRecverCityLessThan(String value) {
            addCriterion("C_RECVER_CITY <", value, "cRecverCity");
            return (Criteria) this;
        }

        public Criteria andCRecverCityLessThanOrEqualTo(String value) {
            addCriterion("C_RECVER_CITY <=", value, "cRecverCity");
            return (Criteria) this;
        }

        public Criteria andCRecverCityLike(String value) {
            addCriterion("C_RECVER_CITY like", value, "cRecverCity");
            return (Criteria) this;
        }

        public Criteria andCRecverCityNotLike(String value) {
            addCriterion("C_RECVER_CITY not like", value, "cRecverCity");
            return (Criteria) this;
        }

        public Criteria andCRecverCityIn(List<String> values) {
            addCriterion("C_RECVER_CITY in", values, "cRecverCity");
            return (Criteria) this;
        }

        public Criteria andCRecverCityNotIn(List<String> values) {
            addCriterion("C_RECVER_CITY not in", values, "cRecverCity");
            return (Criteria) this;
        }

        public Criteria andCRecverCityBetween(String value1, String value2) {
            addCriterion("C_RECVER_CITY between", value1, value2, "cRecverCity");
            return (Criteria) this;
        }

        public Criteria andCRecverCityNotBetween(String value1, String value2) {
            addCriterion("C_RECVER_CITY not between", value1, value2, "cRecverCity");
            return (Criteria) this;
        }

        public Criteria andCUnloadStationIsNull() {
            addCriterion("C_UNLOAD_STATION is null");
            return (Criteria) this;
        }

        public Criteria andCUnloadStationIsNotNull() {
            addCriterion("C_UNLOAD_STATION is not null");
            return (Criteria) this;
        }

        public Criteria andCUnloadStationEqualTo(String value) {
            addCriterion("C_UNLOAD_STATION =", value, "cUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadStationNotEqualTo(String value) {
            addCriterion("C_UNLOAD_STATION <>", value, "cUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadStationGreaterThan(String value) {
            addCriterion("C_UNLOAD_STATION >", value, "cUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadStationGreaterThanOrEqualTo(String value) {
            addCriterion("C_UNLOAD_STATION >=", value, "cUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadStationLessThan(String value) {
            addCriterion("C_UNLOAD_STATION <", value, "cUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadStationLessThanOrEqualTo(String value) {
            addCriterion("C_UNLOAD_STATION <=", value, "cUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadStationLike(String value) {
            addCriterion("C_UNLOAD_STATION like", value, "cUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadStationNotLike(String value) {
            addCriterion("C_UNLOAD_STATION not like", value, "cUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadStationIn(List<String> values) {
            addCriterion("C_UNLOAD_STATION in", values, "cUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadStationNotIn(List<String> values) {
            addCriterion("C_UNLOAD_STATION not in", values, "cUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadStationBetween(String value1, String value2) {
            addCriterion("C_UNLOAD_STATION between", value1, value2, "cUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadStationNotBetween(String value1, String value2) {
            addCriterion("C_UNLOAD_STATION not between", value1, value2, "cUnloadStation");
            return (Criteria) this;
        }

        public Criteria andCUnloadLocationIsNull() {
            addCriterion("C_UNLOAD_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andCUnloadLocationIsNotNull() {
            addCriterion("C_UNLOAD_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andCUnloadLocationEqualTo(String value) {
            addCriterion("C_UNLOAD_LOCATION =", value, "cUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadLocationNotEqualTo(String value) {
            addCriterion("C_UNLOAD_LOCATION <>", value, "cUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadLocationGreaterThan(String value) {
            addCriterion("C_UNLOAD_LOCATION >", value, "cUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadLocationGreaterThanOrEqualTo(String value) {
            addCriterion("C_UNLOAD_LOCATION >=", value, "cUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadLocationLessThan(String value) {
            addCriterion("C_UNLOAD_LOCATION <", value, "cUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadLocationLessThanOrEqualTo(String value) {
            addCriterion("C_UNLOAD_LOCATION <=", value, "cUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadLocationLike(String value) {
            addCriterion("C_UNLOAD_LOCATION like", value, "cUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadLocationNotLike(String value) {
            addCriterion("C_UNLOAD_LOCATION not like", value, "cUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadLocationIn(List<String> values) {
            addCriterion("C_UNLOAD_LOCATION in", values, "cUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadLocationNotIn(List<String> values) {
            addCriterion("C_UNLOAD_LOCATION not in", values, "cUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadLocationBetween(String value1, String value2) {
            addCriterion("C_UNLOAD_LOCATION between", value1, value2, "cUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCUnloadLocationNotBetween(String value1, String value2) {
            addCriterion("C_UNLOAD_LOCATION not between", value1, value2, "cUnloadLocation");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeIsNull() {
            addCriterion("C_ORDER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeIsNotNull() {
            addCriterion("C_ORDER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeEqualTo(String value) {
            addCriterion("C_ORDER_TYPE =", value, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeNotEqualTo(String value) {
            addCriterion("C_ORDER_TYPE <>", value, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeGreaterThan(String value) {
            addCriterion("C_ORDER_TYPE >", value, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_ORDER_TYPE >=", value, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeLessThan(String value) {
            addCriterion("C_ORDER_TYPE <", value, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("C_ORDER_TYPE <=", value, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeLike(String value) {
            addCriterion("C_ORDER_TYPE like", value, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeNotLike(String value) {
            addCriterion("C_ORDER_TYPE not like", value, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeIn(List<String> values) {
            addCriterion("C_ORDER_TYPE in", values, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeNotIn(List<String> values) {
            addCriterion("C_ORDER_TYPE not in", values, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeBetween(String value1, String value2) {
            addCriterion("C_ORDER_TYPE between", value1, value2, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeNotBetween(String value1, String value2) {
            addCriterion("C_ORDER_TYPE not between", value1, value2, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andIOrderStateIsNull() {
            addCriterion("I_ORDER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andIOrderStateIsNotNull() {
            addCriterion("I_ORDER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andIOrderStateEqualTo(Integer value) {
            addCriterion("I_ORDER_STATE =", value, "iOrderState");
            return (Criteria) this;
        }

        public Criteria andIOrderStateNotEqualTo(Integer value) {
            addCriterion("I_ORDER_STATE <>", value, "iOrderState");
            return (Criteria) this;
        }

        public Criteria andIOrderStateGreaterThan(Integer value) {
            addCriterion("I_ORDER_STATE >", value, "iOrderState");
            return (Criteria) this;
        }

        public Criteria andIOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_ORDER_STATE >=", value, "iOrderState");
            return (Criteria) this;
        }

        public Criteria andIOrderStateLessThan(Integer value) {
            addCriterion("I_ORDER_STATE <", value, "iOrderState");
            return (Criteria) this;
        }

        public Criteria andIOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("I_ORDER_STATE <=", value, "iOrderState");
            return (Criteria) this;
        }

        public Criteria andIOrderStateIn(List<Integer> values) {
            addCriterion("I_ORDER_STATE in", values, "iOrderState");
            return (Criteria) this;
        }

        public Criteria andIOrderStateNotIn(List<Integer> values) {
            addCriterion("I_ORDER_STATE not in", values, "iOrderState");
            return (Criteria) this;
        }

        public Criteria andIOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("I_ORDER_STATE between", value1, value2, "iOrderState");
            return (Criteria) this;
        }

        public Criteria andIOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("I_ORDER_STATE not between", value1, value2, "iOrderState");
            return (Criteria) this;
        }

        public Criteria andIOrderSpliteIsNull() {
            addCriterion("I_ORDER_SPLITE is null");
            return (Criteria) this;
        }

        public Criteria andIOrderSpliteIsNotNull() {
            addCriterion("I_ORDER_SPLITE is not null");
            return (Criteria) this;
        }

        public Criteria andIOrderSpliteEqualTo(Integer value) {
            addCriterion("I_ORDER_SPLITE =", value, "iOrderSplite");
            return (Criteria) this;
        }

        public Criteria andIOrderSpliteNotEqualTo(Integer value) {
            addCriterion("I_ORDER_SPLITE <>", value, "iOrderSplite");
            return (Criteria) this;
        }

        public Criteria andIOrderSpliteGreaterThan(Integer value) {
            addCriterion("I_ORDER_SPLITE >", value, "iOrderSplite");
            return (Criteria) this;
        }

        public Criteria andIOrderSpliteGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_ORDER_SPLITE >=", value, "iOrderSplite");
            return (Criteria) this;
        }

        public Criteria andIOrderSpliteLessThan(Integer value) {
            addCriterion("I_ORDER_SPLITE <", value, "iOrderSplite");
            return (Criteria) this;
        }

        public Criteria andIOrderSpliteLessThanOrEqualTo(Integer value) {
            addCriterion("I_ORDER_SPLITE <=", value, "iOrderSplite");
            return (Criteria) this;
        }

        public Criteria andIOrderSpliteIn(List<Integer> values) {
            addCriterion("I_ORDER_SPLITE in", values, "iOrderSplite");
            return (Criteria) this;
        }

        public Criteria andIOrderSpliteNotIn(List<Integer> values) {
            addCriterion("I_ORDER_SPLITE not in", values, "iOrderSplite");
            return (Criteria) this;
        }

        public Criteria andIOrderSpliteBetween(Integer value1, Integer value2) {
            addCriterion("I_ORDER_SPLITE between", value1, value2, "iOrderSplite");
            return (Criteria) this;
        }

        public Criteria andIOrderSpliteNotBetween(Integer value1, Integer value2) {
            addCriterion("I_ORDER_SPLITE not between", value1, value2, "iOrderSplite");
            return (Criteria) this;
        }

        public Criteria andDOrderCreateTimeIsNull() {
            addCriterion("D_ORDER_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDOrderCreateTimeIsNotNull() {
            addCriterion("D_ORDER_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDOrderCreateTimeEqualTo(Date value) {
            addCriterion("D_ORDER_CREATE_TIME =", value, "dOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andDOrderCreateTimeNotEqualTo(Date value) {
            addCriterion("D_ORDER_CREATE_TIME <>", value, "dOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andDOrderCreateTimeGreaterThan(Date value) {
            addCriterion("D_ORDER_CREATE_TIME >", value, "dOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andDOrderCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_ORDER_CREATE_TIME >=", value, "dOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andDOrderCreateTimeLessThan(Date value) {
            addCriterion("D_ORDER_CREATE_TIME <", value, "dOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andDOrderCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_ORDER_CREATE_TIME <=", value, "dOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andDOrderCreateTimeIn(List<Date> values) {
            addCriterion("D_ORDER_CREATE_TIME in", values, "dOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andDOrderCreateTimeNotIn(List<Date> values) {
            addCriterion("D_ORDER_CREATE_TIME not in", values, "dOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andDOrderCreateTimeBetween(Date value1, Date value2) {
            addCriterion("D_ORDER_CREATE_TIME between", value1, value2, "dOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andDOrderCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_ORDER_CREATE_TIME not between", value1, value2, "dOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andDOrderEndTimeIsNull() {
            addCriterion("D_ORDER_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDOrderEndTimeIsNotNull() {
            addCriterion("D_ORDER_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDOrderEndTimeEqualTo(Date value) {
            addCriterion("D_ORDER_END_TIME =", value, "dOrderEndTime");
            return (Criteria) this;
        }

        public Criteria andDOrderEndTimeNotEqualTo(Date value) {
            addCriterion("D_ORDER_END_TIME <>", value, "dOrderEndTime");
            return (Criteria) this;
        }

        public Criteria andDOrderEndTimeGreaterThan(Date value) {
            addCriterion("D_ORDER_END_TIME >", value, "dOrderEndTime");
            return (Criteria) this;
        }

        public Criteria andDOrderEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_ORDER_END_TIME >=", value, "dOrderEndTime");
            return (Criteria) this;
        }

        public Criteria andDOrderEndTimeLessThan(Date value) {
            addCriterion("D_ORDER_END_TIME <", value, "dOrderEndTime");
            return (Criteria) this;
        }

        public Criteria andDOrderEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_ORDER_END_TIME <=", value, "dOrderEndTime");
            return (Criteria) this;
        }

        public Criteria andDOrderEndTimeIn(List<Date> values) {
            addCriterion("D_ORDER_END_TIME in", values, "dOrderEndTime");
            return (Criteria) this;
        }

        public Criteria andDOrderEndTimeNotIn(List<Date> values) {
            addCriterion("D_ORDER_END_TIME not in", values, "dOrderEndTime");
            return (Criteria) this;
        }

        public Criteria andDOrderEndTimeBetween(Date value1, Date value2) {
            addCriterion("D_ORDER_END_TIME between", value1, value2, "dOrderEndTime");
            return (Criteria) this;
        }

        public Criteria andDOrderEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_ORDER_END_TIME not between", value1, value2, "dOrderEndTime");
            return (Criteria) this;
        }

        public Criteria andIOrderDeleteIsNull() {
            addCriterion("I_ORDER_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andIOrderDeleteIsNotNull() {
            addCriterion("I_ORDER_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andIOrderDeleteEqualTo(Integer value) {
            addCriterion("I_ORDER_DELETE =", value, "iOrderDelete");
            return (Criteria) this;
        }

        public Criteria andIOrderDeleteNotEqualTo(Integer value) {
            addCriterion("I_ORDER_DELETE <>", value, "iOrderDelete");
            return (Criteria) this;
        }

        public Criteria andIOrderDeleteGreaterThan(Integer value) {
            addCriterion("I_ORDER_DELETE >", value, "iOrderDelete");
            return (Criteria) this;
        }

        public Criteria andIOrderDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_ORDER_DELETE >=", value, "iOrderDelete");
            return (Criteria) this;
        }

        public Criteria andIOrderDeleteLessThan(Integer value) {
            addCriterion("I_ORDER_DELETE <", value, "iOrderDelete");
            return (Criteria) this;
        }

        public Criteria andIOrderDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("I_ORDER_DELETE <=", value, "iOrderDelete");
            return (Criteria) this;
        }

        public Criteria andIOrderDeleteIn(List<Integer> values) {
            addCriterion("I_ORDER_DELETE in", values, "iOrderDelete");
            return (Criteria) this;
        }

        public Criteria andIOrderDeleteNotIn(List<Integer> values) {
            addCriterion("I_ORDER_DELETE not in", values, "iOrderDelete");
            return (Criteria) this;
        }

        public Criteria andIOrderDeleteBetween(Integer value1, Integer value2) {
            addCriterion("I_ORDER_DELETE between", value1, value2, "iOrderDelete");
            return (Criteria) this;
        }

        public Criteria andIOrderDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("I_ORDER_DELETE not between", value1, value2, "iOrderDelete");
            return (Criteria) this;
        }

        public Criteria andDOrderDeleteTimeIsNull() {
            addCriterion("D_ORDER_DELETE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDOrderDeleteTimeIsNotNull() {
            addCriterion("D_ORDER_DELETE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDOrderDeleteTimeEqualTo(Date value) {
            addCriterion("D_ORDER_DELETE_TIME =", value, "dOrderDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDOrderDeleteTimeNotEqualTo(Date value) {
            addCriterion("D_ORDER_DELETE_TIME <>", value, "dOrderDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDOrderDeleteTimeGreaterThan(Date value) {
            addCriterion("D_ORDER_DELETE_TIME >", value, "dOrderDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDOrderDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_ORDER_DELETE_TIME >=", value, "dOrderDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDOrderDeleteTimeLessThan(Date value) {
            addCriterion("D_ORDER_DELETE_TIME <", value, "dOrderDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDOrderDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_ORDER_DELETE_TIME <=", value, "dOrderDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDOrderDeleteTimeIn(List<Date> values) {
            addCriterion("D_ORDER_DELETE_TIME in", values, "dOrderDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDOrderDeleteTimeNotIn(List<Date> values) {
            addCriterion("D_ORDER_DELETE_TIME not in", values, "dOrderDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDOrderDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("D_ORDER_DELETE_TIME between", value1, value2, "dOrderDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDOrderDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_ORDER_DELETE_TIME not between", value1, value2, "dOrderDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDOrderAlterTimeIsNull() {
            addCriterion("D_ORDER_ALTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDOrderAlterTimeIsNotNull() {
            addCriterion("D_ORDER_ALTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDOrderAlterTimeEqualTo(Date value) {
            addCriterion("D_ORDER_ALTER_TIME =", value, "dOrderAlterTime");
            return (Criteria) this;
        }

        public Criteria andDOrderAlterTimeNotEqualTo(Date value) {
            addCriterion("D_ORDER_ALTER_TIME <>", value, "dOrderAlterTime");
            return (Criteria) this;
        }

        public Criteria andDOrderAlterTimeGreaterThan(Date value) {
            addCriterion("D_ORDER_ALTER_TIME >", value, "dOrderAlterTime");
            return (Criteria) this;
        }

        public Criteria andDOrderAlterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_ORDER_ALTER_TIME >=", value, "dOrderAlterTime");
            return (Criteria) this;
        }

        public Criteria andDOrderAlterTimeLessThan(Date value) {
            addCriterion("D_ORDER_ALTER_TIME <", value, "dOrderAlterTime");
            return (Criteria) this;
        }

        public Criteria andDOrderAlterTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_ORDER_ALTER_TIME <=", value, "dOrderAlterTime");
            return (Criteria) this;
        }

        public Criteria andDOrderAlterTimeIn(List<Date> values) {
            addCriterion("D_ORDER_ALTER_TIME in", values, "dOrderAlterTime");
            return (Criteria) this;
        }

        public Criteria andDOrderAlterTimeNotIn(List<Date> values) {
            addCriterion("D_ORDER_ALTER_TIME not in", values, "dOrderAlterTime");
            return (Criteria) this;
        }

        public Criteria andDOrderAlterTimeBetween(Date value1, Date value2) {
            addCriterion("D_ORDER_ALTER_TIME between", value1, value2, "dOrderAlterTime");
            return (Criteria) this;
        }

        public Criteria andDOrderAlterTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_ORDER_ALTER_TIME not between", value1, value2, "dOrderAlterTime");
            return (Criteria) this;
        }

        public Criteria andCAccessCodeIsNull() {
            addCriterion("C_ACCESS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCAccessCodeIsNotNull() {
            addCriterion("C_ACCESS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCAccessCodeEqualTo(String value) {
            addCriterion("C_ACCESS_CODE =", value, "cAccessCode");
            return (Criteria) this;
        }

        public Criteria andCAccessCodeNotEqualTo(String value) {
            addCriterion("C_ACCESS_CODE <>", value, "cAccessCode");
            return (Criteria) this;
        }

        public Criteria andCAccessCodeGreaterThan(String value) {
            addCriterion("C_ACCESS_CODE >", value, "cAccessCode");
            return (Criteria) this;
        }

        public Criteria andCAccessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_ACCESS_CODE >=", value, "cAccessCode");
            return (Criteria) this;
        }

        public Criteria andCAccessCodeLessThan(String value) {
            addCriterion("C_ACCESS_CODE <", value, "cAccessCode");
            return (Criteria) this;
        }

        public Criteria andCAccessCodeLessThanOrEqualTo(String value) {
            addCriterion("C_ACCESS_CODE <=", value, "cAccessCode");
            return (Criteria) this;
        }

        public Criteria andCAccessCodeLike(String value) {
            addCriterion("C_ACCESS_CODE like", value, "cAccessCode");
            return (Criteria) this;
        }

        public Criteria andCAccessCodeNotLike(String value) {
            addCriterion("C_ACCESS_CODE not like", value, "cAccessCode");
            return (Criteria) this;
        }

        public Criteria andCAccessCodeIn(List<String> values) {
            addCriterion("C_ACCESS_CODE in", values, "cAccessCode");
            return (Criteria) this;
        }

        public Criteria andCAccessCodeNotIn(List<String> values) {
            addCriterion("C_ACCESS_CODE not in", values, "cAccessCode");
            return (Criteria) this;
        }

        public Criteria andCAccessCodeBetween(String value1, String value2) {
            addCriterion("C_ACCESS_CODE between", value1, value2, "cAccessCode");
            return (Criteria) this;
        }

        public Criteria andCAccessCodeNotBetween(String value1, String value2) {
            addCriterion("C_ACCESS_CODE not between", value1, value2, "cAccessCode");
            return (Criteria) this;
        }

        public Criteria andILogisticsTypeIsNull() {
            addCriterion("I_LOGISTICS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andILogisticsTypeIsNotNull() {
            addCriterion("I_LOGISTICS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andILogisticsTypeEqualTo(Integer value) {
            addCriterion("I_LOGISTICS_TYPE =", value, "iLogisticsType");
            return (Criteria) this;
        }

        public Criteria andILogisticsTypeNotEqualTo(Integer value) {
            addCriterion("I_LOGISTICS_TYPE <>", value, "iLogisticsType");
            return (Criteria) this;
        }

        public Criteria andILogisticsTypeGreaterThan(Integer value) {
            addCriterion("I_LOGISTICS_TYPE >", value, "iLogisticsType");
            return (Criteria) this;
        }

        public Criteria andILogisticsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_LOGISTICS_TYPE >=", value, "iLogisticsType");
            return (Criteria) this;
        }

        public Criteria andILogisticsTypeLessThan(Integer value) {
            addCriterion("I_LOGISTICS_TYPE <", value, "iLogisticsType");
            return (Criteria) this;
        }

        public Criteria andILogisticsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("I_LOGISTICS_TYPE <=", value, "iLogisticsType");
            return (Criteria) this;
        }

        public Criteria andILogisticsTypeIn(List<Integer> values) {
            addCriterion("I_LOGISTICS_TYPE in", values, "iLogisticsType");
            return (Criteria) this;
        }

        public Criteria andILogisticsTypeNotIn(List<Integer> values) {
            addCriterion("I_LOGISTICS_TYPE not in", values, "iLogisticsType");
            return (Criteria) this;
        }

        public Criteria andILogisticsTypeBetween(Integer value1, Integer value2) {
            addCriterion("I_LOGISTICS_TYPE between", value1, value2, "iLogisticsType");
            return (Criteria) this;
        }

        public Criteria andILogisticsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("I_LOGISTICS_TYPE not between", value1, value2, "iLogisticsType");
            return (Criteria) this;
        }

        public Criteria andFProtectPriceIsNull() {
            addCriterion("F_PROTECT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andFProtectPriceIsNotNull() {
            addCriterion("F_PROTECT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andFProtectPriceEqualTo(Float value) {
            addCriterion("F_PROTECT_PRICE =", value, "fProtectPrice");
            return (Criteria) this;
        }

        public Criteria andFProtectPriceNotEqualTo(Float value) {
            addCriterion("F_PROTECT_PRICE <>", value, "fProtectPrice");
            return (Criteria) this;
        }

        public Criteria andFProtectPriceGreaterThan(Float value) {
            addCriterion("F_PROTECT_PRICE >", value, "fProtectPrice");
            return (Criteria) this;
        }

        public Criteria andFProtectPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("F_PROTECT_PRICE >=", value, "fProtectPrice");
            return (Criteria) this;
        }

        public Criteria andFProtectPriceLessThan(Float value) {
            addCriterion("F_PROTECT_PRICE <", value, "fProtectPrice");
            return (Criteria) this;
        }

        public Criteria andFProtectPriceLessThanOrEqualTo(Float value) {
            addCriterion("F_PROTECT_PRICE <=", value, "fProtectPrice");
            return (Criteria) this;
        }

        public Criteria andFProtectPriceIn(List<Float> values) {
            addCriterion("F_PROTECT_PRICE in", values, "fProtectPrice");
            return (Criteria) this;
        }

        public Criteria andFProtectPriceNotIn(List<Float> values) {
            addCriterion("F_PROTECT_PRICE not in", values, "fProtectPrice");
            return (Criteria) this;
        }

        public Criteria andFProtectPriceBetween(Float value1, Float value2) {
            addCriterion("F_PROTECT_PRICE between", value1, value2, "fProtectPrice");
            return (Criteria) this;
        }

        public Criteria andFProtectPriceNotBetween(Float value1, Float value2) {
            addCriterion("F_PROTECT_PRICE not between", value1, value2, "fProtectPrice");
            return (Criteria) this;
        }

        public Criteria andFInsuranceValueIsNull() {
            addCriterion("F_INSURANCE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andFInsuranceValueIsNotNull() {
            addCriterion("F_INSURANCE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andFInsuranceValueEqualTo(Float value) {
            addCriterion("F_INSURANCE_VALUE =", value, "fInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFInsuranceValueNotEqualTo(Float value) {
            addCriterion("F_INSURANCE_VALUE <>", value, "fInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFInsuranceValueGreaterThan(Float value) {
            addCriterion("F_INSURANCE_VALUE >", value, "fInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFInsuranceValueGreaterThanOrEqualTo(Float value) {
            addCriterion("F_INSURANCE_VALUE >=", value, "fInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFInsuranceValueLessThan(Float value) {
            addCriterion("F_INSURANCE_VALUE <", value, "fInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFInsuranceValueLessThanOrEqualTo(Float value) {
            addCriterion("F_INSURANCE_VALUE <=", value, "fInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFInsuranceValueIn(List<Float> values) {
            addCriterion("F_INSURANCE_VALUE in", values, "fInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFInsuranceValueNotIn(List<Float> values) {
            addCriterion("F_INSURANCE_VALUE not in", values, "fInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFInsuranceValueBetween(Float value1, Float value2) {
            addCriterion("F_INSURANCE_VALUE between", value1, value2, "fInsuranceValue");
            return (Criteria) this;
        }

        public Criteria andFInsuranceValueNotBetween(Float value1, Float value2) {
            addCriterion("F_INSURANCE_VALUE not between", value1, value2, "fInsuranceValue");
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