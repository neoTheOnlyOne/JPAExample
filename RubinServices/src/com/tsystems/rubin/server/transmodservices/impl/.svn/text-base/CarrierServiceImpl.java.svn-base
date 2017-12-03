package com.tsystems.rubin.server.transmodservices.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.common.util.NamedQueryConstants;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.dal.dvo.CarrierDVO;
import com.tsystems.rubin.server.transmodservices.CarrierService;
import com.tsystems.rubin.server.transmodservices.to.CarrierTO;

public class CarrierServiceImpl implements CarrierService {

	private static org.apache.log4j.Logger logger = Logger
			.getLogger(CarrierServiceImpl.class);

	/** The dao factory. */
	private DAOFactory daoFactory;

	public CarrierServiceImpl(DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	/**
	 * Find Carrier list By Search Criteria.
	 * 
	 * @return the list< CarrierTO>
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public List<CarrierTO> findCarrierlistBySearchCriteria(String searchType,
			Map<String, Object> searchParams) throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("");
		}
		List<CarrierDVO> carrierDVOList = null;		
		if (NamedQueryConstants.CARRIER_FINDCARRIERBYCARRIERCODE
				.equals(searchType)
				|| NamedQueryConstants.CARRIER_FINDCARRIERBYCARRIERCODEANDPROVIDER
						.equals(searchType)) {
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

		carrierDVOList = daoFactory.getCarrierDAO()
				.<CarrierDVO> findByProperty(searchType, searchParams);
		/*
		 * If the search by Carrier.CarrierCode does not return any values then
		 * we search for carrier with the parameter CarrierCode.CarrierCode. If
		 * this search also does not return any values then we search with the
		 * parameter Carrier.CarrierName.
		 */
		if ((carrierDVOList == null || carrierDVOList.isEmpty())
				&& (searchType
						.equals(NamedQueryConstants.CARRIER_FINDCARRIERBYCARRIERCODE) || searchType
						.equals(NamedQueryConstants.CARRIER_FINDCARRIERBYCARRIERCODEANDPROVIDER))) {
			if (searchType
					.equals(NamedQueryConstants.CARRIER_FINDCARRIERBYCARRIERCODE)) {
				carrierDVOList = findCarrierlistByCarrierCode(searchParams);
			} else if (searchType
					.equals(NamedQueryConstants.CARRIER_FINDCARRIERBYCARRIERCODEANDPROVIDER)) {
				carrierDVOList = findCarrierlistByCarrierCodeAndProvider(searchParams);
			}
		}
		List<CarrierTO> carrierTOList = new ArrayList<CarrierTO>();

		for (CarrierDVO carrierDVO : carrierDVOList) {
			CarrierTO carrierTO = new CarrierTO(carrierDVO.getId(), carrierDVO
					.getName(), carrierDVO.getItuCarrierAbbreviation(),
					carrierDVO.getCustomerId(), carrierDVO.getCode(),
					carrierDVO.getCountryID(), carrierDVO.getCountryId(),
					carrierDVO.getNationalDesignation());
			carrierTOList.add(carrierTO);
		}

		return carrierTOList;
	}

	/**
	 * findCarrierlistByCarrierCodeAndProvider.
	 * 
	 * @return the list< CarrierDVO>
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	private List<CarrierDVO> findCarrierlistByCarrierCodeAndProvider(
			Map<String, Object> searchParams) throws RubinApplicationException {
		List<CarrierDVO> carrierDVOList = null;
		carrierDVOList = daoFactory
				.getCarrierDAO()
				.<CarrierDVO> findByProperty(
						NamedQueryConstants.CARRIER_FINDCARRIERBYCARRIERCODE_CARRIERCODEANDPROVIDER,
						searchParams);
		if (carrierDVOList == null || carrierDVOList.isEmpty()) {
			carrierDVOList = daoFactory
					.getCarrierDAO()
					.<CarrierDVO> findByProperty(
							NamedQueryConstants.CARRIER_FINDCARRIERBYCARRIERNAMEANDPROVIDER,
							searchParams);
		}
		return carrierDVOList;
	}

	/**
	 * findCarrierlistByCarrierCode.
	 * 
	 * @return the list< CarrierDVO>
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	private List<CarrierDVO> findCarrierlistByCarrierCode(
			Map<String, Object> searchParams) throws RubinApplicationException {
		List<CarrierDVO> carrierDVOList = null;
		carrierDVOList = daoFactory
				.getCarrierDAO()
				.<CarrierDVO> findByProperty(
						NamedQueryConstants.CARRIER_FINDCARRIERBYCARRIERCODE_CARRIERCODE,
						searchParams);
		if (carrierDVOList == null || carrierDVOList.isEmpty()) {
			carrierDVOList = daoFactory
					.getCarrierDAO()
					.<CarrierDVO> findByProperty(
							NamedQueryConstants.CARRIER_FINDCARRIERBYCARRIERNAME,
							searchParams);
		}
		return carrierDVOList;
	}

}
