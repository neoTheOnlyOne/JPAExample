package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="WIRING_UNIT")
public class WiringUnit implements Serializable {
	@Id
	@Column(name="OID_WIRING_UNIT")
	private Long id;

	private String rxused;

	private String txused;

	private String type;

	@Column(name="WU_INHOUSE_STATUS")
	private String wuInhouseStatus;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_DISTRIBUTOR_OID_DISTRIBUTOR")
	private DistributorPoint distributorPoint;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ENDPUNKTOID_ENDPUNKT")
	private Terminal terminal;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_EQUIPMENTOID_EQUIPMENT")
	private Equipment equipment;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSITION_UOID_TRANSITION")
	private TransitionUnitPoint transitionUnitPoint;

	@OneToMany(mappedBy="wiringUnit")
	private Set<Connector> connectors;

	@OneToMany(mappedBy="wiringUnit")
	private Set<TransitionUnitPoint> transitionUnitPoints;

	@OneToMany(mappedBy="wiringUnit")
	private Set<DistributorPoint> distributorPoints;

	@ManyToMany(mappedBy="wiringUnits")
	private Set<RoutingSection> routingSections;

	@ManyToMany(mappedBy="wiringUnits")
	private Set<InhouseRoutingSection> inhouseRoutingSections;

	private static final long serialVersionUID = 1L;

	public WiringUnit() {
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
	 * @return the rxused
	 */
	public String getRxused() {
		return rxused;
	}

	/**
	 * @param rxused the rxused to set
	 */
	public void setRxused(String rxused) {
		this.rxused = rxused;
	}

	/**
	 * @return the txused
	 */
	public String getTxused() {
		return txused;
	}

	/**
	 * @param txused the txused to set
	 */
	public void setTxused(String txused) {
		this.txused = txused;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the wuInhouseStatus
	 */
	public String getWuInhouseStatus() {
		return wuInhouseStatus;
	}

	/**
	 * @param wuInhouseStatus the wuInhouseStatus to set
	 */
	public void setWuInhouseStatus(String wuInhouseStatus) {
		this.wuInhouseStatus = wuInhouseStatus;
	}

	/**
	 * @return the distributorPoint
	 */
	public DistributorPoint getDistributorPoint() {
		return distributorPoint;
	}

	/**
	 * @param distributorPoint the distributorPoint to set
	 */
	public void setDistributorPoint(DistributorPoint distributorPoint) {
		this.distributorPoint = distributorPoint;
	}

	/**
	 * @return the terminal
	 */
	public Terminal getTerminal() {
		return terminal;
	}

	/**
	 * @param terminal the terminal to set
	 */
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
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
	 * @return the transitionUnitPoint
	 */
	public TransitionUnitPoint getTransitionUnitPoint() {
		return transitionUnitPoint;
	}

	/**
	 * @param transitionUnitPoint the transitionUnitPoint to set
	 */
	public void setTransitionUnitPoint(TransitionUnitPoint transitionUnitPoint) {
		this.transitionUnitPoint = transitionUnitPoint;
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
	 * @return the routingSections
	 */
	public Set<RoutingSection> getRoutingSections() {
		return routingSections;
	}

	/**
	 * @param routingSections the routingSections to set
	 */
	public void setRoutingSections(Set<RoutingSection> routingSections) {
		this.routingSections = routingSections;
	}

	/**
	 * @return the inhouseRoutingSections
	 */
	public Set<InhouseRoutingSection> getInhouseRoutingSections() {
		return inhouseRoutingSections;
	}

	/**
	 * @param inhouseRoutingSections the inhouseRoutingSections to set
	 */
	public void setInhouseRoutingSections(
			Set<InhouseRoutingSection> inhouseRoutingSections) {
		this.inhouseRoutingSections = inhouseRoutingSections;
	}

}
