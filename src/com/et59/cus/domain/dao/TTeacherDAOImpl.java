package com.et59.cus.domain.dao;

import com.et59.cus.domain.entity.TTeacher;
import com.et59.cus.domain.entity.TTeacherExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TTeacherDAOImpl extends SqlMapClientDaoSupport implements TTeacherDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_teacher
	 * @ibatorgenerated  Wed Jan 07 10:29:17 CST 2015
	 */
	public TTeacherDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_teacher
	 * @ibatorgenerated  Wed Jan 07 10:29:17 CST 2015
	 */
	public int countByExample(TTeacherExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"t_teacher.ibatorgenerated_countByExample", example);
		return count.intValue();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_teacher
	 * @ibatorgenerated  Wed Jan 07 10:29:17 CST 2015
	 */
	public int deleteByExample(TTeacherExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"t_teacher.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_teacher
	 * @ibatorgenerated  Wed Jan 07 10:29:17 CST 2015
	 */
	public int deleteByPrimaryKey(Long id) {
		TTeacher key = new TTeacher();
		key.setId(id);
		int rows = getSqlMapClientTemplate().delete(
				"t_teacher.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_teacher
	 * @ibatorgenerated  Wed Jan 07 10:29:17 CST 2015
	 */
	public void insert(TTeacher record) {
		getSqlMapClientTemplate().insert("t_teacher.ibatorgenerated_insert",
				record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_teacher
	 * @ibatorgenerated  Wed Jan 07 10:29:17 CST 2015
	 */
	public void insertSelective(TTeacher record) {
		getSqlMapClientTemplate().insert(
				"t_teacher.ibatorgenerated_insertSelective", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_teacher
	 * @ibatorgenerated  Wed Jan 07 10:29:17 CST 2015
	 */
	public List selectByExample(TTeacherExample example) {
		List list = getSqlMapClientTemplate().queryForList(
				"t_teacher.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_teacher
	 * @ibatorgenerated  Wed Jan 07 10:29:17 CST 2015
	 */
	public TTeacher selectByPrimaryKey(Long id) {
		TTeacher key = new TTeacher();
		key.setId(id);
		TTeacher record = (TTeacher) getSqlMapClientTemplate().queryForObject(
				"t_teacher.ibatorgenerated_selectByPrimaryKey", key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_teacher
	 * @ibatorgenerated  Wed Jan 07 10:29:17 CST 2015
	 */
	public int updateByExampleSelective(TTeacher record, TTeacherExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"t_teacher.ibatorgenerated_updateByExampleSelective", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_teacher
	 * @ibatorgenerated  Wed Jan 07 10:29:17 CST 2015
	 */
	public int updateByExample(TTeacher record, TTeacherExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"t_teacher.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_teacher
	 * @ibatorgenerated  Wed Jan 07 10:29:17 CST 2015
	 */
	public int updateByPrimaryKeySelective(TTeacher record) {
		int rows = getSqlMapClientTemplate()
				.update("t_teacher.ibatorgenerated_updateByPrimaryKeySelective",
						record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_teacher
	 * @ibatorgenerated  Wed Jan 07 10:29:17 CST 2015
	 */
	public int updateByPrimaryKey(TTeacher record) {
		int rows = getSqlMapClientTemplate().update(
				"t_teacher.ibatorgenerated_updateByPrimaryKey", record);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table t_teacher
	 * @ibatorgenerated  Wed Jan 07 10:29:17 CST 2015
	 */
	private static class UpdateByExampleParms extends TTeacherExample {
		private Object record;

		public UpdateByExampleParms(Object record, TTeacherExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}