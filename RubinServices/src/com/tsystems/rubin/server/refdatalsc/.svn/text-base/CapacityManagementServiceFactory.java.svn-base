/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: CapacityManagementServiceFactory.java
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
package com.tsystems.rubin.server.refdatalsc;

import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.refdatalsc.impl.CapacityManagementServiceImpl;

/**
 * A factory for creating CapacityManagementService objects.
 */
public class CapacityManagementServiceFactory {

    /**
     * Gets the capacity management service.
     * 
     * @param daoFactory
     *            the dao factory
     * 
     * @return the capacity management service
     */
    public static final CapacityManagementService getCapacityManagementService(DAOFactory daoFactory) {
        return new CapacityManagementServiceImpl(daoFactory);
    }
}
