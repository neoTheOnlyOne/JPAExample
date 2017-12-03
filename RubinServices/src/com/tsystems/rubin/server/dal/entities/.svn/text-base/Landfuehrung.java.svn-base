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

@Entity
public class Landfuehrung implements Serializable {
	@Id
	@Column(name="OID_LANDFUEHRUNG")
	private Long id;
	
	@Column(name ="BEARBEITERKENNUNG")
	private String userId;

	private String landfuehrungsnotiz;

	@Column(name="LETZTE_AKTUALISIER")
	private Date lastUpdate;

	@Column(name="WEG_NUMMER")
	private Long wayNumber;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LAND_LAND_BEOID")
	private LandLandBeziehun landLandBeziehun;

	@OneToMany(mappedBy="landfuehrung")
	private Set<Landfuehrungsabsch> landfuehrungsabschs;

	private static final long serialVersionUID = 1L;

	public Landfuehrung() {
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
	 * @return the landfuehrungsnotiz
	 */
	public String getLandfuehrungsnotiz() {
		return landfuehrungsnotiz;
	}

	/**
	 * @param landfuehrungsnotiz the landfuehrungsnotiz to set
	 */
	public void setLandfuehrungsnotiz(String landfuehrungsnotiz) {
		this.landfuehrungsnotiz = landfuehrungsnotiz;
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
	 * @return the wayNumber
	 */
	public Long getWayNumber() {
		return wayNumber;
	}

	/**
	 * @param wayNumber the wayNumber to set
	 */
	public void setWayNumber(Long wayNumber) {
		this.wayNumber = wayNumber;
	}

	/**
	 * @return the landLandBeziehun
	 */
	public LandLandBeziehun getLandLandBeziehun() {
		return landLandBeziehun;
	}

	/**
	 * @param landLandBeziehun the landLandBeziehun to set
	 */
	public void setLandLandBeziehun(LandLandBeziehun landLandBeziehun) {
		this.landLandBeziehun = landLandBeziehun;
	}

	/**
	 * @return the landfuehrungsabschs
	 */
	public Set<Landfuehrungsabsch> getLandfuehrungsabschs() {
		return landfuehrungsabschs;
	}

	/**
	 * @param landfuehrungsabschs the landfuehrungsabschs to set
	 */
	public void setLandfuehrungsabschs(Set<Landfuehrungsabsch> landfuehrungsabschs) {
		this.landfuehrungsabschs = landfuehrungsabschs;
	}

}
