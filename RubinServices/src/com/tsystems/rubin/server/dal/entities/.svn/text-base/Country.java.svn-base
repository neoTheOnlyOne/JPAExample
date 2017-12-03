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
@Table(name = "LAND")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="OID_LAND")
	private Long id;

	@Column(name="LANDABKUERZUNG_INT")
	private String internationalAbbreviation;

	@Column(name="LANDABKUERZUNG_NAT")
	private String nationalAbbreviation;

	@Column(name="LANDBEZEICHNUNG_IN")
	private String internationalDesignation;

	@Column(name="LANDBEZEICHNUNG_NA")
	private String nationalDesignation;

	@Column(name="LANDKENNUNG")
	private String countryId;

	@Column(name="LANDKENNUNGZUSATZ")
	private Long countryIdAdditional;

	@Column(name="LANDNOTIZ")
	private String remark;

	@Column(name="LETZTE_AKTUALISIER")
	private Date lastUpdate;

	@Column(name="LANDBEZEICHNUNG_I0")
	private String internationalDesignationSearch;

	@Column(name="LANDBEZEICHNUNG_N0")
	private String nationalDesignationSearch;

	@Column(name="AUSLANDSKENNZAHL")
	private String akz;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_REGIONOID_REGIO")
	private Region region;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WN_ISCCOID_WN_I")
	private WnIscc wnIscc;

	@OneToMany(mappedBy="country")
	private Set<Carrier> carriers;

	@OneToMany(mappedBy="country")
	private Set<City> cities;

	@OneToMany(mappedBy="country")
	private Set<Tunnel> tunnels;
	
	@OneToMany(mappedBy="country0")
	private Set<LandLandBeziehun> landLandBeziehuns;

	@OneToMany(mappedBy="country")
	private Set<LandLandBeziehun> landLandBeziehuns2;

	
	@OneToMany(mappedBy="country")
	private Set<Transitland> transitlands;


	@OneToMany(mappedBy="country")
	private Set<WorkingArea> workingAreas;
	
	
	public Country() {
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
	 * @return the internationalAbbreviation
	 */
	public String getInternationalAbbreviation() {
		return internationalAbbreviation;
	}


	/**
	 * @param internationalAbbreviation the internationalAbbreviation to set
	 */
	public void setInternationalAbbreviation(String internationalAbbreviation) {
		this.internationalAbbreviation = internationalAbbreviation;
	}


	/**
	 * @return the nationalAbbreviation
	 */
	public String getNationalAbbreviation() {
		return nationalAbbreviation;
	}


	/**
	 * @param nationalAbbreviation the nationalAbbreviation to set
	 */
	public void setNationalAbbreviation(String nationalAbbreviation) {
		this.nationalAbbreviation = nationalAbbreviation;
	}


	/**
	 * @return the internationalDesignation
	 */
	public String getInternationalDesignation() {
		return internationalDesignation;
	}


	/**
	 * @param internationalDesignation the internationalDesignation to set
	 */
	public void setInternationalDesignation(String internationalDesignation) {
		this.internationalDesignation = internationalDesignation;
	}


	/**
	 * @return the nationalDesignation
	 */
	public String getNationalDesignation() {
		return nationalDesignation;
	}


	/**
	 * @param nationalDesignation the nationalDesignation to set
	 */
	public void setNationalDesignation(String nationalDesignation) {
		this.nationalDesignation = nationalDesignation;
	}


	/**
	 * @return the countryId
	 */
	public String getCountryId() {
		return countryId;
	}


	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}


	/**
	 * @return the countryIdAdditional
	 */
	public Long getCountryIdAdditional() {
		return countryIdAdditional;
	}


	/**
	 * @param countryIdAdditional the countryIdAdditional to set
	 */
	public void setCountryIdAdditional(Long countryIdAdditional) {
		this.countryIdAdditional = countryIdAdditional;
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
	 * @return the internationalDesignationSearch
	 */
	public String getInternationalDesignationSearch() {
		return internationalDesignationSearch;
	}


	/**
	 * @param internationalDesignationSearch the internationalDesignationSearch to set
	 */
	public void setInternationalDesignationSearch(
			String internationalDesignationSearch) {
		this.internationalDesignationSearch = internationalDesignationSearch;
	}


	/**
	 * @return the nationalDesignationSearch
	 */
	public String getNationalDesignationSearch() {
		return nationalDesignationSearch;
	}


	/**
	 * @param nationalDesignationSearch the nationalDesignationSearch to set
	 */
	public void setNationalDesignationSearch(String nationalDesignationSearch) {
		this.nationalDesignationSearch = nationalDesignationSearch;
	}


	/**
	 * @return the akz
	 */
	public String getAkz() {
		return akz;
	}


	/**
	 * @param akz the akz to set
	 */
	public void setAkz(String akz) {
		this.akz = akz;
	}


	/**
	 * @return the region
	 */
	public Region getRegion() {
		return region;
	}


	/**
	 * @param region the region to set
	 */
	public void setRegion(Region region) {
		this.region = region;
	}


	/**
	 * @return the wnIscc
	 */
	public WnIscc getWnIscc() {
		return wnIscc;
	}


	/**
	 * @param wnIscc the wnIscc to set
	 */
	public void setWnIscc(WnIscc wnIscc) {
		this.wnIscc = wnIscc;
	}


	/**
	 * @return the carriers
	 */
	public Set<Carrier> getCarriers() {
		return carriers;
	}


	/**
	 * @param carriers the carriers to set
	 */
	public void setCarriers(Set<Carrier> carriers) {
		this.carriers = carriers;
	}


	/**
	 * @return the cities
	 */
	public Set<City> getCities() {
		return cities;
	}


	/**
	 * @param cities the cities to set
	 */
	public void setCities(Set<City> cities) {
		this.cities = cities;
	}


	/**
	 * @return the tunnels
	 */
	public Set<Tunnel> getTunnels() {
		return tunnels;
	}


	/**
	 * @param tunnels the tunnels to set
	 */
	public void setTunnels(Set<Tunnel> tunnels) {
		this.tunnels = tunnels;
	}


	/**
	 * @return the landLandBeziehuns
	 */
	public Set<LandLandBeziehun> getLandLandBeziehuns() {
		return landLandBeziehuns;
	}


	/**
	 * @param landLandBeziehuns the landLandBeziehuns to set
	 */
	public void setLandLandBeziehuns(Set<LandLandBeziehun> landLandBeziehuns) {
		this.landLandBeziehuns = landLandBeziehuns;
	}


	/**
	 * @return the landLandBeziehuns2
	 */
	public Set<LandLandBeziehun> getLandLandBeziehuns2() {
		return landLandBeziehuns2;
	}


	/**
	 * @param landLandBeziehuns2 the landLandBeziehuns2 to set
	 */
	public void setLandLandBeziehuns2(Set<LandLandBeziehun> landLandBeziehuns2) {
		this.landLandBeziehuns2 = landLandBeziehuns2;
	}


	/**
	 * @return the transitlands
	 */
	public Set<Transitland> getTransitlands() {
		return transitlands;
	}


	/**
	 * @param transitlands the transitlands to set
	 */
	public void setTransitlands(Set<Transitland> transitlands) {
		this.transitlands = transitlands;
	}


	/**
	 * @return the workingAreas
	 */
	public Set<WorkingArea> getWorkingAreas() {
		return workingAreas;
	}


	/**
	 * @param workingAreas the workingAreas to set
	 */
	public void setWorkingAreas(Set<WorkingArea> workingAreas) {
		this.workingAreas = workingAreas;
	}


}