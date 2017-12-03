package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TELEKONTAKT")
public class TeleContact implements Serializable {
	@Id
	@Column(name="OID_TELEKONTAKT")
	private Long id;

	@Column(name="KONTAKTART")
	private String type;

	@Column(name="TELEKONTAKTANZEIGE")
	private String display;

	@Column(name="TELEKONTAKTBEMERKU")
	private String remark;

	@Column(name="TELEKONTAKTNUMMER")
	private String number;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ANSPRECHPARTOID")
	private ContactPerson contactPerson;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_BEARBEITER_SZER")
	private User user;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CARRIEROID_CARR")
	private Carrier carrier;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CUSTOMEROID_CUS")
	private Customer customer;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ORG_EINHEITOID")
	private Branch branch;

	private static final long serialVersionUID = 1L;

	public TeleContact() {
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
	 * @return the display
	 */
	public String getDisplay() {
		return display;
	}

	/**
	 * @param display the display to set
	 */
	public void setDisplay(String display) {
		this.display = display;
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
	 * @return the contactPerson
	 */
	public ContactPerson getContactPerson() {
		return contactPerson;
	}

	/**
	 * @param contactPerson the contactPerson to set
	 */
	public void setContactPerson(ContactPerson contactPerson) {
		this.contactPerson = contactPerson;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
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

}
