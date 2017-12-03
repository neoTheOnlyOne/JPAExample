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

@Entity
public class Connector implements Serializable {
	@Id
	@Column(name="OID_INTERFACE")
	private Long id;

	@Column(name="IFC_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="IFC_DESIGNATION")
	private String designation;

	@Column(name="IFC_DIRECTION")
	private String direction;

	@Column(name="IFC_INHOUSE_STATUS")
	private String inhouseStatus;

	@Column(name="IFC_NO_OF_MEDIA")
	private Long noOfMedia;

	@Column(name="IFC_REMARK")
	private String remark;

	@Column(name="IFC_STATUS")
	private String status;

	@Column(name="IFC_UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_PORTOID_PORT")
	private Port port;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WIREING_UNITOID_WIREING_UNI")
	private WiringUnit wiringUnit;

	@ManyToMany
	@JoinTable(name="IST_DIREKT_BELEGT",
		joinColumns=@JoinColumn(name="FK_CONNECTOROID_INTERFACE"),
		inverseJoinColumns=@JoinColumn(name="FK_DISTRIBUTOR_OID_DISTRIBUTOR"))
	private Set<DistributorPoint> distributorPoints;

	@ManyToMany
	@JoinTable(name="ENDET_AM",
		joinColumns=@JoinColumn(name="FK_CONNECTOROID_INTERFACE"),
		inverseJoinColumns=@JoinColumn(name="FK_WIREOID_WIRE"))
	private Set<Wire> wires;

	@ManyToMany
	@JoinTable(name="WIRD_BESCHALTET_M0",
		joinColumns=@JoinColumn(name="FK_CONNECTOROID_INTERFACE"),
		inverseJoinColumns=@JoinColumn(name="FK_IH_ROUTING_SOID_IH_ROUTING"))
	private Set<InhouseRoutingSection> inhouseRoutingSections;

	private static final long serialVersionUID = 1L;

	public Connector() {
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
	 * @return the inhouseStatus
	 */
	public String getInhouseStatus() {
		return inhouseStatus;
	}

	/**
	 * @param inhouseStatus the inhouseStatus to set
	 */
	public void setInhouseStatus(String inhouseStatus) {
		this.inhouseStatus = inhouseStatus;
	}

	/**
	 * @return the noOfMedia
	 */
	public Long getNoOfMedia() {
		return noOfMedia;
	}

	/**
	 * @param noOfMedia the noOfMedia to set
	 */
	public void setNoOfMedia(Long noOfMedia) {
		this.noOfMedia = noOfMedia;
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
	 * @return the port
	 */
	public Port getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(Port port) {
		this.port = port;
	}

	/**
	 * @return the wiringUnit
	 */
	public WiringUnit getWiringUnit() {
		return wiringUnit;
	}

	/**
	 * @param wiringUnit the wiringUnit to set
	 */
	public void setWiringUnit(WiringUnit wiringUnit) {
		this.wiringUnit = wiringUnit;
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
	 * @return the wires
	 */
	public Set<Wire> getWires() {
		return wires;
	}

	/**
	 * @param wires the wires to set
	 */
	public void setWires(Set<Wire> wires) {
		this.wires = wires;
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
