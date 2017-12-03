/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: DAOFactory.java
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


/**
 * A factory for creating DAO objects.
 */
// Abstract class DAO Factory
public abstract class DAOFactory {
    // List of DAO types supported by the factory
    /** The Constant JPA. */
    public static final int JPA = 1;

    /** The Constant JDBC. */
    public static final int JDBC = 2;

    /**
     * Gets the dAO factory.
     * 
     * @param whichFactory
     *            the which factory
     * @param payload
     *            the payload
     * 
     * @return the dAO factory
     */
    public final static DAOFactory getDAOFactory(int whichFactory, Object payload) {

        switch (whichFactory) {
        case JPA:
            return new JPADAOFactory(payload);
        default:
            return null;
        }
    }

    /**
     * Gets the lsc dao.
     * 
     * @return the lsc dao
     */
    public abstract LscDAO getLscDAO();

    /**
     * Gets the capacity dao.
     * 
     * @return the capacity dao
     */
    public abstract CapacityDAO getCapacityDAO();

    /**
     * Gets the layer dao.
     * 
     * @return the layer dao
     */
    public abstract LayerDAO getLayerDAO();

    /**
     * Gets the trib scheme dao.
     * 
     * @return the trib scheme dao
     */
    public abstract TribSchemeDAO getTribSchemeDAO();

    /**
     * Gets the tributary dao.
     * 
     * @return the tributary dao
     */
    public abstract TributaryDAO getTributaryDAO();

    /**
     * Gets the protected resource dao.
     * 
     * @return the protected resource dao
     */
    public abstract ProtectedResourceDAO getProtectedResourceDAO();

    /**
     * Gets the user dao.
     * 
     * @return the user dao
     */
    public abstract UserDAO getUserDAO();

    /**
     * Gets the activity audit dao.
     * 
     * @return the activity audit dao
     */
    public abstract ActivityAuditDAO getActivityAuditDAO();
    
    /**
     * Gets the property dao.
     * 
     * @return the property dao
     */
    public abstract PropertyDAO getPropertyDAO();

	/**
	 * Gets the subnetwork dao.
	 * 
	 * @return the subnetwork dao
	 */
	public abstract SubnetworkDAO getSubnetworkDAO();
	
	/**
	 * Gets the carrier dao.
	 * 
	 * @return the carrier dao
	 */
	public abstract CarrierDAO getCarrierDAO();
	
	/**
	 * Gets the terminal dao.
	 * 
	 * @return the terminal dao
	 */
	public abstract TerminalDAO getTerminalDAO();
	
	/**
	 * Gets the struct info dao.
	 * 
	 * @return the struct info dao
	 */
	public abstract StructuredInformationDAO getStructuredInformationDAO();
	/**
	 * Gets the service dao.
	 * 
	 * @return the service dao
	 */
	public abstract ServiceDAO getServiceDAO();

	/**
	 * Gets the identify letter dao.
	 * 
	 * @return the identify letter dao
	 */
	public abstract IdentifyLetterDAO getIdentifyLetterDAO();

	/**
	 * Gets the struct info type dao.
	 * 
	 * @return the struct info type dao
	 */
	public abstract StructuredInformationTypeDAO getStructuredInformationTypeDAO();
	
	/**
	 * Gets the circuit dao.
	 * 
	 * @return the circuit dao
	 */
	public abstract CircuitDAO getCircuitDAO();
	
	/**
	 * Gets the History dao.
	 * 
	 * @return the HIstoryDAO
	 */
	public abstract HistoryDAO getHistoryDAO();
	
	/**
	 * Gets the HistoryNote dao.
	 * 
	 * @return the HIstoryNoteDAO
	 */
	public abstract HistoryNoteDAO getHistoryNoteDAO();
	
	/**
	 * Gets the lru circuit dao.
	 * 
	 * @return the lru circuit dao
	 */
	public abstract LruCircuitDAO getLruCircuitDAO();
	
	/**
	 * Gets the ZentraleSystemdat dao.
	 * 
	 * @return the ZentraleSystemdat dao
	 */
	public abstract CentralSystemDataDAO getCentralSystemDataDAO();
	
	/**
	 * Gets the sla dao.
	 * 
	 * @return the sla dao
	 */
	public abstract SlaDAO getSlaDAO();
	
	/**
	 * Gets the Fuehrung dao.
	 * 
	 * @return the Fuehrung dao
	 */
	public abstract RoutingDAO getRoutingDAO();
	
	/**
	 * Gets the Fuehrungsabschnitt dao.
	 * 
	 * @return the Fuehrungsabschnitt dao
	 */
	public abstract RoutingSectionDAO getRoutingSectionDAO();
	
	/**
	 * Gets the SlaIndividuell dao.
	 * 
	 * @return the SlaIndividuell dao
	 */
	public abstract SlaIndividualDAO getSlaIndividualDAO();
	
	/**
	 * Gets the SlaRecordIndividuell dao.
	 * 
	 * @return the SlaRecordIndividuell dao
	 */
	public abstract SlaRecordIndividualDAO getSlaRecordIndividualDAO();
	
	/**
	 * Gets CrossConnect DAO.
	 * 
	 * @return CrossConnect DAO
	 */ 
	public abstract CrossConnectDAO getCrossConnectDAO();

	
	/**
	 * Gets TransPermission DAO.
	 * 
	 * @return TransPermission DAO.
	 */
	public abstract TransPermissionDAO getTransPermissionDAO();
	
	/**
	 * Gets FaultRecord DAO.
	 * 
	 * @return FaultRecord DAO
	 */
	public abstract FaultRecordDAO getFaultRecordDAO();
	
	/**
	 * Gets Network DAO.
	 * 
	 * @return Network DAO
	 */
	public abstract NetworkDAO getNetworkDAO();
	
	/**
	 * Gets Path DAO.
	 * 
	 * @return Path DAO
	 */
	public abstract PathDAO getPathDAO();

	/**
	 * Gets CWO DAO.
	 * 
	 * @return CWO DAO
	 */ 
	public abstract CwoDAO getCwoDAO();
	

	/**
	 * Gets Configuration DAO.
	 * 
	 * @return Configuration DAO
	 */ 
	public abstract ConfigurationDAO getConfigurationDAO();
	
	/**
	 * Gets Channel DAO.
	 * 
	 * @return Channel DAO
	 */ 
	public abstract ChannelDAO getChannelDAO();

}
