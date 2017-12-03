//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.commonbusinessservices.impl.LscCommonServiceImpl.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update:  Aug 4, 2009
 * 
 * Copyright © 2008 by T-Systems International GmbH, 
 * Frankfurt/Main
 * All rights, including that of the extracts pressure, 
 * photomechanical reproduction (including microscopy),
 * and the evaluation of databases, or similar
 * organizations, reserved.
 **/
//======================================================================================================================


//======================================================================================================================
//====== Package 
//======================================================================================================================
package com.tsystems.rubin.server.commonbusinessservices.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.common.util.NamedQueryConstants;
import com.tsystems.rubin.server.commonbusinessservices.LscCommonService;
import com.tsystems.rubin.server.commonutils.base.RubinMapper;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.dal.dvo.LscDVO;
import com.tsystems.rubin.server.dal.entities.Lsc;
import com.tsystems.rubin.server.dal.entities.LscExtension;
import com.tsystems.rubin.server.refdatalsc.to.LscTO;
import com.tsystems.rubin.server.transmodservices.to.LscExtensionTO;

public class LscCommonServiceImpl implements LscCommonService {
	private static org.apache.log4j.Logger logger = Logger
	.getLogger(LscCommonServiceImpl.class);

/** The dao factory. */
private DAOFactory daoFactory;

public LscCommonServiceImpl(DAOFactory daoFactory) {
this.daoFactory = daoFactory;
}
/**
 * findLscByProperty.
 * 
 * @param property the property
 * @param value the value
 * @return the list
 * @throws RubinApplicationException the RubinApplicationException
 * 
 * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#findLscByProperty(java.lang.String,
 *      java.lang.Object)
 */
public List<LscTO> findLscByProperty(String property, Object value)
        throws RubinApplicationException {
    if (logger.isDebugEnabled()) {
        logger.debug("property=" + property + ", value=" + value);
    }
    List<LscTO> lscTOList = new ArrayList<LscTO>();
    List<LscDVO> lscDVOList = daoFactory.getLscDAO().<LscDVO> findByProperty(property, value);

    if (logger.isDebugEnabled()) {
        logger.debug((lscDVOList == null) ? "lscList=null" : "lscList.size="
                + lscDVOList.size());
    }

    for (LscDVO lscDVO : lscDVOList) {
        LscTO lscTO = new LscTO(lscDVO.getId(), lscDVO.getFunctionCode(), lscDVO
                .getAcronymNat(), lscDVO.getNominalCapacity(), lscDVO.getLayerDVO().getId(),
                lscDVO.getLayerDVO().getName(), lscDVO.getDescriptionNat(), lscDVO.getCode());
        lscTOList.add(lscTO);
    }

    return lscTOList;
}
/**
 * findSingleLscByProperty.
 * 
 * @param property the property
 * @param value the value
 * @return lscTo
 * @throws RubinApplicationException  the RubinApplicationException
 * 
 * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#findSingleLscByProperty(java.lang.String,
 *      java.lang.Object)
 */

public final LscTO findSingleLscByProperty(String property, Object value)
        throws RubinApplicationException {
    if (logger.isDebugEnabled()) {
        logger.debug("property=" + property + ", value=" + value);
    }

    Lsc lsc = daoFactory.getLscDAO().findSingleByProperty(property, value);
    return (LscTO) RubinMapper.getTO(lsc, new LscTO());
}
/**
 * @see com.tsystems.rubin.server.commonbusinessservices.LscCommonService#findAllLscExtension()
 */
public List<LscExtensionTO> findAllLscExtension()
		throws RubinApplicationException {
	 if (logger.isDebugEnabled()) {
         logger.debug("");
     }
	 List<LscExtensionTO> lscExtensionTOList = new ArrayList<LscExtensionTO>();
	 List<LscExtension> lscExtensionList = daoFactory.getLscDAO().<LscExtension> findByProperty(NamedQueryConstants.LSCEXTENSION_FINDALL, null);
	 for(LscExtension lscExtension:lscExtensionList){
		 LscExtensionTO lscExtensionTO = (LscExtensionTO) RubinMapper.getTO(lscExtension, new LscExtensionTO());
		 lscExtensionTOList.add(lscExtensionTO);
	 }
	return lscExtensionTOList;
}



}


