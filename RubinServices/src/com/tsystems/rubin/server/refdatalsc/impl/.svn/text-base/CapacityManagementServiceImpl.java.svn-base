/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: CapacityManagementServiceImpl.java
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
package com.tsystems.rubin.server.refdatalsc.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.common.util.NamedQueryConstants;
import com.tsystems.rubin.server.commonutils.base.RubinMapper;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.dal.dvo.CapacityDVO;
import com.tsystems.rubin.server.dal.dvo.LayerDVO;
import com.tsystems.rubin.server.dal.dvo.LscDVO;
import com.tsystems.rubin.server.dal.dvo.TributaryDVO;
import com.tsystems.rubin.server.dal.entities.Capacity;
import com.tsystems.rubin.server.dal.entities.Layer;
import com.tsystems.rubin.server.dal.entities.Lsc;
import com.tsystems.rubin.server.dal.entities.TribScheme;
import com.tsystems.rubin.server.dal.entities.Tributary;
import com.tsystems.rubin.server.refdatalsc.CapacityManagementService;
import com.tsystems.rubin.server.refdatalsc.slsbadapter.CapacityManagementServiceSlsb;
import com.tsystems.rubin.server.refdatalsc.to.CapacityTO;
import com.tsystems.rubin.server.refdatalsc.to.LayerTO;
import com.tsystems.rubin.server.refdatalsc.to.LscTO;
import com.tsystems.rubin.server.refdatalsc.to.TribSchemeTO;
import com.tsystems.rubin.server.refdatalsc.to.TributaryTO;

/**
 * The Class CapacityManagementServiceImpl.Implementation for CapacityManagementService 
 * session bean interface contains business logic for capacity management related activities.
 */
public class CapacityManagementServiceImpl implements CapacityManagementService {

    /** The logger. */
    private static org.apache.log4j.Logger logger = Logger
            .getLogger(CapacityManagementServiceSlsb.class);

    /** The dao factory. */
    private DAOFactory daoFactory;

    /**
     * Instantiates a new capacity management service impl.
     * 
     * @param daoFactory
     *            the dao factory
     */
    public CapacityManagementServiceImpl(DAOFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    /**
     * findCapacityByProperty.
     * 
     * @param property the property
     * @return the list
     * @throws RubinApplicationException the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#findCapacityByProperty(java.lang.String)
     */
    public final List<CapacityTO> findCapacityByProperty(String property)
            throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("property=" + property);
        }

        List<CapacityTO> capacityTOList = new ArrayList<CapacityTO>();
        List<CapacityDVO> capacityDVOlist = daoFactory.getCapacityDAO()
                .<CapacityDVO> findByProperty(property, null);

        for (CapacityDVO capacityDVO : capacityDVOlist) {
            CapacityTO capacityTO = new CapacityTO(capacityDVO.getId(), capacityDVO.getName(),
                    capacityDVO.getSequence(), capacityDVO.getFactor(), capacityDVO.getUnit(),
                    capacityDVO.getDescription(), capacityDVO.getDefaultCapacity());
            capacityTOList.add(capacityTO);
        }

        return capacityTOList;
    }

    /**
     * countCapacityByName.
     * 
     * @param name the name
     * @return the boolean
     * @throws RubinApplicationException the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#countCapacityByName(java.lang.String)
     */
    public final boolean countCapacityByName(String name) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Name=" + name);
        }
       return  daoFactory.getCapacityDAO().countByProperty(
                NamedQueryConstants.CAPACITY_COUNTCAPACITYBYNAME, name).longValue() > 0;
    }

    /**
     * insertCapacity.
     * 
     * @param to the to
     * @return the long id
     * @throws RubinApplicationException the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#insertCapacity(com.tsystems.rubin.server.refdatalsc.to.CapacityTO)
     */
    public final Long insertCapacity(CapacityTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("CapacityTO=" + to);
        }

        Capacity entity = (Capacity) RubinMapper.getEntity(to, new Capacity());

        return daoFactory.getCapacityDAO().insert(entity).getId();
    }

    /**
     * updateCapacity.
     * 
     * @param to the to
     * @throws RubinApplicationException the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#updateCapacity(com.tsystems.rubin.server.refdatalsc.to.CapacityTO)
     */

    public final void updateCapacity(CapacityTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("CapacityTO=" + to);
        }

        daoFactory.getCapacityDAO().update((Capacity) RubinMapper.getEntity(to, new Capacity()));
    }

    /**
     * deleteCapacity.
     * 
     * @param capacityId the capacityId
     * @throws RubinApplicationException the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#deleteCapacity(java.lang.String)
     */

    public final void deleteCapacity(Long capacityId) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("capacityId=" + capacityId);
        }

        daoFactory.getCapacityDAO().delete(capacityId);
    }

    /**
     * findAllLayers.
     * 
     * @return the list
     * @throws RubinApplicationException the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#findAllLayers()
     */
    public final List<LayerTO> findAllLayers() throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("");
        }

        List<LayerDVO> layerDVOList = daoFactory.getLayerDAO().<LayerDVO> findByProperty(
                NamedQueryConstants.LAYER_FINDALL, null);
        List<LayerTO> layerTOList = new ArrayList<LayerTO>();

        for (LayerDVO layerDVO : layerDVOList) {
            LayerTO layerTO = new LayerTO(layerDVO.getId(), layerDVO.getName(), layerDVO
                    .getDescription());
            layerTOList.add(layerTO);
        }

        return layerTOList;
    }

    /**
     * countLayerByName.
     * 
     * @param name the name
     * @return the boolean
     * @throws RubinApplicationException the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#countLayerByName(java.lang.String)
     */
    public final boolean countLayerByName(String name) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Name=" + name);
        }
        return daoFactory.getLayerDAO()
                .countByProperty(NamedQueryConstants.LAYER_COUNTBYNAME, name).longValue() > 0;
    }

    /**
     * insertLayer.
     * 
     * @param to the to
     * @return the long id
     * @throws RubinApplicationException the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#insertLayer(com.tsystems.rubin.server.refdatalsc.to.LayerTO)
     */
    public final Long insertLayer(LayerTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("to=" + to);
        }

        Layer entity = (Layer) RubinMapper.getEntity(to, new Layer());
        return daoFactory.getLayerDAO().insert(entity).getId();
    }

    /**
     * updateLayer.
     * 
     * @param to the to
     * @throws RubinApplicationException the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#updateLayer(com.tsystems.rubin.server.refdatalsc.to.LayerTO)
     */
    public final void updateLayer(LayerTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("to=" + to);
        }

        daoFactory.getLayerDAO().update((Layer) RubinMapper.getEntity(to, new Layer()));
    }

    /**
     * deleteLayer.
     * 
     * @param layerId the id
     * @throws RubinApplicationException the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#deleteLayer(java.lang.Long)
     */
    public final void deleteLayer(Long layerId) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("layerId=" + layerId);
        }

        daoFactory.getLayerDAO().delete(layerId);
    }

   
    /**
     * findLscById.
     * 
     * @param lscId the lscId
     * @return the lscTO
     * @throws RubinApplicationException  the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#findLscById(java.lang.Long)
     */

    public final LscTO findLscById(Long lscId) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("lscId=" + lscId);
        }

        return (LscTO) RubinMapper.getTO(daoFactory.getLscDAO().findById(lscId), new LscTO());
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
     * countLscByCode.
     * 
     * @param code the code
     * @return the boolean
     * @throws RubinApplicationException  the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#countLscByCode(java.lang.String)
     */
    public boolean countLscByCode(String code) throws RubinApplicationException {
        return daoFactory.getLscDAO().countByProperty(NamedQueryConstants.LSC_COUNTBYCODE, code)
                .longValue() > 0;
    }

    /**
     * insertLsc.
     * 
     * @param to the to
     * @return the long id
     * @throws RubinApplicationException  the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#insertLsc(com.tsystems.rubin.server.refdatalsc.to.LscTO)
     */

    public final Long insertLsc(LscTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("to=" + to);
        }

        Lsc entity = (Lsc) RubinMapper.getEntity(to, new Lsc());
        return daoFactory.getLscDAO().insert(entity).getId();
    }

    /**
     * updateLsc.
     * 
     * @param to the to
     * @throws RubinApplicationException  the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#updateLsc(com.tsystems.rubin.server.refdatalsc.to.LscTO)
     */

    public final void updateLsc(LscTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("to=" + to);
        }

        daoFactory.getLscDAO().update((Lsc) RubinMapper.getEntity(to, new Lsc()));
    }

    /**
     * deleteLsc.
     * 
     * @param lscId the lscId
     * @throws RubinApplicationException  the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#deleteLsc(java.lang.String)
     */

    public final void deleteLsc(Long lscId) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("lscId=" + lscId);
        }

        daoFactory.getLscDAO().delete(lscId);
    }

    /**
     * countTributaryById.
     * 
     * @param property the property
     * @param value the value
     * @return the boolean
     * @throws RubinApplicationException  the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#countTributaryById(java.lang.String,
     *      java.lang.Object)
     */
    public Boolean countTributaryById(String property, Object value)
            throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("property=" + property + ", value=" + value);
        }

        return daoFactory.getTributaryDAO().countByProperty(property, value) > 0;
    }

    /**
     * insertTribScheme.
     * 
     * @param to the to
     * @return the long id
     * @throws RubinApplicationException  the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#insertTribScheme(com.tsystems.rubin.server.refdatalsc.to.TribSchemeTO)
     */

    public final Long insertTribScheme(TribSchemeTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("to=" + to);
        }

        TribScheme entity = (TribScheme) RubinMapper.getEntity(to, new TribScheme());
        return daoFactory.getTribSchemeDAO().insert(entity).getId();
    }

    /**
     * updateTribScheme.
     * 
     * @param to the to
     * @throws RubinApplicationException  the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#updateTribScheme(com.tsystems.rubin.server.refdatalsc.to.TribSchemeTO)
     */

    public final void updateTribScheme(TribSchemeTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("to=" + to);
        }

        daoFactory.getTribSchemeDAO().update(
                (TribScheme) RubinMapper.getEntity(to, new TribScheme()));
    }

    /**
     * deleteTribScheme.
     * 
     * @param tribSchemeId the tribSchemeId
     * @throws RubinApplicationException  the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#deleteTribScheme(java.lang.String)
     */

    public final void deleteTribScheme(Long tribSchemeId) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("tribSchemeId=" + tribSchemeId);
        }

        daoFactory.getTribSchemeDAO().delete(tribSchemeId);
    }

    /**
     * findAllTribsHavingChilds.
     * 
     * @param value the value
     * @param property the property
     * @return the list
     * @throws RubinApplicationException  the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#findAllTribsHavingChilds(java.lang.String,
     *      java.lang.String)
     */
    public List<Long> findAllTribsHavingChilds(String property, Object value)
            throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("property=" + property + ", value=" + value);
        }

        return daoFactory.getTributaryDAO().<Long> findByProperty(property, value);
    }

    /**
     * findTributariesByPropertyTribId.
     * 
     * @param property the property
     * @param value the value
     * @return the list
     * @throws RubinApplicationException  the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#findTributariesByPropertyTribId(java.lang.String,
     *      java.lang.Object)
     */
    public final List<TributaryTO> findTributariesByPropertyTribId(String property, Object value)
            throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("property=" + property + ", value=" + value);
        }

        List<TributaryTO> tributaryTOList = new ArrayList<TributaryTO>();
        List<TributaryDVO> tributaryDVOList = daoFactory.getTributaryDAO()
                .<TributaryDVO> findByProperty(property, value);

        if (logger.isDebugEnabled()) {
            logger.debug(((tributaryDVOList == null) ? "tributaryList=null" : "tributaryList.size="
                    + tributaryDVOList.size()));
        }

        for (TributaryDVO tributaryDVO : tributaryDVOList) {
            TributaryTO tributaryTO = new TributaryTO(tributaryDVO.getId(), tributaryDVO
                    .getSequence(), tributaryDVO.getChannel(), tributaryDVO.getTimeSlot(),
                    tributaryDVO.getCapacityDVO().getId(), tributaryDVO.getCapacityDVO().getName(),
                    tributaryDVO.getNotUsable(), tributaryDVO.getChanLevel(), tributaryDVO
                            .getTribSchemeDVO().getId(), tributaryDVO.getParentTributaryDVO()
                            .getId());
            tributaryTOList.add(tributaryTO);
        }

        return tributaryTOList;
    }

    /**
     * findTributariesByPropertyTribSchemeId.
     * 
     * @param property the property
     * @param value the value
     * @return the list
     * @throws RubinApplicationException  the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#findTributariesByPropertyTribSchemeId(java.lang.String,
     *      java.lang.Object)
     */

    public final List<TributaryTO> findTributariesByPropertyTribSchemeId(String property,
            Object value) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("property=" + property + ", value=" + value);
        }

        List<TributaryTO> tributaryTOList = new ArrayList<TributaryTO>();
        List<TributaryDVO> tributaryDVOList = daoFactory.getTributaryDAO()
                .<TributaryDVO> findByProperty(property, value);

        if (logger.isDebugEnabled()) {
            logger.debug(((tributaryDVOList == null) ? "tributaryList=null" : "tributaryList.size="
                    + tributaryDVOList.size()));
        }

        for (TributaryDVO tributaryDVO : tributaryDVOList) {
            TributaryTO tributaryTO = new TributaryTO(tributaryDVO.getId(), tributaryDVO
                    .getSequence(), tributaryDVO.getChannel(), tributaryDVO.getTimeSlot(),
                    tributaryDVO.getCapacityDVO().getId(), tributaryDVO.getCapacityDVO().getName(),
                    tributaryDVO.getNotUsable(), tributaryDVO.getChanLevel(), tributaryDVO
                            .getTribSchemeDVO().getId());
            tributaryTOList.add(tributaryTO);
        }

        return tributaryTOList;
    }

    /**
     * insertTributary.
     * 
     * @param to the to
     * @return the Long id
     * @throws RubinApplicationException  the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#insertTributary(com.tsystems.rubin.server.refdatalsc.to.TributaryTO)
     */

    public final Long insertTributary(TributaryTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("to=" + to);
        }

        Tributary entity = new Tributary();
        if (to.getParentTributaryTO() != null && null != to.getParentTributaryTO().getId()
                && !"".equals(to.getParentTributaryTO().getId())) {
            entity = (Tributary) RubinMapper.getTO(to, entity, RubinMapper.HAS_PARENT);
        } else {
            entity = (Tributary) RubinMapper.getTO(to, entity, RubinMapper.HAS_NO_PARENT);
        }

        return daoFactory.getTributaryDAO().insert(entity).getId();
    }

    /**
     * updateTributary.
     * 
     * @param to the to
     * @throws RubinApplicationException  the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#updateTributary(com.tsystems.rubin.server.refdatalsc.to.TributaryTO)
     */

    public final void updateTributary(TributaryTO to) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("to=" + to);
        }
        Tributary entity = new Tributary();

        if (to.getParentTributaryTO() != null && null != to.getParentTributaryTO().getId()
                && !"".equals(to.getParentTributaryTO().getId())) {
            entity = (Tributary) RubinMapper.getTO(to, entity, RubinMapper.HAS_PARENT);
        } else {
            entity = (Tributary) RubinMapper.getTO(to, entity, RubinMapper.HAS_NO_PARENT);
        }

        daoFactory.getTributaryDAO().update(entity);
    }

    /**
     * deleteTributary.
     * 
     * @param tributaryId the tributaryId
     * @throws RubinApplicationException  the RubinApplicationException
     * 
     * @see com.tsystems.rubin.server.refdatalsc.CapacityManagementService#deleteTributary(java.lang.String)
     */

    public final void deleteTributary(Long tributaryId) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("tributaryId=" + tributaryId);
        }
        daoFactory.getTributaryDAO().delete(tributaryId);
    }
}
