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
public class Investition implements Serializable {
	@Id
	@Column(name="OID_INVESTITION")
	private Long id;

	private Long investitionsbetra0;

	private Long investitionsbetrag;

	private Long investitionsjahr;

	private String investitionsnotiz;

	private String investitionsquelle;

	@Column(name="UPDATE_INVESTITION")
	private Date updateInvestition;

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

	public Investition() {
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
	 * @return the investitionsbetra0
	 */
	public Long getInvestitionsbetra0() {
		return investitionsbetra0;
	}

	/**
	 * @param investitionsbetra0 the investitionsbetra0 to set
	 */
	public void setInvestitionsbetra0(Long investitionsbetra0) {
		this.investitionsbetra0 = investitionsbetra0;
	}

	/**
	 * @return the investitionsbetrag
	 */
	public Long getInvestitionsbetrag() {
		return investitionsbetrag;
	}

	/**
	 * @param investitionsbetrag the investitionsbetrag to set
	 */
	public void setInvestitionsbetrag(Long investitionsbetrag) {
		this.investitionsbetrag = investitionsbetrag;
	}

	/**
	 * @return the investitionsjahr
	 */
	public Long getInvestitionsjahr() {
		return investitionsjahr;
	}

	/**
	 * @param investitionsjahr the investitionsjahr to set
	 */
	public void setInvestitionsjahr(Long investitionsjahr) {
		this.investitionsjahr = investitionsjahr;
	}

	/**
	 * @return the investitionsnotiz
	 */
	public String getInvestitionsnotiz() {
		return investitionsnotiz;
	}

	/**
	 * @param investitionsnotiz the investitionsnotiz to set
	 */
	public void setInvestitionsnotiz(String investitionsnotiz) {
		this.investitionsnotiz = investitionsnotiz;
	}

	/**
	 * @return the investitionsquelle
	 */
	public String getInvestitionsquelle() {
		return investitionsquelle;
	}

	/**
	 * @param investitionsquelle the investitionsquelle to set
	 */
	public void setInvestitionsquelle(String investitionsquelle) {
		this.investitionsquelle = investitionsquelle;
	}

	/**
	 * @return the updateInvestition
	 */
	public Date getUpdateInvestition() {
		return updateInvestition;
	}

	/**
	 * @param updateInvestition the updateInvestition to set
	 */
	public void setUpdateInvestition(Date updateInvestition) {
		this.updateInvestition = updateInvestition;
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
