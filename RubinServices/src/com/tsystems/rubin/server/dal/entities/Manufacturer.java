package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Manufacturer implements Serializable {
	@Id
	@Column(name="OID_MANUFACTURER")
	private Long id;

	@Column(name="MANUFACTURER_ABBRE")
	private String abbreviation;

	@Column(name="MANUFACTURER_DATE")
	private Date date;

	@Column(name="MANUFACTURER_NAME")
	private String name;

	@Column(name="MANUFACTURER_NAME0")
	private String name0;

	@Column(name="MANUFACTURER_REMAR")
	private String remark;

	@Column(name="MANUFACTURER_UPDAT")
	private String update;

	@OneToMany(mappedBy="manufacturerFk")
	private Set<CardType> cardTypes;

	@OneToMany(mappedBy="manufacturer")
	private Set<RackType> rackTypes;

	@OneToMany(mappedBy="manufacturer")
	private Set<DistributorFType> distributorFTypes;

	@OneToMany(mappedBy="manufacturer1")
	private Set<DistributorElemen> distributorElements;

	@OneToMany(mappedBy="manufacturer")
	private Set<EqType> eqTypes;

	@OneToMany(mappedBy="manufacturer")
	private Set<IhCableType> ihCableTypes;

	private static final long serialVersionUID = 1L;

	public Manufacturer() {
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
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the name0
	 */
	public String getName0() {
		return name0;
	}

	/**
	 * @param name0 the name0 to set
	 */
	public void setName0(String name0) {
		this.name0 = name0;
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
	 * @return the update
	 */
	public String getUpdate() {
		return update;
	}

	/**
	 * @param update the update to set
	 */
	public void setUpdate(String update) {
		this.update = update;
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
	 * @return the rackTypes
	 */
	public Set<RackType> getRackTypes() {
		return rackTypes;
	}

	/**
	 * @param rackTypes the rackTypes to set
	 */
	public void setRackTypes(Set<RackType> rackTypes) {
		this.rackTypes = rackTypes;
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

	/**
	 * @return the distributorElements
	 */
	public Set<DistributorElemen> getDistributorElements() {
		return distributorElements;
	}

	/**
	 * @param distributorElements the distributorElements to set
	 */
	public void setDistributorElements(Set<DistributorElemen> distributorElements) {
		this.distributorElements = distributorElements;
	}

	/**
	 * @return the eqTypes
	 */
	public Set<EqType> getEqTypes() {
		return eqTypes;
	}

	/**
	 * @param eqTypes the eqTypes to set
	 */
	public void setEqTypes(Set<EqType> eqTypes) {
		this.eqTypes = eqTypes;
	}

	/**
	 * @return the ihCableTypes
	 */
	public Set<IhCableType> getIhCableTypes() {
		return ihCableTypes;
	}

	/**
	 * @param ihCableTypes the ihCableTypes to set
	 */
	public void setIhCableTypes(Set<IhCableType> ihCableTypes) {
		this.ihCableTypes = ihCableTypes;
	}

}
