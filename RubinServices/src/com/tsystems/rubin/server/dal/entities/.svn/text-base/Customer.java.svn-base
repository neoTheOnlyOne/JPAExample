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

@Entity
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="OID_CUSTOMER")
	private Long id;

	@Column(name="CUSTOMER_NAME1")
	private String name1;

	@Column(name="CUSTOMER_NAME1_SUC")
	private String nameSearch;

	@Column(name="CUSTOMER_NAME2")
	private String name2;

	@Column(name="CUSTOMER_REMARK")
	private String remark;

	@Column(name="CUSTOMER_UPDATED_B")
	private String updatedBy;

	@Column(name="CUSTOMER_DATE_LAST")
	private Date lastUpdate;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ORTSNETZOID_ORT")
	private City city;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CUSTOMER_TYPOID")
	private CustomerType customerType;

	@OneToMany(mappedBy="customer")
	private Set<Terminal> terminals;

	@OneToMany(mappedBy="customer")
	private Set<Circuit> circuits;
	
	@OneToMany(mappedBy="customer")
	private Set<Equipment> equipments;

	@OneToMany(mappedBy="customer")
	private Set<Eqa> eqas;

	@OneToMany(mappedBy="customer")
	private Set<Rack> racks;
	
	@OneToMany(mappedBy="customer")
	private Set<TeleContact> teleContacts;

	
	@OneToMany(mappedBy="customer")
	private Set<ContactPerson> contactPersons;

	@OneToMany(mappedBy="customer")
	private Set<PostalAddress> postalAddresses;

	public Customer() {
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
	 * @return the name1
	 */
	public String getName1() {
		return name1;
	}

	/**
	 * @param name1 the name1 to set
	 */
	public void setName1(String name1) {
		this.name1 = name1;
	}

	/**
	 * @return the nameSearch
	 */
	public String getNameSearch() {
		return nameSearch;
	}

	/**
	 * @param nameSearch the nameSearch to set
	 */
	public void setNameSearch(String nameSearch) {
		this.nameSearch = nameSearch;
	}

	/**
	 * @return the name2
	 */
	public String getName2() {
		return name2;
	}

	/**
	 * @param name2 the name2 to set
	 */
	public void setName2(String name2) {
		this.name2 = name2;
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
	 * @return the customerType
	 */
	public CustomerType getCustomerType() {
		return customerType;
	}

	/**
	 * @param customerType the customerType to set
	 */
	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
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

	/**
	 * @return the circuits
	 */
	public Set<Circuit> getCircuits() {
		return circuits;
	}

	/**
	 * @param circuits the circuits to set
	 */
	public void setCircuits(Set<Circuit> circuits) {
		this.circuits = circuits;
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

	/**
	 * @return the telecontacts
	 */
	public Set<TeleContact> getTeleContacts() {
		return teleContacts;
	}

	/**
	 * @param teleContacts the telecontacts to set
	 */
	public void setTeleContacts(Set<TeleContact> teleContacts) {
		this.teleContacts = teleContacts;
	}

	/**
	 * @return the contactPersons
	 */
	public Set<ContactPerson> getContactPersons() {
		return contactPersons;
	}

	/**
	 * @param contactPersons the contactPersons to set
	 */
	public void setContactPersons(Set<ContactPerson> contactPersons) {
		this.contactPersons = contactPersons;
	}

	/**
	 * @return the postalAddresses
	 */
	public Set<PostalAddress> getPostalAddresses() {
		return postalAddresses;
	}

	/**
	 * @param postalAddresses the postalAddresses to set
	 */
	public void setPostalAddresses(Set<PostalAddress> postalAddresses) {
		this.postalAddresses = postalAddresses;
	}

	
}
