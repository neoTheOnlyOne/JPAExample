package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.tsystems.rubin.server.commonservices.usermgmt.to.Permission;

/**
 * The Class ProtectedResource. - An entity for AUTH_FUNKT_GRUP table.
 */
@Entity
@Table(name = "AUTH_FUNKT_GRUP")
public class ProtectedResource implements Serializable {

    /** The protected resource pk. */
    @EmbeddedId
    private ProtectedResourcePK protectedResourcePK;

    /** The permissions. */
    @Embedded
    private Permissions permissions;

    /** The hierarchy. */
    @Column(name = "SECURITY_HIERARCHY")
    private String hierarchy;

    /** The level. */
    @Column(name = "SECURITY_LEVEL")
    private String level;

    /** The resource. */
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "FK_FUNKTION_SECOID", referencedColumnName = "OID_FUNKTION")
    private Resource resource;

    /** The user group. */
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "FK_GRUPPEOID_GRUPP", referencedColumnName = "OID_GRUPPE")
    private UserGroup userGroup;

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new protected resource.
     */
    public ProtectedResource() {
    }

    /**
     * Sets the protected resource pk.
     * 
     * @param protectedResourcePK
     *            the new protected resource pk
     */
    public void setProtectedResourcePK(ProtectedResourcePK protectedResourcePK) {
        this.protectedResourcePK = protectedResourcePK;
    }

    /**
     * Gets the protected resource pk.
     * 
     * @return the protected resource pk
     */
    public ProtectedResourcePK getProtectedResourcePK() {
        return protectedResourcePK;
    }

    /**
     * Gets the hierarchy.
     * 
     * @return the hierarchy
     */
    public String getHierarchy() {
        return this.hierarchy;
    }

    /**
     * Sets the hierarchy.
     * 
     * @param hierarchy
     *            the new hierarchy
     */
    public void setHierarchy(String hierarchy) {
        this.hierarchy = hierarchy;
    }

    /**
     * Gets the level.
     * 
     * @return the level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * Sets the level.
     * 
     * @param level
     *            the new level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * Gets the resource.
     * 
     * @return the resource
     */
    public Resource getResource() {
        return this.resource;
    }

    /**
     * Sets the resource.
     * 
     * @param resource
     *            the new resource
     */
    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * Gets the user group.
     * 
     * @return the user group
     */
    public UserGroup getUserGroup() {
        return this.userGroup;
    }

    /**
     * Sets the user group.
     * 
     * @param userGroup
     *            the new user group
     */
    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }

    /**
     * Gets the permissions.
     * 
     * @return the permissions
     */
    public Permissions getPermissions() {
        return permissions;
    }

    /**
     * Sets the permissions.
     * 
     * @param permissions
     *            the new permissions
     */
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    /**
     * Gets the permission list.
     * 
     * @return the permission list
     */
    public List<Permission> getPermissionList() {
        List<Permission> permissionList = new ArrayList<Permission>();

        if ("Y".equalsIgnoreCase(permissions.getAddSecurity())) {
            permissionList.add(Permission.WRITE);
        }

        if ("Y".equalsIgnoreCase(permissions.getDelSecurity())) {
            permissionList.add(Permission.DELETE);
        }

        if ("Y".equalsIgnoreCase(permissions.getDisSecurity())) {
            permissionList.add(Permission.READ);
        }

        if ("Y".equalsIgnoreCase(permissions.getNoaSecurity())) {
            permissionList.add(Permission.ACCESSDENIED);
        }

        if ("Y".equalsIgnoreCase(permissions.getUpdSecurity())) {
            permissionList.add(Permission.CHANGE);
        }

        if ("Y".equalsIgnoreCase(permissions.getSupSecurity())) {
            permissionList.add(Permission.SPEC);
        }

        return permissionList;
    }

    /**
     * Sets the permission list.
     * 
     * @param permissionList
     *            the new permission list
     */
    public void setPermissionList(List<Permission> permissionList) {
        permissions.setAddSecurity("N");
        permissions.setDelSecurity("N");
        permissions.setDisSecurity("N");
        permissions.setNoaSecurity("N");
        permissions.setUpdSecurity("N");
        permissions.setSupSecurity("N");

        for (Permission permission : permissionList) {
            switch (permission) {
            case WRITE:
                permissions.setAddSecurity("Y");
                break;
            case DELETE:
                permissions.setDelSecurity("Y");
                break;
            case READ:
                permissions.setDisSecurity("Y");
                break;
            case ACCESSDENIED:
                permissions.setNoaSecurity("Y");
                break;
            case CHANGE:
                permissions.setUpdSecurity("Y");
                break;
            case SPEC:
                permissions.setSupSecurity("Y");
                break;
            }
        }
    }

    /**
     * toString.
     * 
     * @return
     * 
     * @see java.lang.Object#toString()
     */

    public String toString() {
        return new ToStringBuilder(this).append("userGroup", this.userGroup).append("resource",
                this.resource).append("level", this.level).append("hierarchy", this.hierarchy)
                .append("permissions", this.permissions).toString();
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
        if (!(object instanceof ProtectedResource)) {
            return false;
        }
        ProtectedResource rhs = (ProtectedResource) object;
        return new EqualsBuilder().append(this.userGroup, rhs.userGroup).append(this.resource,
                rhs.resource).append(this.level, rhs.level).append(this.hierarchy, rhs.hierarchy)
                .append(this.permissions, rhs.permissions).isEquals();
    }

    /**
     * hashCode.
     * 
     * @return
     * 
     * @see java.lang.Object#hashCode()
     */

    public int hashCode() {
        return new HashCodeBuilder(-1063153235, -1202030477).append(this.userGroup).append(
                this.resource).append(this.level).append(this.hierarchy).append(this.permissions)
                .toHashCode();
    }
}
