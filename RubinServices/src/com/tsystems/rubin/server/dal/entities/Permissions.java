/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: Permissions.java
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
package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * The Class Permissions. - An embaddable class for security related Permissions.
 */
@Embeddable
public class Permissions implements Serializable {

    /** The sup security. */
    @Column(name = "SUP_SECURITY")
    private String supSecurity;

    /** The upd security. */
    @Column(name = "UPD_SECURITY")
    private String updSecurity;

    /** The add security. */
    @Column(name = "ADD_SECURITY")
    private String addSecurity;

    /** The del security. */
    @Column(name = "DEL_SECURITY")
    private String delSecurity;

    /** The dis security. */
    @Column(name = "DIS_SECURITY")
    private String disSecurity;

    /** The noa security. */
    @Column(name = "NOA_SECURITY")
    private String noaSecurity;

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new permissions.
     */
    public Permissions() {
    }

    /**
     * Gets the adds the security.
     * 
     * @return the adds the security
     */
    public String getAddSecurity() {
        return this.addSecurity;
    }

    /**
     * Sets the adds the security.
     * 
     * @param addSecurity
     *            the new adds the security
     */
    public void setAddSecurity(String addSecurity) {
        this.addSecurity = addSecurity;
    }

    /**
     * Gets the del security.
     * 
     * @return the del security
     */
    public String getDelSecurity() {
        return this.delSecurity;
    }

    /**
     * Sets the del security.
     * 
     * @param delSecurity
     *            the new del security
     */
    public void setDelSecurity(String delSecurity) {
        this.delSecurity = delSecurity;
    }

    /**
     * Gets the dis security.
     * 
     * @return the dis security
     */
    public String getDisSecurity() {
        return this.disSecurity;
    }

    /**
     * Sets the dis security.
     * 
     * @param disSecurity
     *            the new dis security
     */
    public void setDisSecurity(String disSecurity) {
        this.disSecurity = disSecurity;
    }

    /**
     * Gets the noa security.
     * 
     * @return the noa security
     */
    public String getNoaSecurity() {
        return this.noaSecurity;
    }

    /**
     * Sets the noa security.
     * 
     * @param noaSecurity
     *            the new noa security
     */
    public void setNoaSecurity(String noaSecurity) {
        this.noaSecurity = noaSecurity;
    }

    /**
     * Gets the sup security.
     * 
     * @return the sup security
     */
    public String getSupSecurity() {
        return this.supSecurity;
    }

    /**
     * Sets the sup security.
     * 
     * @param supSecurity
     *            the new sup security
     */
    public void setSupSecurity(String supSecurity) {
        this.supSecurity = supSecurity;
    }

    /**
     * Gets the upd security.
     * 
     * @return the upd security
     */
    public String getUpdSecurity() {
        return this.updSecurity;
    }

    /**
     * Sets the upd security.
     * 
     * @param updSecurity
     *            the new upd security
     */
    public void setUpdSecurity(String updSecurity) {
        this.updSecurity = updSecurity;
    }

    /**
     * toString.
     * 
     * @return
     * 
     * @see java.lang.Object#toString()
     */

    public String toString() {
        return new ToStringBuilder(this).append("updSecurity", this.updSecurity).append(
                "noaSecurity", this.noaSecurity).append("disSecurity", this.disSecurity).append(
                "delSecurity", this.delSecurity).append("addSecurity", this.addSecurity).append(
                "supSecurity", this.supSecurity).toString();
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
        if (!(object instanceof Permissions)) {
            return false;
        }
        Permissions rhs = (Permissions) object;
        return new EqualsBuilder().append(this.updSecurity, rhs.updSecurity).append(
                this.noaSecurity, rhs.noaSecurity).append(this.disSecurity, rhs.disSecurity)
                .append(this.delSecurity, rhs.delSecurity)
                .append(this.addSecurity, rhs.addSecurity)
                .append(this.supSecurity, rhs.supSecurity).isEquals();
    }

    /**
     * hashCode.
     * 
     * @return
     * 
     * @see java.lang.Object#hashCode()
     */

    public int hashCode() {
        return new HashCodeBuilder(-1185275529, 831845047).append(this.updSecurity).append(
                this.noaSecurity).append(this.disSecurity).append(this.delSecurity).append(
                this.addSecurity).append(this.supSecurity).toHashCode();
    }

}
