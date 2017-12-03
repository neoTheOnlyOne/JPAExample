/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.impl.CrossConnectJpaDAO.java
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
package com.tsystems.rubin.server.dal.impl;

import javax.persistence.EntityManager;

import com.tsystems.rubin.server.dal.CrossConnectDAO;
import com.tsystems.rubin.server.dal.entities.CrossConnect;

/**
 * The CrossConnectJpaDAO class.
 */
public class CrossConnectJpaDAO extends GenericJpaDAO<CrossConnect, Long> implements
		CrossConnectDAO {
	/**
	 * Instantiates a new CrossConnect jpa dao.
	 * 
	 * @param entityManager
	 *            the entity manager
	 */
	public CrossConnectJpaDAO(EntityManager entityManager) {
		em = entityManager;
	}
}
