/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: CapacityManagementServiceSlsb.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update:  Jun 25, 2009 
 * 
 * Copyright © 2008 by T-Systems International GmbH, 
 * Frankfurt/Main
 * All rights, including that of the extracts pressure, 
 * photomechanical reproduction (including microscopy),
 * and the evaluation of databases, or similar
 * organizations, reserved.
 * 
 */
package com.tsystems.rubin.server.refdatalsc.slsbadapter;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.refdatalsc.CapacityManagementService;
import com.tsystems.rubin.server.refdatalsc.CapacityManagementServiceFactory;
import com.tsystems.rubin.server.refdatalsc.to.CapacityTO;
import com.tsystems.rubin.server.refdatalsc.to.LayerTO;
import com.tsystems.rubin.server.refdatalsc.to.LscTO;
import com.tsystems.rubin.server.refdatalsc.to.TribSchemeTO;
import com.tsystems.rubin.server.refdatalsc.to.TributaryTO;

/**
 * The Class CapacityManagementServiceSlsb.The stateless session bean for delegating call from session bean interface to the implementation.
 */
@Stateless
public class CapacityManagementServiceSlsb implements CapacityManagementService {

    /** The logger. */
    private static org.apache.log4j.Logger logger = Logger
            .getLogger(CapacityManagementServiceSlsb.class);

    /** The em. */
    @PersistenceContext
    private EntityManager em;

    /** The capacity management service. */
    private CapacityManagementService capacityManagementService;

    /**
     * Initialize.
     */
    @PostConstruct
    public void initialize() {
        capacityManagementService = CapacityManagementServiceFactory
                .getCapacityManagementService(DAOFactory.getDAOFactory(DAOFactory.JPA, em));
    }

    /**
     * findCapacityByProperty.
     * 
     * @param property
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#findCapacityByProperty(java.lang.String)
     */

    public final List<CapacityTO> findCapacityByProperty(String property)
            throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry findCapacityByProperty - " + "property=" + property);
        }

        return capacityManagementService.findCapacityByProperty(property);
    }

    /**
     * countCapacityByName.
     * 
     * @param name
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#countCapacityByName(java.lang.String)
     */
    public final boolean countCapacityByName(String name) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry countCapacityByName-" + "name=" + name);
        }
        return capacityManagementService.countCapacityByName(name);
    }

    /**
     * insertCapacity.
     * 
     * @param to
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#insertCapacity(com.tsystems.rubin.server.refdatalsc.to.CapacityTO)
     */

    public final Long insertCapacity(CapacityTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry insertCapacity - " + "to=" + to);
        }
        return capacityManagementService.insertCapacity(to);
    }

    /**
     * updateCapacity.
     * 
     * @param to
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#updateCapacity(com.tsystems.rubin.server.refdatalsc.to.CapacityTO)
     */

    public final void updateCapacity(CapacityTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry updateCapacity - " + "to=" + to);
        }
        capacityManagementService.updateCapacity(to);
    }

    /**
     * deleteCapacity.
     * 
     * @param capacityId
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#deleteCapacity(java.lang.String)
     */

    public final void deleteCapacity(Long capacityId) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry deleteCapacity - " + "capacityId=" + capacityId);
        }
        capacityManagementService.deleteCapacity(capacityId);
    }

    /**
     * findAllLayers.
     * 
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#findAllLayers()
     */

    public final List<LayerTO> findAllLayers() throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry findAllLayers - " + "");
        }
        return capacityManagementService.findAllLayers();
    }

    /**
     * countLayerByName.
     * 
     * @param name
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#countLayerByName(java.lang.String)
     */
    public final boolean countLayerByName(String name) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry countCapacityByName-" + "name=" + name);
        }
        return capacityManagementService.countLayerByName(name);
    }

    /**
     * insertLayer.
     * 
     * @param to
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#insertLayer(com.tsystems.rubin.server.refdatalsc.to.LayerTO)
     */

    public final Long insertLayer(LayerTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry insertLayer - " + "to=" + to);
        }
        return capacityManagementService.insertLayer(to);

    }

    /**
     * updateLayer.
     * 
     * @param to
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#updateLayer(com.tsystems.rubin.server.refdatalsc.to.LayerTO)
     */

    public final void updateLayer(LayerTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry updateLayer - " + "to=" + to);
        }
        capacityManagementService.updateLayer(to);
    }

    /**
     * deleteLayer.
     * 
     * @param layerId
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#deleteLayer(java.lang.String)
     */

    public final void deleteLayer(Long layerId) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry deleteLayer - " + "layerId=" + layerId);
        }
        capacityManagementService.deleteLayer(layerId);
    }

   
    /**
     * findLscById.
     * 
     * @param lscId
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#findLscById(java.lang.Long)
     */

    public final LscTO findLscById(Long lscId) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry findLscById - " + "lscId=" + lscId);
        }

        return capacityManagementService.findLscById(lscId);
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
        return capacityManagementService.findLscByProperty(property, value);
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
        return capacityManagementService.findSingleLscByProperty(property, value);
    }
    

    /**
     * countLscByCode.
     * 
     * @param code
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#countLscByCode(java.lang.String)
     */
    public boolean countLscByCode(String code) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry countLscByCode - " + "code=" + code);
        }
        return capacityManagementService.countLscByCode(code);
    }

    /**
     * insertLsc.
     * 
     * @param to
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#insertLsc(com.tsystems.rubin.server.refdatalsc.to.LscTO)
     */

    public final Long insertLsc(LscTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry insertLsc - " + "to=" + to);
        }
        return capacityManagementService.insertLsc(to);
    }

    /**
     * updateLsc.
     * 
     * @param to
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#updateLsc(com.tsystems.rubin.server.refdatalsc.to.LscTO)
     */

    public final void updateLsc(LscTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry updateLsc - " + "to=" + to);
        }
        capacityManagementService.updateLsc(to);
    }

    /**
     * deleteLsc.
     * 
     * @param lscId
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#deleteLsc(java.lang.String)
     */

    public final void deleteLsc(Long lscId) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry deleteLsc - " + "lscId=" + lscId);
        }
        capacityManagementService.deleteLsc(lscId);
    }

    /**
     * countTributaryById.
     * 
     * @param property
     * @param value
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#countTributaryById(java.lang.String,
     *      java.lang.Object)
     */
    public Boolean countTributaryById(String property, Object value)
            throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry countTributaryById - " + "property=" + property + ", value="
                    + value);
        }
        return capacityManagementService.countTributaryById(property, value);
    }

    /**
     * insertTribScheme.
     * 
     * @param to
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#insertTribScheme(com.tsystems.rubin.server.refdatalsc.to.TribSchemeTO)
     */

    public final Long insertTribScheme(TribSchemeTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry updateTribScheme - " + "to=" + to);
        }
        return capacityManagementService.insertTribScheme(to);
    }

    /**
     * updateTribScheme.
     * 
     * @param to
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#updateTribScheme(com.tsystems.rubin.server.refdatalsc.to.TribSchemeTO)
     */

    public final void updateTribScheme(TribSchemeTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry updateTribScheme - " + "to=" + to);
        }
        capacityManagementService.updateTribScheme(to);
    }

    /**
     * deleteTribScheme.
     * 
     * @param tribSchemeId
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#deleteTribScheme(java.lang.String)
     */

    public final void deleteTribScheme(Long tribSchemeId) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry deleteTribScheme - " + "tribSchemeId=" + tribSchemeId);
        }
        capacityManagementService.deleteTribScheme(tribSchemeId);
    }

    /**
     * findAllTribsHavingChilds.
     * 
     * @param tributaryId
     * @param parentType
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#findAllTribsHavingChilds(java.lang.String,
     *      java.lang.String)
     */
    public List<Long> findAllTribsHavingChilds(String property, Object value)
            throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry findAllTribsHavingChilds - " + "property=" + property
                    + ", value=" + value);
        }
        return capacityManagementService.findAllTribsHavingChilds(property, value);
    }

    /**
     * findTributariesByPropertyTribId.
     * 
     * @param property
     * @param value
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#findTributariesByPropertyTribId(java.lang.String,
     *      java.lang.Object)
     */
    public final List<TributaryTO> findTributariesByPropertyTribId(String property, Object value)
            throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry findTributariesByPropertyTribId - " + "property=" + property
                    + ", value=" + value);
        }
        return capacityManagementService.findTributariesByPropertyTribId(property, value);

    }

    /**
     * findTributariesByPropertyTribSchemeId.
     * 
     * @param property
     * @param value
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#findTributariesByPropertyTribSchemeId(java.lang.String,
     *      java.lang.Object)
     */

    public final List<TributaryTO> findTributariesByPropertyTribSchemeId(String property,
            Object value) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry findTributariesByPropertyTribSchemeId - " + "property="
                    + property + ", value=" + value);
        }
        return capacityManagementService.findTributariesByPropertyTribSchemeId(property, value);
    }

    /**
     * insertTributary.
     * 
     * @param to
     * @return
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#insertTributary(com.tsystems.rubin.server.refdatalsc.to.TributaryTO)
     */

    public final Long insertTributary(TributaryTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry insertTributary - " + "to=" + to);
        }
        return capacityManagementService.insertTributary(to);
    }

    /**
     * deleteTributary.
     * 
     * @param tributaryId
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#deleteTributary(java.lang.String)
     */

    public final void deleteTributary(Long tributaryId) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry updateTributary - " + "tributaryId=" + tributaryId);
        }
        capacityManagementService.deleteTributary(tributaryId);
    }

    /**
     * updateTributary.
     * 
     * @param to
     * @throws RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#updateTributary(com.tsystems.rubin.server.refdatalsc.to.TributaryTO)
     */

    public final void updateTributary(TributaryTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Call entry updateTributary - " + "to=" + to);
        }
        capacityManagementService.updateTributary(to);
    }

}
