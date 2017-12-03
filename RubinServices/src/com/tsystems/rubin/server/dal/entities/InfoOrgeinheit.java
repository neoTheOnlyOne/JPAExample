package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="INFO_ORGEINHEIT")
public class InfoOrgeinheit implements Serializable {
	@Id
	@Column(name="ORGEINHEIT_ID")
	private Long id;

	@Column(name="O_ABKUERZUNG")
	private String oAbkuerzung;

	@Column(name="O_BEZEICHNUNG")
	private String oBezeichnung;

	@Column(name="O_NOTIZ")
	private String remark;

	@Column(name="O_NUMMER")
	private String number;

	@Column(name="O_ZUSATZ")
	private String oZusatz;

	@OneToMany(mappedBy="infoOrgeinheit")
	private Set<InfoEndpunkt> infoEndpunkts;

	@OneToMany(mappedBy="infoOrgeinheit")
	private Set<InfoAnsprechpartn> infoAnsprechpartners;

	private static final long serialVersionUID = 1L;

	public InfoOrgeinheit() {
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
	 * @return the oAbkuerzung
	 */
	public String getOAbkuerzung() {
		return oAbkuerzung;
	}

	/**
	 * @param abkuerzung the oAbkuerzung to set
	 */
	public void setOAbkuerzung(String abkuerzung) {
		oAbkuerzung = abkuerzung;
	}

	/**
	 * @return the oBezeichnung
	 */
	public String getOBezeichnung() {
		return oBezeichnung;
	}

	/**
	 * @param bezeichnung the oBezeichnung to set
	 */
	public void setOBezeichnung(String bezeichnung) {
		oBezeichnung = bezeichnung;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the oZusatz
	 */
	public String getOZusatz() {
		return oZusatz;
	}

	/**
	 * @param zusatz the oZusatz to set
	 */
	public void setOZusatz(String zusatz) {
		oZusatz = zusatz;
	}

	/**
	 * @return the infoEndpunkts
	 */
	public Set<InfoEndpunkt> getInfoEndpunkts() {
		return infoEndpunkts;
	}

	/**
	 * @param infoEndpunkts the infoEndpunkts to set
	 */
	public void setInfoEndpunkts(Set<InfoEndpunkt> infoEndpunkts) {
		this.infoEndpunkts = infoEndpunkts;
	}

	/**
	 * @return the infoAnsprechpartners
	 */
	public Set<InfoAnsprechpartn> getInfoAnsprechpartners() {
		return infoAnsprechpartners;
	}

	/**
	 * @param infoAnsprechpartners the infoAnsprechpartners to set
	 */
	public void setInfoAnsprechpartners(Set<InfoAnsprechpartn> infoAnsprechpartners) {
		this.infoAnsprechpartners = infoAnsprechpartners;
	}

}
