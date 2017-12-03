/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.dvo.FaultRecordDVO.java
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
 * The Fault Record DVO holds information from FaultRecord entity.
 */
public class FaultRecordDVO implements Serializable {

	/**
	 * The constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/** The field corresponding to database field FAULT_RECORD.OID_FAULTRECORD.*/
	private Long faultRecordId;
	
	/** The field corresponding to database field FAULT_RECORD.RECORD_STATE.*/
	private String recordState;
	
	/**
	 * Instantiates new FaultRecordDVO object.
	 */
	public FaultRecordDVO() {
		
	}
	
	/**
	 * Instantiates new FaultRecordDVO object.
	 * 
	 * @param faultRecordId
	 * @param recordState
	 */
	public FaultRecordDVO(Long faultRecordId, String recordState) {
		this.faultRecordId = faultRecordId;
		this.recordState = recordState;
	}

	/**
	 * @return the faultRecordId
	 */
	public Long getFaultRecordId() {
		return faultRecordId;
	}

	/**
	 * @param faultRecordId the faultRecordId to set
	 */
	public void setFaultRecordId(Long faultRecordId) {
		this.faultRecordId = faultRecordId;
	}

	/**
	 * @return the recordState
	 */
	public String getRecordState() {
		return recordState;
	}

	/**
	 * @param recordState the recordState to set
	 */
	public void setRecordState(String recordState) {
		this.recordState = recordState;
	}

	
}
