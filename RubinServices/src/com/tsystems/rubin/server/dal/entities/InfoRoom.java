package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="INFO_ROOM")
public class InfoRoom implements Serializable {
	@Id
	@Column(name="RO_ROOM_ID")
	private Long id;

	@Column(name="RO_AVAIL_CAPACITY")
	private String availCapacity;

	@Column(name="RO_BUILDING")
	private String building;

	@Column(name="RO_CAPACITY")
	private String capacity;

	@Column(name="RO_COMMUNICATION")
	private String communication;

	@Column(name="RO_DESIGNATION")
	private String designation;

	@Column(name="RO_FLOOR")
	private String floor;

	@Column(name="RO_INFRASTRUCTURE")
	private String infrastructure;

	@Column(name="RO_LAYOUT")
	private String layout;

	@Column(name="RO_REMARK")
	private String remark;

	@Column(name="RO_STRUCTURAL_DATA")
	private String structuralData;

	@Column(name="RO_TECHNIQUE")
	private String technique;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="RO_TELEHOUSE_FK")
	private InfoTelehouse infoTelehouse;

	@OneToMany(mappedBy="infoRoom")
	private Set<InfoCosts> infoCosts;

	private static final long serialVersionUID = 1L;

	public InfoRoom() {
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
	 * @return the availCapacity
	 */
	public String getAvailCapacity() {
		return availCapacity;
	}

	/**
	 * @param availCapacity the availCapacity to set
	 */
	public void setAvailCapacity(String availCapacity) {
		this.availCapacity = availCapacity;
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
	 * @return the infrastructure
	 */
	public String getInfrastructure() {
		return infrastructure;
	}

	/**
	 * @param infrastructure the infrastructure to set
	 */
	public void setInfrastructure(String infrastructure) {
		this.infrastructure = infrastructure;
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

	/**
	 * @return the infoCosts
	 */
	public Set<InfoCosts> getInfoCosts() {
		return infoCosts;
	}

	/**
	 * @param infoCosts the infoCosts to set
	 */
	public void setInfoCosts(Set<InfoCosts> infoCosts) {
		this.infoCosts = infoCosts;
	}

}
