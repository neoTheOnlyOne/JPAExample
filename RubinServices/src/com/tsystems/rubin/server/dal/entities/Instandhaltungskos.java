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
public class Instandhaltungskos implements Serializable {
	@Id
	@Column(name="OID_INSTANDHALTUNG")
	private Long id;

	private Long instandhaltungsbe0;

	private Long instandhaltungsbet;

	private Long instandhaltungsjah;

	private String instandhaltungsko0;

	private String instandhaltungskos;

	@Column(name="UPDATE_IH_KOSTEN_I")
	private Date updateIhKostenI;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SEEKABELVERTOID")
	private Seekabelvertrag seekabelvertrag;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSITOID_TRAN")
	private Transit transit;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WAEHRUNGOID_WAE")
	private Waehrung waehrung;

	private static final long serialVersionUID = 1L;

	public Instandhaltungskos() {
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
	 * @return the instandhaltungsbe0
	 */
	public Long getInstandhaltungsbe0() {
		return instandhaltungsbe0;
	}

	/**
	 * @param instandhaltungsbe0 the instandhaltungsbe0 to set
	 */
	public void setInstandhaltungsbe0(Long instandhaltungsbe0) {
		this.instandhaltungsbe0 = instandhaltungsbe0;
	}

	/**
	 * @return the instandhaltungsbet
	 */
	public Long getInstandhaltungsbet() {
		return instandhaltungsbet;
	}

	/**
	 * @param instandhaltungsbet the instandhaltungsbet to set
	 */
	public void setInstandhaltungsbet(Long instandhaltungsbet) {
		this.instandhaltungsbet = instandhaltungsbet;
	}

	/**
	 * @return the instandhaltungsjah
	 */
	public Long getInstandhaltungsjah() {
		return instandhaltungsjah;
	}

	/**
	 * @param instandhaltungsjah the instandhaltungsjah to set
	 */
	public void setInstandhaltungsjah(Long instandhaltungsjah) {
		this.instandhaltungsjah = instandhaltungsjah;
	}

	/**
	 * @return the instandhaltungsko0
	 */
	public String getInstandhaltungsko0() {
		return instandhaltungsko0;
	}

	/**
	 * @param instandhaltungsko0 the instandhaltungsko0 to set
	 */
	public void setInstandhaltungsko0(String instandhaltungsko0) {
		this.instandhaltungsko0 = instandhaltungsko0;
	}

	/**
	 * @return the instandhaltungskos
	 */
	public String getInstandhaltungskos() {
		return instandhaltungskos;
	}

	/**
	 * @param instandhaltungskos the instandhaltungskos to set
	 */
	public void setInstandhaltungskos(String instandhaltungskos) {
		this.instandhaltungskos = instandhaltungskos;
	}

	/**
	 * @return the updateIhKostenI
	 */
	public Date getUpdateIhKostenI() {
		return updateIhKostenI;
	}

	/**
	 * @param updateIhKostenI the updateIhKostenI to set
	 */
	public void setUpdateIhKostenI(Date updateIhKostenI) {
		this.updateIhKostenI = updateIhKostenI;
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

	/**
	 * @return the transit
	 */
	public Transit getTransit() {
		return transit;
	}

	/**
	 * @param transit the transit to set
	 */
	public void setTransit(Transit transit) {
		this.transit = transit;
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
