package com.et59.cus.domain.entity;

public class BsRole {

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column bs_role.id
	 * @abatorgenerated
	 */
	private Integer id;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column bs_role.isactive
	 * @abatorgenerated
	 */
	private String isactive;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column bs_role.name
	 * @abatorgenerated
	 */
	private String name;

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column bs_role.id
	 * @return  the value of bs_role.id
	 * @abatorgenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column bs_role.id
	 * @param id  the value for bs_role.id
	 * @abatorgenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column bs_role.isactive
	 * @return  the value of bs_role.isactive
	 * @abatorgenerated
	 */
	public String getIsactive() {
		return isactive;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column bs_role.isactive
	 * @param isactive  the value for bs_role.isactive
	 * @abatorgenerated
	 */
	public void setIsactive(String isactive) {
		this.isactive = isactive == null ? null : isactive.trim();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column bs_role.name
	 * @return  the value of bs_role.name
	 * @abatorgenerated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column bs_role.name
	 * @param name  the value for bs_role.name
	 * @abatorgenerated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}
}