package com.tsystems.rubin.server.transmodservices.slsbadapter;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.transmodservices.SlaService;
import com.tsystems.rubin.server.transmodservices.SlaServiceFactory;
import com.tsystems.rubin.server.transmodservices.to.SlaIndividualAndCustomerClassTO;
import com.tsystems.rubin.server.transmodservices.to.SlaRecordOfSlaIndividualTO;
import com.tsystems.rubin.server.transmodservices.to.SlaWithCustomerClassTO;

/**
 * Session Bean implementation class SlaServiceSlsb
 */
@Stateless
public class SlaServiceSlsb implements SlaService {

	/** The logger. */
	private static org.apache.log4j.Logger logger = Logger.getLogger(CircuitServiceSlsb.class);

	/** The Entity Manager. */
	@PersistenceContext
	private EntityManager em;

	/** The SlaService. */
	private SlaService slaService;

	/**
	 * Initialize.
	 */
	@PostConstruct
	public void initialize() {
		slaService = SlaServiceFactory.getSlaService(DAOFactory.getDAOFactory(DAOFactory.JPA, em));
	}

	/**
	 * @return List<SlaWithCustomerClassTO> sla with customerclass information.
	 * @throws RubinApplicationException
	 *             if any exception occurs.
	 * @see com.tsystems.rubin.server.transmodservices.SlaService#findAllSlaWithCustomerClass()
	 */
	public List<SlaWithCustomerClassTO> findAllSlaWithCustomerClass() throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findAllSlaWithCustomerClass-");
		}
		return slaService.findAllSlaWithCustomerClass();
	}

	/**
	 * Find all Slaindividuell and customerclass.
	 * 
	 * @throws RubinApplicationException
	 *             if any exception occurs.
	 * @see com.tsystems.rubin.server.transmodservices.SlaService#findAllSlaIndividuellAndCustomerClass()
	 */
	public SlaIndividualAndCustomerClassTO findAllSlaIndividuellAndCustomerClass() throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findAllSlaIndividuellAndCustomerClass-");
		}
		return slaService.findAllSlaIndividuellAndCustomerClass();
	}

	/**
	 * @see com.tsystems.rubin.server.transmodservices.SlaService#findSlaRecordsOfSlaIndividuell(java.lang.Long)
	 */
	public SlaRecordOfSlaIndividualTO findSlaRecordsOfSlaIndividuell(Long slaIndividuellId)
			throws RubinApplicationException {
		return slaService.findSlaRecordsOfSlaIndividuell(slaIndividuellId);
	}

}
