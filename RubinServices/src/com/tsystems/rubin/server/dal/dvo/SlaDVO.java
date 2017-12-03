/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.dvo.SlaDVO.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update:  Jul 28, 2009
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

import com.tsystems.rubin.server.transmodservices.to.CustomerclassTO;

/**
 * The Class SlaDVO. - data value objects used in constructor query expression
 * for <Sla>.
 */
public class SlaDVO implements Serializable {

	/** Serial Version Id. */
	private static final long serialVersionUID = 1L;

	/** The sla id. */
	private Long id;

	/** The Sla Name. */
	private String name;

	/** The CustomerclassTO. */
	private CustomerclassTO customerclassTO;

	/**
	 * @param id
	 * @param slaName
	 * @param customerclassTO
	 */
	public SlaDVO(Long id, String slaName, Long customerclassId, String customerClass) {
		this.id = id;
		this.name = slaName;
		this.customerclassTO = new CustomerclassTO(customerclassId, customerClass);
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
	 * @return the slaName
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the slaName to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the customerclassTO
	 */
	public CustomerclassTO getCustomerclassTO() {
		return customerclassTO;
	}

	/**
	 * @param customerclassTO the customerclassTO to set
	 */
	public void setCustomerclassTO(CustomerclassTO customerclassTO) {
		this.customerclassTO = customerclassTO;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SlaDVO [id=" + id + ", slaName=" + name + ", customerclassTO=" + customerclassTO + "]";
	}
}