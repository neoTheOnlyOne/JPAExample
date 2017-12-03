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
@Table(name="L_ABSCHNITTKAPAZIT")
public class LAbschnittkapazit implements Serializable {
	@Id
	@Column(name="OID_L_ABSCHNITTKAP")
	private Long id;

	@Column(name="ANZAHL_FASERNPAARE")
	private Long anzahlFasernpaare;

	@Column(name="ANZAHL_KOAXPAARE")
	private Long anzahlKoaxpaare;

	@Column(name="ANZAHL_PDH")
	private String anzahlPdh;

	@Column(name="ANZAHL_RESTORATION")
	private Long anzahlRestoration;

	@Column(name="ANZAHL_SDH")
	private String anzahlSdh;

	@Column(name="DESIGN_CAPACITY_2")
	private String designCapacity2;

	@Column(name="DESIGN_CAPACITY_3")
	private Long designCapacity3;

	@Column(name="DESIGN_CAPACITY_4")
	private String designCapacity4;

	@Column(name="DESIGN_CAPACITY_64")
	private Long designCapacity64;

	private Long herstellungskosten;

	@Column(name="IRU_CAPACITY_DTAG")
	private Long iruCapacityDtag;

	@Column(name="IRU_CAPACITY_VERKA")
	private Long iruCapacityVerka;

	@Column(name="MAINTENANCE_SHARE")
	private Long maintenanceShare;

	@Column(name="NOTIONAL_CAPACITY")
	private Long notionalCapacity;

	@Column(name="NOTIONAL_CAPACITY0")
	private Long notionalCapacity0;

	@Column(name="NOTIONAL_CAPACITY1")
	private Long notionalCapacity1;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LINIENABSCHNOID")
	private LineSegment lineSegments;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WAEHRUNGOID_WAE")
	private Waehrung waehrung;

	private static final long serialVersionUID = 1L;

	public LAbschnittkapazit() {
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
	 * @return the anzahlFasernpaare
	 */
	public Long getAnzahlFasernpaare() {
		return anzahlFasernpaare;
	}

	/**
	 * @param anzahlFasernpaare the anzahlFasernpaare to set
	 */
	public void setAnzahlFasernpaare(Long anzahlFasernpaare) {
		this.anzahlFasernpaare = anzahlFasernpaare;
	}

	/**
	 * @return the anzahlKoaxpaare
	 */
	public Long getAnzahlKoaxpaare() {
		return anzahlKoaxpaare;
	}

	/**
	 * @param anzahlKoaxpaare the anzahlKoaxpaare to set
	 */
	public void setAnzahlKoaxpaare(Long anzahlKoaxpaare) {
		this.anzahlKoaxpaare = anzahlKoaxpaare;
	}

	/**
	 * @return the anzahlPdh
	 */
	public String getAnzahlPdh() {
		return anzahlPdh;
	}

	/**
	 * @param anzahlPdh the anzahlPdh to set
	 */
	public void setAnzahlPdh(String anzahlPdh) {
		this.anzahlPdh = anzahlPdh;
	}

	/**
	 * @return the anzahlRestoration
	 */
	public Long getAnzahlRestoration() {
		return anzahlRestoration;
	}

	/**
	 * @param anzahlRestoration the anzahlRestoration to set
	 */
	public void setAnzahlRestoration(Long anzahlRestoration) {
		this.anzahlRestoration = anzahlRestoration;
	}

	/**
	 * @return the anzahlSdh
	 */
	public String getAnzahlSdh() {
		return anzahlSdh;
	}

	/**
	 * @param anzahlSdh the anzahlSdh to set
	 */
	public void setAnzahlSdh(String anzahlSdh) {
		this.anzahlSdh = anzahlSdh;
	}

	/**
	 * @return the designCapacity2
	 */
	public String getDesignCapacity2() {
		return designCapacity2;
	}

	/**
	 * @param designCapacity2 the designCapacity2 to set
	 */
	public void setDesignCapacity2(String designCapacity2) {
		this.designCapacity2 = designCapacity2;
	}

	/**
	 * @return the designCapacity3
	 */
	public Long getDesignCapacity3() {
		return designCapacity3;
	}

	/**
	 * @param designCapacity3 the designCapacity3 to set
	 */
	public void setDesignCapacity3(Long designCapacity3) {
		this.designCapacity3 = designCapacity3;
	}

	/**
	 * @return the designCapacity4
	 */
	public String getDesignCapacity4() {
		return designCapacity4;
	}

	/**
	 * @param designCapacity4 the designCapacity4 to set
	 */
	public void setDesignCapacity4(String designCapacity4) {
		this.designCapacity4 = designCapacity4;
	}

	/**
	 * @return the designCapacity64
	 */
	public Long getDesignCapacity64() {
		return designCapacity64;
	}

	/**
	 * @param designCapacity64 the designCapacity64 to set
	 */
	public void setDesignCapacity64(Long designCapacity64) {
		this.designCapacity64 = designCapacity64;
	}

	/**
	 * @return the herstellungskosten
	 */
	public Long getHerstellungskosten() {
		return herstellungskosten;
	}

	/**
	 * @param herstellungskosten the herstellungskosten to set
	 */
	public void setHerstellungskosten(Long herstellungskosten) {
		this.herstellungskosten = herstellungskosten;
	}

	/**
	 * @return the iruCapacityDtag
	 */
	public Long getIruCapacityDtag() {
		return iruCapacityDtag;
	}

	/**
	 * @param iruCapacityDtag the iruCapacityDtag to set
	 */
	public void setIruCapacityDtag(Long iruCapacityDtag) {
		this.iruCapacityDtag = iruCapacityDtag;
	}

	/**
	 * @return the iruCapacityVerka
	 */
	public Long getIruCapacityVerka() {
		return iruCapacityVerka;
	}

	/**
	 * @param iruCapacityVerka the iruCapacityVerka to set
	 */
	public void setIruCapacityVerka(Long iruCapacityVerka) {
		this.iruCapacityVerka = iruCapacityVerka;
	}

	/**
	 * @return the maintenanceShare
	 */
	public Long getMaintenanceShare() {
		return maintenanceShare;
	}

	/**
	 * @param maintenanceShare the maintenanceShare to set
	 */
	public void setMaintenanceShare(Long maintenanceShare) {
		this.maintenanceShare = maintenanceShare;
	}

	/**
	 * @return the notionalCapacity
	 */
	public Long getNotionalCapacity() {
		return notionalCapacity;
	}

	/**
	 * @param notionalCapacity the notionalCapacity to set
	 */
	public void setNotionalCapacity(Long notionalCapacity) {
		this.notionalCapacity = notionalCapacity;
	}

	/**
	 * @return the notionalCapacity0
	 */
	public Long getNotionalCapacity0() {
		return notionalCapacity0;
	}

	/**
	 * @param notionalCapacity0 the notionalCapacity0 to set
	 */
	public void setNotionalCapacity0(Long notionalCapacity0) {
		this.notionalCapacity0 = notionalCapacity0;
	}

	/**
	 * @return the notionalCapacity1
	 */
	public Long getNotionalCapacity1() {
		return notionalCapacity1;
	}

	/**
	 * @param notionalCapacity1 the notionalCapacity1 to set
	 */
	public void setNotionalCapacity1(Long notionalCapacity1) {
		this.notionalCapacity1 = notionalCapacity1;
	}

	/**
	 * @return the lineSegments
	 */
	public LineSegment getLineSegments() {
		return lineSegments;
	}

	/**
	 * @param lineSegments the lineSegments to set
	 */
	public void setLineSegments(LineSegment lineSegments) {
		this.lineSegments = lineSegments;
	}

	/**
	 * @return the waehrung
	 */
	public Waehrung getWaehrung() {
		return waehrung;
	}

	/**
	 * @param waehrung the waehrung to set
	 */
	public void setWaehrung(Waehrung waehrung) {
		this.waehrung = waehrung;
	}

}
