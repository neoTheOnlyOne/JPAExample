package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;

@NamedQuery(name = NamedQueryConstants.SERVICE_FINDALL, query = "Select new com.tsystems.rubin.server.dal.dvo.ServiceDVO"
		+ Service.COMMON_PICKLIST_FIELDS_STRING
		+ " from Service s "
		+ "order by s.designation")
@Entity
@Table(name = "DIENST")
public class Service implements Serializable {

	/** The Constant COMMON_PICKLIST_FIELDS_STRING. */
	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(s.id, s.designation, s.serviceId)";

	@Id
	@Column(name = "OID_DIENST")
	private Long id;

	@Column(name = "DIENSTBEZEICHNUNG")
	private String designation;

	@Column(name = "DIENSTKENNUNG")
	private String serviceId;

	@OneToMany(mappedBy = "service")
	private Set<Circuit> circuits;

	@OneToMany(mappedBy="service")
	private Set<IruKontingent> iruKontingents;

	@OneToMany(mappedBy="service")
	private Set<Nutzungskontingent> nutzungskontingents;

	private static final long serialVersionUID = 1L;

	public Service() {
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
	 * @return the serviceId
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
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
	 * @return the iruKontingents
	 */
	public Set<IruKontingent> getIruKontingents() {
		return iruKontingents;
	}

	/**
	 * @param iruKontingents the iruKontingents to set
	 */
	public void setIruKontingents(Set<IruKontingent> iruKontingents) {
		this.iruKontingents = iruKontingents;
	}

	/**
	 * @return the nutzungskontingents
	 */
	public Set<Nutzungskontingent> getNutzungskontingents() {
		return nutzungskontingents;
	}

	/**
	 * @param nutzungskontingents the nutzungskontingents to set
	 */
	public void setNutzungskontingents(Set<Nutzungskontingent> nutzungskontingents) {
		this.nutzungskontingents = nutzungskontingents;
	}


}
