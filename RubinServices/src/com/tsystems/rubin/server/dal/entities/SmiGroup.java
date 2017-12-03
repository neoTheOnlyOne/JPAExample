package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
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
@Table(name="SMI_GROUP")
public class SmiGroup implements Serializable {
	@Id
	@Column(name="OID_GROUP")
	private Long id;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SMI_MAINTENAOID_MAINTENANCE")
	private SmiMaintenance smiMaintenance;

	@OneToMany(mappedBy="smiGroup")
	private Set<SmiResource> smiResources;

	private static final long serialVersionUID = 1L;

	public SmiGroup() {
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
	 * @return the smiMaintenance
	 */
	public SmiMaintenance getSmiMaintenance() {
		return smiMaintenance;
	}

	/**
	 * @param smiMaintenance the smiMaintenance to set
	 */
	public void setSmiMaintenance(SmiMaintenance smiMaintenance) {
		this.smiMaintenance = smiMaintenance;
	}

	/**
	 * @return the smiResources
	 */
	public Set<SmiResource> getSmiResources() {
		return smiResources;
	}

	/**
	 * @param smiResources the smiResources to set
	 */
	public void setSmiResources(Set<SmiResource> smiResources) {
		this.smiResources = smiResources;
	}

}
