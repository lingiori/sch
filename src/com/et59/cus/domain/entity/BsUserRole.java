package com.et59.cus.domain.entity;

public class BsUserRole {

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column bs_user_role.id
	 * @abatorgenerated
	 */
	private Integer id;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column bs_user_role.userid
	 * @abatorgenerated
	 */
	private String userid;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column bs_user_role.roleid
	 * @abatorgenerated
	 */
	private Integer roleid;

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column bs_user_role.id
	 * @return  the value of bs_user_role.id
	 * @abatorgenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column bs_user_role.id
	 * @param id  the value for bs_user_role.id
	 * @abatorgenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column bs_user_role.userid
	 * @return  the value of bs_user_role.userid
	 * @abatorgenerated
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column bs_user_role.userid
	 * @param userid  the value for bs_user_role.userid
	 * @abatorgenerated
	 */
	public void setUserid(String userid) {
		this.userid = userid == null ? null : userid.trim();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column bs_user_role.roleid
	 * @return  the value of bs_user_role.roleid
	 * @abatorgenerated
	 */
	public Integer getRoleid() {
		return roleid;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column bs_user_role.roleid
	 * @param roleid  the value for bs_user_role.roleid
	 * @abatorgenerated
	 */
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}
}