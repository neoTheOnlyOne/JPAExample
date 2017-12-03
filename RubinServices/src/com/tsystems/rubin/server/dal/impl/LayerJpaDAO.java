/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: LayerJpaDAO.java
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

import com.tsystems.rubin.server.dal.LayerDAO;
import com.tsystems.rubin.server.dal.entities.Layer;

/**
 * The Class LayerJpaDAO.
 */
public class LayerJpaDAO extends GenericJpaDAO<Layer, Long> implements LayerDAO {

    /**
     * Instantiates a new layer jpa dao.
     * 
     * @param entityManager
     *            the entity manager
     */
    public LayerJpaDAO(EntityManager entityManager) {
        em = entityManager;
    }
}
