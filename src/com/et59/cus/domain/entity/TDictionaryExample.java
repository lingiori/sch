package com.et59.cus.domain.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TDictionaryExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table t_dictionary
	 * @ibatorgenerated  Sun Feb 22 22:16:26 CST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table t_dictionary
	 * @ibatorgenerated  Sun Feb 22 22:16:26 CST 2015
	 */
	protected List oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_dictionary
	 * @ibatorgenerated  Sun Feb 22 22:16:26 CST 2015
	 */
	public TDictionaryExample() {
		oredCriteria = new ArrayList();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_dictionary
	 * @ibatorgenerated  Sun Feb 22 22:16:26 CST 2015
	 */
	protected TDictionaryExample(TDictionaryExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_dictionary
	 * @ibatorgenerated  Sun Feb 22 22:16:26 CST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_dictionary
	 * @ibatorgenerated  Sun Feb 22 22:16:26 CST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_dictionary
	 * @ibatorgenerated  Sun Feb 22 22:16:26 CST 2015
	 */
	public List getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_dictionary
	 * @ibatorgenerated  Sun Feb 22 22:16:26 CST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_dictionary
	 * @ibatorgenerated  Sun Feb 22 22:16:26 CST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_dictionary
	 * @ibatorgenerated  Sun Feb 22 22:16:26 CST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_dictionary
	 * @ibatorgenerated  Sun Feb 22 22:16:26 CST 2015
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table t_dictionary
	 * @ibatorgenerated  Sun Feb 22 22:16:26 CST 2015
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

		public Criteria andDictionaryidIsNull() {
			addCriterion("dictionaryid is null");
			return this;
		}

		public Criteria andDictionaryidIsNotNull() {
			addCriterion("dictionaryid is not null");
			return this;
		}

		public Criteria andDictionaryidEqualTo(Integer value) {
			addCriterion("dictionaryid =", value, "dictionaryid");
			return this;
		}

		public Criteria andDictionaryidNotEqualTo(Integer value) {
			addCriterion("dictionaryid <>", value, "dictionaryid");
			return this;
		}

		public Criteria andDictionaryidGreaterThan(Integer value) {
			addCriterion("dictionaryid >", value, "dictionaryid");
			return this;
		}

		public Criteria andDictionaryidGreaterThanOrEqualTo(Integer value) {
			addCriterion("dictionaryid >=", value, "dictionaryid");
			return this;
		}

		public Criteria andDictionaryidLessThan(Integer value) {
			addCriterion("dictionaryid <", value, "dictionaryid");
			return this;
		}

		public Criteria andDictionaryidLessThanOrEqualTo(Integer value) {
			addCriterion("dictionaryid <=", value, "dictionaryid");
			return this;
		}

		public Criteria andDictionaryidIn(List values) {
			addCriterion("dictionaryid in", values, "dictionaryid");
			return this;
		}

		public Criteria andDictionaryidNotIn(List values) {
			addCriterion("dictionaryid not in", values, "dictionaryid");
			return this;
		}

		public Criteria andDictionaryidBetween(Integer value1, Integer value2) {
			addCriterion("dictionaryid between", value1, value2, "dictionaryid");
			return this;
		}

		public Criteria andDictionaryidNotBetween(Integer value1, Integer value2) {
			addCriterion("dictionaryid not between", value1, value2,
					"dictionaryid");
			return this;
		}

		public Criteria andDictionarycodeIsNull() {
			addCriterion("dictionarycode is null");
			return this;
		}

		public Criteria andDictionarycodeIsNotNull() {
			addCriterion("dictionarycode is not null");
			return this;
		}

		public Criteria andDictionarycodeEqualTo(String value) {
			addCriterion("dictionarycode =", value, "dictionarycode");
			return this;
		}

		public Criteria andDictionarycodeNotEqualTo(String value) {
			addCriterion("dictionarycode <>", value, "dictionarycode");
			return this;
		}

		public Criteria andDictionarycodeGreaterThan(String value) {
			addCriterion("dictionarycode >", value, "dictionarycode");
			return this;
		}

		public Criteria andDictionarycodeGreaterThanOrEqualTo(String value) {
			addCriterion("dictionarycode >=", value, "dictionarycode");
			return this;
		}

		public Criteria andDictionarycodeLessThan(String value) {
			addCriterion("dictionarycode <", value, "dictionarycode");
			return this;
		}

		public Criteria andDictionarycodeLessThanOrEqualTo(String value) {
			addCriterion("dictionarycode <=", value, "dictionarycode");
			return this;
		}

		public Criteria andDictionarycodeLike(String value) {
			addCriterion("dictionarycode like", value, "dictionarycode");
			return this;
		}

		public Criteria andDictionarycodeNotLike(String value) {
			addCriterion("dictionarycode not like", value, "dictionarycode");
			return this;
		}

		public Criteria andDictionarycodeIn(List values) {
			addCriterion("dictionarycode in", values, "dictionarycode");
			return this;
		}

		public Criteria andDictionarycodeNotIn(List values) {
			addCriterion("dictionarycode not in", values, "dictionarycode");
			return this;
		}

		public Criteria andDictionarycodeBetween(String value1, String value2) {
			addCriterion("dictionarycode between", value1, value2,
					"dictionarycode");
			return this;
		}

		public Criteria andDictionarycodeNotBetween(String value1, String value2) {
			addCriterion("dictionarycode not between", value1, value2,
					"dictionarycode");
			return this;
		}

		public Criteria andDictionaryvalueIsNull() {
			addCriterion("dictionaryvalue is null");
			return this;
		}

		public Criteria andDictionaryvalueIsNotNull() {
			addCriterion("dictionaryvalue is not null");
			return this;
		}

		public Criteria andDictionaryvalueEqualTo(String value) {
			addCriterion("dictionaryvalue =", value, "dictionaryvalue");
			return this;
		}

		public Criteria andDictionaryvalueNotEqualTo(String value) {
			addCriterion("dictionaryvalue <>", value, "dictionaryvalue");
			return this;
		}

		public Criteria andDictionaryvalueGreaterThan(String value) {
			addCriterion("dictionaryvalue >", value, "dictionaryvalue");
			return this;
		}

		public Criteria andDictionaryvalueGreaterThanOrEqualTo(String value) {
			addCriterion("dictionaryvalue >=", value, "dictionaryvalue");
			return this;
		}

		public Criteria andDictionaryvalueLessThan(String value) {
			addCriterion("dictionaryvalue <", value, "dictionaryvalue");
			return this;
		}

		public Criteria andDictionaryvalueLessThanOrEqualTo(String value) {
			addCriterion("dictionaryvalue <=", value, "dictionaryvalue");
			return this;
		}

		public Criteria andDictionaryvalueLike(String value) {
			addCriterion("dictionaryvalue like", value, "dictionaryvalue");
			return this;
		}

		public Criteria andDictionaryvalueNotLike(String value) {
			addCriterion("dictionaryvalue not like", value, "dictionaryvalue");
			return this;
		}

		public Criteria andDictionaryvalueIn(List values) {
			addCriterion("dictionaryvalue in", values, "dictionaryvalue");
			return this;
		}

		public Criteria andDictionaryvalueNotIn(List values) {
			addCriterion("dictionaryvalue not in", values, "dictionaryvalue");
			return this;
		}

		public Criteria andDictionaryvalueBetween(String value1, String value2) {
			addCriterion("dictionaryvalue between", value1, value2,
					"dictionaryvalue");
			return this;
		}

		public Criteria andDictionaryvalueNotBetween(String value1,
				String value2) {
			addCriterion("dictionaryvalue not between", value1, value2,
					"dictionaryvalue");
			return this;
		}

		public Criteria andDictionarytypeIsNull() {
			addCriterion("dictionaryType is null");
			return this;
		}

		public Criteria andDictionarytypeIsNotNull() {
			addCriterion("dictionaryType is not null");
			return this;
		}

		public Criteria andDictionarytypeEqualTo(String value) {
			addCriterion("dictionaryType =", value, "dictionarytype");
			return this;
		}

		public Criteria andDictionarytypeNotEqualTo(String value) {
			addCriterion("dictionaryType <>", value, "dictionarytype");
			return this;
		}

		public Criteria andDictionarytypeGreaterThan(String value) {
			addCriterion("dictionaryType >", value, "dictionarytype");
			return this;
		}

		public Criteria andDictionarytypeGreaterThanOrEqualTo(String value) {
			addCriterion("dictionaryType >=", value, "dictionarytype");
			return this;
		}

		public Criteria andDictionarytypeLessThan(String value) {
			addCriterion("dictionaryType <", value, "dictionarytype");
			return this;
		}

		public Criteria andDictionarytypeLessThanOrEqualTo(String value) {
			addCriterion("dictionaryType <=", value, "dictionarytype");
			return this;
		}

		public Criteria andDictionarytypeLike(String value) {
			addCriterion("dictionaryType like", value, "dictionarytype");
			return this;
		}

		public Criteria andDictionarytypeNotLike(String value) {
			addCriterion("dictionaryType not like", value, "dictionarytype");
			return this;
		}

		public Criteria andDictionarytypeIn(List values) {
			addCriterion("dictionaryType in", values, "dictionarytype");
			return this;
		}

		public Criteria andDictionarytypeNotIn(List values) {
			addCriterion("dictionaryType not in", values, "dictionarytype");
			return this;
		}

		public Criteria andDictionarytypeBetween(String value1, String value2) {
			addCriterion("dictionaryType between", value1, value2,
					"dictionarytype");
			return this;
		}

		public Criteria andDictionarytypeNotBetween(String value1, String value2) {
			addCriterion("dictionaryType not between", value1, value2,
					"dictionarytype");
			return this;
		}

		public Criteria andDictionaryremarkIsNull() {
			addCriterion("dictionaryremark is null");
			return this;
		}

		public Criteria andDictionaryremarkIsNotNull() {
			addCriterion("dictionaryremark is not null");
			return this;
		}

		public Criteria andDictionaryremarkEqualTo(String value) {
			addCriterion("dictionaryremark =", value, "dictionaryremark");
			return this;
		}

		public Criteria andDictionaryremarkNotEqualTo(String value) {
			addCriterion("dictionaryremark <>", value, "dictionaryremark");
			return this;
		}

		public Criteria andDictionaryremarkGreaterThan(String value) {
			addCriterion("dictionaryremark >", value, "dictionaryremark");
			return this;
		}

		public Criteria andDictionaryremarkGreaterThanOrEqualTo(String value) {
			addCriterion("dictionaryremark >=", value, "dictionaryremark");
			return this;
		}

		public Criteria andDictionaryremarkLessThan(String value) {
			addCriterion("dictionaryremark <", value, "dictionaryremark");
			return this;
		}

		public Criteria andDictionaryremarkLessThanOrEqualTo(String value) {
			addCriterion("dictionaryremark <=", value, "dictionaryremark");
			return this;
		}

		public Criteria andDictionaryremarkLike(String value) {
			addCriterion("dictionaryremark like", value, "dictionaryremark");
			return this;
		}

		public Criteria andDictionaryremarkNotLike(String value) {
			addCriterion("dictionaryremark not like", value, "dictionaryremark");
			return this;
		}

		public Criteria andDictionaryremarkIn(List values) {
			addCriterion("dictionaryremark in", values, "dictionaryremark");
			return this;
		}

		public Criteria andDictionaryremarkNotIn(List values) {
			addCriterion("dictionaryremark not in", values, "dictionaryremark");
			return this;
		}

		public Criteria andDictionaryremarkBetween(String value1, String value2) {
			addCriterion("dictionaryremark between", value1, value2,
					"dictionaryremark");
			return this;
		}

		public Criteria andDictionaryremarkNotBetween(String value1,
				String value2) {
			addCriterion("dictionaryremark not between", value1, value2,
					"dictionaryremark");
			return this;
		}
	}
}