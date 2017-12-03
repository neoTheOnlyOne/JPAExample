package com.tsystems.rubin.server.transmodservices.slsbadapter;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.server.commonbusinessservices.to.PropertyTO;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.transmodservices.CircuitService;
import com.tsystems.rubin.server.transmodservices.CircuitServiceFactory;
import com.tsystems.rubin.server.transmodservices.to.CalculatedDelaysOfCircuitTO;
import com.tsystems.rubin.server.transmodservices.to.CarrierCustomerSlaTO;
import com.tsystems.rubin.server.transmodservices.to.CircuitCreateTO;
import com.tsystems.rubin.server.transmodservices.to.CircuitExtrasTO;
import com.tsystems.rubin.server.transmodservices.to.CircuitSlaTO;
import com.tsystems.rubin.server.transmodservices.to.CircuitSnoTO;
import com.tsystems.rubin.server.transmodservices.to.CircuitTO;
import com.tsystems.rubin.server.transmodservices.to.DefaultWebAddressTO;
import com.tsystems.rubin.server.transmodservices.to.FindCircuitSnoTO;
import com.tsystems.rubin.server.transmodservices.to.IdentifyLetterTO;
import com.tsystems.rubin.server.transmodservices.to.NetworkTO;
import com.tsystems.rubin.server.transmodservices.to.ServiceTO;
import com.tsystems.rubin.server.transmodservices.to.StructuredInformationTO;
import com.tsystems.rubin.server.transmodservices.to.StructuredInformationTypeTO;
import com.tsystems.rubin.server.transmodservices.to.UpdateCircuitTO;
import com.tsystems.rubin.server.transmodservices.to.WayTO;

/**
 * Session Bean implementation class CircuitService
 */
@Stateless
public class CircuitServiceSlsb implements CircuitService {

	/** The logger. */
	private static org.apache.log4j.Logger logger = Logger
			.getLogger(CircuitServiceSlsb.class);

	/** The em. */
	@PersistenceContext
	private EntityManager em;

	/** The circuit service. */
	private CircuitService circuitService;

	/**
	 * Initialize.
	 */
	@PostConstruct
	public void initialize() {
		circuitService = CircuitServiceFactory.getCircuitService(DAOFactory
				.getDAOFactory(DAOFactory.JPA, em));
	}

	public List<ServiceTO> findAllServices() throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findAllServices - ");
		}
		return circuitService.findAllServices();
	}

	public List<IdentifyLetterTO> findAllIdentifyLetters()
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findAllIdentifyLetters - ");
		}
		return circuitService.findAllIdentifyLetters();
	}

	public List<StructuredInformationTypeTO> findAllStructInfoTypes()
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findAllStructInfoTypes - ");
		}
		return circuitService.findAllStructInfoTypes();
	}

	

	public CircuitSnoTO findSno(FindCircuitSnoTO findCircuitSnoTO) throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findSnoForCircuit - " + "FindCircuitSnoTO="
					+ findCircuitSnoTO );
		}
		return circuitService.findSno(findCircuitSnoTO);
	}
	
	public boolean isCircuitExistsForGivenSno(FindCircuitSnoTO findCircuitSnoTO)throws RubinApplicationException{
		return circuitService.isCircuitExistsForGivenSno(findCircuitSnoTO);
	}

	/**
	 * find the circuit for update.
	 * 
	 * @param circuitId
	 *            circuit Id.
	 * @return UpdateCircuitTO circuit TO.
	 * @throws RubinApplicationException
	 *             thrown if error occurs.
	 */
	public UpdateCircuitTO findCircuitForUpdateByCircuitId(Long circuitId)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findCircuitForUpdateByCircuitId - "
					+ "circuitId=" + circuitId.toString());
		}
		return circuitService.findCircuitForUpdateByCircuitId(circuitId);

	}

	/**
	 * find the carrier customer SLA of the circuit.
	 * 
	 * @param circuitId
	 *            circuit Id.
	 * @return CarrierCustomerSlaTO carrier customer SLA TO.
	 * @throws RubinApplicationException
	 *             thrown if error occurs.
	 */
	public CarrierCustomerSlaTO findCarrierCustomerSlaOfCircuit(Long circuitId)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findCarrierCustomerSlaOfCircuit - "
					+ "circuitId=" + circuitId.toString());
		}
		return circuitService.findCarrierCustomerSlaOfCircuit(circuitId);
	}

	public void updateCircuit(UpdateCircuitTO updateCircuitTO)
			throws RubinApplicationException {

		if (logger.isDebugEnabled()) {
			logger.debug("Call entry updateCircuit-");
		}
		circuitService.updateCircuit(updateCircuitTO);

	}
	
	/**
     * find structured info for given circuit.
     * 
     * @param circuitId circuit id
     * 
     * @throws RubinApplicationException the rubin application exception
     */
	public List<StructuredInformationTO> findStructuredInfoOfCircuit(Long circuitId) throws RubinApplicationException{
		if (logger.isDebugEnabled()) {
            logger.debug("Call entry findStructuredInfoOfCircuit - " + "circuitId=" + circuitId);
        }
		return circuitService.findStructuredInfoOfCircuit(circuitId);
	}

	/**
     * insert structured info for given circuit.
     * 
     * @param circuitId 
     * @param structInfoTO 
     * @throws RubinApplicationException the rubin application exception
     */
	public Long insertStructuredInfo(Long circuitId, Long userId, StructuredInformationTO structInfoTO) throws RubinApplicationException{
		if (logger.isDebugEnabled()) {
            logger.debug("Call entry findStructuredInfoOfCircuit - " + "circuitId=" + circuitId);
        }
		return circuitService.insertStructuredInfo(circuitId, userId, structInfoTO);
		
	}

	/**
     * remove structured info for given circuit.
     * 
     * @param structuredInfoId
     * @throws RubinApplicationException the rubin application exception
     */
	public void removeStructuredInfo(Long structuredInfoId, Long userId) throws RubinApplicationException{
		if (logger.isDebugEnabled()) {
            logger.debug("Call entry removeStructuredInfo - " + "structuredInfoId=" + structuredInfoId);
        }
		circuitService.removeStructuredInfo(structuredInfoId, userId);
		
	}

	/**
     * update structured info for given circuit.
     * 
     * @param structuredInfoTO
     * @throws RubinApplicationException the rubin application exception
     */
	public void updateStructuredInfo(Long userId, StructuredInformationTO structuredInfoTO) throws RubinApplicationException{
		if (logger.isDebugEnabled()) {
            logger.debug("Call entry updateStructuredInfo - " + "structuredInfoTO=" + structuredInfoTO);
        }
		circuitService.updateStructuredInfo(userId, structuredInfoTO);
		
	}
	
	/**
	 * findAllProperties.
	 * 
	 * @return List<PropertyTO>
	 * @throws RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#findAllProperties()
	 */
	public List<PropertyTO> findAllProperties()
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
            logger.debug("Call entry findAllProperties - " + "");
        }
        return circuitService.findAllProperties();
	}
	
	/**
	 * find properties of circuit.
	 * 
	 * @throws RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#findPropertiesOfCircuit()
	 */
	public List<PropertyTO> findPropertiesOfCircuit(Long circuitId)
			throws RubinApplicationException {
		return circuitService.findPropertiesOfCircuit(circuitId);
	}

	/**
	 * Find default web address of circuit stored in BaseDataUrl field in circuit entity.
	 * 
	 * @param circuitId represents id for circuit entity
	 *            
	 * @throws RubinApplicationException
	 *             if any problem occurs while finding default web address.
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#findDefaultWebAddressOfCircuit(Long circuitId)
	 */
	public DefaultWebAddressTO findDefaultWebAddressOfCircuit(Long circuitId)
			throws RubinApplicationException {
		return circuitService.findDefaultWebAddressOfCircuit(circuitId);
	}
	
	/**
	 * Gives back the extras information of the circuit entity
	 * represented by passed circuit id.
	 * 
	 * @param circuitId
	 * 
	 * @return CircuitExtrasTO
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public CircuitExtrasTO findExtrasOfCircuit(Long circuitId) throws RubinApplicationException {
		return circuitService.findExtrasOfCircuit(circuitId);
	}

	
	/**
	 * Find SlaIndividuell Id of the circuit.
	 * 
	 * @param circuitId
	 *            circuit id
	 * @throws RubinApplicationException
	 *             if anty exception occurs.
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#findSlaIndividuellIdOfCircuit(java.lang.Long)
	 */
	public Long findSlaIndividuellIdOfCircuit(Long circuitId) throws RubinApplicationException {

		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findSlaIndividuellIdOfCircuit for circuitId = " + circuitId);
		}
		return circuitService.findSlaIndividuellIdOfCircuit(circuitId);
	}

	/**
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#assignNewSlaToCircuit(com.tsystems.rubin.server.transmodservices.to.CircuitSlaTO)
	 */
	public void assignNewSlaToCircuit(CircuitSlaTO circuitSlaTO) throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry assignNewSlaToCircuit for circuitId = " + circuitSlaTO.getCircuitId());
		}
		
		circuitService.assignNewSlaToCircuit(circuitSlaTO);
	}

	/**
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#disconnectSlaFromCircuit(java.lang.Long)
	 */
	public void disconnectSlaFromCircuit(Long circuitId, Long userId) throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry disconnectSlaFromCircuit for circuitId = " + circuitId);
		}
		
		circuitService.disconnectSlaFromCircuit(circuitId, userId);
	}

	/**
	 * This method returns the calculated delay for the circuit
	 * based on it's routing info.
	 * 
	 * @param circuitId
	 * @return CalculatedDelaysOfCircuitTO
	 * @throws RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#calculateDelaysOfCircuit(java.lang.Long)
	 */
	public CalculatedDelaysOfCircuitTO calculateDelaysOfCircuit(Long circuitId)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry calculateDelaysOfCircuit for circuitId = " + circuitId);
		}
		
		return circuitService.calculateDelaysOfCircuit(circuitId);
	}

	/**
	 * This method gets the circuit information and also 
	 * color code for circuit header for the provided 
	 * circuit id.
	 * 
	 * @param circuitId
	 * @return CircuitTO
	 * @throws RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#findCircuitById(java.lang.Long)
	 */
	public CircuitTO findCircuitById(Long circuitId)
			throws RubinApplicationException {
		return circuitService.findCircuitById(circuitId);
	}

	/**
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#findCircuitlistBySearchCriteria(java.lang.String, java.util.Map, java.lang.Long)
	 */
	public List<CircuitTO> findCircuitlistBySearchCriteria(String searchType,
			Map<String, Object> searchParams, Long userId)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry findCircuitlistBySearchCriteria = " + "searchType = "+searchType+
					"userId = "+userId
					);
		}
		return circuitService.findCircuitlistBySearchCriteria(searchType, searchParams, userId);
	}

	/**
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#insertCircuit(com.tsystems.rubin.server.transmodservices.to.CircuitCreateTO)
	 */
	public List<String> insertCircuit(CircuitCreateTO circuitCreateTO)
			throws RubinApplicationException {
		
		return circuitService.insertCircuit(circuitCreateTO);
	}
}
