package com.et59.cus.domain.entity;

import java.util.Date;

public class TjActiontime {

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column tj_actiontime.id
	 * @abatorgenerated
	 */
	private Long id;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column tj_actiontime.excute_time
	 * @abatorgenerated
	 */
	private Long excuteTime;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column tj_actiontime.action_method
	 * @abatorgenerated
	 */
	private String actionMethod;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column tj_actiontime.createtime
	 * @abatorgenerated
	 */
	private Date createtime;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column tj_actiontime.action_name
	 * @abatorgenerated
	 */
	private String actionName;

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column tj_actiontime.id
	 * @return  the value of tj_actiontime.id
	 * @abatorgenerated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column tj_actiontime.id
	 * @param id  the value for tj_actiontime.id
	 * @abatorgenerated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column tj_actiontime.excute_time
	 * @return  the value of tj_actiontime.excute_time
	 * @abatorgenerated
	 */
	public Long getExcuteTime() {
		return excuteTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column tj_actiontime.excute_time
	 * @param excuteTime  the value for tj_actiontime.excute_time
	 * @abatorgenerated
	 */
	public void setExcuteTime(Long excuteTime) {
		this.excuteTime = excuteTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column tj_actiontime.action_method
	 * @return  the value of tj_actiontime.action_method
	 * @abatorgenerated
	 */
	public String getActionMethod() {
		return actionMethod;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column tj_actiontime.action_method
	 * @param actionMethod  the value for tj_actiontime.action_method
	 * @abatorgenerated
	 */
	public void setActionMethod(String actionMethod) {
		this.actionMethod = actionMethod == null ? null : actionMethod.trim();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column tj_actiontime.createtime
	 * @return  the value of tj_actiontime.createtime
	 * @abatorgenerated
	 */
	public Date getCreatetime() {
		return createtime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column tj_actiontime.createtime
	 * @param createtime  the value for tj_actiontime.createtime
	 * @abatorgenerated
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column tj_actiontime.action_name
	 * @return  the value of tj_actiontime.action_name
	 * @abatorgenerated
	 */
	public String getActionName() {
		return actionName;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column tj_actiontime.action_name
	 * @param actionName  the value for tj_actiontime.action_name
	 * @abatorgenerated
	 */
	public void setActionName(String actionName) {
		this.actionName = actionName == null ? null : actionName.trim();
	}
}