/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: LayerDVO.java
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
import org.apache.commons.lang.builder.ToStringBuilder;

import com.tsystems.rubin.common.util.CommonUtilities;

/**
 * The Class LayerDVO.- data value objects used in constructor query expression for Layer.
 */
public class LayerDVO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The name. */
    private String name;

    /** The description. */
    private String description;

    /** The id. */
    private Long id;

    /**
     * Instantiates a new layer dvo.
     */
    public LayerDVO() {

    }

    /**
     * Instantiates a new layer dvo.
     * 
     * @param id
     *            the id
     * @param name
     *            the name
     * @param description
     *            the description
     */
    public LayerDVO(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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
     * toString.
     * 
     * @return
     * 
     * @see java.lang.Object#toString()
     */

    public String toString() {
        return new ToStringBuilder(this).append("id", this.id).append("name", this.name).append(
                "description", this.description).toString();
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
        if (!(object instanceof LayerDVO)) {
            return false;
        }
        LayerDVO rhs = (LayerDVO) object;
        return new EqualsBuilder().append(this.name, rhs.name).append(this.description,
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
        return new HashCodeBuilder(1248865317, -417569183).append(this.name).append(
                this.description).toHashCode();
    }
}
