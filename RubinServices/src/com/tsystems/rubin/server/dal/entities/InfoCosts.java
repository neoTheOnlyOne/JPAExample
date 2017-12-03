package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="INFO_COSTS")
public class InfoCosts implements Serializable {
	@Id
	@Column(name="CO_COSTS_ID")
	private Long id;

	@Column(name="CO_ACTUAL_AMOUNT")
	private Long actualAmount;

	@Column(name="CO_CT_ABBREVIATION")
	private String abbreviation;

	@Column(name="CO_CT_DESIGNATION")
	private String designation;

	@Column(name="CO_CT_REMARKS")
	private String remarks;

	@Column(name="CO_RATED_AMOUNT")
	private Long ratedAmount;

	@Column(name="CO_REMARK")
	private String coRemark;

	@Column(name="CO_WA_MONETARY_UN")
	private String coWaMonetaryUn;

	@Column(name="CO_YEAR")
	private Long year;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CO_CARD_FK")
	private InfoCard infoCard;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="CO_DISTRIB_E1_FK", referencedColumnName="DE_DISTRIB_E_ID"),
		@JoinColumn(name="CO_DISTRIB_E2_FK", referencedColumnName="DE_OID_DISTRIBUTOR")
	})
	private InfoDistributorE infoDistributorE;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CO_EQUIPMENT_FK")
	private InfoEquipment infoEquipment;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CO_RACK_FK")
	private InfoRack infoRack;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CO_ROOM_FK")
	private InfoRoom infoRoom;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CO_TELEHOUSE_FK")
	private InfoTelehouse infoTelehouse;

	private static final long serialVersionUID = 1L;

	public InfoCosts() {
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
	 * @return the actualAmount
	 */
	public Long getActualAmount() {
		return actualAmount;
	}

	/**
	 * @param actualAmount the actualAmount to set
	 */
	public void setActualAmount(Long actualAmount) {
		this.actualAmount = actualAmount;
	}

	/**
	 * @return the abbreviation
	 */
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
	 * @param abbreviation the abbreviation to set
	 */
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the ratedAmount
	 */
	public Long getRatedAmount() {
		return ratedAmount;
	}

	/**
	 * @param ratedAmount the ratedAmount to set
	 */
	public void setRatedAmount(Long ratedAmount) {
		this.ratedAmount = ratedAmount;
	}

	/**
	 * @return the coRemark
	 */
	public String getCoRemark() {
		return coRemark;
	}

	/**
	 * @param coRemark the coRemark to set
	 */
	public void setCoRemark(String coRemark) {
		this.coRemark = coRemark;
	}

	/**
	 * @return the coWaMonetaryUn
	 */
	public String getCoWaMonetaryUn() {
		return coWaMonetaryUn;
	}

	/**
	 * @param coWaMonetaryUn the coWaMonetaryUn to set
	 */
	public void setCoWaMonetaryUn(String coWaMonetaryUn) {
		this.coWaMonetaryUn = coWaMonetaryUn;
	}

	/**
	 * @return the year
	 */
	public Long getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(Long year) {
		this.year = year;
	}

	/**
	 * @return the infoCard
	 */
	public InfoCard getInfoCard() {
		return infoCard;
	}

	/**
	 * @param infoCard the infoCard to set
	 */
	public void setInfoCard(InfoCard infoCard) {
		this.infoCard = infoCard;
	}

	/**
	 * @return the infoDistributorE
	 */
	public InfoDistributorE getInfoDistributorE() {
		return infoDistributorE;
	}

	/**
	 * @param infoDistributorE the infoDistributorE to set
	 */
	public void setInfoDistributorE(InfoDistributorE infoDistributorE) {
		this.infoDistributorE = infoDistributorE;
	}

	/**
	 * @return the infoEquipment
	 */
	public InfoEquipment getInfoEquipment() {
		return infoEquipment;
	}

	/**
	 * @param infoEquipment the infoEquipment to set
	 */
	public void setInfoEquipment(InfoEquipment infoEquipment) {
		this.infoEquipment = infoEquipment;
	}

	/**
	 * @return the infoRack
	 */
	public InfoRack getInfoRack() {
		return infoRack;
	}

	/**
	 * @param infoRack the infoRack to set
	 */
	public void setInfoRack(InfoRack infoRack) {
		this.infoRack = infoRack;
	}

	/**
	 * @return the infoRoom
	 */
	public InfoRoom getInfoRoom() {
		return infoRoom;
	}

	/**
	 * @param infoRoom the infoRoom to set
	 */
	public void setInfoRoom(InfoRoom infoRoom) {
		this.infoRoom = infoRoom;
	}

	/**
	 * @return the infoTelehouse
	 */
	public InfoTelehouse getInfoTelehouse() {
		return infoTelehouse;
	}

	/**
	 * @param infoTelehouse the infoTelehouse to set
	 */
	public void setInfoTelehouse(InfoTelehouse infoTelehouse) {
		this.infoTelehouse = infoTelehouse;
	}



}
