package com.et59.cus.domain.dao;

import java.util.List;

import com.et59.cus.domain.entity.BsProduct;
import com.et59.cus.domain.entity.BsProductExample;

public interface BsProductDAO {

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_product
	 * @abatorgenerated
	 */
	void insert(BsProduct record);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_product
	 * @abatorgenerated
	 */
	int updateByPrimaryKey(BsProduct record);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_product
	 * @abatorgenerated
	 */
	int updateByPrimaryKeySelective(BsProduct record);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_product
	 * @abatorgenerated
	 */
	List<BsProduct> selectByExample(BsProductExample example);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_product
	 * @abatorgenerated
	 */
	BsProduct selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_product
	 * @abatorgenerated
	 */
	int deleteByExample(BsProductExample example);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_product
	 * @abatorgenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_product
	 * @abatorgenerated
	 */
	int countByExample(BsProductExample example);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_product
	 * @abatorgenerated
	 */
	int updateByExampleSelective(BsProduct record, BsProductExample example);

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_product
	 * @abatorgenerated
	 */
	int updateByExample(BsProduct record, BsProductExample example);
}