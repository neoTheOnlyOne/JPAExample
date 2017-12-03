package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Eqa implements Serializable {
	@Id
	@Column(name="OID_EQA")
	private Long id;

	@Column(name="DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="EQA_DATE_BEGINS")
	private Date dateBegins;

	@Column(name="EQA_DATE_ENDS")
	private Date dateEnds;

	@Column(name="EQA_NOTE")
	private String note;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CUSTOMEROID_CUSTOMER")
	private Customer customer;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_RACKOID_RACK")
	private Rack rack;

	private static final long serialVersionUID = 1L;

	public Eqa() {
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
	 * @return the dateBegins
	 */
	public Date getDateBegins() {
		return dateBegins;
	}

	/**
	 * @param dateBegins the dateBegins to set
	 */
	public void setDateBegins(Date dateBegins) {
		this.dateBegins = dateBegins;
	}

	/**
	 * @return the dateEnds
	 */
	public Date getDateEnds() {
		return dateEnds;
	}

	/**
	 * @param dateEnds the dateEnds to set
	 */
	public void setDateEnds(Date dateEnds) {
		this.dateEnds = dateEnds;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
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
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the rack
	 */
	public Rack getRack() {
		return rack;
	}

	/**
	 * @param rack the rack to set
	 */
	public void setRack(Rack rack) {
		this.rack = rack;
	}

	
}
