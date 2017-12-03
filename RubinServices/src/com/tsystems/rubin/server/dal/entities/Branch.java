package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ORG_EINHEIT")
public class Branch implements Serializable {
	@Id
	@Column(name="OID_ORGEINHEIT")
	private Long id;

	@Column(name="LETZTE_AKTUALISIER")
	private Date lastUpdate;

	@Column(name="NIEDERLASSUNGSNUMM")
	private String number;

	@Column(name="NIEDERLASSUNGSKURZ")
	private String abbreviation;

	@Column(name="ORG_EINHEIT_BEZEIC")
	private String designation;

	@Column(name="ORG_EINHEIT_NOTIZ")
	private String remark;

	@Column(name="ORG_EINHEIT_ZUSATZ")
	private String branchAdditional;

	@OneToMany(mappedBy="branch")
	private Set<Site> sites;

	@OneToMany(mappedBy="branch")
	private Set<TeleContact> teleContacts;

	@OneToMany(mappedBy="branch")
	private Set<ContactPerson> contactPersons;

	@OneToMany(mappedBy="branch")
	private Set<PostalAddress> PostalAddresses;


	private static final long serialVersionUID = 1L;

	public Branch() {
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
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
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
	 * @return the branchAdditional
	 */
	public String getBranchAdditional() {
		return branchAdditional;
	}

	/**
	 * @param branchAdditional the branchAdditional to set
	 */
	public void setBranchAdditional(String branchAdditional) {
		this.branchAdditional = branchAdditional;
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
		return PostalAddresses;
	}

	/**
	 * @param postalAddresses the postalAddresses to set
	 */
	public void setPostalAddresses(Set<PostalAddress> postalAddresses) {
		PostalAddresses = postalAddresses;
	}

	
}
