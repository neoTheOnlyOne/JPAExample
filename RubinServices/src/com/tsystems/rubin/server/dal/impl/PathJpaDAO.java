package com.tsystems.rubin.server.dal.impl;

import javax.persistence.EntityManager;

import com.tsystems.rubin.server.dal.PathDAO;
import com.tsystems.rubin.server.dal.entities.Way;

/**
 * 
 * The PathJpaDAO class
 *
 */
public class PathJpaDAO extends GenericJpaDAO<Way, Long> implements PathDAO {

	/**
	 * Instantiates a new Path Jpa DAO.
	 * 
	 * @param entityManager
	 *            the entity manager
	 */
	public PathJpaDAO(EntityManager entityManager) {
		em = entityManager;
	}
}
