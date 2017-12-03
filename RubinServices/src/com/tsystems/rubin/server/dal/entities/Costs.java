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
public class Costs implements Serializable {
	@Id
	@Column(name="OID_COST")
	private Long id;

	@Column(name="COST_ACTUAL_AMOUNT")
	private Long actualAmount;

	@Column(name="COST_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="COST_RATED_AMOUNT")
	private Long ratedAmount;

	@Column(name="COST_REMARK")
	private String remark;

	@Column(name="COST_UPDATED_BY")
	private String updatedBy;

	@Column(name="COST_YEAR")
	private Long year;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CARDOID_CARD")
	private Card card;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_COST_TYPEOID_CO")
	private CostType costType;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_DISTRIBUTOR_OID")
	private DistributorEleme0 distributorEleme;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_DISTRIBUTOROID")
	private DistributorFrame distributorFrame;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_EQUIPMENTOID_EQ")
	private Equipment equipment;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_IH_CABLEOID_INH")
	private IhCable ihCable;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_RACKOID_RACK")
	private Rack rack;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ROOMOID_ROOM")
	private Room room;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TELEHOUSEOID_TH")
	private Telehouse telehouse;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WAEHRUNGOID_WAE")
	private Waehrung waehrung;

	private static final long serialVersionUID = 1L;

	public Costs() {
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
	 * @return the dateUpdated
	 */
	public Date getDateUpdated() {
		return dateUpdated;
	}

	/**
	 * @param dateUpdated the dateUpdated to set
	 */
	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
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
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
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
	 * @return the card
	 */
	public Card getCard() {
		return card;
	}

	/**
	 * @param card the card to set
	 */
	public void setCard(Card card) {
		this.card = card;
	}

	/**
	 * @return the costType
	 */
	public CostType getCostType() {
		return costType;
	}

	/**
	 * @param costType the costType to set
	 */
	public void setCostType(CostType costType) {
		this.costType = costType;
	}

	/**
	 * @return the distributorEleme
	 */
	public DistributorEleme0 getDistributorEleme() {
		return distributorEleme;
	}

	/**
	 * @param distributorEleme the distributorEleme to set
	 */
	public void setDistributorEleme(DistributorEleme0 distributorEleme) {
		this.distributorEleme = distributorEleme;
	}

	/**
	 * @return the distributorFrame
	 */
	public DistributorFrame getDistributorFrame() {
		return distributorFrame;
	}

	/**
	 * @param distributorFrame the distributorFrame to set
	 */
	public void setDistributorFrame(DistributorFrame distributorFrame) {
		this.distributorFrame = distributorFrame;
	}

	/**
	 * @return the equipment
	 */
	public Equipment getEquipment() {
		return equipment;
	}

	/**
	 * @param equipment the equipment to set
	 */
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	/**
	 * @return the ihCable
	 */
	public IhCable getIhCable() {
		return ihCable;
	}

	/**
	 * @param ihCable the ihCable to set
	 */
	public void setIhCable(IhCable ihCable) {
		this.ihCable = ihCable;
	}

	/**
	 * @return the rack
	 */
	public Rack getRack() {
		return rack;
	}

	/**
	 * @param rack the rack to set
	 */
	public void setRack(Rack rack) {
		this.rack = rack;
	}

	/**
	 * @return the room
	 */
	public Room getRoom() {
		return room;
	}

	/**
	 * @param room the room to set
	 */
	public void setRoom(Room room) {
		this.room = room;
	}

	/**
	 * @return the telehouse
	 */
	public Telehouse getTelehouse() {
		return telehouse;
	}

	/**
	 * @param telehouse the telehouse to set
	 */
	public void setTelehouse(Telehouse telehouse) {
		this.telehouse = telehouse;
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
