package com.fan.image.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TActtipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TActtipExample() {
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

        public Criteria andCGoodsIsNull() {
            addCriterion("C_GOODS is null");
            return (Criteria) this;
        }

        public Criteria andCGoodsIsNotNull() {
            addCriterion("C_GOODS is not null");
            return (Criteria) this;
        }

        public Criteria andCGoodsEqualTo(String value) {
            addCriterion("C_GOODS =", value, "cGoods");
            return (Criteria) this;
        }

        public Criteria andCGoodsNotEqualTo(String value) {
            addCriterion("C_GOODS <>", value, "cGoods");
            return (Criteria) this;
        }

        public Criteria andCGoodsGreaterThan(String value) {
            addCriterion("C_GOODS >", value, "cGoods");
            return (Criteria) this;
        }

        public Criteria andCGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("C_GOODS >=", value, "cGoods");
            return (Criteria) this;
        }

        public Criteria andCGoodsLessThan(String value) {
            addCriterion("C_GOODS <", value, "cGoods");
            return (Criteria) this;
        }

        public Criteria andCGoodsLessThanOrEqualTo(String value) {
            addCriterion("C_GOODS <=", value, "cGoods");
            return (Criteria) this;
        }

        public Criteria andCGoodsLike(String value) {
            addCriterion("C_GOODS like", value, "cGoods");
            return (Criteria) this;
        }

        public Criteria andCGoodsNotLike(String value) {
            addCriterion("C_GOODS not like", value, "cGoods");
            return (Criteria) this;
        }

        public Criteria andCGoodsIn(List<String> values) {
            addCriterion("C_GOODS in", values, "cGoods");
            return (Criteria) this;
        }

        public Criteria andCGoodsNotIn(List<String> values) {
            addCriterion("C_GOODS not in", values, "cGoods");
            return (Criteria) this;
        }

        public Criteria andCGoodsBetween(String value1, String value2) {
            addCriterion("C_GOODS between", value1, value2, "cGoods");
            return (Criteria) this;
        }

        public Criteria andCGoodsNotBetween(String value1, String value2) {
            addCriterion("C_GOODS not between", value1, value2, "cGoods");
            return (Criteria) this;
        }

        public Criteria andDStartdateIsNull() {
            addCriterion("D_STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andDStartdateIsNotNull() {
            addCriterion("D_STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("D_STARTDATE =", value, "dStartdate");
            return (Criteria) this;
        }

        public Criteria andDStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("D_STARTDATE <>", value, "dStartdate");
            return (Criteria) this;
        }

        public Criteria andDStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("D_STARTDATE >", value, "dStartdate");
            return (Criteria) this;
        }

        public Criteria andDStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("D_STARTDATE >=", value, "dStartdate");
            return (Criteria) this;
        }

        public Criteria andDStartdateLessThan(Date value) {
            addCriterionForJDBCDate("D_STARTDATE <", value, "dStartdate");
            return (Criteria) this;
        }

        public Criteria andDStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("D_STARTDATE <=", value, "dStartdate");
            return (Criteria) this;
        }

        public Criteria andDStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("D_STARTDATE in", values, "dStartdate");
            return (Criteria) this;
        }

        public Criteria andDStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("D_STARTDATE not in", values, "dStartdate");
            return (Criteria) this;
        }

        public Criteria andDStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("D_STARTDATE between", value1, value2, "dStartdate");
            return (Criteria) this;
        }

        public Criteria andDStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("D_STARTDATE not between", value1, value2, "dStartdate");
            return (Criteria) this;
        }

        public Criteria andDEnddateIsNull() {
            addCriterion("D_ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andDEnddateIsNotNull() {
            addCriterion("D_ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("D_ENDDATE =", value, "dEnddate");
            return (Criteria) this;
        }

        public Criteria andDEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("D_ENDDATE <>", value, "dEnddate");
            return (Criteria) this;
        }

        public Criteria andDEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("D_ENDDATE >", value, "dEnddate");
            return (Criteria) this;
        }

        public Criteria andDEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("D_ENDDATE >=", value, "dEnddate");
            return (Criteria) this;
        }

        public Criteria andDEnddateLessThan(Date value) {
            addCriterionForJDBCDate("D_ENDDATE <", value, "dEnddate");
            return (Criteria) this;
        }

        public Criteria andDEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("D_ENDDATE <=", value, "dEnddate");
            return (Criteria) this;
        }

        public Criteria andDEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("D_ENDDATE in", values, "dEnddate");
            return (Criteria) this;
        }

        public Criteria andDEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("D_ENDDATE not in", values, "dEnddate");
            return (Criteria) this;
        }

        public Criteria andDEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("D_ENDDATE between", value1, value2, "dEnddate");
            return (Criteria) this;
        }

        public Criteria andDEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("D_ENDDATE not between", value1, value2, "dEnddate");
            return (Criteria) this;
        }

        public Criteria andCDiscountIsNull() {
            addCriterion("C_DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCDiscountIsNotNull() {
            addCriterion("C_DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCDiscountEqualTo(String value) {
            addCriterion("C_DISCOUNT =", value, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountNotEqualTo(String value) {
            addCriterion("C_DISCOUNT <>", value, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountGreaterThan(String value) {
            addCriterion("C_DISCOUNT >", value, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("C_DISCOUNT >=", value, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountLessThan(String value) {
            addCriterion("C_DISCOUNT <", value, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountLessThanOrEqualTo(String value) {
            addCriterion("C_DISCOUNT <=", value, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountLike(String value) {
            addCriterion("C_DISCOUNT like", value, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountNotLike(String value) {
            addCriterion("C_DISCOUNT not like", value, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountIn(List<String> values) {
            addCriterion("C_DISCOUNT in", values, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountNotIn(List<String> values) {
            addCriterion("C_DISCOUNT not in", values, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountBetween(String value1, String value2) {
            addCriterion("C_DISCOUNT between", value1, value2, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountNotBetween(String value1, String value2) {
            addCriterion("C_DISCOUNT not between", value1, value2, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDetailsIsNull() {
            addCriterion("C_DETAILS is null");
            return (Criteria) this;
        }

        public Criteria andCDetailsIsNotNull() {
            addCriterion("C_DETAILS is not null");
            return (Criteria) this;
        }

        public Criteria andCDetailsEqualTo(String value) {
            addCriterion("C_DETAILS =", value, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsNotEqualTo(String value) {
            addCriterion("C_DETAILS <>", value, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsGreaterThan(String value) {
            addCriterion("C_DETAILS >", value, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("C_DETAILS >=", value, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsLessThan(String value) {
            addCriterion("C_DETAILS <", value, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsLessThanOrEqualTo(String value) {
            addCriterion("C_DETAILS <=", value, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsLike(String value) {
            addCriterion("C_DETAILS like", value, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsNotLike(String value) {
            addCriterion("C_DETAILS not like", value, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsIn(List<String> values) {
            addCriterion("C_DETAILS in", values, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsNotIn(List<String> values) {
            addCriterion("C_DETAILS not in", values, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsBetween(String value1, String value2) {
            addCriterion("C_DETAILS between", value1, value2, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsNotBetween(String value1, String value2) {
            addCriterion("C_DETAILS not between", value1, value2, "cDetails");
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