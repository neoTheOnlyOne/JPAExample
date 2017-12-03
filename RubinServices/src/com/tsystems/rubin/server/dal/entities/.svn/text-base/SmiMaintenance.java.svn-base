package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
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
@Table(name="SMI_MAINTENANCE")
public class SmiMaintenance implements Serializable {
	@Id
	@Column(name="OID_MAINTENANCE")
	private Long id;

	@Column(name="ASPNAME")
	private String aspName;

	@Column(name="ASPTELEFON")
	private String aspTelephone;

	@Column(name="BEGINNWARTUNG")
	private Date begin;

	@Column(name="ENDWARTUNG")
	private Date end;

	@Column(name="FOREIGN0")
	private String foreign0;

	private String interrutiondesc;

	private String intwartungsnr;

	@Column(name="KVISTATUS")
	private String kviStatus;

	@Column(name="MAILSTATUS")
	private String mailStatus;

	@Column(name="MAINTENANCEGROUP")
	private String maintenanceGroup;

	@Column(name="MTREASON")
	private String reason;

	@Column(name="MTSTATUS")
	private String status;

	@Column(name="NAME")
	private String name;

	private String stornogrund;

	private Long wartungsdauer;

	private String wartungsnr;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SMI_KVIOID_KVI")
	private SmiKvi smiKvi;

	@OneToMany(mappedBy="smiMaintenance")
	private Set<SmiGroup> smiGroups;

	private static final long serialVersionUID = 1L;

	public SmiMaintenance() {
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
	 * @return the aspName
	 */
	public String getAspName() {
		return aspName;
	}

	/**
	 * @param aspName the aspName to set
	 */
	public void setAspName(String aspName) {
		this.aspName = aspName;
	}

	/**
	 * @return the aspTelephone
	 */
	public String getAspTelephone() {
		return aspTelephone;
	}

	/**
	 * @param aspTelephone the aspTelephone to set
	 */
	public void setAspTelephone(String aspTelephone) {
		this.aspTelephone = aspTelephone;
	}

	/**
	 * @return the begin
	 */
	public Date getBegin() {
		return begin;
	}

	/**
	 * @param begin the begin to set
	 */
	public void setBegin(Date begin) {
		this.begin = begin;
	}

	/**
	 * @return the end
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(Date end) {
		this.end = end;
	}

	/**
	 * @return the foreign0
	 */
	public String getForeign0() {
		return foreign0;
	}

	/**
	 * @param foreign0 the foreign0 to set
	 */
	public void setForeign0(String foreign0) {
		this.foreign0 = foreign0;
	}

	/**
	 * @return the interrutiondesc
	 */
	public String getInterrutiondesc() {
		return interrutiondesc;
	}

	/**
	 * @param interrutiondesc the interrutiondesc to set
	 */
	public void setInterrutiondesc(String interrutiondesc) {
		this.interrutiondesc = interrutiondesc;
	}

	/**
	 * @return the intwartungsnr
	 */
	public String getIntwartungsnr() {
		return intwartungsnr;
	}

	/**
	 * @param intwartungsnr the intwartungsnr to set
	 */
	public void setIntwartungsnr(String intwartungsnr) {
		this.intwartungsnr = intwartungsnr;
	}

	/**
	 * @return the kviStatus
	 */
	public String getKviStatus() {
		return kviStatus;
	}

	/**
	 * @param kviStatus the kviStatus to set
	 */
	public void setKviStatus(String kviStatus) {
		this.kviStatus = kviStatus;
	}

	/**
	 * @return the mailStatus
	 */
	public String getMailStatus() {
		return mailStatus;
	}

	/**
	 * @param mailStatus the mailStatus to set
	 */
	public void setMailStatus(String mailStatus) {
		this.mailStatus = mailStatus;
	}

	/**
	 * @return the maintenanceGroup
	 */
	public String getMaintenanceGroup() {
		return maintenanceGroup;
	}

	/**
	 * @param maintenanceGroup the maintenanceGroup to set
	 */
	public void setMaintenanceGroup(String maintenanceGroup) {
		this.maintenanceGroup = maintenanceGroup;
	}

	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the stornogrund
	 */
	public String getStornogrund() {
		return stornogrund;
	}

	/**
	 * @param stornogrund the stornogrund to set
	 */
	public void setStornogrund(String stornogrund) {
		this.stornogrund = stornogrund;
	}

	/**
	 * @return the wartungsdauer
	 */
	public Long getWartungsdauer() {
		return wartungsdauer;
	}

	/**
	 * @param wartungsdauer the wartungsdauer to set
	 */
	public void setWartungsdauer(Long wartungsdauer) {
		this.wartungsdauer = wartungsdauer;
	}

	/**
	 * @return the wartungsnr
	 */
	public String getWartungsnr() {
		return wartungsnr;
	}

	/**
	 * @param wartungsnr the wartungsnr to set
	 */
	public void setWartungsnr(String wartungsnr) {
		this.wartungsnr = wartungsnr;
	}

	/**
	 * @return the smiKvi
	 */
	public SmiKvi getSmiKvi() {
		return smiKvi;
	}

	/**
	 * @param smiKvi the smiKvi to set
	 */
	public void setSmiKvi(SmiKvi smiKvi) {
		this.smiKvi = smiKvi;
	}

	/**
	 * @return the smiGroups
	 */
	public Set<SmiGroup> getSmiGroups() {
		return smiGroups;
	}

	/**
	 * @param smiGroups the smiGroups to set
	 */
	public void setSmiGroups(Set<SmiGroup> smiGroups) {
		this.smiGroups = smiGroups;
	}

}
