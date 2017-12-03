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
import com.tsystems.rubin.server.transmodservices.TerminalService;
import com.tsystems.rubin.server.transmodservices.TerminalServiceFactory;
import com.tsystems.rubin.server.transmodservices.to.TerminalTO;

/**
 * Session Bean implementation class TerminalServiceSlsb
 */
@Stateless
public class TerminalServiceSlsb implements TerminalService {

	/** The logger. */
	private static org.apache.log4j.Logger logger = Logger
			.getLogger(TerminalServiceSlsb.class);

	/** The em. */
	@PersistenceContext
	private EntityManager em;

	/** The capacity management service. */
	private TerminalService terminalService;

	/**
	 * Initialize.
	 */
	@PostConstruct
	public void initialize() {
		terminalService = TerminalServiceFactory.getTerminalService(DAOFactory
				.getDAOFactory(DAOFactory.JPA, em));
	}

   public List<TerminalTO> findTerminallistBySearchCriteria(String searchType, Map<String, Object> searchParams)throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findTerminallistBySearchCriteria - "
					+ "searchType=" + searchType + ", searchParams=" + searchParams);
		}	
		return terminalService.findTerminallistBySearchCriteria(searchType, searchParams);
   }
}
