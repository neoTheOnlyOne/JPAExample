/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.dvo.CircuitDVO.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update:  Aug 10, 2009
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
 * @author 171853
 */
public class CircuitDVO implements Serializable {

	/**
	 * The constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/** The The field corresponding to database field TRANSPORTVERBINDUN.OID_TRANSPORTVERBI . */
	private Long circuitId;
	
	/** The field corresponding to database field LSZ.LSZ . */
	private String lsc;
	
	/** The field corresponding to database field TRANSPORTVERBINDUN.TRANS_ORDNUNGSNUMM . */
	private Long sNo;
	
	/** The field corresponding to database field TRANSPORTVERBINDUN.ZUSATZBUCHSTABE . */
	private String aL;
	
	/** The field corresponding to database field KENNBUCHSTABE.KENNBUCHSTABEKENNU . */
	private String iL;
	
	/** The field corresponding to database field LSZ_EXTENSION.LSZ_EXTENSION_ID . */
	private String lscExtension;
	
	/** The field corresponding to database field GRUNDSTUECK .GRUNDSTUECKSBEZEI0
     * for terminal A. */
    private String siteDesignationNationalA;
    
    /** The field corresponding to database field ENDPUNKT. ITU_SUFFIX
     * for terminal A. */
    private String terminalITUSuffixA;
    
    /** The field corresponding to database field GRUNDSTUECK .GRUNDSTUECKSBEZEI0
     * for terminal B. */
    private String siteDesignationNationalB;
    
    /** The field corresponding to database field ENDPUNKT. ITU_SUFFIX
     * for terminal B. */
    private String terminalITUSuffixB;
    
    /** The field corresponding to database field TRANSPORTVERBINDUN.TGN_NMS_ID . */
    private String tgnNmsId;
    
    /** The field corresponding to database field TRANSPORTVERBINDUN.NEUSCHALTUNG_STATU . */
    private String circuitStatus;
    
    /**
     * Instantiates new CircuitDVO object.
     */
    public CircuitDVO() {
    	
    }
    
    /**
     * Instantiates new CircuitDVO object.
     * 
     * @param circuitId
     * @param lsc
     * @param sNo
     * @param aL
     * @param iL
     * @param lscExtension
     * @param siteDesignationNationalA
     * @param terminalITUSuffixA
     * @param siteDesignationNationalB
     * @param terminalITUSuffixB
     * @param tgnNmsId
     */
    public CircuitDVO(Long circuitId, String lsc, Long sNo, String aL, String iL, String lscExtension,
    		           String siteDesignationNationalA, String terminalITUSuffixA, String siteDesignationNationalB, String terminalITUSuffixB, String tgnNmsId, String circuitStatus) {
    	this.circuitId = circuitId;
    	this.lsc = lsc;
    	this.sNo = sNo;
    	this.aL = aL;
    	this.iL = iL;
    	this.lscExtension = lscExtension;
    	this.siteDesignationNationalA = siteDesignationNationalA;
    	this.terminalITUSuffixA = terminalITUSuffixA;
    	this.siteDesignationNationalB = siteDesignationNationalB;
    	this.terminalITUSuffixB = terminalITUSuffixB;
    	this.tgnNmsId = tgnNmsId;
    	this.circuitStatus = circuitStatus;
    }

	/**
	 * @return the circuitId
	 */
	public Long getCircuitId() {
		return circuitId;
	}

	/**
	 * @param circuitId the circuitId to set
	 */
	public void setCircuitId(Long circuitId) {
		this.circuitId = circuitId;
	}

	/**
	 * @return the lsc
	 */
	public String getLsc() {
		return lsc;
	}

	/**
	 * @param lsc the lsc to set
	 */
	public void setLsc(String lsc) {
		this.lsc = lsc;
	}

	/**
	 * @return the sNo
	 */
	public Long getsNo() {
		return sNo;
	}

	/**
	 * @param sNo the sNo to set
	 */
	public void setsNo(Long sNo) {
		this.sNo = sNo;
	}

	/**
	 * @return the aL
	 */
	public String getaL() {
		return aL;
	}

	/**
	 * @param aL the aL to set
	 */
	public void setaL(String aL) {
		this.aL = aL;
	}

	/**
	 * @return the iL
	 */
	public String getiL() {
		return iL;
	}

	/**
	 * @param iL the iL to set
	 */
	public void setiL(String iL) {
		this.iL = iL;
	}

	/**
	 * @return the lscExtension
	 */
	public String getLscExtension() {
		return lscExtension;
	}

	/**
	 * @param lscExtension the lscExtension to set
	 */
	public void setLscExtension(String lscExtension) {
		this.lscExtension = lscExtension;
	}

	/**
	 * @return the siteDesignationNationalA
	 */
	public String getSiteDesignationNationalA() {
		return siteDesignationNationalA;
	}

	/**
	 * @param siteDesignationNationalA the siteDesignationNationalA to set
	 */
	public void setSiteDesignationNationalA(String siteDesignationNationalA) {
		this.siteDesignationNationalA = siteDesignationNationalA;
	}

	/**
	 * @return the terminalITUSuffixA
	 */
	public String getTerminalITUSuffixA() {
		return terminalITUSuffixA;
	}

	/**
	 * @param terminalITUSuffixA the terminalITUSuffixA to set
	 */
	public void setTerminalITUSuffixA(String terminalITUSuffixA) {
		this.terminalITUSuffixA = terminalITUSuffixA;
	}

	/**
	 * @return the siteDesignationNationalB
	 */
	public String getSiteDesignationNationalB() {
		return siteDesignationNationalB;
	}

	/**
	 * @param siteDesignationNationalB the siteDesignationNationalB to set
	 */
	public void setSiteDesignationNationalB(String siteDesignationNationalB) {
		this.siteDesignationNationalB = siteDesignationNationalB;
	}

	/**
	 * @return the terminalITUSuffixB
	 */
	public String getTerminalITUSuffixB() {
		return terminalITUSuffixB;
	}

	/**
	 * @param terminalITUSuffixB the terminalITUSuffixB to set
	 */
	public void setTerminalITUSuffixB(String terminalITUSuffixB) {
		this.terminalITUSuffixB = terminalITUSuffixB;
	}

	/**
	 * @return the tgnNmsId
	 */
	public String getTgnNmsId() {
		return tgnNmsId;
	}

	/**
	 * @param tgnNmsId the tgnNmsId to set
	 */
	public void setTgnNmsId(String tgnNmsId) {
		this.tgnNmsId = tgnNmsId;
	}

	/**
	 * @return the circuitStatus
	 */
	public String getCircuitStatus() {
		return circuitStatus;
	}

	/**
	 * @param circuitStatus the circuitStatus to set
	 */
	public void setCircuitStatus(String circuitStatus) {
		this.circuitStatus = circuitStatus;
	}
	
}
