package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Gremium implements Serializable {
	@Id
	@Column(name="OID_GREMIUM")
	private Long id;

	private String gremiumaktivitaet;

	private String gremiumbezeichnung;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ANSPRECHPARTOID")
	private ContactPerson contactPerson;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SEEKABELVERTOID")
	private Seekabelvertrag seekabelvertrag;

	private static final long serialVersionUID = 1L;

	public Gremium() {
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
	 * @return the gremiumaktivitaet
	 */
	public String getGremiumaktivitaet() {
		return gremiumaktivitaet;
	}

	/**
	 * @param gremiumaktivitaet the gremiumaktivitaet to set
	 */
	public void setGremiumaktivitaet(String gremiumaktivitaet) {
		this.gremiumaktivitaet = gremiumaktivitaet;
	}

	/**
	 * @return the gremiumbezeichnung
	 */
	public String getGremiumbezeichnung() {
		return gremiumbezeichnung;
	}

	/**
	 * @param gremiumbezeichnung the gremiumbezeichnung to set
	 */
	public void setGremiumbezeichnung(String gremiumbezeichnung) {
		this.gremiumbezeichnung = gremiumbezeichnung;
	}

	/**
	 * @return the contactPerson
	 */
	public ContactPerson getContactPerson() {
		return contactPerson;
	}

	/**
	 * @param contactPerson the contactPerson to set
	 */
	public void setContactPerson(ContactPerson contactPerson) {
		this.contactPerson = contactPerson;
	}

	/**
	 * @return the seekabelvertrag
	 */
	public Seekabelvertrag getSeekabelvertrag() {
		return seekabelvertrag;
	}

	/**
	 * @param seekabelvertrag the seekabelvertrag to set
	 */
	public void setSeekabelvertrag(Seekabelvertrag seekabelvertrag) {
		this.seekabelvertrag = seekabelvertrag;
	}


}
