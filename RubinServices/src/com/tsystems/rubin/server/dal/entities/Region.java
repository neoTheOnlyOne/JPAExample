package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Region implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="OID_REGION")
	private Long id;

	@Column(name="LETZTE_AKTUALISIER")
	private Date lastUpdate;

	@Column(name="REGIONBEZEICHNUNG")
	private String designation;

	@Column(name="REGIONKENNUNG")
	private String regionId;

	@Column(name="REGIONNOTIZ")
	private String remark;

	@Column(name="REGIONBEZEICHNUNG0")
	private String designationSearch;

	@OneToMany(mappedBy="region")
	private Set<Country> countries;

	@OneToMany(mappedBy = "region")
	private Set<LineSegment> lineSegments;

	@OneToMany(mappedBy="region")
	private Set<Instandhaltungsabk> instandhaltungsabks;
	
	@ManyToMany(mappedBy = "regions")
	private Set<LineSegment> lineSegments2;
	public Region() {
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
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the regionId
	 */
	public String getRegionId() {
		return regionId;
	}
	/**
	 * @param regionId the regionId to set
	 */
	public void setRegionId(String regionId) {
		this.regionId = regionId;
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
	 * @return the designationSearch
	 */
	public String getDesignationSearch() {
		return designationSearch;
	}
	/**
	 * @param designationSearch the designationSearch to set
	 */
	public void setDesignationSearch(String designationSearch) {
		this.designationSearch = designationSearch;
	}
	/**
	 * @return the countries
	 */
	public Set<Country> getCountries() {
		return countries;
	}
	/**
	 * @param countries the countries to set
	 */
	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}
	/**
	 * @return the lineSegments
	 */
	public Set<LineSegment> getLineSegments() {
		return lineSegments;
	}
	/**
	 * @param lineSegments the lineSegments to set
	 */
	public void setLineSegments(Set<LineSegment> lineSegments) {
		this.lineSegments = lineSegments;
	}
	/**
	 * @return the instandhaltungsabks
	 */
	public Set<Instandhaltungsabk> getInstandhaltungsabks() {
		return instandhaltungsabks;
	}
	/**
	 * @param instandhaltungsabks the instandhaltungsabks to set
	 */
	public void setInstandhaltungsabks(Set<Instandhaltungsabk> instandhaltungsabks) {
		this.instandhaltungsabks = instandhaltungsabks;
	}
	/**
	 * @return the lineSegments2
	 */
	public Set<LineSegment> getLineSegments2() {
		return lineSegments2;
	}
	/**
	 * @param lineSegments2 the lineSegments2 to set
	 */
	public void setLineSegments2(Set<LineSegment> lineSegments2) {
		this.lineSegments2 = lineSegments2;
	}

}
