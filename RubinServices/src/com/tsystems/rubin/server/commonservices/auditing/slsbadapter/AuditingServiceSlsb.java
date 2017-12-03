/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: AuditingServiceSlsb.java
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
package com.tsystems.rubin.server.commonservices.auditing.slsbadapter;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.jms.Queue;
import javax.jms.QueueConnectionFactory;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.server.commonservices.auditing.AuditingService;
import com.tsystems.rubin.server.commonservices.auditing.impl.AuditingServiceImpl;
import com.tsystems.rubin.server.commonservices.auditing.to.ActivityAuditTO;
import com.tsystems.rubin.server.dal.DAOFactory;

/**
 * The Class AuditingServiceSlsb.-The stateless session bean used to delegate the calls from interface to implementation.
 */
@Stateless
public class AuditingServiceSlsb implements AuditingService {

    /** The logger. */
    private static org.apache.log4j.Logger logger = Logger.getLogger(AuditingServiceSlsb.class);

    /** The connection factory. */
    @Resource(mappedName = "jms/auditLogQueueFactory")
    private QueueConnectionFactory connectionFactory;

    /** The queue. */
    @Resource(mappedName = "jms/auditLogQueue")
    private Queue queue;

    /** The entity manager. */
    @PersistenceContext
    private EntityManager entityManager;

    /** The auditing service. */
    private AuditingService auditingService;

    /**
     * Initialize.
     */
    @PostConstruct
    public void initialize() {
        auditingService = new AuditingServiceImpl(DAOFactory.getDAOFactory(DAOFactory.JPA,
                entityManager), connectionFactory, queue);

    }

    /**
     * auditIndependant.
     * 
     * @param activityAudit
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.commonservices.auditing.AuditingService#auditIndependant(com.tsystems.rubin.server.dal.entities.ActivityAudit)
     */
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void auditIndependant(ActivityAuditTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry auditIndependant - " + "to=" + to);
        }

        auditingService.auditIndependant(to);
    }

    /**
     * auditDependant.
     * 
     * @param activityAudit
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.commonservices.auditing.AuditingService#auditDependant(com.tsystems.rubin.server.dal.entities.ActivityAudit)
     */
    public void auditDependant(ActivityAuditTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry auditDependant - " + "to=" + to);
        }

        auditingService.auditDependant(to);
    }

}
