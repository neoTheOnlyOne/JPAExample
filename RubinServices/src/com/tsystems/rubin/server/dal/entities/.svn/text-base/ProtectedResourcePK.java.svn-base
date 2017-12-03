package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * The Class ProtectedResourcePK. JPA Composite key for protected resources. 
 */
@Embeddable
public class ProtectedResourcePK implements Serializable {

    /** The user group id. */
    @Column(name = "FK_GRUPPEOID_GRUPP", nullable = false, insertable = false, updatable = false)
    private Long userGroupId;

    /** The resource id. */
    @Column(name = "FK_FUNKTION_SECOID", nullable = false, insertable = false, updatable = false)
    private Long resourceId;

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new protected resource pk.
     */
    public ProtectedResourcePK() {
    }

    /**
     * Gets the user group id.
     * 
     * @return the user group id
     */
    public Long getUserGroupId() {
        return userGroupId;
    }

    /**
     * Sets the user group id.
     * 
     * @param userGroupId
     *            the new user group id
     */
    public void setUserGroupId(Long userGroupId) {
        this.userGroupId = userGroupId;
    }

    /**
     * Gets the resource id.
     * 
     * @return the resource id
     */
    public Long getResourceId() {
        return resourceId;
    }

    /**
     * Sets the resource id.
     * 
     * @param resourceId
     *            the new resource id
     */
    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * toString.
     * 
     * @return
     * 
     * @see java.lang.Object#toString()
     */

    public String toString() {
        return new ToStringBuilder(this).append("userGroupId", this.userGroupId).append(
                "resourceId", this.resourceId).toString();
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
        if (!(object instanceof ProtectedResourcePK)) {
            return false;
        }
        ProtectedResourcePK rhs = (ProtectedResourcePK) object;
        return new EqualsBuilder().append(this.userGroupId, rhs.userGroupId).append(
                this.resourceId, rhs.resourceId).isEquals();
    }

    /**
     * hashCode.
     * 
     * @return
     * 
     * @see java.lang.Object#hashCode()
     */

    public int hashCode() {
        return new HashCodeBuilder(-728105501, 569717241).append(this.userGroupId).append(
                this.resourceId).toHashCode();
    }
}
