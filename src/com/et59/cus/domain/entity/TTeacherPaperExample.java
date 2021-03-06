package com.et59.cus.domain.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TTeacherPaperExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table t_teacher_paper
     *
     * @ibatorgenerated Tue Mar 03 17:43:02 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table t_teacher_paper
     *
     * @ibatorgenerated Tue Mar 03 17:43:02 CST 2015
     */
    protected List oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_teacher_paper
     *
     * @ibatorgenerated Tue Mar 03 17:43:02 CST 2015
     */
    public TTeacherPaperExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_teacher_paper
     *
     * @ibatorgenerated Tue Mar 03 17:43:02 CST 2015
     */
    protected TTeacherPaperExample(TTeacherPaperExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_teacher_paper
     *
     * @ibatorgenerated Tue Mar 03 17:43:02 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_teacher_paper
     *
     * @ibatorgenerated Tue Mar 03 17:43:02 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_teacher_paper
     *
     * @ibatorgenerated Tue Mar 03 17:43:02 CST 2015
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_teacher_paper
     *
     * @ibatorgenerated Tue Mar 03 17:43:02 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_teacher_paper
     *
     * @ibatorgenerated Tue Mar 03 17:43:02 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_teacher_paper
     *
     * @ibatorgenerated Tue Mar 03 17:43:02 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_teacher_paper
     *
     * @ibatorgenerated Tue Mar 03 17:43:02 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table t_teacher_paper
     *
     * @ibatorgenerated Tue Mar 03 17:43:02 CST 2015
     */
    public static class Criteria {
        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andPaperidIsNull() {
            addCriterion("paperId is null");
            return this;
        }

        public Criteria andPaperidIsNotNull() {
            addCriterion("paperId is not null");
            return this;
        }

        public Criteria andPaperidEqualTo(Long value) {
            addCriterion("paperId =", value, "paperid");
            return this;
        }

        public Criteria andPaperidNotEqualTo(Long value) {
            addCriterion("paperId <>", value, "paperid");
            return this;
        }

        public Criteria andPaperidGreaterThan(Long value) {
            addCriterion("paperId >", value, "paperid");
            return this;
        }

        public Criteria andPaperidGreaterThanOrEqualTo(Long value) {
            addCriterion("paperId >=", value, "paperid");
            return this;
        }

        public Criteria andPaperidLessThan(Long value) {
            addCriterion("paperId <", value, "paperid");
            return this;
        }

        public Criteria andPaperidLessThanOrEqualTo(Long value) {
            addCriterion("paperId <=", value, "paperid");
            return this;
        }

        public Criteria andPaperidIn(List values) {
            addCriterion("paperId in", values, "paperid");
            return this;
        }

        public Criteria andPaperidNotIn(List values) {
            addCriterion("paperId not in", values, "paperid");
            return this;
        }

        public Criteria andPaperidBetween(Long value1, Long value2) {
            addCriterion("paperId between", value1, value2, "paperid");
            return this;
        }

        public Criteria andPaperidNotBetween(Long value1, Long value2) {
            addCriterion("paperId not between", value1, value2, "paperid");
            return this;
        }

        public Criteria andTeacheridIsNull() {
            addCriterion("teacherId is null");
            return this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("teacherId is not null");
            return this;
        }

        public Criteria andTeacheridEqualTo(Long value) {
            addCriterion("teacherId =", value, "teacherid");
            return this;
        }

        public Criteria andTeacheridNotEqualTo(Long value) {
            addCriterion("teacherId <>", value, "teacherid");
            return this;
        }

        public Criteria andTeacheridGreaterThan(Long value) {
            addCriterion("teacherId >", value, "teacherid");
            return this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(Long value) {
            addCriterion("teacherId >=", value, "teacherid");
            return this;
        }

        public Criteria andTeacheridLessThan(Long value) {
            addCriterion("teacherId <", value, "teacherid");
            return this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(Long value) {
            addCriterion("teacherId <=", value, "teacherid");
            return this;
        }

        public Criteria andTeacheridIn(List values) {
            addCriterion("teacherId in", values, "teacherid");
            return this;
        }

        public Criteria andTeacheridNotIn(List values) {
            addCriterion("teacherId not in", values, "teacherid");
            return this;
        }

        public Criteria andTeacheridBetween(Long value1, Long value2) {
            addCriterion("teacherId between", value1, value2, "teacherid");
            return this;
        }

        public Criteria andTeacheridNotBetween(Long value1, Long value2) {
            addCriterion("teacherId not between", value1, value2, "teacherid");
            return this;
        }
    }
}