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
@Table(name="LOCAL_LOOP_CONTRACT")
public class LocalLoopContract implements Serializable {
	@Id
	@Column(name="OID_LOOP_CONTRACT")
	private Long id;

	@Column(name="ABBREVIATION")
	private String abbreviation;

	@Column(name="ABBREVIATION_SUCH_BSI")
	private String abbreviationSearch;

	@Column(name="CONTRACT_APPL_TYPE")
	private String contractApplType;
	
	@Column(name="DESCRIPTION")
	private String description;

	@Column(name="DESCRIPTION_SUCH_BSI")
	private String descriptionSearch;

	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name="LAST_UPDATED")
	private Date lastUpdate;

	@Column(name="LINK_TO_CONTRACT")
	private String linkToContract;

	@Column(name="NOTES")
	private String notes;

	@Column(name="STATUS")
	private String status;

	@Column(name="TERMINATION_OF_CONTRACT")
	private Date terminationOfContract;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="VERSION")
	private String version;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CARRIEROID_CARRIER")
	private Carrier carrier;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TYPE_OF_CONTOID_TYPE_OF_CON")
	private TypeOfContract typeOfContract;

	@OneToMany(mappedBy="localLoopContract")
	private Set<HistoryStatement> historyStatements;

	@OneToMany(mappedBy="localLoopContract")
	private Set<WorkingArea> workingAreas;

	private static final long serialVersionUID = 1L;

	public LocalLoopContract() {
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
	 * @return the abbreviation
	 */
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
	 * @param abbreviation the abbreviation to set
	 */
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	/**
	 * @return the abbreviationSearch
	 */
	public String getAbbreviationSearch() {
		return abbreviationSearch;
	}

	/**
	 * @param abbreviationSearch the abbreviationSearch to set
	 */
	public void setAbbreviationSearch(String abbreviationSearch) {
		this.abbreviationSearch = abbreviationSearch;
	}

	/**
	 * @return the contractApplType
	 */
	public String getContractApplType() {
		return contractApplType;
	}

	/**
	 * @param contractApplType the contractApplType to set
	 */
	public void setContractApplType(String contractApplType) {
		this.contractApplType = contractApplType;
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
	 * @return the effectiveDate
	 */
	public Date getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * @param effectiveDate the effectiveDate to set
	 */
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	/**
	 * @return the lastUpdate
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * @param lastUpdate the lastUpdate to set
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * @return the linkToContract
	 */
	public String getLinkToContract() {
		return linkToContract;
	}

	/**
	 * @param linkToContract the linkToContract to set
	 */
	public void setLinkToContract(String linkToContract) {
		this.linkToContract = linkToContract;
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the terminationOfContract
	 */
	public Date getTerminationOfContract() {
		return terminationOfContract;
	}

	/**
	 * @param terminationOfContract the terminationOfContract to set
	 */
	public void setTerminationOfContract(Date terminationOfContract) {
		this.terminationOfContract = terminationOfContract;
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
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the carrier
	 */
	public Carrier getCarrier() {
		return carrier;
	}

	/**
	 * @param carrier the carrier to set
	 */
	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

	/**
	 * @return the typeOfContract
	 */
	public TypeOfContract getTypeOfContract() {
		return typeOfContract;
	}

	/**
	 * @param typeOfContract the typeOfContract to set
	 */
	public void setTypeOfContract(TypeOfContract typeOfContract) {
		this.typeOfContract = typeOfContract;
	}

	/**
	 * @return the historyStatements
	 */
	public Set<HistoryStatement> getHistoryStatements() {
		return historyStatements;
	}

	/**
	 * @param historyStatements the historyStatements to set
	 */
	public void setHistoryStatements(Set<HistoryStatement> historyStatements) {
		this.historyStatements = historyStatements;
	}

	/**
	 * @return the workingAreas
	 */
	public Set<WorkingArea> getWorkingAreas() {
		return workingAreas;
	}

	/**
	 * @param workingAreas the workingAreas to set
	 */
	public void setWorkingAreas(Set<WorkingArea> workingAreas) {
		this.workingAreas = workingAreas;
	}

}
