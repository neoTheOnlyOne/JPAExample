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
@Table(name="EQ_TYPE")
public class EqType implements Serializable {
	@Id
	@Column(name="OID_ETYP")
	private Long id;

	@Column(name="ETYP_ABBREVIATION")
	private String abbreviation;

	@Column(name="ETYP_ABBREVIATION0")
	private String abbreviation0;

	@Column(name="ETYP_CHANGED")
	private String changed;

	@Column(name="ETYP_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="ETYP_DESIGNATION")
	private String designation;

	@Column(name="ETYP_EDITED_BY")
	private String editedBy;

	@Column(name="ETYP_FACHSZ_TYPE")
	private String etypFachszType;

	@Column(name="ETYP_FORM_FACTOR")
	private String formFactor;

	@Column(name="ETYP_IFC_DESIGNATI")
	private String ifcDesignation;

	@Column(name="ETYP_INTERFACE_TYP")
	private String interfaceType;

	@Column(name="ETYP_MANUFACTURER")
	private String manufacturer1;

	@Column(name="ETYP_MANUFACTURER0")
	private String manufacturer0;

	@Column(name="ETYP_NO_OF_IFC_INC")
	private Long noOfIfcInc;

	@Column(name="ETYP_NO_OF_IFC_OUT")
	private Long noOfIfcOut;

	@Column(name="ETYP_NUMBER_OF_CAR")
	private Long numberOfCar;

	@Column(name="ETYP_NUMBER_OF_POR")
	private Long numberOfPort;

	@Column(name="ETYP_PHOTO")
	private String photo;

	@Column(name="ETYP_REMARK")
	private String remark;

	@Column(name="ETYP_SAP_NO")
	private Long sapNo;

	@Column(name="ETYP_SPACE_AVAILAB")
	private Long spaceAvailable;

	@Column(name="ETYP_SPACE_REQUIRE")
	private Long spaceRequired;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CONNECTOR_TYOID_CONNECTOR_T")
	private ConnectorType connectorType;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KAPAZITAETOID_KAPAZITAET")
	private Capacity capacity;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_MANUFACTUREROID")
	private Manufacturer manufacturer;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SERVICE_PLATOID")
	private Platform platform;

	@OneToMany(mappedBy="eqType")
	private Set<Equipment> equipments;

	@OneToMany(mappedBy="eqType")
	private Set<CardType> cardTypes;

	@OneToMany(mappedBy="eqType")
	private Set<DesignationSchemes> designationSchemes;

	@ManyToMany
	@JoinTable(name="IST_FUER",
		joinColumns=@JoinColumn(name="FK_EQ_TYPEOID_ETYP"),
		inverseJoinColumns=@JoinColumn(name="FK_LSZOID_LSZ"))
	private Set<Lsc> lscs;

	@ManyToMany(mappedBy="eqTypes")
	private Set<CardType> cardTypes2;

	private static final long serialVersionUID = 1L;

	public EqType() {
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
	 * @return the abbreviation0
	 */
	public String getAbbreviation0() {
		return abbreviation0;
	}

	/**
	 * @param abbreviation0 the abbreviation0 to set
	 */
	public void setAbbreviation0(String abbreviation0) {
		this.abbreviation0 = abbreviation0;
	}

	/**
	 * @return the changed
	 */
	public String getChanged() {
		return changed;
	}

	/**
	 * @param changed the changed to set
	 */
	public void setChanged(String changed) {
		this.changed = changed;
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
	 * @return the editedBy
	 */
	public String getEditedBy() {
		return editedBy;
	}

	/**
	 * @param editedBy the editedBy to set
	 */
	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}

	/**
	 * @return the etypFachszType
	 */
	public String getEtypFachszType() {
		return etypFachszType;
	}

	/**
	 * @param etypFachszType the etypFachszType to set
	 */
	public void setEtypFachszType(String etypFachszType) {
		this.etypFachszType = etypFachszType;
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
	 * @return the ifcDesignation
	 */
	public String getIfcDesignation() {
		return ifcDesignation;
	}

	/**
	 * @param ifcDesignation the ifcDesignation to set
	 */
	public void setIfcDesignation(String ifcDesignation) {
		this.ifcDesignation = ifcDesignation;
	}

	/**
	 * @return the interfaceType
	 */
	public String getInterfaceType() {
		return interfaceType;
	}

	/**
	 * @param interfaceType the interfaceType to set
	 */
	public void setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
	}

	/**
	 * @return the manufacturer1
	 */
	public String getManufacturer1() {
		return manufacturer1;
	}

	/**
	 * @param manufacturer1 the manufacturer1 to set
	 */
	public void setManufacturer1(String manufacturer1) {
		this.manufacturer1 = manufacturer1;
	}

	/**
	 * @return the manufacturer0
	 */
	public String getManufacturer0() {
		return manufacturer0;
	}

	/**
	 * @param manufacturer0 the manufacturer0 to set
	 */
	public void setManufacturer0(String manufacturer0) {
		this.manufacturer0 = manufacturer0;
	}

	/**
	 * @return the noOfIfcInc
	 */
	public Long getNoOfIfcInc() {
		return noOfIfcInc;
	}

	/**
	 * @param noOfIfcInc the noOfIfcInc to set
	 */
	public void setNoOfIfcInc(Long noOfIfcInc) {
		this.noOfIfcInc = noOfIfcInc;
	}

	/**
	 * @return the noOfIfcOut
	 */
	public Long getNoOfIfcOut() {
		return noOfIfcOut;
	}

	/**
	 * @param noOfIfcOut the noOfIfcOut to set
	 */
	public void setNoOfIfcOut(Long noOfIfcOut) {
		this.noOfIfcOut = noOfIfcOut;
	}

	/**
	 * @return the numberOfCar
	 */
	public Long getNumberOfCar() {
		return numberOfCar;
	}

	/**
	 * @param numberOfCar the numberOfCar to set
	 */
	public void setNumberOfCar(Long numberOfCar) {
		this.numberOfCar = numberOfCar;
	}

	/**
	 * @return the numberOfPort
	 */
	public Long getNumberOfPort() {
		return numberOfPort;
	}

	/**
	 * @param numberOfPort the numberOfPort to set
	 */
	public void setNumberOfPort(Long numberOfPort) {
		this.numberOfPort = numberOfPort;
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
	 * @return the spaceAvailable
	 */
	public Long getSpaceAvailable() {
		return spaceAvailable;
	}

	/**
	 * @param spaceAvailable the spaceAvailable to set
	 */
	public void setSpaceAvailable(Long spaceAvailable) {
		this.spaceAvailable = spaceAvailable;
	}

	/**
	 * @return the spaceRequired
	 */
	public Long getSpaceRequired() {
		return spaceRequired;
	}

	/**
	 * @param spaceRequired the spaceRequired to set
	 */
	public void setSpaceRequired(Long spaceRequired) {
		this.spaceRequired = spaceRequired;
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
	 * @return the capacity
	 */
	public Capacity getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(Capacity capacity) {
		this.capacity = capacity;
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
	 * @return the platform
	 */
	public Platform getPlatform() {
		return platform;
	}

	/**
	 * @param platform the platform to set
	 */
	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	/**
	 * @return the equipments
	 */
	public Set<Equipment> getEquipments() {
		return equipments;
	}

	/**
	 * @param equipments the equipments to set
	 */
	public void setEquipments(Set<Equipment> equipments) {
		this.equipments = equipments;
	}

	/**
	 * @return the cardTypes
	 */
	public Set<CardType> getCardTypes() {
		return cardTypes;
	}

	/**
	 * @param cardTypes the cardTypes to set
	 */
	public void setCardTypes(Set<CardType> cardTypes) {
		this.cardTypes = cardTypes;
	}

	/**
	 * @return the designationSchemes
	 */
	public Set<DesignationSchemes> getDesignationSchemes() {
		return designationSchemes;
	}

	/**
	 * @param designationSchemes the designationSchemes to set
	 */
	public void setDesignationSchemes(Set<DesignationSchemes> designationSchemes) {
		this.designationSchemes = designationSchemes;
	}

	/**
	 * @return the lscs
	 */
	public Set<Lsc> getLscs() {
		return lscs;
	}

	/**
	 * @param lscs the lscs to set
	 */
	public void setLscs(Set<Lsc> lscs) {
		this.lscs = lscs;
	}

	/**
	 * @return the cardTypes2
	 */
	public Set<CardType> getCardTypes2() {
		return cardTypes2;
	}

	/**
	 * @param cardTypes2 the cardTypes2 to set
	 */
	public void setCardTypes2(Set<CardType> cardTypes2) {
		this.cardTypes2 = cardTypes2;
	}


}
