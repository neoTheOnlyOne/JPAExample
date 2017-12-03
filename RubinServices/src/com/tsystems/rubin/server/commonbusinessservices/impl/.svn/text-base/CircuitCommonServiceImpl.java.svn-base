package com.tsystems.rubin.server.commonbusinessservices.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.common.util.CommonConstants;
import com.tsystems.rubin.common.util.NamedQueryConstants;
import com.tsystems.rubin.server.commonbusinessservices.CircuitCommonService;
import com.tsystems.rubin.server.commonbusinessservices.to.PropertyTO;
import com.tsystems.rubin.server.commonbusinessservices.to.SubnetworkTO;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.dal.dvo.PropertyDVO;
import com.tsystems.rubin.server.dal.dvo.SubnetworkDVO;

public class CircuitCommonServiceImpl implements CircuitCommonService {
	private static org.apache.log4j.Logger logger = Logger
			.getLogger(CircuitCommonServiceImpl.class);

	/** The dao factory. */
	private DAOFactory daoFactory;

	public CircuitCommonServiceImpl(DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}



	public List<SubnetworkTO> findSubnetworksByLabel(String label)
			throws RubinApplicationException {
		List<SubnetworkDVO> subnetworkDVOList = null;
		List<SubnetworkTO> subnetworkTOList = new ArrayList<SubnetworkTO>();
		if(label==null || label.equals(CommonConstants.SPACE)){
			subnetworkDVOList =  daoFactory.getSubnetworkDAO()
			.<SubnetworkDVO> findByProperty(
					NamedQueryConstants.SUBNETWORK_FINDBYSUBNETWORKLABELNULL, null);
		}else if(label!=null&& label.equals("M")){
			subnetworkDVOList =  daoFactory.getSubnetworkDAO()
			.<SubnetworkDVO> findByProperty(
					NamedQueryConstants.SUBNETWORK_FINDBYSUBNETWORKLABEL, null);
		} else if(label!=null&& label.equals("O")){
			subnetworkDVOList = daoFactory.getSubnetworkDAO()
			.<SubnetworkDVO> findByProperty(
					NamedQueryConstants.SUBNETWORK_FINDALL, null);
		} 
		for (SubnetworkDVO subnetworkDVO : subnetworkDVOList) {
			SubnetworkTO subnetworkTO = new SubnetworkTO(subnetworkDVO.getId(),
					subnetworkDVO.getName(), subnetworkDVO.getLabel());
			subnetworkTOList.add(subnetworkTO);
		}

		return subnetworkTOList;
	}

	
	/**
     * findAllProperties.
     * 
     * @return the list
     * @throws RubinApplicationException the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.PropetryService#findAllProperties()
     */
    public final List<PropertyTO> findAllProperties() throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("");
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
	 * Extract first subnet of the circuit from Subnetwork table.
	 * 
	 * @return SubnetworkTO
	 * @param circuitId
	 *            Circuit id
	 * 
	 * @throws RubinApplicationException 
	 * 
	 * @see com.tsystems.rubin.server.commonbusinessservices.CircuitCommonService#findSubnetworksOfCircuit(java.lang.Long)
	 */
	public SubnetworkTO findFirstSubnetworksOfCircuit(Long circuitId) throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("");
		}

		SubnetworkDVO firstSubnetworkDVO = daoFactory.getSubnetworkDAO().<SubnetworkDVO> findSingleByProperty(
				NamedQueryConstants.SUBNETWORK_FINDFIRSTSUBNETBYCIRCUITID, circuitId);
		SubnetworkTO firstSubnetworkTO = new SubnetworkTO(firstSubnetworkDVO.getId(), firstSubnetworkDVO.getName(),
				firstSubnetworkDVO.getLabel());
		return firstSubnetworkTO;
	}

	/**
	 * Extract further subnets of the circuit from Subnetwork table.
	 * 
	 * @return List<SubnetworkTO>
	 * @param circuitId Circuit Id.
	 * 
	 * @throws RubinApplicationException
	 * @see com.tsystems.rubin.server.commonbusinessservices.CircuitCommonService#findFurtherSubnetworksOfCircuit(java.lang.Long)
	 */
	public List<SubnetworkTO> findFurtherSubnetworksOfCircuit(Long circuitId) throws RubinApplicationException {

		List<SubnetworkTO> subnetworkTOList = new ArrayList<SubnetworkTO>();

		SubnetworkDVO firstSubnetworkDVO = daoFactory.getSubnetworkDAO().<SubnetworkDVO> findSingleByProperty(
				NamedQueryConstants.SUBNETWORK_FINDFIRSTSUBNETBYCIRCUITID, circuitId);

		List<SubnetworkDVO> subnetworkDVOList = daoFactory.getSubnetworkDAO().<SubnetworkDVO> findByProperty(
				NamedQueryConstants.SUBNETWORK_FINDFURTHERSUBNETBYCIRCUITID, circuitId);

		for (SubnetworkDVO furtherSubnetworkDVO : subnetworkDVOList) {
			if (firstSubnetworkDVO.getId().longValue() != furtherSubnetworkDVO.getId().longValue()) {
				SubnetworkTO furtherSubnetworkTO = new SubnetworkTO(furtherSubnetworkDVO.getId(), furtherSubnetworkDVO
						.getName(), furtherSubnetworkDVO.getLabel());
				subnetworkTOList.add(furtherSubnetworkTO);
			}
		}
		return subnetworkTOList;
	}

}
