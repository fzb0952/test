package com.fan.image.bean;

import java.util.ArrayList;
import java.util.List;

public class TTipsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTipsExample() {
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

        public Criteria andCBhIsNull() {
            addCriterion("C_BH is null");
            return (Criteria) this;
        }

        public Criteria andCBhIsNotNull() {
            addCriterion("C_BH is not null");
            return (Criteria) this;
        }

        public Criteria andCBhEqualTo(String value) {
            addCriterion("C_BH =", value, "cBh");
            return (Criteria) this;
        }

        public Criteria andCBhNotEqualTo(String value) {
            addCriterion("C_BH <>", value, "cBh");
            return (Criteria) this;
        }

        public Criteria andCBhGreaterThan(String value) {
            addCriterion("C_BH >", value, "cBh");
            return (Criteria) this;
        }

        public Criteria andCBhGreaterThanOrEqualTo(String value) {
            addCriterion("C_BH >=", value, "cBh");
            return (Criteria) this;
        }

        public Criteria andCBhLessThan(String value) {
            addCriterion("C_BH <", value, "cBh");
            return (Criteria) this;
        }

        public Criteria andCBhLessThanOrEqualTo(String value) {
            addCriterion("C_BH <=", value, "cBh");
            return (Criteria) this;
        }

        public Criteria andCBhLike(String value) {
            addCriterion("C_BH like", value, "cBh");
            return (Criteria) this;
        }

        public Criteria andCBhNotLike(String value) {
            addCriterion("C_BH not like", value, "cBh");
            return (Criteria) this;
        }

        public Criteria andCBhIn(List<String> values) {
            addCriterion("C_BH in", values, "cBh");
            return (Criteria) this;
        }

        public Criteria andCBhNotIn(List<String> values) {
            addCriterion("C_BH not in", values, "cBh");
            return (Criteria) this;
        }

        public Criteria andCBhBetween(String value1, String value2) {
            addCriterion("C_BH between", value1, value2, "cBh");
            return (Criteria) this;
        }

        public Criteria andCBhNotBetween(String value1, String value2) {
            addCriterion("C_BH not between", value1, value2, "cBh");
            return (Criteria) this;
        }

        public Criteria andCTipIsNull() {
            addCriterion("C_TIP is null");
            return (Criteria) this;
        }

        public Criteria andCTipIsNotNull() {
            addCriterion("C_TIP is not null");
            return (Criteria) this;
        }

        public Criteria andCTipEqualTo(String value) {
            addCriterion("C_TIP =", value, "cTip");
            return (Criteria) this;
        }

        public Criteria andCTipNotEqualTo(String value) {
            addCriterion("C_TIP <>", value, "cTip");
            return (Criteria) this;
        }

        public Criteria andCTipGreaterThan(String value) {
            addCriterion("C_TIP >", value, "cTip");
            return (Criteria) this;
        }

        public Criteria andCTipGreaterThanOrEqualTo(String value) {
            addCriterion("C_TIP >=", value, "cTip");
            return (Criteria) this;
        }

        public Criteria andCTipLessThan(String value) {
            addCriterion("C_TIP <", value, "cTip");
            return (Criteria) this;
        }

        public Criteria andCTipLessThanOrEqualTo(String value) {
            addCriterion("C_TIP <=", value, "cTip");
            return (Criteria) this;
        }

        public Criteria andCTipLike(String value) {
            addCriterion("C_TIP like", value, "cTip");
            return (Criteria) this;
        }

        public Criteria andCTipNotLike(String value) {
            addCriterion("C_TIP not like", value, "cTip");
            return (Criteria) this;
        }

        public Criteria andCTipIn(List<String> values) {
            addCriterion("C_TIP in", values, "cTip");
            return (Criteria) this;
        }

        public Criteria andCTipNotIn(List<String> values) {
            addCriterion("C_TIP not in", values, "cTip");
            return (Criteria) this;
        }

        public Criteria andCTipBetween(String value1, String value2) {
            addCriterion("C_TIP between", value1, value2, "cTip");
            return (Criteria) this;
        }

        public Criteria andCTipNotBetween(String value1, String value2) {
            addCriterion("C_TIP not between", value1, value2, "cTip");
            return (Criteria) this;
        }

        public Criteria andCTypeIsNull() {
            addCriterion("C_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCTypeIsNotNull() {
            addCriterion("C_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCTypeEqualTo(String value) {
            addCriterion("C_TYPE =", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotEqualTo(String value) {
            addCriterion("C_TYPE <>", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThan(String value) {
            addCriterion("C_TYPE >", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_TYPE >=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThan(String value) {
            addCriterion("C_TYPE <", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThanOrEqualTo(String value) {
            addCriterion("C_TYPE <=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLike(String value) {
            addCriterion("C_TYPE like", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotLike(String value) {
            addCriterion("C_TYPE not like", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeIn(List<String> values) {
            addCriterion("C_TYPE in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotIn(List<String> values) {
            addCriterion("C_TYPE not in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeBetween(String value1, String value2) {
            addCriterion("C_TYPE between", value1, value2, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotBetween(String value1, String value2) {
            addCriterion("C_TYPE not between", value1, value2, "cType");
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