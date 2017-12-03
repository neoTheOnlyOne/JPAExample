package com.tsystems.rubin.server.transmodservices.slsbadapter;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.transmodservices.PathService;
import com.tsystems.rubin.server.transmodservices.PathServiceFactory;
import com.tsystems.rubin.server.transmodservices.to.WayTO;

/**
 * Session Bean implementation class PathService
 */
@Stateless
public class PathServiceSlsb implements PathService {

	/** The logger. */
	private static org.apache.log4j.Logger logger = Logger
			.getLogger(PathServiceSlsb.class);

	/** The em. */
	@PersistenceContext
	private EntityManager em;

	/** The circuit service. */
	private PathService pathService;

	/**
	 * Initialize.
	 */
	@PostConstruct
	public void initialize() {
		pathService = PathServiceFactory.getPathService(DAOFactory
				.getDAOFactory(DAOFactory.JPA, em));
	}
	
	/**
	 * The method will returns all the path related to a network
	 * @param networkId
	 * @return List<WayTO>
	 * @throws RubinApplicationException
	 */
	public List<WayTO> findAllPathsOfNetwork(Long networkId)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findAllNetworksOfCarrier - ");
		}
		return pathService.findAllPathsOfNetwork(networkId);
	}
}