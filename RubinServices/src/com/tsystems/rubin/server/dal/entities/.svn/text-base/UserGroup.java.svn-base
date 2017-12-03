package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.tsystems.rubin.common.util.CommonConstants;

/**
 * The Class UserGroup. - An entity for GRUPPE table.
 */
@Entity
@Table(name = "GRUPPE")
public class UserGroup implements Serializable {

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Gruppe")
    @SequenceGenerator(name = "Gruppe", sequenceName = CommonConstants.GRUPPE_SEQUENCE, allocationSize = 1)
    @Column(name = "OID_GRUPPE")
    private Long id;

    /** The name. */
    @Column(name = "GRUPPENBEZEICHNUNG")
    private String name;

    /** The group nr. */
    @Column(name = "GRUPPENNUMMER")
    private Long groupNr;

    /** The protected resource collection. */
    @OneToMany(mappedBy = "userGroup")
    @JoinColumn(name = "OID_GRUPPE", nullable = false)
    private Set<ProtectedResource> protectedResources;
    
  	@OneToMany(mappedBy="userGroup")
	private Set<User> users;


    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new user group.
     */
    public UserGroup() {
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
	 * @return the groupNr
	 */
	public Long getGroupNr() {
		return groupNr;
	}


	/**
	 * @param groupNr the groupNr to set
	 */
	public void setGroupNr(Long groupNr) {
		this.groupNr = groupNr;
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
	 * @return the users
	 */
	public Set<User> getUsers() {
		return users;
	}


	/**
	 * @param users the users to set
	 */
	public void setUsers(Set<User> users) {
		this.users = users;
	}


	/**
     * toString.
     * 
     * @return
     * 
     * @see java.lang.Object#toString()
     */

    public String toString() {
        return new ToStringBuilder(this).append("id", this.id).append("groupNr", this.groupNr)
                .append("name", this.name).toString();
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
        if (!(object instanceof UserGroup)) {
            return false;
        }
        UserGroup rhs = (UserGroup) object;
        return new EqualsBuilder().append(this.groupNr, rhs.groupNr).append(this.name, rhs.name)
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
        return new HashCodeBuilder(-1137726433, 1399317839).append(this.groupNr).append(this.name)
                .toHashCode();
    }
}
