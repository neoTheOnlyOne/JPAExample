package com.tsystems.rubin.server.dal.dvo;

import java.io.Serializable;

/**
 * The Class ServiceDVO. - data value objects used in constructor query
 * expression for Service.
 */
public class ServiceDVO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private Long id;

	/** The serviceDesignation. */
	private String designation;

	/** The serviceId. */
	private String serviceId;

	/**
	 * Instantiates a new service dvo.
	 */
	public ServiceDVO() {
	}

	/**
	 * Instantiates a new service dvo.
	 * 
	 * @param id
	 *            the id
	 * @param designation
	 *            the serviceDesignation
	 * @param serviceId
	 *            the serviceId
	 * 
	 */
	public ServiceDVO(Long id, String designation, String serviceId) {
		this.id = id;
		this.designation = designation;
		this.serviceId = serviceId;
	}	

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 * 
	 * @param id
	 *            the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the serviceDesignation.
	 * 
	 * @return the serviceDesignation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * Sets the serviceDesignation.
	 * 
	 * @param serviceDesignation
	 *            the new serviceDesignation
	 */
	public void setDesignation(String serviceDesignation) {
		this.designation = serviceDesignation;
	}
	
	/**
	 * Gets the serviceId.
	 * 
	 * @return the serviceId
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * Sets the serviceId.
	 * 
	 * @param serviceId
	 *            the new serviceId
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
