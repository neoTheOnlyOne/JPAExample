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
public class Transitteilmenge implements Serializable {
	@Id
	@Column(name="OID_TRANSITTEILMEN")
	private Long id;

	@Column(name="BEZEICHNUNG_TRANSI")
	private String bezeichnungTransi;

	@Column(name="KOSTEN_PRO_TEILMEN")
	private Long kostenProTeilmen;

	@Column(name="NOTIZ_TEILMENGE")
	private String remark;

	@Column(name="QUANTITAET_TEILMEN")
	private Long quantitaetTeilmen;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KAPAZITAETOID_K")
	private Capacity capacity;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSITOID_TRAN")
	private Transit transit;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WAEHRUNGOID_WAE")
	private Waehrung waehrung;

	private static final long serialVersionUID = 1L;

	public Transitteilmenge() {
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
	 * @return the bezeichnungTransi
	 */
	public String getBezeichnungTransi() {
		return bezeichnungTransi;
	}

	/**
	 * @param bezeichnungTransi the bezeichnungTransi to set
	 */
	public void setBezeichnungTransi(String bezeichnungTransi) {
		this.bezeichnungTransi = bezeichnungTransi;
	}

	/**
	 * @return the kostenProTeilmen
	 */
	public Long getKostenProTeilmen() {
		return kostenProTeilmen;
	}

	/**
	 * @param kostenProTeilmen the kostenProTeilmen to set
	 */
	public void setKostenProTeilmen(Long kostenProTeilmen) {
		this.kostenProTeilmen = kostenProTeilmen;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the quantitaetTeilmen
	 */
	public Long getQuantitaetTeilmen() {
		return quantitaetTeilmen;
	}

	/**
	 * @param quantitaetTeilmen the quantitaetTeilmen to set
	 */
	public void setQuantitaetTeilmen(Long quantitaetTeilmen) {
		this.quantitaetTeilmen = quantitaetTeilmen;
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
