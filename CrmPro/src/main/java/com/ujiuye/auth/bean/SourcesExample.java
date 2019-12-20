package com.ujiuye.auth.bean;

import java.util.ArrayList;
import java.util.List;

public class SourcesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SourcesExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSndisIsNull() {
            addCriterion("sndis is null");
            return (Criteria) this;
        }

        public Criteria andSndisIsNotNull() {
            addCriterion("sndis is not null");
            return (Criteria) this;
        }

        public Criteria andSndisEqualTo(String value) {
            addCriterion("sndis =", value, "sndis");
            return (Criteria) this;
        }

        public Criteria andSndisNotEqualTo(String value) {
            addCriterion("sndis <>", value, "sndis");
            return (Criteria) this;
        }

        public Criteria andSndisGreaterThan(String value) {
            addCriterion("sndis >", value, "sndis");
            return (Criteria) this;
        }

        public Criteria andSndisGreaterThanOrEqualTo(String value) {
            addCriterion("sndis >=", value, "sndis");
            return (Criteria) this;
        }

        public Criteria andSndisLessThan(String value) {
            addCriterion("sndis <", value, "sndis");
            return (Criteria) this;
        }

        public Criteria andSndisLessThanOrEqualTo(String value) {
            addCriterion("sndis <=", value, "sndis");
            return (Criteria) this;
        }

        public Criteria andSndisLike(String value) {
            addCriterion("sndis like", value, "sndis");
            return (Criteria) this;
        }

        public Criteria andSndisNotLike(String value) {
            addCriterion("sndis not like", value, "sndis");
            return (Criteria) this;
        }

        public Criteria andSndisIn(List<String> values) {
            addCriterion("sndis in", values, "sndis");
            return (Criteria) this;
        }

        public Criteria andSndisNotIn(List<String> values) {
            addCriterion("sndis not in", values, "sndis");
            return (Criteria) this;
        }

        public Criteria andSndisBetween(String value1, String value2) {
            addCriterion("sndis between", value1, value2, "sndis");
            return (Criteria) this;
        }

        public Criteria andSndisNotBetween(String value1, String value2) {
            addCriterion("sndis not between", value1, value2, "sndis");
            return (Criteria) this;
        }

        public Criteria andSpathIsNull() {
            addCriterion("spath is null");
            return (Criteria) this;
        }

        public Criteria andSpathIsNotNull() {
            addCriterion("spath is not null");
            return (Criteria) this;
        }

        public Criteria andSpathEqualTo(String value) {
            addCriterion("spath =", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathNotEqualTo(String value) {
            addCriterion("spath <>", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathGreaterThan(String value) {
            addCriterion("spath >", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathGreaterThanOrEqualTo(String value) {
            addCriterion("spath >=", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathLessThan(String value) {
            addCriterion("spath <", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathLessThanOrEqualTo(String value) {
            addCriterion("spath <=", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathLike(String value) {
            addCriterion("spath like", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathNotLike(String value) {
            addCriterion("spath not like", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathIn(List<String> values) {
            addCriterion("spath in", values, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathNotIn(List<String> values) {
            addCriterion("spath not in", values, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathBetween(String value1, String value2) {
            addCriterion("spath between", value1, value2, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathNotBetween(String value1, String value2) {
            addCriterion("spath not between", value1, value2, "spath");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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