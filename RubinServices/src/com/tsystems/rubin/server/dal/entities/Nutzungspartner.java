package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Nutzungspartner implements Serializable {
	@Id
	@Column(name="OID_NUTZUNGSPARTNE")
	private Long id;

	@Column(name="BEARBEITERKENNUNG")
	private String userId;

	@Column(name="LETZTE_AKTUALISIER")
	private Date lastUpdate;

	private String nutzungspartnernot;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CARRIEROID_CARR")
	private Carrier carrier;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK0CARRIEROID_CARR")
	private Carrier carrier0;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_NUTZUNGSRECHOID")
	private Nutzungsrechte nutzungsrechte;

	@OneToMany(mappedBy="nutzungspartner")
	private Set<Nutzungskontingent> nutzungskontingents;

	private static final long serialVersionUID = 1L;

	public Nutzungspartner() {
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
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the lastUpdate
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * @param lastUpdate the lastUpdate to set
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * @return the nutzungspartnernot
	 */
	public String getNutzungspartnernot() {
		return nutzungspartnernot;
	}

	/**
	 * @param nutzungspartnernot the nutzungspartnernot to set
	 */
	public void setNutzungspartnernot(String nutzungspartnernot) {
		this.nutzungspartnernot = nutzungspartnernot;
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
	 * @return the carrier0
	 */
	public Carrier getCarrier0() {
		return carrier0;
	}

	/**
	 * @param carrier0 the carrier0 to set
	 */
	public void setCarrier0(Carrier carrier0) {
		this.carrier0 = carrier0;
	}

	/**
	 * @return the nutzungsrechte
	 */
	public Nutzungsrechte getNutzungsrechte() {
		return nutzungsrechte;
	}

	/**
	 * @param nutzungsrechte the nutzungsrechte to set
	 */
	public void setNutzungsrechte(Nutzungsrechte nutzungsrechte) {
		this.nutzungsrechte = nutzungsrechte;
	}

	/**
	 * @return the nutzungskontingents
	 */
	public Set<Nutzungskontingent> getNutzungskontingents() {
		return nutzungskontingents;
	}

	/**
	 * @param nutzungskontingents the nutzungskontingents to set
	 */
	public void setNutzungskontingents(Set<Nutzungskontingent> nutzungskontingents) {
		this.nutzungskontingents = nutzungskontingents;
	}

}
