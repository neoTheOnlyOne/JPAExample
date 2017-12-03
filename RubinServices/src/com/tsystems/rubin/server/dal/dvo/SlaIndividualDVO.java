/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.dvo.SlaIndividualDVO.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update:  Aug 14, 2009
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

import com.tsystems.rubin.server.transmodservices.to.SlaTO;

/**
 * The Class SlaIndividualDVO. - data value objects used in constructor query expression
 * for <SlaIndividual>.
 */
public class SlaIndividualDVO implements Serializable{
	
	/** Serial Version Id. */
	private static final long serialVersionUID = 1L;
	
	/** The SlaIndividual id. */
	private Long id;

	/** The SlaIndividual Name. */
	private String name;

	/** The SlaIndividual updated date. */
	private Date dateUpdated;

	/** The SlaIndividual updated by. */
	private String updatedBy;

	/** The SlaTO. */
	private SlaTO slaTO;
	
	/**
	 * Parameterized constructor.
	 * 
	 * @param id
	 * @param name
	 * @param dateUpdated
	 * @param updatedBy
	 * @param slaTO
	 */
	public SlaIndividualDVO(Long id, String name, Date dateUpdated,
			String updatedBy, Long Slaid, String slaName, Long customerclassId, String customerclass) {

		this.id = id;
		this.name = name;
		this.dateUpdated = dateUpdated;
		this.updatedBy = updatedBy;
		this.slaTO = new SlaTO(Slaid, slaName, customerclassId, customerclass);
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dateUpdated
	 */
	public Date getDateUpdated() {
		return dateUpdated;
	}

	/**
	 * @param dateUpdated the dateUpdated to set
	 */
	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the slaTO
	 */
	public SlaTO getSlaTO() {
		return slaTO;
	}

	/**
	 * @param slaTO the slaTO to set
	 */
	public void setSlaTO(SlaTO slaTO) {
		this.slaTO = slaTO;
	}
}
