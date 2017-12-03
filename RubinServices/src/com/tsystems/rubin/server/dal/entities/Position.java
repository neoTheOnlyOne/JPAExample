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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="POSITION0")
public class Position implements Serializable {
	@Id
	@Column(name="OID_POSITION")
	private Long id;

	@Column(name="POSITION_BESCHALT0")
	private Date switchEndDate;

	@Column(name="POSITION_BESCHALTU")
	private Date switchDateStart;

	@Column(name="POSITION_REIHENFOL")
	private Long sequenceNumber;

	@Column(name="POSITIONSBEZEICHNU")
	private String designation;

	@Column(name="POSITIONSVORMERK")
	private String mark;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KAPAZITAETOID_K")
	private Capacity capacity;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LINIENABSCHNOID")
	private LineSegment lineSegment;

	@OneToMany(mappedBy="position")
	private Set<RoutingSection> routingSections;

	@OneToMany(mappedBy="position")
	private Set<SatPosition> satPositions;

	private static final long serialVersionUID = 1L;

	public Position() {
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
	 * @return the switchEndDate
	 */
	public Date getSwitchEndDate() {
		return switchEndDate;
	}

	/**
	 * @param switchEndDate the switchEndDate to set
	 */
	public void setSwitchEndDate(Date switchEndDate) {
		this.switchEndDate = switchEndDate;
	}

	/**
	 * @return the switchDateStart
	 */
	public Date getSwitchDateStart() {
		return switchDateStart;
	}

	/**
	 * @param switchDateStart the switchDateStart to set
	 */
	public void setSwitchDateStart(Date switchDateStart) {
		this.switchDateStart = switchDateStart;
	}

	/**
	 * @return the sequenceNumber
	 */
	public Long getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * @param sequenceNumber the sequenceNumber to set
	 */
	public void setSequenceNumber(Long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
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
	 * @return the mark
	 */
	public String getMark() {
		return mark;
	}

	/**
	 * @param mark the mark to set
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}

	/**
	 * @return the capacity
	 */
	public Capacity getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(Capacity capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the lineSegment
	 */
	public LineSegment getLineSegment() {
		return lineSegment;
	}

	/**
	 * @param lineSegment the lineSegment to set
	 */
	public void setLineSegment(LineSegment lineSegment) {
		this.lineSegment = lineSegment;
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
	 * @return the satPositions
	 */
	public Set<SatPosition> getSatPositions() {
		return satPositions;
	}

	/**
	 * @param satPositions the satPositions to set
	 */
	public void setSatPositions(Set<SatPosition> satPositions) {
		this.satPositions = satPositions;
	}

}
