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
@Table(name="FAULT_GROUP")
public class FaultGroup implements Serializable {
	@Id
	@Column(name="OID_FAULT_GROUP")
	private Long id;

	@Column(name="BEARBEITER")
	private String user;

	@Column(name="BEARBEITER_TELEFON")
	private String userPhoneNumber;

	@Column(name="CLASS")
	private String faultGroupClass;

	@Column(name="COMMENTS")
	private String comments;

	@Column(name="DURATION_OF_MAINTENANCE")
	private String durationOfMaintenance;

	@Column(name="FINAL_REMARKS")
	private String finalRemarks;

	@Column(name="GROUP_STATE")
	private String groupState;
	
	@Column(name="HEADLINE")
	private String headline;

	@Column(name="NDS_FAULT_RECORD_NO")
	private String ndsFaultRecordNumber;

	@Column(name="REASONS")
	private String reasons;

	@Column(name="SIGNATURE")
	private String signature;

	@Column(name="TIMESTAMP_COMPLETED")
	private Date timestampCompleted;

	@Column(name="TIMESTAMP_CREATION")
	private Date timestampCreation;

	@Column(name="TIMESTAMP_DATECHANGED")
	private Date timestampDatechanged;

	@Column(name="TIMESTAMP_END_ACTUAL")
	private Date timestampEndActual;

	@Column(name="TIMESTAMP_END_PLANNED")
	private Date timestampEndPlanned;

	@Column(name="TIMESTAMP_LASTUPDATED")
	private Date timestampLastupdated;

	@Column(name="TIMESTAMP_START")
	private Date timestampStart;

	@Column(name="TTS_KOMMINIKATIONSNUMMER")
	private String ttsCommunicationNumber;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_FAULT_CATEGOOID_FAULT_CATEG")
	private FaultCategory faultCategory;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_FAULT_CAUSE_OID_CAUSE_OF_IN")
	private FaultCauseOfIncident faultCauseOfIncident;

	@OneToMany(mappedBy="faultGroup")
	private Set<FaultRecord> faultRecords;

	private static final long serialVersionUID = 1L;

	public FaultGroup() {
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
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the userPhoneNumber
	 */
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	/**
	 * @param userPhoneNumber the userPhoneNumber to set
	 */
	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	/**
	 * @return the faultGroupClass
	 */
	public String getFaultGroupClass() {
		return faultGroupClass;
	}

	/**
	 * @param faultGroupClass the faultGroupClass to set
	 */
	public void setFaultGroupClass(String faultGroupClass) {
		this.faultGroupClass = faultGroupClass;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the durationOfMaintenance
	 */
	public String getDurationOfMaintenance() {
		return durationOfMaintenance;
	}

	/**
	 * @param durationOfMaintenance the durationOfMaintenance to set
	 */
	public void setDurationOfMaintenance(String durationOfMaintenance) {
		this.durationOfMaintenance = durationOfMaintenance;
	}

	/**
	 * @return the finalRemarks
	 */
	public String getFinalRemarks() {
		return finalRemarks;
	}

	/**
	 * @param finalRemarks the finalRemarks to set
	 */
	public void setFinalRemarks(String finalRemarks) {
		this.finalRemarks = finalRemarks;
	}

	/**
	 * @return the groupState
	 */
	public String getGroupState() {
		return groupState;
	}

	/**
	 * @param groupState the groupState to set
	 */
	public void setGroupState(String groupState) {
		this.groupState = groupState;
	}

	/**
	 * @return the headline
	 */
	public String getHeadline() {
		return headline;
	}

	/**
	 * @param headline the headline to set
	 */
	public void setHeadline(String headline) {
		this.headline = headline;
	}

	/**
	 * @return the ndsFaultRecordNumber
	 */
	public String getNdsFaultRecordNumber() {
		return ndsFaultRecordNumber;
	}

	/**
	 * @param ndsFaultRecordNumber the ndsFaultRecordNumber to set
	 */
	public void setNdsFaultRecordNumber(String ndsFaultRecordNumber) {
		this.ndsFaultRecordNumber = ndsFaultRecordNumber;
	}

	/**
	 * @return the reasons
	 */
	public String getReasons() {
		return reasons;
	}

	/**
	 * @param reasons the reasons to set
	 */
	public void setReasons(String reasons) {
		this.reasons = reasons;
	}

	/**
	 * @return the signature
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * @param signature the signature to set
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}

	/**
	 * @return the timestampCompleted
	 */
	public Date getTimestampCompleted() {
		return timestampCompleted;
	}

	/**
	 * @param timestampCompleted the timestampCompleted to set
	 */
	public void setTimestampCompleted(Date timestampCompleted) {
		this.timestampCompleted = timestampCompleted;
	}

	/**
	 * @return the timestampCreation
	 */
	public Date getTimestampCreation() {
		return timestampCreation;
	}

	/**
	 * @param timestampCreation the timestampCreation to set
	 */
	public void setTimestampCreation(Date timestampCreation) {
		this.timestampCreation = timestampCreation;
	}

	/**
	 * @return the timestampDatechanged
	 */
	public Date getTimestampDatechanged() {
		return timestampDatechanged;
	}

	/**
	 * @param timestampDatechanged the timestampDatechanged to set
	 */
	public void setTimestampDatechanged(Date timestampDatechanged) {
		this.timestampDatechanged = timestampDatechanged;
	}

	/**
	 * @return the timestampEndActual
	 */
	public Date getTimestampEndActual() {
		return timestampEndActual;
	}

	/**
	 * @param timestampEndActual the timestampEndActual to set
	 */
	public void setTimestampEndActual(Date timestampEndActual) {
		this.timestampEndActual = timestampEndActual;
	}

	/**
	 * @return the timestampEndPlanned
	 */
	public Date getTimestampEndPlanned() {
		return timestampEndPlanned;
	}

	/**
	 * @param timestampEndPlanned the timestampEndPlanned to set
	 */
	public void setTimestampEndPlanned(Date timestampEndPlanned) {
		this.timestampEndPlanned = timestampEndPlanned;
	}

	/**
	 * @return the timestampLastupdated
	 */
	public Date getTimestampLastupdated() {
		return timestampLastupdated;
	}

	/**
	 * @param timestampLastupdated the timestampLastupdated to set
	 */
	public void setTimestampLastupdated(Date timestampLastupdated) {
		this.timestampLastupdated = timestampLastupdated;
	}

	/**
	 * @return the timestampStart
	 */
	public Date getTimestampStart() {
		return timestampStart;
	}

	/**
	 * @param timestampStart the timestampStart to set
	 */
	public void setTimestampStart(Date timestampStart) {
		this.timestampStart = timestampStart;
	}

	/**
	 * @return the ttsCommunicationNumber
	 */
	public String getTtsCommunicationNumber() {
		return ttsCommunicationNumber;
	}

	/**
	 * @param ttsCommunicationNumber the ttsCommunicationNumber to set
	 */
	public void setTtsCommunicationNumber(String ttsCommunicationNumber) {
		this.ttsCommunicationNumber = ttsCommunicationNumber;
	}

	/**
	 * @return the faultCategory
	 */
	public FaultCategory getFaultCategory() {
		return faultCategory;
	}

	/**
	 * @param faultCategory the faultCategory to set
	 */
	public void setFaultCategory(FaultCategory faultCategory) {
		this.faultCategory = faultCategory;
	}

	/**
	 * @return the faultCauseOfIncident
	 */
	public FaultCauseOfIncident getFaultCauseOfIncident() {
		return faultCauseOfIncident;
	}

	/**
	 * @param faultCauseOfIncident the faultCauseOfIncident to set
	 */
	public void setFaultCauseOfIncident(FaultCauseOfIncident faultCauseOfIncident) {
		this.faultCauseOfIncident = faultCauseOfIncident;
	}

	/**
	 * @return the faultRecords
	 */
	public Set<FaultRecord> getFaultRecords() {
		return faultRecords;
	}

	/**
	 * @param faultRecords the faultRecords to set
	 */
	public void setFaultRecords(Set<FaultRecord> faultRecords) {
		this.faultRecords = faultRecords;
	}

	
}
