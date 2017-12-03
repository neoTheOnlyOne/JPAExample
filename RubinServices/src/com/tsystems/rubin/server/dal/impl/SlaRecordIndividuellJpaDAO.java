/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.impl.SlaRecordIndividuell.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update:  Aug 3, 2009
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

import com.tsystems.rubin.server.dal.SlaRecordIndividuellDAO;
import com.tsystems.rubin.server.dal.entities.SlaRecordIndividuell;

/**
 * The class SlaRecordIndividuellJpaDAO.
 */
public class SlaRecordIndividuellJpaDAO extends GenericJpaDAO<SlaRecordIndividuell, Long> implements SlaRecordIndividuellDAO {

	/**
     * Instantiates a new Fuehrung jpa dao.
     * 
     * @param entityManager
     *            the entity manager
     */
    public SlaRecordIndividuellJpaDAO(EntityManager entityManager) {
        em = entityManager;
    }
}
