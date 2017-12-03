package com.tsystems.rubin.server.transmodservices.slsbadapter;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.transmodservices.NetworkService;
import com.tsystems.rubin.server.transmodservices.NetworkServiceFactory;
import com.tsystems.rubin.server.transmodservices.to.NetworkTO;

/**
 * Session Bean implementation class NetworkService
 */
@Stateless
public class NetworkServiceSlsb implements NetworkService {

	/** The logger. */
	private static org.apache.log4j.Logger logger = Logger
			.getLogger(NetworkServiceSlsb.class);

	/** The em. */
	@PersistenceContext
	private EntityManager em;

	/** The circuit service. */
	private NetworkService networkService;

	/**
	 * Initialize.
	 */
	@PostConstruct
	public void initialize() {
		networkService = NetworkServiceFactory.getNetworkService(DAOFactory
				.getDAOFactory(DAOFactory.JPA, em));
	}
	
	/**
     * The method will returns all the Network assigned to a Carrier
     * @param carrierId Long
     * @return List<NetworkTO>
     * @throws RubinApplicationException
     */
	public List<NetworkTO> findAllNetworksOfCarrier(Long carrierId)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findAllNetworksOfCarrier - ");
		}
		return networkService.findAllNetworksOfCarrier(carrierId);
	}
}