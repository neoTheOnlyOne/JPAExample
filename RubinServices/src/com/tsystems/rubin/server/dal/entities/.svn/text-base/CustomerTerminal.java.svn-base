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
@Table(name = "KUNDENENDPUNKT")
public class CustomerTerminal implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="OID_KUNDENENDPUNKT")
	private Long id;

	@Column(name="KUNDENNAME")
	private String name;

	@Column(name="KUNDENNAMEZUSATZ")
	private String customerTerminalAdditional;

	@Column(name="KUNDENANSCHRIFT1")
	private String addressLine1;

	@Column(name="KUNDENANSCHRIFT2")
	private String addressLine2;

	@Column(name="KUNDENANSCHRIFT3")
	private String addressLine3;

	@Column(name="KUNDENNAME_SUCH_BSI")
	private String nameSearch;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ENDPUNKTOID_END")
	private Terminal terminal;
	

	public CustomerTerminal() {
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
	 * @return the customerTerminalAdditional
	 */
	public String getCustomerTerminalAdditional() {
		return customerTerminalAdditional;
	}


	/**
	 * @param customerTerminalAdditional the customerTerminalAdditional to set
	 */
	public void setCustomerTerminalAdditional(String customerTerminalAdditional) {
		this.customerTerminalAdditional = customerTerminalAdditional;
	}


	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}


	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}


	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}


	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}


	/**
	 * @return the addressLine3
	 */
	public String getAddressLine3() {
		return addressLine3;
	}


	/**
	 * @param addressLine3 the addressLine3 to set
	 */
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
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
	 * @return the terminal
	 */
	public Terminal getTerminal() {
		return terminal;
	}


	/**
	 * @param terminal the terminal to set
	 */
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}


}
