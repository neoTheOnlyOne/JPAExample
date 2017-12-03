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
@Table(name="FAULT_PROCEDURE")
public class FaultProcedure implements Serializable {
	@Id
	@Column(name="OID_FAULT_PROCEDURE")
	private Long id;

	@Column(name="LAST_UPDATED")
	private Date lastUpdated;

	private String notes;

	@Column(name="RESPONSE_TIME_DAYS")
	private Long responseTimeDays;

	@Column(name="RESPONSE_TIME_HOURS")
	private Long responseTimeHours;

	@Column(name="RESPONSE_TIME_MINUTES")
	private Long responseTimeMinutes;

	@Column(name="SORT_ORDER")
	private Long sortOrder;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_FAULT_HANDLIOID_FAULT_HANDL")
	private FaultHandling faultHandling;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_FAULT_REASONOID_FAULT_REASO")
	private FaultReason faultReason;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KIND_OF_SERVOID_KIND_OF_SER")
	private KindOfService kindOfService;

	private static final long serialVersionUID = 1L;

	public FaultProcedure() {
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
	 * @return the responseTimeDays
	 */
	public Long getResponseTimeDays() {
		return responseTimeDays;
	}

	/**
	 * @param responseTimeDays the responseTimeDays to set
	 */
	public void setResponseTimeDays(Long responseTimeDays) {
		this.responseTimeDays = responseTimeDays;
	}

	/**
	 * @return the responseTimeHours
	 */
	public Long getResponseTimeHours() {
		return responseTimeHours;
	}

	/**
	 * @param responseTimeHours the responseTimeHours to set
	 */
	public void setResponseTimeHours(Long responseTimeHours) {
		this.responseTimeHours = responseTimeHours;
	}

	/**
	 * @return the responseTimeMinutes
	 */
	public Long getResponseTimeMinutes() {
		return responseTimeMinutes;
	}

	/**
	 * @param responseTimeMinutes the responseTimeMinutes to set
	 */
	public void setResponseTimeMinutes(Long responseTimeMinutes) {
		this.responseTimeMinutes = responseTimeMinutes;
	}

	/**
	 * @return the sortOrder
	 */
	public Long getSortOrder() {
		return sortOrder;
	}

	/**
	 * @param sortOrder the sortOrder to set
	 */
	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
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
	 * @return the faultHandling
	 */
	public FaultHandling getFaultHandling() {
		return faultHandling;
	}

	/**
	 * @param faultHandling the faultHandling to set
	 */
	public void setFaultHandling(FaultHandling faultHandling) {
		this.faultHandling = faultHandling;
	}

	/**
	 * @return the faultReason
	 */
	public FaultReason getFaultReason() {
		return faultReason;
	}

	/**
	 * @param faultReason the faultReason to set
	 */
	public void setFaultReason(FaultReason faultReason) {
		this.faultReason = faultReason;
	}

	/**
	 * @return the kindOfService
	 */
	public KindOfService getKindOfService() {
		return kindOfService;
	}

	/**
	 * @param kindOfService the kindOfService to set
	 */
	public void setKindOfService(KindOfService kindOfService) {
		this.kindOfService = kindOfService;
	}

	
}
