package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SLA_PRODUCT")
public class SlaProduct implements Serializable {
	@Id
	@Column(name="SLA_PRODUCT_OID")
	private Long id;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LSZOID_LSZ")
	private Lsc lsc;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LSZ_EXTENSIOOID_EXTENSION")
	private LscExtension lscExtension;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SLASLA_OID")
	private Sla sla;

	private static final long serialVersionUID = 1L;

	public SlaProduct() {
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
	 * @return the lsc
	 */
	public Lsc getLsc() {
		return lsc;
	}

	/**
	 * @param lsc the lsc to set
	 */
	public void setLsc(Lsc lsc) {
		this.lsc = lsc;
	}

	/**
	 * @return the lscExtension
	 */
	public LscExtension getLscExtension() {
		return lscExtension;
	}

	/**
	 * @param lscExtension the lscExtension to set
	 */
	public void setLscExtension(LscExtension lscExtension) {
		this.lscExtension = lscExtension;
	}

	/**
	 * @return the sla
	 */
	public Sla getSla() {
		return sla;
	}

	/**
	 * @param sla the sla to set
	 */
	public void setSla(Sla sla) {
		this.sla = sla;
	}

}
