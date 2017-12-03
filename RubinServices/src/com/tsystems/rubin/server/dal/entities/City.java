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
@Table(name = "ORTSNETZ")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="OID_ORTSNETZ")
	private Long id;

	@Column(name="LETZTE_AKTUALISIER")
	private Date lastUpdate;

	@Column(name="ORTSNETZBEZEICHNUN")
	private String designationInternational;

	@Column(name="ORTSNETZBEZEICHNU0")
	private String designationNational;

	@Column(name="ORTSNETZKENNUNG")
	private String cityId;

	@Column(name="ORTSNETZKURZBEZEIC")
	private String abbreviationInternational;

	@Column(name="ORTSNETZKURZBEZEI0")
	private String abbreviationNational;

	@Column(name="ORTSNETZNOTIZ")
	private String remark;

	@Column(name="ORTSNETZBEZ_NAT_SU")
	private String ortsnetzbezNatSu;

	@Column(name="NETZKENNZAHL")
	private String nkz;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LANDOID_LAND")
	private Country country;

	@OneToMany(mappedBy="city")
	private Set<Site> sites;

	@OneToMany(mappedBy="city")
	private Set<Customer> customers;

	public City() {
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
	 * @return the cityId
	 */
	public String getCityId() {
		return cityId;
	}

	/**
	 * @param cityId the cityId to set
	 */
	public void setCityId(String cityId) {
		this.cityId = cityId;
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
	 * @return the ortsnetzbezNatSu
	 */
	public String getOrtsnetzbezNatSu() {
		return ortsnetzbezNatSu;
	}

	/**
	 * @param ortsnetzbezNatSu the ortsnetzbezNatSu to set
	 */
	public void setOrtsnetzbezNatSu(String ortsnetzbezNatSu) {
		this.ortsnetzbezNatSu = ortsnetzbezNatSu;
	}

	/**
	 * @return the nkz
	 */
	public String getNkz() {
		return nkz;
	}

	/**
	 * @param nkz the nkz to set
	 */
	public void setNkz(String nkz) {
		this.nkz = nkz;
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
	 * @return the sites
	 */
	public Set<Site> getSites() {
		return sites;
	}

	/**
	 * @param sites the sites to set
	 */
	public void setSites(Set<Site> sites) {
		this.sites = sites;
	}

	/**
	 * @return the customers
	 */
	public Set<Customer> getCustomers() {
		return customers;
	}

	/**
	 * @param customers the customers to set
	 */
	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	
}
