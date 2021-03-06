package com.et59.cus.domain.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BsUserExample {

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database table bs_user
	 * @abatorgenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database table bs_user
	 * @abatorgenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user
	 * @abatorgenerated
	 */
	public BsUserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user
	 * @abatorgenerated
	 */
	protected BsUserExample(BsUserExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user
	 * @abatorgenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user
	 * @abatorgenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user
	 * @abatorgenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user
	 * @abatorgenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user
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
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user
	 * @abatorgenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user
	 * @abatorgenerated
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Abator for iBATIS. This class corresponds to the database table bs_user
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

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return this;
		}

		public Criteria andUseridIsNull() {
			addCriterion("userid is null");
			return this;
		}

		public Criteria andUseridIsNotNull() {
			addCriterion("userid is not null");
			return this;
		}

		public Criteria andUseridEqualTo(String value) {
			addCriterion("userid =", value, "userid");
			return this;
		}

		public Criteria andUseridNotEqualTo(String value) {
			addCriterion("userid <>", value, "userid");
			return this;
		}

		public Criteria andUseridGreaterThan(String value) {
			addCriterion("userid >", value, "userid");
			return this;
		}

		public Criteria andUseridGreaterThanOrEqualTo(String value) {
			addCriterion("userid >=", value, "userid");
			return this;
		}

		public Criteria andUseridLessThan(String value) {
			addCriterion("userid <", value, "userid");
			return this;
		}

		public Criteria andUseridLessThanOrEqualTo(String value) {
			addCriterion("userid <=", value, "userid");
			return this;
		}

		public Criteria andUseridLike(String value) {
			addCriterion("userid like", value, "userid");
			return this;
		}

		public Criteria andUseridNotLike(String value) {
			addCriterion("userid not like", value, "userid");
			return this;
		}

		public Criteria andUseridIn(List<String> values) {
			addCriterion("userid in", values, "userid");
			return this;
		}

		public Criteria andUseridNotIn(List<String> values) {
			addCriterion("userid not in", values, "userid");
			return this;
		}

		public Criteria andUseridBetween(String value1, String value2) {
			addCriterion("userid between", value1, value2, "userid");
			return this;
		}

		public Criteria andUseridNotBetween(String value1, String value2) {
			addCriterion("userid not between", value1, value2, "userid");
			return this;
		}

		public Criteria andIccardIsNull() {
			addCriterion("iccard is null");
			return this;
		}

		public Criteria andIccardIsNotNull() {
			addCriterion("iccard is not null");
			return this;
		}

		public Criteria andIccardEqualTo(String value) {
			addCriterion("iccard =", value, "iccard");
			return this;
		}

		public Criteria andIccardNotEqualTo(String value) {
			addCriterion("iccard <>", value, "iccard");
			return this;
		}

		public Criteria andIccardGreaterThan(String value) {
			addCriterion("iccard >", value, "iccard");
			return this;
		}

		public Criteria andIccardGreaterThanOrEqualTo(String value) {
			addCriterion("iccard >=", value, "iccard");
			return this;
		}

		public Criteria andIccardLessThan(String value) {
			addCriterion("iccard <", value, "iccard");
			return this;
		}

		public Criteria andIccardLessThanOrEqualTo(String value) {
			addCriterion("iccard <=", value, "iccard");
			return this;
		}

		public Criteria andIccardLike(String value) {
			addCriterion("iccard like", value, "iccard");
			return this;
		}

		public Criteria andIccardNotLike(String value) {
			addCriterion("iccard not like", value, "iccard");
			return this;
		}

		public Criteria andIccardIn(List<String> values) {
			addCriterion("iccard in", values, "iccard");
			return this;
		}

		public Criteria andIccardNotIn(List<String> values) {
			addCriterion("iccard not in", values, "iccard");
			return this;
		}

		public Criteria andIccardBetween(String value1, String value2) {
			addCriterion("iccard between", value1, value2, "iccard");
			return this;
		}

		public Criteria andIccardNotBetween(String value1, String value2) {
			addCriterion("iccard not between", value1, value2, "iccard");
			return this;
		}

		public Criteria andUsernameIsNull() {
			addCriterion("username is null");
			return this;
		}

		public Criteria andUsernameIsNotNull() {
			addCriterion("username is not null");
			return this;
		}

		public Criteria andUsernameEqualTo(String value) {
			addCriterion("username =", value, "username");
			return this;
		}

		public Criteria andUsernameNotEqualTo(String value) {
			addCriterion("username <>", value, "username");
			return this;
		}

		public Criteria andUsernameGreaterThan(String value) {
			addCriterion("username >", value, "username");
			return this;
		}

		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("username >=", value, "username");
			return this;
		}

		public Criteria andUsernameLessThan(String value) {
			addCriterion("username <", value, "username");
			return this;
		}

		public Criteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("username <=", value, "username");
			return this;
		}

		public Criteria andUsernameLike(String value) {
			addCriterion("username like", value, "username");
			return this;
		}

		public Criteria andUsernameNotLike(String value) {
			addCriterion("username not like", value, "username");
			return this;
		}

		public Criteria andUsernameIn(List<String> values) {
			addCriterion("username in", values, "username");
			return this;
		}

		public Criteria andUsernameNotIn(List<String> values) {
			addCriterion("username not in", values, "username");
			return this;
		}

		public Criteria andUsernameBetween(String value1, String value2) {
			addCriterion("username between", value1, value2, "username");
			return this;
		}

		public Criteria andUsernameNotBetween(String value1, String value2) {
			addCriterion("username not between", value1, value2, "username");
			return this;
		}

		public Criteria andRealnameIsNull() {
			addCriterion("realname is null");
			return this;
		}

		public Criteria andRealnameIsNotNull() {
			addCriterion("realname is not null");
			return this;
		}

		public Criteria andRealnameEqualTo(String value) {
			addCriterion("realname =", value, "realname");
			return this;
		}

		public Criteria andRealnameNotEqualTo(String value) {
			addCriterion("realname <>", value, "realname");
			return this;
		}

		public Criteria andRealnameGreaterThan(String value) {
			addCriterion("realname >", value, "realname");
			return this;
		}

		public Criteria andRealnameGreaterThanOrEqualTo(String value) {
			addCriterion("realname >=", value, "realname");
			return this;
		}

		public Criteria andRealnameLessThan(String value) {
			addCriterion("realname <", value, "realname");
			return this;
		}

		public Criteria andRealnameLessThanOrEqualTo(String value) {
			addCriterion("realname <=", value, "realname");
			return this;
		}

		public Criteria andRealnameLike(String value) {
			addCriterion("realname like", value, "realname");
			return this;
		}

		public Criteria andRealnameNotLike(String value) {
			addCriterion("realname not like", value, "realname");
			return this;
		}

		public Criteria andRealnameIn(List<String> values) {
			addCriterion("realname in", values, "realname");
			return this;
		}

		public Criteria andRealnameNotIn(List<String> values) {
			addCriterion("realname not in", values, "realname");
			return this;
		}

		public Criteria andRealnameBetween(String value1, String value2) {
			addCriterion("realname between", value1, value2, "realname");
			return this;
		}

		public Criteria andRealnameNotBetween(String value1, String value2) {
			addCriterion("realname not between", value1, value2, "realname");
			return this;
		}

		public Criteria andMobilephoneIsNull() {
			addCriterion("mobilephone is null");
			return this;
		}

		public Criteria andMobilephoneIsNotNull() {
			addCriterion("mobilephone is not null");
			return this;
		}

		public Criteria andMobilephoneEqualTo(String value) {
			addCriterion("mobilephone =", value, "mobilephone");
			return this;
		}

		public Criteria andMobilephoneNotEqualTo(String value) {
			addCriterion("mobilephone <>", value, "mobilephone");
			return this;
		}

		public Criteria andMobilephoneGreaterThan(String value) {
			addCriterion("mobilephone >", value, "mobilephone");
			return this;
		}

		public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
			addCriterion("mobilephone >=", value, "mobilephone");
			return this;
		}

		public Criteria andMobilephoneLessThan(String value) {
			addCriterion("mobilephone <", value, "mobilephone");
			return this;
		}

		public Criteria andMobilephoneLessThanOrEqualTo(String value) {
			addCriterion("mobilephone <=", value, "mobilephone");
			return this;
		}

		public Criteria andMobilephoneLike(String value) {
			addCriterion("mobilephone like", value, "mobilephone");
			return this;
		}

		public Criteria andMobilephoneNotLike(String value) {
			addCriterion("mobilephone not like", value, "mobilephone");
			return this;
		}

		public Criteria andMobilephoneIn(List<String> values) {
			addCriterion("mobilephone in", values, "mobilephone");
			return this;
		}

		public Criteria andMobilephoneNotIn(List<String> values) {
			addCriterion("mobilephone not in", values, "mobilephone");
			return this;
		}

		public Criteria andMobilephoneBetween(String value1, String value2) {
			addCriterion("mobilephone between", value1, value2, "mobilephone");
			return this;
		}

		public Criteria andMobilephoneNotBetween(String value1, String value2) {
			addCriterion("mobilephone not between", value1, value2,
					"mobilephone");
			return this;
		}

		public Criteria andTokenidIsNull() {
			addCriterion("tokenid is null");
			return this;
		}

		public Criteria andTokenidIsNotNull() {
			addCriterion("tokenid is not null");
			return this;
		}

		public Criteria andTokenidEqualTo(String value) {
			addCriterion("tokenid =", value, "tokenid");
			return this;
		}

		public Criteria andTokenidNotEqualTo(String value) {
			addCriterion("tokenid <>", value, "tokenid");
			return this;
		}

		public Criteria andTokenidGreaterThan(String value) {
			addCriterion("tokenid >", value, "tokenid");
			return this;
		}

		public Criteria andTokenidGreaterThanOrEqualTo(String value) {
			addCriterion("tokenid >=", value, "tokenid");
			return this;
		}

		public Criteria andTokenidLessThan(String value) {
			addCriterion("tokenid <", value, "tokenid");
			return this;
		}

		public Criteria andTokenidLessThanOrEqualTo(String value) {
			addCriterion("tokenid <=", value, "tokenid");
			return this;
		}

		public Criteria andTokenidLike(String value) {
			addCriterion("tokenid like", value, "tokenid");
			return this;
		}

		public Criteria andTokenidNotLike(String value) {
			addCriterion("tokenid not like", value, "tokenid");
			return this;
		}

		public Criteria andTokenidIn(List<String> values) {
			addCriterion("tokenid in", values, "tokenid");
			return this;
		}

		public Criteria andTokenidNotIn(List<String> values) {
			addCriterion("tokenid not in", values, "tokenid");
			return this;
		}

		public Criteria andTokenidBetween(String value1, String value2) {
			addCriterion("tokenid between", value1, value2, "tokenid");
			return this;
		}

		public Criteria andTokenidNotBetween(String value1, String value2) {
			addCriterion("tokenid not between", value1, value2, "tokenid");
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

		public Criteria andIsadminIsNull() {
			addCriterion("isadmin is null");
			return this;
		}

		public Criteria andIsadminIsNotNull() {
			addCriterion("isadmin is not null");
			return this;
		}

		public Criteria andIsadminEqualTo(String value) {
			addCriterion("isadmin =", value, "isadmin");
			return this;
		}

		public Criteria andIsadminNotEqualTo(String value) {
			addCriterion("isadmin <>", value, "isadmin");
			return this;
		}

		public Criteria andIsadminGreaterThan(String value) {
			addCriterion("isadmin >", value, "isadmin");
			return this;
		}

		public Criteria andIsadminGreaterThanOrEqualTo(String value) {
			addCriterion("isadmin >=", value, "isadmin");
			return this;
		}

		public Criteria andIsadminLessThan(String value) {
			addCriterion("isadmin <", value, "isadmin");
			return this;
		}

		public Criteria andIsadminLessThanOrEqualTo(String value) {
			addCriterion("isadmin <=", value, "isadmin");
			return this;
		}

		public Criteria andIsadminLike(String value) {
			addCriterion("isadmin like", value, "isadmin");
			return this;
		}

		public Criteria andIsadminNotLike(String value) {
			addCriterion("isadmin not like", value, "isadmin");
			return this;
		}

		public Criteria andIsadminIn(List<String> values) {
			addCriterion("isadmin in", values, "isadmin");
			return this;
		}

		public Criteria andIsadminNotIn(List<String> values) {
			addCriterion("isadmin not in", values, "isadmin");
			return this;
		}

		public Criteria andIsadminBetween(String value1, String value2) {
			addCriterion("isadmin between", value1, value2, "isadmin");
			return this;
		}

		public Criteria andIsadminNotBetween(String value1, String value2) {
			addCriterion("isadmin not between", value1, value2, "isadmin");
			return this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("password is null");
			return this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("password is not null");
			return this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("password =", value, "password");
			return this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("password <>", value, "password");
			return this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("password >", value, "password");
			return this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("password >=", value, "password");
			return this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("password <", value, "password");
			return this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("password <=", value, "password");
			return this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("password like", value, "password");
			return this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("password not like", value, "password");
			return this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("password in", values, "password");
			return this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("password not in", values, "password");
			return this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("password between", value1, value2, "password");
			return this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("password not between", value1, value2, "password");
			return this;
		}
	}
}