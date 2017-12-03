/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: ReportGeneratorServerImpl.java
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
 * The Class ReportGeneratorServerImpl.-Implementation for report generator that will delegate call to Jasper Specific classes.
 */
public class ReportGeneratorServerImpl implements ReportGenerator {

    /**
     * createReport.
     * 
     * @param reportDesignFilePath
     * @param parameters
     * @param listTo
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.commonservices.reporting.impl.ReportGenerator#createReport(java.lang.String,
     *      java.util.Map, java.util.List)
     */

    @SuppressWarnings("unchecked")
    public final ReportTO createReport(String reportDesignFilePath, Map<String, Object> parameters,
            List listTo) throws RubinApplicationException {

        ReportGeneratorJasperAdapter rgja = new ReportGeneratorJasperAdapter();

        return rgja.createReport(reportDesignFilePath, parameters, listTo);
    }

}
