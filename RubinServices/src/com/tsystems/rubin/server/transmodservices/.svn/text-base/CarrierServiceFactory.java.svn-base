package com.tsystems.rubin.server.transmodservices;

import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.transmodservices.impl.CarrierServiceImpl;


/**
 * A factory for creating CarrierService objects.
 */
public class CarrierServiceFactory {
	
	/**
	 * Gets the Carrier service.
	 * 
	 * @param daoFactory the dao factory
	 * 
	 * @return the Carrier service
	 */
	public static final CarrierService getCarrierService(DAOFactory daoFactory) {
        return new CarrierServiceImpl(daoFactory);
    }

}
