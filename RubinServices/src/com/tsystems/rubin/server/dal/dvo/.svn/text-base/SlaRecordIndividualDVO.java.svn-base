/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.dvo.SlaRecordIndividualDVO.java
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

import com.tsystems.rubin.server.transmodservices.to.SlaIndividualTO;
import com.tsystems.rubin.server.transmodservices.to.SlaRecordTO;

public class SlaRecordIndividualDVO {

	/** The Serial Version Id. */
	private static final long serialVersionUID = 1L;
	
	/** The slarecordindividuell id. */
	private Long id;

	/** The sort order of slarecordindividuell. */
	private Long sortingOrderNumber;

	/** The value of slarecordindividuell. */
	private String value;

	/** The SlaIndividual TO. */
	private SlaIndividualTO slaIndividualTO;
	
	/** The SlaRecordTO. */
	private SlaRecordTO slaRecordTO;
	
	/**
	 * @param id
	 * @param slaRecordIndividuellSortorder
	 * @param slaRecordIndividuellValue
	 * @param slaRecordTO
	 */
	public SlaRecordIndividualDVO(Long id, Long slaRecordIndividuellSortorder, String slaRecordIndividuellValue,
			Long slaRecordId, String displayValue, Long slaSortorder, Long slaAddonValuesId, String slaAddonValue, Long slaAddonGroupId,
			String slaAddonGroupName, Long slaPromptId, String slaPromptName, String slaPromptUnit) {
		this.id = id;
		this.sortingOrderNumber = slaRecordIndividuellSortorder;
		this.value = slaRecordIndividuellValue;
		this.slaRecordTO = new SlaRecordTO(slaRecordId, displayValue, slaSortorder, slaAddonValuesId, slaAddonValue, slaAddonGroupId,
			slaAddonGroupName, slaPromptId, slaPromptName, slaPromptUnit);
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
	 * @return the sortingOrderNumber
	 */
	public Long getSortingOrderNumber() {
		return sortingOrderNumber;
	}

	/**
	 * @param sortingOrderNumber the sortingOrderNumber to set
	 */
	public void setSortingOrderNumber(Long sortingOrderNumber) {
		this.sortingOrderNumber = sortingOrderNumber;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the slaIndividualTO
	 */
	public SlaIndividualTO getSlaIndividualTO() {
		return slaIndividualTO;
	}

	/**
	 * @param slaIndividualTO the slaIndividualTO to set
	 */
	public void setSlaIndividualTO(SlaIndividualTO slaIndividualTO) {
		this.slaIndividualTO = slaIndividualTO;
	}

	/**
	 * @return the slaRecordTO
	 */
	public SlaRecordTO getSlaRecordTO() {
		return slaRecordTO;
	}

	/**
	 * @param slaRecordTO the slaRecordTO to set
	 */
	public void setSlaRecordTO(SlaRecordTO slaRecordTO) {
		this.slaRecordTO = slaRecordTO;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SlaRecordIndividualDVO [id=" + id + ", sortingOrderNumber=" + sortingOrderNumber + ", value=" + value
				+ ", slaIndividualTO=" + slaIndividualTO + ", slaRecordTO=" + slaRecordTO + "]";
	}
}
