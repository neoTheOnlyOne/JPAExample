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
@Table(name="TRANSITION_UNIT_POINT")
public class TransitionUnitPoint implements Serializable {
	@Id
	@Column(name="OID_TU_POINT")
	private Long id;

	@Column(name="TUP_CARRIER_OID")
	private Long carrierId;

	@Column(name="TUP_DESIGNATION")
	private String designation;

	@Column(name="TUP_DIRECTION")
	private String direction;

	@Column(name="TUP_FINISHED_DATE")
	private Date finishedDate;

	@Column(name="TUP_INHOUSE_STATUS")
	private String inhouseStatus;

	@Column(name="TUP_LOCATION")
	private String location;

	@Column(name="TUP_NO_OF_MEDIA_USED")
	private Long noOfMediaUsed;

	@Column(name="TUP_REMARK")
	private String remark;

	@Column(name="TUP_RESERVATION_DATE")
	private Date reservationDate;

	@Column(name="TUP_RESERVATION_STATUS")
	private String reservationStatus;

	@Column(name="TUP_RESERVED_BY")
	private String reservedBy;

	@Column(name="TUP_RESERVED_FOR")
	private String reservedFor;

	@Column(name="TUP_RESERVED_PHONE")
	private String reservedPhone;

	@Column(name="TUP_SORTING_ORDER")
	private Long sortingOrder;

	@Column(name="TUP_STATUS")
	private String status;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSITION_UOID_TRANSITION")
	private TransitionUnit transitionUnit;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID_TRANSPORTVE")
	private Circuit circuit;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WIRING_UNITOID_WIRING_UNIT")
	private WiringUnit wiringUnit;

	@OneToMany(mappedBy="transitionUnitPoint")
	private Set<PpHistory> ppHistories;

	@OneToMany(mappedBy="transitionUnitPoint")
	private Set<WiringUnit> wiringUnits;

	@ManyToMany
	@JoinTable(name="IST_VERDRAHTET_MI0",
		joinColumns=@JoinColumn(name="FK_TRANSITION_UOID_TU_POINT"),
		inverseJoinColumns=@JoinColumn(name="FK_WIREOID_WIRE"))
	private Set<Wire> wires;

	@ManyToMany(mappedBy="transitionUnitPoints")
	private Set<InhouseRoutingSection> inhouseRoutingSections;

	private static final long serialVersionUID = 1L;

	public TransitionUnitPoint() {
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
	 * @return the carrierId
	 */
	public Long getCarrierId() {
		return carrierId;
	}

	/**
	 * @param carrierId the carrierId to set
	 */
	public void setCarrierId(Long carrierId) {
		this.carrierId = carrierId;
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
	 * @return the finishedDate
	 */
	public Date getFinishedDate() {
		return finishedDate;
	}

	/**
	 * @param finishedDate the finishedDate to set
	 */
	public void setFinishedDate(Date finishedDate) {
		this.finishedDate = finishedDate;
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
	 * @return the transitionUnit
	 */
	public TransitionUnit getTransitionUnit() {
		return transitionUnit;
	}

	/**
	 * @param transitionUnit the transitionUnit to set
	 */
	public void setTransitionUnit(TransitionUnit transitionUnit) {
		this.transitionUnit = transitionUnit;
	}

	/**
	 * @return the circuit
	 */
	public Circuit getCircuit() {
		return circuit;
	}

	/**
	 * @param circuit the circuit to set
	 */
	public void setCircuit(Circuit circuit) {
		this.circuit = circuit;
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
