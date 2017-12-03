package com.tsystems.rubin.server.commonbusinessservices.slsbadapter;

import java.util.List;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.server.commonbusinessservices.LscCommonService;
import com.tsystems.rubin.server.commonbusinessservices.LscCommonServiceFactory;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.refdatalsc.CapacityManagementService;
import com.tsystems.rubin.server.refdatalsc.CapacityManagementServiceFactory;
import com.tsystems.rubin.server.refdatalsc.slsbadapter.CapacityManagementServiceSlsb;
import com.tsystems.rubin.server.refdatalsc.to.LscTO;
import com.tsystems.rubin.server.transmodservices.to.LscExtensionTO;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

/**
 * Session Bean implementation class LscCommonService
 */
@Stateless
public class LscCommonServiceSlsb implements LscCommonService {

	/** The logger. */
    private static org.apache.log4j.Logger logger = Logger
            .getLogger(LscCommonServiceSlsb.class);

    /** The em. */
    @PersistenceContext
    private EntityManager em;

    /** The capacity management service. */
    private LscCommonService lscCommonService;

    /**
     * Initialize.
     */
    @PostConstruct
    public void initialize() {
    	lscCommonService = LscCommonServiceFactory
                .getLscCommonService(DAOFactory.getDAOFactory(DAOFactory.JPA, em));
    }
    /**
     * findLscByProperty.
     * 
     * @param property
     * @param value
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#findLscByProperty(java.lang.String,
     *      java.lang.Object)
     */

    public final List<LscTO> findLscByProperty(String property, Object value)
            throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry findLscByProperty - " + "property=" + property + ", value="
                    + value);
        }
        return lscCommonService.findLscByProperty(property, value);
    }
    /**
     * findSingleLscByProperty.
     * 
     * @param property
     * @param value
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#findSingleLscByProperty(java.lang.String,
     *      java.lang.Object)
     */

    public final LscTO findSingleLscByProperty(String property, Object value)
            throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry findSingleLscByProperty - " + "property=" + property
                    + ", value=" + value);
        }
        return lscCommonService.findSingleLscByProperty(property, value);
    }
	/**
	 * @see com.tsystems.rubin.server.commonbusinessservices.LscCommonService#findAllLscExtension()
	 */
	public List<LscExtensionTO> findAllLscExtension()
			throws RubinApplicationException {
		return lscCommonService.findAllLscExtension();
	}
}
