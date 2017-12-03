/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: GenericJpaDAO.java
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

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TransactionRequiredException;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.common.util.CommonConstants;
import com.tsystems.rubin.common.util.ErrorConstants;
import com.tsystems.rubin.server.dal.GenericDAO;

/**
 * the generic jpa dao.
 * 
 * @param <T>
 *            the T
 * @param <ID>
 *            the ID
 * 
 *            The Class GenericJpaDAO.
 */
public class GenericJpaDAO<T, ID extends Serializable> implements
		GenericDAO<T, ID> {

	/** The logger. */
	private static Logger logger = Logger.getLogger(GenericJpaDAO.class);

	/** The persistent class. */
	protected Class<T> persistentClass;

	/** The entity name. */
	protected String entityName;

	/** The em. */
	protected EntityManager em;

	/** The named query find all. */
	protected String namedQueryFindAll;

	/**
	 * Instantiates a new generic jpa dao.
	 */
	@SuppressWarnings("unchecked")
	public GenericJpaDAO() {
		persistentClass = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];

		Entity entityAnn = (Entity) persistentClass.getAnnotation(Entity.class);

		if (entityAnn != null && !entityAnn.name().equals("")) {
			entityName = entityAnn.name();
		} else {
			entityName = persistentClass.getSimpleName();
		}
	}

	/**
	 * findById.
	 * 
	 * @param id
	 *            the id
	 * @return the T
	 * @throws RubinApplicationException
	 *             the RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.dal.GenericDAO#findById(java.io.Serializable)
	 */
	public T findById(ID id) throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("id=" + id);
		}

		T entity = null;

		try {
			entity = em.find(persistentClass, id);
			if (entity == null) {
				throw new RubinApplicationException(ErrorConstants.CANNOT_FIND
						+ CommonConstants.SPACE + entityName);
			}
		} catch (PersistenceException e) {
			logger.error(ErrorConstants.CANNOT_FIND + CommonConstants.SPACE
					+ entityName, e);
			throw new RubinApplicationException(ErrorConstants.CANNOT_FIND
					+ CommonConstants.SPACE + entityName, e);
		} catch (Throwable e) {
			logger.error(e.getMessage(), e);
			throw new RubinApplicationException(
					ErrorConstants.COMMON_EXCEPTION_MESSAGE + e.getMessage(), e);
		}

		return entity;
	}

	/**
	 * findByProperty.
	 * 
	 * @param <U>
	 *            the <U>
	 * @param prop
	 *            the prop
	 * @param val
	 *            the val
	 * @return the list
	 * @throws RubinApplicationException
	 *             the RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.dal.GenericDAO#findByProperty(java.lang.String,
	 *      java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	public <U> List<U> findByProperty(String prop, Object val)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("prop=" + prop + ", val=" + val);
		}
		List<U> resultList = null;
		int count = 1;
		try {
			Query query = em.createNamedQuery(prop);
			if (val != null) {
				String searchParameter = null;
				if (val instanceof Map) {
					Set set = ((Map) val).entrySet();
					Iterator iterator = set.iterator();
					while (iterator.hasNext()) {
						Map.Entry mapEntry = (Map.Entry) iterator.next();
						if(mapEntry.getValue() instanceof String){
							searchParameter = ((String)mapEntry.getValue()).concat("%");
							query.setParameter(count, searchParameter);
						}else{
							query.setParameter(count, mapEntry.getValue());							
						}						
						count++;
					}
				} else {
					if(val instanceof String){
						searchParameter = ((String)val).concat("%");
						query.setParameter(1, searchParameter);
					}else{
						query.setParameter(1, val);						
					}
					
				}

			}

			resultList = (List<U>) query.getResultList();

			if (logger.isDebugEnabled()) {
				logger.debug(((resultList == null) ? "resultList=null"
						: "resultList.size=" + resultList.size()));
			}
		} catch (PersistenceException e) {
			logger.error(ErrorConstants.CANNOT_FIND + CommonConstants.SPACE
					+ entityName, e);
			throw new RubinApplicationException(ErrorConstants.CANNOT_FIND
					+ CommonConstants.SPACE + entityName, e);
		} catch (Throwable e) {
			logger.error(e.getMessage(), e);
			throw new RubinApplicationException(
					ErrorConstants.COMMON_EXCEPTION_MESSAGE + e.getMessage(), e);
		}

		return resultList;
	}

	/**
	 * findSingleByProperty.
	 * 
	 * @param <U>
	 *            the <U>
	 * @param prop
	 *            the prop
	 * @param val
	 *            the val
	 * @return the U
	 * @throws RubinApplicationException
	 *             the RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.dal.GenericDAO#findSingleByProperty(java.lang.String,
	 *      java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	public <U> U findSingleByProperty(String prop, Object val)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("prop=" + prop + ", val=" + val);
		}

		U entity = null;
		int count = 1;
		try {
			Query query = em.createNamedQuery(prop);

			if (val != null) {
				String searchParameter = null;
				if (val instanceof Map) {
					Set set = ((Map) val).entrySet();
					Iterator iterator = set.iterator();
					while (iterator.hasNext()) {
						Map.Entry mapEntry = (Map.Entry) iterator.next();
						if(mapEntry.getValue() instanceof String){
							searchParameter = ((String)mapEntry.getValue()).concat("%");
							query.setParameter(count, searchParameter);
						}else{
							query.setParameter(count, mapEntry.getValue());
						}						
						count++;
					}
				} else {
					if(val instanceof String){
						searchParameter = ((String)val).concat("%");
						query.setParameter(1, searchParameter);
					}else{
						query.setParameter(1, val);
					}					
				}
			}
			entity = (U) query.getSingleResult();

			if (entity == null) {
				throw new RubinApplicationException(ErrorConstants.CANNOT_FIND
						+ CommonConstants.SPACE + entityName);
			}

		} catch (NoResultException e) {
			logger.error(entityName + ErrorConstants.ENTITY_NOT_EXISTS, e);
			throw new RubinApplicationException(entityName
					+ ErrorConstants.ENTITY_NOT_EXISTS, e);
		} catch (NonUniqueResultException e) {
			logger.error(entityName + ErrorConstants.ENTITY_NOTUNIQUE, e);
			throw new RubinApplicationException(entityName
					+ ErrorConstants.ENTITY_NOTUNIQUE, e);
		} catch (PersistenceException e) {
			logger.error(ErrorConstants.CANNOT_FIND + CommonConstants.SPACE
					+ entityName, e);
			throw new RubinApplicationException(ErrorConstants.CANNOT_FIND
					+ CommonConstants.SPACE + entityName, e);
		} catch (Throwable e) {
			logger.error(e.getMessage(), e);
			throw new RubinApplicationException(
					ErrorConstants.COMMON_EXCEPTION_MESSAGE + e.getMessage(), e);
		}

		return entity;
	}

	/**
	 * countByProperty.
	 * 
	 * @param prop
	 *            the prop
	 * @param val
	 *            the val
	 * @return the long count
	 * @throws RubinApplicationException
	 *             the RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.dal.GenericDAO#countByProperty(java.lang.String,
	 *      java.lang.Object)
	 */
	public Long countByProperty(String prop, Object val)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("prop=" + prop + ", val=" + val);
		}

		Long number = null;
		String searchParameter = null;
		try {
			Query query = em.createNamedQuery(prop);

			if (val != null) {
				if(val instanceof String){
					searchParameter = ((String)val).concat("%");
					query.setParameter(1, searchParameter);
				}else{
					query.setParameter(1, val);
				}
				
			}

			number = Long.valueOf(query.getSingleResult().toString());

			if (logger.isDebugEnabled()) {
				logger.debug("number=" + number);
			}
		} catch (PersistenceException e) {
			logger.error(ErrorConstants.CANNOT_COUNT + CommonConstants.SPACE
					+ entityName, e);
			throw new RubinApplicationException(ErrorConstants.CANNOT_COUNT
					+ CommonConstants.SPACE + entityName, e);
		} catch (Throwable e) {
			logger.error(e.getMessage(), e);
			throw new RubinApplicationException(
					ErrorConstants.COMMON_EXCEPTION_MESSAGE + e.getMessage(), e);
		}

		return number;
	}

	/**
	 * findAll.
	 * 
	 * @return the list
	 * @throws RubinApplicationException
	 *             the RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.dal.GenericDAO#findAll()
	 */
	@SuppressWarnings("unchecked")
	public List<T> findAll() throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("");
		}

		List<T> resultList = null;

		try {
			Query query = null;

			if (namedQueryFindAll != null) {
				query = em.createNamedQuery(namedQueryFindAll);
			} else {
				query = em.createQuery("SELECT e FROM " + entityName + " e");
			}

			resultList = (List<T>) query.getResultList();

			if (logger.isDebugEnabled()) {
				logger.debug(((resultList == null) ? "resultList=null"
						: "layerTO.size=" + resultList.size()));
			}
		} catch (PersistenceException e) {
			logger.error(ErrorConstants.CANNOT_FIND + CommonConstants.SPACE
					+ entityName, e);
			throw new RubinApplicationException(ErrorConstants.CANNOT_FIND
					+ CommonConstants.SPACE + entityName, e);
		} catch (Throwable e) {
			logger.error(e.getMessage(), e);
			throw new RubinApplicationException(
					ErrorConstants.COMMON_EXCEPTION_MESSAGE + e.getMessage(), e);
		}

		return resultList;
	}

	/**
	 * insert.
	 * 
	 * @param entity
	 *            the entity
	 * @return the T
	 * @throws RubinApplicationException
	 *             the RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.dal.GenericDAO#insert(java.lang.Object)
	 */
	public T insert(T entity) throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("entity=" + entity);
		}

		try {
			em.persist(entity);
			em.flush();
		} catch (EntityExistsException e) {
			logger.error(ErrorConstants.CANNOT_CREATE + CommonConstants.SPACE
					+ entityName, e);
			throw new RubinApplicationException(ErrorConstants.CANNOT_CREATE
					+ CommonConstants.SPACE + entityName, e);
		} catch (IllegalArgumentException e) {
			logger.error(ErrorConstants.CANNOT_CREATE + CommonConstants.SPACE
					+ entityName, e);
			throw new RubinApplicationException(ErrorConstants.CANNOT_CREATE
					+ CommonConstants.SPACE + entityName, e);
		} catch (IllegalStateException e) {
			logger.error(ErrorConstants.CANNOT_CREATE + CommonConstants.SPACE
					+ entityName, e);
			throw new RubinApplicationException(ErrorConstants.CANNOT_CREATE
					+ CommonConstants.SPACE + entityName, e);
		} catch (TransactionRequiredException e) {
			logger.error(ErrorConstants.CANNOT_CREATE + CommonConstants.SPACE
					+ entityName, e);
			throw new RubinApplicationException(ErrorConstants.CANNOT_CREATE
					+ CommonConstants.SPACE + entityName, e);
		} catch (PersistenceException e) {
			if (e.getCause().getCause().getMessage().indexOf(
					ErrorConstants.TABLE_LIMIT_EXCEEDED) >= 0) {
				throw new RubinApplicationException(
						CommonConstants.TABLE_LIMIT_EXCEEDED_MESSAGE);
			} else {
				logger.error(ErrorConstants.CANNOT_CREATE
						+ CommonConstants.SPACE + entityName, e);
				throw new RubinApplicationException(
						ErrorConstants.CANNOT_CREATE + CommonConstants.SPACE
								+ entityName, e);
			}
		} catch (Throwable e) {
			logger.error(e.getMessage(), e);
			throw new RubinApplicationException(
					ErrorConstants.COMMON_EXCEPTION_MESSAGE + e.getMessage(), e);
		}

		return entity;
	}

	/**
	 * update.
	 * 
	 * @param entity
	 *            the entity
	 * @return the T
	 * @throws RubinApplicationException
	 *             the RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.dal.GenericDAO#update(java.lang.Object)
	 */
	public T update(T entity) throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("entity=" + entity);
		}

		try {
			em.merge(entity);
			em.flush();
		} catch (IllegalArgumentException e) {
			logger.error(ErrorConstants.CANNOT_UPDATE + CommonConstants.SPACE
					+ entityName, e);
			throw new RubinApplicationException(ErrorConstants.CANNOT_UPDATE
					+ CommonConstants.SPACE + entityName, e);
		} catch (IllegalStateException e) {
			logger.error(ErrorConstants.CANNOT_UPDATE + CommonConstants.SPACE
					+ entityName, e);
			throw new RubinApplicationException(ErrorConstants.CANNOT_UPDATE
					+ CommonConstants.SPACE + entityName, e);
		} catch (TransactionRequiredException e) {
			logger.error(ErrorConstants.CANNOT_UPDATE + CommonConstants.SPACE
					+ entityName, e);
			throw new RubinApplicationException(ErrorConstants.CANNOT_UPDATE
					+ CommonConstants.SPACE + entityName, e);
		} catch (PersistenceException e) {
			logger.error(ErrorConstants.CANNOT_UPDATE + CommonConstants.SPACE
					+ entityName, e);
			throw new RubinApplicationException(ErrorConstants.CANNOT_UPDATE
					+ CommonConstants.SPACE + entityName, e);
		} catch (Throwable e) {
			logger.error(e.getMessage(), e);
			throw new RubinApplicationException(
					ErrorConstants.COMMON_EXCEPTION_MESSAGE + e.getMessage(), e);
		}

		return entity;
	}

	/**
	 * delete.
	 * 
	 * @param id
	 *            the id
	 * @throws RubinApplicationException
	 *             the RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.dal.GenericDAO#delete(java.io.Serializable)
	 */
	public void delete(ID id) throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("id=" + id);
		}

		try {
			T entity = em.find(persistentClass, id);

			if (entity == null) {
				logger.error(ErrorConstants.CANNOT_FIND_BY_PRIMARYID
						+ CommonConstants.SPACE + ":" + " Entity - "
						+ entityName + " Id - " + id);
				throw new RubinApplicationException(ErrorConstants.CANNOT_FIND
						+ CommonConstants.SPACE + entityName);
			}

			em.remove(entity);
			em.flush();
		} catch (IllegalArgumentException e) {
			logger.error(ErrorConstants.CANNOT_DELETE + CommonConstants.SPACE
					+ entityName, e);
			throw new RubinApplicationException(ErrorConstants.CANNOT_DELETE
					+ CommonConstants.SPACE + entityName, e);
		} catch (IllegalStateException e) {
			logger.error(ErrorConstants.CANNOT_DELETE + CommonConstants.SPACE
					+ entityName, e);
			throw new RubinApplicationException(ErrorConstants.CANNOT_DELETE
					+ CommonConstants.SPACE + entityName, e);
		} catch (TransactionRequiredException e) {
			logger.error(ErrorConstants.CANNOT_DELETE + CommonConstants.SPACE
					+ entityName, e);
			throw new RubinApplicationException(ErrorConstants.CANNOT_DELETE
					+ CommonConstants.SPACE + entityName, e);
		} catch (Throwable e) {
			logger.error(e.getMessage(), e);
			if (e.getMessage().contains(
					ErrorConstants.INTEGRITY_CONSTR_VIOLATION)) {
				throw new RubinApplicationException(
						ErrorConstants.CANNOT_DELETE + CommonConstants.SPACE
								+ entityName
								+ ErrorConstants.ENTITY_HAS_BEEN_ASSIGNED, e);

			} else {
				throw new RubinApplicationException(
						ErrorConstants.COMMON_EXCEPTION_MESSAGE
								+ e.getMessage(), e);
			}
		}
	}

	/**
	 * findByProperty.
	 * 
	 * @param <U>
	 *            the <U>
	 * @param prop
	 *            the prop
	 * @param val
	 *            the val
	 * @return the list
	 * @throws RubinApplicationException
	 *             the RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.dal.GenericDAO#findByProperty(java.lang.String,
	 *      java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	public <U> List<U> findCircuitListByProperty(String searchQuery, Object val)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("searchQuery=" + searchQuery + ", val=" + val);
		}
		List<U> resultList = null;
		try {
			Query query = em.createQuery(searchQuery);
			if (val != null) {
				String searchParameter = null;
				if (val instanceof Map) {
					Set set = ((Map) val).entrySet();
					Iterator iterator = set.iterator();
					while (iterator.hasNext()) {
						Map.Entry mapEntry = (Map.Entry) iterator.next();
						if(mapEntry.getValue() instanceof String){
							searchParameter = ((String)mapEntry.getValue()).concat("%");
							query.setParameter(mapEntry.getKey().toString(),
									searchParameter);
						}else{
							query.setParameter(mapEntry.getKey().toString(),
									mapEntry.getValue());
						}
						
					}
				}
			}

			resultList = (List<U>) query.getResultList();

			if (logger.isDebugEnabled()) {
				logger.debug(((resultList == null) ? "resultList=null"
						: "resultList.size=" + resultList.size()));
			}
		} catch (PersistenceException e) {
			logger.error(ErrorConstants.CANNOT_FIND + CommonConstants.SPACE
					+ entityName, e);
			throw new RubinApplicationException(ErrorConstants.CANNOT_FIND
					+ CommonConstants.SPACE + entityName, e);
		} catch (Throwable e) {
			logger.error(e.getMessage(), e);
			throw new RubinApplicationException(
					ErrorConstants.COMMON_EXCEPTION_MESSAGE + e.getMessage(), e);
		}

		return resultList;
	}
}
