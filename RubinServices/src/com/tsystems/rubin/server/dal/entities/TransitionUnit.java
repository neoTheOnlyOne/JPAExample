package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
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
@Table(name="TRANSITION_UNIT")
public class TransitionUnit implements Serializable {
	@Id
	@Column(name="OID_TRANSITION_UNI")
	private Long id;

	@Column(name="TU_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="TU_DESIGNATION")
	private String designation;

	@Column(name="TU_NOTES")
	private String notes;

	@Column(name="TU_ROOM")
	private String room;

	@Column(name="TU_UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CARRIEROID_CARRIER")
	private Carrier carrier;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ENDPUNKTOID_END")
	private Terminal terminal;

	@OneToMany(mappedBy="transitionUnit")
	private Set<TransitionUnitPoint> transitionUnitPoints;

	@ManyToMany(mappedBy="transitionUnits")
	private Set<Cable> cables;

	private static final long serialVersionUID = 1L;

	public TransitionUnit() {
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
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * @return the room
	 */
	public String getRoom() {
		return room;
	}

	/**
	 * @param room the room to set
	 */
	public void setRoom(String room) {
		this.room = room;
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
	 * @return the carrier
	 */
	public Carrier getCarrier() {
		return carrier;
	}

	/**
	 * @param carrier the carrier to set
	 */
	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
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
	 * @return the cables
	 */
	public Set<Cable> getCables() {
		return cables;
	}

	/**
	 * @param cables the cables to set
	 */
	public void setCables(Set<Cable> cables) {
		this.cables = cables;
	}

}
