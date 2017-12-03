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
public class Transitland implements Serializable {
	@Id
	@Column(name="OID_TRANSITLAND")
	private Long id;

	@Column(name="FK_TRANSITOID_TRAN")
	private Long fkTransitoidTran;

	private Long transitdistanz;

	@Column(name ="TRANSITLANDNOTIZ")
	private String remark;

	private Long transitreihung;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LANDOID_LAND")
	private Country country;

	private static final long serialVersionUID = 1L;

	public Transitland() {
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
	 * @return the fkTransitoidTran
	 */
	public Long getFkTransitoidTran() {
		return fkTransitoidTran;
	}

	/**
	 * @param fkTransitoidTran the fkTransitoidTran to set
	 */
	public void setFkTransitoidTran(Long fkTransitoidTran) {
		this.fkTransitoidTran = fkTransitoidTran;
	}

	/**
	 * @return the transitdistanz
	 */
	public Long getTransitdistanz() {
		return transitdistanz;
	}

	/**
	 * @param transitdistanz the transitdistanz to set
	 */
	public void setTransitdistanz(Long transitdistanz) {
		this.transitdistanz = transitdistanz;
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
	 * @return the transitreihung
	 */
	public Long getTransitreihung() {
		return transitreihung;
	}

	/**
	 * @param transitreihung the transitreihung to set
	 */
	public void setTransitreihung(Long transitreihung) {
		this.transitreihung = transitreihung;
	}

	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

}
