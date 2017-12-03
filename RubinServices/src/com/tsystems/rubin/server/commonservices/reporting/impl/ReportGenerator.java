/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: ReportGenerator.java
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
package com.tsystems.rubin.server.commonservices.reporting.impl;

import java.util.List;
import java.util.Map;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.server.commonservices.reporting.to.ReportTO;

/**
 * The Interface ReportGenerator.-Interface for creating report.
 */
public interface ReportGenerator {

    /**
     * Creates the report.
     * 
     * @param reportDesignFilePath
     *            the report design file path
     * @param parameters
     *            the parameters
     * @param listTo
     *            the list to
     * 
     * @return the report to
     * 
     * @throws RubinApplicationException
     *             the rubin application exception
     */
    @SuppressWarnings("unchecked")
    public ReportTO createReport(String reportDesignFilePath, Map<String, Object> parameters,
            List listTo) throws RubinApplicationException;
}
