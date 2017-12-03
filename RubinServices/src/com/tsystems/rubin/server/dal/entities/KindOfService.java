package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="KIND_OF_SERVICE")
public class KindOfService implements Serializable {
	@Id
	@Column(name="OID_KIND_OF_SERVICE")
	private Long id;

	private String description;

	@Column(name="DESCRIPTION_SUCH_BSI")
	private String descriptionSuchBsi;

	@Column(name="LAST_UPDATED")
	private Date lastUpdated;

	@Column(name="SPECIFICATION_OF_SERVICES")
	private String specificationOfServices;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WORKING_AREAOID_WORKING_ARE")
	private WorkingArea workingArea;

	@OneToMany(mappedBy="kindOfService")
	private Set<Penalty> penalties;

	@OneToMany(mappedBy="kindOfService")
	private Set<ServiceParameter> serviceParameters;

	@OneToMany(mappedBy="kindOfService")
	private Set<LocalLoopSection> localLoopSections;

	@OneToMany(mappedBy="kindOfService")
	private Set<FaultProcedure> faultProcedures;

	private static final long serialVersionUID = 1L;

	public KindOfService() {
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
	 * @return the descriptionSuchBsi
	 */
	public String getDescriptionSuchBsi() {
		return descriptionSuchBsi;
	}

	/**
	 * @param descriptionSuchBsi the descriptionSuchBsi to set
	 */
	public void setDescriptionSuchBsi(String descriptionSuchBsi) {
		this.descriptionSuchBsi = descriptionSuchBsi;
	}

	/**
	 * @return the lastUpdated
	 */
	public Date getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * @param lastUpdated the lastUpdated to set
	 */
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	/**
	 * @return the specificationOfServices
	 */
	public String getSpecificationOfServices() {
		return specificationOfServices;
	}

	/**
	 * @param specificationOfServices the specificationOfServices to set
	 */
	public void setSpecificationOfServices(String specificationOfServices) {
		this.specificationOfServices = specificationOfServices;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the workingArea
	 */
	public WorkingArea getWorkingArea() {
		return workingArea;
	}

	/**
	 * @param workingArea the workingArea to set
	 */
	public void setWorkingArea(WorkingArea workingArea) {
		this.workingArea = workingArea;
	}

	/**
	 * @return the penalties
	 */
	public Set<Penalty> getPenalties() {
		return penalties;
	}

	/**
	 * @param penalties the penalties to set
	 */
	public void setPenalties(Set<Penalty> penalties) {
		this.penalties = penalties;
	}

	/**
	 * @return the serviceParameters
	 */
	public Set<ServiceParameter> getServiceParameters() {
		return serviceParameters;
	}

	/**
	 * @param serviceParameters the serviceParameters to set
	 */
	public void setServiceParameters(Set<ServiceParameter> serviceParameters) {
		this.serviceParameters = serviceParameters;
	}

	/**
	 * @return the localLoopSections
	 */
	public Set<LocalLoopSection> getLocalLoopSections() {
		return localLoopSections;
	}

	/**
	 * @param localLoopSections the localLoopSections to set
	 */
	public void setLocalLoopSections(Set<LocalLoopSection> localLoopSections) {
		this.localLoopSections = localLoopSections;
	}

	/**
	 * @return the faultProcedures
	 */
	public Set<FaultProcedure> getFaultProcedures() {
		return faultProcedures;
	}

	/**
	 * @param faultProcedures the faultProcedures to set
	 */
	public void setFaultProcedures(Set<FaultProcedure> faultProcedures) {
		this.faultProcedures = faultProcedures;
	}


}
