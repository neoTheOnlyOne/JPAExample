/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: AuditingServiceImpl.java
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
package com.tsystems.rubin.server.commonservices.auditing.impl;

import javax.jms.Queue;
import javax.jms.QueueConnectionFactory;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.common.util.JMSHelper;
import com.tsystems.rubin.server.commonservices.auditing.AuditingService;
import com.tsystems.rubin.server.commonservices.auditing.to.ActivityAuditTO;
import com.tsystems.rubin.server.commonutils.base.RubinMapper;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.dal.entities.ActivityAudit;

/**
 * The Class AuditingServiceImpl.-Implementation for stateless session bean to log the activities like login,log off.
 */
public class AuditingServiceImpl implements AuditingService {

    /** The dao factory. */
    private DAOFactory daoFactory;

    /** The connection factory. */
    private QueueConnectionFactory connectionFactory;

    /** The queue. */
    private Queue queue;

    /**
     * Instantiates a new auditing service impl.
     * 
     * @param daoFactory
     *            the dao factory
     * @param connectionFactory
     *            the connection factory
     * @param queue
     *            the queue
     */
    public AuditingServiceImpl(DAOFactory daoFactory, QueueConnectionFactory connectionFactory,
            Queue queue) {
        this.daoFactory = daoFactory;
        this.connectionFactory = connectionFactory;
        this.queue = queue;
    }

    /**
     * auditIndependant.
     * 
     * @param activityAuditTO the to
     * @throws RubinApplicationException the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.commonservices.auditing.AuditingService#auditIndependant(com.tsystems.rubin.server.commonservices.auditing.to.ActivityAuditTO)
     */

    public void auditIndependant(ActivityAuditTO activityAuditTO) throws RubinApplicationException {
        ActivityAudit activityAudit = (ActivityAudit) RubinMapper.getEntity(activityAuditTO,
                new ActivityAudit());
        daoFactory.getActivityAuditDAO().insert(activityAudit);
    }

    /**
     * auditDependant.
     * 
     * @param activityAuditTO the activity auditTO
     * @throws RubinApplicationException the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.commonservices.auditing.AuditingService#auditDependant(com.tsystems.rubin.server.dal.entities.ActivityAudit)
     */
    public void auditDependant(ActivityAuditTO activityAuditTO) throws RubinApplicationException {

        ActivityAudit activityAudit = (ActivityAudit) RubinMapper.getEntity(activityAuditTO,
                new ActivityAudit());
        JMSHelper.sendMessage(connectionFactory, queue, activityAudit);
    }

}
