package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SECURE_SECTION")
public class SecureSection implements Serializable {
	@Id
	@Column(name="OID_SECURE_SECTION")
	private Long id;

	@Column(name="SS_CAC")
	private String cac;

	@Column(name="SS_NAME")
	private String name;

	@OneToMany(mappedBy="secureSection")
	private Set<Leg> legs;

	@OneToMany(mappedBy="secureSection")
	private Set<RoutingSection> routingSections;

	private static final long serialVersionUID = 1L;

	public SecureSection() {
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
	 * @return the cac
	 */
	public String getCac() {
		return cac;
	}

	/**
	 * @param cac the cac to set
	 */
	public void setCac(String cac) {
		this.cac = cac;
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
	 * @return the legs
	 */
	public Set<Leg> getLegs() {
		return legs;
	}

	/**
	 * @param legs the legs to set
	 */
	public void setLegs(Set<Leg> legs) {
		this.legs = legs;
	}

	/**
	 * @return the routingSections
	 */
	public Set<RoutingSection> getRoutingSections() {
		return routingSections;
	}

	/**
	 * @param routingSections the routingSections to set
	 */
	public void setRoutingSections(Set<RoutingSection> routingSections) {
		this.routingSections = routingSections;
	}


}
