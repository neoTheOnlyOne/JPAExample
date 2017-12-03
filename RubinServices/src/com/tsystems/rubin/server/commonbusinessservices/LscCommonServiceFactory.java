//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.commonbusinessservices.LscCommonServiceFactory.java
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
package com.tsystems.rubin.server.commonbusinessservices;

import com.tsystems.rubin.server.commonbusinessservices.impl.LscCommonServiceImpl;
import com.tsystems.rubin.server.dal.DAOFactory;

public class LscCommonServiceFactory {
	public static final LscCommonService getLscCommonService(DAOFactory daoFactory) {
        return new LscCommonServiceImpl(daoFactory);
    }
}

