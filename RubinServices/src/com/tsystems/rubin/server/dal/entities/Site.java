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
@Table(name = "GRUNDSTUECK")
public class Site implements Serializable {
	@Id
	@Column(name="OID_GRUNDSTUECK")
	private Long id;

	@Column(name="GEO_BREITE_ZUSATZ")
	private String geographicLongitudeNS;

	@Column(name="GEO_LAENGE_ZUSATZ")
	private String geographicLatitudeWE;

	@Column(name="GEO_BREITE_GRUNDST")
	private Long basicLongitude;

	@Column(name="GEO_LAENGE_GRUNDST")
	private Long basicLatitude;

	@Column(name="GK_HOCH_GRUNDSTUEC")
	private Long gkHochGrundstuec;

	@Column(name="GK_RECHTS_GRUNDSTU")
	private Long gkRechtsGrundstu;

	@Column(name="GK_REMARK")
	private String remark;

	@Column(name="GK_UPDATED_BY")
	private String updatedBy;

	@Column(name="GK_DATE_UPDATED")
	private Date dateUpdated;
	
	@Column(name="GRUNDSTUECKSBEZEIC")
	private String designationInternational;

	@Column(name="GRUNDSTUECKSBEZEI0")
	private String designationNational;

	@Column(name="GRUNDSTUECKSKENNUN")
	private String siteId;
	
	@Column(name="GRUNDSTUECKSKURZBE")
	private String abbreviationInternational;

	@Column(name="GRUNDSTUECKSKURZB0")
	private String abbreviationNational;

	@Column(name="GRUNDSTUECKNOTIZ")
	private String notice;

	@Column(name="HOEHE_UEBER_NN")
	private Long hoeheUeberNn;

	@Column(name="ITU_BEZEICHNUNG")
	private String ituDesignation;

	@Column(name="LETZTE_AKTUALISIER")
	private Date lastUpdate;

	@Column(name="ORBIT_LAGE")
	private String orbitLage;

	@Column(name="ORBIT_LAENGENGRAD")
	private Long orbitLaengengrad;

	@Column(name="GRUNDSTUECKSBEZ_NA")
	private String designationNationalSearch;

	@Column(name="VERBINDUNGSKENNZAHL")
	private String vpz;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_GRUNDSTUECKSOID")
	private SiteType siteType;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ORG_EINHEITOID")
	private Branch branch;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ORTSNETZOID_ORT")
	private City city;

	@OneToMany(mappedBy="site")
	private Set<Telehouse> telehouses;

	@OneToMany(mappedBy="site")
	private Set<Terminal> terminals;

	private static final long serialVersionUID = 1L;

	public Site() {
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
	 * @return the geographicLongitudeNS
	 */
	public String getGeographicLongitudeNS() {
		return geographicLongitudeNS;
	}

	/**
	 * @param geographicLongitudeNS the geographicLongitudeNS to set
	 */
	public void setGeographicLongitudeNS(String geographicLongitudeNS) {
		this.geographicLongitudeNS = geographicLongitudeNS;
	}

	/**
	 * @return the geographicLatitudeWE
	 */
	public String getGeographicLatitudeWE() {
		return geographicLatitudeWE;
	}

	/**
	 * @param geographicLatitudeWE the geographicLatitudeWE to set
	 */
	public void setGeographicLatitudeWE(String geographicLatitudeWE) {
		this.geographicLatitudeWE = geographicLatitudeWE;
	}

	/**
	 * @return the basicLongitude
	 */
	public Long getBasicLongitude() {
		return basicLongitude;
	}

	/**
	 * @param basicLongitude the basicLongitude to set
	 */
	public void setBasicLongitude(Long basicLongitude) {
		this.basicLongitude = basicLongitude;
	}

	/**
	 * @return the basicLatitude
	 */
	public Long getBasicLatitude() {
		return basicLatitude;
	}

	/**
	 * @param basicLatitude the basicLatitude to set
	 */
	public void setBasicLatitude(Long basicLatitude) {
		this.basicLatitude = basicLatitude;
	}

	/**
	 * @return the gkHochGrundstuec
	 */
	public Long getGkHochGrundstuec() {
		return gkHochGrundstuec;
	}

	/**
	 * @param gkHochGrundstuec the gkHochGrundstuec to set
	 */
	public void setGkHochGrundstuec(Long gkHochGrundstuec) {
		this.gkHochGrundstuec = gkHochGrundstuec;
	}

	/**
	 * @return the gkRechtsGrundstu
	 */
	public Long getGkRechtsGrundstu() {
		return gkRechtsGrundstu;
	}

	/**
	 * @param gkRechtsGrundstu the gkRechtsGrundstu to set
	 */
	public void setGkRechtsGrundstu(Long gkRechtsGrundstu) {
		this.gkRechtsGrundstu = gkRechtsGrundstu;
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
	 * @return the designationInternational
	 */
	public String getDesignationInternational() {
		return designationInternational;
	}

	/**
	 * @param designationInternational the designationInternational to set
	 */
	public void setDesignationInternational(String designationInternational) {
		this.designationInternational = designationInternational;
	}

	/**
	 * @return the designationNational
	 */
	public String getDesignationNational() {
		return designationNational;
	}

	/**
	 * @param designationNational the designationNational to set
	 */
	public void setDesignationNational(String designationNational) {
		this.designationNational = designationNational;
	}

	/**
	 * @return the siteId
	 */
	public String getSiteId() {
		return siteId;
	}

	/**
	 * @param siteId the siteId to set
	 */
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	/**
	 * @return the abbreviationInternational
	 */
	public String getAbbreviationInternational() {
		return abbreviationInternational;
	}

	/**
	 * @param abbreviationInternational the abbreviationInternational to set
	 */
	public void setAbbreviationInternational(String abbreviationInternational) {
		this.abbreviationInternational = abbreviationInternational;
	}

	/**
	 * @return the abbreviationNational
	 */
	public String getAbbreviationNational() {
		return abbreviationNational;
	}

	/**
	 * @param abbreviationNational the abbreviationNational to set
	 */
	public void setAbbreviationNational(String abbreviationNational) {
		this.abbreviationNational = abbreviationNational;
	}

	/**
	 * @return the notice
	 */
	public String getNotice() {
		return notice;
	}

	/**
	 * @param notice the notice to set
	 */
	public void setNotice(String notice) {
		this.notice = notice;
	}

	/**
	 * @return the hoeheUeberNn
	 */
	public Long getHoeheUeberNn() {
		return hoeheUeberNn;
	}

	/**
	 * @param hoeheUeberNn the hoeheUeberNn to set
	 */
	public void setHoeheUeberNn(Long hoeheUeberNn) {
		this.hoeheUeberNn = hoeheUeberNn;
	}

	/**
	 * @return the ituDesignation
	 */
	public String getItuDesignation() {
		return ituDesignation;
	}

	/**
	 * @param ituDesignation the ituDesignation to set
	 */
	public void setItuDesignation(String ituDesignation) {
		this.ituDesignation = ituDesignation;
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
	 * @return the orbitLage
	 */
	public String getOrbitLage() {
		return orbitLage;
	}

	/**
	 * @param orbitLage the orbitLage to set
	 */
	public void setOrbitLage(String orbitLage) {
		this.orbitLage = orbitLage;
	}

	/**
	 * @return the orbitLaengengrad
	 */
	public Long getOrbitLaengengrad() {
		return orbitLaengengrad;
	}

	/**
	 * @param orbitLaengengrad the orbitLaengengrad to set
	 */
	public void setOrbitLaengengrad(Long orbitLaengengrad) {
		this.orbitLaengengrad = orbitLaengengrad;
	}

	/**
	 * @return the designationNationalSearch
	 */
	public String getDesignationNationalSearch() {
		return designationNationalSearch;
	}

	/**
	 * @param designationNationalSearch the designationNationalSearch to set
	 */
	public void setDesignationNationalSearch(String designationNationalSearch) {
		this.designationNationalSearch = designationNationalSearch;
	}

	/**
	 * @return the vpz
	 */
	public String getVpz() {
		return vpz;
	}

	/**
	 * @param vpz the vpz to set
	 */
	public void setVpz(String vpz) {
		this.vpz = vpz;
	}

	/**
	 * @return the siteType
	 */
	public SiteType getSiteType() {
		return siteType;
	}

	/**
	 * @param siteType the siteType to set
	 */
	public void setSiteType(SiteType siteType) {
		this.siteType = siteType;
	}

	/**
	 * @return the branch
	 */
	public Branch getBranch() {
		return branch;
	}

	/**
	 * @param branch the branch to set
	 */
	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}

	/**
	 * @return the telehouses
	 */
	public Set<Telehouse> getTelehouses() {
		return telehouses;
	}

	/**
	 * @param telehouses the telehouses to set
	 */
	public void setTelehouses(Set<Telehouse> telehouses) {
		this.telehouses = telehouses;
	}

	/**
	 * @return the terminals
	 */
	public Set<Terminal> getTerminals() {
		return terminals;
	}

	/**
	 * @param terminals the terminals to set
	 */
	public void setTerminals(Set<Terminal> terminals) {
		this.terminals = terminals;
	}

}
