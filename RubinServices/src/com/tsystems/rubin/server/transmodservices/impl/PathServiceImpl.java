package com.tsystems.rubin.server.transmodservices.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.common.util.NamedQueryConstants;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.dal.dvo.WayDVO;
import com.tsystems.rubin.server.transmodservices.PathService;
import com.tsystems.rubin.server.transmodservices.to.WayTO;

public class PathServiceImpl implements PathService {

	private static org.apache.log4j.Logger logger = Logger
	.getLogger(PathServiceImpl.class);

	/** The dao factory. */
	private DAOFactory daoFactory;

	public PathServiceImpl(DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}
	
	public List<WayTO> findAllPathsOfNetwork(Long networkId)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("");
		}
		List<WayDVO> pathDVOList = null;

		//Add networkid to map as a query parameter
		Map<Long, Object> parameterMap = new TreeMap<Long, Object>();
        parameterMap.put(1L, networkId);
		
		//Find all the Path(Weg) that are present in database.
		pathDVOList = daoFactory.getServiceDAO()
				.<WayDVO> findByProperty(
						NamedQueryConstants.WAY_FINDALLPATH, parameterMap);

		List<WayTO> pathTOList = new ArrayList<WayTO>();

		//populate the list with all existing path(Weg).
		for (WayDVO pathDVO : pathDVOList) {
			WayTO pathTO = new WayTO(pathDVO.getId(), pathDVO
					.getName());
			pathTOList.add(pathTO);
		}

		return pathTOList;
	}
	
}