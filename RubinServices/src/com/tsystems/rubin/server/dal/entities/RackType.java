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
@Table(name="RACK_TYPE")
public class RackType implements Serializable {
	@Id
	@Column(name="OID_RACK_TYPE")
	private Long id;

	@Column(name="RT_ABBREVIATION")
	private String abbreviation;

	@Column(name="RT_DATE_LAST_UPDAT")
	private Date dateLastUpdate;

	@Column(name="RT_DESIGNATION")
	private String designation;

	@Column(name="RT_DESIGNATION_SUC")
	private String designationSearch;

	@Column(name="RT_FORM_FACTOR")
	private String formFactor;

	@Column(name="RT_MANUFACTURER")
	private String rtManufacturer;

	@Column(name="RT_MANUFACTURER_OR")
	private String manufacturerOr;

	@Column(name="RT_REMARK")
	private String remark;

	@Column(name="RT_SAP_NO")
	private Long sapNo;

	@Column(name="RT_UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_MANUFACTUREROID")
	private Manufacturer manufacturer;

	@OneToMany(mappedBy="rackType")
	private Set<Rack> racks;

	private static final long serialVersionUID = 1L;

	public RackType() {
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
	 * @return the abbreviation
	 */
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
	 * @param abbreviation the abbreviation to set
	 */
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	/**
	 * @return the dateLastUpdate
	 */
	public Date getDateLastUpdate() {
		return dateLastUpdate;
	}

	/**
	 * @param dateLastUpdate the dateLastUpdate to set
	 */
	public void setDateLastUpdate(Date dateLastUpdate) {
		this.dateLastUpdate = dateLastUpdate;
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
	 * @return the formFactor
	 */
	public String getFormFactor() {
		return formFactor;
	}

	/**
	 * @param formFactor the formFactor to set
	 */
	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}

	/**
	 * @return the rtManufacturer
	 */
	public String getRtManufacturer() {
		return rtManufacturer;
	}

	/**
	 * @param rtManufacturer the rtManufacturer to set
	 */
	public void setRtManufacturer(String rtManufacturer) {
		this.rtManufacturer = rtManufacturer;
	}

	/**
	 * @return the manufacturerOr
	 */
	public String getManufacturerOr() {
		return manufacturerOr;
	}

	/**
	 * @param manufacturerOr the manufacturerOr to set
	 */
	public void setManufacturerOr(String manufacturerOr) {
		this.manufacturerOr = manufacturerOr;
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
	 * @return the sapNo
	 */
	public Long getSapNo() {
		return sapNo;
	}

	/**
	 * @param sapNo the sapNo to set
	 */
	public void setSapNo(Long sapNo) {
		this.sapNo = sapNo;
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
	 * @return the manufacturer
	 */
	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the racks
	 */
	public Set<Rack> getRacks() {
		return racks;
	}

	/**
	 * @param racks the racks to set
	 */
	public void setRacks(Set<Rack> racks) {
		this.racks = racks;
	}


}
