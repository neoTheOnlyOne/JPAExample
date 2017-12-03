/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: LscJpaDAO.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update:  Jun 25, 2009 
 * 
 * Copyright © 2008 by T-Systems International GmbH, 
 * Frankfurt/Main
 * All rights, including that of the extracts pressure, 
 * photomechanical reproduction (including microscopy),
 * and the evaluation of databases, or similar
 * organizations, reserved.
 * 
 */
package com.tsystems.rubin.server.dal.impl;

import javax.persistence.EntityManager;

import com.tsystems.rubin.server.dal.LscDAO;
import com.tsystems.rubin.server.dal.entities.Lsc;

/**
 * The Class LscJpaDAO.
 */
public class LscJpaDAO extends GenericJpaDAO<Lsc, Long> implements LscDAO {

    /**
     * Instantiates a new lsc jpa dao.
     * 
     * @param entityManager
     *            the entity manager
     */
    public LscJpaDAO(EntityManager entityManager) {
        em = entityManager;
    }

}
