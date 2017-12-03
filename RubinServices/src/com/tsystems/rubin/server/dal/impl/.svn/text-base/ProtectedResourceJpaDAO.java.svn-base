/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: ProtectedResourceJpaDAO.java
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

import org.apache.log4j.Logger;

import com.tsystems.rubin.server.dal.ProtectedResourceDAO;
import com.tsystems.rubin.server.dal.entities.ProtectedResource;
import com.tsystems.rubin.server.dal.entities.ProtectedResourcePK;

/**
 * The Class ProtectedResourceJpaDAO.
 */
public class ProtectedResourceJpaDAO extends GenericJpaDAO<ProtectedResource, ProtectedResourcePK>
        implements ProtectedResourceDAO {

    /** The logger. */
    @SuppressWarnings("unused")
    private static Logger logger = Logger.getLogger(LscJpaDAO.class);

    /**
     * Instantiates a new protected resource jpa dao.
     * 
     * @param entityManager
     *            the entity manager
     */
    public ProtectedResourceJpaDAO(EntityManager entityManager) {
        em = entityManager;
    }

}
