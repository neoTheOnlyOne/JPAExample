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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DISTRIBUTOR_F_TYPE")
public class DistributorFType implements Serializable {
	@Id
	@Column(name="OID_DISTRIBUTOR_TY")
	private Long id;

	@Column(name="DIT_CONNECTOR")
	private String connector;

	@Column(name="DIT_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="DIT_DESIGNATION")
	private String designation;

	@Column(name="DIT_DESIGNATION_SU")
	private String designationSearch;

	@Column(name="DIT_DP_DESIGNATION")
	private String dpDesignation;

	@Column(name="DIT_FORM_FACTOR")
	private String formFactor;

	@Column(name="DIT_HAS_COLUMNS")
	private String hasColumns;

	@Column(name="DIT_MANUFACTURER_O")
	private String manufacturerO;

	@Column(name="DIT_NO_OF_DPS")
	private Long noOfDps;

	@Column(name="DIT_PHOTO")
	private String photo;

	@Column(name="DIT_REMARK")
	private String remark;

	@Column(name="DIT_SAP_NO")
	private Long sapNo;

	@Column(name="DIT_TYPE")
	private String type;

	@Column(name="DIT_UPDATE_BY")
	private String updateBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_MANUFACTUREROID")
	private Manufacturer manufacturer;

	@OneToMany(mappedBy="distributorFType")
	private Set<DistributorFrame> distributorFrames;

	@ManyToMany(mappedBy="distributorFTypes")
	private Set<DistributorElemen> distributorElemens;

	private static final long serialVersionUID = 1L;

	public DistributorFType() {
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
	 * @return the connector
	 */
	public String getConnector() {
		return connector;
	}

	/**
	 * @param connector the connector to set
	 */
	public void setConnector(String connector) {
		this.connector = connector;
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
	 * @return the dpDesignation
	 */
	public String getDpDesignation() {
		return dpDesignation;
	}

	/**
	 * @param dpDesignation the dpDesignation to set
	 */
	public void setDpDesignation(String dpDesignation) {
		this.dpDesignation = dpDesignation;
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
	 * @return the hasColumns
	 */
	public String getHasColumns() {
		return hasColumns;
	}

	/**
	 * @param hasColumns the hasColumns to set
	 */
	public void setHasColumns(String hasColumns) {
		this.hasColumns = hasColumns;
	}

	/**
	 * @return the manufacturerO
	 */
	public String getManufacturerO() {
		return manufacturerO;
	}

	/**
	 * @param manufacturerO the manufacturerO to set
	 */
	public void setManufacturerO(String manufacturerO) {
		this.manufacturerO = manufacturerO;
	}

	/**
	 * @return the noOfDps
	 */
	public Long getNoOfDps() {
		return noOfDps;
	}

	/**
	 * @param noOfDps the noOfDps to set
	 */
	public void setNoOfDps(Long noOfDps) {
		this.noOfDps = noOfDps;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the updateBy
	 */
	public String getUpdateBy() {
		return updateBy;
	}

	/**
	 * @param updateBy the updateBy to set
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
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
	 * @return the distributorFrames
	 */
	public Set<DistributorFrame> getDistributorFrames() {
		return distributorFrames;
	}

	/**
	 * @param distributorFrames the distributorFrames to set
	 */
	public void setDistributorFrames(Set<DistributorFrame> distributorFrames) {
		this.distributorFrames = distributorFrames;
	}

	/**
	 * @return the distributorElemens
	 */
	public Set<DistributorElemen> getDistributorElemens() {
		return distributorElemens;
	}

	/**
	 * @param distributorElemens the distributorElemens to set
	 */
	public void setDistributorElemens(Set<DistributorElemen> distributorElemens) {
		this.distributorElemens = distributorElemens;
	}

}
