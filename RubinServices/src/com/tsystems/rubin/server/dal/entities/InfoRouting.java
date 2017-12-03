package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INFO_FUEHRUNG")
public class InfoRouting implements Serializable {
	@Id
	@Column(name="FUEHRUNG_ID")
	private Long id;

	private Date erledigung;

	@Column(name="F_BEGINN")
	private Date begin;

	@Column(name="F_ENDE")
	private Date end;

	@Column(name="FK_VERBINDUNG")
	private Long fkVerbindung;

	@Column(name="G_BREITE_1")
	private String gBreite1;

	@Column(name="G_BREITE_2")
	private String gBreite2;

	@Column(name="G_BSZ_1")
	private String gBsz1;

	@Column(name="G_BSZ_2")
	private String gBsz2;

	@Column(name="G_KURZBEZ_1")
	private String gKurzbez1;

	@Column(name="G_KURZBEZ_2")
	private String gKurzbez2;

	@Column(name="G_LAENGE_1")
	private String gLaenge1;

	@Column(name="G_LAENGE_2")
	private String gLaenge2;

	@Column(name="GRENZUEBERGANG_1")
	private String grenzuebergang1;

	@Column(name="GRENZUEBERGANG_2")
	private String grenzuebergang2;

	@Column(name="KM_GESAMT")
	private Long kmGesamt;

	@Column(name="KM_GRENZE")
	private Long kmGrenze;

	private String planung;

	private String restoration;

	@Column(name="ROUTING_OK")
	private String routingOk;

	private String schaltmassnahme;

	private Date solltermin;

	private static final long serialVersionUID = 1L;

	public InfoRouting() {
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
	 * @return the erledigung
	 */
	public Date getErledigung() {
		return erledigung;
	}

	/**
	 * @param erledigung the erledigung to set
	 */
	public void setErledigung(Date erledigung) {
		this.erledigung = erledigung;
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
	 * @return the fkVerbindung
	 */
	public Long getFkVerbindung() {
		return fkVerbindung;
	}

	/**
	 * @param fkVerbindung the fkVerbindung to set
	 */
	public void setFkVerbindung(Long fkVerbindung) {
		this.fkVerbindung = fkVerbindung;
	}

	/**
	 * @return the gBreite1
	 */
	public String getGBreite1() {
		return gBreite1;
	}

	/**
	 * @param breite1 the gBreite1 to set
	 */
	public void setGBreite1(String breite1) {
		gBreite1 = breite1;
	}

	/**
	 * @return the gBreite2
	 */
	public String getGBreite2() {
		return gBreite2;
	}

	/**
	 * @param breite2 the gBreite2 to set
	 */
	public void setGBreite2(String breite2) {
		gBreite2 = breite2;
	}

	/**
	 * @return the gBsz1
	 */
	public String getGBsz1() {
		return gBsz1;
	}

	/**
	 * @param bsz1 the gBsz1 to set
	 */
	public void setGBsz1(String bsz1) {
		gBsz1 = bsz1;
	}

	/**
	 * @return the gBsz2
	 */
	public String getGBsz2() {
		return gBsz2;
	}

	/**
	 * @param bsz2 the gBsz2 to set
	 */
	public void setGBsz2(String bsz2) {
		gBsz2 = bsz2;
	}

	/**
	 * @return the gKurzbez1
	 */
	public String getGKurzbez1() {
		return gKurzbez1;
	}

	/**
	 * @param kurzbez1 the gKurzbez1 to set
	 */
	public void setGKurzbez1(String kurzbez1) {
		gKurzbez1 = kurzbez1;
	}

	/**
	 * @return the gKurzbez2
	 */
	public String getGKurzbez2() {
		return gKurzbez2;
	}

	/**
	 * @param kurzbez2 the gKurzbez2 to set
	 */
	public void setGKurzbez2(String kurzbez2) {
		gKurzbez2 = kurzbez2;
	}

	/**
	 * @return the gLaenge1
	 */
	public String getGLaenge1() {
		return gLaenge1;
	}

	/**
	 * @param laenge1 the gLaenge1 to set
	 */
	public void setGLaenge1(String laenge1) {
		gLaenge1 = laenge1;
	}

	/**
	 * @return the gLaenge2
	 */
	public String getGLaenge2() {
		return gLaenge2;
	}

	/**
	 * @param laenge2 the gLaenge2 to set
	 */
	public void setGLaenge2(String laenge2) {
		gLaenge2 = laenge2;
	}

	/**
	 * @return the grenzuebergang1
	 */
	public String getGrenzuebergang1() {
		return grenzuebergang1;
	}

	/**
	 * @param grenzuebergang1 the grenzuebergang1 to set
	 */
	public void setGrenzuebergang1(String grenzuebergang1) {
		this.grenzuebergang1 = grenzuebergang1;
	}

	/**
	 * @return the grenzuebergang2
	 */
	public String getGrenzuebergang2() {
		return grenzuebergang2;
	}

	/**
	 * @param grenzuebergang2 the grenzuebergang2 to set
	 */
	public void setGrenzuebergang2(String grenzuebergang2) {
		this.grenzuebergang2 = grenzuebergang2;
	}

	/**
	 * @return the kmGesamt
	 */
	public Long getKmGesamt() {
		return kmGesamt;
	}

	/**
	 * @param kmGesamt the kmGesamt to set
	 */
	public void setKmGesamt(Long kmGesamt) {
		this.kmGesamt = kmGesamt;
	}

	/**
	 * @return the kmGrenze
	 */
	public Long getKmGrenze() {
		return kmGrenze;
	}

	/**
	 * @param kmGrenze the kmGrenze to set
	 */
	public void setKmGrenze(Long kmGrenze) {
		this.kmGrenze = kmGrenze;
	}

	/**
	 * @return the planung
	 */
	public String getPlanung() {
		return planung;
	}

	/**
	 * @param planung the planung to set
	 */
	public void setPlanung(String planung) {
		this.planung = planung;
	}

	/**
	 * @return the restoration
	 */
	public String getRestoration() {
		return restoration;
	}

	/**
	 * @param restoration the restoration to set
	 */
	public void setRestoration(String restoration) {
		this.restoration = restoration;
	}

	/**
	 * @return the routingOk
	 */
	public String getRoutingOk() {
		return routingOk;
	}

	/**
	 * @param routingOk the routingOk to set
	 */
	public void setRoutingOk(String routingOk) {
		this.routingOk = routingOk;
	}

	/**
	 * @return the schaltmassnahme
	 */
	public String getSchaltmassnahme() {
		return schaltmassnahme;
	}

	/**
	 * @param schaltmassnahme the schaltmassnahme to set
	 */
	public void setSchaltmassnahme(String schaltmassnahme) {
		this.schaltmassnahme = schaltmassnahme;
	}

	/**
	 * @return the solltermin
	 */
	public Date getSolltermin() {
		return solltermin;
	}

	/**
	 * @param solltermin the solltermin to set
	 */
	public void setSolltermin(Date solltermin) {
		this.solltermin = solltermin;
	}

}
