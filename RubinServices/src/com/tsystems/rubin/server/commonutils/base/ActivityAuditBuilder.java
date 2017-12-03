/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: ActivityAuditBuilder.java
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
package com.tsystems.rubin.server.commonutils.base;

import java.text.MessageFormat;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import com.tsystems.rubin.server.commonservices.auditing.to.ActivityAuditTO;
import com.tsystems.rubin.server.commonservices.usermgmt.to.UserTO;
import com.tsystems.rubin.server.dal.entities.User;

/**
 * The Class ActivityAuditBuilder. - used to create the data required for audit
 * activity.
 */
public class ActivityAuditBuilder {

    /** The Constant SESSION_TIMEOUT_MESSAGE. */
    private static final String SESSION_TIMEOUT_MESSAGE = "com.tsystems.rubin.server.commonutils.base.SESSION_TIMEOUT_MESSAGE";

    /** The Constant AUTHENTICATION_MESSAGE. */
    private static final String AUTHENTICATION_MESSAGE = "com.tsystems.rubin.server.commonutils.base.AUTHENTICATION_MESSAGE";

    /** The logger. */
    private static org.apache.log4j.Logger logger = Logger.getLogger(ActivityAuditBuilder.class);

    /** The rb. */
    private static ResourceBundle rb = ResourceBundle.getBundle("RubinServices");

    /**
     * Builds the.
     * 
     * @param activity
     *            the activity
     * @param user
     *            the user
     * 
     * @return the activity audit to
     */
    public static ActivityAuditTO build(AuthenticationActivityEnum activity, User user) {
        if (logger.isDebugEnabled()) {
            logger.debug("activity=" + activity + ", user=" + user);
        }

        ActivityAuditTO activityAuditTO = new ActivityAuditTO();

        String message = null;
        if (AuthenticationActivityEnum.LOGGED_ON.equals(activity)) {
            Object[] args = new String[]{"On", user.getWorkstation()};
            message = new MessageFormat(rb.getString(AUTHENTICATION_MESSAGE).trim()).format(args);
        } else if (AuthenticationActivityEnum.LOGGED_OFF.equals(activity)) {
            Object[] args = new String[]{"Off", user.getWorkstation()};
            message = new MessageFormat(rb.getString(AUTHENTICATION_MESSAGE).trim()).format(args);
        } else if (AuthenticationActivityEnum.TIMEDOUT.equals(activity)) {
            message = rb.getString(SESSION_TIMEOUT_MESSAGE).trim();
        }
        activityAuditTO.setActivity(message);

        activityAuditTO.setUserTO((UserTO) RubinMapper.getTO(user, new UserTO()));
        long currDateTime = System.currentTimeMillis();
        java.sql.Time currTime = new java.sql.Time(currDateTime);
        java.sql.Date currDate = new java.sql.Date(currDateTime);

        if (logger.isDebugEnabled()) {
            logger.debug("currTime : " + currTime);
            logger.debug("currDate : " + currDate);
        }
        activityAuditTO.setTime(currTime);

        activityAuditTO.setDate(currDate);

        return activityAuditTO;
    }
}
