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
@Table(name="CALCULATION_BASIS")
public class CalculationBasis implements Serializable {
	@Id
	@Column(name="OID_CALCULATION_BASIS")
	private Long id;

	@Column(name="DATE_UPDATED")
	private Date dateUpdated;

	private String description;

	@Column(name="DESCRIPTION_SUCH_BSI")
	private String descriptionSearch;

	private String notes;

	@Column(name="SEQUENCE_NO")
	private Long sequenceNumber;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@OneToMany(mappedBy="calculationBasis")
	private Set<Penalty> Penalties;

	private static final long serialVersionUID = 1L;

	public CalculationBasis() {
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
	 * @return the sequenceNumber
	 */
	public Long getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * @param sequenceNumber the sequenceNumber to set
	 */
	public void setSequenceNumber(Long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
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
	 * @return the penalties
	 */
	public Set<Penalty> getPenalties() {
		return Penalties;
	}

	/**
	 * @param penalties the penalties to set
	 */
	public void setPenalties(Set<Penalty> penalties) {
		Penalties = penalties;
	}

	

}
