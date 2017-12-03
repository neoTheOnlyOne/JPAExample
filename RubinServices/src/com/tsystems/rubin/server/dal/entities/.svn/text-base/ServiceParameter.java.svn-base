package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SERVICE_PARAMETER")
public class ServiceParameter implements Serializable {
	@Id
	@Column(name="OID_SERVICE_PARAMETER")
	private Long id;

	@Column(name="LAST_UPDATED")
	private Date lastUpdated;

	private String notes;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	private String value;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KIND_OF_SERVOID_KIND_OF_SER")
	private KindOfService kindOfService;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_QUALITY_PARAOID_QUALITY_PAR")
	private QualityParameter qualityParameter;

	private static final long serialVersionUID = 1L;

	public ServiceParameter() {
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
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
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
