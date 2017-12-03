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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DISTRIBUTOR_POINT")
public class DistributorPoint implements Serializable {
	@Id
	@Column(name="OID_DISTRIBUTOR_PO")
	private Long id;

	@Column(name="DP_CABLE_STATUS")
	private String cableStatus;

	@Column(name="DP_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="DP_DESIGNATION")
	private String designation;

	@Column(name="DP_DIRECT_WIRING_S")
	private String directWiringS;

	@Column(name="DP_DIRECTION")
	private String direction;

	@Column(name="DP_FINISH_DATE")
	private Date finishDate;

	@Column(name="DP_INHOUSE_STATUS")
	private String inhouseStatus;

	@Column(name="DP_NO_OF_MEDIA_USED")
	private Long noOfMediaUsed;

	@Column(name="DP_REMARK")
	private String remark;

	@Column(name="DP_RESERVATION_DATE")
	private Date reservationDate;

	@Column(name="DP_RESERVATION_STATUS")
	private String reservationStatus;

	@Column(name="DP_RESERVED_BY")
	private String reservedBy;

	@Column(name="DP_RESERVED_FOR")
	private String reservedFor;

	@Column(name="DP_RESERVED_PHONE")
	private String reservedPhone;

	@Column(name="DP_SORTING_ORDER")
	private Long sortingOrder;

	@Column(name="DP_STATUS")
	private String status;

	@Column(name="DP_UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_DISTRIBUTOR_OID")
	private DistributorEleme0 distributorEleme0;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_DISTRIBUTOROID")
	private DistributorFrame distributorFrame;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK0DISTRIBUTOR_OID")
	private DistributorPoint distributorPoint;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WIREING_UNITOID_WIREING_UNI")
	private WiringUnit wiringUnit;

	@OneToMany(mappedBy="distributorPoint")
	private Set<PpHistory> ppHistories;

	@OneToMany(mappedBy="distributorPoint")
	private Set<WiringUnit> wiringUnits;

	@OneToMany(mappedBy="distributorPoint")
	private Set<DistributorPoint> distributorPoints;

	@ManyToMany
	@JoinTable(name="IST_VERDRAHTET_MIT",
		joinColumns=@JoinColumn(name="FK_DISTRIBUTOR_OID_DISTRIBUTOR"),
		inverseJoinColumns=@JoinColumn(name="FK_WIREOID_WIRE"))
	private Set<Wire> wires;

	@ManyToMany
	@JoinTable(name="WIRD_BESCHALTET_MI",
		joinColumns=@JoinColumn(name="FK_DISTRIBUTOR_OID_DISTRIBUTOR"),
		inverseJoinColumns=@JoinColumn(name="FK_IH_ROUTING_SOID_IH_ROUTING"))
	private Set<InhouseRoutingSection> inhouseRoutingSections;

	@ManyToMany
	@JoinTable(name="WIRD_BELEGT_A_ODER",
		joinColumns=@JoinColumn(name="FK_DISTRIBUTOR_OID_DISTRIBUTOR"),
		inverseJoinColumns=@JoinColumn(name="FK_IH_CABLE_WIROID_CABLE_WIRE"))
	private Set<IhCableWire> ihCableWires;

	@ManyToMany(mappedBy="distributorPoints")
	private Set<Connector> connectors;

	private static final long serialVersionUID = 1L;

	public DistributorPoint() {
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
	 * @return the cableStatus
	 */
	public String getCableStatus() {
		return cableStatus;
	}

	/**
	 * @param cableStatus the cableStatus to set
	 */
	public void setCableStatus(String cableStatus) {
		this.cableStatus = cableStatus;
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
	 * @return the directWiringS
	 */
	public String getDirectWiringS() {
		return directWiringS;
	}

	/**
	 * @param directWiringS the directWiringS to set
	 */
	public void setDirectWiringS(String directWiringS) {
		this.directWiringS = directWiringS;
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
	 * @return the finishDate
	 */
	public Date getFinishDate() {
		return finishDate;
	}

	/**
	 * @param finishDate the finishDate to set
	 */
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
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
	 * @return the noOfMediaUsed
	 */
	public Long getNoOfMediaUsed() {
		return noOfMediaUsed;
	}

	/**
	 * @param noOfMediaUsed the noOfMediaUsed to set
	 */
	public void setNoOfMediaUsed(Long noOfMediaUsed) {
		this.noOfMediaUsed = noOfMediaUsed;
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
	 * @return the reservationDate
	 */
	public Date getReservationDate() {
		return reservationDate;
	}

	/**
	 * @param reservationDate the reservationDate to set
	 */
	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	/**
	 * @return the reservationStatus
	 */
	public String getReservationStatus() {
		return reservationStatus;
	}

	/**
	 * @param reservationStatus the reservationStatus to set
	 */
	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

	/**
	 * @return the reservedBy
	 */
	public String getReservedBy() {
		return reservedBy;
	}

	/**
	 * @param reservedBy the reservedBy to set
	 */
	public void setReservedBy(String reservedBy) {
		this.reservedBy = reservedBy;
	}

	/**
	 * @return the reservedFor
	 */
	public String getReservedFor() {
		return reservedFor;
	}

	/**
	 * @param reservedFor the reservedFor to set
	 */
	public void setReservedFor(String reservedFor) {
		this.reservedFor = reservedFor;
	}

	/**
	 * @return the reservedPhone
	 */
	public String getReservedPhone() {
		return reservedPhone;
	}

	/**
	 * @param reservedPhone the reservedPhone to set
	 */
	public void setReservedPhone(String reservedPhone) {
		this.reservedPhone = reservedPhone;
	}

	/**
	 * @return the sortingOrder
	 */
	public Long getSortingOrder() {
		return sortingOrder;
	}

	/**
	 * @param sortingOrder the sortingOrder to set
	 */
	public void setSortingOrder(Long sortingOrder) {
		this.sortingOrder = sortingOrder;
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
	 * @return the distributorEleme0
	 */
	public DistributorEleme0 getDistributorEleme0() {
		return distributorEleme0;
	}

	/**
	 * @param distributorEleme0 the distributorEleme0 to set
	 */
	public void setDistributorEleme0(DistributorEleme0 distributorEleme0) {
		this.distributorEleme0 = distributorEleme0;
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
	 * @return the ppHistories
	 */
	public Set<PpHistory> getPpHistories() {
		return ppHistories;
	}

	/**
	 * @param ppHistories the ppHistories to set
	 */
	public void setPpHistories(Set<PpHistory> ppHistories) {
		this.ppHistories = ppHistories;
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

	/**
	 * @return the ihCableWires
	 */
	public Set<IhCableWire> getIhCableWires() {
		return ihCableWires;
	}

	/**
	 * @param ihCableWires the ihCableWires to set
	 */
	public void setIhCableWires(Set<IhCableWire> ihCableWires) {
		this.ihCableWires = ihCableWires;
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

}
