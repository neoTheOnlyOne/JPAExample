/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: AuditingServiceFactory.java
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
package com.tsystems.rubin.server.commonservices.auditing;

import javax.jms.Queue;
import javax.jms.QueueConnectionFactory;

import com.tsystems.rubin.server.commonservices.auditing.impl.AuditingServiceImpl;
import com.tsystems.rubin.server.dal.DAOFactory;

/**
 * A factory for creating AuditingService objects.
 */
public class AuditingServiceFactory {

    /**
     * Gets the auditing service.
     * 
     * @param daoFactory
     *            the dao factory
     * @param connectionFactory
     *            the connection factory
     * @param queue
     *            the queue
     * 
     * @return the auditing service
     */
    public static final AuditingService getAuditingService(DAOFactory daoFactory,
            QueueConnectionFactory connectionFactory, Queue queue) {
        return new AuditingServiceImpl(daoFactory, connectionFactory, queue);
    }

}
