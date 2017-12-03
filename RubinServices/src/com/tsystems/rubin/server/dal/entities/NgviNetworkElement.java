package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
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
@Table(name="NGVI_NETWORK_ELEMENT")
public class NgviNetworkElement implements Serializable {
	@Id
	@Column(name = "OID")
	private Long id;

	@Column(name="CHASSIS_ID")
	private String chassisId;

	@Column(name="EQ_TYPE")
	private String eqType;

	@Column(name="FK_EQUIPMENTOID_EQUIPMENT")
	private Long fkEquipmentoidEquipment;

	private String location;

	@Column(name="NE_NAME")
	private String name;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_NGVI_NE_TYPEOID")
	private NgviNeType ngviNeType;

	@OneToMany(mappedBy="ngviNetworkElement")
	private Set<NgviSlot> ngviSlots;

	private static final long serialVersionUID = 1L;

	public NgviNetworkElement() {
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
	 * @return the chassisId
	 */
	public String getChassisId() {
		return chassisId;
	}

	/**
	 * @param chassisId the chassisId to set
	 */
	public void setChassisId(String chassisId) {
		this.chassisId = chassisId;
	}

	/**
	 * @return the eqType
	 */
	public String getEqType() {
		return eqType;
	}

	/**
	 * @param eqType the eqType to set
	 */
	public void setEqType(String eqType) {
		this.eqType = eqType;
	}

	/**
	 * @return the fkEquipmentoidEquipment
	 */
	public Long getFkEquipmentoidEquipment() {
		return fkEquipmentoidEquipment;
	}

	/**
	 * @param fkEquipmentoidEquipment the fkEquipmentoidEquipment to set
	 */
	public void setFkEquipmentoidEquipment(Long fkEquipmentoidEquipment) {
		this.fkEquipmentoidEquipment = fkEquipmentoidEquipment;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the ngviNeType
	 */
	public NgviNeType getNgviNeType() {
		return ngviNeType;
	}

	/**
	 * @param ngviNeType the ngviNeType to set
	 */
	public void setNgviNeType(NgviNeType ngviNeType) {
		this.ngviNeType = ngviNeType;
	}

	/**
	 * @return the ngviSlots
	 */
	public Set<NgviSlot> getNgviSlots() {
		return ngviSlots;
	}

	/**
	 * @param ngviSlots the ngviSlots to set
	 */
	public void setNgviSlots(Set<NgviSlot> ngviSlots) {
		this.ngviSlots = ngviSlots;
	}

}
