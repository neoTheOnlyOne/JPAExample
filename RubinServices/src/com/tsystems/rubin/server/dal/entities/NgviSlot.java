package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="NGVI_SLOT")
public class NgviSlot implements Serializable {
	@Id
	@Column(name = "OID")
	private Long id;

	@Column(name="FK_CARDOID_CARD")
	private Long fkCardoidCard;

	@Column(name="NGVI_STATUS")
	private String status;

	@Column(name="SLOT_NO")
	private String slotNo;

	@Column(name="UNIT_DESCRIPTION")
	private String unitDescription;

	@Column(name="UNIT_SERIAL_NO")
	private String unitSerialNo;

	@Column(name="UNIT_STATUS")
	private String unitStatus;

	@Column(name="UNIT_TYPE")
	private String unitType;

	@Column(name="UNIT_TYPE_DESIGNATION")
	private String unitTypeDesignation;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_NGVI_NETWORKOID")
	private NgviNetworkElement ngviNetworkElement;

	private static final long serialVersionUID = 1L;

	public NgviSlot() {
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
	 * @return the fkCardoidCard
	 */
	public Long getFkCardoidCard() {
		return fkCardoidCard;
	}

	/**
	 * @param fkCardoidCard the fkCardoidCard to set
	 */
	public void setFkCardoidCard(Long fkCardoidCard) {
		this.fkCardoidCard = fkCardoidCard;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the slotNo
	 */
	public String getSlotNo() {
		return slotNo;
	}

	/**
	 * @param slotNo the slotNo to set
	 */
	public void setSlotNo(String slotNo) {
		this.slotNo = slotNo;
	}

	/**
	 * @return the unitDescription
	 */
	public String getUnitDescription() {
		return unitDescription;
	}

	/**
	 * @param unitDescription the unitDescription to set
	 */
	public void setUnitDescription(String unitDescription) {
		this.unitDescription = unitDescription;
	}

	/**
	 * @return the unitSerialNo
	 */
	public String getUnitSerialNo() {
		return unitSerialNo;
	}

	/**
	 * @param unitSerialNo the unitSerialNo to set
	 */
	public void setUnitSerialNo(String unitSerialNo) {
		this.unitSerialNo = unitSerialNo;
	}

	/**
	 * @return the unitStatus
	 */
	public String getUnitStatus() {
		return unitStatus;
	}

	/**
	 * @param unitStatus the unitStatus to set
	 */
	public void setUnitStatus(String unitStatus) {
		this.unitStatus = unitStatus;
	}

	/**
	 * @return the unitType
	 */
	public String getUnitType() {
		return unitType;
	}

	/**
	 * @param unitType the unitType to set
	 */
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	/**
	 * @return the unitTypeDesignation
	 */
	public String getUnitTypeDesignation() {
		return unitTypeDesignation;
	}

	/**
	 * @param unitTypeDesignation the unitTypeDesignation to set
	 */
	public void setUnitTypeDesignation(String unitTypeDesignation) {
		this.unitTypeDesignation = unitTypeDesignation;
	}

	/**
	 * @return the ngviNetworkElement
	 */
	public NgviNetworkElement getNgviNetworkElement() {
		return ngviNetworkElement;
	}

	/**
	 * @param ngviNetworkElement the ngviNetworkElement to set
	 */
	public void setNgviNetworkElement(NgviNetworkElement ngviNetworkElement) {
		this.ngviNetworkElement = ngviNetworkElement;
	}

}
