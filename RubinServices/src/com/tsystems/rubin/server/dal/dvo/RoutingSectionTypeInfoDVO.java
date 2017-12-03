/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.dvo.RoutingSectionTypeInfoDVO.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update:  Jul 30, 2009
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
import java.math.BigDecimal;

/**
 * This data value object holds information related to routing section info.
 */
public class RoutingSectionTypeInfoDVO implements Serializable {

	/** The constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The field corresponding to database field LINIE.LINIENKENNUNG. */
    private String lineId;
    
    /** The field corresponding to database field TRANSPORTVERBINDUN.OID_TRANSPORTVERBI. */
    private Long circuitId;
    
    /** The field corresponding to database field TRANSPORTVERBINDUN.TRANS_ORDNUNGSNUMM. */
    private Long transOrdnungsnumm;
    
    /** The field corresponding to database field TRANSPORTVERBINDUN.DELAY_MAIN_MS. */
    private BigDecimal delayMainMs;
    
    /** The field corresponding to database field LSZ.LSZ. */
    private String lineCode;
    
    /** The field corresponding to database field LINIENABSCHNITT. L_ABSCHNITTSCODE. */
    private String lineSegment;
    
    /** The field corresponding to database field LINIENABSCHNITT. LINIENABSCHNITTLAE. */
    private BigDecimal lineLength;
    
    /** The field corresponding to database field LINIENART. AUSBREITUNGSGESCHWINDIGKEIT. */
    private Long lineSpeed;
    
    /** The field corresponding to database field GRUNDSTUECK .GRUNDSTUECKSBEZEI0
     * for terminal A. */
    private String siteDesignationNationalA;
    
    /** The field corresponding to database field ENDPUNKT. ITU_SUFFIX
     * for terminal A. */
    private String terminalITUSuffixA;
    
    /** The field corresponding to database field GRUNDSTUECK.GEO_LAENGE_GRUNDST
     * for terminal A. */
    private Long basicLatitudeA;
    
    /** The field corresponding to database field GRUNDSTUECK.GEO_BREITE_GRUNDST
     * for terminal A. */
    private Long basicLongitudeA;
     
    /** The field corresponding to database field GRUNDSTUECK .GRUNDSTUECKSBEZEI0
     * for terminal B. */
    private String siteDesignationNationalB;
    
    /** The field corresponding to database field ENDPUNKT. ITU_SUFFIX
     * for terminal B. */
    private String terminalITUSuffixB;
    
    /** The field corresponding to database field GRUNDSTUECK.GEO_LAENGE_GRUNDST
     * for terminal B. */
    private Long basicLatitudeB;
    
    /** The field corresponding to database field GRUNDSTUECK.GEO_BREITE_GRUNDST
     * for terminal B. */
    private Long basicLongitudeB;
    
    /** The field corresponding to database field LAENDERKANTE.LAENDERKANTE_ART. */
    private String tunnelType;
    
    
    /**
     * Instantiates new RoutingSectionTypeInfoDVO object.
     */
    public RoutingSectionTypeInfoDVO() {
    	
    }
    
    /**
     * Instantiates new RoutingSectionTypeInfoDVO object.
     * This is for line segment routing section type info.
     * 
     * @param lineId
     * @param lineSegment
     * @param siteDesignationNationalA
     * @param terminalITUSuffixA
     * @param siteDesignationNationalB
     * @param terminalITUSuffixB
     */
    public RoutingSectionTypeInfoDVO(String lineId, String lineSegment, BigDecimal lineLength, Long lineSpeed, String siteDesignationNationalA, 
    		                         String terminalITUSuffixA, String siteDesignationNationalB, String terminalITUSuffixB) {
    	this.lineId = lineId;
    	this.lineSegment = lineSegment;
    	this.lineLength = lineLength;
    	this.lineSpeed = lineSpeed;
    	this.siteDesignationNationalA = siteDesignationNationalA;
    	this.terminalITUSuffixA = terminalITUSuffixA;
    	this.siteDesignationNationalB = siteDesignationNationalB;
    	this.terminalITUSuffixB = terminalITUSuffixB;
    }

    /**
     * Instantiates new RoutingSectionTypeInfoDVO object.
     * This is for laenderkante routing section type info.
     * 
     * @param tunnelType
     * @param siteDesignationNationalA
     * @param terminalITUSuffixA
     * @param siteDesignationNationalB
     * @param terminalITUSuffixB
     */
    public RoutingSectionTypeInfoDVO(String tunnelType, String siteDesignationNationalA, 
                                       String terminalITUSuffixA, String siteDesignationNationalB, String terminalITUSuffixB, 
                                       Long basicLatitudeA, Long basicLongitudeA, Long basicLatitudeB, Long basicLongitudeB) {
    	this.tunnelType = tunnelType;
    	this.siteDesignationNationalA = siteDesignationNationalA;
    	this.terminalITUSuffixA = terminalITUSuffixA;
    	this.basicLatitudeA = basicLatitudeA;
    	this.basicLongitudeA = basicLongitudeA;
    	this.siteDesignationNationalB = siteDesignationNationalB;
    	this.terminalITUSuffixB = terminalITUSuffixB;
    	this.basicLatitudeB = basicLatitudeB;
    	this.basicLongitudeB = basicLongitudeB;
    }
    
    /**
     * Instantiates new RoutingSectionTypeInfoDVO object.
     * This is for Cross-connect routing section type info.
     * 
     * @param siteDesignationNational
     * @param terminalITUSuffix
     */
    public RoutingSectionTypeInfoDVO(String siteDesignationNational, 
                                       String terminalITUSuffix) {
    	this.siteDesignationNationalA = siteDesignationNational;
    	this.terminalITUSuffixA = terminalITUSuffix;
    }
    
    /**
     * Instantiates new RoutingSectionTypeInfoDVO object.
     * This is for Bearer routing section type info
     * 
     * @param circuitId
     * @param lineCode
     * @param siteDesignationNationalA
     * @param terminalITUSuffixA
     * @param siteDesignationNationalB
     * @param terminalITUSuffixB
     */
    public RoutingSectionTypeInfoDVO(Long circuitId, Long transOrdnungsnumm, BigDecimal delayMainMs, String lineCode, 
    		                          String siteDesignationNationalA, String terminalITUSuffixA, String siteDesignationNationalB, String terminalITUSuffixB) {
    	this.circuitId = circuitId;
    	this.transOrdnungsnumm = transOrdnungsnumm;
    	this.delayMainMs = delayMainMs;
    	this.lineCode = lineCode;
    	this.siteDesignationNationalA = siteDesignationNationalA;
    	this.terminalITUSuffixA = terminalITUSuffixA;
    	this.siteDesignationNationalB = siteDesignationNationalB;
    	this.terminalITUSuffixB = terminalITUSuffixB;
    }
    
	/**
	 * @return the lineId
	 */
	public String getLineId() {
		return lineId;
	}

	/**
	 * @param lineId the lineId to set
	 */
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	/**
	 * @return the lineSegment
	 */
	public String getLineSegment() {
		return lineSegment;
	}

	/**
	 * @param lineSegment the lineSegment to set
	 */
	public void setLineSegment(String lineSegment) {
		this.lineSegment = lineSegment;
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
	 * @return the laenderkanteArt
	 */
	public String getTunnelType() {
		return tunnelType;
	}

	/**
	 * @param tunnelType the laenderkanteArt to set
	 */
	public void setTunnelType(String tunnelType) {
		this.tunnelType = tunnelType;
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
	 * @return the lineCode
	 */
	public String getLineCode() {
		return lineCode;
	}

	/**
	 * @param lineCode the lineCode to set
	 */
	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}

	/**
	 * @return the transOrdnungsnumm
	 */
	public Long getTransOrdnungsnumm() {
		return transOrdnungsnumm;
	}

	/**
	 * @param transOrdnungsnumm the transOrdnungsnumm to set
	 */
	public void setTransOrdnungsnumm(Long transOrdnungsnumm) {
		this.transOrdnungsnumm = transOrdnungsnumm;
	}

	/**
	 * @return the basicLatitudeA
	 */
	public Long getBasicLatitudeA() {
		return basicLatitudeA;
	}

	/**
	 * @param basicLatitudeA the basicLatitudeA to set
	 */
	public void setBasicLatitudeA(Long basicLatitudeA) {
		this.basicLatitudeA = basicLatitudeA;
	}

	/**
	 * @return the basicLongitudeA
	 */
	public Long getBasicLongitudeA() {
		return basicLongitudeA;
	}

	/**
	 * @param basicLongitudeA the basicLongitudeA to set
	 */
	public void setBasicLongitudeA(Long basicLongitudeA) {
		this.basicLongitudeA = basicLongitudeA;
	}

	/**
	 * @return the basicLatitudeB
	 */
	public Long getBasicLatitudeB() {
		return basicLatitudeB;
	}

	/**
	 * @param basicLatitudeB the basicLatitudeB to set
	 */
	public void setBasicLatitudeB(Long basicLatitudeB) {
		this.basicLatitudeB = basicLatitudeB;
	}

	/**
	 * @return the basicLongitudeB
	 */
	public Long getBasicLongitudeB() {
		return basicLongitudeB;
	}

	/**
	 * @param basicLongitudeB the basicLongitudeB to set
	 */
	public void setBasicLongitudeB(Long basicLongitudeB) {
		this.basicLongitudeB = basicLongitudeB;
	}

	/**
	 * @return the delayMainMs
	 */
	public BigDecimal getDelayMainMs() {
		return delayMainMs;
	}

	/**
	 * @param delayMainMs the delayMainMs to set
	 */
	public void setDelayMainMs(BigDecimal delayMainMs) {
		this.delayMainMs = delayMainMs;
	}

	/**
	 * @return the lineLength
	 */
	public BigDecimal getLineLength() {
		return lineLength;
	}

	/**
	 * @param lineLength the lineLength to set
	 */
	public void setLineLength(BigDecimal lineLength) {
		this.lineLength = lineLength;
	}

	/**
	 * @return the lineSpeed
	 */
	public Long getLineSpeed() {
		return lineSpeed;
	}

	/**
	 * @param lineSpeed the lineSpeed to set
	 */
	public void setLineSpeed(Long lineSpeed) {
		this.lineSpeed = lineSpeed;
	}
}
