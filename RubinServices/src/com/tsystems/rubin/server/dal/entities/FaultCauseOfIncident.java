package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="FAULT_CAUSE_OF_INCIDENT")
public class FaultCauseOfIncident implements Serializable {
	@Id
	@Column(name="OID_CAUSE_OF_INCIDENT")
	private Long id;

	@Column(name="BEARBEITER")
	private String user;

	private String category;

	@Column(name="DATE_LASTUPDATED")
	private Date dateLastupdated;

	private String remark;

	@OneToMany(mappedBy="faultCauseOfIncident")
	private Set<FaultGroup> faultGroups;

	private static final long serialVersionUID = 1L;

	public FaultCauseOfIncident() {
		super();
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
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the dateLastupdated
	 */
	public Date getDateLastupdated() {
		return dateLastupdated;
	}

	/**
	 * @param dateLastupdated the dateLastupdated to set
	 */
	public void setDateLastupdated(Date dateLastupdated) {
		this.dateLastupdated = dateLastupdated;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the faultGroups
	 */
	public Set<FaultGroup> getFaultGroups() {
		return faultGroups;
	}

	/**
	 * @param faultGroups the faultGroups to set
	 */
	public void setFaultGroups(Set<FaultGroup> faultGroups) {
		this.faultGroups = faultGroups;
	}

	
}
