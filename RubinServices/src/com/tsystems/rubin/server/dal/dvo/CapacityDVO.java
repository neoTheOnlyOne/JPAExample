/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: CapacityDVO.java
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

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.tsystems.rubin.common.util.CommonUtilities;

/**
 * The Class CapacityDVO. - data value objects used in constructor query expression for Capacity.
 */
public class CapacityDVO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    private Long id;

    /** The name. */
    private String name;

    /** The sequence. */
    private String sequence;

    /** The factor. */
    private String factor;

    /** The unit. */
    private String unit;

    /** The description. */
    private String description;

    /** The default capacity. */
    private String defaultCapacity;

    /**
     * Instantiates a new capacity dvo.
     */
    public CapacityDVO() {
    }

    /**
     * Instantiates a new capacity dvo.
     * 
     * @param id
     *            the id
     * @param name
     *            the name
     * @param sequence
     *            the sequence
     * @param factor
     *            the factor
     * @param unit
     *            the unit
     * @param description
     *            the description
     * @param defaultCapacity
     *            the default capacity
     */
    public CapacityDVO(Long id, String name, Long sequence, Long factor, String unit,
            String description, String defaultCapacity) {
        this.id = id;
        this.name = name;
        this.sequence = Long.toString(sequence);
        if (factor != null) {
            this.factor = Long.toString(factor);
        }
        this.description = description;
        this.defaultCapacity = defaultCapacity;
        this.unit = unit;
    }
    
    /**
     * Instantiates a new capacity dvo.
     * 
     * @param id
     *            the id
     * @param name
     *            the name
     * 
     */
    public CapacityDVO(Long id, String name) {
        this.id = id;
        this.name = name;        
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
     * Gets the name.
     * 
     * @return the name
     */
    public final String getName() {
        return CommonUtilities.getTextValue(name);
    }

    /**
     * Sets the name.
     * 
     * @param name
     *            the new name
     */
    public final void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the sequence.
     * 
     * @return the sequence
     */
    public final String getSequence() {
        return CommonUtilities.getTextValue(sequence);
    }

    /**
     * Sets the sequence.
     * 
     * @param sequence
     *            the new sequence
     */
    public final void setSequence(String sequence) {
        this.sequence = sequence;
    }

    /**
     * Gets the factor.
     * 
     * @return the factor
     */
    public final String getFactor() {
        return CommonUtilities.getTextValue(factor);
    }

    /**
     * Sets the factor.
     * 
     * @param factor
     *            the new factor
     */
    public final void setFactor(String factor) {
        this.factor = factor;
    }

    /**
     * Gets the unit.
     * 
     * @return the unit
     */
    public final String getUnit() {
        return CommonUtilities.getTextValue(unit);
    }

    /**
     * Sets the unit.
     * 
     * @param unit
     *            the new unit
     */
    public final void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Gets the description.
     * 
     * @return the description
     */
    public final String getDescription() {
        return CommonUtilities.getTextValue(description);
    }

    /**
     * Sets the description.
     * 
     * @param description
     *            the new description
     */
    public final void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the default capacity.
     * 
     * @return the default capacity
     */
    public final String getDefaultCapacity() {
        return CommonUtilities.getTextValue(defaultCapacity);
    }

    /**
     * Sets the default capacity.
     * 
     * @param defaultCapacityLocal
     *            the new default capacity
     */
    public final void setdefaultCapacity(String defaultCapacityLocal) {
        this.defaultCapacity = defaultCapacityLocal;
    }

    // This toString is used for display in the tree
    // DO not modify.

    /**
     * toString.
     * 
     * @return the string
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return getName();
    }

    /**
     * equals.
     * 
     * @param object the object
     * @return the boolean
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object object) {
        if (!(object instanceof CapacityDVO)) {
            return false;
        }
        CapacityDVO rhs = (CapacityDVO) object;
        return new EqualsBuilder().append(this.name, rhs.name).append(this.defaultCapacity,
                rhs.defaultCapacity).append(this.unit, rhs.unit)
                .append(this.sequence, rhs.sequence).append(this.description, rhs.description)
                .append(this.factor, rhs.factor).isEquals();
    }

    /**
     * hashCode.
     * 
     * @return the hashcode
     * 
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return new HashCodeBuilder(1779553455, 1904947793).append(this.name).append(
                this.defaultCapacity).append(this.unit).append(this.sequence).append(
                this.description).append(this.factor).toHashCode();
    }
}
