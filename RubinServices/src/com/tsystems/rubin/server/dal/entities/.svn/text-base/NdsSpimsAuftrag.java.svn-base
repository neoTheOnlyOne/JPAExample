package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="NDS_SPIMS_AUFTRAG")
public class NdsSpimsAuftrag implements Serializable {
	@Id
	@Column(name ="AUFTRAGSNUMMER")
	private Long id;

	@Column(name ="AUFTRAGSART")
	private String type;

	@Column(name ="AUFTRAGSOBJEKT")
	private String object;

	@Column(name ="AUFTRAGSSTATUS")
	private String status;

	@Column(name ="AUFTRAGSZEIT")
	private Timestamp time;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ROOMOID_ROOM")
	private Room room;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TELEHOUSEOID_TH")
	private Telehouse telehouse;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TH_CONTACTOID_TH_CONTACT")
	private ThContact thContact;

	private static final long serialVersionUID = 1L;

	public NdsSpimsAuftrag() {
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
	 * @return the object
	 */
	public String getObject() {
		return object;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(String object) {
		this.object = object;
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
	 * @return the time
	 */
	public Timestamp getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(Timestamp time) {
		this.time = time;
	}

	/**
	 * @return the room
	 */
	public Room getRoom() {
		return room;
	}

	/**
	 * @param room the room to set
	 */
	public void setRoom(Room room) {
		this.room = room;
	}

	/**
	 * @return the telehouse
	 */
	public Telehouse getTelehouse() {
		return telehouse;
	}

	/**
	 * @param telehouse the telehouse to set
	 */
	public void setTelehouse(Telehouse telehouse) {
		this.telehouse = telehouse;
	}

	/**
	 * @return the thContact
	 */
	public ThContact getThContact() {
		return thContact;
	}

	/**
	 * @param thContact the thContact to set
	 */
	public void setThContact(ThContact thContact) {
		this.thContact = thContact;
	}


}
