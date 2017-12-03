/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant
 * 
 * File Name: CircuitCommonServiceSlsb.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update: Jul 10, 2009 
 * 
 * Copyright © 2008 by T-Systems International GmbH, 
 * Frankfurt/Main
 * All rights, including that of the extracts pressure, 
 * photomechanical reproduction (including microscopy),
 * and the evaluation of databases, or similar
 * organizations, reserved.
 * 
 */
package com.tsystems.rubin.server.commonbusinessservices.slsbadapter;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.server.commonbusinessservices.CircuitCommonService;
import com.tsystems.rubin.server.commonbusinessservices.CircuitCommonServiceFactory;
import com.tsystems.rubin.server.commonbusinessservices.to.PropertyTO;
import com.tsystems.rubin.server.commonbusinessservices.to.SubnetworkTO;
import com.tsystems.rubin.server.dal.DAOFactory;

/**
 * Session Bean implementation class SubnetworkSlsb
 */
@Stateless
public class CircuitCommonServiceSlsb implements CircuitCommonService {
	private static org.apache.log4j.Logger logger = Logger
			.getLogger(CircuitCommonServiceSlsb.class);

	/** The em. */
	@PersistenceContext
	private EntityManager em;

	/** The capacity management service. */
	private CircuitCommonService circuitCommonService;

	/**
	 * Initialize.
	 */
	@PostConstruct
	public void initialize() {
		circuitCommonService = CircuitCommonServiceFactory
				.getCircuitCommonService(DAOFactory.getDAOFactory(
						DAOFactory.JPA, em));
	}

	/**
	 * findAllSubnetworks.
	 * 
	 * @return
	 * @throws RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.commonbusinessservices.CircuitCommonService#findAllSubnetworks()
	 */

	public List<SubnetworkTO> findSubnetworksByLabel(String label)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findSubnetworksByLabel- " + "label = "
					+ label);
		}

		return circuitCommonService.findSubnetworksByLabel(label);
	}

	/**
	 * findAllProperties.
	 * 
	 * @return
	 * @throws RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.refdatalsc.PropertyService#findAllProperties()
	 */
	public List<PropertyTO> findAllProperties()
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findAllLayers - " + "");
		}
		return circuitCommonService.findAllProperties();
	}

	/**
	 * Find First subnet for given circuit id.
	 * 
	 * @return the <SubnetworkTO>
	 * @throws RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.commonbusinessservices.CircuitCommonService#findSubnetworksOfCircuit(java.lang.Long)
	 */
	public SubnetworkTO findFirstSubnetworksOfCircuit(Long circuitId) throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findFirstSubnetworksOfCircuit- ");
		}

		return circuitCommonService.findFirstSubnetworksOfCircuit(circuitId);
	}

	/**
	 * Find further subnet for given circuit id.
	 * 
	 * @return List <SubnetworkTO>
	 * @throws RubinApplicationException
	 * @see com.tsystems.rubin.server.commonbusinessservices.CircuitCommonService#findFurtherSubnetworksOfCircuit(java.lang.Long)
	 */
	public List<SubnetworkTO> findFurtherSubnetworksOfCircuit(Long circuitId) throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findFurtherSubnetworksOfCircuit- ");
		}

		return circuitCommonService.findFurtherSubnetworksOfCircuit(circuitId);
	}
}
