/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.transmodservices.SlaServiceFactory.java
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
package com.tsystems.rubin.server.transmodservices;

import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.transmodservices.impl.SlaServiceImpl;

/**
 * The factory for creating SlaService instance.
 */
public class SlaServiceFactory {
	
	/**
	 * Gets the Sla service.
	 * 
	 * @param daoFactory the dao factory
	 * 
	 * @return the Sla service
	 */
	public static final SlaService getSlaService(DAOFactory daoFactory) {
		return new SlaServiceImpl(daoFactory);
	}
}
