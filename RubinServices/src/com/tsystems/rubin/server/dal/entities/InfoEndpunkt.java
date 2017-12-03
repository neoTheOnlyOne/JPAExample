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
@Table(name="INFO_ENDPUNKT")
public class InfoEndpunkt implements Serializable {
	@Id
	@Column(name="ENDPUNKT_ID")
	private Long id;

	@Column(name="E_ADRESSE_1")
	private String adresse1;

	@Column(name="E_ADRESSE_2")
	private String adresse2;

	@Column(name="E_ADRESSE_3")
	private String adresse3;

	@Column(name="E_ADRESSE_4")
	private String adresse4;

	@Column(name="E_ADRESSE_5")
	private String adresse5;

	@Column(name="E_AKZ")
	private String akz;

	@Column(name="E_AKZ_NKZ")
	private String akzNkz;

	@Column(name="E_AKZ_NKZ_VKZ")
	private String akzNkzVkz;

	@Column(name="E_ART")
	private String art;

	@Column(name="E_BREITE")
	private String breite;

	@Column(name="E_BSZ")
	private String bsz;

	@Column(name="E_FACHSZ")
	private String fachsz;

	@Column(name="E_INTERNATIONAL")
	private String international;

	@Column(name="E_ITU")
	private String itu;

	@Column(name="E_KURZ")
	private String kurz;

	@Column(name="E_LAENGE")
	private String laenge;

	@Column(name="E_LAND_INTERNATION")
	private String landInternation;

	@Column(name="E_LAND_NATIONAL")
	private String landNational;

	@Column(name="E_LANDKENNUNG")
	private String landkennung;

	@Column(name="E_NATIONAL")
	private String national;

	@Column(name="E_NKZ")
	private String nkz;

	@Column(name="E_NOTIZ")
	private String notiz;

	@Column(name="E_ON_INTERNATIONAL")
	private String onInternational;

	@Column(name="E_ON_KENNUNG")
	private String onKennung;

	@Column(name="E_ON_NATIONAL")
	private String onNational;

	@Column(name="E_REGION")
	private String region;

	@Column(name="E_VKZ")
	private String vkz;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CARRIER")
	private InfoCarrier infoCarrier;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ORGEINHEIT")
	private InfoOrgeinheit infoOrgeinheit;

	private static final long serialVersionUID = 1L;

	public InfoEndpunkt() {
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
	 * @return the adresse1
	 */
	public String getAdresse1() {
		return adresse1;
	}

	/**
	 * @param adresse1 the adresse1 to set
	 */
	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}

	/**
	 * @return the adresse2
	 */
	public String getAdresse2() {
		return adresse2;
	}

	/**
	 * @param adresse2 the adresse2 to set
	 */
	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}

	/**
	 * @return the adresse3
	 */
	public String getAdresse3() {
		return adresse3;
	}

	/**
	 * @param adresse3 the adresse3 to set
	 */
	public void setAdresse3(String adresse3) {
		this.adresse3 = adresse3;
	}

	/**
	 * @return the adresse4
	 */
	public String getAdresse4() {
		return adresse4;
	}

	/**
	 * @param adresse4 the adresse4 to set
	 */
	public void setAdresse4(String adresse4) {
		this.adresse4 = adresse4;
	}

	/**
	 * @return the adresse5
	 */
	public String getAdresse5() {
		return adresse5;
	}

	/**
	 * @param adresse5 the adresse5 to set
	 */
	public void setAdresse5(String adresse5) {
		this.adresse5 = adresse5;
	}

	/**
	 * @return the akz
	 */
	public String getAkz() {
		return akz;
	}

	/**
	 * @param akz the akz to set
	 */
	public void setAkz(String akz) {
		this.akz = akz;
	}

	/**
	 * @return the akzNkz
	 */
	public String getAkzNkz() {
		return akzNkz;
	}

	/**
	 * @param akzNkz the akzNkz to set
	 */
	public void setAkzNkz(String akzNkz) {
		this.akzNkz = akzNkz;
	}

	/**
	 * @return the akzNkzVkz
	 */
	public String getAkzNkzVkz() {
		return akzNkzVkz;
	}

	/**
	 * @param akzNkzVkz the akzNkzVkz to set
	 */
	public void setAkzNkzVkz(String akzNkzVkz) {
		this.akzNkzVkz = akzNkzVkz;
	}

	/**
	 * @return the art
	 */
	public String getArt() {
		return art;
	}

	/**
	 * @param art the art to set
	 */
	public void setArt(String art) {
		this.art = art;
	}

	/**
	 * @return the breite
	 */
	public String getBreite() {
		return breite;
	}

	/**
	 * @param breite the breite to set
	 */
	public void setBreite(String breite) {
		this.breite = breite;
	}

	/**
	 * @return the bsz
	 */
	public String getBsz() {
		return bsz;
	}

	/**
	 * @param bsz the bsz to set
	 */
	public void setBsz(String bsz) {
		this.bsz = bsz;
	}

	/**
	 * @return the fachsz
	 */
	public String getFachsz() {
		return fachsz;
	}

	/**
	 * @param fachsz the fachsz to set
	 */
	public void setFachsz(String fachsz) {
		this.fachsz = fachsz;
	}

	/**
	 * @return the international
	 */
	public String getInternational() {
		return international;
	}

	/**
	 * @param international the international to set
	 */
	public void setInternational(String international) {
		this.international = international;
	}

	/**
	 * @return the itu
	 */
	public String getItu() {
		return itu;
	}

	/**
	 * @param itu the itu to set
	 */
	public void setItu(String itu) {
		this.itu = itu;
	}

	/**
	 * @return the kurz
	 */
	public String getKurz() {
		return kurz;
	}

	/**
	 * @param kurz the kurz to set
	 */
	public void setKurz(String kurz) {
		this.kurz = kurz;
	}

	/**
	 * @return the laenge
	 */
	public String getLaenge() {
		return laenge;
	}

	/**
	 * @param laenge the laenge to set
	 */
	public void setLaenge(String laenge) {
		this.laenge = laenge;
	}

	/**
	 * @return the landInternation
	 */
	public String getLandInternation() {
		return landInternation;
	}

	/**
	 * @param landInternation the landInternation to set
	 */
	public void setLandInternation(String landInternation) {
		this.landInternation = landInternation;
	}

	/**
	 * @return the landNational
	 */
	public String getLandNational() {
		return landNational;
	}

	/**
	 * @param landNational the landNational to set
	 */
	public void setLandNational(String landNational) {
		this.landNational = landNational;
	}

	/**
	 * @return the landkennung
	 */
	public String getLandkennung() {
		return landkennung;
	}

	/**
	 * @param landkennung the landkennung to set
	 */
	public void setLandkennung(String landkennung) {
		this.landkennung = landkennung;
	}

	/**
	 * @return the national
	 */
	public String getNational() {
		return national;
	}

	/**
	 * @param national the national to set
	 */
	public void setNational(String national) {
		this.national = national;
	}

	/**
	 * @return the nkz
	 */
	public String getNkz() {
		return nkz;
	}

	/**
	 * @param nkz the nkz to set
	 */
	public void setNkz(String nkz) {
		this.nkz = nkz;
	}

	/**
	 * @return the notiz
	 */
	public String getNotiz() {
		return notiz;
	}

	/**
	 * @param notiz the notiz to set
	 */
	public void setNotiz(String notiz) {
		this.notiz = notiz;
	}

	/**
	 * @return the onInternational
	 */
	public String getOnInternational() {
		return onInternational;
	}

	/**
	 * @param onInternational the onInternational to set
	 */
	public void setOnInternational(String onInternational) {
		this.onInternational = onInternational;
	}

	/**
	 * @return the onKennung
	 */
	public String getOnKennung() {
		return onKennung;
	}

	/**
	 * @param onKennung the onKennung to set
	 */
	public void setOnKennung(String onKennung) {
		this.onKennung = onKennung;
	}

	/**
	 * @return the onNational
	 */
	public String getOnNational() {
		return onNational;
	}

	/**
	 * @param onNational the onNational to set
	 */
	public void setOnNational(String onNational) {
		this.onNational = onNational;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the vkz
	 */
	public String getVkz() {
		return vkz;
	}

	/**
	 * @param vkz the vkz to set
	 */
	public void setVkz(String vkz) {
		this.vkz = vkz;
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
