package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
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
@Table(name = "ANSPRECHPARTNER")
public class ContactPerson implements Serializable {
	@Id
	@Column(name="OID_ANSPRECHPARTNE")
	private Long id;

	@Column(name="ANREDE")
	private String salutation;

	@Column(name="ANSPRECHPARTNERNOT")
	private String remark;

	@Column(name="AUFGABENBEREICH")
	private String areaOfResponsibility;

	@Column(name="FAMILIENNAME")
	private String lastName;

	@Column(name="FAMILIENNAME_SUCH")
	private String lastNameSearch;

	@Column(name="FK_CARRIEROID_CARRIER")
	private Long fkCarrieroidCarrier;

	@Column(name="FUNCTION")
	private String function;

	@Column(name="STELLENBEZEICHNUNG")
	private String positionalDesignation;

	@Column(name="TITEL")
	private String title;

	@Column(name="VORNAME")
	private String firstName;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CARRIEROID_CARR")
	private Carrier carrier;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CUSTOMEROID_CUS")
	private Customer customer;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ORG_EINHEITOID")
	private Branch branch;

	@OneToMany(mappedBy="contactPerson")
	private Set<Responsibility> responsibilities;

	@OneToMany(mappedBy="contactPerson")
	private Set<TeleContact> teleContacts;

	@OneToMany(mappedBy="contactPerson")
	private Set<Gremium> gremiums;

	@OneToMany(mappedBy="contactPerson")
	private Set<PostalAddress> postalAddresses;

	private static final long serialVersionUID = 1L;

	public ContactPerson() {
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
	 * @return the salutation
	 */
	public String getSalutation() {
		return salutation;
	}

	/**
	 * @param salutation the salutation to set
	 */
	public void setSalutation(String salutation) {
		this.salutation = salutation;
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
	 * @return the areaOfResponsibility
	 */
	public String getAreaOfResponsibility() {
		return areaOfResponsibility;
	}

	/**
	 * @param areaOfResponsibility the areaOfResponsibility to set
	 */
	public void setAreaOfResponsibility(String areaOfResponsibility) {
		this.areaOfResponsibility = areaOfResponsibility;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the lastNameSearch
	 */
	public String getLastNameSearch() {
		return lastNameSearch;
	}

	/**
	 * @param lastNameSearch the lastNameSearch to set
	 */
	public void setLastNameSearch(String lastNameSearch) {
		this.lastNameSearch = lastNameSearch;
	}

	/**
	 * @return the fkCarrieroidCarrier
	 */
	public Long getFkCarrieroidCarrier() {
		return fkCarrieroidCarrier;
	}

	/**
	 * @param fkCarrieroidCarrier the fkCarrieroidCarrier to set
	 */
	public void setFkCarrieroidCarrier(Long fkCarrieroidCarrier) {
		this.fkCarrieroidCarrier = fkCarrieroidCarrier;
	}

	/**
	 * @return the function
	 */
	public String getFunction() {
		return function;
	}

	/**
	 * @param function the function to set
	 */
	public void setFunction(String function) {
		this.function = function;
	}

	/**
	 * @return the positionalDesignation
	 */
	public String getPositionalDesignation() {
		return positionalDesignation;
	}

	/**
	 * @param positionalDesignation the positionalDesignation to set
	 */
	public void setPositionalDesignation(String positionalDesignation) {
		this.positionalDesignation = positionalDesignation;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the carrier
	 */
	public Carrier getCarrier() {
		return carrier;
	}

	/**
	 * @param carrier the carrier to set
	 */
	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
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
	 * @return the branch
	 */
	public Branch getBranch() {
		return branch;
	}

	/**
	 * @param branch the branch to set
	 */
	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	/**
	 * @return the responsibilities
	 */
	public Set<Responsibility> getResponsibilities() {
		return responsibilities;
	}

	/**
	 * @param responsibilities the responsibilities to set
	 */
	public void setResponsibilities(Set<Responsibility> responsibilities) {
		this.responsibilities = responsibilities;
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
	 * @return the gremiums
	 */
	public Set<Gremium> getGremiums() {
		return gremiums;
	}

	/**
	 * @param gremiums the gremiums to set
	 */
	public void setGremiums(Set<Gremium> gremiums) {
		this.gremiums = gremiums;
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
