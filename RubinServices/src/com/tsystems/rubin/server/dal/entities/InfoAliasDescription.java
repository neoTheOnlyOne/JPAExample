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
import javax.persistence.Table;

@Entity
@Table(name="INFO_ALIASBEZEICHN")
public class InfoAliasDescription implements Serializable {
	@Id
	@Column(name="OID_ALIASBEZEICHNU")
	private Long id;

	@Column(name="ALIASBEMERKUNG")
	private String aliasRemark;

	@Column(name="ALIASKENNUNG")
	private String aliasId;

	@Column(name="F_BEG_STATUS")
	private String beginningStatus;

	@Column(name="F_BEGINN")
	private Date begin;

	@Column(name="FUE_ABSCHN_NR")
	private Long fueAbschnNr;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_VERBINDUNG")
	private InfoVerbindung infoVerbindung;

	private static final long serialVersionUID = 1L;

	public InfoAliasDescription() {
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
	 * @return the aliasRemark
	 */
	public String getAliasRemark() {
		return aliasRemark;
	}

	/**
	 * @param aliasRemark the aliasRemark to set
	 */
	public void setAliasRemark(String aliasRemark) {
		this.aliasRemark = aliasRemark;
	}

	/**
	 * @return the aliasId
	 */
	public String getAliasId() {
		return aliasId;
	}

	/**
	 * @param aliasId the aliasId to set
	 */
	public void setAliasId(String aliasId) {
		this.aliasId = aliasId;
	}

	/**
	 * @return the beginningStatus
	 */
	public String getBeginningStatus() {
		return beginningStatus;
	}

	/**
	 * @param beginningStatus the beginningStatus to set
	 */
	public void setBeginningStatus(String beginningStatus) {
		this.beginningStatus = beginningStatus;
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
	 * @return the fueAbschnNr
	 */
	public Long getFueAbschnNr() {
		return fueAbschnNr;
	}

	/**
	 * @param fueAbschnNr the fueAbschnNr to set
	 */
	public void setFueAbschnNr(Long fueAbschnNr) {
		this.fueAbschnNr = fueAbschnNr;
	}

	/**
	 * @return the infoVerbindung
	 */
	public InfoVerbindung getInfoVerbindung() {
		return infoVerbindung;
	}

	/**
	 * @param infoVerbindung the infoVerbindung to set
	 */
	public void setInfoVerbindung(InfoVerbindung infoVerbindung) {
		this.infoVerbindung = infoVerbindung;
	}

	

}
