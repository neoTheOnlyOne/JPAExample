package com.tsystems.rubin.server.transmodservices.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.common.util.NamedQueryConstants;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.dal.dvo.NetworkDVO;
import com.tsystems.rubin.server.transmodservices.NetworkService;
import com.tsystems.rubin.server.transmodservices.to.NetworkTO;

public class NetworkServiceImpl implements NetworkService {

	private static org.apache.log4j.Logger logger = Logger
	.getLogger(NetworkServiceImpl.class);

	/** The dao factory. */
	private DAOFactory daoFactory;

	public NetworkServiceImpl(DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
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
			logger.debug("");
		}
		List<NetworkDVO> netzwerkDVOList = null;

		 Map<Long, Object> parameterMap = new TreeMap<Long, Object>();
	        parameterMap.put(1L, carrierId);
		
		//Find all the Network that are present in database.
		netzwerkDVOList = daoFactory.getNetworkDAO()
				.<NetworkDVO> findByProperty(
						NamedQueryConstants.NETWORK_FINDALLNETWORK, parameterMap);

		List<NetworkTO> netzwerkTOList = new ArrayList<NetworkTO>();

		//populate the list with all existing Network.
		for (NetworkDVO netzwerkDVO : netzwerkDVOList) {
			NetworkTO netzwerkTO = new NetworkTO(netzwerkDVO.getId(), netzwerkDVO
					.getName());
			netzwerkTOList.add(netzwerkTO);
		}

		return netzwerkTOList;
	}
}