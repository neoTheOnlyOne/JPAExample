/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: RubinMapper.java
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
package com.tsystems.rubin.server.commonutils.base;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;

/**
 * The Class RubinMapper. Helper class for mapping Transfer objects and entities using underlying dozer mapper. 
 */
public class RubinMapper {

    /** The Constant HAS_NO_PARENT. */
    public static final String HAS_NO_PARENT = "HasNoParent";

    /** The Constant HAS_PARENT. */
    public static final String HAS_PARENT = "HasParent";
    
    /** The Constant FIND_CIRCUIT_FOR_UPDATE. */
    public static final String FIND_CIRCUIT_FOR_UPDATE = "FindCircuitForUpdate";
    
    /** The Constant FIND_CARRIER_CUSTOMER_SLA_OF_CIRCUIT. */
    public static final String FIND_CARRIER_CUSTOMER_SLA_OF_CIRCUIT = "FindCarrierCustomerSlaOfCircuit";
    
    /** The Constant INSERT_CIRCUIT. */
    public static final String INSERT_CIRCUIT = "insertCircuit";
    
    /** The Constant INSERT_CIRCUIT_ROUTING. */
    public static final String INSERT_CIRCUIT_ROUTING = "insertCircuitRouting";
    
    /** The Constant INSERT_CIRCUIT_CWO. */
    public static final String INSERT_CIRCUIT_CWO = "insertCircuitCWO";
    
    /** The Constant INSERT_CIRCUIT_SLA_INDIVIDUAL. */
    public static final String INSERT_CIRCUIT_SLA_INDIVIDUAL = "insertCircuitSlaIndividual";
    
    /** The Constant INSERT_CIRCUIT. */
    public static final String CENTRAL_SYSTEM_DATA_MAPPING = "centralSyetemDataMapping";

    // Generalized mappings.
    /**
     * Gets the tO.
     * 
     * @param entity
     *            the entity
     * @param to
     *            the to
     * 
     * @return the tO
     */
    public static Object getTO(Object entity, Object to) {
        Mapper mapper = DozerBeanMapperSingletonWrapper.getInstance();
        mapper.map(entity, to);
        return to;

    }

    /**
     * Gets the entity.
     * 
     * @param to
     *            the to
     * @param entity
     *            the entity
     * 
     * @return the entity
     */
    public static Object getEntity(Object to, Object entity) {
        Mapper mapper = DozerBeanMapperSingletonWrapper.getInstance();
        mapper.map(to, entity);
        return entity;
    }

    /**
     * Gets the entity.
     * 
     * @param to
     *            the to
     * @param entity
     *            the entity
     * @param mapperContextCase
     *            the mapper context case
     * 
     * @return the entity
     */
    public static Object getEntity(Object to, Object entity, String mapperContextCase) {
        Mapper mapper = DozerBeanMapperSingletonWrapper.getInstance();
        mapper.map(to, entity, mapperContextCase);
        return entity;
    }

    /**
     * Gets the tO.
     * 
     * @param entity
     *            the entity
     * @param to
     *            the to
     * @param mapperContextCase
     *            the mapper context case
     * 
     * @return the tO
     */
    public static Object getTO(Object entity, Object to, String mapperContextCase) {
        Mapper mapper = DozerBeanMapperSingletonWrapper.getInstance();
        mapper.map(entity, to, mapperContextCase);
        return to;
    }
}
