package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * The Class Resource. - An entity for FUNKTION_SECU table.
 */
@Entity
@Table(name = "FUNKTION_SECU")
public class Resource implements Serializable {

    /** The id. */
    @Id
    @Column(name = "OID_FUNKTION")
    private Long id;

    /** The description. */
    @Column(name = "FUNKTIONSBESCHREIB")
    private String description;

    /** The name. */
    @Column(name = "FUNKTIONSBEZEICHNU")
    private String name;

    @OneToMany(mappedBy="resource")
	private Set<ProtectedResource> protectedResources;
    
    @OneToMany(mappedBy="resourceId")
	private Set<ActivityAudit> activityAudits;

	@OneToMany(mappedBy="resource")
	private Set<WindowObjectUsag> windowObjectUsages;

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new resource.
     */
    public Resource() {
    }


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the protectedResources
	 */
	public Set<ProtectedResource> getProtectedResources() {
		return protectedResources;
	}


	/**
	 * @param protectedResources the protectedResources to set
	 */
	public void setProtectedResources(Set<ProtectedResource> protectedResources) {
		this.protectedResources = protectedResources;
	}


	/**
	 * @return the activityAudits
	 */
	public Set<ActivityAudit> getActivityAudits() {
		return activityAudits;
	}


	/**
	 * @param activityAudits the activityAudits to set
	 */
	public void setActivityAudits(Set<ActivityAudit> activityAudits) {
		this.activityAudits = activityAudits;
	}


	/**
	 * @return the windowObjectUsages
	 */
	public Set<WindowObjectUsag> getWindowObjectUsages() {
		return windowObjectUsages;
	}


	/**
	 * @param windowObjectUsages the windowObjectUsages to set
	 */
	public void setWindowObjectUsages(Set<WindowObjectUsag> windowObjectUsages) {
		this.windowObjectUsages = windowObjectUsages;
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
        if (!(object instanceof Resource)) {
            return false;
        }
        Resource rhs = (Resource) object;
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
        return new HashCodeBuilder(303806899, 1457943427).append(this.name)
                .append(this.description).toHashCode();
    }

}
