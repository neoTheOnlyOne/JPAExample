/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.dvo.CrossConnectDVO.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update:  Aug 4, 2009
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
 * This data value object holds information related to routing section type cross connect.
 */
public class CrossConnectDVO implements Serializable {
	
	/** The constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The field corresponding to database field GRUNDSTUECK .GRUNDSTUECKSBEZEI0. */
    private String siteDesignationNational;
    
    /** The field corresponding to database field ENDPUNKT. ITU_SUFFIX. */
    private String terminalITUSuffix;
    
    /**
     * Instantiates new object of CrossConnectDVO.
     */
    public CrossConnectDVO() {
    	
    }
    
    /**
     * Instantiates new object of CrossConnectDVO.
     * 
     * @param siteDesignationNational
     * @param terminalITUSuffix
     */
    public CrossConnectDVO(String siteDesignationNational, String terminalITUSuffix) {
    	this.siteDesignationNational = siteDesignationNational;
    	this.terminalITUSuffix = terminalITUSuffix;
    }

	/**
	 * @return the siteDesignationNational
	 */
	public String getSiteDesignationNational() {
		return siteDesignationNational;
	}

	/**
	 * @param siteDesignationNational the siteDesignationNational to set
	 */
	public void setSiteDesignationNational(String siteDesignationNational) {
		this.siteDesignationNational = siteDesignationNational;
	}

	/**
	 * @return the terminalITUSuffix
	 */
	public String getTerminalITUSuffix() {
		return terminalITUSuffix;
	}

	/**
	 * @param terminalITUSuffix the terminalITUSuffix to set
	 */
	public void setTerminalITUSuffix(String terminalITUSuffix) {
		this.terminalITUSuffix = terminalITUSuffix;
	}
}
