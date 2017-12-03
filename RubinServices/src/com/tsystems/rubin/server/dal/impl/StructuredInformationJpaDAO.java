package com.tsystems.rubin.server.dal.impl;

import javax.persistence.EntityManager;

import com.tsystems.rubin.server.dal.StructuredInformationDAO;
import com.tsystems.rubin.server.dal.entities.StructuredInformation;

public class StructuredInformationJpaDAO extends GenericJpaDAO<StructuredInformation, Long> implements StructuredInformationDAO{
	/**
     * Instantiates a new struct info jpa dao.
     * 
     * @param entityManager
     *            the entity manager
     */
    public StructuredInformationJpaDAO(EntityManager entityManager) {
        em = entityManager;
    }
}
