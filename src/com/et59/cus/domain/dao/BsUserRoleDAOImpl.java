package com.et59.cus.domain.dao;

import com.et59.cus.domain.entity.BsUserRole;
import com.et59.cus.domain.entity.BsUserRoleExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class BsUserRoleDAOImpl extends SqlMapClientDaoSupport implements BsUserRoleDAO {

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user_role
	 * @abatorgenerated
	 */
	public BsUserRoleDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user_role
	 * @abatorgenerated
	 */
	public void insert(BsUserRole record) {
		getSqlMapClientTemplate().insert("bs_user_role.abatorgenerated_insert",
				record);
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user_role
	 * @abatorgenerated
	 */
	public int updateByPrimaryKey(BsUserRole record) {
		int rows = getSqlMapClientTemplate().update(
				"bs_user_role.abatorgenerated_updateByPrimaryKey", record);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user_role
	 * @abatorgenerated
	 */
	public int updateByPrimaryKeySelective(BsUserRole record) {
		int rows = getSqlMapClientTemplate().update(
				"bs_user_role.abatorgenerated_updateByPrimaryKeySelective",
				record);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user_role
	 * @abatorgenerated
	 */
	@SuppressWarnings("unchecked")
	public List<BsUserRole> selectByExample(BsUserRoleExample example) {
		List<BsUserRole> list = (List<BsUserRole>) getSqlMapClientTemplate()
				.queryForList("bs_user_role.abatorgenerated_selectByExample",
						example);
		return list;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user_role
	 * @abatorgenerated
	 */
	public BsUserRole selectByPrimaryKey(Integer id) {
		BsUserRole key = new BsUserRole();
		key.setId(id);
		BsUserRole record = (BsUserRole) getSqlMapClientTemplate()
				.queryForObject(
						"bs_user_role.abatorgenerated_selectByPrimaryKey", key);
		return record;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user_role
	 * @abatorgenerated
	 */
	public int deleteByExample(BsUserRoleExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"bs_user_role.abatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user_role
	 * @abatorgenerated
	 */
	public int deleteByPrimaryKey(Integer id) {
		BsUserRole key = new BsUserRole();
		key.setId(id);
		int rows = getSqlMapClientTemplate().delete(
				"bs_user_role.abatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user_role
	 * @abatorgenerated
	 */
	public int countByExample(BsUserRoleExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"bs_user_role.abatorgenerated_countByExample", example);
		return count;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user_role
	 * @abatorgenerated
	 */
	public int updateByExampleSelective(BsUserRole record,
			BsUserRoleExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"bs_user_role.abatorgenerated_updateByExampleSelective", parms);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table bs_user_role
	 * @abatorgenerated
	 */
	public int updateByExample(BsUserRole record, BsUserRoleExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"bs_user_role.abatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This class was generated by Abator for iBATIS. This class corresponds to the database table bs_user_role
	 * @abatorgenerated
	 */
	private static class UpdateByExampleParms extends BsUserRoleExample {
		private Object record;

		public UpdateByExampleParms(Object record, BsUserRoleExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}