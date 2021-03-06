package com.et59.cus.domain.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class BsLeavemessageExample {

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database table bs_leavemessage
	 * @abatorgenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database table bs_leavemessage
	 * @abatorgenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_leavemessage
	 * @abatorgenerated
	 */
	public BsLeavemessageExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_leavemessage
	 * @abatorgenerated
	 */
	protected BsLeavemessageExample(BsLeavemessageExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_leavemessage
	 * @abatorgenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_leavemessage
	 * @abatorgenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_leavemessage
	 * @abatorgenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_leavemessage
	 * @abatorgenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_leavemessage
	 * @abatorgenerated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_leavemessage
	 * @abatorgenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_leavemessage
	 * @abatorgenerated
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Abator for iBATIS. This class corresponds to the database table bs_leavemessage
	 * @abatorgenerated
	 */
	public static class Criteria {
		protected List<String> criteriaWithoutValue;
		protected List<Map<String, Object>> criteriaWithSingleValue;
		protected List<Map<String, Object>> criteriaWithListValue;
		protected List<Map<String, Object>> criteriaWithBetweenValue;

		protected Criteria() {
			super();
			criteriaWithoutValue = new ArrayList<String>();
			criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
			criteriaWithListValue = new ArrayList<Map<String, Object>>();
			criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
		}

		public boolean isValid() {
			return criteriaWithoutValue.size() > 0
					|| criteriaWithSingleValue.size() > 0
					|| criteriaWithListValue.size() > 0
					|| criteriaWithBetweenValue.size() > 0;
		}

		public List<String> getCriteriaWithoutValue() {
			return criteriaWithoutValue;
		}

		public List<Map<String, Object>> getCriteriaWithSingleValue() {
			return criteriaWithSingleValue;
		}

		public List<Map<String, Object>> getCriteriaWithListValue() {
			return criteriaWithListValue;
		}

		public List<Map<String, Object>> getCriteriaWithBetweenValue() {
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
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition,
				List<? extends Object> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map<String, Object> map = new HashMap<String, Object>();
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
			List<Object> list = new ArrayList<Object>();
			list.add(value1);
			list.add(value2);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", list);
			criteriaWithBetweenValue.add(map);
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return this;
		}

		public Criteria andMessageIsNull() {
			addCriterion("message is null");
			return this;
		}

		public Criteria andMessageIsNotNull() {
			addCriterion("message is not null");
			return this;
		}

		public Criteria andMessageEqualTo(String value) {
			addCriterion("message =", value, "message");
			return this;
		}

		public Criteria andMessageNotEqualTo(String value) {
			addCriterion("message <>", value, "message");
			return this;
		}

		public Criteria andMessageGreaterThan(String value) {
			addCriterion("message >", value, "message");
			return this;
		}

		public Criteria andMessageGreaterThanOrEqualTo(String value) {
			addCriterion("message >=", value, "message");
			return this;
		}

		public Criteria andMessageLessThan(String value) {
			addCriterion("message <", value, "message");
			return this;
		}

		public Criteria andMessageLessThanOrEqualTo(String value) {
			addCriterion("message <=", value, "message");
			return this;
		}

		public Criteria andMessageLike(String value) {
			addCriterion("message like", value, "message");
			return this;
		}

		public Criteria andMessageNotLike(String value) {
			addCriterion("message not like", value, "message");
			return this;
		}

		public Criteria andMessageIn(List<String> values) {
			addCriterion("message in", values, "message");
			return this;
		}

		public Criteria andMessageNotIn(List<String> values) {
			addCriterion("message not in", values, "message");
			return this;
		}

		public Criteria andMessageBetween(String value1, String value2) {
			addCriterion("message between", value1, value2, "message");
			return this;
		}

		public Criteria andMessageNotBetween(String value1, String value2) {
			addCriterion("message not between", value1, value2, "message");
			return this;
		}

		public Criteria andTelephoneIsNull() {
			addCriterion("telephone is null");
			return this;
		}

		public Criteria andTelephoneIsNotNull() {
			addCriterion("telephone is not null");
			return this;
		}

		public Criteria andTelephoneEqualTo(String value) {
			addCriterion("telephone =", value, "telephone");
			return this;
		}

		public Criteria andTelephoneNotEqualTo(String value) {
			addCriterion("telephone <>", value, "telephone");
			return this;
		}

		public Criteria andTelephoneGreaterThan(String value) {
			addCriterion("telephone >", value, "telephone");
			return this;
		}

		public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
			addCriterion("telephone >=", value, "telephone");
			return this;
		}

		public Criteria andTelephoneLessThan(String value) {
			addCriterion("telephone <", value, "telephone");
			return this;
		}

		public Criteria andTelephoneLessThanOrEqualTo(String value) {
			addCriterion("telephone <=", value, "telephone");
			return this;
		}

		public Criteria andTelephoneLike(String value) {
			addCriterion("telephone like", value, "telephone");
			return this;
		}

		public Criteria andTelephoneNotLike(String value) {
			addCriterion("telephone not like", value, "telephone");
			return this;
		}

		public Criteria andTelephoneIn(List<String> values) {
			addCriterion("telephone in", values, "telephone");
			return this;
		}

		public Criteria andTelephoneNotIn(List<String> values) {
			addCriterion("telephone not in", values, "telephone");
			return this;
		}

		public Criteria andTelephoneBetween(String value1, String value2) {
			addCriterion("telephone between", value1, value2, "telephone");
			return this;
		}

		public Criteria andTelephoneNotBetween(String value1, String value2) {
			addCriterion("telephone not between", value1, value2, "telephone");
			return this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return this;
		}

		public Criteria andLeaveTimeIsNull() {
			addCriterion("leave_time is null");
			return this;
		}

		public Criteria andLeaveTimeIsNotNull() {
			addCriterion("leave_time is not null");
			return this;
		}

		public Criteria andLeaveTimeEqualTo(Date value) {
			addCriterion("leave_time =", value, "leaveTime");
			return this;
		}

		public Criteria andLeaveTimeNotEqualTo(Date value) {
			addCriterion("leave_time <>", value, "leaveTime");
			return this;
		}

		public Criteria andLeaveTimeGreaterThan(Date value) {
			addCriterion("leave_time >", value, "leaveTime");
			return this;
		}

		public Criteria andLeaveTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("leave_time >=", value, "leaveTime");
			return this;
		}

		public Criteria andLeaveTimeLessThan(Date value) {
			addCriterion("leave_time <", value, "leaveTime");
			return this;
		}

		public Criteria andLeaveTimeLessThanOrEqualTo(Date value) {
			addCriterion("leave_time <=", value, "leaveTime");
			return this;
		}

		public Criteria andLeaveTimeIn(List<Date> values) {
			addCriterion("leave_time in", values, "leaveTime");
			return this;
		}

		public Criteria andLeaveTimeNotIn(List<Date> values) {
			addCriterion("leave_time not in", values, "leaveTime");
			return this;
		}

		public Criteria andLeaveTimeBetween(Date value1, Date value2) {
			addCriterion("leave_time between", value1, value2, "leaveTime");
			return this;
		}

		public Criteria andLeaveTimeNotBetween(Date value1, Date value2) {
			addCriterion("leave_time not between", value1, value2, "leaveTime");
			return this;
		}
	}
}