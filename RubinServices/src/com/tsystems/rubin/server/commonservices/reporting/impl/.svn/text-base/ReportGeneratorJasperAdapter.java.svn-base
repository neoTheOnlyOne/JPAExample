/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: ReportGeneratorJasperAdapter.java
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

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.common.util.CommonConstants;
import com.tsystems.rubin.common.util.ErrorConstants;
import com.tsystems.rubin.server.commonservices.reporting.to.ReportTO;

/**
 * The Class ReportGeneratorJasperAdapter.-Helper class which uses jasper specific api for report generator .
 */
public class ReportGeneratorJasperAdapter {

    /** The logger. */
    private Logger logger = Logger.getLogger(ReportGeneratorJasperAdapter.class);

    /**
     * Instantiates a new report generator jasper adapter.
     */
    public ReportGeneratorJasperAdapter() {
    }

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
    public final ReportTO createReport(String reportDesignFilePath, Map<String, Object> parameters,
            List listTo) throws RubinApplicationException {
        ReportTO report = new ReportTO();

        JasperReport jReport = null;

        try {
            /* Load compiled report design */
            if (logger.isDebugEnabled()) {
                logger.debug("Report Design file : " + reportDesignFilePath);
            }
            jReport = (JasperReport) JRLoader.loadObjectFromLocation(reportDesignFilePath);
            if (logger.isDebugEnabled()) {
                logger.debug("jReport : " + jReport);
            }

            if (jReport != null) {
                /* Create a Jasper print */
                JRBeanCollectionDataSource collectionDataSrc = new JRBeanCollectionDataSource(
                        listTo);

                JasperPrint print = null;
                print = JasperFillManager.fillReport(jReport, parameters, collectionDataSrc);

                /*
                 * Set this JasperObject containing the final report to Report
                 * wrapper class
                 */
                if (logger.isDebugEnabled()) {
                    logger.debug("print : " + print);
                }
                report.setReport(print);
            } else {
                throw new RubinApplicationException(ErrorConstants.REPORT_GENERATION_FAILED);
            }
        } catch (JRException e) {
            logger.error(ErrorConstants.REPORT_GENERATION_FAILED + CommonConstants.LINE_SEPARATOR
                    + e.getMessage(), e);
            throw new RubinApplicationException(ErrorConstants.REPORT_GENERATION_FAILED
                    + CommonConstants.LINE_SEPARATOR + e.getMessage());
        } catch (Throwable e) {
            logger.error(ErrorConstants.COMMON_EXCEPTION_MESSAGE + e.getMessage(), e);
            throw new RubinApplicationException(ErrorConstants.COMMON_EXCEPTION_MESSAGE
                    + e.getMessage(), e);
        }

        return report;
    }
}
