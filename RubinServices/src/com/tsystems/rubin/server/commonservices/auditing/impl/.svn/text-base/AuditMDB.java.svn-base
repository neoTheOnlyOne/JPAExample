/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: AuditMDB.java
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

import javax.annotation.PostConstruct;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.util.ErrorConstants;
import com.tsystems.rubin.server.dal.ActivityAuditDAO;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.dal.entities.ActivityAudit;

/**
 * The Class AuditMDB.-Message driven bean for listening the message related to auditing activities.
 */
@MessageDriven(activationConfig = {
        @ActivationConfigProperty(propertyName = "connectionFactoryJndiName", propertyValue = "jms/auditLogQueueFactory"),
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
        @ActivationConfigProperty(propertyName = "destinationName", propertyValue = "jms/auditLogQueue"),
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
public class AuditMDB implements MessageListener {

    /** The logger. */
    private static org.apache.log4j.Logger logger = Logger.getLogger(AuditMDB.class);

    /** The dao factory. */
    private static DAOFactory daoFactory;

    /** The em. */
    @PersistenceContext
    private EntityManager em;

    /**
     * Initialize.
     */
    @PostConstruct
    public void initialize() {
        daoFactory = DAOFactory.getDAOFactory(DAOFactory.JPA, em);
    }

    /**
     * onMessage.
     * 
     * @param message
     * 
     * @see javax.jms.MessageListener#onMessage(javax.jms.Message)
     */
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void onMessage(Message message) {

        try {

            if (logger.isDebugEnabled()) {
                logger.debug("object=" + ((ObjectMessage) message).getObject());
            }

            ObjectMessage objmsg = (ObjectMessage) message;
            ActivityAudit activityAudit = (ActivityAudit) objmsg.getObject();
            ActivityAuditDAO activityAuditDAO = daoFactory.getActivityAuditDAO();
            activityAuditDAO.insert(activityAudit);

        } catch (Exception e) {

            logger.error(ErrorConstants.MESSAGE_PROCESSING_JMSEXCEPTION, e);

        }
    }
}
