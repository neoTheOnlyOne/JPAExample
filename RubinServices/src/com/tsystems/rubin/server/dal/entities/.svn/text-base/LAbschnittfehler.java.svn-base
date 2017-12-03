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
@Table(name="L_ABSCHNITTFEHLER")
public class LAbschnittfehler implements Serializable {
	@Id
	@Column(name="OID_L_ABSCHNITTFEH")
	private Long id;

	@Column(name="ABSCHLUSS_NORMALI0")
	private Date abschlussNormali0;

	@Column(name="ABSCHLUSS_NORMALIS")
	private Date abschlussNormalis;

	@Column(name="ANZAHL_BETROFF_NON")
	private Long anzahlBetroffNon;

	@Column(name="ANZAHL_BETROFF_TRA")
	private Long anzahlBetroffTra;

	@Column(name="AUSFALL_CODIERUNG")
	private Long ausfallCodierung;

	private String ausfallnotiz;

	@Column(name="BEGINN_AUFBAU_ERS0")
	private Date beginnAufbauErs0;

	@Column(name="BEGINN_AUFBAU_ERSA")
	private Date beginnAufbauErsa;

	@Column(name="BEGINN_STOERUNG_DA")
	private Date beginnStoerungDa;

	@Column(name="BEGINN_STOERUNG_UH")
	private Date beginnStoerungUh;

	@Column(name="ENDE_AUFBAU_ERSAT0")
	private Date endeAufbauErsat0;

	@Column(name="ENDE_AUFBAU_ERSATZ")
	private Date endeAufbauErsatz;

	@Column(name="ENDE_REPARATUR_DAT")
	private Date endeReparaturDat;

	@Column(name="ENDE_REPARATUR_UHR")
	private Date endeReparaturUhr;

	private Long mttr;

	@Column(name="SYSTEM_RFCS_DATUM")
	private Date systemRfcsDatum;

	@Column(name="SYSTEM_RFCS_UHRZEI")
	private Date systemRfcsUhrzei;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KAPAZITAETOID_K")
	private Capacity capacity;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LINIENABSCHNOID")
	private LineSegment lineSegment;

	private static final long serialVersionUID = 1L;

	public LAbschnittfehler() {
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
	 * @return the abschlussNormali0
	 */
	public Date getAbschlussNormali0() {
		return abschlussNormali0;
	}

	/**
	 * @param abschlussNormali0 the abschlussNormali0 to set
	 */
	public void setAbschlussNormali0(Date abschlussNormali0) {
		this.abschlussNormali0 = abschlussNormali0;
	}

	/**
	 * @return the abschlussNormalis
	 */
	public Date getAbschlussNormalis() {
		return abschlussNormalis;
	}

	/**
	 * @param abschlussNormalis the abschlussNormalis to set
	 */
	public void setAbschlussNormalis(Date abschlussNormalis) {
		this.abschlussNormalis = abschlussNormalis;
	}

	/**
	 * @return the anzahlBetroffNon
	 */
	public Long getAnzahlBetroffNon() {
		return anzahlBetroffNon;
	}

	/**
	 * @param anzahlBetroffNon the anzahlBetroffNon to set
	 */
	public void setAnzahlBetroffNon(Long anzahlBetroffNon) {
		this.anzahlBetroffNon = anzahlBetroffNon;
	}

	/**
	 * @return the anzahlBetroffTra
	 */
	public Long getAnzahlBetroffTra() {
		return anzahlBetroffTra;
	}

	/**
	 * @param anzahlBetroffTra the anzahlBetroffTra to set
	 */
	public void setAnzahlBetroffTra(Long anzahlBetroffTra) {
		this.anzahlBetroffTra = anzahlBetroffTra;
	}

	/**
	 * @return the ausfallCodierung
	 */
	public Long getAusfallCodierung() {
		return ausfallCodierung;
	}

	/**
	 * @param ausfallCodierung the ausfallCodierung to set
	 */
	public void setAusfallCodierung(Long ausfallCodierung) {
		this.ausfallCodierung = ausfallCodierung;
	}

	/**
	 * @return the ausfallnotiz
	 */
	public String getAusfallnotiz() {
		return ausfallnotiz;
	}

	/**
	 * @param ausfallnotiz the ausfallnotiz to set
	 */
	public void setAusfallnotiz(String ausfallnotiz) {
		this.ausfallnotiz = ausfallnotiz;
	}

	/**
	 * @return the beginnAufbauErs0
	 */
	public Date getBeginnAufbauErs0() {
		return beginnAufbauErs0;
	}

	/**
	 * @param beginnAufbauErs0 the beginnAufbauErs0 to set
	 */
	public void setBeginnAufbauErs0(Date beginnAufbauErs0) {
		this.beginnAufbauErs0 = beginnAufbauErs0;
	}

	/**
	 * @return the beginnAufbauErsa
	 */
	public Date getBeginnAufbauErsa() {
		return beginnAufbauErsa;
	}

	/**
	 * @param beginnAufbauErsa the beginnAufbauErsa to set
	 */
	public void setBeginnAufbauErsa(Date beginnAufbauErsa) {
		this.beginnAufbauErsa = beginnAufbauErsa;
	}

	/**
	 * @return the beginnStoerungDa
	 */
	public Date getBeginnStoerungDa() {
		return beginnStoerungDa;
	}

	/**
	 * @param beginnStoerungDa the beginnStoerungDa to set
	 */
	public void setBeginnStoerungDa(Date beginnStoerungDa) {
		this.beginnStoerungDa = beginnStoerungDa;
	}

	/**
	 * @return the beginnStoerungUh
	 */
	public Date getBeginnStoerungUh() {
		return beginnStoerungUh;
	}

	/**
	 * @param beginnStoerungUh the beginnStoerungUh to set
	 */
	public void setBeginnStoerungUh(Date beginnStoerungUh) {
		this.beginnStoerungUh = beginnStoerungUh;
	}

	/**
	 * @return the endeAufbauErsat0
	 */
	public Date getEndeAufbauErsat0() {
		return endeAufbauErsat0;
	}

	/**
	 * @param endeAufbauErsat0 the endeAufbauErsat0 to set
	 */
	public void setEndeAufbauErsat0(Date endeAufbauErsat0) {
		this.endeAufbauErsat0 = endeAufbauErsat0;
	}

	/**
	 * @return the endeAufbauErsatz
	 */
	public Date getEndeAufbauErsatz() {
		return endeAufbauErsatz;
	}

	/**
	 * @param endeAufbauErsatz the endeAufbauErsatz to set
	 */
	public void setEndeAufbauErsatz(Date endeAufbauErsatz) {
		this.endeAufbauErsatz = endeAufbauErsatz;
	}

	/**
	 * @return the endeReparaturDat
	 */
	public Date getEndeReparaturDat() {
		return endeReparaturDat;
	}

	/**
	 * @param endeReparaturDat the endeReparaturDat to set
	 */
	public void setEndeReparaturDat(Date endeReparaturDat) {
		this.endeReparaturDat = endeReparaturDat;
	}

	/**
	 * @return the endeReparaturUhr
	 */
	public Date getEndeReparaturUhr() {
		return endeReparaturUhr;
	}

	/**
	 * @param endeReparaturUhr the endeReparaturUhr to set
	 */
	public void setEndeReparaturUhr(Date endeReparaturUhr) {
		this.endeReparaturUhr = endeReparaturUhr;
	}

	/**
	 * @return the mttr
	 */
	public Long getMttr() {
		return mttr;
	}

	/**
	 * @param mttr the mttr to set
	 */
	public void setMttr(Long mttr) {
		this.mttr = mttr;
	}

	/**
	 * @return the systemRfcsDatum
	 */
	public Date getSystemRfcsDatum() {
		return systemRfcsDatum;
	}

	/**
	 * @param systemRfcsDatum the systemRfcsDatum to set
	 */
	public void setSystemRfcsDatum(Date systemRfcsDatum) {
		this.systemRfcsDatum = systemRfcsDatum;
	}

	/**
	 * @return the systemRfcsUhrzei
	 */
	public Date getSystemRfcsUhrzei() {
		return systemRfcsUhrzei;
	}

	/**
	 * @param systemRfcsUhrzei the systemRfcsUhrzei to set
	 */
	public void setSystemRfcsUhrzei(Date systemRfcsUhrzei) {
		this.systemRfcsUhrzei = systemRfcsUhrzei;
	}

	/**
	 * @return the capacity
	 */
	public Capacity getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(Capacity capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the lineSegment
	 */
	public LineSegment getLineSegment() {
		return lineSegment;
	}

	/**
	 * @param lineSegment the lineSegment to set
	 */
	public void setLineSegment(LineSegment lineSegment) {
		this.lineSegment = lineSegment;
	}

	}
