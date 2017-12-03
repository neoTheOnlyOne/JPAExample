package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
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
public class Leg implements Serializable {
	@Id
	@Column(name="OID_LEG")
	private Long id;

	@Column(name="LEG_NAME")
	private String name;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SECURE_SECTIOID_SECURE_SECT")
	private SecureSection secureSection;

	@OneToMany(mappedBy="leg")
	private Set<RoutingSection> routingSection;

	@ManyToMany(mappedBy="legs")
	private Set<FaultRecord> faultRecords;

	private static final long serialVersionUID = 1L;

	public Leg() {
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
	 * @return the secureSection
	 */
	public SecureSection getSecureSection() {
		return secureSection;
	}

	/**
	 * @param secureSection the secureSection to set
	 */
	public void setSecureSection(SecureSection secureSection) {
		this.secureSection = secureSection;
	}

	/**
	 * @return the routingSection
	 */
	public Set<RoutingSection> getRoutingSection() {
		return routingSection;
	}

	/**
	 * @param routingSection the routingSection to set
	 */
	public void setRoutingSection(Set<RoutingSection> routingSection) {
		this.routingSection = routingSection;
	}

	/**
	 * @return the faultRecords
	 */
	public Set<FaultRecord> getFaultRecords() {
		return faultRecords;
	}

	/**
	 * @param faultRecords the faultRecords to set
	 */
	public void setFaultRecords(Set<FaultRecord> faultRecords) {
		this.faultRecords = faultRecords;
	}

}
