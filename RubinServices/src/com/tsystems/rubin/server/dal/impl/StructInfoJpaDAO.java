package com.tsystems.rubin.server.dal.impl;

import javax.persistence.EntityManager;

import com.tsystems.rubin.server.dal.StructInfoDAO;
import com.tsystems.rubin.server.dal.entities.StructInfo;

public class StructInfoJpaDAO extends GenericJpaDAO<StructInfo, Long> implements StructInfoDAO{
	/**
     * Instantiates a new struct info jpa dao.
     * 
     * @param entityManager
     *            the entity manager
     */
    public StructInfoJpaDAO(EntityManager entityManager) {
        em = entityManager;
    }
}
