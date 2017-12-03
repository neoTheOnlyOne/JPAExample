package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="IH_ROUTING_SECTION")
public class InhouseRoutingSection implements Serializable {
	@Id
	@Column(name="OID_IH_ROUTING_SEC")
	private Long id;

	@Column(name="RT_CROSSOVER")
	private String crossover;

	@Column(name="RT_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="RT_DIRECTION")
	private String direction;

	@Column(name="RT_MEDIA_NO")
	private Long mediaNo;

	@Column(name="RT_SECTION_NO")
	private Long sectionNo;

	@Column(name="RT_TYPE_OF_CONNECTION")
	private String typeOfConnection;

	@Column(name="RT_TYPE_OF_WIRING")
	private String typeOfWiring;

	@Column(name="RT_UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_FUEHRUNGSABSOID")
	private RoutingSection routingSection;

	@ManyToMany
	@JoinTable(name="WIRD_GESCHALTET",
		joinColumns=@JoinColumn(name="FK_IH_ROUTING_SOID_IH_ROUTING"),
		inverseJoinColumns=@JoinColumn(name="FK_WIRING_UNITOID_WIRING_UNIT"))
	private Set<WiringUnit> wiringUnits;

	@ManyToMany
	@JoinTable(name="BESCHALTET_MAX_2",
		joinColumns=@JoinColumn(name="FK_IH_ROUTING_SOID_IH_ROUTING"),
		inverseJoinColumns=@JoinColumn(name="FK_TRANSITION_UOID_TU_POINT"))
	private Set<TransitionUnitPoint> transitionUnitPoints;

	@ManyToMany(mappedBy="inhouseRoutingSections")
	private Set<Connector> connectors;

	@ManyToMany(mappedBy="inhouseRoutingSections")
	private Set<DistributorPoint> distributorPoints;

	private static final long serialVersionUID = 1L;

	public InhouseRoutingSection() {
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
	 * @return the crossover
	 */
	public String getCrossover() {
		return crossover;
	}

	/**
	 * @param crossover the crossover to set
	 */
	public void setCrossover(String crossover) {
		this.crossover = crossover;
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
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * @param direction the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * @return the mediaNo
	 */
	public Long getMediaNo() {
		return mediaNo;
	}

	/**
	 * @param mediaNo the mediaNo to set
	 */
	public void setMediaNo(Long mediaNo) {
		this.mediaNo = mediaNo;
	}

	/**
	 * @return the sectionNo
	 */
	public Long getSectionNo() {
		return sectionNo;
	}

	/**
	 * @param sectionNo the sectionNo to set
	 */
	public void setSectionNo(Long sectionNo) {
		this.sectionNo = sectionNo;
	}

	/**
	 * @return the typeOfConnection
	 */
	public String getTypeOfConnection() {
		return typeOfConnection;
	}

	/**
	 * @param typeOfConnection the typeOfConnection to set
	 */
	public void setTypeOfConnection(String typeOfConnection) {
		this.typeOfConnection = typeOfConnection;
	}

	/**
	 * @return the typeOfWiring
	 */
	public String getTypeOfWiring() {
		return typeOfWiring;
	}

	/**
	 * @param typeOfWiring the typeOfWiring to set
	 */
	public void setTypeOfWiring(String typeOfWiring) {
		this.typeOfWiring = typeOfWiring;
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
	 * @return the routingSection
	 */
	public RoutingSection getRoutingSection() {
		return routingSection;
	}

	/**
	 * @param routingSection the routingSection to set
	 */
	public void setRoutingSection(RoutingSection routingSection) {
		this.routingSection = routingSection;
	}

	/**
	 * @return the wiringUnits
	 */
	public Set<WiringUnit> getWiringUnits() {
		return wiringUnits;
	}

	/**
	 * @param wiringUnits the wiringUnits to set
	 */
	public void setWiringUnits(Set<WiringUnit> wiringUnits) {
		this.wiringUnits = wiringUnits;
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
