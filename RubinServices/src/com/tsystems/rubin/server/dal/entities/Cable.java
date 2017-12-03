package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Cable implements Serializable {
	@Id
	@Column(name="OID_CABLE")
	private Long id;

	@Column(name="CB_DESIGNATION")
	private String designation;

	@Column(name="CB_DESIGNATION_SUCH_BSI")
	private String designationSearch;

	@Column(name="CB_WIRING_TYPE")
	private String wiringType;

	@ManyToMany
	@JoinTable(name="IST_ABSCHLUSS_FUE0",
		joinColumns=@JoinColumn(name="FK_CABLEOID_CABLE"),
		inverseJoinColumns=@JoinColumn(name="FK_TRANSITION_UOID_TRANSITION"))
	private Set<TransitionUnit> transitionUnits;

	@ManyToMany
	@JoinTable(name="IST_ABSCHLUSS_FUE1",
		joinColumns=@JoinColumn(name="FK_CABLEOID_CABLE"),
		inverseJoinColumns=@JoinColumn(name="FK_EQUIPMENTOID_EQUIPMENT"))
	private Set<Equipment> equipments;

	@ManyToMany
	@JoinTable(name="IST_ABSCHLUSS_FUER",
		joinColumns=@JoinColumn(name="FK_CABLEOID_CABLE"),
		inverseJoinColumns=@JoinColumn(name="FK_RACKOID_RACK"))
	private Set<Rack> racks;

	private static final long serialVersionUID = 1L;

	public Cable() {
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
	 * @return the designationSearch
	 */
	public String getDesignationSearch() {
		return designationSearch;
	}

	/**
	 * @param designationSearch the designationSearch to set
	 */
	public void setDesignationSearch(String designationSearch) {
		this.designationSearch = designationSearch;
	}

	/**
	 * @return the wiringType
	 */
	public String getWiringType() {
		return wiringType;
	}

	/**
	 * @param wiringType the wiringType to set
	 */
	public void setWiringType(String wiringType) {
		this.wiringType = wiringType;
	}

	/**
	 * @return the transitionUnits
	 */
	public Set<TransitionUnit> getTransitionUnits() {
		return transitionUnits;
	}

	/**
	 * @param transitionUnits the transitionUnits to set
	 */
	public void setTransitionUnits(Set<TransitionUnit> transitionUnits) {
		this.transitionUnits = transitionUnits;
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


}
