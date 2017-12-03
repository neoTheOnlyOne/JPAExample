package com.tsystems.rubin.server.transmodservices.slsbadapter;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.transmodservices.CarrierService;
import com.tsystems.rubin.server.transmodservices.CarrierServiceFactory;
import com.tsystems.rubin.server.transmodservices.to.CarrierTO;

/**
 * Session Bean implementation class CarrierServiceSlsb
 */
@Stateless
public class CarrierServiceSlsb implements CarrierService {

	/** The logger. */
	private static org.apache.log4j.Logger logger = Logger
			.getLogger(CarrierServiceSlsb.class);

	/** The em. */
	@PersistenceContext
	private EntityManager em;

	/** The carrier service. */
	private CarrierService carrierService;

	/**
	 * Initialize.
	 */
	@PostConstruct
	public void initialize() {
		carrierService = CarrierServiceFactory.getCarrierService(DAOFactory
				.getDAOFactory(DAOFactory.JPA, em));
	}

	public List<CarrierTO> findCarrierlistBySearchCriteria(String searchType,
			Map<String, Object> searchParams) throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findCarrierlistBySearchCriteria - "
					+ "searchType=" + searchType + ", searchParams=" + searchParams);
		}
		return carrierService.findCarrierlistBySearchCriteria(searchType, searchParams);
	}

}
