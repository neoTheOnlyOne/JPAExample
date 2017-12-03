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

@Entity
public class Vertragsaenderung implements Serializable {
	@Id
	@Column(name="OID_VERTRAGSAENDER")
	private Long id;

	private Long aenderungsnummer;

	@Column(name="DATUM_VERTRAGSAEND")
	private Date datumVertragsaend;

	private String vertragsaenderung0;

	private String vertragsaenderungs;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SEEKABELVERTOID")
	private Seekabelvertrag seekabelvertrag;

	private static final long serialVersionUID = 1L;

	public Vertragsaenderung() {
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
	 * @return the aenderungsnummer
	 */
	public Long getAenderungsnummer() {
		return aenderungsnummer;
	}

	/**
	 * @param aenderungsnummer the aenderungsnummer to set
	 */
	public void setAenderungsnummer(Long aenderungsnummer) {
		this.aenderungsnummer = aenderungsnummer;
	}

	/**
	 * @return the datumVertragsaend
	 */
	public Date getDatumVertragsaend() {
		return datumVertragsaend;
	}

	/**
	 * @param datumVertragsaend the datumVertragsaend to set
	 */
	public void setDatumVertragsaend(Date datumVertragsaend) {
		this.datumVertragsaend = datumVertragsaend;
	}

	/**
	 * @return the vertragsaenderung0
	 */
	public String getVertragsaenderung0() {
		return vertragsaenderung0;
	}

	/**
	 * @param vertragsaenderung0 the vertragsaenderung0 to set
	 */
	public void setVertragsaenderung0(String vertragsaenderung0) {
		this.vertragsaenderung0 = vertragsaenderung0;
	}

	/**
	 * @return the vertragsaenderungs
	 */
	public String getVertragsaenderungs() {
		return vertragsaenderungs;
	}

	/**
	 * @param vertragsaenderungs the vertragsaenderungs to set
	 */
	public void setVertragsaenderungs(String vertragsaenderungs) {
		this.vertragsaenderungs = vertragsaenderungs;
	}

	/**
	 * @return the seekabelvertrag
	 */
	public Seekabelvertrag getSeekabelvertrag() {
		return seekabelvertrag;
	}

	/**
	 * @param seekabelvertrag the seekabelvertrag to set
	 */
	public void setSeekabelvertrag(Seekabelvertrag seekabelvertrag) {
		this.seekabelvertrag = seekabelvertrag;
	}

}
