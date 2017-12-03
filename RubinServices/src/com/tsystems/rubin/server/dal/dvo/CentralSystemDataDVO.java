/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.dvo.CentralSystemDataDVO.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update:  Aug 12, 2009
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
import java.sql.Date;

/**
 * This DVO object holds information from ZentraleSystemdat entity.
 */
public class CentralSystemDataDVO implements Serializable {
	
	/**
	 * The constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/** The  id */
	private Long id;
	
	/** The zent1. */
	private String zent1;
	
	/** The zent2. */
	private String zent2;
	
	/** The zent3. */
	private String zent3;
	
	/** The zent4. */
	private String zent4;
	/** The year */
	private Date year;
	
	
	/**
	 * Instantiates new CentralSystemDataDVO object.
	 */
	public CentralSystemDataDVO() {
		
	}
	
	/**
	 * Instantiates new CentralSystemDataDVO object.
	 * 
	 * @param zent1
	 * @param zent2
	 * @param zent3
	 * @param zent4
	 */
	public CentralSystemDataDVO(String zent1, String zent2, String zent3, String zent4) {
		this.zent1 = zent1;
		this.zent2 = zent2;
		this.zent3 = zent3;
		this.zent4 = zent4;
	}

	/**
	 * Instantiates new CentralSystemDataDVO object.
	 * 
	 * @param id
	 * @param zent2
	 * @param year
	 */
	public CentralSystemDataDVO(Long id, String zent2, Date year) {
		this.id=id;
		this.zent2 = zent2;
		this.year=year;
	}
	/**
	 * @return the zent1
	 */
	public String getZent1() {
		return zent1;
	}

	/**
	 * @param zent1 the zent1 to set
	 */
	public void setZent1(String zent1) {
		this.zent1 = zent1;
	}

	/**
	 * @return the zent2
	 */
	public String getZent2() {
		return zent2;
	}

	/**
	 * @param zent2 the zent2 to set
	 */
	public void setZent2(String zent2) {
		this.zent2 = zent2;
	}

	/**
	 * @return the zent3
	 */
	public String getZent3() {
		return zent3;
	}

	/**
	 * @param zent3 the zent3 to set
	 */
	public void setZent3(String zent3) {
		this.zent3 = zent3;
	}

	/**
	 * @return the zent4
	 */
	public String getZent4() {
		return zent4;
	}

	/**
	 * @param zent4 the zent4 to set
	 */
	public void setZent4(String zent4) {
		this.zent4 = zent4;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(Date year) {
		this.year = year;
	}

	/**
	 * @return the year
	 */
	public Date getYear() {
		return year;
	}
	
	
}
