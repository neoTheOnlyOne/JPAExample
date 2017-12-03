package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SLA_ADDON_GROUP")
public class SlaAddonGroup implements Serializable {
	@Id
	@Column(name="SLA_ADDON_GROUP_OID")
	private Long id;

	@Column(name="SLA_ADDON_GROUP_NAME")
	private String name;

	@OneToMany(mappedBy="slaAddonGroup")
	private Set<SlaAddonValues> slaAddonValues;

	private static final long serialVersionUID = 1L;

	public SlaAddonGroup() {
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
	 * @return the slaAddonValues
	 */
	public Set<SlaAddonValues> getSlaAddonValues() {
		return slaAddonValues;
	}

	/**
	 * @param slaAddonValues the slaAddonValues to set
	 */
	public void setSlaAddonValues(Set<SlaAddonValues> slaAddonValues) {
		this.slaAddonValues = slaAddonValues;
	}

}
