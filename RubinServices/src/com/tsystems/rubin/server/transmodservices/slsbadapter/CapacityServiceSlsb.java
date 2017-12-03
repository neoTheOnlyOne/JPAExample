package com.tsystems.rubin.server.transmodservices.slsbadapter;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.transmodservices.CapacityService;
import com.tsystems.rubin.server.transmodservices.CapacityServiceFactory;
import com.tsystems.rubin.server.transmodservices.to.CapacityValueTO;

/**
 * Session Bean implementation class CapacityServiceSlsb
 */
@Stateless
public class CapacityServiceSlsb implements CapacityService {

	/** The logger. */
	private static org.apache.log4j.Logger logger = Logger
			.getLogger(CapacityServiceSlsb.class);

	/** The em. */
	@PersistenceContext
	private EntityManager em;

	/** The capacity service. */
	private CapacityService capacityService;

	/**
	 * Initialize.
	 */
	@PostConstruct
	public void initialize() {
		capacityService = CapacityServiceFactory.getCapacityService(DAOFactory
				.getDAOFactory(DAOFactory.JPA, em));
	}

	public List<CapacityValueTO> findAllCapacityValues()
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findAllCapacityValues - ");
		}
		return capacityService.findAllCapacityValues();
	}

}
