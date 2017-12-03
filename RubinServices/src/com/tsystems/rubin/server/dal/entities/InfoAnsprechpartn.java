package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="INFO_ANSPRECHPARTN")
public class InfoAnsprechpartn implements Serializable {
	@Id
	@Column(name="ANSPRECHPARTNER_ID")
	private Long id;

	@Column(name="AP_ANREDE")
	private String apAnrede;

	@Column(name="AP_BEREICH")
	private String apBereich;

	@Column(name="AP_CRM")
	private String apCrm;

	@Column(name="AP_EMAIL")
	private String apEmail;

	@Column(name="AP_FAX")
	private String apFax;

	@Column(name="AP_FUNCTION")
	private String apFunction;

	@Column(name="AP_INET")
	private String apInet;

	@Column(name="AP_KENNUNG")
	private String apKennung;

	@Column(name="AP_MOBIL")
	private String apMobil;

	@Column(name="AP_NAME")
	private String apName;

	@Column(name="AP_TELEFON")
	private String apTelefon;

	@Column(name="AP_TELEX")
	private String apTelex;

	@Column(name="AP_TITEL")
	private String apTitel;

	@Column(name="AP_VORNAME")
	private String apVorname;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CARRIER")
	private InfoCarrier infoCarrier;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ORGEINHEIT")
	private InfoOrgeinheit infoOrgeinheit;

	private static final long serialVersionUID = 1L;

	public InfoAnsprechpartn() {
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
	 * @return the apAnrede
	 */
	public String getApAnrede() {
		return apAnrede;
	}

	/**
	 * @param apAnrede the apAnrede to set
	 */
	public void setApAnrede(String apAnrede) {
		this.apAnrede = apAnrede;
	}

	/**
	 * @return the apBereich
	 */
	public String getApBereich() {
		return apBereich;
	}

	/**
	 * @param apBereich the apBereich to set
	 */
	public void setApBereich(String apBereich) {
		this.apBereich = apBereich;
	}

	/**
	 * @return the apCrm
	 */
	public String getApCrm() {
		return apCrm;
	}

	/**
	 * @param apCrm the apCrm to set
	 */
	public void setApCrm(String apCrm) {
		this.apCrm = apCrm;
	}

	/**
	 * @return the apEmail
	 */
	public String getApEmail() {
		return apEmail;
	}

	/**
	 * @param apEmail the apEmail to set
	 */
	public void setApEmail(String apEmail) {
		this.apEmail = apEmail;
	}

	/**
	 * @return the apFax
	 */
	public String getApFax() {
		return apFax;
	}

	/**
	 * @param apFax the apFax to set
	 */
	public void setApFax(String apFax) {
		this.apFax = apFax;
	}

	/**
	 * @return the apFunction
	 */
	public String getApFunction() {
		return apFunction;
	}

	/**
	 * @param apFunction the apFunction to set
	 */
	public void setApFunction(String apFunction) {
		this.apFunction = apFunction;
	}

	/**
	 * @return the apInet
	 */
	public String getApInet() {
		return apInet;
	}

	/**
	 * @param apInet the apInet to set
	 */
	public void setApInet(String apInet) {
		this.apInet = apInet;
	}

	/**
	 * @return the apKennung
	 */
	public String getApKennung() {
		return apKennung;
	}

	/**
	 * @param apKennung the apKennung to set
	 */
	public void setApKennung(String apKennung) {
		this.apKennung = apKennung;
	}

	/**
	 * @return the apMobil
	 */
	public String getApMobil() {
		return apMobil;
	}

	/**
	 * @param apMobil the apMobil to set
	 */
	public void setApMobil(String apMobil) {
		this.apMobil = apMobil;
	}

	/**
	 * @return the apName
	 */
	public String getApName() {
		return apName;
	}

	/**
	 * @param apName the apName to set
	 */
	public void setApName(String apName) {
		this.apName = apName;
	}

	/**
	 * @return the apTelefon
	 */
	public String getApTelefon() {
		return apTelefon;
	}

	/**
	 * @param apTelefon the apTelefon to set
	 */
	public void setApTelefon(String apTelefon) {
		this.apTelefon = apTelefon;
	}

	/**
	 * @return the apTelex
	 */
	public String getApTelex() {
		return apTelex;
	}

	/**
	 * @param apTelex the apTelex to set
	 */
	public void setApTelex(String apTelex) {
		this.apTelex = apTelex;
	}

	/**
	 * @return the apTitel
	 */
	public String getApTitel() {
		return apTitel;
	}

	/**
	 * @param apTitel the apTitel to set
	 */
	public void setApTitel(String apTitel) {
		this.apTitel = apTitel;
	}

	/**
	 * @return the apVorname
	 */
	public String getApVorname() {
		return apVorname;
	}

	/**
	 * @param apVorname the apVorname to set
	 */
	public void setApVorname(String apVorname) {
		this.apVorname = apVorname;
	}

	/**
	 * @return the infoCarrier
	 */
	public InfoCarrier getInfoCarrier() {
		return infoCarrier;
	}

	/**
	 * @param infoCarrier the infoCarrier to set
	 */
	public void setInfoCarrier(InfoCarrier infoCarrier) {
		this.infoCarrier = infoCarrier;
	}

	/**
	 * @return the infoOrgeinheit
	 */
	public InfoOrgeinheit getInfoOrgeinheit() {
		return infoOrgeinheit;
	}

	/**
	 * @param infoOrgeinheit the infoOrgeinheit to set
	 */
	public void setInfoOrgeinheit(InfoOrgeinheit infoOrgeinheit) {
		this.infoOrgeinheit = infoOrgeinheit;
	}
}
