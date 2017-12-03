package com.tsystems.rubin.server.transmodservices.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.common.util.NamedQueryConstants;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.dal.dvo.CapacityDVO;
import com.tsystems.rubin.server.transmodservices.CapacityService;
import com.tsystems.rubin.server.transmodservices.to.CapacityValueTO;

public class CapacityServiceImpl implements CapacityService {

	private static org.apache.log4j.Logger logger = Logger
			.getLogger(CapacityServiceImpl.class);

	/** The dao factory. */
	private DAOFactory daoFactory;

	public CapacityServiceImpl(DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	/**
	 * Find All Capacity Values.
	 * 
	 * @return the list<CapacityValueTO>
	 * 
	 * @throws RubinApplicationException
	 *             the rubin application exception
	 */
	public List<CapacityValueTO> findAllCapacityValues()
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("");
		}

		List<CapacityDVO> capacityDVOList = null;

		capacityDVOList = daoFactory.getCapacityDAO()
				.<CapacityDVO> findByProperty(
						NamedQueryConstants.CAPACITY_FINDALLFORTRANSSEARCH,
						null);

		List<CapacityValueTO> capacityValueTOList = new ArrayList<CapacityValueTO>();

		for (CapacityDVO capacityDVO : capacityDVOList) {
			CapacityValueTO capacityValueTO = new CapacityValueTO(capacityDVO
					.getId(), capacityDVO.getName());
			capacityValueTOList.add(capacityValueTO);
		}

		return capacityValueTOList;
	}

}
