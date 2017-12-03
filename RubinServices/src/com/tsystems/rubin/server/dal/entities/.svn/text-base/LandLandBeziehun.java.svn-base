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
import javax.persistence.Table;

@Entity
@Table(name="LAND_LAND_BEZIEHUN")
public class LandLandBeziehun implements Serializable {
	@Id
	@Column(name="OID_LAND_LAND_BEZI")
	private Long id;

	@Column(name ="BEARBEITERKENNUNG")
	private String userId;

	@Column(name="LAND_LANDNOTIZ")
	private String remark;

	@Column(name="LETZTE_AKTUALISIER")
	private Date lastUpdate;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK0LANDOID_LAND")
	private Country country0;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LANDOID_LAND")
	private Country country;

	@OneToMany(mappedBy="landLandBeziehun")
	private Set<Landfuehrung> landfuehrungs;

	private static final long serialVersionUID = 1L;

	public LandLandBeziehun() {
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
	 * @return the country0
	 */
	public Country getCountry0() {
		return country0;
	}

	/**
	 * @param country0 the country0 to set
	 */
	public void setCountry0(Country country0) {
		this.country0 = country0;
	}

	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * @return the landfuehrungs
	 */
	public Set<Landfuehrung> getLandfuehrungs() {
		return landfuehrungs;
	}

	/**
	 * @param landfuehrungs the landfuehrungs to set
	 */
	public void setLandfuehrungs(Set<Landfuehrung> landfuehrungs) {
		this.landfuehrungs = landfuehrungs;
	}


}
