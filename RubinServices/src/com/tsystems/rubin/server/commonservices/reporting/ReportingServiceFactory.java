/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: ReportingServiceFactory.java
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
package com.tsystems.rubin.server.commonservices.reporting;

import com.tsystems.rubin.server.commonservices.reporting.impl.ReportingServiceImpl;
import com.tsystems.rubin.server.refdatalsc.CapacityManagementService;

/**
 * A factory for creating ReportingService objects.
 */
public class ReportingServiceFactory {

    /**
     * Gets the reporting service.
     * 
     * @param capacityManagementService
     *            the capacity management service
     * 
     * @return the reporting service
     */

    public static final ReportingService getReportingService(
            CapacityManagementService capacityManagementService) {
        return new ReportingServiceImpl(capacityManagementService);
    }
}
