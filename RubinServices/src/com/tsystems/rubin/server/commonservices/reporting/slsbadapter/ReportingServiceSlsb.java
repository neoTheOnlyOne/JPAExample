/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: ReportingServiceSlsb.java
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
package com.tsystems.rubin.server.commonservices.reporting.slsbadapter;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.server.commonservices.auditing.slsbadapter.AuditingServiceSlsb;
import com.tsystems.rubin.server.commonservices.reporting.ReportingService;
import com.tsystems.rubin.server.commonservices.reporting.ReportingServiceFactory;
import com.tsystems.rubin.server.commonservices.reporting.to.ReportTO;
import com.tsystems.rubin.server.refdatalsc.CapacityManagementService;

/**
 * The Class ReportingServiceSlsb. - Staless session bean for delegating call to specific implementation of reporting services 
 */
@Stateless
public class ReportingServiceSlsb implements ReportingService {

    /** The logger. */
    private static org.apache.log4j.Logger logger = Logger.getLogger(AuditingServiceSlsb.class);

    /** The capacity management service. */
    @EJB
    private CapacityManagementService capacityManagementService;

    /** The reporting service. */
    private ReportingService reportingService;

    /**
     * Initialize.
     */
    @PostConstruct
    public void initialize() {
        reportingService = ReportingServiceFactory.getReportingService(capacityManagementService);
    }

    /**
     * createLscReport.
     * 
     * @param parameters
     * @param searchParameter
     * @param findBy
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.commonservices.reporting.ReportingService#createLscReport(java.util.Map,
     *      java.lang.String, java.lang.String)
     */
    public final ReportTO createLscReport(Map<String, Object> parameters, String searchParameter,
            String findBy) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry createLscReport - " + "parameters=" + parameters
                    + " ,searchParameter=" + searchParameter + " ,findBy=" + findBy);
        }
        return reportingService.createLscReport(parameters, searchParameter, findBy);
    }

    /**
     * createReport.
     * 
     * @param reportId
     * @param parameters
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.commonservices.reporting.ReportingService#createReport(java.lang.String,
     *      java.util.Map)
     */

    public final ReportTO createReport(String reportId, Map<String, Object> parameters)
            throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry createReport - " + "reportId=" + reportId + " ,parameters="
                    + parameters);
        }
        return reportingService.createReport(reportId, parameters);
    }

}