package com.fan.image.bean;

import java.util.ArrayList;
import java.util.List;

public class TRoleRightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRoleRightExample() {
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

        public Criteria andCRoleIsNull() {
            addCriterion("C_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andCRoleIsNotNull() {
            addCriterion("C_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andCRoleEqualTo(String value) {
            addCriterion("C_ROLE =", value, "cRole");
            return (Criteria) this;
        }

        public Criteria andCRoleNotEqualTo(String value) {
            addCriterion("C_ROLE <>", value, "cRole");
            return (Criteria) this;
        }

        public Criteria andCRoleGreaterThan(String value) {
            addCriterion("C_ROLE >", value, "cRole");
            return (Criteria) this;
        }

        public Criteria andCRoleGreaterThanOrEqualTo(String value) {
            addCriterion("C_ROLE >=", value, "cRole");
            return (Criteria) this;
        }

        public Criteria andCRoleLessThan(String value) {
            addCriterion("C_ROLE <", value, "cRole");
            return (Criteria) this;
        }

        public Criteria andCRoleLessThanOrEqualTo(String value) {
            addCriterion("C_ROLE <=", value, "cRole");
            return (Criteria) this;
        }

        public Criteria andCRoleLike(String value) {
            addCriterion("C_ROLE like", value, "cRole");
            return (Criteria) this;
        }

        public Criteria andCRoleNotLike(String value) {
            addCriterion("C_ROLE not like", value, "cRole");
            return (Criteria) this;
        }

        public Criteria andCRoleIn(List<String> values) {
            addCriterion("C_ROLE in", values, "cRole");
            return (Criteria) this;
        }

        public Criteria andCRoleNotIn(List<String> values) {
            addCriterion("C_ROLE not in", values, "cRole");
            return (Criteria) this;
        }

        public Criteria andCRoleBetween(String value1, String value2) {
            addCriterion("C_ROLE between", value1, value2, "cRole");
            return (Criteria) this;
        }

        public Criteria andCRoleNotBetween(String value1, String value2) {
            addCriterion("C_ROLE not between", value1, value2, "cRole");
            return (Criteria) this;
        }

        public Criteria andCRightIsNull() {
            addCriterion("C_RIGHT is null");
            return (Criteria) this;
        }

        public Criteria andCRightIsNotNull() {
            addCriterion("C_RIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andCRightEqualTo(String value) {
            addCriterion("C_RIGHT =", value, "cRight");
            return (Criteria) this;
        }

        public Criteria andCRightNotEqualTo(String value) {
            addCriterion("C_RIGHT <>", value, "cRight");
            return (Criteria) this;
        }

        public Criteria andCRightGreaterThan(String value) {
            addCriterion("C_RIGHT >", value, "cRight");
            return (Criteria) this;
        }

        public Criteria andCRightGreaterThanOrEqualTo(String value) {
            addCriterion("C_RIGHT >=", value, "cRight");
            return (Criteria) this;
        }

        public Criteria andCRightLessThan(String value) {
            addCriterion("C_RIGHT <", value, "cRight");
            return (Criteria) this;
        }

        public Criteria andCRightLessThanOrEqualTo(String value) {
            addCriterion("C_RIGHT <=", value, "cRight");
            return (Criteria) this;
        }

        public Criteria andCRightLike(String value) {
            addCriterion("C_RIGHT like", value, "cRight");
            return (Criteria) this;
        }

        public Criteria andCRightNotLike(String value) {
            addCriterion("C_RIGHT not like", value, "cRight");
            return (Criteria) this;
        }

        public Criteria andCRightIn(List<String> values) {
            addCriterion("C_RIGHT in", values, "cRight");
            return (Criteria) this;
        }

        public Criteria andCRightNotIn(List<String> values) {
            addCriterion("C_RIGHT not in", values, "cRight");
            return (Criteria) this;
        }

        public Criteria andCRightBetween(String value1, String value2) {
            addCriterion("C_RIGHT between", value1, value2, "cRight");
            return (Criteria) this;
        }

        public Criteria andCRightNotBetween(String value1, String value2) {
            addCriterion("C_RIGHT not between", value1, value2, "cRight");
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