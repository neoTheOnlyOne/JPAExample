/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: UserManagementServiceFactory.java
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
package com.tsystems.rubin.server.commonservices.usermgmt;

import com.tsystems.rubin.server.commonservices.auditing.AuditingService;
import com.tsystems.rubin.server.commonservices.usermgmt.impl.UserManagementServiceImpl;
import com.tsystems.rubin.server.dal.DAOFactory;

/**
 * A factory for creating UserManagementService objects.
 */
public class UserManagementServiceFactory {

    /**
     * Gets the user management service.
     * 
     * @param daoFactory
     *            the dao factory
     * @param auditService
     *            the audit service
     * 
     * @return the user management service
     */
    public static final UserManagementService getUserManagementService(DAOFactory daoFactory,
            AuditingService auditService) {
        return new UserManagementServiceImpl(daoFactory, auditService);
    }
}
