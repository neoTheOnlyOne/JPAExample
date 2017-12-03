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
public class Abfragekriterium implements Serializable {
	@Id
	@Column(name="OID_ABFRAGEKRITERI")
	private Long id;

	private String abfragetext;

	private Long kriteriennummer;

	private Long zeilennummer;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ABFRAGEOID_ABFR")
	private Abfrage abfrage;

	private static final long serialVersionUID = 1L;

	public Abfragekriterium() {
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
	 * @return the abfragetext
	 */
	public String getAbfragetext() {
		return abfragetext;
	}

	/**
	 * @param abfragetext the abfragetext to set
	 */
	public void setAbfragetext(String abfragetext) {
		this.abfragetext = abfragetext;
	}

	/**
	 * @return the kriteriennummer
	 */
	public Long getKriteriennummer() {
		return kriteriennummer;
	}

	/**
	 * @param kriteriennummer the kriteriennummer to set
	 */
	public void setKriteriennummer(Long kriteriennummer) {
		this.kriteriennummer = kriteriennummer;
	}

	/**
	 * @return the zeilennummer
	 */
	public Long getZeilennummer() {
		return zeilennummer;
	}

	/**
	 * @param zeilennummer the zeilennummer to set
	 */
	public void setZeilennummer(Long zeilennummer) {
		this.zeilennummer = zeilennummer;
	}

	/**
	 * @return the abfrage
	 */
	public Abfrage getAbfrage() {
		return abfrage;
	}

	/**
	 * @param abfrage the abfrage to set
	 */
	public void setAbfrage(Abfrage abfrage) {
		this.abfrage = abfrage;
	}


}
