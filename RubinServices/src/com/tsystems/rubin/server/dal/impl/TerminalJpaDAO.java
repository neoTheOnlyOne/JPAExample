package com.tsystems.rubin.server.dal.impl;

import javax.persistence.EntityManager;

import com.tsystems.rubin.server.dal.TerminalDAO;
import com.tsystems.rubin.server.dal.entities.Terminal;

public class TerminalJpaDAO extends GenericJpaDAO<Terminal, Long> implements TerminalDAO{
	public TerminalJpaDAO(EntityManager entityManager) {
		em = entityManager;
		}
}
