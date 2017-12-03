package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="IRU_NEHMER")
public class IruNehmer implements Serializable {
	@Id
	@Column(name="OID_IRU_NEHMER")
	private Long id;

	@Column(name="ART_IRU_NEHMER")
	private String artIruNehmer;

	@Column(name ="BEARBEITERKENNUNG")
	private String userId;

	@Column(name="FK_NUTZUNGSPARTOID")
	private Long fkNutzungspartoid;

	@Column(name="IRU_NEHMERNOTIZ")
	private String iruNehmernotiz;

	@Column(name="LETZTE_AKTUALISIER")
	private Date lastUpdate;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK0CARRIEROID_CARR")
	private Carrier carrier0;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CARRIEROID_CARR")
	private Carrier carrier;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_NUTZUNGSRECHOID")
	private Nutzungsrechte nutzungsrechte;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WAEHRUNGOID_WAE")
	private Waehrung waehrung;

	private static final long serialVersionUID = 1L;

	public IruNehmer() {
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
	 * @return the artIruNehmer
	 */
	public String getArtIruNehmer() {
		return artIruNehmer;
	}

	/**
	 * @param artIruNehmer the artIruNehmer to set
	 */
	public void setArtIruNehmer(String artIruNehmer) {
		this.artIruNehmer = artIruNehmer;
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
	 * @return the fkNutzungspartoid
	 */
	public Long getFkNutzungspartoid() {
		return fkNutzungspartoid;
	}

	/**
	 * @param fkNutzungspartoid the fkNutzungspartoid to set
	 */
	public void setFkNutzungspartoid(Long fkNutzungspartoid) {
		this.fkNutzungspartoid = fkNutzungspartoid;
	}

	/**
	 * @return the iruNehmernotiz
	 */
	public String getIruNehmernotiz() {
		return iruNehmernotiz;
	}

	/**
	 * @param iruNehmernotiz the iruNehmernotiz to set
	 */
	public void setIruNehmernotiz(String iruNehmernotiz) {
		this.iruNehmernotiz = iruNehmernotiz;
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
	 * @return the waehrung
	 */
	public Waehrung getWaehrung() {
		return waehrung;
	}

	/**
	 * @param waehrung the waehrung to set
	 */
	public void setWaehrung(Waehrung waehrung) {
		this.waehrung = waehrung;
	}


}
