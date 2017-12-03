package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Wire implements Serializable {
	@Id
	@Column(name="OID_WIRE")
	private Long id;

	@Column(name="FK_CABLEOID_CABLE")
	private Long fkCableoidCable;

	@Column(name="WIRING_TYPE")
	private String wiringType;

	@ManyToMany(mappedBy="wires")
	private Set<DistributorPoint> distributorPoints;

	@ManyToMany(mappedBy="wires")
	private Set<Connector> connectors;

	@ManyToMany(mappedBy="wires")
	private Set<TransitionUnitPoint> transitionUnitPoints;

	private static final long serialVersionUID = 1L;

	public Wire() {
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
	 * @return the fkCableoidCable
	 */
	public Long getFkCableoidCable() {
		return fkCableoidCable;
	}

	/**
	 * @param fkCableoidCable the fkCableoidCable to set
	 */
	public void setFkCableoidCable(Long fkCableoidCable) {
		this.fkCableoidCable = fkCableoidCable;
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

	/**
	 * @return the connectors
	 */
	public Set<Connector> getConnectors() {
		return connectors;
	}

	/**
	 * @param connectors the connectors to set
	 */
	public void setConnectors(Set<Connector> connectors) {
		this.connectors = connectors;
	}

	/**
	 * @return the transitionUnitPoints
	 */
	public Set<TransitionUnitPoint> getTransitionUnitPoints() {
		return transitionUnitPoints;
	}

	/**
	 * @param transitionUnitPoints the transitionUnitPoints to set
	 */
	public void setTransitionUnitPoints(
			Set<TransitionUnitPoint> transitionUnitPoints) {
		this.transitionUnitPoints = transitionUnitPoints;
	}

}
