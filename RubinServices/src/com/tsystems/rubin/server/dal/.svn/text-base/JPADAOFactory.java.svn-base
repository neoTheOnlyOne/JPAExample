/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: JPADAOFactory.java
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
package com.tsystems.rubin.server.dal;

import javax.persistence.EntityManager;

import com.tsystems.rubin.server.dal.impl.ActivityAuditJpaDAO;
import com.tsystems.rubin.server.dal.impl.CapacityJpaDAO;
import com.tsystems.rubin.server.dal.impl.CarrierJpaDAO;
import com.tsystems.rubin.server.dal.impl.CentralSystemDataJpaDAO;
import com.tsystems.rubin.server.dal.impl.ChannelJpaDAO;
import com.tsystems.rubin.server.dal.impl.CircuitJpaDAO;
import com.tsystems.rubin.server.dal.impl.ConfigurationJpaDAO;
import com.tsystems.rubin.server.dal.impl.CrossConnectJpaDAO;
import com.tsystems.rubin.server.dal.impl.CwoJpaDAO;
import com.tsystems.rubin.server.dal.impl.FaultRecordJpaDAO;
import com.tsystems.rubin.server.dal.impl.HistoryJpaDAO;
import com.tsystems.rubin.server.dal.impl.HistoryNoteJpaDAO;
import com.tsystems.rubin.server.dal.impl.IdentifyLetterJpaDAO;
import com.tsystems.rubin.server.dal.impl.LayerJpaDAO;
import com.tsystems.rubin.server.dal.impl.LruCircuitJpaDAO;
import com.tsystems.rubin.server.dal.impl.LscJpaDAO;
import com.tsystems.rubin.server.dal.impl.NetworkJpaDAO;
import com.tsystems.rubin.server.dal.impl.PathJpaDAO;
import com.tsystems.rubin.server.dal.impl.PropertyJpaDAO;
import com.tsystems.rubin.server.dal.impl.ProtectedResourceJpaDAO;
import com.tsystems.rubin.server.dal.impl.RoutingJpaDAO;
import com.tsystems.rubin.server.dal.impl.RoutingSectionJpaDAO;
import com.tsystems.rubin.server.dal.impl.ServiceJpaDAO;
import com.tsystems.rubin.server.dal.impl.SlaIndividualJpaDAO;
import com.tsystems.rubin.server.dal.impl.SlaJpaDAO;
import com.tsystems.rubin.server.dal.impl.SlaRecordIndividualJpaDAO;
import com.tsystems.rubin.server.dal.impl.StructuredInformationJpaDAO;
import com.tsystems.rubin.server.dal.impl.StructuredInformationTypeJpaDAO;
import com.tsystems.rubin.server.dal.impl.SubnetworkJpaDAO;
import com.tsystems.rubin.server.dal.impl.TerminalJpaDAO;
import com.tsystems.rubin.server.dal.impl.TransPermissionJpaDAO;
import com.tsystems.rubin.server.dal.impl.TribSchemeJpaDAO;
import com.tsystems.rubin.server.dal.impl.TributaryJpaDAO;
import com.tsystems.rubin.server.dal.impl.UserJpaDAO;

/**
 * A factory for creating JPADAO objects.
 */
public class JPADAOFactory extends DAOFactory {

	/** The entity manager. */
	protected EntityManager entityManager;

	/**
	 * Instantiates a new jPADAO factory.
	 * 
	 * @param entityManager
	 *            the entity manager
	 */
	public JPADAOFactory(Object entityManager) {
		this.entityManager = (EntityManager) entityManager;
	}

	/**
	 * getLscDAO.
	 * 
	 * @return the lsc dao
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getLscDAO()
	 */

	public final LscDAO getLscDAO() {
		return new LscJpaDAO(entityManager);
	}

	/**
	 * getCapacityDAO.
	 * 
	 * @return the capacity dao
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getCapacityDAO()
	 */

	public final CapacityDAO getCapacityDAO() {
		return new CapacityJpaDAO(entityManager);
	}

	/**
	 * getLayerDAO.
	 * 
	 * @return the layer dao
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getLayerDAO()
	 */

	public final LayerDAO getLayerDAO() {
		return new LayerJpaDAO(entityManager);
	}

	/**
	 * getTribSchemeDAO.
	 * 
	 * @return the trib scheme dao
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getTribSchemeDAO()
	 */

	public final TribSchemeDAO getTribSchemeDAO() {
		return new TribSchemeJpaDAO(entityManager);
	}

	/**
	 * getTributaryDAO.
	 * 
	 * @return the tributary dao
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getTributaryDAO()
	 */

	public final TributaryDAO getTributaryDAO() {
		return new TributaryJpaDAO(entityManager);
	}

	/**
	 * getProtectedResourceDAO.
	 * 
	 * @return the protected resource dao
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getProtectedResourceDAO()
	 */

	public final ProtectedResourceDAO getProtectedResourceDAO() {
		return new ProtectedResourceJpaDAO(entityManager);
	}

	/**
	 * getUserDAO.
	 * 
	 * @return the user dao
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getUserDAO()
	 */

	public final UserDAO getUserDAO() {
		return new UserJpaDAO(entityManager);
	}

	/**
	 * getActivityAuditDAO.
	 * 
	 * @return the activity audit dao
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getActivityAuditDAO()
	 */
	public ActivityAuditDAO getActivityAuditDAO() {
		return new ActivityAuditJpaDAO(entityManager);
	}

	/**
	 * getSubnetworkDAO.
	 * 
	 * @return
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getSubnetworkDAO()
	 */

	public SubnetworkDAO getSubnetworkDAO() {
		return new SubnetworkJpaDAO(entityManager);
	}

	/**
	 * getPropertyDAO.
	 * 
	 * @return property dao
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getPropertyDAO()
	 */
	public PropertyDAO getPropertyDAO() {
		return new PropertyJpaDAO(entityManager);
	}

	/**
	 * getCarrierDAO.
	 * 
	 * @return carrier dao
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getCarrierDAO()
	 */
	public CarrierDAO getCarrierDAO() {
		return new CarrierJpaDAO(entityManager);
	}

	/**
	 * getTerminalDAO.
	 * 
	 * @return terminal dao
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getTerminalDAO()
	 */
	public TerminalDAO getTerminalDAO() {
		return new TerminalJpaDAO(entityManager);
	}

	/**
	 * getServiceDAO.
	 * 
	 * @return service dao
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getServiceDAO()
	 */
	public ServiceDAO getServiceDAO() {
		return new ServiceJpaDAO(entityManager);
	}

	/**
	 * getIdentifyLetterDAO.
	 * 
	 * @return identify letter dao
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getIdentifyLetterDAO()
	 */
	public IdentifyLetterDAO getIdentifyLetterDAO() {
		return new IdentifyLetterJpaDAO(entityManager);
	}

	/**
	 * getStructInfoTypeDAO.
	 * 
	 * @return identify letter dao
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getStructuredInformationTypeDAO()
	 */
	public StructuredInformationTypeDAO getStructuredInformationTypeDAO() {
		return new StructuredInformationTypeJpaDAO(entityManager);
	}

	/**
	 * getCircuitDAO.
	 * 
	 * @return identify letter dao
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getCircuitDAO()
	 */

	public CircuitDAO getCircuitDAO() {
		return new CircuitJpaDAO(entityManager);
	}

	/**
	 * Get history jap dao.
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getHistoryDAO()
	 */
	@Override
	public HistoryDAO getHistoryDAO() {
		return new HistoryJpaDAO(entityManager);
	}

	/**
	 * Get historyNote jap dao.
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getHistoryNoteDAO()
	 */
	@Override
	public HistoryNoteDAO getHistoryNoteDAO() {
		return new HistoryNoteJpaDAO(entityManager);
	}
	
	/**
     * getStructInfoDAO.
     * 
     * @return struct info dao
     * 
     * @see com.tsystems.rubin.server.dal.DAOFactory#getStructuredInformationDAO()
     */
	public StructuredInformationDAO getStructuredInformationDAO() {
		return new StructuredInformationJpaDAO(entityManager); 
		}
	
	/**
     * getLruCircuitDAO.
     * 
     * @return lru circuit dao
     * 
     * @see com.tsystems.rubin.server.dal.DAOFactory#getLruCircuitDAO()
     */
	public LruCircuitDAO getLruCircuitDAO() {
		return new LruCircuitJpaDAO(entityManager);
	}

	/**
	 * Gets the ZentraleSystemdat dao.
	 * 
	 * @return the ZentraleSystemdat dao
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getCentralSystemDataDAO()
	 */
	public CentralSystemDataDAO getCentralSystemDataDAO() {
		return new CentralSystemDataJpaDAO(entityManager);
	}

	/**
	 * get SlaDAO.
	 * @return sla dao.
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getSlaDAO()
	 */
	@Override
	public SlaDAO getSlaDAO() {
		return new SlaJpaDAO(entityManager);
		}
		
		/**
	 * Gets the Fuehrung dao.
	 * 
	 * @return the Fuehrung dao
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getRoutingDAO()
	 */
	public RoutingDAO getRoutingDAO() {
		return new RoutingJpaDAO(entityManager);
	}
	
	/**
	 * Gets the Fuehrungsabschnitt dao.
	 * 
	 * @return the Fuehrungsabschnitt dao
	 */
	public RoutingSectionDAO getRoutingSectionDAO() {
		return new RoutingSectionJpaDAO(entityManager);
	}

	/**
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getSlaIndividualDAO()
	 */
	@Override
	public SlaIndividualDAO getSlaIndividualDAO() {
		return new SlaIndividualJpaDAO(entityManager);
	}

	/**
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getSlaRecordIndividualDAO()
	 */
	@Override
	public SlaRecordIndividualDAO getSlaRecordIndividualDAO() {
		return new SlaRecordIndividualJpaDAO(entityManager);
	}

	/**
	 * Gets CrossConnect DAO.
	 * 
	 * @return CrossConnect DAO
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getCrossConnectDAO()
	 */
	@Override
	public CrossConnectDAO getCrossConnectDAO() {
		return new CrossConnectJpaDAO(entityManager);
	}

	/**
	 * Gets TransPermission DAO.
	 * 
	 * @return TransPermission DAO
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getTransPermissionDAO()
	 */
	@Override
	public TransPermissionDAO getTransPermissionDAO() {
		return new TransPermissionJpaDAO(entityManager);
	}
	
	/**
	 * Gets FaultRecord DAO.
	 * 
	 * @return FaultRecord DAO
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getFaultRecordDAO()
	 */
	@Override
	public FaultRecordDAO getFaultRecordDAO() {
		return new FaultRecordJpaDAO(entityManager);
	}
	
	/**
	 * Gets Network DAO.
	 * 
	 * @return Network DAO
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getNetworkDAO()
	 */
	@Override
	public NetworkDAO getNetworkDAO() {
		return new NetworkJpaDAO(entityManager);
	}

	/**
	 * Gets Path DAO.
	 * 
	 * @return Path DAO
	 * 
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getPathDAO()
	 */
	@Override
	public PathDAO getPathDAO() {
		return new PathJpaDAO(entityManager);
	}

	/**
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getConfigurationDAO()
	 */
	@Override
	public ConfigurationDAO getConfigurationDAO() {
		
		return new ConfigurationJpaDAO(entityManager);
	}

	/**
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getCwoDAO()
	 */
	@Override
	public CwoDAO getCwoDAO() {
		
		return new CwoJpaDAO(entityManager);
	}

	/**
	 * @see com.tsystems.rubin.server.dal.DAOFactory#getChannelDAO()
	 */
	@Override
	public ChannelDAO getChannelDAO() {
		return new ChannelJpaDAO(entityManager);
	}
}