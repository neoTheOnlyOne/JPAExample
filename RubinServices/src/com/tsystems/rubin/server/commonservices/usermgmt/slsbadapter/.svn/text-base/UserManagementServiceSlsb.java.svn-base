/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: UserManagementServiceSlsb.java
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
package com.tsystems.rubin.server.commonservices.usermgmt.slsbadapter;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.server.commonservices.auditing.AuditingService;
import com.tsystems.rubin.server.commonservices.usermgmt.UserManagementService;
import com.tsystems.rubin.server.commonservices.usermgmt.UserManagementServiceFactory;
import com.tsystems.rubin.server.commonservices.usermgmt.to.TransPermissionsTO;
import com.tsystems.rubin.server.commonservices.usermgmt.to.UserTO;
import com.tsystems.rubin.server.dal.DAOFactory;

/**
 * The Class UserManagementServiceSlsb. - stateless session bean for delegating call from interface to implementation.
 */
@Stateless
public class UserManagementServiceSlsb implements UserManagementService {

    /** The logger. */
    private static org.apache.log4j.Logger logger = Logger
            .getLogger(UserManagementServiceSlsb.class);

    /** The auditing service. */
    @EJB
    private AuditingService auditingService;

    /** The entity manager. */
    @PersistenceContext
    private EntityManager entityManager;

    /** The user management service. */
    private UserManagementService userManagementService;

    /**
     * Initialize.
     */
    @PostConstruct
    public void initialize() {
        userManagementService = UserManagementServiceFactory.getUserManagementService(DAOFactory
                .getDAOFactory(DAOFactory.JPA, entityManager), auditingService);
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
            logger.debug("Call entry login - " + "userId=" + userId + " ,password=" + password);
        }
        return userManagementService.login(userId, password);
    }

    /**
     * logOff.
     * 
     * @param id
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystem.rubin.server.refdatalsc.interfaces.LoginServicesRemote#logOff(long)
     */

    public boolean logOff(long id) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry logOff - " + "id=" + id + ")");
        }

        return userManagementService.logOff(id);
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
            logger.debug("Call entry changePassword - " + "userId=" + userId + " ,password="
                    + password);
        }
        userManagementService.changePassword(userId, password);
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
            logger.debug("Call entry findUser - " + "userId=" + userId);
        }
        return userManagementService.findUser(userId);
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
            logger.debug("Call entry requireReLogin - " + "userId=" + userId);
        }
        return userManagementService.requireReLogin(userId);
    }

	/**
	 * @see com.tsystems.rubin.server.commonservices.usermgmt.UserManagementService#getCircuitDependentPermissions(java.lang.Long, java.lang.Long)
	 */
	public TransPermissionsTO getCircuitDependentPermissions(Long circuitId, Long userId)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry getCircuitDependentPermissions - " + "userId = " + userId + " circuitId = "
					+ circuitId);
		}
		return userManagementService.getCircuitDependentPermissions(circuitId, userId);
	}
}
