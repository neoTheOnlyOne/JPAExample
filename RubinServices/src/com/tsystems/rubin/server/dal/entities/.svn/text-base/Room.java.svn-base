package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Room implements Serializable {
	@Id
	@Column(name="OID_ROOM")
	private Long id;

	@Column(name="ROOM_AVAILABLE_CAP")
	private String availableCap;

	@Column(name="ROOM_BUILDING")
	private String building;

	@Column(name="ROOM_CAPACITY")
	private String capacity;

	@Column(name="ROOM_COMMUNICATION")
	private String communication;

	@Column(name="ROOM_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="ROOM_DESIGNATION")
	private String designation;

	@Column(name="ROOM_FLOOR")
	private String floor;

	@Column(name="ROOM_INFRASTRUCTUR")
	private String infrastructur;

	@Column(name="ROOM_LAYOUT")
	private String layout;

	@Column(name="ROOM_REMARK")
	private String remark;

	@Column(name="ROOM_STRUCTURAL_DA")
	private String structuralData;

	@Column(name="ROOM_TECHNIQUE")
	private String technique;

	@Column(name="ROOM_UPDATED_BY")
	private String updatedBy;

	@Column(name="RUBIN_FOREIGN_KEY")
	private String rubinForeignKey;

	@Column(name="RUBIN_TO_DEL")
	private String rubinToDel;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TELEHOUSEOID_TH")
	private Telehouse telehouse;

	@OneToMany(mappedBy="room")
	private Set<Equipment> equipments;

	@OneToMany(mappedBy="room")
	private Set<NdsSpimsAuftrag> ndsSpimsAuftrags;

	@OneToMany(mappedBy="room")
	private Set<DistributorFrame> distributorFrames;

	@OneToMany(mappedBy="room")
	private Set<Rack> racks;

	@OneToMany(mappedBy="room")
	private Set<Costs> costs;

	private static final long serialVersionUID = 1L;

	public Room() {
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
	 * @return the availableCap
	 */
	public String getAvailableCap() {
		return availableCap;
	}

	/**
	 * @param availableCap the availableCap to set
	 */
	public void setAvailableCap(String availableCap) {
		this.availableCap = availableCap;
	}

	/**
	 * @return the building
	 */
	public String getBuilding() {
		return building;
	}

	/**
	 * @param building the building to set
	 */
	public void setBuilding(String building) {
		this.building = building;
	}

	/**
	 * @return the capacity
	 */
	public String getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the communication
	 */
	public String getCommunication() {
		return communication;
	}

	/**
	 * @param communication the communication to set
	 */
	public void setCommunication(String communication) {
		this.communication = communication;
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
	 * @return the floor
	 */
	public String getFloor() {
		return floor;
	}

	/**
	 * @param floor the floor to set
	 */
	public void setFloor(String floor) {
		this.floor = floor;
	}

	/**
	 * @return the infrastructur
	 */
	public String getInfrastructur() {
		return infrastructur;
	}

	/**
	 * @param infrastructur the infrastructur to set
	 */
	public void setInfrastructur(String infrastructur) {
		this.infrastructur = infrastructur;
	}

	/**
	 * @return the layout
	 */
	public String getLayout() {
		return layout;
	}

	/**
	 * @param layout the layout to set
	 */
	public void setLayout(String layout) {
		this.layout = layout;
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
	 * @return the structuralData
	 */
	public String getStructuralData() {
		return structuralData;
	}

	/**
	 * @param structuralData the structuralData to set
	 */
	public void setStructuralData(String structuralData) {
		this.structuralData = structuralData;
	}

	/**
	 * @return the technique
	 */
	public String getTechnique() {
		return technique;
	}

	/**
	 * @param technique the technique to set
	 */
	public void setTechnique(String technique) {
		this.technique = technique;
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
	 * @return the rubinForeignKey
	 */
	public String getRubinForeignKey() {
		return rubinForeignKey;
	}

	/**
	 * @param rubinForeignKey the rubinForeignKey to set
	 */
	public void setRubinForeignKey(String rubinForeignKey) {
		this.rubinForeignKey = rubinForeignKey;
	}

	/**
	 * @return the rubinToDel
	 */
	public String getRubinToDel() {
		return rubinToDel;
	}

	/**
	 * @param rubinToDel the rubinToDel to set
	 */
	public void setRubinToDel(String rubinToDel) {
		this.rubinToDel = rubinToDel;
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
	 * @return the equipments
	 */
	public Set<Equipment> getEquipments() {
		return equipments;
	}

	/**
	 * @param equipments the equipments to set
	 */
	public void setEquipments(Set<Equipment> equipments) {
		this.equipments = equipments;
	}

	/**
	 * @return the ndsSpimsAuftrags
	 */
	public Set<NdsSpimsAuftrag> getNdsSpimsAuftrags() {
		return ndsSpimsAuftrags;
	}

	/**
	 * @param ndsSpimsAuftrags the ndsSpimsAuftrags to set
	 */
	public void setNdsSpimsAuftrags(Set<NdsSpimsAuftrag> ndsSpimsAuftrags) {
		this.ndsSpimsAuftrags = ndsSpimsAuftrags;
	}

	/**
	 * @return the distributorFrames
	 */
	public Set<DistributorFrame> getDistributorFrames() {
		return distributorFrames;
	}

	/**
	 * @param distributorFrames the distributorFrames to set
	 */
	public void setDistributorFrames(Set<DistributorFrame> distributorFrames) {
		this.distributorFrames = distributorFrames;
	}

	/**
	 * @return the racks
	 */
	public Set<Rack> getRacks() {
		return racks;
	}

	/**
	 * @param racks the racks to set
	 */
	public void setRacks(Set<Rack> racks) {
		this.racks = racks;
	}

	/**
	 * @return the costs
	 */
	public Set<Costs> getCosts() {
		return costs;
	}

	/**
	 * @param costs the costs to set
	 */
	public void setCosts(Set<Costs> costs) {
		this.costs = costs;
	}


}
