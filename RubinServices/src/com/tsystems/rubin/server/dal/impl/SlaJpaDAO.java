/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.impl.SlaJpaDAO.java
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
package com.tsystems.rubin.server.dal.impl;

import javax.persistence.EntityManager;

import com.tsystems.rubin.server.dal.SlaDAO;
import com.tsystems.rubin.server.dal.entities.Sla;

/**
 * The class SlaJpaDAO.
 */
public class SlaJpaDAO extends GenericJpaDAO<Sla, Long> implements SlaDAO {

	/**
	 * Instantiates a new sla jpa dao.
	 * 
	 * @param entityManager
	 *            the entity manager
	 */
	public SlaJpaDAO(EntityManager entityManager) {
		em = entityManager;
	}
}
