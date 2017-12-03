/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: TribSchemeDVO.java
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
 * The Class TribSchemeDVO. - data value objects used in constructor query expression for TribScheme.
 */
public class TribSchemeDVO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    private Long id;

    /** The name. */
    private String name;

    /** The description. */
    private String description;

    /** The default scheme. */
    private String defaultScheme;

    /** The lsc dvo. */
    private LscDVO lscDVO;

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
     * Gets the default scheme.
     * 
     * @return the default scheme
     */
    public final String getDefaultScheme() {
        return CommonUtilities.getTextValue(defaultScheme);
    }

    /**
     * Sets the default scheme.
     * 
     * @param defaultScheme
     *            the new default scheme
     */
    public final void setDefaultScheme(String defaultScheme) {
        this.defaultScheme = defaultScheme;
    }

    // This toString() is used in the tree implementation
    // Do not modify.

    /**
     * toString.
     * 
     * @return
     * 
     * @see java.lang.Object#toString()
     */

    public final String toString() {
        return getName() + "(" + getDescription() + ")";
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
        if (!(object instanceof TribSchemeDVO)) {
            return false;
        }
        TribSchemeDVO rhs = (TribSchemeDVO) object;
        return new EqualsBuilder().append(this.name, rhs.name).append(this.lscDVO, rhs.lscDVO)
                .append(this.defaultScheme, rhs.defaultScheme).append(this.description,
                        rhs.description).isEquals();
    }

    /**
     * hashCode.
     * 
     * @return
     * 
     * @see java.lang.Object#hashCode()
     */

    public int hashCode() {
        return new HashCodeBuilder(-603902961, 1024489427).append(this.name).append(this.lscDVO)
                .append(this.defaultScheme).append(this.description).toHashCode();
    }

}
