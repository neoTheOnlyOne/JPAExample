/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: LscDVO.java
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
package com.tsystems.rubin.server.dal.dvo;

import java.io.Serializable;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.tsystems.rubin.common.util.CommonUtilities;
import com.tsystems.rubin.server.commonservices.usermgmt.to.UserGroupTO;
import com.tsystems.rubin.server.refdatalsc.to.LayerTO;
import com.tsystems.rubin.server.refdatalsc.to.TribSchemeTO;

/**
 * The Class LscDVO. - data value objects used in constructor query expression for Lsc.
 */
public class LscDVO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    private Long id;

    /** The code. */
    private String code;

    /** The function code. */
    private String functionCode;

    /** The acronym nat. */
    private String acronymNat;

    /** The nominal capacity. */
    private String nominalCapacity;

    /** The description nat. */
    private String descriptionNat;

    /** The customer circuit. */
    private String customerCircuit;

    /** The label allowed. */
    private String labelAllowed;

    /** The sno numbering rule. */
    private String snoNumberingRule;

    /** The pstn traffic orientation. */
    private String pstnTrafficOrientation;

    /** The reconfigure. */
    private String reconfigure;

    /** The layer dvo. */
    private LayerTO layerDVO;

    /** The trib scheme dvo collection. */
    private Set<TribSchemeTO> tribSchemeDVOCollection;

    /** The unlimited utilization. */
    private String unlimitedUtilization;

    /** The user group to. */
    private UserGroupTO userGroupTO;

    /**
     * Instantiates a new lsc dvo.
     */
    public LscDVO() {

    }

    /**
     * Instantiates a new lsc dvo.
     * 
     * @param id
     *            the id
     * @param functionCode
     *            the function code
     * @param acronymNat
     *            the acronym nat
     * @param nominalCapacity
     *            the nominal capacity
     * @param layerTOId
     *            the layer to id
     * @param layerTOName
     *            the layer to name
     * @param descriptionNat
     *            the description nat
     * @param code
     *            the code
     */
    public LscDVO(Long id, String functionCode, String acronymNat, String nominalCapacity,
            Long layerTOId, String layerTOName, String descriptionNat, String code) {
        this.id = id;
        this.functionCode = functionCode;
        this.acronymNat = acronymNat;
        this.nominalCapacity = nominalCapacity;
        this.descriptionNat = descriptionNat;
        this.code = code;
        if (layerTOName != null) {
            this.layerDVO = new LayerTO();
            this.layerDVO.setId(layerTOId);
            this.layerDVO.setName(layerTOName);
        }
    }

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public final Long getId() {
        return id;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public final void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the customer circuit.
     * 
     * @return the customer circuit
     */
    public final String getCustomerCircuit() {
        return CommonUtilities.getTextValue(customerCircuit);
    }

    /**
     * Sets the customer circuit.
     * 
     * @param customerCircuit
     *            the new customer circuit
     */
    public final void setCustomerCircuit(String customerCircuit) {
        this.customerCircuit = customerCircuit;
    }

    /**
     * Gets the code.
     * 
     * @return the code
     */
    public final String getCode() {
        return CommonUtilities.getTextValue(code);
    }

    /**
     * Sets the code.
     * 
     * @param code
     *            the new code
     */
    public final void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets the function code.
     * 
     * @return the function code
     */
    public final String getFunctionCode() {
        return CommonUtilities.getTextValue(functionCode);
    }

    /**
     * Sets the function code.
     * 
     * @param functionCode
     *            the new function code
     */
    public final void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    /**
     * Gets the acronym nat.
     * 
     * @return the acronym nat
     */
    public final String getAcronymNat() {
        return CommonUtilities.getTextValue(acronymNat);
    }

    /**
     * Sets the acronym nat.
     * 
     * @param acronymNat
     *            the new acronym nat
     */
    public final void setAcronymNat(String acronymNat) {
        this.acronymNat = acronymNat;
    }

    /**
     * Gets the nominal capacity.
     * 
     * @return the nominal capacity
     */
    public final String getNominalCapacity() {
        return CommonUtilities.getTextValue(nominalCapacity);
    }

    /**
     * Sets the nominal capacity.
     * 
     * @param nominalCapacity
     *            the new nominal capacity
     */
    public final void setNominalCapacity(String nominalCapacity) {
        this.nominalCapacity = nominalCapacity;
    }

    /**
     * Gets the description nat.
     * 
     * @return the description nat
     */
    public final String getDescriptionNat() {
        return CommonUtilities.getTextValue(descriptionNat);
    }

    /**
     * Sets the description nat.
     * 
     * @param descriptionNat
     *            the new description nat
     */
    public final void setDescriptionNat(String descriptionNat) {
        this.descriptionNat = descriptionNat;
    }

    /**
     * Gets the label allowed.
     * 
     * @return the label allowed
     */
    public final String getLabelAllowed() {
        return CommonUtilities.getTextValue(labelAllowed);
    }

    /**
     * Sets the label allowed.
     * 
     * @param labelAllowed
     *            the new label allowed
     */
    public final void setLabelAllowed(String labelAllowed) {
        this.labelAllowed = labelAllowed;
    }

    /**
     * Gets the sno numbering rule.
     * 
     * @return the sno numbering rule
     */
    public final String getSnoNumberingRule() {
        return CommonUtilities.getTextValue(snoNumberingRule);
    }

    /**
     * Sets the sno numbering rule.
     * 
     * @param snoNumberingRule
     *            the new sno numbering rule
     */
    public final void setSnoNumberingRule(String snoNumberingRule) {
        this.snoNumberingRule = snoNumberingRule;
    }

    /**
     * Gets the pstn traffic orientation.
     * 
     * @return the pstn traffic orientation
     */
    public final String getPstnTrafficOrientation() {
        return CommonUtilities.getTextValue(pstnTrafficOrientation);
    }

    /**
     * Sets the pstn traffic orientation.
     * 
     * @param pstnTrafficOrientation
     *            the new pstn traffic orientation
     */
    public final void setPstnTrafficOrientation(String pstnTrafficOrientation) {
        this.pstnTrafficOrientation = pstnTrafficOrientation;
    }

    /**
     * Gets the reconfigure.
     * 
     * @return the reconfigure
     */
    public final String getReconfigure() {
        return CommonUtilities.getTextValue(reconfigure);
    }

    /**
     * Sets the reconfigure.
     * 
     * @param reconfigure
     *            the new reconfigure
     */
    public final void setReconfigure(String reconfigure) {
        this.reconfigure = reconfigure;
    }

    /**
     * Gets the unlimited utilization.
     * 
     * @return the unlimited utilization
     */
    public final String getUnlimitedUtilization() {
        return CommonUtilities.getTextValue(unlimitedUtilization);
    }

    /**
     * Sets the unlimited utilization.
     * 
     * @param unlimitedUtilization
     *            the new unlimited utilization
     */
    public final void setUnlimitedUtilization(String unlimitedUtilization) {
        this.unlimitedUtilization = unlimitedUtilization;
    }

    /**
     * Gets the layer dvo.
     * 
     * @return the layer dvo
     */
    public LayerTO getLayerDVO() {
        return layerDVO;
    }

    /**
     * Sets the layer dvo.
     * 
     * @param layerDVO
     *            the new layer dvo
     */
    public void setLayerDVO(LayerTO layerDVO) {
        this.layerDVO = layerDVO;
    }

    /**
     * Gets the trib scheme dvo collection.
     * 
     * @return the trib scheme dvo collection
     */
    public Set<TribSchemeTO> getTribSchemeDVOCollection() {
        return tribSchemeDVOCollection;
    }

    /**
     * Sets the trib scheme dvo collection.
     * 
     * @param tribSchemeDVOCollection
     *            the new trib scheme dvo collection
     */
    public void setTribSchemeDVOCollection(Set<TribSchemeTO> tribSchemeDVOCollection) {
        this.tribSchemeDVOCollection = tribSchemeDVOCollection;
    }

    /**
     * Gets the user group to.
     * 
     * @return the user group to
     */
    public UserGroupTO getUserGroupTO() {
        return userGroupTO;
    }

    /**
     * Sets the user group to.
     * 
     * @param userGroupTO
     *            the new user group to
     */
    public void setUserGroupTO(UserGroupTO userGroupTO) {
        this.userGroupTO = userGroupTO;
    }

    // This toString is used for the tree.
    // Do not modify.

    /**
     * toString.
     * 
     * @return
     * 
     * @see java.lang.Object#toString()
     */

    public final String toString() {
        return "LSC " + CommonUtilities.getTextValue(getCode()) + "("
                + CommonUtilities.getTextValue(getAcronymNat()) + ", "
                + CommonUtilities.getTextValue(getNominalCapacity()) + ")";
    }

    /**
     * equals.
     * 
     * @param object
     * @return
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */

    public boolean equals(Object object) {
        if (!(object instanceof LscDVO)) {
            return false;
        }
        LscDVO rhs = (LscDVO) object;
        return new EqualsBuilder().append(this.code, rhs.code).append(this.functionCode,
                rhs.functionCode).append(this.acronymNat, rhs.acronymNat).append(
                this.descriptionNat, rhs.descriptionNat).append(this.customerCircuit,
                rhs.customerCircuit).append(this.unlimitedUtilization, rhs.unlimitedUtilization)
                .append(this.labelAllowed, rhs.labelAllowed).append(this.nominalCapacity,
                        rhs.nominalCapacity).append(this.layerDVO, rhs.layerDVO).append(
                        this.reconfigure, rhs.reconfigure).append(this.snoNumberingRule,
                        rhs.snoNumberingRule).append(this.pstnTrafficOrientation,
                        rhs.pstnTrafficOrientation).isEquals();
    }

    /**
     * hashCode.
     * 
     * @return
     * 
     * @see java.lang.Object#hashCode()
     */

    public int hashCode() {
        return new HashCodeBuilder(448564867, -1698620579).append(this.code).append(
                this.functionCode).append(this.acronymNat).append(this.descriptionNat).append(
                this.customerCircuit).append(this.unlimitedUtilization).append(this.labelAllowed)
                .append(this.nominalCapacity).append(this.layerDVO).append(this.reconfigure)
                .append(this.snoNumberingRule).append(this.pstnTrafficOrientation).toHashCode();
    }

}
