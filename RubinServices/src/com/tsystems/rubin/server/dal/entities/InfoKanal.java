package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INFO_KANAL")
public class InfoKanal implements Serializable {
	@Id
	@Column(name="KANAL_ID")
	private Long id;

	@Column(name="FK_BELEGUNG")
	private Long fkBelegung;

	@Column(name="FK_VERBINDUNG")
	private Long fkVerbindung;

	@Column(name="K_BEZEICHNUNG")
	private String kBezeichnung;

	@Column(name="K_KAPAZITAET")
	private String capacity;

	@Column(name="K_REIHENFOLGE")
	private Long sequence;

	@Column(name="K_SPERRE")
	private String kSperre;

	@Column(name="K_VORMERK")
	private String kVormerk;

	@Column(name="K_ZEITSCHLITZ")
	private String timeslot;

	private static final long serialVersionUID = 1L;

	public InfoKanal() {
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
	 * @return the fkBelegung
	 */
	public Long getFkBelegung() {
		return fkBelegung;
	}

	/**
	 * @param fkBelegung the fkBelegung to set
	 */
	public void setFkBelegung(Long fkBelegung) {
		this.fkBelegung = fkBelegung;
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
	 * @return the kBezeichnung
	 */
	public String getKBezeichnung() {
		return kBezeichnung;
	}

	/**
	 * @param bezeichnung the kBezeichnung to set
	 */
	public void setKBezeichnung(String bezeichnung) {
		kBezeichnung = bezeichnung;
	}

	/**
	 * @return the capacity
	 */
	public String getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the sequence
	 */
	public Long getSequence() {
		return sequence;
	}

	/**
	 * @param sequence the sequence to set
	 */
	public void setSequence(Long sequence) {
		this.sequence = sequence;
	}

	/**
	 * @return the kSperre
	 */
	public String getKSperre() {
		return kSperre;
	}

	/**
	 * @param sperre the kSperre to set
	 */
	public void setKSperre(String sperre) {
		kSperre = sperre;
	}

	/**
	 * @return the kVormerk
	 */
	public String getKVormerk() {
		return kVormerk;
	}

	/**
	 * @param vormerk the kVormerk to set
	 */
	public void setKVormerk(String vormerk) {
		kVormerk = vormerk;
	}

	/**
	 * @return the timeslot
	 */
	public String getTimeslot() {
		return timeslot;
	}

	/**
	 * @param timeslot the timeslot to set
	 */
	public void setTimeslot(String timeslot) {
		this.timeslot = timeslot;
	}


}
