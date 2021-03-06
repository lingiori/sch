package com.et59.cus.domain.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BsOrderExample {

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database table bs_order
	 * @abatorgenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database table bs_order
	 * @abatorgenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_order
	 * @abatorgenerated
	 */
	public BsOrderExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_order
	 * @abatorgenerated
	 */
	protected BsOrderExample(BsOrderExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_order
	 * @abatorgenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_order
	 * @abatorgenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_order
	 * @abatorgenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_order
	 * @abatorgenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_order
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
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_order
	 * @abatorgenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_order
	 * @abatorgenerated
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Abator for iBATIS. This class corresponds to the database table bs_order
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

		public Criteria andOrderIdIsNull() {
			addCriterion("order_id is null");
			return this;
		}

		public Criteria andOrderIdIsNotNull() {
			addCriterion("order_id is not null");
			return this;
		}

		public Criteria andOrderIdEqualTo(String value) {
			addCriterion("order_id =", value, "orderId");
			return this;
		}

		public Criteria andOrderIdNotEqualTo(String value) {
			addCriterion("order_id <>", value, "orderId");
			return this;
		}

		public Criteria andOrderIdGreaterThan(String value) {
			addCriterion("order_id >", value, "orderId");
			return this;
		}

		public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
			addCriterion("order_id >=", value, "orderId");
			return this;
		}

		public Criteria andOrderIdLessThan(String value) {
			addCriterion("order_id <", value, "orderId");
			return this;
		}

		public Criteria andOrderIdLessThanOrEqualTo(String value) {
			addCriterion("order_id <=", value, "orderId");
			return this;
		}

		public Criteria andOrderIdLike(String value) {
			addCriterion("order_id like", value, "orderId");
			return this;
		}

		public Criteria andOrderIdNotLike(String value) {
			addCriterion("order_id not like", value, "orderId");
			return this;
		}

		public Criteria andOrderIdIn(List<String> values) {
			addCriterion("order_id in", values, "orderId");
			return this;
		}

		public Criteria andOrderIdNotIn(List<String> values) {
			addCriterion("order_id not in", values, "orderId");
			return this;
		}

		public Criteria andOrderIdBetween(String value1, String value2) {
			addCriterion("order_id between", value1, value2, "orderId");
			return this;
		}

		public Criteria andOrderIdNotBetween(String value1, String value2) {
			addCriterion("order_id not between", value1, value2, "orderId");
			return this;
		}

		public Criteria andOrderStatusIsNull() {
			addCriterion("order_status is null");
			return this;
		}

		public Criteria andOrderStatusIsNotNull() {
			addCriterion("order_status is not null");
			return this;
		}

		public Criteria andOrderStatusEqualTo(Integer value) {
			addCriterion("order_status =", value, "orderStatus");
			return this;
		}

		public Criteria andOrderStatusNotEqualTo(Integer value) {
			addCriterion("order_status <>", value, "orderStatus");
			return this;
		}

		public Criteria andOrderStatusGreaterThan(Integer value) {
			addCriterion("order_status >", value, "orderStatus");
			return this;
		}

		public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("order_status >=", value, "orderStatus");
			return this;
		}

		public Criteria andOrderStatusLessThan(Integer value) {
			addCriterion("order_status <", value, "orderStatus");
			return this;
		}

		public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
			addCriterion("order_status <=", value, "orderStatus");
			return this;
		}

		public Criteria andOrderStatusIn(List<Integer> values) {
			addCriterion("order_status in", values, "orderStatus");
			return this;
		}

		public Criteria andOrderStatusNotIn(List<Integer> values) {
			addCriterion("order_status not in", values, "orderStatus");
			return this;
		}

		public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
			addCriterion("order_status between", value1, value2, "orderStatus");
			return this;
		}

		public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("order_status not between", value1, value2,
					"orderStatus");
			return this;
		}

		public Criteria andOrderCreateTimeIsNull() {
			addCriterion("order_create_time is null");
			return this;
		}

		public Criteria andOrderCreateTimeIsNotNull() {
			addCriterion("order_create_time is not null");
			return this;
		}

		public Criteria andOrderCreateTimeEqualTo(Date value) {
			addCriterion("order_create_time =", value, "orderCreateTime");
			return this;
		}

		public Criteria andOrderCreateTimeNotEqualTo(Date value) {
			addCriterion("order_create_time <>", value, "orderCreateTime");
			return this;
		}

		public Criteria andOrderCreateTimeGreaterThan(Date value) {
			addCriterion("order_create_time >", value, "orderCreateTime");
			return this;
		}

		public Criteria andOrderCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("order_create_time >=", value, "orderCreateTime");
			return this;
		}

		public Criteria andOrderCreateTimeLessThan(Date value) {
			addCriterion("order_create_time <", value, "orderCreateTime");
			return this;
		}

		public Criteria andOrderCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("order_create_time <=", value, "orderCreateTime");
			return this;
		}

		public Criteria andOrderCreateTimeIn(List<Date> values) {
			addCriterion("order_create_time in", values, "orderCreateTime");
			return this;
		}

		public Criteria andOrderCreateTimeNotIn(List<Date> values) {
			addCriterion("order_create_time not in", values, "orderCreateTime");
			return this;
		}

		public Criteria andOrderCreateTimeBetween(Date value1, Date value2) {
			addCriterion("order_create_time between", value1, value2,
					"orderCreateTime");
			return this;
		}

		public Criteria andOrderCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("order_create_time not between", value1, value2,
					"orderCreateTime");
			return this;
		}

		public Criteria andOrderUpdateTimeIsNull() {
			addCriterion("order_update_time is null");
			return this;
		}

		public Criteria andOrderUpdateTimeIsNotNull() {
			addCriterion("order_update_time is not null");
			return this;
		}

		public Criteria andOrderUpdateTimeEqualTo(Date value) {
			addCriterion("order_update_time =", value, "orderUpdateTime");
			return this;
		}

		public Criteria andOrderUpdateTimeNotEqualTo(Date value) {
			addCriterion("order_update_time <>", value, "orderUpdateTime");
			return this;
		}

		public Criteria andOrderUpdateTimeGreaterThan(Date value) {
			addCriterion("order_update_time >", value, "orderUpdateTime");
			return this;
		}

		public Criteria andOrderUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("order_update_time >=", value, "orderUpdateTime");
			return this;
		}

		public Criteria andOrderUpdateTimeLessThan(Date value) {
			addCriterion("order_update_time <", value, "orderUpdateTime");
			return this;
		}

		public Criteria andOrderUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterion("order_update_time <=", value, "orderUpdateTime");
			return this;
		}

		public Criteria andOrderUpdateTimeIn(List<Date> values) {
			addCriterion("order_update_time in", values, "orderUpdateTime");
			return this;
		}

		public Criteria andOrderUpdateTimeNotIn(List<Date> values) {
			addCriterion("order_update_time not in", values, "orderUpdateTime");
			return this;
		}

		public Criteria andOrderUpdateTimeBetween(Date value1, Date value2) {
			addCriterion("order_update_time between", value1, value2,
					"orderUpdateTime");
			return this;
		}

		public Criteria andOrderUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterion("order_update_time not between", value1, value2,
					"orderUpdateTime");
			return this;
		}

		public Criteria andOrderTotalPriceIsNull() {
			addCriterion("order_total_price is null");
			return this;
		}

		public Criteria andOrderTotalPriceIsNotNull() {
			addCriterion("order_total_price is not null");
			return this;
		}

		public Criteria andOrderTotalPriceEqualTo(BigDecimal value) {
			addCriterion("order_total_price =", value, "orderTotalPrice");
			return this;
		}

		public Criteria andOrderTotalPriceNotEqualTo(BigDecimal value) {
			addCriterion("order_total_price <>", value, "orderTotalPrice");
			return this;
		}

		public Criteria andOrderTotalPriceGreaterThan(BigDecimal value) {
			addCriterion("order_total_price >", value, "orderTotalPrice");
			return this;
		}

		public Criteria andOrderTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("order_total_price >=", value, "orderTotalPrice");
			return this;
		}

		public Criteria andOrderTotalPriceLessThan(BigDecimal value) {
			addCriterion("order_total_price <", value, "orderTotalPrice");
			return this;
		}

		public Criteria andOrderTotalPriceLessThanOrEqualTo(BigDecimal value) {
			addCriterion("order_total_price <=", value, "orderTotalPrice");
			return this;
		}

		public Criteria andOrderTotalPriceIn(List<BigDecimal> values) {
			addCriterion("order_total_price in", values, "orderTotalPrice");
			return this;
		}

		public Criteria andOrderTotalPriceNotIn(List<BigDecimal> values) {
			addCriterion("order_total_price not in", values, "orderTotalPrice");
			return this;
		}

		public Criteria andOrderTotalPriceBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("order_total_price between", value1, value2,
					"orderTotalPrice");
			return this;
		}

		public Criteria andOrderTotalPriceNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("order_total_price not between", value1, value2,
					"orderTotalPrice");
			return this;
		}

		public Criteria andProductNumberIsNull() {
			addCriterion("product_number is null");
			return this;
		}

		public Criteria andProductNumberIsNotNull() {
			addCriterion("product_number is not null");
			return this;
		}

		public Criteria andProductNumberEqualTo(Integer value) {
			addCriterion("product_number =", value, "productNumber");
			return this;
		}

		public Criteria andProductNumberNotEqualTo(Integer value) {
			addCriterion("product_number <>", value, "productNumber");
			return this;
		}

		public Criteria andProductNumberGreaterThan(Integer value) {
			addCriterion("product_number >", value, "productNumber");
			return this;
		}

		public Criteria andProductNumberGreaterThanOrEqualTo(Integer value) {
			addCriterion("product_number >=", value, "productNumber");
			return this;
		}

		public Criteria andProductNumberLessThan(Integer value) {
			addCriterion("product_number <", value, "productNumber");
			return this;
		}

		public Criteria andProductNumberLessThanOrEqualTo(Integer value) {
			addCriterion("product_number <=", value, "productNumber");
			return this;
		}

		public Criteria andProductNumberIn(List<Integer> values) {
			addCriterion("product_number in", values, "productNumber");
			return this;
		}

		public Criteria andProductNumberNotIn(List<Integer> values) {
			addCriterion("product_number not in", values, "productNumber");
			return this;
		}

		public Criteria andProductNumberBetween(Integer value1, Integer value2) {
			addCriterion("product_number between", value1, value2,
					"productNumber");
			return this;
		}

		public Criteria andProductNumberNotBetween(Integer value1,
				Integer value2) {
			addCriterion("product_number not between", value1, value2,
					"productNumber");
			return this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return this;
		}

		public Criteria andUserIdEqualTo(String value) {
			addCriterion("user_id =", value, "userId");
			return this;
		}

		public Criteria andUserIdNotEqualTo(String value) {
			addCriterion("user_id <>", value, "userId");
			return this;
		}

		public Criteria andUserIdGreaterThan(String value) {
			addCriterion("user_id >", value, "userId");
			return this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(String value) {
			addCriterion("user_id >=", value, "userId");
			return this;
		}

		public Criteria andUserIdLessThan(String value) {
			addCriterion("user_id <", value, "userId");
			return this;
		}

		public Criteria andUserIdLessThanOrEqualTo(String value) {
			addCriterion("user_id <=", value, "userId");
			return this;
		}

		public Criteria andUserIdLike(String value) {
			addCriterion("user_id like", value, "userId");
			return this;
		}

		public Criteria andUserIdNotLike(String value) {
			addCriterion("user_id not like", value, "userId");
			return this;
		}

		public Criteria andUserIdIn(List<String> values) {
			addCriterion("user_id in", values, "userId");
			return this;
		}

		public Criteria andUserIdNotIn(List<String> values) {
			addCriterion("user_id not in", values, "userId");
			return this;
		}

		public Criteria andUserIdBetween(String value1, String value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return this;
		}

		public Criteria andUserIdNotBetween(String value1, String value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return this;
		}

		public Criteria andAddressIdIsNull() {
			addCriterion("address_id is null");
			return this;
		}

		public Criteria andAddressIdIsNotNull() {
			addCriterion("address_id is not null");
			return this;
		}

		public Criteria andAddressIdEqualTo(Long value) {
			addCriterion("address_id =", value, "addressId");
			return this;
		}

		public Criteria andAddressIdNotEqualTo(Long value) {
			addCriterion("address_id <>", value, "addressId");
			return this;
		}

		public Criteria andAddressIdGreaterThan(Long value) {
			addCriterion("address_id >", value, "addressId");
			return this;
		}

		public Criteria andAddressIdGreaterThanOrEqualTo(Long value) {
			addCriterion("address_id >=", value, "addressId");
			return this;
		}

		public Criteria andAddressIdLessThan(Long value) {
			addCriterion("address_id <", value, "addressId");
			return this;
		}

		public Criteria andAddressIdLessThanOrEqualTo(Long value) {
			addCriterion("address_id <=", value, "addressId");
			return this;
		}

		public Criteria andAddressIdIn(List<Long> values) {
			addCriterion("address_id in", values, "addressId");
			return this;
		}

		public Criteria andAddressIdNotIn(List<Long> values) {
			addCriterion("address_id not in", values, "addressId");
			return this;
		}

		public Criteria andAddressIdBetween(Long value1, Long value2) {
			addCriterion("address_id between", value1, value2, "addressId");
			return this;
		}

		public Criteria andAddressIdNotBetween(Long value1, Long value2) {
			addCriterion("address_id not between", value1, value2, "addressId");
			return this;
		}

		public Criteria andProductIdIsNull() {
			addCriterion("product_id is null");
			return this;
		}

		public Criteria andProductIdIsNotNull() {
			addCriterion("product_id is not null");
			return this;
		}

		public Criteria andProductIdEqualTo(Integer value) {
			addCriterion("product_id =", value, "productId");
			return this;
		}

		public Criteria andProductIdNotEqualTo(Integer value) {
			addCriterion("product_id <>", value, "productId");
			return this;
		}

		public Criteria andProductIdGreaterThan(Integer value) {
			addCriterion("product_id >", value, "productId");
			return this;
		}

		public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("product_id >=", value, "productId");
			return this;
		}

		public Criteria andProductIdLessThan(Integer value) {
			addCriterion("product_id <", value, "productId");
			return this;
		}

		public Criteria andProductIdLessThanOrEqualTo(Integer value) {
			addCriterion("product_id <=", value, "productId");
			return this;
		}

		public Criteria andProductIdIn(List<Integer> values) {
			addCriterion("product_id in", values, "productId");
			return this;
		}

		public Criteria andProductIdNotIn(List<Integer> values) {
			addCriterion("product_id not in", values, "productId");
			return this;
		}

		public Criteria andProductIdBetween(Integer value1, Integer value2) {
			addCriterion("product_id between", value1, value2, "productId");
			return this;
		}

		public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
			addCriterion("product_id not between", value1, value2, "productId");
			return this;
		}

		public Criteria andPayTradeNoIsNull() {
			addCriterion("pay_trade_no is null");
			return this;
		}

		public Criteria andPayTradeNoIsNotNull() {
			addCriterion("pay_trade_no is not null");
			return this;
		}

		public Criteria andPayTradeNoEqualTo(String value) {
			addCriterion("pay_trade_no =", value, "payTradeNo");
			return this;
		}

		public Criteria andPayTradeNoNotEqualTo(String value) {
			addCriterion("pay_trade_no <>", value, "payTradeNo");
			return this;
		}

		public Criteria andPayTradeNoGreaterThan(String value) {
			addCriterion("pay_trade_no >", value, "payTradeNo");
			return this;
		}

		public Criteria andPayTradeNoGreaterThanOrEqualTo(String value) {
			addCriterion("pay_trade_no >=", value, "payTradeNo");
			return this;
		}

		public Criteria andPayTradeNoLessThan(String value) {
			addCriterion("pay_trade_no <", value, "payTradeNo");
			return this;
		}

		public Criteria andPayTradeNoLessThanOrEqualTo(String value) {
			addCriterion("pay_trade_no <=", value, "payTradeNo");
			return this;
		}

		public Criteria andPayTradeNoLike(String value) {
			addCriterion("pay_trade_no like", value, "payTradeNo");
			return this;
		}

		public Criteria andPayTradeNoNotLike(String value) {
			addCriterion("pay_trade_no not like", value, "payTradeNo");
			return this;
		}

		public Criteria andPayTradeNoIn(List<String> values) {
			addCriterion("pay_trade_no in", values, "payTradeNo");
			return this;
		}

		public Criteria andPayTradeNoNotIn(List<String> values) {
			addCriterion("pay_trade_no not in", values, "payTradeNo");
			return this;
		}

		public Criteria andPayTradeNoBetween(String value1, String value2) {
			addCriterion("pay_trade_no between", value1, value2, "payTradeNo");
			return this;
		}

		public Criteria andPayTradeNoNotBetween(String value1, String value2) {
			addCriterion("pay_trade_no not between", value1, value2,
					"payTradeNo");
			return this;
		}
	}
}