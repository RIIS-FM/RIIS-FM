package com.crscd.riis.freightmarket.authority.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FmTradeTicketEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmTradeTicketEntityExample() {
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

        public Criteria andIWaybillIdIsNull() {
            addCriterion("I_WAYBILL_ID is null");
            return (Criteria) this;
        }

        public Criteria andIWaybillIdIsNotNull() {
            addCriterion("I_WAYBILL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIWaybillIdEqualTo(Integer value) {
            addCriterion("I_WAYBILL_ID =", value, "iWaybillId");
            return (Criteria) this;
        }

        public Criteria andIWaybillIdNotEqualTo(Integer value) {
            addCriterion("I_WAYBILL_ID <>", value, "iWaybillId");
            return (Criteria) this;
        }

        public Criteria andIWaybillIdGreaterThan(Integer value) {
            addCriterion("I_WAYBILL_ID >", value, "iWaybillId");
            return (Criteria) this;
        }

        public Criteria andIWaybillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_ID >=", value, "iWaybillId");
            return (Criteria) this;
        }

        public Criteria andIWaybillIdLessThan(Integer value) {
            addCriterion("I_WAYBILL_ID <", value, "iWaybillId");
            return (Criteria) this;
        }

        public Criteria andIWaybillIdLessThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_ID <=", value, "iWaybillId");
            return (Criteria) this;
        }

        public Criteria andIWaybillIdIn(List<Integer> values) {
            addCriterion("I_WAYBILL_ID in", values, "iWaybillId");
            return (Criteria) this;
        }

        public Criteria andIWaybillIdNotIn(List<Integer> values) {
            addCriterion("I_WAYBILL_ID not in", values, "iWaybillId");
            return (Criteria) this;
        }

        public Criteria andIWaybillIdBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_ID between", value1, value2, "iWaybillId");
            return (Criteria) this;
        }

        public Criteria andIWaybillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_ID not between", value1, value2, "iWaybillId");
            return (Criteria) this;
        }

        public Criteria andIWaybillCodeIsNull() {
            addCriterion("I_WAYBILL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIWaybillCodeIsNotNull() {
            addCriterion("I_WAYBILL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIWaybillCodeEqualTo(Integer value) {
            addCriterion("I_WAYBILL_CODE =", value, "iWaybillCode");
            return (Criteria) this;
        }

        public Criteria andIWaybillCodeNotEqualTo(Integer value) {
            addCriterion("I_WAYBILL_CODE <>", value, "iWaybillCode");
            return (Criteria) this;
        }

        public Criteria andIWaybillCodeGreaterThan(Integer value) {
            addCriterion("I_WAYBILL_CODE >", value, "iWaybillCode");
            return (Criteria) this;
        }

        public Criteria andIWaybillCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_CODE >=", value, "iWaybillCode");
            return (Criteria) this;
        }

        public Criteria andIWaybillCodeLessThan(Integer value) {
            addCriterion("I_WAYBILL_CODE <", value, "iWaybillCode");
            return (Criteria) this;
        }

        public Criteria andIWaybillCodeLessThanOrEqualTo(Integer value) {
            addCriterion("I_WAYBILL_CODE <=", value, "iWaybillCode");
            return (Criteria) this;
        }

        public Criteria andIWaybillCodeIn(List<Integer> values) {
            addCriterion("I_WAYBILL_CODE in", values, "iWaybillCode");
            return (Criteria) this;
        }

        public Criteria andIWaybillCodeNotIn(List<Integer> values) {
            addCriterion("I_WAYBILL_CODE not in", values, "iWaybillCode");
            return (Criteria) this;
        }

        public Criteria andIWaybillCodeBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_CODE between", value1, value2, "iWaybillCode");
            return (Criteria) this;
        }

        public Criteria andIWaybillCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("I_WAYBILL_CODE not between", value1, value2, "iWaybillCode");
            return (Criteria) this;
        }

        public Criteria andITicketCodeIsNull() {
            addCriterion("I_TICKET_CODE is null");
            return (Criteria) this;
        }

        public Criteria andITicketCodeIsNotNull() {
            addCriterion("I_TICKET_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andITicketCodeEqualTo(Integer value) {
            addCriterion("I_TICKET_CODE =", value, "iTicketCode");
            return (Criteria) this;
        }

        public Criteria andITicketCodeNotEqualTo(Integer value) {
            addCriterion("I_TICKET_CODE <>", value, "iTicketCode");
            return (Criteria) this;
        }

        public Criteria andITicketCodeGreaterThan(Integer value) {
            addCriterion("I_TICKET_CODE >", value, "iTicketCode");
            return (Criteria) this;
        }

        public Criteria andITicketCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_TICKET_CODE >=", value, "iTicketCode");
            return (Criteria) this;
        }

        public Criteria andITicketCodeLessThan(Integer value) {
            addCriterion("I_TICKET_CODE <", value, "iTicketCode");
            return (Criteria) this;
        }

        public Criteria andITicketCodeLessThanOrEqualTo(Integer value) {
            addCriterion("I_TICKET_CODE <=", value, "iTicketCode");
            return (Criteria) this;
        }

        public Criteria andITicketCodeIn(List<Integer> values) {
            addCriterion("I_TICKET_CODE in", values, "iTicketCode");
            return (Criteria) this;
        }

        public Criteria andITicketCodeNotIn(List<Integer> values) {
            addCriterion("I_TICKET_CODE not in", values, "iTicketCode");
            return (Criteria) this;
        }

        public Criteria andITicketCodeBetween(Integer value1, Integer value2) {
            addCriterion("I_TICKET_CODE between", value1, value2, "iTicketCode");
            return (Criteria) this;
        }

        public Criteria andITicketCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("I_TICKET_CODE not between", value1, value2, "iTicketCode");
            return (Criteria) this;
        }

        public Criteria andDTicketCreateTimeIsNull() {
            addCriterion("D_TICKET_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTicketCreateTimeIsNotNull() {
            addCriterion("D_TICKET_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTicketCreateTimeEqualTo(Date value) {
            addCriterion("D_TICKET_CREATE_TIME =", value, "dTicketCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTicketCreateTimeNotEqualTo(Date value) {
            addCriterion("D_TICKET_CREATE_TIME <>", value, "dTicketCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTicketCreateTimeGreaterThan(Date value) {
            addCriterion("D_TICKET_CREATE_TIME >", value, "dTicketCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTicketCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_CREATE_TIME >=", value, "dTicketCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTicketCreateTimeLessThan(Date value) {
            addCriterion("D_TICKET_CREATE_TIME <", value, "dTicketCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTicketCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_CREATE_TIME <=", value, "dTicketCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTicketCreateTimeIn(List<Date> values) {
            addCriterion("D_TICKET_CREATE_TIME in", values, "dTicketCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTicketCreateTimeNotIn(List<Date> values) {
            addCriterion("D_TICKET_CREATE_TIME not in", values, "dTicketCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTicketCreateTimeBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_CREATE_TIME between", value1, value2, "dTicketCreateTime");
            return (Criteria) this;
        }

        public Criteria andDTicketCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_CREATE_TIME not between", value1, value2, "dTicketCreateTime");
            return (Criteria) this;
        }

        public Criteria andCTicketContentIsNull() {
            addCriterion("C_TICKET_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCTicketContentIsNotNull() {
            addCriterion("C_TICKET_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCTicketContentEqualTo(String value) {
            addCriterion("C_TICKET_CONTENT =", value, "cTicketContent");
            return (Criteria) this;
        }

        public Criteria andCTicketContentNotEqualTo(String value) {
            addCriterion("C_TICKET_CONTENT <>", value, "cTicketContent");
            return (Criteria) this;
        }

        public Criteria andCTicketContentGreaterThan(String value) {
            addCriterion("C_TICKET_CONTENT >", value, "cTicketContent");
            return (Criteria) this;
        }

        public Criteria andCTicketContentGreaterThanOrEqualTo(String value) {
            addCriterion("C_TICKET_CONTENT >=", value, "cTicketContent");
            return (Criteria) this;
        }

        public Criteria andCTicketContentLessThan(String value) {
            addCriterion("C_TICKET_CONTENT <", value, "cTicketContent");
            return (Criteria) this;
        }

        public Criteria andCTicketContentLessThanOrEqualTo(String value) {
            addCriterion("C_TICKET_CONTENT <=", value, "cTicketContent");
            return (Criteria) this;
        }

        public Criteria andCTicketContentLike(String value) {
            addCriterion("C_TICKET_CONTENT like", value, "cTicketContent");
            return (Criteria) this;
        }

        public Criteria andCTicketContentNotLike(String value) {
            addCriterion("C_TICKET_CONTENT not like", value, "cTicketContent");
            return (Criteria) this;
        }

        public Criteria andCTicketContentIn(List<String> values) {
            addCriterion("C_TICKET_CONTENT in", values, "cTicketContent");
            return (Criteria) this;
        }

        public Criteria andCTicketContentNotIn(List<String> values) {
            addCriterion("C_TICKET_CONTENT not in", values, "cTicketContent");
            return (Criteria) this;
        }

        public Criteria andCTicketContentBetween(String value1, String value2) {
            addCriterion("C_TICKET_CONTENT between", value1, value2, "cTicketContent");
            return (Criteria) this;
        }

        public Criteria andCTicketContentNotBetween(String value1, String value2) {
            addCriterion("C_TICKET_CONTENT not between", value1, value2, "cTicketContent");
            return (Criteria) this;
        }

        public Criteria andDTicketRecverTimeIsNull() {
            addCriterion("D_TICKET_RECVER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTicketRecverTimeIsNotNull() {
            addCriterion("D_TICKET_RECVER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTicketRecverTimeEqualTo(Date value) {
            addCriterion("D_TICKET_RECVER_TIME =", value, "dTicketRecverTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRecverTimeNotEqualTo(Date value) {
            addCriterion("D_TICKET_RECVER_TIME <>", value, "dTicketRecverTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRecverTimeGreaterThan(Date value) {
            addCriterion("D_TICKET_RECVER_TIME >", value, "dTicketRecverTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRecverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_RECVER_TIME >=", value, "dTicketRecverTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRecverTimeLessThan(Date value) {
            addCriterion("D_TICKET_RECVER_TIME <", value, "dTicketRecverTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRecverTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_RECVER_TIME <=", value, "dTicketRecverTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRecverTimeIn(List<Date> values) {
            addCriterion("D_TICKET_RECVER_TIME in", values, "dTicketRecverTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRecverTimeNotIn(List<Date> values) {
            addCriterion("D_TICKET_RECVER_TIME not in", values, "dTicketRecverTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRecverTimeBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_RECVER_TIME between", value1, value2, "dTicketRecverTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRecverTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_RECVER_TIME not between", value1, value2, "dTicketRecverTime");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsTypeIsNull() {
            addCriterion("I_INCIDENTALS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsTypeIsNotNull() {
            addCriterion("I_INCIDENTALS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsTypeEqualTo(Integer value) {
            addCriterion("I_INCIDENTALS_TYPE =", value, "iIncidentalsType");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsTypeNotEqualTo(Integer value) {
            addCriterion("I_INCIDENTALS_TYPE <>", value, "iIncidentalsType");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsTypeGreaterThan(Integer value) {
            addCriterion("I_INCIDENTALS_TYPE >", value, "iIncidentalsType");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_INCIDENTALS_TYPE >=", value, "iIncidentalsType");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsTypeLessThan(Integer value) {
            addCriterion("I_INCIDENTALS_TYPE <", value, "iIncidentalsType");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("I_INCIDENTALS_TYPE <=", value, "iIncidentalsType");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsTypeIn(List<Integer> values) {
            addCriterion("I_INCIDENTALS_TYPE in", values, "iIncidentalsType");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsTypeNotIn(List<Integer> values) {
            addCriterion("I_INCIDENTALS_TYPE not in", values, "iIncidentalsType");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsTypeBetween(Integer value1, Integer value2) {
            addCriterion("I_INCIDENTALS_TYPE between", value1, value2, "iIncidentalsType");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("I_INCIDENTALS_TYPE not between", value1, value2, "iIncidentalsType");
            return (Criteria) this;
        }

        public Criteria andFIncidentalsValueIsNull() {
            addCriterion("F_INCIDENTALS_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andFIncidentalsValueIsNotNull() {
            addCriterion("F_INCIDENTALS_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andFIncidentalsValueEqualTo(Float value) {
            addCriterion("F_INCIDENTALS_VALUE =", value, "fIncidentalsValue");
            return (Criteria) this;
        }

        public Criteria andFIncidentalsValueNotEqualTo(Float value) {
            addCriterion("F_INCIDENTALS_VALUE <>", value, "fIncidentalsValue");
            return (Criteria) this;
        }

        public Criteria andFIncidentalsValueGreaterThan(Float value) {
            addCriterion("F_INCIDENTALS_VALUE >", value, "fIncidentalsValue");
            return (Criteria) this;
        }

        public Criteria andFIncidentalsValueGreaterThanOrEqualTo(Float value) {
            addCriterion("F_INCIDENTALS_VALUE >=", value, "fIncidentalsValue");
            return (Criteria) this;
        }

        public Criteria andFIncidentalsValueLessThan(Float value) {
            addCriterion("F_INCIDENTALS_VALUE <", value, "fIncidentalsValue");
            return (Criteria) this;
        }

        public Criteria andFIncidentalsValueLessThanOrEqualTo(Float value) {
            addCriterion("F_INCIDENTALS_VALUE <=", value, "fIncidentalsValue");
            return (Criteria) this;
        }

        public Criteria andFIncidentalsValueIn(List<Float> values) {
            addCriterion("F_INCIDENTALS_VALUE in", values, "fIncidentalsValue");
            return (Criteria) this;
        }

        public Criteria andFIncidentalsValueNotIn(List<Float> values) {
            addCriterion("F_INCIDENTALS_VALUE not in", values, "fIncidentalsValue");
            return (Criteria) this;
        }

        public Criteria andFIncidentalsValueBetween(Float value1, Float value2) {
            addCriterion("F_INCIDENTALS_VALUE between", value1, value2, "fIncidentalsValue");
            return (Criteria) this;
        }

        public Criteria andFIncidentalsValueNotBetween(Float value1, Float value2) {
            addCriterion("F_INCIDENTALS_VALUE not between", value1, value2, "fIncidentalsValue");
            return (Criteria) this;
        }

        public Criteria andFDistanceIsNull() {
            addCriterion("F_DISTANCE is null");
            return (Criteria) this;
        }

        public Criteria andFDistanceIsNotNull() {
            addCriterion("F_DISTANCE is not null");
            return (Criteria) this;
        }

        public Criteria andFDistanceEqualTo(Float value) {
            addCriterion("F_DISTANCE =", value, "fDistance");
            return (Criteria) this;
        }

        public Criteria andFDistanceNotEqualTo(Float value) {
            addCriterion("F_DISTANCE <>", value, "fDistance");
            return (Criteria) this;
        }

        public Criteria andFDistanceGreaterThan(Float value) {
            addCriterion("F_DISTANCE >", value, "fDistance");
            return (Criteria) this;
        }

        public Criteria andFDistanceGreaterThanOrEqualTo(Float value) {
            addCriterion("F_DISTANCE >=", value, "fDistance");
            return (Criteria) this;
        }

        public Criteria andFDistanceLessThan(Float value) {
            addCriterion("F_DISTANCE <", value, "fDistance");
            return (Criteria) this;
        }

        public Criteria andFDistanceLessThanOrEqualTo(Float value) {
            addCriterion("F_DISTANCE <=", value, "fDistance");
            return (Criteria) this;
        }

        public Criteria andFDistanceIn(List<Float> values) {
            addCriterion("F_DISTANCE in", values, "fDistance");
            return (Criteria) this;
        }

        public Criteria andFDistanceNotIn(List<Float> values) {
            addCriterion("F_DISTANCE not in", values, "fDistance");
            return (Criteria) this;
        }

        public Criteria andFDistanceBetween(Float value1, Float value2) {
            addCriterion("F_DISTANCE between", value1, value2, "fDistance");
            return (Criteria) this;
        }

        public Criteria andFDistanceNotBetween(Float value1, Float value2) {
            addCriterion("F_DISTANCE not between", value1, value2, "fDistance");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentStateIsNull() {
            addCriterion("I_INCIDENTALS_AYMENT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentStateIsNotNull() {
            addCriterion("I_INCIDENTALS_AYMENT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentStateEqualTo(Integer value) {
            addCriterion("I_INCIDENTALS_AYMENT_STATE =", value, "iIncidentalsAymentState");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentStateNotEqualTo(Integer value) {
            addCriterion("I_INCIDENTALS_AYMENT_STATE <>", value, "iIncidentalsAymentState");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentStateGreaterThan(Integer value) {
            addCriterion("I_INCIDENTALS_AYMENT_STATE >", value, "iIncidentalsAymentState");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_INCIDENTALS_AYMENT_STATE >=", value, "iIncidentalsAymentState");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentStateLessThan(Integer value) {
            addCriterion("I_INCIDENTALS_AYMENT_STATE <", value, "iIncidentalsAymentState");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentStateLessThanOrEqualTo(Integer value) {
            addCriterion("I_INCIDENTALS_AYMENT_STATE <=", value, "iIncidentalsAymentState");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentStateIn(List<Integer> values) {
            addCriterion("I_INCIDENTALS_AYMENT_STATE in", values, "iIncidentalsAymentState");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentStateNotIn(List<Integer> values) {
            addCriterion("I_INCIDENTALS_AYMENT_STATE not in", values, "iIncidentalsAymentState");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentStateBetween(Integer value1, Integer value2) {
            addCriterion("I_INCIDENTALS_AYMENT_STATE between", value1, value2, "iIncidentalsAymentState");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentStateNotBetween(Integer value1, Integer value2) {
            addCriterion("I_INCIDENTALS_AYMENT_STATE not between", value1, value2, "iIncidentalsAymentState");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentTypeIsNull() {
            addCriterion("I_INCIDENTALS_AYMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentTypeIsNotNull() {
            addCriterion("I_INCIDENTALS_AYMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentTypeEqualTo(Integer value) {
            addCriterion("I_INCIDENTALS_AYMENT_TYPE =", value, "iIncidentalsAymentType");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentTypeNotEqualTo(Integer value) {
            addCriterion("I_INCIDENTALS_AYMENT_TYPE <>", value, "iIncidentalsAymentType");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentTypeGreaterThan(Integer value) {
            addCriterion("I_INCIDENTALS_AYMENT_TYPE >", value, "iIncidentalsAymentType");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_INCIDENTALS_AYMENT_TYPE >=", value, "iIncidentalsAymentType");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentTypeLessThan(Integer value) {
            addCriterion("I_INCIDENTALS_AYMENT_TYPE <", value, "iIncidentalsAymentType");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("I_INCIDENTALS_AYMENT_TYPE <=", value, "iIncidentalsAymentType");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentTypeIn(List<Integer> values) {
            addCriterion("I_INCIDENTALS_AYMENT_TYPE in", values, "iIncidentalsAymentType");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentTypeNotIn(List<Integer> values) {
            addCriterion("I_INCIDENTALS_AYMENT_TYPE not in", values, "iIncidentalsAymentType");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentTypeBetween(Integer value1, Integer value2) {
            addCriterion("I_INCIDENTALS_AYMENT_TYPE between", value1, value2, "iIncidentalsAymentType");
            return (Criteria) this;
        }

        public Criteria andIIncidentalsAymentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("I_INCIDENTALS_AYMENT_TYPE not between", value1, value2, "iIncidentalsAymentType");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityArriveTimeIsNull() {
            addCriterion("D_TICKET_REALITY_ARRIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityArriveTimeIsNotNull() {
            addCriterion("D_TICKET_REALITY_ARRIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityArriveTimeEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_ARRIVE_TIME =", value, "dTicketRealityArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityArriveTimeNotEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_ARRIVE_TIME <>", value, "dTicketRealityArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityArriveTimeGreaterThan(Date value) {
            addCriterion("D_TICKET_REALITY_ARRIVE_TIME >", value, "dTicketRealityArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityArriveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_ARRIVE_TIME >=", value, "dTicketRealityArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityArriveTimeLessThan(Date value) {
            addCriterion("D_TICKET_REALITY_ARRIVE_TIME <", value, "dTicketRealityArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityArriveTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_ARRIVE_TIME <=", value, "dTicketRealityArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityArriveTimeIn(List<Date> values) {
            addCriterion("D_TICKET_REALITY_ARRIVE_TIME in", values, "dTicketRealityArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityArriveTimeNotIn(List<Date> values) {
            addCriterion("D_TICKET_REALITY_ARRIVE_TIME not in", values, "dTicketRealityArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityArriveTimeBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_REALITY_ARRIVE_TIME between", value1, value2, "dTicketRealityArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityArriveTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_REALITY_ARRIVE_TIME not between", value1, value2, "dTicketRealityArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadStartTimeIsNull() {
            addCriterion("D_TICKET_REALITY_UNLOAD_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadStartTimeIsNotNull() {
            addCriterion("D_TICKET_REALITY_UNLOAD_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadStartTimeEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_UNLOAD_START_TIME =", value, "dTicketRealityUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadStartTimeNotEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_UNLOAD_START_TIME <>", value, "dTicketRealityUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadStartTimeGreaterThan(Date value) {
            addCriterion("D_TICKET_REALITY_UNLOAD_START_TIME >", value, "dTicketRealityUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_UNLOAD_START_TIME >=", value, "dTicketRealityUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadStartTimeLessThan(Date value) {
            addCriterion("D_TICKET_REALITY_UNLOAD_START_TIME <", value, "dTicketRealityUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_UNLOAD_START_TIME <=", value, "dTicketRealityUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadStartTimeIn(List<Date> values) {
            addCriterion("D_TICKET_REALITY_UNLOAD_START_TIME in", values, "dTicketRealityUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadStartTimeNotIn(List<Date> values) {
            addCriterion("D_TICKET_REALITY_UNLOAD_START_TIME not in", values, "dTicketRealityUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadStartTimeBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_REALITY_UNLOAD_START_TIME between", value1, value2, "dTicketRealityUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_REALITY_UNLOAD_START_TIME not between", value1, value2, "dTicketRealityUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadEndTimeIsNull() {
            addCriterion("D_TICKET_REALITY_UNLOAD_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadEndTimeIsNotNull() {
            addCriterion("D_TICKET_REALITY_UNLOAD_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadEndTimeEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_UNLOAD_END_TIME =", value, "dTicketRealityUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadEndTimeNotEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_UNLOAD_END_TIME <>", value, "dTicketRealityUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadEndTimeGreaterThan(Date value) {
            addCriterion("D_TICKET_REALITY_UNLOAD_END_TIME >", value, "dTicketRealityUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_UNLOAD_END_TIME >=", value, "dTicketRealityUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadEndTimeLessThan(Date value) {
            addCriterion("D_TICKET_REALITY_UNLOAD_END_TIME <", value, "dTicketRealityUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_UNLOAD_END_TIME <=", value, "dTicketRealityUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadEndTimeIn(List<Date> values) {
            addCriterion("D_TICKET_REALITY_UNLOAD_END_TIME in", values, "dTicketRealityUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadEndTimeNotIn(List<Date> values) {
            addCriterion("D_TICKET_REALITY_UNLOAD_END_TIME not in", values, "dTicketRealityUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadEndTimeBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_REALITY_UNLOAD_END_TIME between", value1, value2, "dTicketRealityUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityUnloadEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_REALITY_UNLOAD_END_TIME not between", value1, value2, "dTicketRealityUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealitySenderTimeIsNull() {
            addCriterion("D_TICKET_REALITY_SENDER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTicketRealitySenderTimeIsNotNull() {
            addCriterion("D_TICKET_REALITY_SENDER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTicketRealitySenderTimeEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_SENDER_TIME =", value, "dTicketRealitySenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealitySenderTimeNotEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_SENDER_TIME <>", value, "dTicketRealitySenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealitySenderTimeGreaterThan(Date value) {
            addCriterion("D_TICKET_REALITY_SENDER_TIME >", value, "dTicketRealitySenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealitySenderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_SENDER_TIME >=", value, "dTicketRealitySenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealitySenderTimeLessThan(Date value) {
            addCriterion("D_TICKET_REALITY_SENDER_TIME <", value, "dTicketRealitySenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealitySenderTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_SENDER_TIME <=", value, "dTicketRealitySenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealitySenderTimeIn(List<Date> values) {
            addCriterion("D_TICKET_REALITY_SENDER_TIME in", values, "dTicketRealitySenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealitySenderTimeNotIn(List<Date> values) {
            addCriterion("D_TICKET_REALITY_SENDER_TIME not in", values, "dTicketRealitySenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealitySenderTimeBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_REALITY_SENDER_TIME between", value1, value2, "dTicketRealitySenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealitySenderTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_REALITY_SENDER_TIME not between", value1, value2, "dTicketRealitySenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadStartTimeIsNull() {
            addCriterion("D_TICKET_REALITY_LOAD_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadStartTimeIsNotNull() {
            addCriterion("D_TICKET_REALITY_LOAD_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadStartTimeEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_LOAD_START_TIME =", value, "dTicketRealityLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadStartTimeNotEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_LOAD_START_TIME <>", value, "dTicketRealityLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadStartTimeGreaterThan(Date value) {
            addCriterion("D_TICKET_REALITY_LOAD_START_TIME >", value, "dTicketRealityLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_LOAD_START_TIME >=", value, "dTicketRealityLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadStartTimeLessThan(Date value) {
            addCriterion("D_TICKET_REALITY_LOAD_START_TIME <", value, "dTicketRealityLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_LOAD_START_TIME <=", value, "dTicketRealityLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadStartTimeIn(List<Date> values) {
            addCriterion("D_TICKET_REALITY_LOAD_START_TIME in", values, "dTicketRealityLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadStartTimeNotIn(List<Date> values) {
            addCriterion("D_TICKET_REALITY_LOAD_START_TIME not in", values, "dTicketRealityLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadStartTimeBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_REALITY_LOAD_START_TIME between", value1, value2, "dTicketRealityLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_REALITY_LOAD_START_TIME not between", value1, value2, "dTicketRealityLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadEndTimeIsNull() {
            addCriterion("D_TICKET_REALITY_LOAD_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadEndTimeIsNotNull() {
            addCriterion("D_TICKET_REALITY_LOAD_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadEndTimeEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_LOAD_END_TIME =", value, "dTicketRealityLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadEndTimeNotEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_LOAD_END_TIME <>", value, "dTicketRealityLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadEndTimeGreaterThan(Date value) {
            addCriterion("D_TICKET_REALITY_LOAD_END_TIME >", value, "dTicketRealityLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_LOAD_END_TIME >=", value, "dTicketRealityLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadEndTimeLessThan(Date value) {
            addCriterion("D_TICKET_REALITY_LOAD_END_TIME <", value, "dTicketRealityLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_REALITY_LOAD_END_TIME <=", value, "dTicketRealityLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadEndTimeIn(List<Date> values) {
            addCriterion("D_TICKET_REALITY_LOAD_END_TIME in", values, "dTicketRealityLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadEndTimeNotIn(List<Date> values) {
            addCriterion("D_TICKET_REALITY_LOAD_END_TIME not in", values, "dTicketRealityLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadEndTimeBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_REALITY_LOAD_END_TIME between", value1, value2, "dTicketRealityLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketRealityLoadEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_REALITY_LOAD_END_TIME not between", value1, value2, "dTicketRealityLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictArriveTimeIsNull() {
            addCriterion("D_TICKET_PREDICT_ARRIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictArriveTimeIsNotNull() {
            addCriterion("D_TICKET_PREDICT_ARRIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictArriveTimeEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_ARRIVE_TIME =", value, "dTicketPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictArriveTimeNotEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_ARRIVE_TIME <>", value, "dTicketPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictArriveTimeGreaterThan(Date value) {
            addCriterion("D_TICKET_PREDICT_ARRIVE_TIME >", value, "dTicketPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictArriveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_ARRIVE_TIME >=", value, "dTicketPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictArriveTimeLessThan(Date value) {
            addCriterion("D_TICKET_PREDICT_ARRIVE_TIME <", value, "dTicketPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictArriveTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_ARRIVE_TIME <=", value, "dTicketPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictArriveTimeIn(List<Date> values) {
            addCriterion("D_TICKET_PREDICT_ARRIVE_TIME in", values, "dTicketPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictArriveTimeNotIn(List<Date> values) {
            addCriterion("D_TICKET_PREDICT_ARRIVE_TIME not in", values, "dTicketPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictArriveTimeBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_PREDICT_ARRIVE_TIME between", value1, value2, "dTicketPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictArriveTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_PREDICT_ARRIVE_TIME not between", value1, value2, "dTicketPredictArriveTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadStartTimeIsNull() {
            addCriterion("D_TICKET_PREDICT_UNLOAD_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadStartTimeIsNotNull() {
            addCriterion("D_TICKET_PREDICT_UNLOAD_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadStartTimeEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_START_TIME =", value, "dTicketPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadStartTimeNotEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_START_TIME <>", value, "dTicketPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadStartTimeGreaterThan(Date value) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_START_TIME >", value, "dTicketPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_START_TIME >=", value, "dTicketPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadStartTimeLessThan(Date value) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_START_TIME <", value, "dTicketPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_START_TIME <=", value, "dTicketPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadStartTimeIn(List<Date> values) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_START_TIME in", values, "dTicketPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadStartTimeNotIn(List<Date> values) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_START_TIME not in", values, "dTicketPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadStartTimeBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_START_TIME between", value1, value2, "dTicketPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_START_TIME not between", value1, value2, "dTicketPredictUnloadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadEndTimeIsNull() {
            addCriterion("D_TICKET_PREDICT_UNLOAD_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadEndTimeIsNotNull() {
            addCriterion("D_TICKET_PREDICT_UNLOAD_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadEndTimeEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_END_TIME =", value, "dTicketPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadEndTimeNotEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_END_TIME <>", value, "dTicketPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadEndTimeGreaterThan(Date value) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_END_TIME >", value, "dTicketPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_END_TIME >=", value, "dTicketPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadEndTimeLessThan(Date value) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_END_TIME <", value, "dTicketPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_END_TIME <=", value, "dTicketPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadEndTimeIn(List<Date> values) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_END_TIME in", values, "dTicketPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadEndTimeNotIn(List<Date> values) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_END_TIME not in", values, "dTicketPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadEndTimeBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_END_TIME between", value1, value2, "dTicketPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictUnloadEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_PREDICT_UNLOAD_END_TIME not between", value1, value2, "dTicketPredictUnloadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictSenderTimeIsNull() {
            addCriterion("D_TICKET_PREDICT_SENDER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictSenderTimeIsNotNull() {
            addCriterion("D_TICKET_PREDICT_SENDER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictSenderTimeEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_SENDER_TIME =", value, "dTicketPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictSenderTimeNotEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_SENDER_TIME <>", value, "dTicketPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictSenderTimeGreaterThan(Date value) {
            addCriterion("D_TICKET_PREDICT_SENDER_TIME >", value, "dTicketPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictSenderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_SENDER_TIME >=", value, "dTicketPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictSenderTimeLessThan(Date value) {
            addCriterion("D_TICKET_PREDICT_SENDER_TIME <", value, "dTicketPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictSenderTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_SENDER_TIME <=", value, "dTicketPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictSenderTimeIn(List<Date> values) {
            addCriterion("D_TICKET_PREDICT_SENDER_TIME in", values, "dTicketPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictSenderTimeNotIn(List<Date> values) {
            addCriterion("D_TICKET_PREDICT_SENDER_TIME not in", values, "dTicketPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictSenderTimeBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_PREDICT_SENDER_TIME between", value1, value2, "dTicketPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictSenderTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_PREDICT_SENDER_TIME not between", value1, value2, "dTicketPredictSenderTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadStartTimeIsNull() {
            addCriterion("D_TICKET_PREDICT_LOAD_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadStartTimeIsNotNull() {
            addCriterion("D_TICKET_PREDICT_LOAD_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadStartTimeEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_LOAD_START_TIME =", value, "dTicketPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadStartTimeNotEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_LOAD_START_TIME <>", value, "dTicketPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadStartTimeGreaterThan(Date value) {
            addCriterion("D_TICKET_PREDICT_LOAD_START_TIME >", value, "dTicketPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_LOAD_START_TIME >=", value, "dTicketPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadStartTimeLessThan(Date value) {
            addCriterion("D_TICKET_PREDICT_LOAD_START_TIME <", value, "dTicketPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_LOAD_START_TIME <=", value, "dTicketPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadStartTimeIn(List<Date> values) {
            addCriterion("D_TICKET_PREDICT_LOAD_START_TIME in", values, "dTicketPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadStartTimeNotIn(List<Date> values) {
            addCriterion("D_TICKET_PREDICT_LOAD_START_TIME not in", values, "dTicketPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadStartTimeBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_PREDICT_LOAD_START_TIME between", value1, value2, "dTicketPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_PREDICT_LOAD_START_TIME not between", value1, value2, "dTicketPredictLoadStartTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadEndTimeIsNull() {
            addCriterion("D_TICKET_PREDICT_LOAD_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadEndTimeIsNotNull() {
            addCriterion("D_TICKET_PREDICT_LOAD_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadEndTimeEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_LOAD_END_TIME =", value, "dTicketPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadEndTimeNotEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_LOAD_END_TIME <>", value, "dTicketPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadEndTimeGreaterThan(Date value) {
            addCriterion("D_TICKET_PREDICT_LOAD_END_TIME >", value, "dTicketPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_LOAD_END_TIME >=", value, "dTicketPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadEndTimeLessThan(Date value) {
            addCriterion("D_TICKET_PREDICT_LOAD_END_TIME <", value, "dTicketPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_TICKET_PREDICT_LOAD_END_TIME <=", value, "dTicketPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadEndTimeIn(List<Date> values) {
            addCriterion("D_TICKET_PREDICT_LOAD_END_TIME in", values, "dTicketPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadEndTimeNotIn(List<Date> values) {
            addCriterion("D_TICKET_PREDICT_LOAD_END_TIME not in", values, "dTicketPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadEndTimeBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_PREDICT_LOAD_END_TIME between", value1, value2, "dTicketPredictLoadEndTime");
            return (Criteria) this;
        }

        public Criteria andDTicketPredictLoadEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_TICKET_PREDICT_LOAD_END_TIME not between", value1, value2, "dTicketPredictLoadEndTime");
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