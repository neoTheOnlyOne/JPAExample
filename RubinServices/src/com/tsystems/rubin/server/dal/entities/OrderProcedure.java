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
@Table(name="ORDER_PROCEDURE")
public class OrderProcedure implements Serializable {
	@Id
	@Column(name="OID_ORDER_PROCEDURE")
	private Long id;

	@Column(name="DURATION_ORDER_PROCEDURE")
	private Long durationOrderProcedure;

	@Column(name="LAST_UPDATED")
	private Date lastUpdated;

	@Column(name="MEDIUM_EMAIL")
	private String mediumEmail;

	@Column(name="MEDIUM_FAX")
	private String mediumFax;

	@Column(name="MEDIUM_INTERNET")
	private String mediumInternet;

	@Column(name="MEDIUM_PHONE")
	private String mediumPhone;

	private String notes;

	@Column(name="SORT_ORDER")
	private Long sortOrder;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ORDER_REASONOID_ORDER_REASO")
	private OrderReason orderReason;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ORDER_SEQUENOID_ORDER_SEQUE")
	private OrderSequence orderSequence;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WORKING_AREAOID_WORKING_ARE")
	private WorkingArea workingArea;

	private static final long serialVersionUID = 1L;

	public OrderProcedure() {
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
	 * @return the durationOrderProcedure
	 */
	public Long getDurationOrderProcedure() {
		return durationOrderProcedure;
	}

	/**
	 * @param durationOrderProcedure the durationOrderProcedure to set
	 */
	public void setDurationOrderProcedure(Long durationOrderProcedure) {
		this.durationOrderProcedure = durationOrderProcedure;
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
	 * @return the mediumEmail
	 */
	public String getMediumEmail() {
		return mediumEmail;
	}

	/**
	 * @param mediumEmail the mediumEmail to set
	 */
	public void setMediumEmail(String mediumEmail) {
		this.mediumEmail = mediumEmail;
	}

	/**
	 * @return the mediumFax
	 */
	public String getMediumFax() {
		return mediumFax;
	}

	/**
	 * @param mediumFax the mediumFax to set
	 */
	public void setMediumFax(String mediumFax) {
		this.mediumFax = mediumFax;
	}

	/**
	 * @return the mediumInternet
	 */
	public String getMediumInternet() {
		return mediumInternet;
	}

	/**
	 * @param mediumInternet the mediumInternet to set
	 */
	public void setMediumInternet(String mediumInternet) {
		this.mediumInternet = mediumInternet;
	}

	/**
	 * @return the mediumPhone
	 */
	public String getMediumPhone() {
		return mediumPhone;
	}

	/**
	 * @param mediumPhone the mediumPhone to set
	 */
	public void setMediumPhone(String mediumPhone) {
		this.mediumPhone = mediumPhone;
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
	 * @return the orderReason
	 */
	public OrderReason getOrderReason() {
		return orderReason;
	}

	/**
	 * @param orderReason the orderReason to set
	 */
	public void setOrderReason(OrderReason orderReason) {
		this.orderReason = orderReason;
	}

	/**
	 * @return the orderSequence
	 */
	public OrderSequence getOrderSequence() {
		return orderSequence;
	}

	/**
	 * @param orderSequence the orderSequence to set
	 */
	public void setOrderSequence(OrderSequence orderSequence) {
		this.orderSequence = orderSequence;
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
