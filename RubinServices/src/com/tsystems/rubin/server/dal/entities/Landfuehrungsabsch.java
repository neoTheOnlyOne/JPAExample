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

@Entity
public class Landfuehrungsabsch implements Serializable {
	@Id
	@Column(name="OID_LANDFUEHRUNGSA")
	private Long id;
	
	@Column(name ="BEARBEITERKENNUNG")
	private String userId;

	private String landfuehrungsabsch;

	@Column(name="LETZTE_AKTUALISIER")
	private Date lastUpdate;

	private Long wegabschnittsnumme;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LANDFUEHRUNGOID")
	private Landfuehrung landfuehrung;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_NUTZUNGSRECHOID")
	private Nutzungsrechte nutzungsrechte;

	private static final long serialVersionUID = 1L;

	public Landfuehrungsabsch() {
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
	 * @return the landfuehrungsabsch
	 */
	public String getLandfuehrungsabsch() {
		return landfuehrungsabsch;
	}

	/**
	 * @param landfuehrungsabsch the landfuehrungsabsch to set
	 */
	public void setLandfuehrungsabsch(String landfuehrungsabsch) {
		this.landfuehrungsabsch = landfuehrungsabsch;
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
	 * @return the wegabschnittsnumme
	 */
	public Long getWegabschnittsnumme() {
		return wegabschnittsnumme;
	}

	/**
	 * @param wegabschnittsnumme the wegabschnittsnumme to set
	 */
	public void setWegabschnittsnumme(Long wegabschnittsnumme) {
		this.wegabschnittsnumme = wegabschnittsnumme;
	}

	/**
	 * @return the landfuehrung
	 */
	public Landfuehrung getLandfuehrung() {
		return landfuehrung;
	}

	/**
	 * @param landfuehrung the landfuehrung to set
	 */
	public void setLandfuehrung(Landfuehrung landfuehrung) {
		this.landfuehrung = landfuehrung;
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

}
