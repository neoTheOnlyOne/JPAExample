package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "GRUNDSTUECKSART")
public class SiteType implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="OID_GRUNDSTUECKSAR")
	private Long id;

	@Column(name="GRUNDSTUECKSARTBEZ")
	private String description;

	@Column(name="GRUNDSTUECKSARTKEN")
	private String siteTypeId;

	@OneToMany(mappedBy="siteType")
	private Set<Site> sites;

	public SiteType() {
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the siteTypeId
	 */
	public String getSiteTypeId() {
		return siteTypeId;
	}

	/**
	 * @param siteTypeId the siteTypeId to set
	 */
	public void setSiteTypeId(String siteTypeId) {
		this.siteTypeId = siteTypeId;
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


}
