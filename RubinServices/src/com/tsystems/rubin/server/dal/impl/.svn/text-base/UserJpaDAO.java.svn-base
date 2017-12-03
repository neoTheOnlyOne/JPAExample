/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: UserJpaDAO.java
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

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import com.tsystems.rubin.server.dal.UserDAO;
import com.tsystems.rubin.server.dal.entities.User;

/**
 * The Class UserJpaDAO.
 */
@Stateless
public class UserJpaDAO extends GenericJpaDAO<User, Long> implements UserDAO {
    /**
     * Instantiates a new user jpa dao.
     * 
     * @param entityManager
     *            the entity manager
     */
    public UserJpaDAO(EntityManager entityManager) {
        em = entityManager;
    }
}
