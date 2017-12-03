/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.transmodservices.impl.SlaServiceImpl.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update:  Jul 28, 2009
 * 
 * Copyright © 2008 by T-Systems International GmbH, 
 * Frankfurt/Main
 * All rights, including that of the extracts pressure, 
 * photomechanical reproduction (including microscopy),
 * and the evaluation of databases, or similar
 * organizations, reserved.
 **/
package com.tsystems.rubin.server.transmodservices.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.common.util.NamedQueryConstants;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.dal.dvo.SlaDVO;
import com.tsystems.rubin.server.dal.dvo.SlaIndividualDVO;
import com.tsystems.rubin.server.dal.dvo.SlaRecordIndividualDVO;
import com.tsystems.rubin.server.transmodservices.SlaService;
import com.tsystems.rubin.server.transmodservices.to.SlaIndividualAndCustomerClassTO;
import com.tsystems.rubin.server.transmodservices.to.SlaIndividualTO;
import com.tsystems.rubin.server.transmodservices.to.SlaRecordIndividualTO;
import com.tsystems.rubin.server.transmodservices.to.SlaRecordOfSlaIndividualTO;
import com.tsystems.rubin.server.transmodservices.to.SlaTO;
import com.tsystems.rubin.server.transmodservices.to.SlaWithCustomerClassTO;

public class SlaServiceImpl implements SlaService {

	private static org.apache.log4j.Logger logger = Logger.getLogger(CircuitServiceImpl.class);

	/**
	 * The dao factory.
	 */
	DAOFactory daoFactory;

	public SlaServiceImpl(DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	/**
	 * Find All Sla with customerclass.
	 * 
	 * @throws RubinApplicationException
	 *             if any exception occurs.
	 * @return List<SlaWithCustomerClassTO> contains sla with customerclass
	 *         information.
	 * @see com.tsystems.rubin.server.transmodservices.SlaService#findAllSlaWithCustomerClass()
	 */
	public List<SlaWithCustomerClassTO> findAllSlaWithCustomerClass() throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("");
		}
		List<SlaDVO> slaDVOList = daoFactory.getSlaDAO().<SlaDVO> findByProperty(
				NamedQueryConstants.SLA_FINDALLSLAWITHCUSTOMERCLASS, null);
		List<SlaWithCustomerClassTO> slaWithCustomerClassTOList = new ArrayList<SlaWithCustomerClassTO>();
		SlaWithCustomerClassTO slaWithCustomerClassTO = null;
		SlaTO slaTO = null;
		
		for (SlaDVO slaDVO : slaDVOList) {

			slaTO = new SlaTO(slaDVO.getId(), slaDVO.getName(), slaDVO.getCustomerclassTO());
			slaWithCustomerClassTO = new SlaWithCustomerClassTO(slaTO);
			slaWithCustomerClassTOList.add(slaWithCustomerClassTO);
		}
		return slaWithCustomerClassTOList;
	}

	/**
	 * @see com.tsystems.rubin.server.transmodservices.SlaService#findAllSlaIndividuellAndCustomerClass()
	 */
	public SlaIndividualAndCustomerClassTO findAllSlaIndividuellAndCustomerClass() throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("");
		}

		List<SlaIndividualDVO> slaIndividualDVOList = daoFactory.getSlaIndividualDAO()
				.<SlaIndividualDVO> findByProperty(
						NamedQueryConstants.SLA_INDIVIDUAL_FINDSLAINDIVIDUALANDCUSTOMERCLASS, null);

		List<SlaIndividualTO> slaIndividualTOList = new ArrayList<SlaIndividualTO>();
		SlaIndividualAndCustomerClassTO slaIndividuellAndCustomerClassTO = null;
		SlaIndividualTO slaIndividualTO = null; 
		
		if (slaIndividualDVOList != null && !slaIndividualDVOList.isEmpty()) {
			
			for (SlaIndividualDVO slaIndividualDVO : slaIndividualDVOList) {
				slaIndividualTO = new SlaIndividualTO(slaIndividualDVO.getId(), slaIndividualDVO.getName(),
						slaIndividualDVO.getDateUpdated(), slaIndividualDVO.getUpdatedBy(), slaIndividualDVO.getSlaTO());

				slaIndividualTOList.add(slaIndividualTO);
			}

			slaIndividuellAndCustomerClassTO = new SlaIndividualAndCustomerClassTO();
			slaIndividuellAndCustomerClassTO.setSlaIndividualTO(slaIndividualTOList);
		}

		return slaIndividuellAndCustomerClassTO;
	}

	/**
	 * @see com.tsystems.rubin.server.transmodservices.SlaService#findSlaRecordsOfSlaIndividuell(java.lang.Long)
	 */
	public SlaRecordOfSlaIndividualTO findSlaRecordsOfSlaIndividuell(Long slaIndividuellId)
			throws RubinApplicationException {

		List<SlaRecordIndividualDVO> slaRecordIndividualDVOList = daoFactory.getSlaRecordIndividualDAO()
				.<SlaRecordIndividualDVO> findByProperty(
						NamedQueryConstants.SLA_RECORD_INDIVIDUAL_FINDSLARECORDSOFSLAINDIVIDUAL, slaIndividuellId);
		List<SlaRecordIndividualTO> slaRecordIndividuellTOList = new ArrayList<SlaRecordIndividualTO>();
		SlaRecordOfSlaIndividualTO slaRecordOfSlaIndividualTO = null;
		SlaRecordIndividualTO slaRecordIndividualTO = null;

		if (slaRecordIndividualDVOList != null) {

			for (SlaRecordIndividualDVO slaRecordIndividualDVO : slaRecordIndividualDVOList) {
				slaRecordIndividualTO = new SlaRecordIndividualTO(slaRecordIndividualDVO.getId(),
						slaRecordIndividualDVO.getSortingOrderNumber(), slaRecordIndividualDVO.getValue(),
						slaRecordIndividualDVO.getSlaRecordTO());
				slaRecordIndividuellTOList.add(slaRecordIndividualTO);
			}
			slaRecordOfSlaIndividualTO = new SlaRecordOfSlaIndividualTO(slaRecordIndividuellTOList);
		}

		return slaRecordOfSlaIndividualTO;
	}
}
