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
@Table(name="IH_CABLE_TYPE")
public class IhCableType implements Serializable {
	@Id
	@Column(name="OID_CABLE_TYPE")
	private Long id;

	@Column(name="CT_ABBREVIATION")
	private String abbreviation;

	@Column(name="CT_ABBREVIATION_SU")
	private String abbreviationSearch;

	@Column(name="CT_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="CT_DESIGNATION")
	private String designation;

	@Column(name="CT_DESIGNATION_SUC")
	private String designationSearch;

	@Column(name="CT_MANUFACTURER_OR")
	private String manufacturerOr;

	@Column(name="CT_MATERIAL_NO")
	private Long materialNo;

	@Column(name="CT_NO_OF_WIRES")
	private Long noOfWires;

	@Column(name="CT_REMARK")
	private String remark;

	@Column(name="CT_TYPE")
	private String type;

	@Column(name="CT_UPDATED_BY")
	private String updatedBy;

	@Column(name="CT_WIRE_DESIGNATIO")
	private String wireDesignation;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_MANUFACTUREROID")
	private Manufacturer manufacturer;

	@OneToMany(mappedBy="ihCableType")
	private Set<IhCable> ihCables;

	private static final long serialVersionUID = 1L;

	public IhCableType() {
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
	 * @return the abbreviationSearch
	 */
	public String getAbbreviationSearch() {
		return abbreviationSearch;
	}

	/**
	 * @param abbreviationSearch the abbreviationSearch to set
	 */
	public void setAbbreviationSearch(String abbreviationSearch) {
		this.abbreviationSearch = abbreviationSearch;
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
	 * @return the materialNo
	 */
	public Long getMaterialNo() {
		return materialNo;
	}

	/**
	 * @param materialNo the materialNo to set
	 */
	public void setMaterialNo(Long materialNo) {
		this.materialNo = materialNo;
	}

	/**
	 * @return the noOfWires
	 */
	public Long getNoOfWires() {
		return noOfWires;
	}

	/**
	 * @param noOfWires the noOfWires to set
	 */
	public void setNoOfWires(Long noOfWires) {
		this.noOfWires = noOfWires;
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
	 * @return the wireDesignation
	 */
	public String getWireDesignation() {
		return wireDesignation;
	}

	/**
	 * @param wireDesignation the wireDesignation to set
	 */
	public void setWireDesignation(String wireDesignation) {
		this.wireDesignation = wireDesignation;
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
	 * @return the ihCables
	 */
	public Set<IhCable> getIhCables() {
		return ihCables;
	}

	/**
	 * @param ihCables the ihCables to set
	 */
	public void setIhCables(Set<IhCable> ihCables) {
		this.ihCables = ihCables;
	}



}
