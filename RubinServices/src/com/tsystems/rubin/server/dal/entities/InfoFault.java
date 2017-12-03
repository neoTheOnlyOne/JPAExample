package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INFO_FAULT")
public class InfoFault implements Serializable {
	@Id
	@Column(name="FT_FAULT_ID")
	private Long id;

	@Column(name="FT_BEARBEITER")
	private String user;

	@Column(name="FT_BEARBEITER_TELEFON")
	private String userTelephoneNumber;

	@Column(name="FT_CI_CATEGORY")
	private String category;

	@Column(name="FT_CLASS")
	private String ftClass;

	@Column(name="FT_COMMENTS")
	private String comments;

	@Column(name="FT_DURATION")
	private String duration;

	@Column(name="FT_FC_CATEGORY")
	private String fcCategory;

	@Column(name="FT_FINAL_REMARKS")
	private String finalRemarks;

	@Column(name="FT_HEADLINE")
	private String headline;

	@Column(name="FT_NDS_FAULT_RECORD_NO")
	private String ndsFaultRecordNo;

	@Column(name="FT_PRIMAER_STOERER")
	private String ftPrimaerStoerer;

	@Column(name="FT_REASONS")
	private String reasons;

	@Column(name="FT_TIMESTAMP_CHANGED")
	private Date timestampChanged;

	@Column(name="FT_TIMESTAMP_COMPLETED")
	private Date timestampCompleted;

	@Column(name="FT_TIMESTAMP_CREATION")
	private Date timestampCreation;

	@Column(name="FT_TIMESTAMP_END_ACTUAL")
	private Date timestampEndActual;

	@Column(name="FT_TIMESTAMP_END_PLANNED")
	private Date timestampEndPlanned;

	@Column(name="FT_TIMESTAMP_LASTUPDATED")
	private Date timestampLastupdated;

	@Column(name="FT_TIMESTAMP_START")
	private Date timestampStart;

	@Column(name="FT_TTS_KOMMINIKATIONSNUMMER")
	private String communicationNumber;

	private static final long serialVersionUID = 1L;

	public InfoFault() {
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
	 * @return the userTelephoneNumber
	 */
	public String getUserTelephoneNumber() {
		return userTelephoneNumber;
	}

	/**
	 * @param userTelephoneNumber the userTelephoneNumber to set
	 */
	public void setUserTelephoneNumber(String userTelephoneNumber) {
		this.userTelephoneNumber = userTelephoneNumber;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the ftClass
	 */
	public String getFtClass() {
		return ftClass;
	}

	/**
	 * @param ftClass the ftClass to set
	 */
	public void setFtClass(String ftClass) {
		this.ftClass = ftClass;
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
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 * @return the fcCategory
	 */
	public String getFcCategory() {
		return fcCategory;
	}

	/**
	 * @param fcCategory the fcCategory to set
	 */
	public void setFcCategory(String fcCategory) {
		this.fcCategory = fcCategory;
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
	 * @return the ndsFaultRecordNo
	 */
	public String getNdsFaultRecordNo() {
		return ndsFaultRecordNo;
	}

	/**
	 * @param ndsFaultRecordNo the ndsFaultRecordNo to set
	 */
	public void setNdsFaultRecordNo(String ndsFaultRecordNo) {
		this.ndsFaultRecordNo = ndsFaultRecordNo;
	}

	/**
	 * @return the ftPrimaerStoerer
	 */
	public String getFtPrimaerStoerer() {
		return ftPrimaerStoerer;
	}

	/**
	 * @param ftPrimaerStoerer the ftPrimaerStoerer to set
	 */
	public void setFtPrimaerStoerer(String ftPrimaerStoerer) {
		this.ftPrimaerStoerer = ftPrimaerStoerer;
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
	 * @return the timestampChanged
	 */
	public Date getTimestampChanged() {
		return timestampChanged;
	}

	/**
	 * @param timestampChanged the timestampChanged to set
	 */
	public void setTimestampChanged(Date timestampChanged) {
		this.timestampChanged = timestampChanged;
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
	 * @return the communicationNumber
	 */
	public String getCommunicationNumber() {
		return communicationNumber;
	}

	/**
	 * @param communicationNumber the communicationNumber to set
	 */
	public void setCommunicationNumber(String communicationNumber) {
		this.communicationNumber = communicationNumber;
	}


}
