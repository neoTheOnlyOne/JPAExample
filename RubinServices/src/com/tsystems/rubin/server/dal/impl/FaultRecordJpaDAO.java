/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.impl.FaultRecordJpaDAO.java
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
package com.tsystems.rubin.server.dal.impl;

import java.util.List;

import javax.persistence.EntityManager;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.server.dal.FaultRecordDAO;
import com.tsystems.rubin.server.dal.entities.FaultRecord;

/**
 * The class FaultRecordJpaDAO.
 */
public class FaultRecordJpaDAO extends GenericJpaDAO<FaultRecord, Long> implements
		FaultRecordDAO {
	
	/**
     * Instantiates a new Fault record jpa dao.
     * 
     * @param entityManager
     *            the entity manager
     */
    public FaultRecordJpaDAO(EntityManager entityManager) {
        em = entityManager;
    }
}
