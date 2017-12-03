/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.impl.ZentraleSystemdatJpaDAO.java
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

import com.tsystems.rubin.server.dal.ZentraleSystemdatDAO;
import com.tsystems.rubin.server.dal.entities.ZentraleSystemdat;

/**
 * This is implementation DAO class for ZentraleSystemdat entity.
 */
public class ZentraleSystemdatJpaDAO extends GenericJpaDAO<ZentraleSystemdat, Long> implements
		ZentraleSystemdatDAO {
	/**
     * Instantiates a new ZentraleSystemdat jpa dao.
     * 
     * @param entityManager
     *            the entity manager
     */
    public ZentraleSystemdatJpaDAO(EntityManager entityManager) {
        em = entityManager;
    }
}
