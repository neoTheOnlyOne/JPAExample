package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
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

@Entity
public class Rack implements Serializable {
	@Id
	@Column(name="OID_RACK")
	private Long id;

	@Column(name="RACK_ALIAS")
	private String alias;

	@Column(name="RACK_ALIAS_SUCH_BS")
	private String aliasSearch;

	@Column(name="RACK_BAY")
	private String bay;

	@Column(name="RACK_DATE_INSTALLE")
	private Date dateInstalled;

	@Column(name="RACK_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="RACK_DESIGNATION")
	private String designation;

	@Column(name="RACK_DESIGNATION_S")
	private String designationS;

	@Column(name="RACK_FORM_FACTOR")
	private String formFactor;

	@Column(name="RACK_PHOTO")
	private String photo;

	@Column(name="RACK_REMARK")
	private String remark;

	@Column(name="RACK_ROW")
	private String row;

	@Column(name="RACK_SPACE")
	private String space;

	@Column(name="RACK_TECHNIQUE")
	private String technique;

	@Column(name="RACK_UPDATED_BY")
	private String updatedBy;

	@Column(name="SPIMS_FOREIGN_KEY")
	private String spimsForeignKey;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CUSTOMEROID_CUS")
	private Customer customer;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SERVICE_PLATOID")
	private Platform platform;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_RACK_TYPEOID_RA")
	private RackType rackType;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ROOMOID_ROOM")
	private Room room;

	@OneToMany(mappedBy="rack")
	private Set<Equipment> equipments;

	@OneToMany(mappedBy="rack")
	private Set<DistributorFrame> distributorFrames;

	@OneToMany(mappedBy="rack")
	private Set<Costs> costs;

	@OneToMany(mappedBy="rack")
	private Set<Eqa> eqas;

	@ManyToMany(mappedBy="racks")
	private Set<Distributor0> distributor0s;

	@ManyToMany(mappedBy="racks")
	private Set<Cable> cables;

	private static final long serialVersionUID = 1L;

	public Rack() {
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
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * @return the aliasSearch
	 */
	public String getAliasSearch() {
		return aliasSearch;
	}

	/**
	 * @param aliasSearch the aliasSearch to set
	 */
	public void setAliasSearch(String aliasSearch) {
		this.aliasSearch = aliasSearch;
	}

	/**
	 * @return the bay
	 */
	public String getBay() {
		return bay;
	}

	/**
	 * @param bay the bay to set
	 */
	public void setBay(String bay) {
		this.bay = bay;
	}

	/**
	 * @return the dateInstalled
	 */
	public Date getDateInstalled() {
		return dateInstalled;
	}

	/**
	 * @param dateInstalled the dateInstalled to set
	 */
	public void setDateInstalled(Date dateInstalled) {
		this.dateInstalled = dateInstalled;
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
	 * @return the row
	 */
	public String getRow() {
		return row;
	}

	/**
	 * @param row the row to set
	 */
	public void setRow(String row) {
		this.row = row;
	}

	/**
	 * @return the space
	 */
	public String getSpace() {
		return space;
	}

	/**
	 * @param space the space to set
	 */
	public void setSpace(String space) {
		this.space = space;
	}

	/**
	 * @return the technique
	 */
	public String getTechnique() {
		return technique;
	}

	/**
	 * @param technique the technique to set
	 */
	public void setTechnique(String technique) {
		this.technique = technique;
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
	 * @return the spimsForeignKey
	 */
	public String getSpimsForeignKey() {
		return spimsForeignKey;
	}

	/**
	 * @param spimsForeignKey the spimsForeignKey to set
	 */
	public void setSpimsForeignKey(String spimsForeignKey) {
		this.spimsForeignKey = spimsForeignKey;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
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
	 * @return the rackType
	 */
	public RackType getRackType() {
		return rackType;
	}

	/**
	 * @param rackType the rackType to set
	 */
	public void setRackType(RackType rackType) {
		this.rackType = rackType;
	}

	/**
	 * @return the room
	 */
	public Room getRoom() {
		return room;
	}

	/**
	 * @param room the room to set
	 */
	public void setRoom(Room room) {
		this.room = room;
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
	 * @return the costs
	 */
	public Set<Costs> getCosts() {
		return costs;
	}

	/**
	 * @param costs the costs to set
	 */
	public void setCosts(Set<Costs> costs) {
		this.costs = costs;
	}

	/**
	 * @return the eqas
	 */
	public Set<Eqa> getEqas() {
		return eqas;
	}

	/**
	 * @param eqas the eqas to set
	 */
	public void setEqas(Set<Eqa> eqas) {
		this.eqas = eqas;
	}

	/**
	 * @return the distributor0s
	 */
	public Set<Distributor0> getDistributor0s() {
		return distributor0s;
	}

	/**
	 * @param distributor0s the distributor0s to set
	 */
	public void setDistributor0s(Set<Distributor0> distributor0s) {
		this.distributor0s = distributor0s;
	}

	/**
	 * @return the cables
	 */
	public Set<Cable> getCables() {
		return cables;
	}

	/**
	 * @param cables the cables to set
	 */
	public void setCables(Set<Cable> cables) {
		this.cables = cables;
	}


	}
