/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.dvo.FuehrungsabschnittDVO.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update:  Jul 29, 2009
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
 * This class is data value object of Fuehrungsabschnitt entity
 * which holds information of the entity.
 */
public class RoutingSectionDVO implements Serializable {

	/** The constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The id of the Fuehrungsabschnitt entity. */
	private Long id;
	
	/** The routing section type of the Fuehrungsabschnitt entity. */
	private String type;
	
	/**
	 * Instantiates new FuehrungsabschnittDVO object.
	 */
	public RoutingSectionDVO() {
		
	}
	
	/**
	 * Instantiates new FuehrungsabschnittDVO object.
	 * 
	 * @param id
	 * @param routingSectionType
	 */
	public RoutingSectionDVO(Long id, String routingSectionType) {
		this.id = id;
		this.type = routingSectionType;
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
	 * @return the routingSectionType
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the routingSectionType to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
}
