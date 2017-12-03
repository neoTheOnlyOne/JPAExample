package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * The Class SecurityVariables. - An entity for SECURITY_VARIABLES table.
 */
@Entity
@Table(name = "SECURITY_VARIABLES")
public class SecurityVariables implements Serializable {

    /** The name. */
    @Id
    @Column(name = "NAME")
    private String name;

    /** The value. */
    @Column(name = "VALUE0")
    private Long value;

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new security variables.
     */
    public SecurityVariables() {
        super();
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name.
     * 
     * @param name
     *            the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the value.
     * 
     * @return the value
     */
    public Long getValue() {
        return this.value;
    }

    /**
     * Sets the value.
     * 
     * @param value
     *            the new value
     */
    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * toString.
     * 
     * @return
     * 
     * @see java.lang.Object#toString()
     */

    public String toString() {
        return new ToStringBuilder(this).append("name", this.name).append("value", this.value)
                .toString();
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
        if (!(object instanceof SecurityVariables)) {
            return false;
        }
        SecurityVariables rhs = (SecurityVariables) object;
        return new EqualsBuilder().append(this.name, rhs.name).append(this.value, rhs.value)
                .isEquals();
    }

    /**
     * hashCode.
     * 
     * @return
     * 
     * @see java.lang.Object#hashCode()
     */

    public int hashCode() {
        return new HashCodeBuilder(-124835979, 1108447513).append(this.name).append(this.value)
                .toHashCode();
    }

}
