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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DISTRIBUTOR_ELEMEN")
public class DistributorElemen implements Serializable {
	@Id
	@Column(name="OID_DISTRIBUTOR_EL")
	private Long id;

	@Column(name="DIET_CONNECTOR")
	private String connector;

	@Column(name="DIET_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="DIET_DESIGNATION")
	private String designation;

	@Column(name="DIET_DESIGNATION_S")
	private String designationS;

	@Column(name="DIET_DP_DESIGNATIO")
	private String dpDesignatio;

	@Column(name="DIET_FORM_FACTOR")
	private String fFormFactor;

	@Column(name="DIET_MANUFACTURER")
	private String manufacturer;

	@Column(name="DIET_NO_OF_DPS")
	private Long noOfDps;

	@Column(name="DIET_PHOTO")
	private String photo;

	@Column(name="DIET_REMARK")
	private String remark;

	@Column(name="DIET_SAP_NO")
	private Long sapNo;

	@Column(name="DIET_TYPE")
	private String type;

	@Column(name="DIET_UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CONNECTOR_TYOID_CONNECTOR_T")
	private ConnectorType connectorType;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_MANUFACTUREROID")
	private Manufacturer manufacturer1;

	@OneToMany(mappedBy="distributorElemen")
	private Set<DistributorEleme0> distributorEleme0s;

	@ManyToMany
	@JoinTable(name="IST_ZUGEORDNET",
		joinColumns=@JoinColumn(name="FK_DISTRIBUTOR_OID"),
		inverseJoinColumns=@JoinColumn(name="FK0DISTRIBUTOR_OID"))
	private Set<DistributorFType> distributorFTypes;

	private static final long serialVersionUID = 1L;

	public DistributorElemen() {
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
	 * @return the designationS
	 */
	public String getDesignationS() {
		return designationS;
	}

	/**
	 * @param designationS the designationS to set
	 */
	public void setDesignationS(String designationS) {
		this.designationS = designationS;
	}

	/**
	 * @return the dpDesignatio
	 */
	public String getDpDesignatio() {
		return dpDesignatio;
	}

	/**
	 * @param dpDesignatio the dpDesignatio to set
	 */
	public void setDpDesignatio(String dpDesignatio) {
		this.dpDesignatio = dpDesignatio;
	}

	/**
	 * @return the fFormFactor
	 */
	public String getFFormFactor() {
		return fFormFactor;
	}

	/**
	 * @param formFactor the fFormFactor to set
	 */
	public void setFFormFactor(String formFactor) {
		fFormFactor = formFactor;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
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
	 * @return the connectorType
	 */
	public ConnectorType getConnectorType() {
		return connectorType;
	}

	/**
	 * @param connectorType the connectorType to set
	 */
	public void setConnectorType(ConnectorType connectorType) {
		this.connectorType = connectorType;
	}

	/**
	 * @return the manufacturer1
	 */
	public Manufacturer getManufacturer1() {
		return manufacturer1;
	}

	/**
	 * @param manufacturer1 the manufacturer1 to set
	 */
	public void setManufacturer1(Manufacturer manufacturer1) {
		this.manufacturer1 = manufacturer1;
	}

	/**
	 * @return the distributorEleme0s
	 */
	public Set<DistributorEleme0> getDistributorEleme0s() {
		return distributorEleme0s;
	}

	/**
	 * @param distributorEleme0s the distributorEleme0s to set
	 */
	public void setDistributorEleme0s(Set<DistributorEleme0> distributorEleme0s) {
		this.distributorEleme0s = distributorEleme0s;
	}

	/**
	 * @return the distributorFTypes
	 */
	public Set<DistributorFType> getDistributorFTypes() {
		return distributorFTypes;
	}

	/**
	 * @param distributorFTypes the distributorFTypes to set
	 */
	public void setDistributorFTypes(Set<DistributorFType> distributorFTypes) {
		this.distributorFTypes = distributorFTypes;
	}

	
}
