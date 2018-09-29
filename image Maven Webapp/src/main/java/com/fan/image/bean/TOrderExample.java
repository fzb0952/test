package com.fan.image.bean;

import java.util.ArrayList;
import java.util.List;

public class TOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOrderExample() {
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

        public Criteria andNNumIsNull() {
            addCriterion("N_NUM is null");
            return (Criteria) this;
        }

        public Criteria andNNumIsNotNull() {
            addCriterion("N_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNNumEqualTo(Integer value) {
            addCriterion("N_NUM =", value, "nNum");
            return (Criteria) this;
        }

        public Criteria andNNumNotEqualTo(Integer value) {
            addCriterion("N_NUM <>", value, "nNum");
            return (Criteria) this;
        }

        public Criteria andNNumGreaterThan(Integer value) {
            addCriterion("N_NUM >", value, "nNum");
            return (Criteria) this;
        }

        public Criteria andNNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("N_NUM >=", value, "nNum");
            return (Criteria) this;
        }

        public Criteria andNNumLessThan(Integer value) {
            addCriterion("N_NUM <", value, "nNum");
            return (Criteria) this;
        }

        public Criteria andNNumLessThanOrEqualTo(Integer value) {
            addCriterion("N_NUM <=", value, "nNum");
            return (Criteria) this;
        }

        public Criteria andNNumIn(List<Integer> values) {
            addCriterion("N_NUM in", values, "nNum");
            return (Criteria) this;
        }

        public Criteria andNNumNotIn(List<Integer> values) {
            addCriterion("N_NUM not in", values, "nNum");
            return (Criteria) this;
        }

        public Criteria andNNumBetween(Integer value1, Integer value2) {
            addCriterion("N_NUM between", value1, value2, "nNum");
            return (Criteria) this;
        }

        public Criteria andNNumNotBetween(Integer value1, Integer value2) {
            addCriterion("N_NUM not between", value1, value2, "nNum");
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

        public Criteria andCPayIsNull() {
            addCriterion("C_PAY is null");
            return (Criteria) this;
        }

        public Criteria andCPayIsNotNull() {
            addCriterion("C_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andCPayEqualTo(String value) {
            addCriterion("C_PAY =", value, "cPay");
            return (Criteria) this;
        }

        public Criteria andCPayNotEqualTo(String value) {
            addCriterion("C_PAY <>", value, "cPay");
            return (Criteria) this;
        }

        public Criteria andCPayGreaterThan(String value) {
            addCriterion("C_PAY >", value, "cPay");
            return (Criteria) this;
        }

        public Criteria andCPayGreaterThanOrEqualTo(String value) {
            addCriterion("C_PAY >=", value, "cPay");
            return (Criteria) this;
        }

        public Criteria andCPayLessThan(String value) {
            addCriterion("C_PAY <", value, "cPay");
            return (Criteria) this;
        }

        public Criteria andCPayLessThanOrEqualTo(String value) {
            addCriterion("C_PAY <=", value, "cPay");
            return (Criteria) this;
        }

        public Criteria andCPayLike(String value) {
            addCriterion("C_PAY like", value, "cPay");
            return (Criteria) this;
        }

        public Criteria andCPayNotLike(String value) {
            addCriterion("C_PAY not like", value, "cPay");
            return (Criteria) this;
        }

        public Criteria andCPayIn(List<String> values) {
            addCriterion("C_PAY in", values, "cPay");
            return (Criteria) this;
        }

        public Criteria andCPayNotIn(List<String> values) {
            addCriterion("C_PAY not in", values, "cPay");
            return (Criteria) this;
        }

        public Criteria andCPayBetween(String value1, String value2) {
            addCriterion("C_PAY between", value1, value2, "cPay");
            return (Criteria) this;
        }

        public Criteria andCPayNotBetween(String value1, String value2) {
            addCriterion("C_PAY not between", value1, value2, "cPay");
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