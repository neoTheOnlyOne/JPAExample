/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: ReportingServiceImpl.java
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
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.common.util.ReportCommonConstants;
import com.tsystems.rubin.server.commonservices.reporting.ReportingService;
import com.tsystems.rubin.server.commonservices.reporting.to.ReportTO;
import com.tsystems.rubin.server.refdatalsc.CapacityManagementService;
import com.tsystems.rubin.server.refdatalsc.to.LayerTO;
import com.tsystems.rubin.server.refdatalsc.to.LscTO;

/**
 * The Class ReportingServiceImpl. Implementaion for session bean of reporting services.
 */
public class ReportingServiceImpl implements ReportingService {

    /** The logger. */
    private static org.apache.log4j.Logger logger = Logger.getLogger(ReportingServiceImpl.class);

    /** The rb. */
    private ResourceBundle rb = ResourceBundle.getBundle("RubinServices");

    /** The capacity management service. */

    private CapacityManagementService capacityManagementService;

    /**
     * Instantiates a new reporting service impl.
     * 
     * @param capacityManagementService
     *            the capacity management service
     */
    public ReportingServiceImpl(CapacityManagementService capacityManagementService) {
        this.capacityManagementService = capacityManagementService;
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
            logger.debug("parameters=" + parameters + ", searchParameter=" + searchParameter
                    + ", findBy=" + findBy);
        }
        List<LscTO> lscTOList = null;
        ReportTO report = null;
        lscTOList = capacityManagementService.findLscByProperty(findBy, searchParameter);

        if (lscTOList != null && lscTOList.size() > 0) {
            ReportGenerator rptGen = new ReportGeneratorServerImpl();
            parameters.put("NoOfRows", "" + lscTOList.size());
            String lscReportDesignFilePath = rb
                    .getString(ReportCommonConstants.LSC_REPORT_DESIGN_FILEPATH);
            if (logger.isDebugEnabled()) {
                logger.debug("Value from Resource Bundle =" + lscReportDesignFilePath);
            }
            report = rptGen.createReport(lscReportDesignFilePath, parameters, lscTOList);
        }
        return report;
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
        ReportTO report = null;

        /* Find the type of report to generate */
        if (ReportCommonConstants.LSC_REPORT_ID.equals(reportId)) {
            /* Call a function that will handle the Lsc report generation */
            report = createLscReport(parameters);
        } else if (ReportCommonConstants.LAYER_REPORT_ID.equals(reportId)) {
            /* Call a function that will handle the Layer report generation */
            report = createLayerReport(parameters);
        }
        return report;
    }

    /**
     * Creates the lsc report.
     * 
     * @param parameters
     *            the parameters
     * 
     * @return the report to
     * 
     * @throws RubinApplicationException
     *             the rubin application exception
     */
    private ReportTO createLscReport(Map<String, Object> parameters)
            throws RubinApplicationException {
        ReportTO report = null;
        String searchParameter = (String) parameters
                .get(ReportCommonConstants.LSC_REPORT_SEARCHPARAMETER);
        String findBy = (String) parameters.get(ReportCommonConstants.LSC_REPORT_FINDBY);
        if (logger.isDebugEnabled()) {
            logger.debug("parameters=" + parameters + ", searchParameter=" + searchParameter
                    + ", findBy=" + findBy);
        }
        List<LscTO> lscTOList = null;
        lscTOList = capacityManagementService.findLscByProperty(findBy, searchParameter);
        if (lscTOList != null && lscTOList.size() > 0) {
            ReportGenerator rptGen = new ReportGeneratorServerImpl();
            parameters.put("NoOfRows", "" + lscTOList.size());
            String lscReportDesignFilePath = rb
                    .getString(ReportCommonConstants.LSC_REPORT_DESIGN_FILEPATH);
            if (logger.isDebugEnabled()) {
                logger.debug("Value from Resource Bundle =" + lscReportDesignFilePath);
            }
            report = rptGen.createReport(lscReportDesignFilePath, parameters, lscTOList);
        }
        return report;
    }

    /**
     * Creates the layer report.
     * 
     * @param parameters
     *            the parameters
     * 
     * @return the report to
     * 
     * @throws RubinApplicationException
     *             the rubin application exception
     */
    private ReportTO createLayerReport(Map<String, Object> parameters)
            throws RubinApplicationException {
        ReportTO report = null;
        List<LayerTO> layerTOList = null;
        layerTOList = capacityManagementService.findAllLayers();
        if (layerTOList != null && layerTOList.size() > 0) {
            ReportGenerator rptGen = new ReportGeneratorServerImpl();
            parameters.put("NoOfRows", "" + layerTOList.size());
            String layerReportDesignFilePath = rb
                    .getString(ReportCommonConstants.LAYER_REPORT_DESIGN_FILEPATH);
            if (logger.isDebugEnabled()) {
                logger.debug("Value from Resource Bundle =" + layerReportDesignFilePath);
            }
            report = rptGen.createReport(layerReportDesignFilePath, parameters, layerTOList);
        }
        return report;
    }

}
