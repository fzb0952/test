package com.fan.image.bean;

import java.util.ArrayList;
import java.util.List;

public class TUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserExample() {
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

        public Criteria andCUsernameIsNull() {
            addCriterion("C_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCUsernameIsNotNull() {
            addCriterion("C_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCUsernameEqualTo(String value) {
            addCriterion("C_USERNAME =", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotEqualTo(String value) {
            addCriterion("C_USERNAME <>", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameGreaterThan(String value) {
            addCriterion("C_USERNAME >", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("C_USERNAME >=", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameLessThan(String value) {
            addCriterion("C_USERNAME <", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameLessThanOrEqualTo(String value) {
            addCriterion("C_USERNAME <=", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameLike(String value) {
            addCriterion("C_USERNAME like", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotLike(String value) {
            addCriterion("C_USERNAME not like", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameIn(List<String> values) {
            addCriterion("C_USERNAME in", values, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotIn(List<String> values) {
            addCriterion("C_USERNAME not in", values, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameBetween(String value1, String value2) {
            addCriterion("C_USERNAME between", value1, value2, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotBetween(String value1, String value2) {
            addCriterion("C_USERNAME not between", value1, value2, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNull() {
            addCriterion("C_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNotNull() {
            addCriterion("C_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andCPasswordEqualTo(String value) {
            addCriterion("C_PASSWORD =", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotEqualTo(String value) {
            addCriterion("C_PASSWORD <>", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThan(String value) {
            addCriterion("C_PASSWORD >", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("C_PASSWORD >=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThan(String value) {
            addCriterion("C_PASSWORD <", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThanOrEqualTo(String value) {
            addCriterion("C_PASSWORD <=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLike(String value) {
            addCriterion("C_PASSWORD like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotLike(String value) {
            addCriterion("C_PASSWORD not like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordIn(List<String> values) {
            addCriterion("C_PASSWORD in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotIn(List<String> values) {
            addCriterion("C_PASSWORD not in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordBetween(String value1, String value2) {
            addCriterion("C_PASSWORD between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotBetween(String value1, String value2) {
            addCriterion("C_PASSWORD not between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andNAgeIsNull() {
            addCriterion("N_AGE is null");
            return (Criteria) this;
        }

        public Criteria andNAgeIsNotNull() {
            addCriterion("N_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andNAgeEqualTo(Integer value) {
            addCriterion("N_AGE =", value, "nAge");
            return (Criteria) this;
        }

        public Criteria andNAgeNotEqualTo(Integer value) {
            addCriterion("N_AGE <>", value, "nAge");
            return (Criteria) this;
        }

        public Criteria andNAgeGreaterThan(Integer value) {
            addCriterion("N_AGE >", value, "nAge");
            return (Criteria) this;
        }

        public Criteria andNAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("N_AGE >=", value, "nAge");
            return (Criteria) this;
        }

        public Criteria andNAgeLessThan(Integer value) {
            addCriterion("N_AGE <", value, "nAge");
            return (Criteria) this;
        }

        public Criteria andNAgeLessThanOrEqualTo(Integer value) {
            addCriterion("N_AGE <=", value, "nAge");
            return (Criteria) this;
        }

        public Criteria andNAgeIn(List<Integer> values) {
            addCriterion("N_AGE in", values, "nAge");
            return (Criteria) this;
        }

        public Criteria andNAgeNotIn(List<Integer> values) {
            addCriterion("N_AGE not in", values, "nAge");
            return (Criteria) this;
        }

        public Criteria andNAgeBetween(Integer value1, Integer value2) {
            addCriterion("N_AGE between", value1, value2, "nAge");
            return (Criteria) this;
        }

        public Criteria andNAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("N_AGE not between", value1, value2, "nAge");
            return (Criteria) this;
        }

        public Criteria andCSexIsNull() {
            addCriterion("C_SEX is null");
            return (Criteria) this;
        }

        public Criteria andCSexIsNotNull() {
            addCriterion("C_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andCSexEqualTo(String value) {
            addCriterion("C_SEX =", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotEqualTo(String value) {
            addCriterion("C_SEX <>", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexGreaterThan(String value) {
            addCriterion("C_SEX >", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexGreaterThanOrEqualTo(String value) {
            addCriterion("C_SEX >=", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexLessThan(String value) {
            addCriterion("C_SEX <", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexLessThanOrEqualTo(String value) {
            addCriterion("C_SEX <=", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexLike(String value) {
            addCriterion("C_SEX like", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotLike(String value) {
            addCriterion("C_SEX not like", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexIn(List<String> values) {
            addCriterion("C_SEX in", values, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotIn(List<String> values) {
            addCriterion("C_SEX not in", values, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexBetween(String value1, String value2) {
            addCriterion("C_SEX between", value1, value2, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotBetween(String value1, String value2) {
            addCriterion("C_SEX not between", value1, value2, "cSex");
            return (Criteria) this;
        }

        public Criteria andCTelIsNull() {
            addCriterion("C_TEL is null");
            return (Criteria) this;
        }

        public Criteria andCTelIsNotNull() {
            addCriterion("C_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andCTelEqualTo(String value) {
            addCriterion("C_TEL =", value, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelNotEqualTo(String value) {
            addCriterion("C_TEL <>", value, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelGreaterThan(String value) {
            addCriterion("C_TEL >", value, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelGreaterThanOrEqualTo(String value) {
            addCriterion("C_TEL >=", value, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelLessThan(String value) {
            addCriterion("C_TEL <", value, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelLessThanOrEqualTo(String value) {
            addCriterion("C_TEL <=", value, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelLike(String value) {
            addCriterion("C_TEL like", value, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelNotLike(String value) {
            addCriterion("C_TEL not like", value, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelIn(List<String> values) {
            addCriterion("C_TEL in", values, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelNotIn(List<String> values) {
            addCriterion("C_TEL not in", values, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelBetween(String value1, String value2) {
            addCriterion("C_TEL between", value1, value2, "cTel");
            return (Criteria) this;
        }

        public Criteria andCTelNotBetween(String value1, String value2) {
            addCriterion("C_TEL not between", value1, value2, "cTel");
            return (Criteria) this;
        }

        public Criteria andCAdressIsNull() {
            addCriterion("C_ADRESS is null");
            return (Criteria) this;
        }

        public Criteria andCAdressIsNotNull() {
            addCriterion("C_ADRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCAdressEqualTo(String value) {
            addCriterion("C_ADRESS =", value, "cAdress");
            return (Criteria) this;
        }

        public Criteria andCAdressNotEqualTo(String value) {
            addCriterion("C_ADRESS <>", value, "cAdress");
            return (Criteria) this;
        }

        public Criteria andCAdressGreaterThan(String value) {
            addCriterion("C_ADRESS >", value, "cAdress");
            return (Criteria) this;
        }

        public Criteria andCAdressGreaterThanOrEqualTo(String value) {
            addCriterion("C_ADRESS >=", value, "cAdress");
            return (Criteria) this;
        }

        public Criteria andCAdressLessThan(String value) {
            addCriterion("C_ADRESS <", value, "cAdress");
            return (Criteria) this;
        }

        public Criteria andCAdressLessThanOrEqualTo(String value) {
            addCriterion("C_ADRESS <=", value, "cAdress");
            return (Criteria) this;
        }

        public Criteria andCAdressLike(String value) {
            addCriterion("C_ADRESS like", value, "cAdress");
            return (Criteria) this;
        }

        public Criteria andCAdressNotLike(String value) {
            addCriterion("C_ADRESS not like", value, "cAdress");
            return (Criteria) this;
        }

        public Criteria andCAdressIn(List<String> values) {
            addCriterion("C_ADRESS in", values, "cAdress");
            return (Criteria) this;
        }

        public Criteria andCAdressNotIn(List<String> values) {
            addCriterion("C_ADRESS not in", values, "cAdress");
            return (Criteria) this;
        }

        public Criteria andCAdressBetween(String value1, String value2) {
            addCriterion("C_ADRESS between", value1, value2, "cAdress");
            return (Criteria) this;
        }

        public Criteria andCAdressNotBetween(String value1, String value2) {
            addCriterion("C_ADRESS not between", value1, value2, "cAdress");
            return (Criteria) this;
        }

        public Criteria andCEmailIsNull() {
            addCriterion("C_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCEmailIsNotNull() {
            addCriterion("C_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCEmailEqualTo(String value) {
            addCriterion("C_EMAIL =", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotEqualTo(String value) {
            addCriterion("C_EMAIL <>", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailGreaterThan(String value) {
            addCriterion("C_EMAIL >", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailGreaterThanOrEqualTo(String value) {
            addCriterion("C_EMAIL >=", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLessThan(String value) {
            addCriterion("C_EMAIL <", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLessThanOrEqualTo(String value) {
            addCriterion("C_EMAIL <=", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLike(String value) {
            addCriterion("C_EMAIL like", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotLike(String value) {
            addCriterion("C_EMAIL not like", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailIn(List<String> values) {
            addCriterion("C_EMAIL in", values, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotIn(List<String> values) {
            addCriterion("C_EMAIL not in", values, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailBetween(String value1, String value2) {
            addCriterion("C_EMAIL between", value1, value2, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotBetween(String value1, String value2) {
            addCriterion("C_EMAIL not between", value1, value2, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCOrderIsNull() {
            addCriterion("C_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andCOrderIsNotNull() {
            addCriterion("C_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andCOrderEqualTo(String value) {
            addCriterion("C_ORDER =", value, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderNotEqualTo(String value) {
            addCriterion("C_ORDER <>", value, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderGreaterThan(String value) {
            addCriterion("C_ORDER >", value, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderGreaterThanOrEqualTo(String value) {
            addCriterion("C_ORDER >=", value, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderLessThan(String value) {
            addCriterion("C_ORDER <", value, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderLessThanOrEqualTo(String value) {
            addCriterion("C_ORDER <=", value, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderLike(String value) {
            addCriterion("C_ORDER like", value, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderNotLike(String value) {
            addCriterion("C_ORDER not like", value, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderIn(List<String> values) {
            addCriterion("C_ORDER in", values, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderNotIn(List<String> values) {
            addCriterion("C_ORDER not in", values, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderBetween(String value1, String value2) {
            addCriterion("C_ORDER between", value1, value2, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderNotBetween(String value1, String value2) {
            addCriterion("C_ORDER not between", value1, value2, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCCarIsNull() {
            addCriterion("C_CAR is null");
            return (Criteria) this;
        }

        public Criteria andCCarIsNotNull() {
            addCriterion("C_CAR is not null");
            return (Criteria) this;
        }

        public Criteria andCCarEqualTo(String value) {
            addCriterion("C_CAR =", value, "cCar");
            return (Criteria) this;
        }

        public Criteria andCCarNotEqualTo(String value) {
            addCriterion("C_CAR <>", value, "cCar");
            return (Criteria) this;
        }

        public Criteria andCCarGreaterThan(String value) {
            addCriterion("C_CAR >", value, "cCar");
            return (Criteria) this;
        }

        public Criteria andCCarGreaterThanOrEqualTo(String value) {
            addCriterion("C_CAR >=", value, "cCar");
            return (Criteria) this;
        }

        public Criteria andCCarLessThan(String value) {
            addCriterion("C_CAR <", value, "cCar");
            return (Criteria) this;
        }

        public Criteria andCCarLessThanOrEqualTo(String value) {
            addCriterion("C_CAR <=", value, "cCar");
            return (Criteria) this;
        }

        public Criteria andCCarLike(String value) {
            addCriterion("C_CAR like", value, "cCar");
            return (Criteria) this;
        }

        public Criteria andCCarNotLike(String value) {
            addCriterion("C_CAR not like", value, "cCar");
            return (Criteria) this;
        }

        public Criteria andCCarIn(List<String> values) {
            addCriterion("C_CAR in", values, "cCar");
            return (Criteria) this;
        }

        public Criteria andCCarNotIn(List<String> values) {
            addCriterion("C_CAR not in", values, "cCar");
            return (Criteria) this;
        }

        public Criteria andCCarBetween(String value1, String value2) {
            addCriterion("C_CAR between", value1, value2, "cCar");
            return (Criteria) this;
        }

        public Criteria andCCarNotBetween(String value1, String value2) {
            addCriterion("C_CAR not between", value1, value2, "cCar");
            return (Criteria) this;
        }

        public Criteria andCCollectrionIsNull() {
            addCriterion("C_COLLECTRION is null");
            return (Criteria) this;
        }

        public Criteria andCCollectrionIsNotNull() {
            addCriterion("C_COLLECTRION is not null");
            return (Criteria) this;
        }

        public Criteria andCCollectrionEqualTo(String value) {
            addCriterion("C_COLLECTRION =", value, "cCollectrion");
            return (Criteria) this;
        }

        public Criteria andCCollectrionNotEqualTo(String value) {
            addCriterion("C_COLLECTRION <>", value, "cCollectrion");
            return (Criteria) this;
        }

        public Criteria andCCollectrionGreaterThan(String value) {
            addCriterion("C_COLLECTRION >", value, "cCollectrion");
            return (Criteria) this;
        }

        public Criteria andCCollectrionGreaterThanOrEqualTo(String value) {
            addCriterion("C_COLLECTRION >=", value, "cCollectrion");
            return (Criteria) this;
        }

        public Criteria andCCollectrionLessThan(String value) {
            addCriterion("C_COLLECTRION <", value, "cCollectrion");
            return (Criteria) this;
        }

        public Criteria andCCollectrionLessThanOrEqualTo(String value) {
            addCriterion("C_COLLECTRION <=", value, "cCollectrion");
            return (Criteria) this;
        }

        public Criteria andCCollectrionLike(String value) {
            addCriterion("C_COLLECTRION like", value, "cCollectrion");
            return (Criteria) this;
        }

        public Criteria andCCollectrionNotLike(String value) {
            addCriterion("C_COLLECTRION not like", value, "cCollectrion");
            return (Criteria) this;
        }

        public Criteria andCCollectrionIn(List<String> values) {
            addCriterion("C_COLLECTRION in", values, "cCollectrion");
            return (Criteria) this;
        }

        public Criteria andCCollectrionNotIn(List<String> values) {
            addCriterion("C_COLLECTRION not in", values, "cCollectrion");
            return (Criteria) this;
        }

        public Criteria andCCollectrionBetween(String value1, String value2) {
            addCriterion("C_COLLECTRION between", value1, value2, "cCollectrion");
            return (Criteria) this;
        }

        public Criteria andCCollectrionNotBetween(String value1, String value2) {
            addCriterion("C_COLLECTRION not between", value1, value2, "cCollectrion");
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