package com.tsystems.rubin.server.transmodservices;

import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.transmodservices.impl.NetworkServiceImpl;

/**
 * A factory for creating NetworkService objects.
 */
public class NetworkServiceFactory {
	
	/**
	 * Gets the Network service.
	 * 
	 * @param daoFactory the dao factory
	 * 
	 * @return the Network service
	 */
	public static final NetworkService getNetworkService(DAOFactory daoFactory) {
        return new NetworkServiceImpl(daoFactory);
    }
}