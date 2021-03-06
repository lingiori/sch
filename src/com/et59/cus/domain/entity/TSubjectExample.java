package com.et59.cus.domain.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TSubjectExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table t_subject
	 * @ibatorgenerated  Tue Mar 10 16:54:18 CST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table t_subject
	 * @ibatorgenerated  Tue Mar 10 16:54:18 CST 2015
	 */
	protected List oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_subject
	 * @ibatorgenerated  Tue Mar 10 16:54:18 CST 2015
	 */
	public TSubjectExample() {
		oredCriteria = new ArrayList();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_subject
	 * @ibatorgenerated  Tue Mar 10 16:54:18 CST 2015
	 */
	protected TSubjectExample(TSubjectExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_subject
	 * @ibatorgenerated  Tue Mar 10 16:54:18 CST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_subject
	 * @ibatorgenerated  Tue Mar 10 16:54:18 CST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_subject
	 * @ibatorgenerated  Tue Mar 10 16:54:18 CST 2015
	 */
	public List getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_subject
	 * @ibatorgenerated  Tue Mar 10 16:54:18 CST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_subject
	 * @ibatorgenerated  Tue Mar 10 16:54:18 CST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_subject
	 * @ibatorgenerated  Tue Mar 10 16:54:18 CST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_subject
	 * @ibatorgenerated  Tue Mar 10 16:54:18 CST 2015
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table t_subject
	 * @ibatorgenerated  Tue Mar 10 16:54:18 CST 2015
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition, List values,
				String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			List list = new ArrayList();
			list.add(value1);
			list.add(value2);
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("values", list);
			criteriaWithBetweenValue.add(map);
		}

		public Criteria andSubjectidIsNull() {
			addCriterion("subjectId is null");
			return this;
		}

		public Criteria andSubjectidIsNotNull() {
			addCriterion("subjectId is not null");
			return this;
		}

		public Criteria andSubjectidEqualTo(Long value) {
			addCriterion("subjectId =", value, "subjectid");
			return this;
		}

		public Criteria andSubjectidNotEqualTo(Long value) {
			addCriterion("subjectId <>", value, "subjectid");
			return this;
		}

		public Criteria andSubjectidGreaterThan(Long value) {
			addCriterion("subjectId >", value, "subjectid");
			return this;
		}

		public Criteria andSubjectidGreaterThanOrEqualTo(Long value) {
			addCriterion("subjectId >=", value, "subjectid");
			return this;
		}

		public Criteria andSubjectidLessThan(Long value) {
			addCriterion("subjectId <", value, "subjectid");
			return this;
		}

		public Criteria andSubjectidLessThanOrEqualTo(Long value) {
			addCriterion("subjectId <=", value, "subjectid");
			return this;
		}

		public Criteria andSubjectidIn(List values) {
			addCriterion("subjectId in", values, "subjectid");
			return this;
		}

		public Criteria andSubjectidNotIn(List values) {
			addCriterion("subjectId not in", values, "subjectid");
			return this;
		}

		public Criteria andSubjectidBetween(Long value1, Long value2) {
			addCriterion("subjectId between", value1, value2, "subjectid");
			return this;
		}

		public Criteria andSubjectidNotBetween(Long value1, Long value2) {
			addCriterion("subjectId not between", value1, value2, "subjectid");
			return this;
		}

		public Criteria andSubjectnameIsNull() {
			addCriterion("subjectName is null");
			return this;
		}

		public Criteria andSubjectnameIsNotNull() {
			addCriterion("subjectName is not null");
			return this;
		}

		public Criteria andSubjectnameEqualTo(String value) {
			addCriterion("subjectName =", value, "subjectname");
			return this;
		}

		public Criteria andSubjectnameNotEqualTo(String value) {
			addCriterion("subjectName <>", value, "subjectname");
			return this;
		}

		public Criteria andSubjectnameGreaterThan(String value) {
			addCriterion("subjectName >", value, "subjectname");
			return this;
		}

		public Criteria andSubjectnameGreaterThanOrEqualTo(String value) {
			addCriterion("subjectName >=", value, "subjectname");
			return this;
		}

		public Criteria andSubjectnameLessThan(String value) {
			addCriterion("subjectName <", value, "subjectname");
			return this;
		}

		public Criteria andSubjectnameLessThanOrEqualTo(String value) {
			addCriterion("subjectName <=", value, "subjectname");
			return this;
		}

		public Criteria andSubjectnameLike(String value) {
			addCriterion("subjectName like", value, "subjectname");
			return this;
		}

		public Criteria andSubjectnameNotLike(String value) {
			addCriterion("subjectName not like", value, "subjectname");
			return this;
		}

		public Criteria andSubjectnameIn(List values) {
			addCriterion("subjectName in", values, "subjectname");
			return this;
		}

		public Criteria andSubjectnameNotIn(List values) {
			addCriterion("subjectName not in", values, "subjectname");
			return this;
		}

		public Criteria andSubjectnameBetween(String value1, String value2) {
			addCriterion("subjectName between", value1, value2, "subjectname");
			return this;
		}

		public Criteria andSubjectnameNotBetween(String value1, String value2) {
			addCriterion("subjectName not between", value1, value2,
					"subjectname");
			return this;
		}

		public Criteria andSubjecttextIsNull() {
			addCriterion("subjectText is null");
			return this;
		}

		public Criteria andSubjecttextIsNotNull() {
			addCriterion("subjectText is not null");
			return this;
		}

		public Criteria andSubjecttextEqualTo(String value) {
			addCriterion("subjectText =", value, "subjecttext");
			return this;
		}

		public Criteria andSubjecttextNotEqualTo(String value) {
			addCriterion("subjectText <>", value, "subjecttext");
			return this;
		}

		public Criteria andSubjecttextGreaterThan(String value) {
			addCriterion("subjectText >", value, "subjecttext");
			return this;
		}

		public Criteria andSubjecttextGreaterThanOrEqualTo(String value) {
			addCriterion("subjectText >=", value, "subjecttext");
			return this;
		}

		public Criteria andSubjecttextLessThan(String value) {
			addCriterion("subjectText <", value, "subjecttext");
			return this;
		}

		public Criteria andSubjecttextLessThanOrEqualTo(String value) {
			addCriterion("subjectText <=", value, "subjecttext");
			return this;
		}

		public Criteria andSubjecttextLike(String value) {
			addCriterion("subjectText like", value, "subjecttext");
			return this;
		}

		public Criteria andSubjecttextNotLike(String value) {
			addCriterion("subjectText not like", value, "subjecttext");
			return this;
		}

		public Criteria andSubjecttextIn(List values) {
			addCriterion("subjectText in", values, "subjecttext");
			return this;
		}

		public Criteria andSubjecttextNotIn(List values) {
			addCriterion("subjectText not in", values, "subjecttext");
			return this;
		}

		public Criteria andSubjecttextBetween(String value1, String value2) {
			addCriterion("subjectText between", value1, value2, "subjecttext");
			return this;
		}

		public Criteria andSubjecttextNotBetween(String value1, String value2) {
			addCriterion("subjectText not between", value1, value2,
					"subjecttext");
			return this;
		}

		public Criteria andSubjecttypeIsNull() {
			addCriterion("subjectType is null");
			return this;
		}

		public Criteria andSubjecttypeIsNotNull() {
			addCriterion("subjectType is not null");
			return this;
		}

		public Criteria andSubjecttypeEqualTo(String value) {
			addCriterion("subjectType =", value, "subjecttype");
			return this;
		}

		public Criteria andSubjecttypeNotEqualTo(String value) {
			addCriterion("subjectType <>", value, "subjecttype");
			return this;
		}

		public Criteria andSubjecttypeGreaterThan(String value) {
			addCriterion("subjectType >", value, "subjecttype");
			return this;
		}

		public Criteria andSubjecttypeGreaterThanOrEqualTo(String value) {
			addCriterion("subjectType >=", value, "subjecttype");
			return this;
		}

		public Criteria andSubjecttypeLessThan(String value) {
			addCriterion("subjectType <", value, "subjecttype");
			return this;
		}

		public Criteria andSubjecttypeLessThanOrEqualTo(String value) {
			addCriterion("subjectType <=", value, "subjecttype");
			return this;
		}

		public Criteria andSubjecttypeLike(String value) {
			addCriterion("subjectType like", value, "subjecttype");
			return this;
		}

		public Criteria andSubjecttypeNotLike(String value) {
			addCriterion("subjectType not like", value, "subjecttype");
			return this;
		}

		public Criteria andSubjecttypeIn(List values) {
			addCriterion("subjectType in", values, "subjecttype");
			return this;
		}

		public Criteria andSubjecttypeNotIn(List values) {
			addCriterion("subjectType not in", values, "subjecttype");
			return this;
		}

		public Criteria andSubjecttypeBetween(String value1, String value2) {
			addCriterion("subjectType between", value1, value2, "subjecttype");
			return this;
		}

		public Criteria andSubjecttypeNotBetween(String value1, String value2) {
			addCriterion("subjectType not between", value1, value2,
					"subjecttype");
			return this;
		}

		public Criteria andSubjecttypenameIsNull() {
			addCriterion("subjectTypeName is null");
			return this;
		}

		public Criteria andSubjecttypenameIsNotNull() {
			addCriterion("subjectTypeName is not null");
			return this;
		}

		public Criteria andSubjecttypenameEqualTo(String value) {
			addCriterion("subjectTypeName =", value, "subjecttypename");
			return this;
		}

		public Criteria andSubjecttypenameNotEqualTo(String value) {
			addCriterion("subjectTypeName <>", value, "subjecttypename");
			return this;
		}

		public Criteria andSubjecttypenameGreaterThan(String value) {
			addCriterion("subjectTypeName >", value, "subjecttypename");
			return this;
		}

		public Criteria andSubjecttypenameGreaterThanOrEqualTo(String value) {
			addCriterion("subjectTypeName >=", value, "subjecttypename");
			return this;
		}

		public Criteria andSubjecttypenameLessThan(String value) {
			addCriterion("subjectTypeName <", value, "subjecttypename");
			return this;
		}

		public Criteria andSubjecttypenameLessThanOrEqualTo(String value) {
			addCriterion("subjectTypeName <=", value, "subjecttypename");
			return this;
		}

		public Criteria andSubjecttypenameLike(String value) {
			addCriterion("subjectTypeName like", value, "subjecttypename");
			return this;
		}

		public Criteria andSubjecttypenameNotLike(String value) {
			addCriterion("subjectTypeName not like", value, "subjecttypename");
			return this;
		}

		public Criteria andSubjecttypenameIn(List values) {
			addCriterion("subjectTypeName in", values, "subjecttypename");
			return this;
		}

		public Criteria andSubjecttypenameNotIn(List values) {
			addCriterion("subjectTypeName not in", values, "subjecttypename");
			return this;
		}

		public Criteria andSubjecttypenameBetween(String value1, String value2) {
			addCriterion("subjectTypeName between", value1, value2,
					"subjecttypename");
			return this;
		}

		public Criteria andSubjecttypenameNotBetween(String value1,
				String value2) {
			addCriterion("subjectTypeName not between", value1, value2,
					"subjecttypename");
			return this;
		}

		public Criteria andSubjectnoIsNull() {
			addCriterion("subjectNO is null");
			return this;
		}

		public Criteria andSubjectnoIsNotNull() {
			addCriterion("subjectNO is not null");
			return this;
		}

		public Criteria andSubjectnoEqualTo(String value) {
			addCriterion("subjectNO =", value, "subjectno");
			return this;
		}

		public Criteria andSubjectnoNotEqualTo(String value) {
			addCriterion("subjectNO <>", value, "subjectno");
			return this;
		}

		public Criteria andSubjectnoGreaterThan(String value) {
			addCriterion("subjectNO >", value, "subjectno");
			return this;
		}

		public Criteria andSubjectnoGreaterThanOrEqualTo(String value) {
			addCriterion("subjectNO >=", value, "subjectno");
			return this;
		}

		public Criteria andSubjectnoLessThan(String value) {
			addCriterion("subjectNO <", value, "subjectno");
			return this;
		}

		public Criteria andSubjectnoLessThanOrEqualTo(String value) {
			addCriterion("subjectNO <=", value, "subjectno");
			return this;
		}

		public Criteria andSubjectnoLike(String value) {
			addCriterion("subjectNO like", value, "subjectno");
			return this;
		}

		public Criteria andSubjectnoNotLike(String value) {
			addCriterion("subjectNO not like", value, "subjectno");
			return this;
		}

		public Criteria andSubjectnoIn(List values) {
			addCriterion("subjectNO in", values, "subjectno");
			return this;
		}

		public Criteria andSubjectnoNotIn(List values) {
			addCriterion("subjectNO not in", values, "subjectno");
			return this;
		}

		public Criteria andSubjectnoBetween(String value1, String value2) {
			addCriterion("subjectNO between", value1, value2, "subjectno");
			return this;
		}

		public Criteria andSubjectnoNotBetween(String value1, String value2) {
			addCriterion("subjectNO not between", value1, value2, "subjectno");
			return this;
		}

		public Criteria andSubjectoutlineIsNull() {
			addCriterion("subjectOutline is null");
			return this;
		}

		public Criteria andSubjectoutlineIsNotNull() {
			addCriterion("subjectOutline is not null");
			return this;
		}

		public Criteria andSubjectoutlineEqualTo(Long value) {
			addCriterion("subjectOutline =", value, "subjectoutline");
			return this;
		}

		public Criteria andSubjectoutlineNotEqualTo(Long value) {
			addCriterion("subjectOutline <>", value, "subjectoutline");
			return this;
		}

		public Criteria andSubjectoutlineGreaterThan(Long value) {
			addCriterion("subjectOutline >", value, "subjectoutline");
			return this;
		}

		public Criteria andSubjectoutlineGreaterThanOrEqualTo(Long value) {
			addCriterion("subjectOutline >=", value, "subjectoutline");
			return this;
		}

		public Criteria andSubjectoutlineLessThan(Long value) {
			addCriterion("subjectOutline <", value, "subjectoutline");
			return this;
		}

		public Criteria andSubjectoutlineLessThanOrEqualTo(Long value) {
			addCriterion("subjectOutline <=", value, "subjectoutline");
			return this;
		}

		public Criteria andSubjectoutlineIn(List values) {
			addCriterion("subjectOutline in", values, "subjectoutline");
			return this;
		}

		public Criteria andSubjectoutlineNotIn(List values) {
			addCriterion("subjectOutline not in", values, "subjectoutline");
			return this;
		}

		public Criteria andSubjectoutlineBetween(Long value1, Long value2) {
			addCriterion("subjectOutline between", value1, value2,
					"subjectoutline");
			return this;
		}

		public Criteria andSubjectoutlineNotBetween(Long value1, Long value2) {
			addCriterion("subjectOutline not between", value1, value2,
					"subjectoutline");
			return this;
		}

		public Criteria andSubjectscheduleIsNull() {
			addCriterion("subjectSchedule is null");
			return this;
		}

		public Criteria andSubjectscheduleIsNotNull() {
			addCriterion("subjectSchedule is not null");
			return this;
		}

		public Criteria andSubjectscheduleEqualTo(Long value) {
			addCriterion("subjectSchedule =", value, "subjectschedule");
			return this;
		}

		public Criteria andSubjectscheduleNotEqualTo(Long value) {
			addCriterion("subjectSchedule <>", value, "subjectschedule");
			return this;
		}

		public Criteria andSubjectscheduleGreaterThan(Long value) {
			addCriterion("subjectSchedule >", value, "subjectschedule");
			return this;
		}

		public Criteria andSubjectscheduleGreaterThanOrEqualTo(Long value) {
			addCriterion("subjectSchedule >=", value, "subjectschedule");
			return this;
		}

		public Criteria andSubjectscheduleLessThan(Long value) {
			addCriterion("subjectSchedule <", value, "subjectschedule");
			return this;
		}

		public Criteria andSubjectscheduleLessThanOrEqualTo(Long value) {
			addCriterion("subjectSchedule <=", value, "subjectschedule");
			return this;
		}

		public Criteria andSubjectscheduleIn(List values) {
			addCriterion("subjectSchedule in", values, "subjectschedule");
			return this;
		}

		public Criteria andSubjectscheduleNotIn(List values) {
			addCriterion("subjectSchedule not in", values, "subjectschedule");
			return this;
		}

		public Criteria andSubjectscheduleBetween(Long value1, Long value2) {
			addCriterion("subjectSchedule between", value1, value2,
					"subjectschedule");
			return this;
		}

		public Criteria andSubjectscheduleNotBetween(Long value1, Long value2) {
			addCriterion("subjectSchedule not between", value1, value2,
					"subjectschedule");
			return this;
		}

		public Criteria andSubjectinfoIsNull() {
			addCriterion("subjectInfo is null");
			return this;
		}

		public Criteria andSubjectinfoIsNotNull() {
			addCriterion("subjectInfo is not null");
			return this;
		}

		public Criteria andSubjectinfoEqualTo(Long value) {
			addCriterion("subjectInfo =", value, "subjectinfo");
			return this;
		}

		public Criteria andSubjectinfoNotEqualTo(Long value) {
			addCriterion("subjectInfo <>", value, "subjectinfo");
			return this;
		}

		public Criteria andSubjectinfoGreaterThan(Long value) {
			addCriterion("subjectInfo >", value, "subjectinfo");
			return this;
		}

		public Criteria andSubjectinfoGreaterThanOrEqualTo(Long value) {
			addCriterion("subjectInfo >=", value, "subjectinfo");
			return this;
		}

		public Criteria andSubjectinfoLessThan(Long value) {
			addCriterion("subjectInfo <", value, "subjectinfo");
			return this;
		}

		public Criteria andSubjectinfoLessThanOrEqualTo(Long value) {
			addCriterion("subjectInfo <=", value, "subjectinfo");
			return this;
		}

		public Criteria andSubjectinfoIn(List values) {
			addCriterion("subjectInfo in", values, "subjectinfo");
			return this;
		}

		public Criteria andSubjectinfoNotIn(List values) {
			addCriterion("subjectInfo not in", values, "subjectinfo");
			return this;
		}

		public Criteria andSubjectinfoBetween(Long value1, Long value2) {
			addCriterion("subjectInfo between", value1, value2, "subjectinfo");
			return this;
		}

		public Criteria andSubjectinfoNotBetween(Long value1, Long value2) {
			addCriterion("subjectInfo not between", value1, value2,
					"subjectinfo");
			return this;
		}

		public Criteria andSubjectisvalidIsNull() {
			addCriterion("subjectIsvalid is null");
			return this;
		}

		public Criteria andSubjectisvalidIsNotNull() {
			addCriterion("subjectIsvalid is not null");
			return this;
		}

		public Criteria andSubjectisvalidEqualTo(String value) {
			addCriterion("subjectIsvalid =", value, "subjectisvalid");
			return this;
		}

		public Criteria andSubjectisvalidNotEqualTo(String value) {
			addCriterion("subjectIsvalid <>", value, "subjectisvalid");
			return this;
		}

		public Criteria andSubjectisvalidGreaterThan(String value) {
			addCriterion("subjectIsvalid >", value, "subjectisvalid");
			return this;
		}

		public Criteria andSubjectisvalidGreaterThanOrEqualTo(String value) {
			addCriterion("subjectIsvalid >=", value, "subjectisvalid");
			return this;
		}

		public Criteria andSubjectisvalidLessThan(String value) {
			addCriterion("subjectIsvalid <", value, "subjectisvalid");
			return this;
		}

		public Criteria andSubjectisvalidLessThanOrEqualTo(String value) {
			addCriterion("subjectIsvalid <=", value, "subjectisvalid");
			return this;
		}

		public Criteria andSubjectisvalidLike(String value) {
			addCriterion("subjectIsvalid like", value, "subjectisvalid");
			return this;
		}

		public Criteria andSubjectisvalidNotLike(String value) {
			addCriterion("subjectIsvalid not like", value, "subjectisvalid");
			return this;
		}

		public Criteria andSubjectisvalidIn(List values) {
			addCriterion("subjectIsvalid in", values, "subjectisvalid");
			return this;
		}

		public Criteria andSubjectisvalidNotIn(List values) {
			addCriterion("subjectIsvalid not in", values, "subjectisvalid");
			return this;
		}

		public Criteria andSubjectisvalidBetween(String value1, String value2) {
			addCriterion("subjectIsvalid between", value1, value2,
					"subjectisvalid");
			return this;
		}

		public Criteria andSubjectisvalidNotBetween(String value1, String value2) {
			addCriterion("subjectIsvalid not between", value1, value2,
					"subjectisvalid");
			return this;
		}
	}
}