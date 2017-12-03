package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Restorationnutzer implements Serializable {
	@Id
	@Column(name="OID_RESTORATIONNUT")
	private Long id;

	@Column(name="ANTEIL_AN_SCHALTQ0")
	private Long anteilAnSchaltq0;

	@Column(name="ANTEIL_AN_SCHALTQ1")
	private Long anteilAnSchaltq1;

	@Column(name="ANTEIL_AN_SCHALTQ2")
	private Long anteilAnSchaltq2;

	@Column(name="ANTEIL_AN_SCHALTQU")
	private Long anteilAnSchaltqu;

	private String ersatzwegnutzerkap;

	@Column(name="KOSTENANTEIL_SCHA0")
	private Long kostenanteilScha0;

	@Column(name="KOSTENANTEIL_SCHA1")
	private Long kostenanteilScha1;

	@Column(name="KOSTENANTEIL_SCHA2")
	private Long kostenanteilScha2;

	@Column(name="KOSTENANTEIL_SCHAL")
	private Long kostenanteilSchal;

	@Column(name="NUTZERANZAHL_QUAR0")
	private Long nutzeranzahlQuar0;

	@Column(name="NUTZERANZAHL_QUAR1")
	private Long nutzeranzahlQuar1;

	@Column(name="NUTZERANZAHL_QUAR2")
	private Long nutzeranzahlQuar2;

	@Column(name="NUTZERANZAHL_QUART")
	private Long nutzeranzahlQuart;

	@Column(name="WAEHRUNG_KOSTENANT")
	private String waehrungKostenant;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CARRIEROID_CARR")
	private Carrier carrier;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_RESTORATIONKOID")
	private Restorationkostene restorationkostene;

	private static final long serialVersionUID = 1L;

	public Restorationnutzer() {
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
	 * @return the anteilAnSchaltq0
	 */
	public Long getAnteilAnSchaltq0() {
		return anteilAnSchaltq0;
	}

	/**
	 * @param anteilAnSchaltq0 the anteilAnSchaltq0 to set
	 */
	public void setAnteilAnSchaltq0(Long anteilAnSchaltq0) {
		this.anteilAnSchaltq0 = anteilAnSchaltq0;
	}

	/**
	 * @return the anteilAnSchaltq1
	 */
	public Long getAnteilAnSchaltq1() {
		return anteilAnSchaltq1;
	}

	/**
	 * @param anteilAnSchaltq1 the anteilAnSchaltq1 to set
	 */
	public void setAnteilAnSchaltq1(Long anteilAnSchaltq1) {
		this.anteilAnSchaltq1 = anteilAnSchaltq1;
	}

	/**
	 * @return the anteilAnSchaltq2
	 */
	public Long getAnteilAnSchaltq2() {
		return anteilAnSchaltq2;
	}

	/**
	 * @param anteilAnSchaltq2 the anteilAnSchaltq2 to set
	 */
	public void setAnteilAnSchaltq2(Long anteilAnSchaltq2) {
		this.anteilAnSchaltq2 = anteilAnSchaltq2;
	}

	/**
	 * @return the anteilAnSchaltqu
	 */
	public Long getAnteilAnSchaltqu() {
		return anteilAnSchaltqu;
	}

	/**
	 * @param anteilAnSchaltqu the anteilAnSchaltqu to set
	 */
	public void setAnteilAnSchaltqu(Long anteilAnSchaltqu) {
		this.anteilAnSchaltqu = anteilAnSchaltqu;
	}

	/**
	 * @return the ersatzwegnutzerkap
	 */
	public String getErsatzwegnutzerkap() {
		return ersatzwegnutzerkap;
	}

	/**
	 * @param ersatzwegnutzerkap the ersatzwegnutzerkap to set
	 */
	public void setErsatzwegnutzerkap(String ersatzwegnutzerkap) {
		this.ersatzwegnutzerkap = ersatzwegnutzerkap;
	}

	/**
	 * @return the kostenanteilScha0
	 */
	public Long getKostenanteilScha0() {
		return kostenanteilScha0;
	}

	/**
	 * @param kostenanteilScha0 the kostenanteilScha0 to set
	 */
	public void setKostenanteilScha0(Long kostenanteilScha0) {
		this.kostenanteilScha0 = kostenanteilScha0;
	}

	/**
	 * @return the kostenanteilScha1
	 */
	public Long getKostenanteilScha1() {
		return kostenanteilScha1;
	}

	/**
	 * @param kostenanteilScha1 the kostenanteilScha1 to set
	 */
	public void setKostenanteilScha1(Long kostenanteilScha1) {
		this.kostenanteilScha1 = kostenanteilScha1;
	}

	/**
	 * @return the kostenanteilScha2
	 */
	public Long getKostenanteilScha2() {
		return kostenanteilScha2;
	}

	/**
	 * @param kostenanteilScha2 the kostenanteilScha2 to set
	 */
	public void setKostenanteilScha2(Long kostenanteilScha2) {
		this.kostenanteilScha2 = kostenanteilScha2;
	}

	/**
	 * @return the kostenanteilSchal
	 */
	public Long getKostenanteilSchal() {
		return kostenanteilSchal;
	}

	/**
	 * @param kostenanteilSchal the kostenanteilSchal to set
	 */
	public void setKostenanteilSchal(Long kostenanteilSchal) {
		this.kostenanteilSchal = kostenanteilSchal;
	}

	/**
	 * @return the nutzeranzahlQuar0
	 */
	public Long getNutzeranzahlQuar0() {
		return nutzeranzahlQuar0;
	}

	/**
	 * @param nutzeranzahlQuar0 the nutzeranzahlQuar0 to set
	 */
	public void setNutzeranzahlQuar0(Long nutzeranzahlQuar0) {
		this.nutzeranzahlQuar0 = nutzeranzahlQuar0;
	}

	/**
	 * @return the nutzeranzahlQuar1
	 */
	public Long getNutzeranzahlQuar1() {
		return nutzeranzahlQuar1;
	}

	/**
	 * @param nutzeranzahlQuar1 the nutzeranzahlQuar1 to set
	 */
	public void setNutzeranzahlQuar1(Long nutzeranzahlQuar1) {
		this.nutzeranzahlQuar1 = nutzeranzahlQuar1;
	}

	/**
	 * @return the nutzeranzahlQuar2
	 */
	public Long getNutzeranzahlQuar2() {
		return nutzeranzahlQuar2;
	}

	/**
	 * @param nutzeranzahlQuar2 the nutzeranzahlQuar2 to set
	 */
	public void setNutzeranzahlQuar2(Long nutzeranzahlQuar2) {
		this.nutzeranzahlQuar2 = nutzeranzahlQuar2;
	}

	/**
	 * @return the nutzeranzahlQuart
	 */
	public Long getNutzeranzahlQuart() {
		return nutzeranzahlQuart;
	}

	/**
	 * @param nutzeranzahlQuart the nutzeranzahlQuart to set
	 */
	public void setNutzeranzahlQuart(Long nutzeranzahlQuart) {
		this.nutzeranzahlQuart = nutzeranzahlQuart;
	}

	/**
	 * @return the waehrungKostenant
	 */
	public String getWaehrungKostenant() {
		return waehrungKostenant;
	}

	/**
	 * @param waehrungKostenant the waehrungKostenant to set
	 */
	public void setWaehrungKostenant(String waehrungKostenant) {
		this.waehrungKostenant = waehrungKostenant;
	}

	/**
	 * @return the carrier
	 */
	public Carrier getCarrier() {
		return carrier;
	}

	/**
	 * @param carrier the carrier to set
	 */
	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

	/**
	 * @return the restorationkostene
	 */
	public Restorationkostene getRestorationkostene() {
		return restorationkostene;
	}

	/**
	 * @param restorationkostene the restorationkostene to set
	 */
	public void setRestorationkostene(Restorationkostene restorationkostene) {
		this.restorationkostene = restorationkostene;
	}
}
