package com.et59.cus.domain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BsArticleExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table bs_article
	 * @ibatorgenerated  Fri Feb 06 14:14:16 CST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table bs_article
	 * @ibatorgenerated  Fri Feb 06 14:14:16 CST 2015
	 */
	protected List oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table bs_article
	 * @ibatorgenerated  Fri Feb 06 14:14:16 CST 2015
	 */
	public BsArticleExample() {
		oredCriteria = new ArrayList();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table bs_article
	 * @ibatorgenerated  Fri Feb 06 14:14:16 CST 2015
	 */
	protected BsArticleExample(BsArticleExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table bs_article
	 * @ibatorgenerated  Fri Feb 06 14:14:16 CST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table bs_article
	 * @ibatorgenerated  Fri Feb 06 14:14:16 CST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table bs_article
	 * @ibatorgenerated  Fri Feb 06 14:14:16 CST 2015
	 */
	public List getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table bs_article
	 * @ibatorgenerated  Fri Feb 06 14:14:16 CST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table bs_article
	 * @ibatorgenerated  Fri Feb 06 14:14:16 CST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table bs_article
	 * @ibatorgenerated  Fri Feb 06 14:14:16 CST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table bs_article
	 * @ibatorgenerated  Fri Feb 06 14:14:16 CST 2015
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table bs_article
	 * @ibatorgenerated  Fri Feb 06 14:14:16 CST 2015
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

		public Criteria andIdIn(List values) {
			addCriterion("id in", values, "id");
			return this;
		}

		public Criteria andIdNotIn(List values) {
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

		public Criteria andAuthorIsNull() {
			addCriterion("author is null");
			return this;
		}

		public Criteria andAuthorIsNotNull() {
			addCriterion("author is not null");
			return this;
		}

		public Criteria andAuthorEqualTo(String value) {
			addCriterion("author =", value, "author");
			return this;
		}

		public Criteria andAuthorNotEqualTo(String value) {
			addCriterion("author <>", value, "author");
			return this;
		}

		public Criteria andAuthorGreaterThan(String value) {
			addCriterion("author >", value, "author");
			return this;
		}

		public Criteria andAuthorGreaterThanOrEqualTo(String value) {
			addCriterion("author >=", value, "author");
			return this;
		}

		public Criteria andAuthorLessThan(String value) {
			addCriterion("author <", value, "author");
			return this;
		}

		public Criteria andAuthorLessThanOrEqualTo(String value) {
			addCriterion("author <=", value, "author");
			return this;
		}

		public Criteria andAuthorLike(String value) {
			addCriterion("author like", value, "author");
			return this;
		}

		public Criteria andAuthorNotLike(String value) {
			addCriterion("author not like", value, "author");
			return this;
		}

		public Criteria andAuthorIn(List values) {
			addCriterion("author in", values, "author");
			return this;
		}

		public Criteria andAuthorNotIn(List values) {
			addCriterion("author not in", values, "author");
			return this;
		}

		public Criteria andAuthorBetween(String value1, String value2) {
			addCriterion("author between", value1, value2, "author");
			return this;
		}

		public Criteria andAuthorNotBetween(String value1, String value2) {
			addCriterion("author not between", value1, value2, "author");
			return this;
		}

		public Criteria andCreatedateIsNull() {
			addCriterion("createdate is null");
			return this;
		}

		public Criteria andCreatedateIsNotNull() {
			addCriterion("createdate is not null");
			return this;
		}

		public Criteria andCreatedateEqualTo(Date value) {
			addCriterion("createdate =", value, "createdate");
			return this;
		}

		public Criteria andCreatedateNotEqualTo(Date value) {
			addCriterion("createdate <>", value, "createdate");
			return this;
		}

		public Criteria andCreatedateGreaterThan(Date value) {
			addCriterion("createdate >", value, "createdate");
			return this;
		}

		public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
			addCriterion("createdate >=", value, "createdate");
			return this;
		}

		public Criteria andCreatedateLessThan(Date value) {
			addCriterion("createdate <", value, "createdate");
			return this;
		}

		public Criteria andCreatedateLessThanOrEqualTo(Date value) {
			addCriterion("createdate <=", value, "createdate");
			return this;
		}

		public Criteria andCreatedateIn(List values) {
			addCriterion("createdate in", values, "createdate");
			return this;
		}

		public Criteria andCreatedateNotIn(List values) {
			addCriterion("createdate not in", values, "createdate");
			return this;
		}

		public Criteria andCreatedateBetween(Date value1, Date value2) {
			addCriterion("createdate between", value1, value2, "createdate");
			return this;
		}

		public Criteria andCreatedateNotBetween(Date value1, Date value2) {
			addCriterion("createdate not between", value1, value2, "createdate");
			return this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("type is null");
			return this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("type is not null");
			return this;
		}

		public Criteria andTypeEqualTo(String value) {
			addCriterion("type =", value, "type");
			return this;
		}

		public Criteria andTypeNotEqualTo(String value) {
			addCriterion("type <>", value, "type");
			return this;
		}

		public Criteria andTypeGreaterThan(String value) {
			addCriterion("type >", value, "type");
			return this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(String value) {
			addCriterion("type >=", value, "type");
			return this;
		}

		public Criteria andTypeLessThan(String value) {
			addCriterion("type <", value, "type");
			return this;
		}

		public Criteria andTypeLessThanOrEqualTo(String value) {
			addCriterion("type <=", value, "type");
			return this;
		}

		public Criteria andTypeLike(String value) {
			addCriterion("type like", value, "type");
			return this;
		}

		public Criteria andTypeNotLike(String value) {
			addCriterion("type not like", value, "type");
			return this;
		}

		public Criteria andTypeIn(List values) {
			addCriterion("type in", values, "type");
			return this;
		}

		public Criteria andTypeNotIn(List values) {
			addCriterion("type not in", values, "type");
			return this;
		}

		public Criteria andTypeBetween(String value1, String value2) {
			addCriterion("type between", value1, value2, "type");
			return this;
		}

		public Criteria andTypeNotBetween(String value1, String value2) {
			addCriterion("type not between", value1, value2, "type");
			return this;
		}

		public Criteria andSummaryIsNull() {
			addCriterion("summary is null");
			return this;
		}

		public Criteria andSummaryIsNotNull() {
			addCriterion("summary is not null");
			return this;
		}

		public Criteria andSummaryEqualTo(String value) {
			addCriterion("summary =", value, "summary");
			return this;
		}

		public Criteria andSummaryNotEqualTo(String value) {
			addCriterion("summary <>", value, "summary");
			return this;
		}

		public Criteria andSummaryGreaterThan(String value) {
			addCriterion("summary >", value, "summary");
			return this;
		}

		public Criteria andSummaryGreaterThanOrEqualTo(String value) {
			addCriterion("summary >=", value, "summary");
			return this;
		}

		public Criteria andSummaryLessThan(String value) {
			addCriterion("summary <", value, "summary");
			return this;
		}

		public Criteria andSummaryLessThanOrEqualTo(String value) {
			addCriterion("summary <=", value, "summary");
			return this;
		}

		public Criteria andSummaryLike(String value) {
			addCriterion("summary like", value, "summary");
			return this;
		}

		public Criteria andSummaryNotLike(String value) {
			addCriterion("summary not like", value, "summary");
			return this;
		}

		public Criteria andSummaryIn(List values) {
			addCriterion("summary in", values, "summary");
			return this;
		}

		public Criteria andSummaryNotIn(List values) {
			addCriterion("summary not in", values, "summary");
			return this;
		}

		public Criteria andSummaryBetween(String value1, String value2) {
			addCriterion("summary between", value1, value2, "summary");
			return this;
		}

		public Criteria andSummaryNotBetween(String value1, String value2) {
			addCriterion("summary not between", value1, value2, "summary");
			return this;
		}

		public Criteria andContentIsNull() {
			addCriterion("content is null");
			return this;
		}

		public Criteria andContentIsNotNull() {
			addCriterion("content is not null");
			return this;
		}

		public Criteria andContentEqualTo(String value) {
			addCriterion("content =", value, "content");
			return this;
		}

		public Criteria andContentNotEqualTo(String value) {
			addCriterion("content <>", value, "content");
			return this;
		}

		public Criteria andContentGreaterThan(String value) {
			addCriterion("content >", value, "content");
			return this;
		}

		public Criteria andContentGreaterThanOrEqualTo(String value) {
			addCriterion("content >=", value, "content");
			return this;
		}

		public Criteria andContentLessThan(String value) {
			addCriterion("content <", value, "content");
			return this;
		}

		public Criteria andContentLessThanOrEqualTo(String value) {
			addCriterion("content <=", value, "content");
			return this;
		}

		public Criteria andContentLike(String value) {
			addCriterion("content like", value, "content");
			return this;
		}

		public Criteria andContentNotLike(String value) {
			addCriterion("content not like", value, "content");
			return this;
		}

		public Criteria andContentIn(List values) {
			addCriterion("content in", values, "content");
			return this;
		}

		public Criteria andContentNotIn(List values) {
			addCriterion("content not in", values, "content");
			return this;
		}

		public Criteria andContentBetween(String value1, String value2) {
			addCriterion("content between", value1, value2, "content");
			return this;
		}

		public Criteria andContentNotBetween(String value1, String value2) {
			addCriterion("content not between", value1, value2, "content");
			return this;
		}

		public Criteria andUpdatedateIsNull() {
			addCriterion("updatedate is null");
			return this;
		}

		public Criteria andUpdatedateIsNotNull() {
			addCriterion("updatedate is not null");
			return this;
		}

		public Criteria andUpdatedateEqualTo(Date value) {
			addCriterion("updatedate =", value, "updatedate");
			return this;
		}

		public Criteria andUpdatedateNotEqualTo(Date value) {
			addCriterion("updatedate <>", value, "updatedate");
			return this;
		}

		public Criteria andUpdatedateGreaterThan(Date value) {
			addCriterion("updatedate >", value, "updatedate");
			return this;
		}

		public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
			addCriterion("updatedate >=", value, "updatedate");
			return this;
		}

		public Criteria andUpdatedateLessThan(Date value) {
			addCriterion("updatedate <", value, "updatedate");
			return this;
		}

		public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
			addCriterion("updatedate <=", value, "updatedate");
			return this;
		}

		public Criteria andUpdatedateIn(List values) {
			addCriterion("updatedate in", values, "updatedate");
			return this;
		}

		public Criteria andUpdatedateNotIn(List values) {
			addCriterion("updatedate not in", values, "updatedate");
			return this;
		}

		public Criteria andUpdatedateBetween(Date value1, Date value2) {
			addCriterion("updatedate between", value1, value2, "updatedate");
			return this;
		}

		public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
			addCriterion("updatedate not between", value1, value2, "updatedate");
			return this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return this;
		}

		public Criteria andTitleIn(List values) {
			addCriterion("title in", values, "title");
			return this;
		}

		public Criteria andTitleNotIn(List values) {
			addCriterion("title not in", values, "title");
			return this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
			return this;
		}

		public Criteria andNoticetargetIsNull() {
			addCriterion("noticetarget is null");
			return this;
		}

		public Criteria andNoticetargetIsNotNull() {
			addCriterion("noticetarget is not null");
			return this;
		}

		public Criteria andNoticetargetEqualTo(String value) {
			addCriterion("noticetarget =", value, "noticetarget");
			return this;
		}

		public Criteria andNoticetargetNotEqualTo(String value) {
			addCriterion("noticetarget <>", value, "noticetarget");
			return this;
		}

		public Criteria andNoticetargetGreaterThan(String value) {
			addCriterion("noticetarget >", value, "noticetarget");
			return this;
		}

		public Criteria andNoticetargetGreaterThanOrEqualTo(String value) {
			addCriterion("noticetarget >=", value, "noticetarget");
			return this;
		}

		public Criteria andNoticetargetLessThan(String value) {
			addCriterion("noticetarget <", value, "noticetarget");
			return this;
		}

		public Criteria andNoticetargetLessThanOrEqualTo(String value) {
			addCriterion("noticetarget <=", value, "noticetarget");
			return this;
		}

		public Criteria andNoticetargetLike(String value) {
			addCriterion("noticetarget like", value, "noticetarget");
			return this;
		}

		public Criteria andNoticetargetNotLike(String value) {
			addCriterion("noticetarget not like", value, "noticetarget");
			return this;
		}

		public Criteria andNoticetargetIn(List values) {
			addCriterion("noticetarget in", values, "noticetarget");
			return this;
		}

		public Criteria andNoticetargetNotIn(List values) {
			addCriterion("noticetarget not in", values, "noticetarget");
			return this;
		}

		public Criteria andNoticetargetBetween(String value1, String value2) {
			addCriterion("noticetarget between", value1, value2, "noticetarget");
			return this;
		}

		public Criteria andNoticetargetNotBetween(String value1, String value2) {
			addCriterion("noticetarget not between", value1, value2,
					"noticetarget");
			return this;
		}

		public Criteria andNoticeendtimeIsNull() {
			addCriterion("noticeendtime is null");
			return this;
		}

		public Criteria andNoticeendtimeIsNotNull() {
			addCriterion("noticeendtime is not null");
			return this;
		}

		public Criteria andNoticeendtimeEqualTo(String value) {
			addCriterion("noticeendtime =", value, "noticeendtime");
			return this;
		}

		public Criteria andNoticeendtimeNotEqualTo(String value) {
			addCriterion("noticeendtime <>", value, "noticeendtime");
			return this;
		}

		public Criteria andNoticeendtimeGreaterThan(String value) {
			addCriterion("noticeendtime >", value, "noticeendtime");
			return this;
		}

		public Criteria andNoticeendtimeGreaterThanOrEqualTo(String value) {
			addCriterion("noticeendtime >=", value, "noticeendtime");
			return this;
		}

		public Criteria andNoticeendtimeLessThan(String value) {
			addCriterion("noticeendtime <", value, "noticeendtime");
			return this;
		}

		public Criteria andNoticeendtimeLessThanOrEqualTo(String value) {
			addCriterion("noticeendtime <=", value, "noticeendtime");
			return this;
		}

		public Criteria andNoticeendtimeLike(String value) {
			addCriterion("noticeendtime like", value, "noticeendtime");
			return this;
		}

		public Criteria andNoticeendtimeNotLike(String value) {
			addCriterion("noticeendtime not like", value, "noticeendtime");
			return this;
		}

		public Criteria andNoticeendtimeIn(List values) {
			addCriterion("noticeendtime in", values, "noticeendtime");
			return this;
		}

		public Criteria andNoticeendtimeNotIn(List values) {
			addCriterion("noticeendtime not in", values, "noticeendtime");
			return this;
		}

		public Criteria andNoticeendtimeBetween(String value1, String value2) {
			addCriterion("noticeendtime between", value1, value2,
					"noticeendtime");
			return this;
		}

		public Criteria andNoticeendtimeNotBetween(String value1, String value2) {
			addCriterion("noticeendtime not between", value1, value2,
					"noticeendtime");
			return this;
		}

		public Criteria andNewspicIsNull() {
			addCriterion("newspic is null");
			return this;
		}

		public Criteria andNewspicIsNotNull() {
			addCriterion("newspic is not null");
			return this;
		}

		public Criteria andNewspicEqualTo(String value) {
			addCriterion("newspic =", value, "newspic");
			return this;
		}

		public Criteria andNewspicNotEqualTo(String value) {
			addCriterion("newspic <>", value, "newspic");
			return this;
		}

		public Criteria andNewspicGreaterThan(String value) {
			addCriterion("newspic >", value, "newspic");
			return this;
		}

		public Criteria andNewspicGreaterThanOrEqualTo(String value) {
			addCriterion("newspic >=", value, "newspic");
			return this;
		}

		public Criteria andNewspicLessThan(String value) {
			addCriterion("newspic <", value, "newspic");
			return this;
		}

		public Criteria andNewspicLessThanOrEqualTo(String value) {
			addCriterion("newspic <=", value, "newspic");
			return this;
		}

		public Criteria andNewspicLike(String value) {
			addCriterion("newspic like", value, "newspic");
			return this;
		}

		public Criteria andNewspicNotLike(String value) {
			addCriterion("newspic not like", value, "newspic");
			return this;
		}

		public Criteria andNewspicIn(List values) {
			addCriterion("newspic in", values, "newspic");
			return this;
		}

		public Criteria andNewspicNotIn(List values) {
			addCriterion("newspic not in", values, "newspic");
			return this;
		}

		public Criteria andNewspicBetween(String value1, String value2) {
			addCriterion("newspic between", value1, value2, "newspic");
			return this;
		}

		public Criteria andNewspicNotBetween(String value1, String value2) {
			addCriterion("newspic not between", value1, value2, "newspic");
			return this;
		}

		public Criteria andNewsisshowIsNull() {
			addCriterion("newsisshow is null");
			return this;
		}

		public Criteria andNewsisshowIsNotNull() {
			addCriterion("newsisshow is not null");
			return this;
		}

		public Criteria andNewsisshowEqualTo(String value) {
			addCriterion("newsisshow =", value, "newsisshow");
			return this;
		}

		public Criteria andNewsisshowNotEqualTo(String value) {
			addCriterion("newsisshow <>", value, "newsisshow");
			return this;
		}

		public Criteria andNewsisshowGreaterThan(String value) {
			addCriterion("newsisshow >", value, "newsisshow");
			return this;
		}

		public Criteria andNewsisshowGreaterThanOrEqualTo(String value) {
			addCriterion("newsisshow >=", value, "newsisshow");
			return this;
		}

		public Criteria andNewsisshowLessThan(String value) {
			addCriterion("newsisshow <", value, "newsisshow");
			return this;
		}

		public Criteria andNewsisshowLessThanOrEqualTo(String value) {
			addCriterion("newsisshow <=", value, "newsisshow");
			return this;
		}

		public Criteria andNewsisshowLike(String value) {
			addCriterion("newsisshow like", value, "newsisshow");
			return this;
		}

		public Criteria andNewsisshowNotLike(String value) {
			addCriterion("newsisshow not like", value, "newsisshow");
			return this;
		}

		public Criteria andNewsisshowIn(List values) {
			addCriterion("newsisshow in", values, "newsisshow");
			return this;
		}

		public Criteria andNewsisshowNotIn(List values) {
			addCriterion("newsisshow not in", values, "newsisshow");
			return this;
		}

		public Criteria andNewsisshowBetween(String value1, String value2) {
			addCriterion("newsisshow between", value1, value2, "newsisshow");
			return this;
		}

		public Criteria andNewsisshowNotBetween(String value1, String value2) {
			addCriterion("newsisshow not between", value1, value2, "newsisshow");
			return this;
		}

		public Criteria andDownloadidIsNull() {
			addCriterion("downloadid is null");
			return this;
		}

		public Criteria andDownloadidIsNotNull() {
			addCriterion("downloadid is not null");
			return this;
		}

		public Criteria andDownloadidEqualTo(Long value) {
			addCriterion("downloadid =", value, "downloadid");
			return this;
		}

		public Criteria andDownloadidNotEqualTo(Long value) {
			addCriterion("downloadid <>", value, "downloadid");
			return this;
		}

		public Criteria andDownloadidGreaterThan(Long value) {
			addCriterion("downloadid >", value, "downloadid");
			return this;
		}

		public Criteria andDownloadidGreaterThanOrEqualTo(Long value) {
			addCriterion("downloadid >=", value, "downloadid");
			return this;
		}

		public Criteria andDownloadidLessThan(Long value) {
			addCriterion("downloadid <", value, "downloadid");
			return this;
		}

		public Criteria andDownloadidLessThanOrEqualTo(Long value) {
			addCriterion("downloadid <=", value, "downloadid");
			return this;
		}

		public Criteria andDownloadidIn(List values) {
			addCriterion("downloadid in", values, "downloadid");
			return this;
		}

		public Criteria andDownloadidNotIn(List values) {
			addCriterion("downloadid not in", values, "downloadid");
			return this;
		}

		public Criteria andDownloadidBetween(Long value1, Long value2) {
			addCriterion("downloadid between", value1, value2, "downloadid");
			return this;
		}

		public Criteria andDownloadidNotBetween(Long value1, Long value2) {
			addCriterion("downloadid not between", value1, value2, "downloadid");
			return this;
		}
	}
}