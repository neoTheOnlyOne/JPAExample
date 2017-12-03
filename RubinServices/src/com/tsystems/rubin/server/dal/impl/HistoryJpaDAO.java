/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.impl.HistoryJpaDAO.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update:  Jul 23, 2009
 * 
 * Copyright � 2008 by T-Systems International GmbH, 
 * Frankfurt/Main
 * All rights, including that of the extracts pressure, 
 * photomechanical reproduction (including microscopy),
 * and the evaluation of databases, or similar
 * organizations, reserved.
 **/
package com.tsystems.rubin.server.dal.impl;

import javax.persistence.EntityManager;

import com.tsystems.rubin.server.dal.HistoryDAO;
import com.tsystems.rubin.server.dal.entities.History;

public class HistoryJpaDAO extends GenericJpaDAO<History, Long> implements HistoryDAO {

	/**
     * Instantiates a new History jpa dao.
     * 
     * @param entityManager
     *            the entity manager
     */
	public HistoryJpaDAO(EntityManager entityManager) {
		em = entityManager;
	}
}
