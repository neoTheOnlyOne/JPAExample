package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the HISTORY_STATEMENT database table.
 * 
 */
@Entity
@Table(name="HISTORY_STATEMENT")
public class HistoryStatement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HISTORY_STATEMENT_OIDHISTORYSTATEMENT_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HISTORY_STATEMENT_OIDHISTORYSTATEMENT_GENERATOR")
	@Column(name="OID_HISTORY_STATEMENT", unique=true, nullable=false, precision=6)
	private Long id;

	@Column(name="DATE_UPDATED", nullable=false)
	private Date dateUpdated;

	@Column(name="EFFECTIVE_DATE", nullable=false)
	private Date effectiveDate;
	

	@Column(name="NOTES_TO_CONTRACT", length=300)
	private String notesToContract;

	@Column(name="NOTES_TO_HISTORY_STATEMENT", length=300)
	private String notesToHistoryStatement;

	@Column(name="TERMINATION_OF_CONTRACT")
	private Date terminationOfContract;

	@Column(name="UPDATED_BY", nullable=false, length=30)
	private String updatedBy;

	@Column(nullable=false, length=20)
	private String version;

	@Column(name="VERSION_SUCH_BSI", nullable=false, length=20)
	private String versionSearch;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LOCAL_LOOP_COID_LOOP_CONTRA")
	private LocalLoopContract localLoopContract;

    public HistoryStatement() {
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
	 * @return the notesToContract
	 */
	public String getNotesToContract() {
		return notesToContract;
	}

	/**
	 * @param notesToContract the notesToContract to set
	 */
	public void setNotesToContract(String notesToContract) {
		this.notesToContract = notesToContract;
	}

	/**
	 * @return the notesToHistoryStatement
	 */
	public String getNotesToHistoryStatement() {
		return notesToHistoryStatement;
	}

	/**
	 * @param notesToHistoryStatement the notesToHistoryStatement to set
	 */
	public void setNotesToHistoryStatement(String notesToHistoryStatement) {
		this.notesToHistoryStatement = notesToHistoryStatement;
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
	 * @return the versionSearch
	 */
	public String getVersionSearch() {
		return versionSearch;
	}

	/**
	 * @param versionSearch the versionSearch to set
	 */
	public void setVersionSearch(String versionSearch) {
		this.versionSearch = versionSearch;
	}

	/**
	 * @return the localLoopContract
	 */
	public LocalLoopContract getLocalLoopContract() {
		return localLoopContract;
	}

	/**
	 * @param localLoopContract the localLoopContract to set
	 */
	public void setLocalLoopContract(LocalLoopContract localLoopContract) {
		this.localLoopContract = localLoopContract;
	}

	

	
}