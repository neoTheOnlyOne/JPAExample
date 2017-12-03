package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="IH_CABLE_WIRE")
public class IhCableWire implements Serializable {
	@Id
	@Column(name="OID_CABLE_WIRE")
	private Long id;

	@Column(name="CABLE_WIRE_DATE_UP")
	private Date cableWireDateUp;

	@Column(name="CABLE_WIRE_DESIGNA")
	private String cableWireDesigna;

	@Column(name="CABLE_WIRE_SORTING")
	private Long cableWireSorting;

	@Column(name="CABLE_WIRE_STATUSA")
	private String cableWireStatusa;

	@Column(name="CABLE_WIRE_STATUSB")
	private String cableWireStatusb;

	@Column(name="CABLE_WIRE_UPDATED")
	private String cableWireUpdated;

	@Column(name="FK_IH_CABLEOID_INH")
	private Long fkIhCableoidInh;

	@ManyToMany(mappedBy="ihCableWires")
	private Set<DistributorPoint> distributorPoints;

	private static final long serialVersionUID = 1L;

	public IhCableWire() {
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
	 * @return the cableWireDateUp
	 */
	public Date getCableWireDateUp() {
		return cableWireDateUp;
	}

	/**
	 * @param cableWireDateUp the cableWireDateUp to set
	 */
	public void setCableWireDateUp(Date cableWireDateUp) {
		this.cableWireDateUp = cableWireDateUp;
	}

	/**
	 * @return the cableWireDesigna
	 */
	public String getCableWireDesigna() {
		return cableWireDesigna;
	}

	/**
	 * @param cableWireDesigna the cableWireDesigna to set
	 */
	public void setCableWireDesigna(String cableWireDesigna) {
		this.cableWireDesigna = cableWireDesigna;
	}

	/**
	 * @return the cableWireSorting
	 */
	public Long getCableWireSorting() {
		return cableWireSorting;
	}

	/**
	 * @param cableWireSorting the cableWireSorting to set
	 */
	public void setCableWireSorting(Long cableWireSorting) {
		this.cableWireSorting = cableWireSorting;
	}

	/**
	 * @return the cableWireStatusa
	 */
	public String getCableWireStatusa() {
		return cableWireStatusa;
	}

	/**
	 * @param cableWireStatusa the cableWireStatusa to set
	 */
	public void setCableWireStatusa(String cableWireStatusa) {
		this.cableWireStatusa = cableWireStatusa;
	}

	/**
	 * @return the cableWireStatusb
	 */
	public String getCableWireStatusb() {
		return cableWireStatusb;
	}

	/**
	 * @param cableWireStatusb the cableWireStatusb to set
	 */
	public void setCableWireStatusb(String cableWireStatusb) {
		this.cableWireStatusb = cableWireStatusb;
	}

	/**
	 * @return the cableWireUpdated
	 */
	public String getCableWireUpdated() {
		return cableWireUpdated;
	}

	/**
	 * @param cableWireUpdated the cableWireUpdated to set
	 */
	public void setCableWireUpdated(String cableWireUpdated) {
		this.cableWireUpdated = cableWireUpdated;
	}

	/**
	 * @return the fkIhCableoidInh
	 */
	public Long getFkIhCableoidInh() {
		return fkIhCableoidInh;
	}

	/**
	 * @param fkIhCableoidInh the fkIhCableoidInh to set
	 */
	public void setFkIhCableoidInh(Long fkIhCableoidInh) {
		this.fkIhCableoidInh = fkIhCableoidInh;
	}

	/**
	 * @return the distributorPoints
	 */
	public Set<DistributorPoint> getDistributorPoints() {
		return distributorPoints;
	}

	/**
	 * @param distributorPoints the distributorPoints to set
	 */
	public void setDistributorPoints(Set<DistributorPoint> distributorPoints) {
		this.distributorPoints = distributorPoints;
	}

	
}
