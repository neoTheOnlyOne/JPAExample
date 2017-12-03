package com.tsystems.rubin.server.transmodservices.impl;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.common.util.AttributeSelector;
import com.tsystems.rubin.common.util.CircuitStatus;
import com.tsystems.rubin.common.util.ColorCodeConstants;
import com.tsystems.rubin.common.util.CommonConstants;
import com.tsystems.rubin.common.util.CommonUtilities;
import com.tsystems.rubin.common.util.DynamicQueryConstants;
import com.tsystems.rubin.common.util.HistoryActions;
import com.tsystems.rubin.common.util.HistoryRecordConstants;
import com.tsystems.rubin.common.util.NamedQueryConstants;
import com.tsystems.rubin.common.util.RoutingSectionTypes;
import com.tsystems.rubin.common.util.UsageStatus;
import com.tsystems.rubin.server.commonbusinessservices.to.PropertyTO;
import com.tsystems.rubin.server.commonbusinessservices.to.SubnetworkTO;
import com.tsystems.rubin.server.commonutils.base.RubinMapper;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.dal.dvo.CentralSystemDataDVO;
import com.tsystems.rubin.server.dal.dvo.CircuitDVO;
import com.tsystems.rubin.server.dal.dvo.CrossConnectDVO;
import com.tsystems.rubin.server.dal.dvo.FaultRecordDVO;
import com.tsystems.rubin.server.dal.dvo.IdentifyLetterDVO;
import com.tsystems.rubin.server.dal.dvo.PropertyDVO;
import com.tsystems.rubin.server.dal.dvo.RoutingDVO;
import com.tsystems.rubin.server.dal.dvo.RoutingSectionDVO;
import com.tsystems.rubin.server.dal.dvo.RoutingSectionTypeInfoDVO;
import com.tsystems.rubin.server.dal.dvo.ServiceDVO;
import com.tsystems.rubin.server.dal.dvo.StructuredInformationDVO;
import com.tsystems.rubin.server.dal.dvo.StructuredInformationTypeDVO;
import com.tsystems.rubin.server.dal.dvo.TributaryDVO;
import com.tsystems.rubin.server.dal.entities.CWO;
import com.tsystems.rubin.server.dal.entities.Carrier;
import com.tsystems.rubin.server.dal.entities.CentralSystemData;
import com.tsystems.rubin.server.dal.entities.Channel;
import com.tsystems.rubin.server.dal.entities.Circuit;
import com.tsystems.rubin.server.dal.entities.Configuration;
import com.tsystems.rubin.server.dal.entities.History;
import com.tsystems.rubin.server.dal.entities.HistoryNote;
import com.tsystems.rubin.server.dal.entities.LruCircuit;
import com.tsystems.rubin.server.dal.entities.Property;
import com.tsystems.rubin.server.dal.entities.Routing;
import com.tsystems.rubin.server.dal.entities.Service;
import com.tsystems.rubin.server.dal.entities.Sla;
import com.tsystems.rubin.server.dal.entities.SlaIndividual;
import com.tsystems.rubin.server.dal.entities.SlaRecord;
import com.tsystems.rubin.server.dal.entities.SlaRecordIndividual;
import com.tsystems.rubin.server.dal.entities.StructuredInformation;
import com.tsystems.rubin.server.dal.entities.StructuredInformationType;
import com.tsystems.rubin.server.dal.entities.Subnetwork;
import com.tsystems.rubin.server.dal.entities.TribScheme;
import com.tsystems.rubin.server.dal.entities.User;
import com.tsystems.rubin.server.transmodservices.CircuitService;
import com.tsystems.rubin.server.transmodservices.querygenerator.DynamicQueryGenerator;
import com.tsystems.rubin.server.transmodservices.to.CalculatedDelaysOfCircuitTO;
import com.tsystems.rubin.server.transmodservices.to.CarrierCustomerSlaTO;
import com.tsystems.rubin.server.transmodservices.to.CarrierTO;
import com.tsystems.rubin.server.transmodservices.to.CentralSystemDataTO;
import com.tsystems.rubin.server.transmodservices.to.CircuitCreateTO;
import com.tsystems.rubin.server.transmodservices.to.CircuitExtrasTO;
import com.tsystems.rubin.server.transmodservices.to.CircuitSlaTO;
import com.tsystems.rubin.server.transmodservices.to.CircuitSnoTO;
import com.tsystems.rubin.server.transmodservices.to.CircuitTO;
import com.tsystems.rubin.server.transmodservices.to.ConfigurationTO;
import com.tsystems.rubin.server.transmodservices.to.CwoTO;
import com.tsystems.rubin.server.transmodservices.to.DefaultWebAddressTO;
import com.tsystems.rubin.server.transmodservices.to.FindCircuitSnoTO;
import com.tsystems.rubin.server.transmodservices.to.IdentifyLetterTO;
import com.tsystems.rubin.server.transmodservices.to.RoutingSectionInfoTO;
import com.tsystems.rubin.server.transmodservices.to.RoutingSectionTO;
import com.tsystems.rubin.server.transmodservices.to.RoutingTO;
import com.tsystems.rubin.server.transmodservices.to.ServiceTO;
import com.tsystems.rubin.server.transmodservices.to.SlaIndividualTO;
import com.tsystems.rubin.server.transmodservices.to.SlaRecordIndividualTO;
import com.tsystems.rubin.server.transmodservices.to.SlaRecordTO;
import com.tsystems.rubin.server.transmodservices.to.SlaTO;
import com.tsystems.rubin.server.transmodservices.to.StructuredInformationTO;
import com.tsystems.rubin.server.transmodservices.to.StructuredInformationTypeTO;
import com.tsystems.rubin.server.transmodservices.to.TransportverbindunTO;
import com.tsystems.rubin.server.transmodservices.to.UpdateCircuitTO;

public class CircuitServiceImpl implements CircuitService {

	private static org.apache.log4j.Logger logger = Logger
			.getLogger(CircuitServiceImpl.class);

	/** The dao factory. */
	private DAOFactory daoFactory;

	public CircuitServiceImpl(DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	/**
	 * Find All Services.
	 * 
	 * @return the list<ServiceTO>
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public List<ServiceTO> findAllServices() throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("");
		}

		List<ServiceDVO> serviceDVOList = null;

		serviceDVOList = daoFactory.getServiceDAO()
				.<ServiceDVO> findByProperty(
						NamedQueryConstants.SERVICE_FINDALL, null);

		List<ServiceTO> serviceTOList = new ArrayList<ServiceTO>();

		for (ServiceDVO serviceDVO : serviceDVOList) {
			ServiceTO serviceTO = new ServiceTO(serviceDVO.getId(), serviceDVO
					.getDesignation(), serviceDVO.getServiceId());
			serviceTOList.add(serviceTO);
		}

		return serviceTOList;
	}

	/**
	 * Find All Identify Letters.
	 * 
	 * @return the list<IdentifyLetterTO>
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public List<IdentifyLetterTO> findAllIdentifyLetters()
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("");
		}

		List<IdentifyLetterDVO> identifyLetterDVOList = null;

		identifyLetterDVOList = daoFactory.getIdentifyLetterDAO()
				.<IdentifyLetterDVO> findByProperty(
						NamedQueryConstants.IDENTIFYLETTER_FINDALL, null);

		List<IdentifyLetterTO> identifyLetterTOList = new ArrayList<IdentifyLetterTO>();

		for (IdentifyLetterDVO identifyLetterDVO : identifyLetterDVOList) {
			IdentifyLetterTO identifyLetterTO = new IdentifyLetterTO(
					identifyLetterDVO.getId(), identifyLetterDVO
							.getDesignation(), identifyLetterDVO
							.getIdentifyLetterId());
			identifyLetterTOList.add(identifyLetterTO);
		}

		return identifyLetterTOList;
	}

	/**
	 * Find All Struct info types.
	 * 
	 * @return the list<StructInfoTypeTO>
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public List<StructuredInformationTypeTO> findAllStructInfoTypes()
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("");
		}

		List<StructuredInformationTypeDVO> structInfoTypeDVOList = null;

		structInfoTypeDVOList = daoFactory.getStructuredInformationTypeDAO()
				.<StructuredInformationTypeDVO> findByProperty(
						NamedQueryConstants.STRUCTREDINFORMATIONTYPE_FINDALL, null);

		List<StructuredInformationTypeTO> structInfoTypeTOList = new ArrayList<StructuredInformationTypeTO>();

		for (StructuredInformationTypeDVO structInfoTypeDVO : structInfoTypeDVOList) {
			StructuredInformationTypeTO structInfoTypeTO = new StructuredInformationTypeTO(
					structInfoTypeDVO.getId(), structInfoTypeDVO
							.getDesignation());
			structInfoTypeTOList.add(structInfoTypeTO);
		}

		return structInfoTypeTOList;
	}

	/**
	 * Find All Struct info types.
	 * 
	 * @return the list<StructInfoTypeTO>
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public List<CircuitTO> findCircuitlistBySearchCriteria(String searchType,
			Map<String, Object> searchParams, Long userId)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("");
		}
		List<Circuit> transportverbindunList = null;
		if (searchType != null) {
			if (NamedQueryConstants.CIRCUIT_FINDCIRCUITBYTERMINALNAME
					.equals(searchType)
					|| NamedQueryConstants.CIRCUIT_FINDCIRCUITBYENDCUSTOMERNAME
							.equals(searchType)){
				Set set = searchParams.entrySet();
				Iterator iterator = set.iterator();
				while (iterator.hasNext()) {
					Map.Entry mapEntry = (Map.Entry) iterator.next();
					if(mapEntry.getValue() instanceof String){
						String value = mapEntry.getValue().toString().toUpperCase();
						mapEntry.setValue(value);			
					}				
				}
			}			
			transportverbindunList = daoFactory.getCircuitDAO()
					.<Circuit> findByProperty(searchType,
							searchParams);
			
		} else {
			/*
			 * The DynamicQueryGenerator class is used to create a dynamic sql
			 * query to search for circuits The method
			 * createDynamicQueryForSearch() takes the search parameters and the
			 * table name as arguments. The query needs to be dynamic since we
			 * do not know how many or in what order the search parameters will
			 * be available.
			 */
			TreeMap<String, Object> searchParameters = (TreeMap<String, Object>) searchParams;
			TreeMap<String, Object> returnValues = (TreeMap<String, Object>) DynamicQueryGenerator
					.createDynamicQueryForSearch(searchParameters,
							DynamicQueryConstants.TRANSPORTVERBINDUNG, userId);
			String query = (String) returnValues.get("Query");
			System.out.println("THE QUERY IS********************"+query);
			Map<Integer, Object> searchValues = (Map<Integer, Object>) returnValues
					.get("SearchValues");
			transportverbindunList = daoFactory.getCircuitDAO()
					.<Circuit> findCircuitListByProperty(query,
							searchValues);

		}
		List<CircuitTO> circuitTOList = new ArrayList<CircuitTO>();
		System.out.println("TIME BEFORE MAPPER%%%%%%%%%%%%%%%%%%%%%%%%"
				+ System.currentTimeMillis());

		//TODO: Populate equipment, fuehrung and kundenendpunkt data in circuit to.
		for (Circuit transportverbindun : transportverbindunList) {
			CircuitTO circuitTO = new CircuitTO();
			circuitTO = (CircuitTO) RubinMapper.getTO(transportverbindun,
					circuitTO, "FindCircuitBySearchCriteria");
			circuitTOList.add(circuitTO);
			populateStructInfoInCircuitTO(circuitTO, transportverbindun);
		}
		System.out.println("TIME AFTER MAPPER************************"
				+ System.currentTimeMillis());
		return circuitTOList;
	}

	/**
	 * populateStructInfoInCircuitTO.
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	private void populateStructInfoInCircuitTO(CircuitTO circuitTO,
			Circuit transportverbindun)
			throws RubinApplicationException {
		Set<StructuredInformation> structInfoCollection = transportverbindun
				.getStructuredInformations();
		if (structInfoCollection != null) {
			Iterator<StructuredInformation> iterator = structInfoCollection.iterator();
			while (iterator.hasNext()) {
				StructuredInformation structInfo = (StructuredInformation) iterator.next();
				if (structInfo.getStructuredInformationType() != null) {
					if (CommonConstants.ALIAS_ID.equals(structInfo
							.getStructuredInformationType().getId())) {
						StructuredInformationTO structInfoTO = new StructuredInformationTO();
						structInfoTO
								.setDesignation(structInfo.getDesignation());
						structInfoTO.setId(structInfo.getId());
						circuitTO.setStructInfoTO(structInfoTO);
					}

				}

			}

		}

	}
	public boolean isCircuitExistsForGivenSno(FindCircuitSnoTO findCircuitSnoTO)throws RubinApplicationException{
		TreeMap<String, Object> searchParams = new TreeMap<String, Object>();
		searchParams.put("1", findCircuitSnoTO.getTerminalA().getId());
		searchParams.put("2", findCircuitSnoTO.getTerminalB().getId());
		searchParams .put("3", findCircuitSnoTO.getLscTO().getId());
		searchParams.put("4", Long.parseLong(findCircuitSnoTO.getCircuitSNO()));
		Long upperSno =new Long((Integer.parseInt(findCircuitSnoTO.getCircuitSNO())+findCircuitSnoTO.getNoOfCiruits()));
		searchParams.put("5", upperSno-1);
		String searchType;
		if(findCircuitSnoTO.getLscSnoNumberingRule().equals("C")){
			searchType = NamedQueryConstants.CIRCUIT_FINDCIRCUITFORSNOC;
		}else{
			searchType = NamedQueryConstants.CIRCUIT_FINDCIRCUITFORSNO;
			
		}
		List<Long> transportverbindunList = daoFactory.getCircuitDAO().<Long> findByProperty(searchType, searchParams);
		if(transportverbindunList.isEmpty()){
			return false;
		}else{
			return true;
		}
		
	}
	
	public CircuitSnoTO findSno(FindCircuitSnoTO findCircuitSnoTO)
			throws RubinApplicationException {
		TreeMap<String, Object> searchParams = new TreeMap<String, Object>();
		searchParams.put("1", findCircuitSnoTO.getTerminalA().getId());
		searchParams.put("2", findCircuitSnoTO.getTerminalB().getId());
		searchParams.put("3", findCircuitSnoTO.getLscTO().getId());
		String searchType;
		Long sno = Long.parseLong(findCircuitSnoTO.getCircuitSNO());
		CircuitSnoTO circuitSnoTO = new CircuitSnoTO();
		circuitSnoTO.setCircuitSNO(findCircuitSnoTO.getCircuitSNO());
		if (findCircuitSnoTO.getLscSnoNumberingRule().equals("C")) {
			searchType = NamedQueryConstants.CIRCUIT_FINDSNOFORCIRCUITC;
		} else {
			searchType = NamedQueryConstants.CIRCUIT_FINDSNOFORCIRCUIT;
		}
		List<Long> transportverbindunList = daoFactory.getCircuitDAO()
				.<Long> findByProperty(searchType, searchParams);
		int size = transportverbindunList.size();
		if (!transportverbindunList.isEmpty()) {
			if (findCircuitSnoTO.getFillInGaps().equals("Y")) {
				if (transportverbindunList.contains(sno)) {
					int indexOfExistingSno = transportverbindunList
							.indexOf(sno);
					System.out.println("indexOfExistingSno = "
							+ indexOfExistingSno);
					if (indexOfExistingSno == size - 1) {
						sno = sno.longValue() + 1;
						circuitSnoTO.setCircuitSNO(sno.toString());
						return circuitSnoTO;
					} else {
						for (int count = indexOfExistingSno; count < transportverbindunList
								.size() - 1; count++) {
							if ((((transportverbindunList.get(count + 1)
									.longValue() - transportverbindunList.get(
									count).longValue())) - 1) >= findCircuitSnoTO
									.getNoOfCiruits()) {
								System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&"
										+ transportverbindunList.get(count)
												.longValue() + 1);
								sno = new Long(transportverbindunList
										.get(count).intValue() + 1);
								// findCircuitSnoTO.setMessage("cannot fill the gaps:)");
								circuitSnoTO.setCircuitSNO(sno.toString());
								return circuitSnoTO;
							}
						}
						sno = new Long(transportverbindunList.get(size - 1) + 1);
						circuitSnoTO.setCircuitSNO(sno.toString());
						return circuitSnoTO;
					}
				} else {
					System.out.println("sno not exists");
					if (sno.longValue() > transportverbindunList.get(size - 1)) {
						circuitSnoTO.setCircuitSNO(sno.toString());
						return circuitSnoTO;
					} else {
						for (int count = 0; count < size - 1; count++) {

							if (sno.longValue() > transportverbindunList.get(
									count).longValue()) {
								if (transportverbindunList.get(count + 1)
										.longValue()
										- sno.longValue() >= findCircuitSnoTO
										.getNoOfCiruits()) {
									circuitSnoTO.setCircuitSNO(sno
											.toString());
									return circuitSnoTO;
								}
								sno = transportverbindunList.get(count + 1) + 1;
							}
						}
						sno = new Long(transportverbindunList.get(size - 1)
								.intValue() + 1);
						circuitSnoTO.setCircuitSNO(sno.toString());
						return circuitSnoTO;
					}
				}
			} else {
				if (!(sno.longValue() > transportverbindunList.get(size - 1))) {
					sno = new Long(transportverbindunList
							.get(transportverbindunList.size() - 1) + 1);
				}
				circuitSnoTO.setCircuitSNO(sno.toString());
				return circuitSnoTO;
			}
		} else {
			return circuitSnoTO;
		}
	}
	/**
	 * find the circuit by circuit id.
	 * @param circuitId id of the circuit to be searched
	 * @return updateCircuitTO circuit TO
	 * @throws RubinApplicationException thrown if problem occurs.
	 */
	public UpdateCircuitTO findCircuitForUpdateByCircuitId(Long circuitId)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("");
		}
		return (UpdateCircuitTO) RubinMapper.getTO(daoFactory.getCircuitDAO()
				.findById(circuitId), new UpdateCircuitTO(),
				RubinMapper.FIND_CIRCUIT_FOR_UPDATE);
	}

	/**
	 * find the carrier customer SLA of circuit.
	 * @param circuitId id of the circuit.
	 * @return CarrierCustomerSlaTO Carrier Customer SLA TO.
	 * @throws RubinApplicationException thrown if problem occurs.
	 */
	public CarrierCustomerSlaTO findCarrierCustomerSlaOfCircuit(Long circuitId)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("");
		}
		return (CarrierCustomerSlaTO) RubinMapper.getTO(daoFactory
				.getCircuitDAO().findById(circuitId),
				new CarrierCustomerSlaTO(),
				RubinMapper.FIND_CARRIER_CUSTOMER_SLA_OF_CIRCUIT);
	}

	/**
	 * update circuit informations.
	 * 
	 * @throws RubinApplicationException
	 *             the RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#updateCircuit()
	 */
	public void updateCircuit(UpdateCircuitTO updateCircuitTO) throws RubinApplicationException {
		AttributeSelector attributeSelector = updateCircuitTO.getAttributeSelector();
		// here we check the attribute selector value and
		// accordingly update the circuit
		switch (attributeSelector) {
		case STRUCTURED_INFO:
			updateStructuredInfo(updateCircuitTO.getUserId(), updateCircuitTO.getStructuredInfoTO());
			break;
		case ASSIGNMENTS:
			updateAssignments(updateCircuitTO);
			break;
		case EXTRAS:
			updateExtrasOfCircuit(updateCircuitTO);
			break;
		case SUBNETWORK:
			updateSubnet(updateCircuitTO);
			break;
		case SLA:
			updateSla(updateCircuitTO);
			break;
		case LRU_CIRCUIT:
			updateLruCircuit(updateCircuitTO.getCircuitId(), updateCircuitTO.getUserId(), updateCircuitTO
					.getUsageStatus());
			break;
		}
		// updating bearBeiter and letzteAktualisier fields in circuit entity
		Circuit circuit = daoFactory.getCircuitDAO().findById(updateCircuitTO.getCircuitId());
		circuit.setUser(updateCircuitTO.getUserId().toString());
		circuit.setLastUpdate(new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
	}

	/**
	 * Update first and further subnet information of the circuit.
	 * 
	 * @throws RubinApplicationException
	 * @param updateCircuitTO
	 */
	private void updateSubnet(UpdateCircuitTO updateCircuitTO) throws RubinApplicationException {

		if (updateCircuitTO != null && updateCircuitTO.getFirstSubnetworkTO() != null) {

			Circuit transportverbindun = daoFactory.getCircuitDAO().findById(updateCircuitTO.getCircuitId());
			List<String> historyRecordList = new ArrayList<String>();

			if (transportverbindun != null) {
				SubnetworkTO firstSubnetworkTO = updateCircuitTO.getFirstSubnetworkTO();
				Subnetwork firstSubnetwork = (Subnetwork) RubinMapper.getEntity(firstSubnetworkTO, new Subnetwork(),
						"updateSubnetMapping");
				if (!transportverbindun.getSubnetwork().getName().equals(firstSubnetworkTO.getName())) {
					historyRecordList.add(createHistoryRecord(HistoryRecordConstants.SUBNETWORKINFO,
							HistoryRecordConstants.FROM, transportverbindun.getSubnetwork().getName(),
							HistoryRecordConstants.TO, firstSubnetworkTO.getName()));
				}
				transportverbindun.setSubnetwork(firstSubnetwork);

				// Update First subnet and label
				daoFactory.getCircuitDAO().update(transportverbindun);

				List<SubnetworkTO> furtherSubnetworkTOList = updateCircuitTO.getFurtherSubnetworkTOList();
				Set<Subnetwork> furtherSubnetworkSet = new HashSet<Subnetwork>();
				for (SubnetworkTO furtherSubnetworkTO : furtherSubnetworkTOList) {
					Subnetwork furtherSubnetwork = (Subnetwork) RubinMapper.getEntity(furtherSubnetworkTO,
							new Subnetwork(), "updateSubnetMapping");
					furtherSubnetworkSet.add(furtherSubnetwork);
				}
				List<String> fromHistory = new ArrayList<String>();
				List<String> toHistory = new ArrayList<String>();

				Iterator<Subnetwork> itr = transportverbindun.getSubnetworks().iterator();
				while (itr.hasNext()) {
					Subnetwork circuitSubnet = itr.next();
					fromHistory.add(circuitSubnet.getName());
					if (!furtherSubnetworkSet.contains(circuitSubnet)) {
						itr.remove();
						circuitSubnet.getCircuits2().remove(transportverbindun);
						// Remove disconnected subnet
						daoFactory.getSubnetworkDAO().update(circuitSubnet);
					}
				}

				Set<Circuit> transportverbindunSet = new HashSet<Circuit>();
				transportverbindunSet.add(transportverbindun);

				for (Subnetwork furtherSubnetwork : furtherSubnetworkSet) {
					furtherSubnetwork.setCircuits2(transportverbindunSet);
					// update further subnet and label
					daoFactory.getSubnetworkDAO().update(furtherSubnetwork);
					toHistory.add(furtherSubnetwork.getName());
				}
				historyRecordList.add(createHistoryRecord(HistoryRecordConstants.SUBNETWORKINFO,
						HistoryRecordConstants.FROM, fromHistory, HistoryRecordConstants.TO, toHistory));
				updateHistory(transportverbindun.getId(), updateCircuitTO.getUserId(),
						HistoryActions.UPDATE_ATTRIBUTE, historyRecordList);

				updateLruCircuit(transportverbindun.getId(), updateCircuitTO.getUserId(), UsageStatus.U);
			}
		}
	}

	/**
	 * Create history record to create historynote.
	 * 
	 * @param historyAction
	 * @param historyRecord
	 * @return String
	 */
	@SuppressWarnings("unchecked")
	private String createHistoryRecord(String historyAction, Object... historyRecord) {
		StringBuilder stringBuilder;
		boolean flag;
		if (historyAction != null)
			stringBuilder = new StringBuilder(historyAction);
		else
			stringBuilder = new StringBuilder();

		if (historyRecord != null) {
			for (Object obj : historyRecord) {
				if (obj instanceof String) {
					stringBuilder.append((String) obj);
				} else if (obj instanceof List<?>) {
					List<String> list = (List<String>) obj;
					flag = false;
					for (String str : list) {
						if (flag)
							stringBuilder.append("," + str);
						else {
							stringBuilder.append(str);
							flag = true;
						}
					}
				}
			}
		}

		return stringBuilder.toString();
	}

	/**
	 * Insert changed attribute and data in history and historynote table for
	 * given circuit id.
	 * 
	 * @param circuitId id of the circuit
	 * @param userId id of the user
	 * @param actions
	 * @param historyRecords
	 * @throws RubinApplicationException
	 */
	private void updateHistory(Long circuitId , Long userId, String actions, List<String> historyRecords)
			throws RubinApplicationException {
		User user = daoFactory.getUserDAO().findById(userId);
		History subnetHistory = new History();
		if (user != null && user.getFirstName() != null && user.getSurname() != null)
			subnetHistory.setUser(user.getSurname() + "," + user.getFirstName());
		subnetHistory.setTimestamp(CommonUtilities.getCurrentAppServerDate());
		Circuit transportverbindun = new Circuit();
		transportverbindun.setId(circuitId);
		subnetHistory.setCircuit(transportverbindun);
		subnetHistory.setAction(actions.toString());
		
		daoFactory.getHistoryDAO().insert(subnetHistory);
		
		int count = 0;
		for (String historyRecord : historyRecords) {
			count++;
			HistoryNote historyNote = new HistoryNote();
			historyNote.setRecord(historyRecord);
			historyNote.setSequenceNumber(new Long(count));
			historyNote.setHistory(subnetHistory);
			daoFactory.getHistoryNoteDAO().insert(historyNote);
		}
	}
	
	/**
	 * find structured info for given circuit.
	 * 
	 * @param circuitId
	 *            circuit id
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public List<StructuredInformationTO> findStructuredInfoOfCircuit(Long circuitId) throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry in CircuitServiceImpl::findStructuredInfoOfCircuit()");
		}
		List<StructuredInformationDVO> structInfoDVOList = null;

		structInfoDVOList = daoFactory.getStructuredInformationDAO().<StructuredInformationDVO> findByProperty(
				NamedQueryConstants.STRUCTURED_INFORMATION_OFCIRCUIT, circuitId);
		List<StructuredInformationTO> structInfoTOList = new ArrayList<StructuredInformationTO>();
		for (StructuredInformationDVO structInfoDVO : structInfoDVOList) {
			StructuredInformationTO structInfoTO = new StructuredInformationTO(structInfoDVO.getId(), structInfoDVO
					.getDesignation(), structInfoDVO.getRemark(), structInfoDVO.getStructInfoTypeId(), structInfoDVO
					.getStructInfoTypedesignation(), structInfoDVO.getCircuitId());
			structInfoTOList.add(structInfoTO);
		}
		return structInfoTOList;
	}

	/**
	 * insert structured info for given circuit.
	 * 
	 * @param circuitId
	 * @param structInfoTO
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public Long insertStructuredInfo(Long circuitId, Long userId, StructuredInformationTO StructuredInformationTO)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry in CircuitServiceImpl::insertStructuredInfo()");
		}
		TransportverbindunTO circuitTO = StructuredInformationTO.getCircuitTO();
		if (circuitTO != null) {
			circuitTO.setId(circuitId);
		} else {
			circuitTO = new TransportverbindunTO();
			circuitTO.setId(circuitId);
			StructuredInformationTO.setCircuitTO(circuitTO);
		}

		StructuredInformation entity = (StructuredInformation) RubinMapper.getEntity(StructuredInformationTO,
				new StructuredInformation());
		Long structInfoId = daoFactory.getStructuredInformationDAO().insert(entity).getId();
		// updating history
		List<String> historyRecordList = new ArrayList<String>();
		historyRecordList.add(createHistoryRecord("StructuredInformation:", " inserted entry with ID :", structInfoId
				.toString()));
		updateHistory(circuitId, userId, HistoryActions.INSERT_STRUCT_INFO, historyRecordList);
		// updating lru circuit
		updateLruCircuit(circuitId, userId, UsageStatus.U);
		return structInfoId;
	}

	/**
	 * remove structured info for given circuit.
	 * 
	 * @param structuredInfoId
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public void removeStructuredInfo(Long structuredInfoId, Long userId) throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry in CircuitServiceImpl::removeStructuredInfo()");
		}
		List<Long> circuitIdList = daoFactory.getStructuredInformationDAO().findByProperty(
				NamedQueryConstants.FIND_CIRCUITID_BYSTRUCTUREDINFORMATIONID, structuredInfoId);
		Long circuitId = circuitIdList.get(0);
		// removing struct info
		daoFactory.getStructuredInformationDAO().delete(structuredInfoId);
		// updating history
		List<String> historyRecordList = new ArrayList<String>();
		historyRecordList.add(createHistoryRecord("StructuredInformation:", " removed entry with ID :",
				structuredInfoId.toString()));
		updateHistory(circuitId, userId, HistoryActions.DELETE_STUCT_INFO, historyRecordList);
		// updating lru circuit
		updateLruCircuit(circuitId, userId, UsageStatus.U);
	}

	/**
	 * update structured info for given circuit.
	 * 
	 * @param structuredInfoTO
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public void updateStructuredInfo(Long userId, StructuredInformationTO structuredInfoTO)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry in CircuitServiceImpl::updateStructuredInfo()");
		}
		// creating lists for updating history table
		List<String> historyRecordList = new ArrayList<String>();
		List<String> fromHistory = new ArrayList<String>();
		List<String> toHistory = new ArrayList<String>();
		// mapping struct info TO to entity
		StructuredInformation structInfo = (StructuredInformation) RubinMapper.getEntity(structuredInfoTO,
				new StructuredInformation());
		// finding struct info type by id
		Long structInfoTypeId = structuredInfoTO.getStructuredInformationTypeTO().getId();
		StructuredInformationType structInfoType = daoFactory.getStructuredInformationTypeDAO().findById(
				structInfoTypeId);
		toHistory.add(structInfoType.getDesignation());
		toHistory.add(structInfo.getDesignation());
		List<StructuredInformationDVO> structInfoDVOList = daoFactory.getStructuredInformationDAO().findByProperty(
				NamedQueryConstants.STRUCTUREDINFORMATION_BYID, structuredInfoTO.getId());
		fromHistory.add(structInfoDVOList.get(0).getStructInfoTypedesignation());
		fromHistory.add(structInfoDVOList.get(0).getDesignation());

		// updating structured info
		daoFactory.getStructuredInformationDAO().update(structInfo);

		TransportverbindunTO circuitTO = structuredInfoTO.getCircuitTO();
		// updating history
		historyRecordList.add(createHistoryRecord("StructuredInformation:", " from:", fromHistory, " to:", toHistory));
		updateHistory(circuitTO.getId(), userId, HistoryActions.UPDATE_STRUCT_INFO, historyRecordList);
		// updating lru circuit
		updateLruCircuit(circuitTO.getId(), userId, UsageStatus.U);
	}
	
	/**
	 * findAllProperties.
	 * 
	 * @return the list
	 * @throws RubinApplicationException
	 *             the RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#findAllProperties()
	 */
	public final List<PropertyTO> findAllProperties() throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry in CircuitServiceImpl::findAllProperties()");
		}

		List<PropertyDVO> propertyDVOList = daoFactory.getPropertyDAO().<PropertyDVO> findByProperty(
				NamedQueryConstants.PROPERTY_FINDALL, null);
		List<PropertyTO> propertyTOList = new ArrayList<PropertyTO>();

		for (PropertyDVO propertyDVO : propertyDVOList) {
			PropertyTO propertyTO = new PropertyTO(propertyDVO.getId(), propertyDVO.getName(), propertyDVO
					.getAssignment());
			propertyTOList.add(propertyTO);
		}
		return propertyTOList;
	}
	
	/**
	 * find Properties of circuit.
	 * 
	 * @return the list
	 * @throws RubinApplicationException
	 *             the RubinApplicationException
	 * 
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#findPropertiesOfCircuit()
	 */
	public List<PropertyTO> findPropertiesOfCircuit(Long circuitId) throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry in CircuitServiceImpl::findPropertiesOfCircuit()");
		}

		List<PropertyDVO> propertyDVOList = daoFactory.getPropertyDAO().<PropertyDVO> findByProperty(
				NamedQueryConstants.PROPERTY_FINDBYCIRCUITID, circuitId);
		List<PropertyTO> propertyTOList = new ArrayList<PropertyTO>();

		for (PropertyDVO propertyDVO : propertyDVOList) {
			PropertyTO propertyTO = new PropertyTO(propertyDVO.getId(), propertyDVO.getName(), propertyDVO
					.getAssignment());
			propertyTOList.add(propertyTO);
		}
		return propertyTOList;
	}
	
	/**
	 * This method finds the default web address assigned for the circuit.
	 * If one not found for circuit it gets the default value from central
	 * system data table.
	 * 
	 * @param circuitId
	 * 
	 * @return DefaultWebAddressTO
	 * 
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#findDefaultWebAddressOfCircuit(java.lang.Long)
	 */
	public DefaultWebAddressTO findDefaultWebAddressOfCircuit(Long circuitId) throws RubinApplicationException {
		DefaultWebAddressTO defaultWebAddressTO = new DefaultWebAddressTO();
		List<String> defaultWebAddressList = daoFactory.getCircuitDAO().findByProperty(
				NamedQueryConstants.CIRCUIT_FIND_DEFAULTWEBADDRESSOFCIRCUIT, circuitId);

		if (defaultWebAddressList.isEmpty() || defaultWebAddressList.get(0) == null
				|| defaultWebAddressList.get(0).trim().equals("")) {
			List<CentralSystemDataDVO> centralSystemDataDVOList = daoFactory.getCentralSystemDataDAO().findByProperty(
					NamedQueryConstants.FIND_DEFAULTWEBADDRESS, null);
			if ((centralSystemDataDVOList != null) && (!centralSystemDataDVOList.isEmpty())) {
				String defaultWebAddress = centralSystemDataDVOList.get(0).getZent4();
				// setting default web address from ZentraleSystemdat entity
				defaultWebAddressTO.setDefaultUrlFlag(false);
				defaultWebAddressTO.setDefaultWebAddress(defaultWebAddress);
			}

		} else {
			String defaultWebAddress = defaultWebAddressList.get(0);
			// setting default web address from base data url field
			// in Circuit entity
			defaultWebAddressTO.setDefaultUrlFlag(true);
			defaultWebAddressTO.setDefaultWebAddress(defaultWebAddress);
		}
		return defaultWebAddressTO;
	}
	
	/**
     * updates assignments(which include updating service, carrier, and 
     * properties information associated with the circuit) in circuit.
     * 
     * @throws RubinApplicationException the RubinApplicationException
     */
	private void updateAssignments(UpdateCircuitTO updateCircuitTO) throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry in CircuitServiceImpl::updateAssignments()");
		}
		// finding circuit using id
		Circuit circuit = daoFactory.getCircuitDAO().findById(updateCircuitTO.getCircuitId());
		Set<Property> propertyCollection = circuit.getProperties();

		ServiceTO serviceTO = updateCircuitTO.getServiceTO();
		// getting service entity using rubinmapper
		Service service = (Service) RubinMapper.getEntity(serviceTO, new Service());

		CarrierTO carrierTO = updateCircuitTO.getCarrierTO();
		// getting carrier entity using rubinmapper
		Carrier carrier = (Carrier) RubinMapper.getEntity(carrierTO, new Carrier(), "updateCircuit");

		// getting property TO collection from update circuit TO
		List<PropertyTO> propertyTos = updateCircuitTO.getPropertyTOCollection();

		// deleting old associated properties of circuit
		for (Property property : propertyCollection) {
			boolean deleteFlag = true;
			// getting iterator for property TO list
			Iterator<PropertyTO> iterator = propertyTos.iterator();
			while (iterator.hasNext()) {
				PropertyTO propertyTO = iterator.next();
				if (property.getId() == propertyTO.getId()) {
					deleteFlag = false;
					iterator.remove();
				}
			}
			if (deleteFlag) {
				property.getCircuits().remove(circuit);
				daoFactory.getPropertyDAO().update(property);
			}
		}

		// setting properties to circuit
		for (PropertyTO propertyTO : propertyTos) {
			Property property = (Property) RubinMapper.getEntity(propertyTO, new Property());
			Set<Circuit> transportverbinduns = new HashSet<Circuit>();
			property.setCircuits(transportverbinduns);
			property.getCircuits().add(circuit);
			// since property is owning side in many to many relationship,
			// to create relationship between property and circuit ,we are
			// adding circuit in property side and then updating the property
			daoFactory.getPropertyDAO().update(property);
		}
		// setting service to circuit
		circuit.setService(service);
		// setting carrier to circuit
		circuit.setCarrier(carrier);
		// updating the circuit
		daoFactory.getCircuitDAO().update(circuit);
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
		// creating new instance of circuit extras to
		CircuitExtrasTO circuitExtrasTO = new CircuitExtrasTO();
		// setting circuit id in circuit extras to
		circuitExtrasTO.setCircuitId(circuitId);
		// setting lsc in circuit extras TO
		List<String> lscList = daoFactory.getCircuitDAO().findByProperty(
				NamedQueryConstants.CIRCUIT_FIND_LSZ_BYCIRCUITID, circuitId);
		if ((lscList != null) && (!lscList.isEmpty())) {
			circuitExtrasTO.setLsc(lscList.get(0));
		}
		// list of routing TOs
		List<RoutingTO> routingTOList = new ArrayList<RoutingTO>();
		// /setting routing to list in circuit extras to
		circuitExtrasTO.setRoutingTOList(routingTOList);
		// finding routings for the current circuit
		List<RoutingDVO> routingDVOList = daoFactory.getRoutingDAO().findByProperty(
				NamedQueryConstants.FIND_ROUTINGBYCIRCUITID, circuitId);
		// looping over routings for the current circuit
		for (RoutingDVO routingDVO : routingDVOList) {
			System.out.println("routing id : " + routingDVO.getId());
			Long routingId = routingDVO.getId();
			// finding routing sections for current routing
			List<RoutingSectionDVO> routingSectionDVOList = daoFactory.getRoutingSectionDAO().findByProperty(
					NamedQueryConstants.FIND_ROUTINGSECTIONBYROUTINGID, routingId);
			// creating new routing to instance
			RoutingTO routingTO = new RoutingTO();
			// setting routing id to routing TO
			routingTO.setId(routingDVO.getId());
			List<RoutingSectionTO> routingSectionTOList = new ArrayList<RoutingSectionTO>();
			// setting list of routing section TO to routing TO
			routingTO.setRoutingSectionTOList(routingSectionTOList);
			// adding current routing to list
			routingTOList.add(routingTO);
			// looping over routing sections for the current routing
			for (RoutingSectionDVO routingSectionDVO : routingSectionDVOList) {
				System.out.println(routingSectionDVO.getId() + "  " + routingSectionDVO.getType());
				// creating new routing section to instance
				RoutingSectionTO routingSectionTO = new RoutingSectionTO();
				// setting routing section id to routing section to
				routingSectionTO.setId(routingSectionDVO.getId());
				// setting routing section type to routing section to
				routingSectionTO.setType(routingSectionDVO.getType());
				// creating new routing section info to

				// setting routing section info TO list to routing section TO
				// this is done because for section type Bearer there can be
				// more than one channels(and in turn circuits) and same for
				// cross-connect, where there can more than one cross-connect
				// for the given section type
				List<RoutingSectionInfoTO> routingSectionInfoTOList = new ArrayList<RoutingSectionInfoTO>();
				routingSectionTO.setRoutingSectionInfoTOList(routingSectionInfoTOList);
				routingSectionTOList.add(routingSectionTO);
				// defining list and object reference for
				// RoutingSectionTypeInfoDVO
				// getting routing section type string and converting it to enum
				String routingSectionType = routingSectionDVO.getType();
				RoutingSectionTypes routingSectionTypeEnum = Enum
						.valueOf(RoutingSectionTypes.class, routingSectionType);
				// defining list and object reference for
				// RoutingSectionTypeInfoDVO
				List<RoutingSectionTypeInfoDVO> routingSectioTypeInfoDVOList = null;
				RoutingSectionTypeInfoDVO routingSectionTypeInfoDVO = null;
				StringBuilder resultString = null;
				// checking the type of routing section
				switch (routingSectionTypeEnum) {
				// logic for routing section type L
				case L:
					// System.out.println("Routing section type is L");
					routingSectioTypeInfoDVOList = daoFactory.getRoutingSectionDAO().findByProperty(
							NamedQueryConstants.FIND_L_ROUTINGSCTIONTYPEINFO_BYROUTINGSECTIONID,
							routingSectionDVO.getId());
					routingSectionTypeInfoDVO = routingSectioTypeInfoDVOList.get(0);
					resultString = new StringBuilder();
					resultString.append(" ").append(routingSectionTypeInfoDVO.getSiteDesignationNationalA())
							.append("/").append(routingSectionTypeInfoDVO.getTerminalITUSuffixA()).append(" ").append(
									routingSectionTypeInfoDVO.getSiteDesignationNationalB()).append("/").append(
									routingSectionTypeInfoDVO.getTerminalITUSuffixB());
					// getting routing section value and converting it to enum
					String routingSectionValue = routingSectionTypeInfoDVO.getTunnelType();
					RoutingSectionInfoTO routingSectionInfoTOL = new RoutingSectionInfoTO();
					routingSectionInfoTOList.add(routingSectionInfoTOL);
					// setting different value for routing section type L
					routingSectionInfoTOL.setRoutingSectionDirective(routingSectionValue);
					routingSectionInfoTOL.setSiteDesignationNationalA(routingSectionTypeInfoDVO
							.getSiteDesignationNationalA());
					routingSectionInfoTOL.setTerminalITUSuffixA(routingSectionTypeInfoDVO.getTerminalITUSuffixA());
					routingSectionInfoTOL.setSiteDesignationNationalB(routingSectionTypeInfoDVO
							.getSiteDesignationNationalB());
					routingSectionInfoTOL.setTerminalITUSuffixB(routingSectionTypeInfoDVO.getTerminalITUSuffixB());
					// setting basic lattitude and longitude for termonals A and
					// B
					routingSectionInfoTOL.setBasicLatitudeA(routingSectionTypeInfoDVO.getBasicLatitudeA());
					routingSectionInfoTOL.setBasicLongitudeA(routingSectionTypeInfoDVO.getBasicLongitudeA());
					routingSectionInfoTOL.setBasicLatitudeB(routingSectionTypeInfoDVO.getBasicLatitudeB());
					routingSectionInfoTOL.setBasicLongitudeB(routingSectionTypeInfoDVO.getBasicLongitudeB());
					RoutingSectionTypes routingSectionValueEnum = Enum.valueOf(RoutingSectionTypes.class,
							routingSectionValue);
					// checking the routing section value
					switch (routingSectionValueEnum) {
					// logic for routing directive EK
					case EK:
						System.out.println(new StringBuilder("In House").append(resultString));
						break;
					// logic for routing directive LL
					case LL:
						System.out.println(new StringBuilder("Local Loop").append(resultString));

						break;
					// logic for routing directive TU
					case TU:
						System.out.println(new StringBuilder("Tunnel").append(resultString));
						break;
					// logic for routing directive NW
					case NW:
						System.out.println(new StringBuilder("NMS Link").append(resultString));
						break;
					// logic for routing directive OL
					case OL:
						System.out.println(new StringBuilder("Optical Link").append(resultString));
						break;
					// logic for routing directive TK
					case TK:
						System.out.println(new StringBuilder("Contract").append(resultString));
						break;
					}
					break;
				// logic for routing section type P
				case P:
					// System.out.println("Routing section type is P");
					// finding info for the current routing sectio of type P
					routingSectioTypeInfoDVOList = daoFactory.getRoutingSectionDAO().findByProperty(
							NamedQueryConstants.FIND_P_ROUTINGSCTIONTYPEINFO_BYROUTINGSECTIONID,
							routingSectionDVO.getId());
					routingSectionTypeInfoDVO = routingSectioTypeInfoDVOList.get(0);
					// populating information for routing section type P(Line
					// Segment)
					RoutingSectionInfoTO routingSectionInfoTOP = new RoutingSectionInfoTO();
					// adding info TO to list
					routingSectionInfoTOList.add(routingSectionInfoTOP);
					// populating routingSectionInfoTOP
					routingSectionInfoTOP.setLineId(routingSectionTypeInfoDVO.getLineId());
					routingSectionInfoTOP.setLineSegment(routingSectionTypeInfoDVO.getLineSegment());
					routingSectionInfoTOP.setLineLength(routingSectionTypeInfoDVO.getLineLength());
					routingSectionInfoTOP.setLineSpeed(routingSectionTypeInfoDVO.getLineSpeed());
					routingSectionInfoTOP.setSiteDesignationNationalA(routingSectionTypeInfoDVO
							.getSiteDesignationNationalA());
					routingSectionInfoTOP.setTerminalITUSuffixA(routingSectionTypeInfoDVO.getTerminalITUSuffixA());
					routingSectionInfoTOP.setSiteDesignationNationalB(routingSectionTypeInfoDVO
							.getSiteDesignationNationalB());
					routingSectionInfoTOP.setTerminalITUSuffixB(routingSectionTypeInfoDVO.getTerminalITUSuffixB());
					// showing routing section type P info
					resultString = new StringBuilder();
					resultString.append("Line").append(" ").append(routingSectionTypeInfoDVO.getLineId()).append(" ")
							.append(routingSectionTypeInfoDVO.getLineSegment()).append(" ").append(
									routingSectionTypeInfoDVO.getSiteDesignationNationalA()).append("/").append(
									routingSectionTypeInfoDVO.getTerminalITUSuffixA()).append(" ").append(
									routingSectionTypeInfoDVO.getSiteDesignationNationalB()).append("/").append(
									routingSectionTypeInfoDVO.getTerminalITUSuffixB());
					System.out.println(resultString);

					break;
				// logic for routing section type K
				case K:
					routingSectioTypeInfoDVOList = daoFactory.getRoutingSectionDAO().findByProperty(
							NamedQueryConstants.FIND_K_ROUTINGSCTIONTYPEINFO_BYROUTINGSECTIONID,
							routingSectionDVO.getId());
					for (RoutingSectionTypeInfoDVO routingSectionTypeInfo : routingSectioTypeInfoDVOList) {
						System.out.println("Found circuit" + " with ID : " + routingSectionTypeInfo.getCircuitId()
								+ " for circuit Id: " + circuitId);

						resultString = new StringBuilder();
						resultString.append(routingSectionTypeInfo.getSiteDesignationNationalA()).append("/").append(
								routingSectionTypeInfo.getTerminalITUSuffixA()).append(" ").append(
								routingSectionTypeInfo.getSiteDesignationNationalB()).append("/").append(
								routingSectionTypeInfo.getTerminalITUSuffixB()).append(" ").append(
								routingSectionTypeInfo.getLineCode()).append(" ").append(
								routingSectionTypeInfo.getTransOrdnungsnumm()).append(" ").append(routingSectionTypeInfo.getDelayMainMs());
						// populating information for routing section type
						// K(Bearer)
						RoutingSectionInfoTO routingSectionInfoTOK = new RoutingSectionInfoTO();
						routingSectionInfoTOK.setLineCode(routingSectionTypeInfo.getLineCode());
						routingSectionInfoTOK.setDelayMainMs(routingSectionTypeInfo.getDelayMainMs());
						routingSectionInfoTOK.setSiteDesignationNationalA(routingSectionTypeInfo
								.getSiteDesignationNationalA());
						routingSectionInfoTOK.setTerminalITUSuffixA(routingSectionTypeInfo.getTerminalITUSuffixA());
						routingSectionInfoTOK.setSiteDesignationNationalB(routingSectionTypeInfo
								.getSiteDesignationNationalB());
						routingSectionInfoTOK.setTerminalITUSuffixB(routingSectionTypeInfo.getTerminalITUSuffixB());
						System.out.println(resultString);
						System.out.println("*****START***" + routingSectionTypeInfo.getCircuitId()
								+ "*****************");
						CircuitExtrasTO innerCircuitExtrasTO = findExtrasOfCircuit(routingSectionTypeInfo
								.getCircuitId());
						routingSectionInfoTOK.setCircuitExtrasTO(innerCircuitExtrasTO);
						System.out.println("*****END*****" + routingSectionTypeInfo.getCircuitId()
								+ "*****************");
						// adding to list
						routingSectionInfoTOList.add(routingSectionInfoTOK);
					}
					break;
				// logic for routing section type E
				case E:
					List<CrossConnectDVO> crossConnectDVOList = daoFactory.getCrossConnectDAO().findByProperty(
							NamedQueryConstants.FIND_E_ROUTINGSCTIONTYPEINFO_BYROUTINGSECTIONID,
							routingSectionDVO.getId());
					for (CrossConnectDVO crossConnectDVO : crossConnectDVOList) {
						resultString = new StringBuilder();
						resultString.append("CrossConnect ").append(crossConnectDVO.getSiteDesignationNational())
								.append("/").append(crossConnectDVO.getTerminalITUSuffix());
						// populating information for routing section type
						// E(Cross connect)
						RoutingSectionInfoTO routingSectionInfoTOE = new RoutingSectionInfoTO();
						routingSectionInfoTOE.setSiteDesignationNationalA(crossConnectDVO.getSiteDesignationNational());
						routingSectionInfoTOE.setTerminalITUSuffixA(crossConnectDVO.getTerminalITUSuffix());
						// adding to list
						routingSectionInfoTOList.add(routingSectionInfoTOE);
						System.out.println(resultString);
					}
					break;
				}
			}
		}
		// TODO: method implementation work in progress
		// logic for populating TO remaining for P type
		return circuitExtrasTO;
	}
	
	/**
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#findSlaIndividuellIdOfCircuit(java.lang.Long)
	 */
	public Long findSlaIndividuellIdOfCircuit(Long circuitId) throws RubinApplicationException {

		Long slaIndividuellId = null;
		if (circuitId != null)
			slaIndividuellId = daoFactory.getSlaIndividualDAO().<Long> findSingleByProperty(
					NamedQueryConstants.SLA_INDIVIDUAL_FINDSLAIDIVIDUALIDBYCIRCUITID, circuitId);

		if (slaIndividuellId != null) {
			return slaIndividuellId;
		} else {
			return null;
		}
	}
	
	/**
	 * update lru circuit.
	 * 
	 * @param circuitId
	 * @param userId
	 * @throws RubinApplicationException
	 */
	private void updateLruCircuit(Long circuitId, Long userId, UsageStatus usageStatus)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry in CircuitServiceImpl::updateLruCircuit()");
		}
		LruCircuit lruCircuit = null;
		Map<Long, Object> parameterMap = new TreeMap<Long, Object>();
		parameterMap.put(1l, circuitId);
		parameterMap.put(2l, userId);
		// firing named query to check record in lru circuit table
		List<LruCircuit> lruCircuitList = daoFactory.getLruCircuitDAO().<LruCircuit> findByProperty(
				NamedQueryConstants.FIND_LRUCIRCUIT_BYPROPERTY, parameterMap);
		if (lruCircuitList.isEmpty()) {
			// if no record found in lru circuit table
			lruCircuit = new LruCircuit();
			lruCircuit.setUsage(usageStatus.toString());
			lruCircuit.setTimestampLastUsed(new Timestamp(Calendar.getInstance().getTimeInMillis()));
			Circuit circuit = new Circuit();
			circuit.setId(circuitId);
			lruCircuit.setCircuit(circuit);
			User user = new User();
			user.setId(userId);
			lruCircuit.setUser(user);
			// creating new entry in lru circuit
			daoFactory.getLruCircuitDAO().insert(lruCircuit);
		} else {
			// if record found in lru circuit table
			lruCircuit = lruCircuitList.get(0);
			lruCircuit.setUsage(usageStatus.toString());
			lruCircuit.setTimestampLastUsed(new Timestamp(Calendar.getInstance().getTimeInMillis()));
			// updating existing entry in lru circuit
			daoFactory.getLruCircuitDAO().update(lruCircuit);
		}
	}
	
	
	/**
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#assignNewSlaToCircuit(com.tsystems.rubin.server.transmodservices.to.CircuitSlaTO)
	 */
	public void assignNewSlaToCircuit(CircuitSlaTO circuitSlaTO) throws RubinApplicationException {
		Long circuitId = circuitSlaTO.getCircuitId();
		Long userId = circuitSlaTO.getUserID();
		SlaTO slaTO = circuitSlaTO.getSlaTO();
		List<SlaRecordTO> slaRecordTOList = circuitSlaTO.getSlaRecordTOList();
		List<String> historyActions = new ArrayList<String>();
		List<SlaRecord> slaRecordList = new ArrayList<SlaRecord>();

		if (slaRecordTOList != null) {
			for (SlaRecordTO slaRecordTO : slaRecordTOList) {
				slaRecordList.add((SlaRecord) RubinMapper.getEntity(slaRecordTO, new SlaRecord()));
			}
		}

		Circuit transportverbindun = new Circuit();
		transportverbindun.setId(circuitId);

		Sla sla = (Sla) RubinMapper.getEntity(slaTO, new Sla());
		User user = daoFactory.getUserDAO().findById(userId);

		SlaIndividual slaIndividuell = new SlaIndividual();
		slaIndividuell.setDateUpdated(CommonUtilities.getCurrentAppServerDate());
		slaIndividuell.setName(sla.getName());
		slaIndividuell.setUpdatedBy(user.getUserId());
		slaIndividuell.setCircuit(transportverbindun);
		slaIndividuell.setSla(sla);

		daoFactory.getSlaIndividualDAO().insert(slaIndividuell);
		int sortOrder = 0;
		for (SlaRecord slaRecord : slaRecordList) {
			sortOrder++;
			SlaRecordIndividual slaRecordIndividuell = new SlaRecordIndividual();
			slaRecordIndividuell.setSortingOrderNumber(new Long(sortOrder));
			slaRecordIndividuell.setValue(slaRecord.getDisplayValue());
			slaRecordIndividuell.setSlaIndividual(slaIndividuell);
			slaRecordIndividuell.setSlaRecord(slaRecord);
			daoFactory.getSlaRecordIndividualDAO().insert(slaRecordIndividuell);
			historyActions.add(createHistoryRecord(HistoryRecordConstants.SLARECORD, HistoryRecordConstants.TO,
					slaRecordIndividuell.getValue()));
		}

		historyActions
				.add(createHistoryRecord(HistoryRecordConstants.SLA, HistoryRecordConstants.TO, sla.getName()));
		updateHistory(circuitId, userId, HistoryActions.UPDATE_ATTRIBUTE, historyActions);
		updateLruCircuit(circuitId, userId, UsageStatus.U);
	}

	/**
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#disconnectSlaFromCircuit(java.lang.Long)
	 */
	public void disconnectSlaFromCircuit(Long circuitId, Long userId) throws RubinApplicationException {

		List<String> historyActions = new ArrayList<String>();

		SlaIndividual slaIndividuell = daoFactory.getSlaIndividualDAO().<SlaIndividual> findSingleByProperty(
				NamedQueryConstants.SLA_INDIVIDUAL_FINDSLAINDIVIDUALBYCIRCUITID, circuitId);
		slaIndividuell.setCircuit(null);
		slaIndividuell.setSla(null);
		daoFactory.getSlaIndividualDAO().update(slaIndividuell);

		List<SlaRecordIndividual> slaRecordIndividuellList = daoFactory.getSlaRecordIndividualDAO()
				.<SlaRecordIndividual> findByProperty(
						NamedQueryConstants.SLA_RECORD_INDIVIDUAL_FINDSLARECORDINDIVIDUALBYSLAINDIVIDUALID,
						slaIndividuell.getId());

		for (SlaRecordIndividual slaRecordIndividuell : slaRecordIndividuellList) {
			slaRecordIndividuell.setSlaIndividual(null);
			slaRecordIndividuell.setSlaRecord(null);
			daoFactory.getSlaRecordIndividualDAO().update(slaRecordIndividuell);
			historyActions.add(createHistoryRecord(HistoryRecordConstants.SLARECORD, HistoryRecordConstants.FROM,
					slaRecordIndividuell.getValue()));
			daoFactory.getSlaRecordIndividualDAO().delete(slaRecordIndividuell.getId());

		}

		daoFactory.getSlaIndividualDAO().delete(slaIndividuell.getId());

		historyActions.add(createHistoryRecord(HistoryRecordConstants.SLA, HistoryRecordConstants.FROM, slaIndividuell
				.getName()));
		updateHistory(circuitId, userId, HistoryActions.UPDATE_ATTRIBUTE, historyActions);
		updateLruCircuit(circuitId, userId, UsageStatus.U);

	}
	
	/**
	 * Update SlaRecordIndividual sortorder and value.
	 * 
	 * @param updateCircuitTO contains lisr of SlaRecordIndividuellTO info.
	 */
	private void updateSla(UpdateCircuitTO updateCircuitTO) throws RubinApplicationException {

		Long circuitId = updateCircuitTO.getCircuitId();
		Long userId = updateCircuitTO.getUserId();
		List<SlaRecordIndividualTO> slaRecordIndividuellTOList = updateCircuitTO.getSlaRecordIndividualTOList();
		for (SlaRecordIndividualTO slaRecordIndividuellTO : slaRecordIndividuellTOList) {

			SlaRecordIndividual slaRecordIndividuell = (SlaRecordIndividual) RubinMapper.getEntity(
					slaRecordIndividuellTO, new SlaRecordIndividual());
			daoFactory.getSlaRecordIndividualDAO().update(slaRecordIndividuell);
		}

		updateLruCircuit(circuitId, userId, UsageStatus.U);
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
	public CalculatedDelaysOfCircuitTO calculateDelaysOfCircuit(Long circuitId) throws RubinApplicationException {
		CalculatedDelaysOfCircuitTO finalDelaysOfCircuit = new CalculatedDelaysOfCircuitTO();
		// getting extras information for the circuit
		CircuitExtrasTO circuitExtrasTO = findExtrasOfCircuit(circuitId);
		List<CentralSystemDataDVO> centralSystemDataDVOList = daoFactory.getCentralSystemDataDAO().findByProperty(
				NamedQueryConstants.CENTRALSYSTEMDATA_FINDCENTRALSYSTEMDATA_BYTYPE, null);
		// getting data1,data2,data3, and data4 fields
		// from CentralSystemData entity
		String data1 = centralSystemDataDVOList.get(0).getZent1();
		String data2 = centralSystemDataDVOList.get(0).getZent2();
		String data3 = centralSystemDataDVOList.get(0).getZent3();

		double data2Value = Double.valueOf(data2).doubleValue();
		double data3Value = Double.valueOf(data3).doubleValue();
		// constant of runtime K
		double K = (data2Value / 100) * (1000 / data3Value);
		// calling for calculateDelayOfCircuit method and
		// sending circuit extras TO and constant of runtime
		// as parameters. K is required for calculation of delay of
		// contracts, tunnel, local loop, etc.
		CalculatedDelaysOfCircuitTO delayOfCircuit = calculateDelayOfCircuit(circuitExtrasTO, K);
		// getting data 1 value
		double data1Value = Double.valueOf(data1).doubleValue();
		// calculating delay of all trunks and special contracts
		double delayOfTrunksAndSpecialContracts = 0.0;
		if((delayOfCircuit.getNoOfTrunks() != 0) || (delayOfCircuit.getNoOfSpecialContracts() != 0)) {
		 delayOfTrunksAndSpecialContracts= ((delayOfCircuit.getNoOfTrunks()
				+ delayOfCircuit.getNoOfSpecialContracts() + 1) * data1Value) / 1000;
		}
		// calculating the round trip delay
		double totalDelayOfCircuit = (delayOfTrunksAndSpecialContracts + delayOfCircuit.getDelayValue()) * 2;
		finalDelaysOfCircuit.setDelayValue(totalDelayOfCircuit);
		return finalDelaysOfCircuit;
	}
	
	/**
	 * Calculate the distance between two end point.
	 * 
	 * @param lengthA
	 *            Geographic length of terminal A
	 * @param breadthA
	 *            Geographic breadth of terminal A
	 * @param lengthB
	 *            Geographic length of terminal B
	 * @param breadthB
	 *            Geographic breadth of terminal B
	 * @throws RubinApplicationException
	 *             if any exception occurs.
	 * @return estimated distance between two terminals.
	 * 
	 */
	private double calculateTwoTerminalsDistance(double length1, double breadth1, double length2, double breadth2)
			throws RubinApplicationException {

		/* This commented logic written in C language provided by client. 
		 * double B,DB,DB2,DL,DL2,CB2,CB,SB,SB2,T,T2,NUE2; double
		 * V,V2,V3,V4,POL1,POL2,POL3,POL4,POL5,POL6; double UE,VE;
		 * 
		 * const double pi = 3.14159265358979; const double ESTRICH =
		 * 6.71921874158156E-3; const double CQUER = 6398786.849; double BOG;
		 * double BOG2; BOG = pi / 180; BOG2 = BOG * BOG;
		 * 
		 * 
		 * B = (PHI1+PHI2)/2.0; DB = PHI2-PHI1; DB2 = DB*DB; DL = LAMB2-LAMB1;
		 * DL2 = DL*DL; CB = cos(B*BOG); CB2 = CB*CB; SB = sin(B*BOG); SB2 =
		 * SB*SB; T = tan(B*BOG); T2 = T*T; NUE2 = ESTRICH*CB2; V2 = 1.0+NUE2; V
		 * = sqrt(V2); V3 = V2*V; V4 = V2*V2;
		 * 
		 * POL1 = CQUER*BOG/V3; POL2 = CQUER*BOG*CB/V; POL3 =
		 * BOG2*CB2*(2.0+3.0*T2+2.0*NUE2)/(-24.0); POL4 =
		 * BOG2*NUE2*(1.0-T2)/V4/8.0; POL5 = BOG2*SB2/(-24.0); POL6 =
		 * BOG2*(1.0+NUE2*(1.0-9.0*T2))/V4/24.0;
		 * 
		 * UE = POL1*DB*(1.0+POL3*DL2+POL4*DB2); VE =
		 * POL2*DL*(1.0+POL5*DL2+POL6*DB2);
		 * 
		 * if((LAMB1 != 0.0) & (LAMB2 != 0.0) & (PHI1 != 0.0) & (PHI2 != 0.0)) {
		 * return sqrt(UE*UE+VE*VE)/1000.0; } else { return(0); }
		 */

		double BOG, BOG2, B, DB, DB2, DL, DL2, CB2, CB, SB, SB2, T, T2, NUE2;
		double V, V2, V3, V4, POL1, POL2, POL3, POL4, POL5, POL6, UE, VE;
		BOG = CommonConstants.PI / 180;
		BOG2 = BOG * BOG;
		B = (breadth1 + breadth2) / 2.0;
		DB = breadth2 - breadth1;
		DB2 = DB * DB;
		DL = length2 - length1;
		DL2 = DL * DL;
		CB = Math.cos(B * BOG);
		CB2 = CB * CB;
		SB = Math.sin(B * BOG);
		SB2 = SB * SB;
		T = Math.tan(B * BOG);
		T2 = T * T;
		NUE2 = CommonConstants.CLAY_FLOOR * CB2;
		V2 = 1.0 + NUE2;
		V = Math.sqrt(V2);
		V3 = V2 * V;
		V4 = V2 * V2;

		POL1 = CommonConstants.CQUER * BOG / V3;
		POL2 = CommonConstants.CQUER * BOG * CB / V;
		POL3 = BOG2 * CB2 * (2.0 + 3.0 * T2 + 2.0 * NUE2) / (-24.0);
		POL4 = BOG2 * NUE2 * (1.0 - T2) / V4 / 8.0;
		POL5 = BOG2 * SB2 / (-24.0);
		POL6 = BOG2 * (1.0 + NUE2 * (1.0 - 9.0 * T2)) / V4 / 24.0;

		UE = POL1 * DB * (1.0 + POL3 * DL2 + POL4 * DB2);
		VE = POL2 * DL * (1.0 + POL5 * DL2 + POL6 * DB2);

		if ((length1 != 0.0) && (breadth1 != 0.0) && (length2 != 0.0) && (breadth2 != 0.0)) {
			return Math.sqrt(UE * UE + VE * VE) / 1000.0;
		} else {
			return 0.0;
		}
	}
	
	/**
	 * This is a private method which calculates delay for current circuit.
	 * This is used in recursion and helps to calculate the delay in 
	 * calculateDelaysOfCircuit method.
	 * 
	 * @param circuitExtrasTO
	 * @return CalculatedDelaysOfCircuitTO
	 * @throws RubinApplicationException
	 */
	private CalculatedDelaysOfCircuitTO calculateDelayOfCircuit(CircuitExtrasTO circuitExtrasTO, double K)
			throws RubinApplicationException {
		CalculatedDelaysOfCircuitTO delayOfCircuitTO = new CalculatedDelaysOfCircuitTO();
		long noOfTrunks = 0l;
		long noOfSpecialContracts = 0l;
		double delayValue = 0.0d;
		// getting routings for current circuit and iterating over them
		List<RoutingTO> routingTOList = circuitExtrasTO.getRoutingTOList();
		for (RoutingTO routingTO : routingTOList) {
			// getting routing sections for current routing and iterating over
			// them
			List<RoutingSectionTO> routingSectionTOList = routingTO.getRoutingSectionTOList();
			for (RoutingSectionTO routingSectionTO : routingSectionTOList) {
				// getting routing section info TO list
				List<RoutingSectionInfoTO> routingSectionInfoTOList = routingSectionTO.getRoutingSectionInfoTOList();
				// getting routing section type
				String routingSectionType = routingSectionTO.getType();
				RoutingSectionTypes routingSectionTypeEnum = Enum
						.valueOf(RoutingSectionTypes.class, routingSectionType);
				// checking for routing section type
				switch (routingSectionTypeEnum) {
				case L:
					// info TO list will never be empty because if routing
					// section
					// for the routing is found, there has to be info for that
					// section
					RoutingSectionInfoTO routingSectionInfoTOL = routingSectionInfoTOList.get(0);
					String routingSectionDirective = routingSectionInfoTOL.getRoutingSectionDirective();
					RoutingSectionTypes routingSectionDirectiveEnum = Enum.valueOf(RoutingSectionTypes.class,
							routingSectionDirective);
					// checking for routing section directives
					switch (routingSectionDirectiveEnum) {
					case EK:
						// As EK corresponds to Inhouse, we don't calculate
						// delay
						// for this section
						break;
					case LL:
						// calculating delay for local loop
						double distanceOfLLTerminals = calculateTwoTerminalsDistance(routingSectionInfoTOL
								.getBasicLatitudeA().doubleValue(), routingSectionInfoTOL.getBasicLongitudeA()
								.doubleValue(), routingSectionInfoTOL.getBasicLatitudeB().doubleValue(),
								routingSectionInfoTOL.getBasicLongitudeB().doubleValue());
//						System.out.println("K value : "+K);
//						System.out.println("Distance : "+distanceOfLLTerminals);
						double localLoopDelay = K * distanceOfLLTerminals;
//						System.out.println("Local loop delay : "+localLoopDelay);
						delayValue = delayValue + localLoopDelay;
						break;
					case TU:
						// calculating delay for tunnel
						double distanceOfTUTerminals = calculateTwoTerminalsDistance(routingSectionInfoTOL
								.getBasicLatitudeA().doubleValue(), routingSectionInfoTOL.getBasicLongitudeA()
								.doubleValue(), routingSectionInfoTOL.getBasicLatitudeB().doubleValue(),
								routingSectionInfoTOL.getBasicLongitudeB().doubleValue());
//						System.out.println("K value : "+K);
//						System.out.println("Distance : "+distanceOfTUTerminals);
						double tunnelDelay = K * distanceOfTUTerminals;
//						System.out.println("Tunnel delay : "+tunnelDelay);
						delayValue = delayValue + tunnelDelay;
						break;
					case NW:
						// calculating delay for NMS link
						double distanceOfNWTerminals = calculateTwoTerminalsDistance(routingSectionInfoTOL
								.getBasicLatitudeA().doubleValue(), routingSectionInfoTOL.getBasicLongitudeA()
								.doubleValue(), routingSectionInfoTOL.getBasicLatitudeB().doubleValue(),
								routingSectionInfoTOL.getBasicLongitudeB().doubleValue());
//						System.out.println("K value : "+K);
//						System.out.println("Distance : "+distanceOfNWTerminals);
						double nmsLinkDelay = K * distanceOfNWTerminals;
//						System.out.println("NMS Link delay : "+nmsLinkDelay);
						delayValue = delayValue + nmsLinkDelay;
						break;
					case OL:
						// calculating delay for optical link
						double distanceOfOLTerminals = calculateTwoTerminalsDistance(routingSectionInfoTOL
								.getBasicLatitudeA().doubleValue(), routingSectionInfoTOL.getBasicLongitudeA()
								.doubleValue(), routingSectionInfoTOL.getBasicLatitudeB().doubleValue(),
								routingSectionInfoTOL.getBasicLongitudeB().doubleValue());
//						System.out.println("K value : "+K);
//						System.out.println("Distance : "+distanceOfOLTerminals);
						double opticalLinkDelay = K * distanceOfOLTerminals;
//						System.out.println("optical link delay : "+opticalLinkDelay);
						delayValue = delayValue + opticalLinkDelay;
						break;
					case TK:
						// calculating delay for contract
						String lsc = circuitExtrasTO.getLsc();
						if ((!"OL1".equals(lsc))
								|| (!"OL2".equals(lsc) || (!"OL3".equals(lsc)) || (!"OL4".equals(lsc)))) {
							noOfSpecialContracts = noOfSpecialContracts + 1;
						} else {
							double distanceOfTKTerminals = calculateTwoTerminalsDistance(routingSectionInfoTOL
									.getBasicLatitudeA().doubleValue(), routingSectionInfoTOL.getBasicLongitudeA()
									.doubleValue(), routingSectionInfoTOL.getBasicLatitudeB().doubleValue(),
									routingSectionInfoTOL.getBasicLongitudeB().doubleValue());
//							System.out.println("K value : "+K);
//							System.out.println("Distance : "+distanceOfTKTerminals);
							double contractDelay = K * distanceOfTKTerminals;
							delayValue = delayValue + contractDelay;
						}
						break;
					}
					break;
				case P:
					RoutingSectionInfoTO routingSectionInfoTOP = routingSectionInfoTOList.get(0);
					// getting line length and line speed
					BigDecimal lineLength = routingSectionInfoTOP.getLineLength();
					Long lineSpeed = routingSectionInfoTOP.getLineSpeed();
					// calculating delay for line segment
					double lineSegmentDelay = (lineLength.doubleValue()) / (lineSpeed * 1000);
					delayValue = delayValue + lineSegmentDelay;
					break;
				case K:
					for (RoutingSectionInfoTO routingSectionInfoTOK : routingSectionInfoTOList) {
						String lineCode = routingSectionInfoTOK.getLineCode();
						// System.out.println("********routing section infoTOK is******** : "+routingSectionInfoTOK);
						// System.out.println("routingSectionInfoTOK.getDelayMainMs() is : "+routingSectionInfoTOK.getDelayMainMs());
						if (routingSectionInfoTOK.getDelayMainMs().doubleValue() > 0) {
							delayValue = delayValue + routingSectionInfoTOK.getDelayMainMs().doubleValue();
						} else {
							if ("747".equals(lineCode) || "748".equals(lineCode) || "749".equals(lineCode)
									|| "76D".equals(lineCode)) {
								noOfTrunks = noOfTrunks + 1;
							}
							// calling for bearer circuit delay calculation
							CalculatedDelaysOfCircuitTO innerDelayOfCircuit = calculateDelayOfCircuit(
									routingSectionInfoTOK.getCircuitExtrasTO(), K);
							// adding trunks and special contracts from inner
							// circuit to current values
							noOfTrunks = noOfTrunks + innerDelayOfCircuit.getNoOfTrunks();
							noOfSpecialContracts = noOfSpecialContracts + innerDelayOfCircuit.getNoOfSpecialContracts();
							delayValue = delayValue + innerDelayOfCircuit.getDelayValue();
						}

					}
					break;
				case E:
					// As E corresponds to Cross Connect, we don't calculate
					// delay for this section
					break;
				}
			}
		}
		delayOfCircuitTO.setNoOfTrunks(noOfTrunks);
		delayOfCircuitTO.setNoOfSpecialContracts(noOfSpecialContracts);
		delayOfCircuitTO.setDelayValue(delayValue);
		return delayOfCircuitTO;
	}
	
	/**
	 * This method is used for circuit header data display. It gets circuit
	 * attributes and also sends information related to color code for the
	 * circuit header.
	 * 
	 * @param circuitId
	 * 
	 * @return CircuitTO
	 * 
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#findCircuitById(java.lang.Long)
	 */
	public CircuitTO findCircuitById(Long circuitId) throws RubinApplicationException {
		// creating new instance of CircuitTO
		CircuitTO circuitTO = new CircuitTO();
		// getting circuit DVO by circuit id
		List<CircuitDVO> circuitDVOList = daoFactory.getCircuitDAO().findByProperty(
				NamedQueryConstants.CIRCUIT_FIND_CIRCUIT_BYID, circuitId);
		System.out.println("circuitDVOList is empty: " + circuitDVOList.isEmpty());
		if (!circuitDVOList.isEmpty()) {
			System.out.println("Going inside list");
			CircuitDVO circuitDVO = circuitDVOList.get(0);
			circuitTO = new CircuitTO(circuitDVO.getCircuitId(), circuitDVO.getLsc(), circuitDVO.getsNo(), circuitDVO
					.getaL(), circuitDVO.getiL(), circuitDVO.getLscExtension(), circuitDVO
					.getSiteDesignationNationalA(), circuitDVO.getTerminalITUSuffixA(), circuitDVO
					.getSiteDesignationNationalB(), circuitDVO.getTerminalITUSuffixB(), circuitDVO.getTgnNmsId(),
					circuitDVO.getCircuitStatus());
			String colorCode = findColorCodesForCircuitHeader(circuitTO);
			circuitTO.setColorCode(colorCode);
		}
		return circuitTO;
	}
	
	/**
	 * This method finds the color code for the circuit header
	 * based on circuit status and fualt record for the circuit
	 * 
	 * @param circuitTO
	 * @return String
	 * @throws RubinApplicationException
	 */
	private String findColorCodesForCircuitHeader(CircuitTO circuitTO)
 throws RubinApplicationException {
		List<FaultRecordDVO> faultRecordDVOList = daoFactory.getFaultRecordDAO().findByProperty(
				NamedQueryConstants.FAULTRECORD_FINDFAULTRECORD_BYCIRCUITID, circuitTO.getId());
		if ((faultRecordDVOList != null) && !faultRecordDVOList.isEmpty()) {
			List<Routing> routingList = daoFactory.getRoutingDAO().findByProperty(
					NamedQueryConstants.ROUTING_FINDBYCIRCUITID_AND_FUEHRUNGSTATUS, circuitTO.getId());
			if (CircuitStatus.I.toString().equals(circuitTO.getStatus()) && (routingList != null)
					&& (!routingList.isEmpty())) {
				// checking if routing with routing type 'R' and with book
				// completion done
				// for the active circuit
				return ColorCodeConstants.COLOR_CODE3;
			} else if (CircuitStatus.I.toString().equals(circuitTO.getStatus())
					|| CircuitStatus.S.toString().equals(circuitTO.getStatus())) {
				// this is the condition for active or planned circuit having
				// fault
				return ColorCodeConstants.COLOR_CODE2;
			}
		}
		if (CircuitStatus.I.toString().equals(circuitTO.getStatus())) {
			// finding routing info for the circuit
			CircuitExtrasTO circuitExtrasTO = findExtrasOfCircuit(circuitTO.getId());
			// here we are checking whether the higher level circuit on which
			// this circuit depends on is S or N way.
			// If it is, then we are checking for fault record, and if found we
			// are returning color_code4, else we are returning color_code2
			// since
			// current circuit is active and with fault record
			String colorCode = findColorCodeForSorNwayCircuit(circuitExtrasTO);
			return colorCode;
		}
		// returning color_code1 for active/planned circuit without fault
		return ColorCodeConstants.COLOR_CODE1;
	}
	
	/**
	 * This method checks for S and N way higher level circuits(on which 
	 * current circuit depends on) and their fault record.
	 * If fault record is found for them it returns color_code4 else
	 * returns color_code2
	 * 
	 * @param circuitExtrasTO
	 * @return
	 * @throws RubinApplicationException
	 */
	private String findColorCodeForSorNwayCircuit(CircuitExtrasTO circuitExtrasTO) throws RubinApplicationException {
		String colorCode = ColorCodeConstants.COLOR_CODE1;
		// getting routings for current circuit
		List<RoutingTO> routingTOList = circuitExtrasTO.getRoutingTOList();
		for (RoutingTO routingTO : routingTOList) {
			// getting routing sections for current routing
			List<RoutingSectionTO> routingSectionTOList = routingTO.getRoutingSectionTOList();
			for (RoutingSectionTO routingSectionTO : routingSectionTOList) {
				// checking for routing section type K(Bearer)
				if (RoutingSectionTypes.K.toString().equals(routingSectionTO.getType())) {
					// getting routing section info(Bearer circuits for this
					// section)
					List<RoutingSectionInfoTO> routingSectionInfoTOList = routingSectionTO
							.getRoutingSectionInfoTOList();
					for (RoutingSectionInfoTO routingSectionInfoTOK : routingSectionInfoTOList) {
						CircuitExtrasTO innerCircuitExtrasTO = routingSectionInfoTOK.getCircuitExtrasTO();
						// finding S or N way bearer circuit and the fault
						// record of
						// such circuit in one single named query
						List<FaultRecordDVO> faultRecordDVOList = daoFactory.getFaultRecordDAO().findByProperty(
								NamedQueryConstants.FAULTRECORD_FINDFAULTRECORD_BYCIRCUITID_AND_AL,
								innerCircuitExtrasTO.getCircuitId());
						if ((faultRecordDVOList != null) && !faultRecordDVOList.isEmpty()) {
							return ColorCodeConstants.COLOR_CODE4;
						}
						colorCode = findColorCodeForSorNwayCircuit(innerCircuitExtrasTO);
						// if S or N way bearer ckt in higher level is found
						// with fault
						// return the color_code4
						if (ColorCodeConstants.COLOR_CODE4.equals(colorCode)) {
							return colorCode;
						}
					}
				}
			}
		}
		return colorCode;
	}
	
	/**
	 * This method updates extras information for the circuit.
	 * 
	 * @param updateCircuitTO
	 * @throws RubinApplicationException
	 */
	private void updateExtrasOfCircuit(UpdateCircuitTO updateCircuitTO) throws RubinApplicationException {
		String baseDataUrl = updateCircuitTO.getBaseDataUrl();
		BigDecimal delayMainsMs = new BigDecimal(updateCircuitTO.getDelayMainMs());
		BigDecimal delayXwayMs = new BigDecimal(updateCircuitTO.getDelayXwayMs());
		Circuit circuit = daoFactory.getCircuitDAO().findById(updateCircuitTO.getCircuitId());
		circuit.setBasedataUrl(baseDataUrl);
		circuit.setDelayMainMs(delayMainsMs);
		circuit.setDelayXwayMs(delayXwayMs);
		daoFactory.getCircuitDAO().update(circuit);
	}
		
	/**
	 * @see com.tsystems.rubin.server.transmodservices.CircuitService#insertCircuit(com.tsystems.rubin.server.transmodservices.to.CircuitCreateTO)
	 */
	public List<String> insertCircuit(CircuitCreateTO circuitCreateTO)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry in CircuitServiceImpl::insertCircuit()");
		}
		List<String> circuitList = new ArrayList<String>();
		Circuit circuitEntity = (Circuit) RubinMapper
				.getEntity(circuitCreateTO, new Circuit(),
						RubinMapper.INSERT_CIRCUIT);
		System.out.println("Circuit entity populated from CreateCircuitTO :"
				+ circuitEntity.toString());
		 
		if (circuitEntity != null) {

			for (int i = 0; i < circuitCreateTO.getNoOfCircuits(); i++) {
				String tgnNmsId = getTgnnmsId();
				circuitEntity.setTgnNmsId(tgnNmsId);
				circuitEntity = daoFactory.getCircuitDAO()
						.insert(circuitEntity);
				Long circuitId = circuitEntity.getId();
				System.out.println("circuitEntity.getOidTransportverbi()"
						+ circuitEntity.getId());

				RoutingTO routingTO = circuitCreateTO.getRoutingTO();
				if (routingTO != null) {
					routingTO.setFkCircuitId(circuitId);
					Routing routing = (Routing) RubinMapper.getEntity(
							routingTO, new Routing(),
							RubinMapper.INSERT_CIRCUIT_ROUTING);
					routing = daoFactory.getRoutingDAO().insert(routing);
				}

				CwoTO cwoTO = circuitCreateTO.getCwoTO();
				if (cwoTO != null) {

					cwoTO.setFkCircuitId(circuitId);
					CWO cwo = (CWO) RubinMapper.getEntity(
							cwoTO, new CWO(),
							RubinMapper.INSERT_CIRCUIT_CWO);
					cwo = daoFactory.getCwoDAO().insert(cwo);

				}

				ConfigurationTO configurationTO = circuitCreateTO
						.getConfigurationTO();
				if (configurationTO != null) {
					insertCircuitConfiguration(circuitEntity, configurationTO);

				}
				SlaIndividualTO slaIndividualTO = circuitCreateTO
						.getSlaIndividualTO();
				if (slaIndividualTO != null) {
					
					slaIndividualTO.setFkCircuitId(circuitId);
					slaIndividualTO.setDateUpdated(new Date(System.currentTimeMillis()));
					slaIndividualTO.setUpdatedBy(circuitCreateTO.getUserTO().getFirstName());
					
					insertCircuitSla(slaIndividualTO);
				}
				List<PropertyTO> propertyList = circuitCreateTO
						.getPropertyList();
				if (propertyList != null) {
					insertCircuitProperties(circuitEntity, propertyList);
				}

				circuitList.add(tgnNmsId);

			}

		}
		return circuitList;

	}

	private void insertCircuitConfiguration(Circuit circuit,
			ConfigurationTO configurationTO) throws RubinApplicationException {
		configurationTO.setKonfigurationsBeg(circuit.getEstablishDate());
		Configuration configuration = (Configuration) RubinMapper.getEntity(
				configurationTO, new Configuration(),
				"insertCircuitConfiguration");
		configuration = daoFactory.getConfigurationDAO().insert(configuration);

		TribScheme tribScheme = daoFactory.getTribSchemeDAO().findById(
				configurationTO.getFkTribSchemeId());

		Map<String, Long> paramMap = new TreeMap<String, Long>();
		paramMap.put("1", tribScheme.getId());
		// get the list of tributaries having parent tributary = null
		List<TributaryDVO> tributaryList = daoFactory.getTributaryDAO()
				.<TributaryDVO> findByProperty(
						NamedQueryConstants.TRIBUTARY_FINDBYTRIBSCHEMEID,
						paramMap);

		for (TributaryDVO tributaryDVO : tributaryList) {
			insertKanal(tributaryDVO, configuration, circuit, null);
		}

	}

	private void insertKanal(TributaryDVO tributaryDVO,
			Configuration configuration, Circuit circuit,
			Channel parentChannel) throws RubinApplicationException {
		Channel channel = (Channel) RubinMapper.getEntity(tributaryDVO, new Channel(),
				"insertCircuitKanal");
		// set the default values of kanal
		channel.setMark(CommonConstants.SPACE);
		channel.setLockOrUnlock("N");
		channel.setValidStart(circuit.getEstablishDate());
		channel.setConfiguration(configuration);
		if (parentChannel != null) {
			channel.setChannel(parentChannel);
		}
		channel = daoFactory.getChannelDAO().insert(channel);

		// get all the child of inserted kanal
		Map<String, Long> paramMap = new TreeMap<String, Long>();
		paramMap.put("1", tributaryDVO.getId());
		// get the list of tributaries having parent tributary = null
		List<TributaryDVO> tributaryList = daoFactory.getTributaryDAO()
				.<TributaryDVO> findByProperty(
						NamedQueryConstants.TRIBUTARY_FINDBYPARENTTRIBUTARYID,
						paramMap);

		if (tributaryList != null && !tributaryList.isEmpty()) {
			for (TributaryDVO childTributaryDVO : tributaryList) {
				insertKanal(childTributaryDVO, configuration, circuit, channel);
			}

		} else {
			return;
		}

	}

	private void insertCircuitProperties(Circuit circuit,
			List<PropertyTO> propertyList) throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger
					.debug("Call entry in CircuitServiceImpl::insertCircuitProperties()");
		}
		for (PropertyTO propertyTO : propertyList) {
			Property property = (Property) RubinMapper.getEntity(propertyTO,
					new Property());
			Set<Circuit> circuits = new HashSet<Circuit>();
			property.setCircuits(circuits);
			property.getCircuits().add(circuit);
			daoFactory.getPropertyDAO().insert(property);
		}
	}

	private void insertCircuitSla(SlaIndividualTO slaIndividualTO)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger
					.debug("Call entry in CircuitServiceImpl::insertCircuitSla()");
		}
		SlaIndividual slaIndividual = (SlaIndividual) RubinMapper.getEntity(
				slaIndividualTO, new SlaIndividual(),
				RubinMapper.INSERT_CIRCUIT_SLA_INDIVIDUAL);
	
		slaIndividual = daoFactory.getSlaIndividualDAO().insert(slaIndividual);
	
		Sla sla = daoFactory.getSlaDAO().findById(slaIndividual.getSla().getId());
		Set<SlaRecord> slaRecordCollection = sla.getSlaRecords();
		for (SlaRecord slaRecord : slaRecordCollection) {
			SlaRecordIndividual slaRecordIndividual = new SlaRecordIndividual();
			slaRecordIndividual.setSortingOrderNumber(slaRecord.getSortingOrderNumber());
			slaRecordIndividual.setValue(slaRecord.getDisplayValue());
			slaRecordIndividual.setSlaIndividual(slaIndividual);
			slaRecordIndividual.setSlaRecord(slaRecord);

			daoFactory.getSlaRecordIndividualDAO().insert(slaRecordIndividual);
		}
	}

	private String getTgnnmsId() throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry in CircuitServiceImpl::getTgnnmsId()");
		}
		CentralSystemDataDVO centralSystemDataDVO = daoFactory
				.getCentralSystemDataDAO().<CentralSystemDataDVO>findSingleByProperty(
						NamedQueryConstants.FIND_TGN_NMS_ID,
						CommonConstants.TGN_NMS_ID);
		CentralSystemDataTO centralDSystemDataTO = null;
		Date currentDate = new Date(System.currentTimeMillis());
		String tgnNmsId = null;
		long counter = CommonConstants.TGN_NMS_ID_COUNTER;
		if (centralSystemDataDVO == null) {
//			cst = new CentralSystemData();
//			cst.setType(CommonConstants.TGN_NMS_ID);
//			cst.setData2(CommonConstants.SPACE);
//			cst.setYear(currentDate);
//			cst = daoFactory.getCentralSystemDataDAO().insert(cst);
		}
		if (centralSystemDataDVO != null) {
			centralDSystemDataTO = new CentralSystemDataTO(centralSystemDataDVO.getId(),centralSystemDataDVO.getZent2(),centralSystemDataDVO.getYear());
			Date zentJahr = centralSystemDataDVO.getYear();
			int tgnNmsIdYearPrefix;
			if (CommonConstants.SPACE.equals(centralSystemDataDVO.getZent2())) {
				tgnNmsIdYearPrefix = currentDate.getYear() % 100;
				// as getYear() returns yyyy -1900 and we want just 2 LSB
				// i.e; if year= 2009 getYear() will return 109 and we want LSB
				// so 109%100 = 09
				tgnNmsId = convertTgnNmsIdToString(tgnNmsIdYearPrefix, counter);

			} else {
				if (zentJahr.getYear() == currentDate.getYear()) {
					counter = Long.valueOf((centralSystemDataDVO.getZent2()).substring(3));// get
																			// the
																			// "000001"
																			// part
																			// from
																			// the
																			// string
																			// "09-000001"
					tgnNmsIdYearPrefix = Integer.valueOf((centralSystemDataDVO.getZent2())
							.substring(0, 2));
					tgnNmsId = convertTgnNmsIdToString(tgnNmsIdYearPrefix,
							++counter);
				} else {
					tgnNmsIdYearPrefix = currentDate.getYear() % 100;
					counter = Long.valueOf(tgnNmsId).longValue();
					tgnNmsId = convertTgnNmsIdToString(tgnNmsIdYearPrefix,
							counter);
				}
			}
		//	centralSystemDataDVO.setZent2(tgnNmsId);
		//	centralSystemDataDVO.setYear(currentDate);
			CentralSystemData centralSystemDataEntity = (CentralSystemData) RubinMapper
			.getEntity(centralDSystemDataTO, new CentralSystemData(),
					RubinMapper.CENTRAL_SYSTEM_DATA_MAPPING);
			centralSystemDataEntity.setData2(tgnNmsId);
			centralSystemDataEntity.setYear(currentDate);
			
			daoFactory.getCentralSystemDataDAO().update(centralSystemDataEntity);
			
		}
		return tgnNmsId;
	}

	/**
	 * Helper method that convert year and circuitCounter into TGN-NMS-ID's
	 * format
	 * 
	 * @param yearCounter
	 *            year
	 * @param circuitCounter
	 *            circuit counter
	 * @return String TGNM-NMS-ID
	 */
	private String convertTgnNmsIdToString(int yearCounter, long circuitCounter) {
		if (logger.isDebugEnabled()) {
			logger
					.debug("Call entry in CircuitServiceImpl::convertTgnNmsIdToString()");
		}
		int counterLength = String.valueOf(circuitCounter).length();
		String retString = "";
		int counterMaxLength = 6;// To Do : Define it in constant file
		int caseOption = counterMaxLength - counterLength;
		int yearLength = String.valueOf(yearCounter).length();
		String yearPrefix = "";
		if (yearLength == 1) {
			yearPrefix = "0" + yearCounter+CommonConstants.DASH;
		} else {
			yearPrefix = yearPrefix + yearCounter+CommonConstants.DASH;
		}

		switch (caseOption) {
		case 0:
			retString = yearPrefix + circuitCounter;
			break;
		case 1:
			retString = yearPrefix + "0" + circuitCounter;
			break;

		case 2:
			retString = yearPrefix + "00" + circuitCounter;
			break;

		case 3:
			retString = yearPrefix + "000" + circuitCounter;
			break;

		case 4:
			retString = yearPrefix + "0000" + circuitCounter;
			break;

		case 5:
			retString = yearPrefix + "00000" + circuitCounter;
			break;

		default:// TO DO : throw exception because the length of circuitCounter
			// exceeds(max=6)
			retString = "";
		}
		return retString;
	}
}
