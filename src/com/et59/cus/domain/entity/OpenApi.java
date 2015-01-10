package com.et59.cus.domain.entity;

public class OpenApi {

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column open_api.id
	 * @abatorgenerated
	 */
	private Long id;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column open_api.text
	 * @abatorgenerated
	 */
	private String text;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column open_api.apiurl
	 * @abatorgenerated
	 */
	private String apiurl;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column open_api.apitype
	 * @abatorgenerated
	 */
	private String apitype;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column open_api.httptype
	 * @abatorgenerated
	 */
	private String httptype;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column open_api.parent
	 * @abatorgenerated
	 */
	private Long parent;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column open_api.apidesc
	 * @abatorgenerated
	 */
	private String apidesc;

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column open_api.id
	 * @return  the value of open_api.id
	 * @abatorgenerated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column open_api.id
	 * @param id  the value for open_api.id
	 * @abatorgenerated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column open_api.text
	 * @return  the value of open_api.text
	 * @abatorgenerated
	 */
	public String getText() {
		return text;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column open_api.text
	 * @param text  the value for open_api.text
	 * @abatorgenerated
	 */
	public void setText(String text) {
		this.text = text == null ? null : text.trim();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column open_api.apiurl
	 * @return  the value of open_api.apiurl
	 * @abatorgenerated
	 */
	public String getApiurl() {
		return apiurl;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column open_api.apiurl
	 * @param apiurl  the value for open_api.apiurl
	 * @abatorgenerated
	 */
	public void setApiurl(String apiurl) {
		this.apiurl = apiurl == null ? null : apiurl.trim();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column open_api.apitype
	 * @return  the value of open_api.apitype
	 * @abatorgenerated
	 */
	public String getApitype() {
		return apitype;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column open_api.apitype
	 * @param apitype  the value for open_api.apitype
	 * @abatorgenerated
	 */
	public void setApitype(String apitype) {
		this.apitype = apitype == null ? null : apitype.trim();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column open_api.httptype
	 * @return  the value of open_api.httptype
	 * @abatorgenerated
	 */
	public String getHttptype() {
		return httptype;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column open_api.httptype
	 * @param httptype  the value for open_api.httptype
	 * @abatorgenerated
	 */
	public void setHttptype(String httptype) {
		this.httptype = httptype == null ? null : httptype.trim();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column open_api.parent
	 * @return  the value of open_api.parent
	 * @abatorgenerated
	 */
	public Long getParent() {
		return parent;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column open_api.parent
	 * @param parent  the value for open_api.parent
	 * @abatorgenerated
	 */
	public void setParent(Long parent) {
		this.parent = parent;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column open_api.apidesc
	 * @return  the value of open_api.apidesc
	 * @abatorgenerated
	 */
	public String getApidesc() {
		return apidesc;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column open_api.apidesc
	 * @param apidesc  the value for open_api.apidesc
	 * @abatorgenerated
	 */
	public void setApidesc(String apidesc) {
		this.apidesc = apidesc == null ? null : apidesc.trim();
	}
}