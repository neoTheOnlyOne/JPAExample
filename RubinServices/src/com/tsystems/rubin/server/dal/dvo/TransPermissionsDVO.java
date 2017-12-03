/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.dvo.TransPermissions.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update:  Aug 11, 2009
 * 
 * Copyright © 2008 by T-Systems International GmbH, 
 * Frankfurt/Main
 * All rights, including that of the extracts pressure, 
 * photomechanical reproduction (including microscopy),
 * and the evaluation of databases, or similar
 * organizations, reserved.
 **/
package com.tsystems.rubin.server.dal.dvo;

import java.io.Serializable;

/**
 * The Class TransPermissionsDVO. - data value objects used in constructor query
 * expression for TransPermissions.
 */
public class TransPermissionsDVO implements Serializable {

	/** The Serial Verison UID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private Long id;

	/** The display security. */
	private String disSecurity;

	/** The update security. */
	private String updSecurity;

	/** The delete security. */
	private String delSecurity;

	/**
	 * Parameterized constructor.
	 * 
	 * @param id
	 * @param disSecurity
	 * @param updSecurity
	 * @param delSecurity
	 */
	public TransPermissionsDVO(Long id, String disSecurity, String updSecurity, String delSecurity) {
		this.id = id;
		this.disSecurity = disSecurity;
		this.updSecurity = updSecurity;
		this.delSecurity = delSecurity;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the disSecurity
	 */
	public String getDisSecurity() {
		return disSecurity;
	}

	/**
	 * @param disSecurity the disSecurity to set
	 */
	public void setDisSecurity(String disSecurity) {
		this.disSecurity = disSecurity;
	}

	/**
	 * @return the updSecurity
	 */
	public String getUpdSecurity() {
		return updSecurity;
	}

	/**
	 * @param updSecurity the updSecurity to set
	 */
	public void setUpdSecurity(String updSecurity) {
		this.updSecurity = updSecurity;
	}

	/**
	 * @return the delSecurity
	 */
	public String getDelSecurity() {
		return delSecurity;
	}

	/**
	 * @param delSecurity the delSecurity to set
	 */
	public void setDelSecurity(String delSecurity) {
		this.delSecurity = delSecurity;
	}
}
