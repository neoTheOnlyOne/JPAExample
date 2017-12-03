package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="LEAD_TIME")
public class LeadTime implements Serializable {
	@Id
	@Column(name="OID_LEAD_TIME")
	private Long id;

	@Column(name="DATE_UPDATED")
	private Date dateUpdated;

	private Long duration;

	private String notes;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KAPAZITAETOID_KAPAZITAET")
	private Capacity capacity;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SCENARIOOID_SCENARIO")
	private Scenario scenario;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WORKING_AREAOID_WORKING_ARE")
	private WorkingArea workingArea;

	private static final long serialVersionUID = 1L;

	public LeadTime() {
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
	 * @return the dateUpdated
	 */
	public Date getDateUpdated() {
		return dateUpdated;
	}

	/**
	 * @param dateUpdated the dateUpdated to set
	 */
	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	/**
	 * @return the duration
	 */
	public Long getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
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
	 * @return the capacity
	 */
	public Capacity getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(Capacity capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the scenario
	 */
	public Scenario getScenario() {
		return scenario;
	}

	/**
	 * @param scenario the scenario to set
	 */
	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
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


}
