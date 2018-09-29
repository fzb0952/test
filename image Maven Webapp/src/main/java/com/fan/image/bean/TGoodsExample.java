package com.fan.image.bean;

import java.util.ArrayList;
import java.util.List;

public class TGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TGoodsExample() {
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

        public Criteria andCPriceIsNull() {
            addCriterion("C_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCPriceIsNotNull() {
            addCriterion("C_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCPriceEqualTo(String value) {
            addCriterion("C_PRICE =", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotEqualTo(String value) {
            addCriterion("C_PRICE <>", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceGreaterThan(String value) {
            addCriterion("C_PRICE >", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceGreaterThanOrEqualTo(String value) {
            addCriterion("C_PRICE >=", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceLessThan(String value) {
            addCriterion("C_PRICE <", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceLessThanOrEqualTo(String value) {
            addCriterion("C_PRICE <=", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceLike(String value) {
            addCriterion("C_PRICE like", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotLike(String value) {
            addCriterion("C_PRICE not like", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceIn(List<String> values) {
            addCriterion("C_PRICE in", values, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotIn(List<String> values) {
            addCriterion("C_PRICE not in", values, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceBetween(String value1, String value2) {
            addCriterion("C_PRICE between", value1, value2, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotBetween(String value1, String value2) {
            addCriterion("C_PRICE not between", value1, value2, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCImageIsNull() {
            addCriterion("C_IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andCImageIsNotNull() {
            addCriterion("C_IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCImageEqualTo(String value) {
            addCriterion("C_IMAGE =", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageNotEqualTo(String value) {
            addCriterion("C_IMAGE <>", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageGreaterThan(String value) {
            addCriterion("C_IMAGE >", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageGreaterThanOrEqualTo(String value) {
            addCriterion("C_IMAGE >=", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageLessThan(String value) {
            addCriterion("C_IMAGE <", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageLessThanOrEqualTo(String value) {
            addCriterion("C_IMAGE <=", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageLike(String value) {
            addCriterion("C_IMAGE like", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageNotLike(String value) {
            addCriterion("C_IMAGE not like", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageIn(List<String> values) {
            addCriterion("C_IMAGE in", values, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageNotIn(List<String> values) {
            addCriterion("C_IMAGE not in", values, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageBetween(String value1, String value2) {
            addCriterion("C_IMAGE between", value1, value2, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageNotBetween(String value1, String value2) {
            addCriterion("C_IMAGE not between", value1, value2, "cImage");
            return (Criteria) this;
        }

        public Criteria andCDescribeIsNull() {
            addCriterion("C_DESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andCDescribeIsNotNull() {
            addCriterion("C_DESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andCDescribeEqualTo(String value) {
            addCriterion("C_DESCRIBE =", value, "cDescribe");
            return (Criteria) this;
        }

        public Criteria andCDescribeNotEqualTo(String value) {
            addCriterion("C_DESCRIBE <>", value, "cDescribe");
            return (Criteria) this;
        }

        public Criteria andCDescribeGreaterThan(String value) {
            addCriterion("C_DESCRIBE >", value, "cDescribe");
            return (Criteria) this;
        }

        public Criteria andCDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("C_DESCRIBE >=", value, "cDescribe");
            return (Criteria) this;
        }

        public Criteria andCDescribeLessThan(String value) {
            addCriterion("C_DESCRIBE <", value, "cDescribe");
            return (Criteria) this;
        }

        public Criteria andCDescribeLessThanOrEqualTo(String value) {
            addCriterion("C_DESCRIBE <=", value, "cDescribe");
            return (Criteria) this;
        }

        public Criteria andCDescribeLike(String value) {
            addCriterion("C_DESCRIBE like", value, "cDescribe");
            return (Criteria) this;
        }

        public Criteria andCDescribeNotLike(String value) {
            addCriterion("C_DESCRIBE not like", value, "cDescribe");
            return (Criteria) this;
        }

        public Criteria andCDescribeIn(List<String> values) {
            addCriterion("C_DESCRIBE in", values, "cDescribe");
            return (Criteria) this;
        }

        public Criteria andCDescribeNotIn(List<String> values) {
            addCriterion("C_DESCRIBE not in", values, "cDescribe");
            return (Criteria) this;
        }

        public Criteria andCDescribeBetween(String value1, String value2) {
            addCriterion("C_DESCRIBE between", value1, value2, "cDescribe");
            return (Criteria) this;
        }

        public Criteria andCDescribeNotBetween(String value1, String value2) {
            addCriterion("C_DESCRIBE not between", value1, value2, "cDescribe");
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