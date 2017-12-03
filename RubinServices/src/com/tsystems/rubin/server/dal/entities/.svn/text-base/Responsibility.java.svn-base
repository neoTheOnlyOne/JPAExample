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
public class Responsibility implements Serializable {
	@Id
	@Column(name="OID_RESPONSIBILITY")
	private Long id;

	@Column(name="APPLICATION_CONTEXT")
	private String applicationContext;

	@Column(name="DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="ESCALATION_LEVEL")
	private String escalationLevel;

	@Column(name="FK_LOCAL_LOOP_COID_LOOP_CONTRA")
	private Long fkLocalLoopCoidLoopContra;

	@Column(name="NOTES_TO_RESPONSIBILITY")
	private String notesToResponsibility;

	@Column(name="RESPONSIBILITY_DESCRIPTION")
	private String responsibilityDescription;

	@Column(name="RESPONSIBILITY_ID")
	private String responsibilityId;

	@Column(name="SEQUENCE_NO")
	private Long sequenceNo;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ANSPRECHPARTOID_ANSPRECHPAR")
	private ContactPerson contactPerson;

	private static final long serialVersionUID = 1L;

	public Responsibility() {
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
	 * @return the applicationContext
	 */
	public String getApplicationContext() {
		return applicationContext;
	}

	/**
	 * @param applicationContext the applicationContext to set
	 */
	public void setApplicationContext(String applicationContext) {
		this.applicationContext = applicationContext;
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
	 * @return the escalationLevel
	 */
	public String getEscalationLevel() {
		return escalationLevel;
	}

	/**
	 * @param escalationLevel the escalationLevel to set
	 */
	public void setEscalationLevel(String escalationLevel) {
		this.escalationLevel = escalationLevel;
	}

	/**
	 * @return the fkLocalLoopCoidLoopContra
	 */
	public Long getFkLocalLoopCoidLoopContra() {
		return fkLocalLoopCoidLoopContra;
	}

	/**
	 * @param fkLocalLoopCoidLoopContra the fkLocalLoopCoidLoopContra to set
	 */
	public void setFkLocalLoopCoidLoopContra(Long fkLocalLoopCoidLoopContra) {
		this.fkLocalLoopCoidLoopContra = fkLocalLoopCoidLoopContra;
	}

	/**
	 * @return the notesToResponsibility
	 */
	public String getNotesToResponsibility() {
		return notesToResponsibility;
	}

	/**
	 * @param notesToResponsibility the notesToResponsibility to set
	 */
	public void setNotesToResponsibility(String notesToResponsibility) {
		this.notesToResponsibility = notesToResponsibility;
	}

	/**
	 * @return the responsibilityDescription
	 */
	public String getResponsibilityDescription() {
		return responsibilityDescription;
	}

	/**
	 * @param responsibilityDescription the responsibilityDescription to set
	 */
	public void setResponsibilityDescription(String responsibilityDescription) {
		this.responsibilityDescription = responsibilityDescription;
	}

	/**
	 * @return the responsibilityId
	 */
	public String getResponsibilityId() {
		return responsibilityId;
	}

	/**
	 * @param responsibilityId the responsibilityId to set
	 */
	public void setResponsibilityId(String responsibilityId) {
		this.responsibilityId = responsibilityId;
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
	 * @return the contactPerson
	 */
	public ContactPerson getContactPerson() {
		return contactPerson;
	}

	/**
	 * @param contactPerson the contactPerson to set
	 */
	public void setContactPerson(ContactPerson contactPerson) {
		this.contactPerson = contactPerson;
	}


}
