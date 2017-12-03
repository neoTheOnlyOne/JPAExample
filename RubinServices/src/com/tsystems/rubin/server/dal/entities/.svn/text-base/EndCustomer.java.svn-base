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
@Table(name="END_CUSTOMER")
public class EndCustomer implements Serializable {
	@Id
	@Column(name="OID_END_CUSTOMER")
	private Long id;

	@Column(name="END_CUSTOMERANSCHRIFT1")
	private String addressLine1;

	@Column(name="END_CUSTOMERANSCHRIFT2")
	private String addressLine2;

	@Column(name="END_CUSTOMERANSCHRIFT3")
	private String addressLine3;

	@Column(name="END_CUSTOMERNAME")
	private String name;

	@Column(name="END_CUSTOMERNAME_SUCH_BSI")
	private String nameSearch;

	@Column(name="END_CUSTOMERNETWORK")
	private String network;

	@Column(name="END_CUSTOMERNETWORK_SUCH_BSI")
	private String networkSearch;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID_TRANSPORTVE")
	private Circuit circuit;

	private static final long serialVersionUID = 1L;

	public EndCustomer() {
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
	 * @return the network
	 */
	public String getNetwork() {
		return network;
	}

	/**
	 * @param network the network to set
	 */
	public void setNetwork(String network) {
		this.network = network;
	}

	/**
	 * @return the networkSearch
	 */
	public String getNetworkSearch() {
		return networkSearch;
	}

	/**
	 * @param networkSearch the networkSearch to set
	 */
	public void setNetworkSearch(String networkSearch) {
		this.networkSearch = networkSearch;
	}

	/**
	 * @return the circuit
	 */
	public Circuit getCircuit() {
		return circuit;
	}

	/**
	 * @param circuit the circuit to set
	 */
	public void setCircuit(Circuit circuit) {
		this.circuit = circuit;
	}

	
}
