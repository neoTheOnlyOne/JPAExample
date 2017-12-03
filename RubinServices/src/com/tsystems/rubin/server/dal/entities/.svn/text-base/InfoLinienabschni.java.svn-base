package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="INFO_LINIENABSCHNI")
public class InfoLinienabschni implements Serializable {
	@Id
	@Column(name="LA_ID")
	private Long id;

	@Column(name="LA_BREITE_A")
	private String breiteA;

	@Column(name="LA_BREITE_B")
	private String breiteB;

	@Column(name="LA_BSZ_A")
	private String bszA;

	@Column(name="LA_BSZ_B")
	private String bszB;

	@Column(name="LA_ENDPUNKT_A")
	private String terminalA;

	@Column(name="LA_ENDPUNKT_B")
	private String terminalB;

	@Column(name="LA_ENDSZ_A")
	private String endszA;

	@Column(name="LA_ENDSZ_B")
	private String endszB;

	@Column(name="LA_EXCLUDE_VIOLATION")
	private String excludeViolation;

	@Column(name="LA_GRENZE")
	private String grenze;

	@Column(name="LA_GRENZE_BREITE")
	private String grenzeBreite;

	@Column(name="LA_GRENZE_BSZ")
	private String grenzeBsz;

	@Column(name="LA_GRENZE_LAENGE")
	private String grenzeLaenge;

	@Column(name="LA_GRUNDSTUECK_A")
	private String siteA;

	@Column(name="LA_GRUNDSTUECK_B")
	private String siteB;

	@Column(name="LA_KM")
	private Long km;

	@Column(name="LA_LAENGE_A")
	private String laLaengeA;

	@Column(name="LA_LAENGE_B")
	private String laLaengeB;

	@Column(name="LA_NR")
	private Long laNr;

	@Column(name="LA_REGION_1")
	private String laRegion1;

	@Column(name="LA_REGION_2")
	private String laRegion2;

	@Column(name="LA_REGION_3")
	private String laRegion3;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LINIE")
	private InfoLine infoLine;

	private static final long serialVersionUID = 1L;

	public InfoLinienabschni() {
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
	 * @return the breiteA
	 */
	public String getBreiteA() {
		return breiteA;
	}

	/**
	 * @param breiteA the breiteA to set
	 */
	public void setBreiteA(String breiteA) {
		this.breiteA = breiteA;
	}

	/**
	 * @return the breiteB
	 */
	public String getBreiteB() {
		return breiteB;
	}

	/**
	 * @param breiteB the breiteB to set
	 */
	public void setBreiteB(String breiteB) {
		this.breiteB = breiteB;
	}

	/**
	 * @return the bszA
	 */
	public String getBszA() {
		return bszA;
	}

	/**
	 * @param bszA the bszA to set
	 */
	public void setBszA(String bszA) {
		this.bszA = bszA;
	}

	/**
	 * @return the bszB
	 */
	public String getBszB() {
		return bszB;
	}

	/**
	 * @param bszB the bszB to set
	 */
	public void setBszB(String bszB) {
		this.bszB = bszB;
	}

	/**
	 * @return the terminalA
	 */
	public String getTerminalA() {
		return terminalA;
	}

	/**
	 * @param terminalA the terminalA to set
	 */
	public void setTerminalA(String terminalA) {
		this.terminalA = terminalA;
	}

	/**
	 * @return the terminalB
	 */
	public String getTerminalB() {
		return terminalB;
	}

	/**
	 * @param terminalB the terminalB to set
	 */
	public void setTerminalB(String terminalB) {
		this.terminalB = terminalB;
	}

	/**
	 * @return the endszA
	 */
	public String getEndszA() {
		return endszA;
	}

	/**
	 * @param endszA the endszA to set
	 */
	public void setEndszA(String endszA) {
		this.endszA = endszA;
	}

	/**
	 * @return the endszB
	 */
	public String getEndszB() {
		return endszB;
	}

	/**
	 * @param endszB the endszB to set
	 */
	public void setEndszB(String endszB) {
		this.endszB = endszB;
	}

	/**
	 * @return the excludeViolation
	 */
	public String getExcludeViolation() {
		return excludeViolation;
	}

	/**
	 * @param excludeViolation the excludeViolation to set
	 */
	public void setExcludeViolation(String excludeViolation) {
		this.excludeViolation = excludeViolation;
	}

	/**
	 * @return the grenze
	 */
	public String getGrenze() {
		return grenze;
	}

	/**
	 * @param grenze the grenze to set
	 */
	public void setGrenze(String grenze) {
		this.grenze = grenze;
	}

	/**
	 * @return the grenzeBreite
	 */
	public String getGrenzeBreite() {
		return grenzeBreite;
	}

	/**
	 * @param grenzeBreite the grenzeBreite to set
	 */
	public void setGrenzeBreite(String grenzeBreite) {
		this.grenzeBreite = grenzeBreite;
	}

	/**
	 * @return the grenzeBsz
	 */
	public String getGrenzeBsz() {
		return grenzeBsz;
	}

	/**
	 * @param grenzeBsz the grenzeBsz to set
	 */
	public void setGrenzeBsz(String grenzeBsz) {
		this.grenzeBsz = grenzeBsz;
	}

	/**
	 * @return the grenzeLaenge
	 */
	public String getGrenzeLaenge() {
		return grenzeLaenge;
	}

	/**
	 * @param grenzeLaenge the grenzeLaenge to set
	 */
	public void setGrenzeLaenge(String grenzeLaenge) {
		this.grenzeLaenge = grenzeLaenge;
	}

	/**
	 * @return the siteA
	 */
	public String getSiteA() {
		return siteA;
	}

	/**
	 * @param siteA the siteA to set
	 */
	public void setSiteA(String siteA) {
		this.siteA = siteA;
	}

	/**
	 * @return the siteB
	 */
	public String getSiteB() {
		return siteB;
	}

	/**
	 * @param siteB the siteB to set
	 */
	public void setSiteB(String siteB) {
		this.siteB = siteB;
	}

	/**
	 * @return the km
	 */
	public Long getKm() {
		return km;
	}

	/**
	 * @param km the km to set
	 */
	public void setKm(Long km) {
		this.km = km;
	}

	/**
	 * @return the laLaengeA
	 */
	public String getLaLaengeA() {
		return laLaengeA;
	}

	/**
	 * @param laLaengeA the laLaengeA to set
	 */
	public void setLaLaengeA(String laLaengeA) {
		this.laLaengeA = laLaengeA;
	}

	/**
	 * @return the laLaengeB
	 */
	public String getLaLaengeB() {
		return laLaengeB;
	}

	/**
	 * @param laLaengeB the laLaengeB to set
	 */
	public void setLaLaengeB(String laLaengeB) {
		this.laLaengeB = laLaengeB;
	}

	/**
	 * @return the laNr
	 */
	public Long getLaNr() {
		return laNr;
	}

	/**
	 * @param laNr the laNr to set
	 */
	public void setLaNr(Long laNr) {
		this.laNr = laNr;
	}

	/**
	 * @return the laRegion1
	 */
	public String getLaRegion1() {
		return laRegion1;
	}

	/**
	 * @param laRegion1 the laRegion1 to set
	 */
	public void setLaRegion1(String laRegion1) {
		this.laRegion1 = laRegion1;
	}

	/**
	 * @return the laRegion2
	 */
	public String getLaRegion2() {
		return laRegion2;
	}

	/**
	 * @param laRegion2 the laRegion2 to set
	 */
	public void setLaRegion2(String laRegion2) {
		this.laRegion2 = laRegion2;
	}

	/**
	 * @return the laRegion3
	 */
	public String getLaRegion3() {
		return laRegion3;
	}

	/**
	 * @param laRegion3 the laRegion3 to set
	 */
	public void setLaRegion3(String laRegion3) {
		this.laRegion3 = laRegion3;
	}

	/**
	 * @return the infoLine
	 */
	public InfoLine getInfoLine() {
		return infoLine;
	}

	/**
	 * @param infoLine the infoLine to set
	 */
	public void setInfoLine(InfoLine infoLine) {
		this.infoLine = infoLine;
	}

}
