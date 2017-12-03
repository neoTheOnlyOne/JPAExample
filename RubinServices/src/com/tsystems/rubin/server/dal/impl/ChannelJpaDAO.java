package com.tsystems.rubin.server.dal.impl;

import javax.persistence.EntityManager;

import com.tsystems.rubin.server.dal.ChannelDAO;
import com.tsystems.rubin.server.dal.entities.Channel;

/** ChannelJpaDAO **/
public class ChannelJpaDAO extends GenericJpaDAO<Channel, Long> implements ChannelDAO {
	
	/**
	 * Instantiates a new Channel Jpa DAO.
	 * 
	 * @param entityManager
	 *            the entity manager
	 */
	public ChannelJpaDAO(EntityManager entityManager) {
		em = entityManager;
	}
	
	}

