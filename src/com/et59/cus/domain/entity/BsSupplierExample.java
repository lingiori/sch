package com.et59.cus.domain.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BsSupplierExample {

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database table bs_supplier
	 * @abatorgenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database table bs_supplier
	 * @abatorgenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_supplier
	 * @abatorgenerated
	 */
	public BsSupplierExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_supplier
	 * @abatorgenerated
	 */
	protected BsSupplierExample(BsSupplierExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_supplier
	 * @abatorgenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_supplier
	 * @abatorgenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_supplier
	 * @abatorgenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_supplier
	 * @abatorgenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_supplier
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
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_supplier
	 * @abatorgenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_supplier
	 * @abatorgenerated
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Abator for iBATIS. This class corresponds to the database table bs_supplier
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

		public Criteria andSupplierCodeIsNull() {
			addCriterion("supplier_code is null");
			return this;
		}

		public Criteria andSupplierCodeIsNotNull() {
			addCriterion("supplier_code is not null");
			return this;
		}

		public Criteria andSupplierCodeEqualTo(String value) {
			addCriterion("supplier_code =", value, "supplierCode");
			return this;
		}

		public Criteria andSupplierCodeNotEqualTo(String value) {
			addCriterion("supplier_code <>", value, "supplierCode");
			return this;
		}

		public Criteria andSupplierCodeGreaterThan(String value) {
			addCriterion("supplier_code >", value, "supplierCode");
			return this;
		}

		public Criteria andSupplierCodeGreaterThanOrEqualTo(String value) {
			addCriterion("supplier_code >=", value, "supplierCode");
			return this;
		}

		public Criteria andSupplierCodeLessThan(String value) {
			addCriterion("supplier_code <", value, "supplierCode");
			return this;
		}

		public Criteria andSupplierCodeLessThanOrEqualTo(String value) {
			addCriterion("supplier_code <=", value, "supplierCode");
			return this;
		}

		public Criteria andSupplierCodeLike(String value) {
			addCriterion("supplier_code like", value, "supplierCode");
			return this;
		}

		public Criteria andSupplierCodeNotLike(String value) {
			addCriterion("supplier_code not like", value, "supplierCode");
			return this;
		}

		public Criteria andSupplierCodeIn(List<String> values) {
			addCriterion("supplier_code in", values, "supplierCode");
			return this;
		}

		public Criteria andSupplierCodeNotIn(List<String> values) {
			addCriterion("supplier_code not in", values, "supplierCode");
			return this;
		}

		public Criteria andSupplierCodeBetween(String value1, String value2) {
			addCriterion("supplier_code between", value1, value2,
					"supplierCode");
			return this;
		}

		public Criteria andSupplierCodeNotBetween(String value1, String value2) {
			addCriterion("supplier_code not between", value1, value2,
					"supplierCode");
			return this;
		}

		public Criteria andSupplierNameIsNull() {
			addCriterion("supplier_name is null");
			return this;
		}

		public Criteria andSupplierNameIsNotNull() {
			addCriterion("supplier_name is not null");
			return this;
		}

		public Criteria andSupplierNameEqualTo(String value) {
			addCriterion("supplier_name =", value, "supplierName");
			return this;
		}

		public Criteria andSupplierNameNotEqualTo(String value) {
			addCriterion("supplier_name <>", value, "supplierName");
			return this;
		}

		public Criteria andSupplierNameGreaterThan(String value) {
			addCriterion("supplier_name >", value, "supplierName");
			return this;
		}

		public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
			addCriterion("supplier_name >=", value, "supplierName");
			return this;
		}

		public Criteria andSupplierNameLessThan(String value) {
			addCriterion("supplier_name <", value, "supplierName");
			return this;
		}

		public Criteria andSupplierNameLessThanOrEqualTo(String value) {
			addCriterion("supplier_name <=", value, "supplierName");
			return this;
		}

		public Criteria andSupplierNameLike(String value) {
			addCriterion("supplier_name like", value, "supplierName");
			return this;
		}

		public Criteria andSupplierNameNotLike(String value) {
			addCriterion("supplier_name not like", value, "supplierName");
			return this;
		}

		public Criteria andSupplierNameIn(List<String> values) {
			addCriterion("supplier_name in", values, "supplierName");
			return this;
		}

		public Criteria andSupplierNameNotIn(List<String> values) {
			addCriterion("supplier_name not in", values, "supplierName");
			return this;
		}

		public Criteria andSupplierNameBetween(String value1, String value2) {
			addCriterion("supplier_name between", value1, value2,
					"supplierName");
			return this;
		}

		public Criteria andSupplierNameNotBetween(String value1, String value2) {
			addCriterion("supplier_name not between", value1, value2,
					"supplierName");
			return this;
		}

		public Criteria andSupplierInfoIsNull() {
			addCriterion("supplier_info is null");
			return this;
		}

		public Criteria andSupplierInfoIsNotNull() {
			addCriterion("supplier_info is not null");
			return this;
		}

		public Criteria andSupplierInfoEqualTo(String value) {
			addCriterion("supplier_info =", value, "supplierInfo");
			return this;
		}

		public Criteria andSupplierInfoNotEqualTo(String value) {
			addCriterion("supplier_info <>", value, "supplierInfo");
			return this;
		}

		public Criteria andSupplierInfoGreaterThan(String value) {
			addCriterion("supplier_info >", value, "supplierInfo");
			return this;
		}

		public Criteria andSupplierInfoGreaterThanOrEqualTo(String value) {
			addCriterion("supplier_info >=", value, "supplierInfo");
			return this;
		}

		public Criteria andSupplierInfoLessThan(String value) {
			addCriterion("supplier_info <", value, "supplierInfo");
			return this;
		}

		public Criteria andSupplierInfoLessThanOrEqualTo(String value) {
			addCriterion("supplier_info <=", value, "supplierInfo");
			return this;
		}

		public Criteria andSupplierInfoLike(String value) {
			addCriterion("supplier_info like", value, "supplierInfo");
			return this;
		}

		public Criteria andSupplierInfoNotLike(String value) {
			addCriterion("supplier_info not like", value, "supplierInfo");
			return this;
		}

		public Criteria andSupplierInfoIn(List<String> values) {
			addCriterion("supplier_info in", values, "supplierInfo");
			return this;
		}

		public Criteria andSupplierInfoNotIn(List<String> values) {
			addCriterion("supplier_info not in", values, "supplierInfo");
			return this;
		}

		public Criteria andSupplierInfoBetween(String value1, String value2) {
			addCriterion("supplier_info between", value1, value2,
					"supplierInfo");
			return this;
		}

		public Criteria andSupplierInfoNotBetween(String value1, String value2) {
			addCriterion("supplier_info not between", value1, value2,
					"supplierInfo");
			return this;
		}

		public Criteria andSupplierUrlIsNull() {
			addCriterion("supplier_url is null");
			return this;
		}

		public Criteria andSupplierUrlIsNotNull() {
			addCriterion("supplier_url is not null");
			return this;
		}

		public Criteria andSupplierUrlEqualTo(String value) {
			addCriterion("supplier_url =", value, "supplierUrl");
			return this;
		}

		public Criteria andSupplierUrlNotEqualTo(String value) {
			addCriterion("supplier_url <>", value, "supplierUrl");
			return this;
		}

		public Criteria andSupplierUrlGreaterThan(String value) {
			addCriterion("supplier_url >", value, "supplierUrl");
			return this;
		}

		public Criteria andSupplierUrlGreaterThanOrEqualTo(String value) {
			addCriterion("supplier_url >=", value, "supplierUrl");
			return this;
		}

		public Criteria andSupplierUrlLessThan(String value) {
			addCriterion("supplier_url <", value, "supplierUrl");
			return this;
		}

		public Criteria andSupplierUrlLessThanOrEqualTo(String value) {
			addCriterion("supplier_url <=", value, "supplierUrl");
			return this;
		}

		public Criteria andSupplierUrlLike(String value) {
			addCriterion("supplier_url like", value, "supplierUrl");
			return this;
		}

		public Criteria andSupplierUrlNotLike(String value) {
			addCriterion("supplier_url not like", value, "supplierUrl");
			return this;
		}

		public Criteria andSupplierUrlIn(List<String> values) {
			addCriterion("supplier_url in", values, "supplierUrl");
			return this;
		}

		public Criteria andSupplierUrlNotIn(List<String> values) {
			addCriterion("supplier_url not in", values, "supplierUrl");
			return this;
		}

		public Criteria andSupplierUrlBetween(String value1, String value2) {
			addCriterion("supplier_url between", value1, value2, "supplierUrl");
			return this;
		}

		public Criteria andSupplierUrlNotBetween(String value1, String value2) {
			addCriterion("supplier_url not between", value1, value2,
					"supplierUrl");
			return this;
		}

		public Criteria andContactnameIsNull() {
			addCriterion("contactname is null");
			return this;
		}

		public Criteria andContactnameIsNotNull() {
			addCriterion("contactname is not null");
			return this;
		}

		public Criteria andContactnameEqualTo(String value) {
			addCriterion("contactname =", value, "contactname");
			return this;
		}

		public Criteria andContactnameNotEqualTo(String value) {
			addCriterion("contactname <>", value, "contactname");
			return this;
		}

		public Criteria andContactnameGreaterThan(String value) {
			addCriterion("contactname >", value, "contactname");
			return this;
		}

		public Criteria andContactnameGreaterThanOrEqualTo(String value) {
			addCriterion("contactname >=", value, "contactname");
			return this;
		}

		public Criteria andContactnameLessThan(String value) {
			addCriterion("contactname <", value, "contactname");
			return this;
		}

		public Criteria andContactnameLessThanOrEqualTo(String value) {
			addCriterion("contactname <=", value, "contactname");
			return this;
		}

		public Criteria andContactnameLike(String value) {
			addCriterion("contactname like", value, "contactname");
			return this;
		}

		public Criteria andContactnameNotLike(String value) {
			addCriterion("contactname not like", value, "contactname");
			return this;
		}

		public Criteria andContactnameIn(List<String> values) {
			addCriterion("contactname in", values, "contactname");
			return this;
		}

		public Criteria andContactnameNotIn(List<String> values) {
			addCriterion("contactname not in", values, "contactname");
			return this;
		}

		public Criteria andContactnameBetween(String value1, String value2) {
			addCriterion("contactname between", value1, value2, "contactname");
			return this;
		}

		public Criteria andContactnameNotBetween(String value1, String value2) {
			addCriterion("contactname not between", value1, value2,
					"contactname");
			return this;
		}

		public Criteria andContactemailIsNull() {
			addCriterion("contactemail is null");
			return this;
		}

		public Criteria andContactemailIsNotNull() {
			addCriterion("contactemail is not null");
			return this;
		}

		public Criteria andContactemailEqualTo(String value) {
			addCriterion("contactemail =", value, "contactemail");
			return this;
		}

		public Criteria andContactemailNotEqualTo(String value) {
			addCriterion("contactemail <>", value, "contactemail");
			return this;
		}

		public Criteria andContactemailGreaterThan(String value) {
			addCriterion("contactemail >", value, "contactemail");
			return this;
		}

		public Criteria andContactemailGreaterThanOrEqualTo(String value) {
			addCriterion("contactemail >=", value, "contactemail");
			return this;
		}

		public Criteria andContactemailLessThan(String value) {
			addCriterion("contactemail <", value, "contactemail");
			return this;
		}

		public Criteria andContactemailLessThanOrEqualTo(String value) {
			addCriterion("contactemail <=", value, "contactemail");
			return this;
		}

		public Criteria andContactemailLike(String value) {
			addCriterion("contactemail like", value, "contactemail");
			return this;
		}

		public Criteria andContactemailNotLike(String value) {
			addCriterion("contactemail not like", value, "contactemail");
			return this;
		}

		public Criteria andContactemailIn(List<String> values) {
			addCriterion("contactemail in", values, "contactemail");
			return this;
		}

		public Criteria andContactemailNotIn(List<String> values) {
			addCriterion("contactemail not in", values, "contactemail");
			return this;
		}

		public Criteria andContactemailBetween(String value1, String value2) {
			addCriterion("contactemail between", value1, value2, "contactemail");
			return this;
		}

		public Criteria andContactemailNotBetween(String value1, String value2) {
			addCriterion("contactemail not between", value1, value2,
					"contactemail");
			return this;
		}

		public Criteria andContactphoneIsNull() {
			addCriterion("contactphone is null");
			return this;
		}

		public Criteria andContactphoneIsNotNull() {
			addCriterion("contactphone is not null");
			return this;
		}

		public Criteria andContactphoneEqualTo(String value) {
			addCriterion("contactphone =", value, "contactphone");
			return this;
		}

		public Criteria andContactphoneNotEqualTo(String value) {
			addCriterion("contactphone <>", value, "contactphone");
			return this;
		}

		public Criteria andContactphoneGreaterThan(String value) {
			addCriterion("contactphone >", value, "contactphone");
			return this;
		}

		public Criteria andContactphoneGreaterThanOrEqualTo(String value) {
			addCriterion("contactphone >=", value, "contactphone");
			return this;
		}

		public Criteria andContactphoneLessThan(String value) {
			addCriterion("contactphone <", value, "contactphone");
			return this;
		}

		public Criteria andContactphoneLessThanOrEqualTo(String value) {
			addCriterion("contactphone <=", value, "contactphone");
			return this;
		}

		public Criteria andContactphoneLike(String value) {
			addCriterion("contactphone like", value, "contactphone");
			return this;
		}

		public Criteria andContactphoneNotLike(String value) {
			addCriterion("contactphone not like", value, "contactphone");
			return this;
		}

		public Criteria andContactphoneIn(List<String> values) {
			addCriterion("contactphone in", values, "contactphone");
			return this;
		}

		public Criteria andContactphoneNotIn(List<String> values) {
			addCriterion("contactphone not in", values, "contactphone");
			return this;
		}

		public Criteria andContactphoneBetween(String value1, String value2) {
			addCriterion("contactphone between", value1, value2, "contactphone");
			return this;
		}

		public Criteria andContactphoneNotBetween(String value1, String value2) {
			addCriterion("contactphone not between", value1, value2,
					"contactphone");
			return this;
		}
	}
}