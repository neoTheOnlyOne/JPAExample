package com.tsystems.rubin.server.dal.impl;

import javax.persistence.EntityManager;

import com.tsystems.rubin.server.dal.SubnetworkDAO;
import com.tsystems.rubin.server.dal.entities.Subnetwork;

public class SubnetworkJpaDAO extends GenericJpaDAO<Subnetwork, Long> implements SubnetworkDAO {

	/**
	 * Instantiates a new Subnetwork jpa dao.
	 * 
	 * @param entityManager
	 *            the entity manager
	 */
	public SubnetworkJpaDAO(EntityManager entityManager) {
		em = entityManager;
	}
}
