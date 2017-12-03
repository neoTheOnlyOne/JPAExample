package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tsystems.rubin.common.util.NamedQueryConstants;

@NamedQueries( {
	@NamedQuery(name = NamedQueryConstants.LSCEXTENSION_FINDALL, query = "Select l from LscExtension l"
			+ " order by l.lscExtensionId")
	 })
@Entity
@Table(name="LSZ_EXTENSION")
public class LscExtension implements Serializable {
	@Id
	@Column(name="OID_EXTENSION")
	private Long id;

	@Column(name="LSZ_EXTENSION_DESCRIPTION")
	private String description;

	@Column(name="LSZ_EXTENSION_ID")
	private String lscExtensionId;

	@OneToMany(mappedBy="lscExtension")
	private Set<SlaProduct> slaProducts;

	@OneToMany(mappedBy="lscExtension")
	private Set<Circuit> circuits;

	private static final long serialVersionUID = 1L;

	public LscExtension() {
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
	 * @return the lscExtensionId
	 */
	public String getLscExtensionId() {
		return lscExtensionId;
	}

	/**
	 * @param lscExtensionId the lscExtensionId to set
	 */
	public void setLscExtensionId(String lscExtensionId) {
		this.lscExtensionId = lscExtensionId;
	}

	/**
	 * @return the slaProducts
	 */
	public Set<SlaProduct> getSlaProducts() {
		return slaProducts;
	}

	/**
	 * @param slaProducts the slaProducts to set
	 */
	public void setSlaProducts(Set<SlaProduct> slaProducts) {
		this.slaProducts = slaProducts;
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

}
