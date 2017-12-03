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

@Entity
public class Penalty implements Serializable {
	@Id
	@Column(name="OID_PENALTY")
	private Long id;

	private Long amount;

	@Column(name="LAST_UPDATED")
	private Date lastUpdated;

	private String notes;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	private String violation;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CALCULATION_OID_CALCULATION")
	private CalculationBasis calculationBasis;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KIND_OF_SERVOID_KIND_OF_SER")
	private KindOfService kindOfService;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_QUALITY_PARAOID_QUALITY_PAR")
	private QualityParameter qualityParameter;

	private static final long serialVersionUID = 1L;

	public Penalty() {
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
	 * @return the amount
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
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
	 * @return the violation
	 */
	public String getViolation() {
		return violation;
	}

	/**
	 * @param violation the violation to set
	 */
	public void setViolation(String violation) {
		this.violation = violation;
	}

	/**
	 * @return the calculationBasis
	 */
	public CalculationBasis getCalculationBasis() {
		return calculationBasis;
	}

	/**
	 * @param calculationBasis the calculationBasis to set
	 */
	public void setCalculationBasis(CalculationBasis calculationBasis) {
		this.calculationBasis = calculationBasis;
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

	/**
	 * @return the qualityParameter
	 */
	public QualityParameter getQualityParameter() {
		return qualityParameter;
	}

	/**
	 * @param qualityParameter the qualityParameter to set
	 */
	public void setQualityParameter(QualityParameter qualityParameter) {
		this.qualityParameter = qualityParameter;
	}


}
