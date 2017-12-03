/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: GenericDAO.java
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
package com.tsystems.rubin.server.dal;

import java.io.Serializable;
import java.util.List;

import com.tsystems.rubin.common.exception.RubinApplicationException;

/**
 * The generic dao interface.
 * 
 * @param <T>
 *            the <T>
 * @param <ID>
 *            the <ID>
 * 
 *            The Interface GenericDAO.
 */
public interface GenericDAO<T, ID extends Serializable> {

	/**
	 * Find by id.
	 * 
	 * @param id
	 *            the id
	 * 
	 * @return the t
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public T findById(ID id) throws RubinApplicationException;

	/**
	 * Find by property.
	 * 
	 * @param prop
	 *            the prop
	 * @param val
	 *            the val
	 * @param <U>
	 *            the <U>
	 * 
	 * @return the list< U> the list< U>
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public <U> List<U> findByProperty(String prop, Object val)
			throws RubinApplicationException;

	/**
	 * Find single by property.
	 * 
	 * @param prop
	 *            the prop
	 * @param val
	 *            the val
	 * @param <U>
	 *            the <U>
	 * 
	 * @return the u
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public <U> U findSingleByProperty(String prop, Object val)
			throws RubinApplicationException;

	/**
	 * Count by property.
	 * 
	 * @param prop
	 *            the prop
	 * @param val
	 *            the val
	 * 
	 * @return the long
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public Long countByProperty(String prop, Object val)
			throws RubinApplicationException;

	/**
	 * Find all.
	 * 
	 * @return the list< t>
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public List<T> findAll() throws RubinApplicationException;

	/**
	 * Insert.
	 * 
	 * @param entity
	 *            the entity
	 * 
	 * @return the t
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public T insert(T entity) throws RubinApplicationException;

	/**
	 * Update.
	 * 
	 * @param entity
	 *            the entity
	 * 
	 * @return the t
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public T update(T entity) throws RubinApplicationException;

	/**
	 * Delete.
	 * 
	 * @param id
	 *            the id
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public void delete(ID id) throws RubinApplicationException;

	public <U> List<U> findCircuitListByProperty(String searchQuery, Object val)
			throws RubinApplicationException;
}
