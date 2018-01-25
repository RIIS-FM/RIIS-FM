package com.crscd.riis.freightmarket.trade.entity;

import java.util.ArrayList;
import java.util.List;

public class FmTradeFeeEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmTradeFeeEntityExample() {
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

        public Criteria andIFeeTypeIsNull() {
            addCriterion("I_FEE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIFeeTypeIsNotNull() {
            addCriterion("I_FEE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIFeeTypeEqualTo(Integer value) {
            addCriterion("I_FEE_TYPE =", value, "iFeeType");
            return (Criteria) this;
        }

        public Criteria andIFeeTypeNotEqualTo(Integer value) {
            addCriterion("I_FEE_TYPE <>", value, "iFeeType");
            return (Criteria) this;
        }

        public Criteria andIFeeTypeGreaterThan(Integer value) {
            addCriterion("I_FEE_TYPE >", value, "iFeeType");
            return (Criteria) this;
        }

        public Criteria andIFeeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_FEE_TYPE >=", value, "iFeeType");
            return (Criteria) this;
        }

        public Criteria andIFeeTypeLessThan(Integer value) {
            addCriterion("I_FEE_TYPE <", value, "iFeeType");
            return (Criteria) this;
        }

        public Criteria andIFeeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("I_FEE_TYPE <=", value, "iFeeType");
            return (Criteria) this;
        }

        public Criteria andIFeeTypeIn(List<Integer> values) {
            addCriterion("I_FEE_TYPE in", values, "iFeeType");
            return (Criteria) this;
        }

        public Criteria andIFeeTypeNotIn(List<Integer> values) {
            addCriterion("I_FEE_TYPE not in", values, "iFeeType");
            return (Criteria) this;
        }

        public Criteria andIFeeTypeBetween(Integer value1, Integer value2) {
            addCriterion("I_FEE_TYPE between", value1, value2, "iFeeType");
            return (Criteria) this;
        }

        public Criteria andIFeeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("I_FEE_TYPE not between", value1, value2, "iFeeType");
            return (Criteria) this;
        }

        public Criteria andITransportTypeIsNull() {
            addCriterion("I_TRANSPORT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andITransportTypeIsNotNull() {
            addCriterion("I_TRANSPORT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andITransportTypeEqualTo(Integer value) {
            addCriterion("I_TRANSPORT_TYPE =", value, "iTransportType");
            return (Criteria) this;
        }

        public Criteria andITransportTypeNotEqualTo(Integer value) {
            addCriterion("I_TRANSPORT_TYPE <>", value, "iTransportType");
            return (Criteria) this;
        }

        public Criteria andITransportTypeGreaterThan(Integer value) {
            addCriterion("I_TRANSPORT_TYPE >", value, "iTransportType");
            return (Criteria) this;
        }

        public Criteria andITransportTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("I_TRANSPORT_TYPE >=", value, "iTransportType");
            return (Criteria) this;
        }

        public Criteria andITransportTypeLessThan(Integer value) {
            addCriterion("I_TRANSPORT_TYPE <", value, "iTransportType");
            return (Criteria) this;
        }

        public Criteria andITransportTypeLessThanOrEqualTo(Integer value) {
            addCriterion("I_TRANSPORT_TYPE <=", value, "iTransportType");
            return (Criteria) this;
        }

        public Criteria andITransportTypeIn(List<Integer> values) {
            addCriterion("I_TRANSPORT_TYPE in", values, "iTransportType");
            return (Criteria) this;
        }

        public Criteria andITransportTypeNotIn(List<Integer> values) {
            addCriterion("I_TRANSPORT_TYPE not in", values, "iTransportType");
            return (Criteria) this;
        }

        public Criteria andITransportTypeBetween(Integer value1, Integer value2) {
            addCriterion("I_TRANSPORT_TYPE between", value1, value2, "iTransportType");
            return (Criteria) this;
        }

        public Criteria andITransportTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("I_TRANSPORT_TYPE not between", value1, value2, "iTransportType");
            return (Criteria) this;
        }

        public Criteria andCPriceNoIsNull() {
            addCriterion("C_PRICE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCPriceNoIsNotNull() {
            addCriterion("C_PRICE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCPriceNoEqualTo(String value) {
            addCriterion("C_PRICE_NO =", value, "cPriceNo");
            return (Criteria) this;
        }

        public Criteria andCPriceNoNotEqualTo(String value) {
            addCriterion("C_PRICE_NO <>", value, "cPriceNo");
            return (Criteria) this;
        }

        public Criteria andCPriceNoGreaterThan(String value) {
            addCriterion("C_PRICE_NO >", value, "cPriceNo");
            return (Criteria) this;
        }

        public Criteria andCPriceNoGreaterThanOrEqualTo(String value) {
            addCriterion("C_PRICE_NO >=", value, "cPriceNo");
            return (Criteria) this;
        }

        public Criteria andCPriceNoLessThan(String value) {
            addCriterion("C_PRICE_NO <", value, "cPriceNo");
            return (Criteria) this;
        }

        public Criteria andCPriceNoLessThanOrEqualTo(String value) {
            addCriterion("C_PRICE_NO <=", value, "cPriceNo");
            return (Criteria) this;
        }

        public Criteria andCPriceNoLike(String value) {
            addCriterion("C_PRICE_NO like", value, "cPriceNo");
            return (Criteria) this;
        }

        public Criteria andCPriceNoNotLike(String value) {
            addCriterion("C_PRICE_NO not like", value, "cPriceNo");
            return (Criteria) this;
        }

        public Criteria andCPriceNoIn(List<String> values) {
            addCriterion("C_PRICE_NO in", values, "cPriceNo");
            return (Criteria) this;
        }

        public Criteria andCPriceNoNotIn(List<String> values) {
            addCriterion("C_PRICE_NO not in", values, "cPriceNo");
            return (Criteria) this;
        }

        public Criteria andCPriceNoBetween(String value1, String value2) {
            addCriterion("C_PRICE_NO between", value1, value2, "cPriceNo");
            return (Criteria) this;
        }

        public Criteria andCPriceNoNotBetween(String value1, String value2) {
            addCriterion("C_PRICE_NO not between", value1, value2, "cPriceNo");
            return (Criteria) this;
        }

        public Criteria andFBasePriceOneIsNull() {
            addCriterion("F_BASE_PRICE_ONE is null");
            return (Criteria) this;
        }

        public Criteria andFBasePriceOneIsNotNull() {
            addCriterion("F_BASE_PRICE_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andFBasePriceOneEqualTo(Float value) {
            addCriterion("F_BASE_PRICE_ONE =", value, "fBasePriceOne");
            return (Criteria) this;
        }

        public Criteria andFBasePriceOneNotEqualTo(Float value) {
            addCriterion("F_BASE_PRICE_ONE <>", value, "fBasePriceOne");
            return (Criteria) this;
        }

        public Criteria andFBasePriceOneGreaterThan(Float value) {
            addCriterion("F_BASE_PRICE_ONE >", value, "fBasePriceOne");
            return (Criteria) this;
        }

        public Criteria andFBasePriceOneGreaterThanOrEqualTo(Float value) {
            addCriterion("F_BASE_PRICE_ONE >=", value, "fBasePriceOne");
            return (Criteria) this;
        }

        public Criteria andFBasePriceOneLessThan(Float value) {
            addCriterion("F_BASE_PRICE_ONE <", value, "fBasePriceOne");
            return (Criteria) this;
        }

        public Criteria andFBasePriceOneLessThanOrEqualTo(Float value) {
            addCriterion("F_BASE_PRICE_ONE <=", value, "fBasePriceOne");
            return (Criteria) this;
        }

        public Criteria andFBasePriceOneIn(List<Float> values) {
            addCriterion("F_BASE_PRICE_ONE in", values, "fBasePriceOne");
            return (Criteria) this;
        }

        public Criteria andFBasePriceOneNotIn(List<Float> values) {
            addCriterion("F_BASE_PRICE_ONE not in", values, "fBasePriceOne");
            return (Criteria) this;
        }

        public Criteria andFBasePriceOneBetween(Float value1, Float value2) {
            addCriterion("F_BASE_PRICE_ONE between", value1, value2, "fBasePriceOne");
            return (Criteria) this;
        }

        public Criteria andFBasePriceOneNotBetween(Float value1, Float value2) {
            addCriterion("F_BASE_PRICE_ONE not between", value1, value2, "fBasePriceOne");
            return (Criteria) this;
        }

        public Criteria andFBasePriceTwoIsNull() {
            addCriterion("F_BASE_PRICE_TWO is null");
            return (Criteria) this;
        }

        public Criteria andFBasePriceTwoIsNotNull() {
            addCriterion("F_BASE_PRICE_TWO is not null");
            return (Criteria) this;
        }

        public Criteria andFBasePriceTwoEqualTo(Float value) {
            addCriterion("F_BASE_PRICE_TWO =", value, "fBasePriceTwo");
            return (Criteria) this;
        }

        public Criteria andFBasePriceTwoNotEqualTo(Float value) {
            addCriterion("F_BASE_PRICE_TWO <>", value, "fBasePriceTwo");
            return (Criteria) this;
        }

        public Criteria andFBasePriceTwoGreaterThan(Float value) {
            addCriterion("F_BASE_PRICE_TWO >", value, "fBasePriceTwo");
            return (Criteria) this;
        }

        public Criteria andFBasePriceTwoGreaterThanOrEqualTo(Float value) {
            addCriterion("F_BASE_PRICE_TWO >=", value, "fBasePriceTwo");
            return (Criteria) this;
        }

        public Criteria andFBasePriceTwoLessThan(Float value) {
            addCriterion("F_BASE_PRICE_TWO <", value, "fBasePriceTwo");
            return (Criteria) this;
        }

        public Criteria andFBasePriceTwoLessThanOrEqualTo(Float value) {
            addCriterion("F_BASE_PRICE_TWO <=", value, "fBasePriceTwo");
            return (Criteria) this;
        }

        public Criteria andFBasePriceTwoIn(List<Float> values) {
            addCriterion("F_BASE_PRICE_TWO in", values, "fBasePriceTwo");
            return (Criteria) this;
        }

        public Criteria andFBasePriceTwoNotIn(List<Float> values) {
            addCriterion("F_BASE_PRICE_TWO not in", values, "fBasePriceTwo");
            return (Criteria) this;
        }

        public Criteria andFBasePriceTwoBetween(Float value1, Float value2) {
            addCriterion("F_BASE_PRICE_TWO between", value1, value2, "fBasePriceTwo");
            return (Criteria) this;
        }

        public Criteria andFBasePriceTwoNotBetween(Float value1, Float value2) {
            addCriterion("F_BASE_PRICE_TWO not between", value1, value2, "fBasePriceTwo");
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