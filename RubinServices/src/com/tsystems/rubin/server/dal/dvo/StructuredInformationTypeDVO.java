package com.tsystems.rubin.server.dal.dvo;

import java.io.Serializable;

/**
 * The Class StructInfoTypeDVO. - data value objects used in constructor query
 * expression for StructInfoType.
 */
public class StructuredInformationTypeDVO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private Long id;

	/** The designation. */
	private String designation;

	/**
	 * Instantiates a new struct info type dvo.
	 */
	public StructuredInformationTypeDVO() {
	}

	/**
	 * Instantiates a new struct info type dvo.
	 * 
	 * @param id
	 *            the id
	 * @param designation
	 *            the designation
	 * 
	 */
	public StructuredInformationTypeDVO(Long id, String designation) {
		this.id = id;
		this.designation = designation;
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
	 * Gets designation.
	 * 
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * Sets the designation.
	 * 
	 * @param designation
	 *            the new designation
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
