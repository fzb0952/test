package com.fan.image.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMessageExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCMessageIsNull() {
            addCriterion("C_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andCMessageIsNotNull() {
            addCriterion("C_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCMessageEqualTo(String value) {
            addCriterion("C_MESSAGE =", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageNotEqualTo(String value) {
            addCriterion("C_MESSAGE <>", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageGreaterThan(String value) {
            addCriterion("C_MESSAGE >", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageGreaterThanOrEqualTo(String value) {
            addCriterion("C_MESSAGE >=", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageLessThan(String value) {
            addCriterion("C_MESSAGE <", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageLessThanOrEqualTo(String value) {
            addCriterion("C_MESSAGE <=", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageLike(String value) {
            addCriterion("C_MESSAGE like", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageNotLike(String value) {
            addCriterion("C_MESSAGE not like", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageIn(List<String> values) {
            addCriterion("C_MESSAGE in", values, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageNotIn(List<String> values) {
            addCriterion("C_MESSAGE not in", values, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageBetween(String value1, String value2) {
            addCriterion("C_MESSAGE between", value1, value2, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageNotBetween(String value1, String value2) {
            addCriterion("C_MESSAGE not between", value1, value2, "cMessage");
            return (Criteria) this;
        }

        public Criteria andDAdddateIsNull() {
            addCriterion("D_ADDDATE is null");
            return (Criteria) this;
        }

        public Criteria andDAdddateIsNotNull() {
            addCriterion("D_ADDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDAdddateEqualTo(Date value) {
            addCriterionForJDBCDate("D_ADDDATE =", value, "dAdddate");
            return (Criteria) this;
        }

        public Criteria andDAdddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("D_ADDDATE <>", value, "dAdddate");
            return (Criteria) this;
        }

        public Criteria andDAdddateGreaterThan(Date value) {
            addCriterionForJDBCDate("D_ADDDATE >", value, "dAdddate");
            return (Criteria) this;
        }

        public Criteria andDAdddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("D_ADDDATE >=", value, "dAdddate");
            return (Criteria) this;
        }

        public Criteria andDAdddateLessThan(Date value) {
            addCriterionForJDBCDate("D_ADDDATE <", value, "dAdddate");
            return (Criteria) this;
        }

        public Criteria andDAdddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("D_ADDDATE <=", value, "dAdddate");
            return (Criteria) this;
        }

        public Criteria andDAdddateIn(List<Date> values) {
            addCriterionForJDBCDate("D_ADDDATE in", values, "dAdddate");
            return (Criteria) this;
        }

        public Criteria andDAdddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("D_ADDDATE not in", values, "dAdddate");
            return (Criteria) this;
        }

        public Criteria andDAdddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("D_ADDDATE between", value1, value2, "dAdddate");
            return (Criteria) this;
        }

        public Criteria andDAdddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("D_ADDDATE not between", value1, value2, "dAdddate");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("C_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("C_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("C_NAME =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("C_NAME <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("C_NAME >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_NAME >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("C_NAME <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("C_NAME <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("C_NAME like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("C_NAME not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("C_NAME in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("C_NAME not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("C_NAME between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("C_NAME not between", value1, value2, "cName");
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