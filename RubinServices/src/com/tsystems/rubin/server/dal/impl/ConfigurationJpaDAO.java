package com.tsystems.rubin.server.dal.impl;

import javax.persistence.EntityManager;

import com.tsystems.rubin.server.dal.ConfigurationDAO;
import com.tsystems.rubin.server.dal.entities.Configuration;

/** ConfigurationJpaDAO **/
public class ConfigurationJpaDAO extends GenericJpaDAO<Configuration, Long> implements ConfigurationDAO {

	/**
	 * Instantiates a new Configuration Jpa DAO.
	 * 
	 * @param entityManager
	 *            the entity manager
	 */
	public ConfigurationJpaDAO(EntityManager entityManager) {
		em = entityManager;
	}
}