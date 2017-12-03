package com.tsystems.rubin.server.transmodservices;

import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.transmodservices.impl.PathServiceImpl;

/**
 * A factory for creating PathService objects.
 */
public class PathServiceFactory {	

	/**
	 * Gets the Path service.
	 * 
	 * @param daoFactory the dao factory
	 * 
	 * @return the Path service
	 */
	public static final PathService getPathService(DAOFactory daoFactory) {
        return new PathServiceImpl(daoFactory);
    }
	
}