/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: UserManagementServiceImpl.java
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
package com.tsystems.rubin.server.commonservices.usermgmt.impl;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.common.util.ErrorConstants;
import com.tsystems.rubin.common.util.NamedQueryConstants;
import com.tsystems.rubin.server.commonservices.auditing.AuditingService;
import com.tsystems.rubin.server.commonservices.auditing.to.ActivityAuditTO;
import com.tsystems.rubin.server.commonservices.usermgmt.UserManagementService;
import com.tsystems.rubin.server.commonservices.usermgmt.to.TransPermissionsTO;
import com.tsystems.rubin.server.commonservices.usermgmt.to.UserTO;
import com.tsystems.rubin.server.commonutils.base.ActivityAuditBuilder;
import com.tsystems.rubin.server.commonutils.base.AuthenticationActivityEnum;
import com.tsystems.rubin.server.commonutils.base.RubinMapper;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.dal.dvo.TransPermissionsDVO;
import com.tsystems.rubin.server.dal.entities.ProtectedResource;
import com.tsystems.rubin.server.dal.entities.User;

/**
 * The Class UserManagementServiceImpl. - implementation for user management session bean interface
 * contains business logic for user management related activities.
 */
public class UserManagementServiceImpl implements UserManagementService {

    /** The logger. */
    private static org.apache.log4j.Logger logger = Logger
            .getLogger(UserManagementServiceImpl.class);

    /** The dao factory. */
    private DAOFactory daoFactory;

    /** The DA y_ dif f_ allowed. */
    private static double DAY_DIFF_ALLOWED = 1.0;

    /** The auditing services. */
    private AuditingService auditingServices;

    /**
     * Instantiates a new user management service impl.
     * 
     * @param daoFactory
     *            the dao factory
     * @param auditingServices
     *            the auditing services
     */
    public UserManagementServiceImpl(DAOFactory daoFactory, AuditingService auditingServices) {
        this.daoFactory = daoFactory;
        this.auditingServices = auditingServices;
    }

    /**
     * login.
     * 
     * @param to
     * 
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystem.rubin.server.refdatalsc.interfaces.LoginServicesRemote#login(String,
     *      String)
     */
    public UserTO login(String userId, String password) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("userId=" + userId + ", password=" + password);
        }

        User user = null;
        try {
            user = (User) daoFactory.getUserDAO().findSingleByProperty(
                    NamedQueryConstants.USER_FINDBYUSERID, userId);
        } catch (RubinApplicationException e) {
            logger.error(ErrorConstants.ENTITY_NOT_EXISTS);
            throw new RubinApplicationException(e.getMessage());
        }

        if (user != null) {
            if (password.equals(user.getPassword())) {
                Set<ProtectedResource> protectedResourceCollection = user.getUserGroup()
                        .getProtectedResources();

                if (protectedResourceCollection != null) {
                    logger.debug("protectedResourceCollection.size="
                            + protectedResourceCollection.size());
                } else {
                    logger.debug("protectedResourceCollection=null");
                }

                user.setOnline("Y");
                user.setLastActivityDate(getCurrentAppServerDate());
                daoFactory.getUserDAO().update(user);

                ActivityAuditTO activityAudit = ActivityAuditBuilder.build(
                        AuthenticationActivityEnum.LOGGED_ON, user);
                auditingServices.auditDependant(activityAudit);
            } else {
                logger.error(ErrorConstants.LOGIN_FAILURE_MESSAGE);
                throw new RubinApplicationException(ErrorConstants.LOGIN_FAILURE_MESSAGE);
            }
        } else {
            logger.error(ErrorConstants.ENTITY_NOT_EXISTS);
            throw new RubinApplicationException(ErrorConstants.ENTITY_NOT_EXISTS);
        }

        return (UserTO) RubinMapper.getTO(user, new UserTO());
    }

    /**
     * logOff.
     * 
     * @param certificateNr
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystem.rubin.server.refdatalsc.interfaces.LoginServicesRemote#logOff(long)
     */
    public boolean logOff(long certificateNr) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("certificateNr=" + certificateNr);
        }

        User user = daoFactory.getUserDAO().findById(certificateNr);

        ActivityAuditTO activityAuditTO = null;
        if (user != null) {
            user.setOnline("N");

            daoFactory.getUserDAO().update(user);

            activityAuditTO = ActivityAuditBuilder.build(AuthenticationActivityEnum.LOGGED_OFF,
                    user);
        }
        auditingServices.auditDependant(activityAuditTO);

        return user != null;
    }

    /**
     * changePassword.
     * 
     * @param userId
     * @param password
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.commonservices.usermgmt.UserManagementService#changePassword(java.lang.String,
     *      java.lang.String)
     */
    public void changePassword(String userId, String password) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("userId=" + userId + ", password=" + password);
        }

        User user = (User) daoFactory.getUserDAO().findSingleByProperty(
                NamedQueryConstants.USER_FINDBYUSERID, userId);
        Date currentDate = getCurrentAppServerDate();
        user.setPassword(password);
        user.setPasswordChangeDate(currentDate);
        user.setLastActivityDate(currentDate);
        daoFactory.getUserDAO().update(user);
    }

    /**
     * findUser.
     * 
     * @param userId
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.commonservices.usermgmt.UserManagementService#findUser(java.lang.String)
     */
    public UserTO findUser(String userId) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("userId=" + userId);
        }
        User user = (User) daoFactory.getUserDAO().findSingleByProperty(
                NamedQueryConstants.USER_FINDBYUSERID, userId);
        return (UserTO) RubinMapper.getTO(user, new UserTO());
    }

    /**
     * requireReLogin.
     * 
     * @param userId
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.commonservices.usermgmt.UserManagementService#requireReLogin(java.lang.String)
     */
    public UserTO requireReLogin(String userId) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("userId=" + userId);
        }

        UserTO userTO = null;

        try {
            User user = (User) daoFactory.getUserDAO().findSingleByProperty(
                    NamedQueryConstants.USER_FINDBYUSERID, userId);

            if ("Y".equalsIgnoreCase(user.getOnline())) {

                long lastActivityTime = user.getLastActivityDate().getTime();

                long currentTime = getCurrentAppServerTime();

                double timeDifference = currentTime - lastActivityTime;

                double dayDifference = timeDifference / (1000.0 * 60.0 * 60.0 * 24.0);

                if (logger.isDebugEnabled()) {
                    logger.debug("lastActivityTime in long=" + lastActivityTime);
                    logger.debug("currentTime in long=" + currentTime);
                    logger.debug("timeDifference in long=" + timeDifference);
                    logger.debug("dayDifference in double=" + dayDifference);
                    logger.debug("Days=" + dayDifference);
                }

                if (dayDifference < DAY_DIFF_ALLOWED) {
                    Set<ProtectedResource> protectedResourceCollection = user.getUserGroup()
                            .getProtectedResources();

                    if (protectedResourceCollection != null) {
                        logger.debug("protectedResourceCollection.size="
                                + protectedResourceCollection.size());
                    } else {
                        logger.debug("protectedResourceCollection=null");
                    }

                    userTO = (UserTO) RubinMapper.getTO(user, new UserTO());

                    // if userTO is null relogin is required.
                    if (userTO == null) {

                        ActivityAuditTO activityAuditTO = ActivityAuditBuilder.build(
                                AuthenticationActivityEnum.TIMEDOUT, user);
                        auditingServices.auditDependant(activityAuditTO);
                    }
                }
            }
        } catch (RubinApplicationException e) {
            logger.error(e.getMessage(), e);
            throw new RubinApplicationException(e.getMessage(), e);
        } catch (Throwable e) {
            logger.error(ErrorConstants.COMMON_EXCEPTION_MESSAGE + e.getMessage(), e);
            throw new RubinApplicationException(ErrorConstants.COMMON_EXCEPTION_MESSAGE
                    + e.getMessage(), e);
        }

        return userTO;
    }

    /**
     * Gets the current app server date.
     * 
     * @return the current app server date
     * 
     * @throws RubinApplicationException
     *             the rubin application exception
     */
    private Date getCurrentAppServerDate() throws RubinApplicationException {

        long seconds = getCurrentAppServerTime();
        Date date = new Date(seconds);

        return date;
    }

    /**
     * Gets the current app server time.
     * 
     * @return the current app server time
     * 
     * @throws RubinApplicationException
     *             the rubin application exception
     */
    private long getCurrentAppServerTime() throws RubinApplicationException {

        long seconds = System.currentTimeMillis();

        return seconds;
    }

	/**
	 * Get the circuit dependent user's display, update and delete permissions.
	 * 
	 * @param circuitId
	 *            Circuit id.
	 * @param userId
	 *            User id.
	 * @return TransPermissionsTO contains user's display, update and delete
	 *         permissions.
	 * @throws RubinApplicationException
	 *             if any exception occurs.
	 */
	public TransPermissionsTO getCircuitDependentPermissions(Long circuitId, Long userId)
			throws RubinApplicationException {

		TransPermissionsDVO transPermissionsDVO = null;
		TransPermissionsTO transPermissionsTO = new TransPermissionsTO();

		Map<Integer, Long> map = new TreeMap<Integer, Long>();
		map.put(1, userId);
		map.put(2, circuitId);

		transPermissionsDVO = daoFactory.getTransPermissionDAO().<TransPermissionsDVO> findSingleByProperty(
				NamedQueryConstants.TRANSPERMISSION_FINDUSERPERMISSIONSBYUSERIDANDCIRCUITID, map);
		String displaySecurity = transPermissionsDVO.getDisSecurity().trim();
		String updateSecurity = transPermissionsDVO.getUpdSecurity().trim();
		String deleteSecurity = transPermissionsDVO.getDelSecurity().trim();

		if (displaySecurity != null && displaySecurity.equalsIgnoreCase("Y")) {
			transPermissionsTO.setDisplayAllowed(true);
		}
		if (updateSecurity != null && updateSecurity.equalsIgnoreCase("Y")) {
			transPermissionsTO.setUpdateAllowed(true);
		}
		if (deleteSecurity != null && deleteSecurity.equalsIgnoreCase("Y")) {
			transPermissionsTO.setDeleteAllowed(true);
		}

		return transPermissionsTO;
	}
}
