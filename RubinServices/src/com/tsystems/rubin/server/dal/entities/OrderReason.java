package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_REASON")
public class OrderReason implements Serializable {
	@Id
	@Column(name="OID_ORDER_REASON")
	private Long id;

	private String description;

	@Column(name="DESCRIPTION_SUCH_BSI")
	private String descriptionSearch;

	@Column(name="LAST_UPDATED")
	private Date lastUpdated;

	private String notes;

	@Column(name="SEQUENCE_NO")
	private Long sequenceNo;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@OneToMany(mappedBy="orderReason")
	private Set<OrderProcedure> orderProcedures;

	private static final long serialVersionUID = 1L;

	public OrderReason() {
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
	 * @return the descriptionSearch
	 */
	public String getDescriptionSearch() {
		return descriptionSearch;
	}

	/**
	 * @param descriptionSearch the descriptionSearch to set
	 */
	public void setDescriptionSearch(String descriptionSearch) {
		this.descriptionSearch = descriptionSearch;
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
	 * @return the sequenceNo
	 */
	public Long getSequenceNo() {
		return sequenceNo;
	}

	/**
	 * @param sequenceNo the sequenceNo to set
	 */
	public void setSequenceNo(Long sequenceNo) {
		this.sequenceNo = sequenceNo;
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
	 * @return the orderProcedures
	 */
	public Set<OrderProcedure> getOrderProcedures() {
		return orderProcedures;
	}

	/**
	 * @param orderProcedures the orderProcedures to set
	 */
	public void setOrderProcedures(Set<OrderProcedure> orderProcedures) {
		this.orderProcedures = orderProcedures;
	}

}
