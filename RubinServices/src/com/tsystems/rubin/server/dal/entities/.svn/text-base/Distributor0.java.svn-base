package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Distributor0 implements Serializable {
	@Id
	@Column(name="OID_DISTRIBUTOR_GROUP")
	private Long id;

	@Column(name="DG_DESIGNATION")
	private String designation;

	@Column(name="DG_DESIGNATION_SUCH_BSI")
	private String designationSearch;

	@ManyToMany
	@JoinTable(name="GEHOERT_ZU1",
		joinColumns=@JoinColumn(name="FK_DISTRIBUTOR_OID_DISTRIBUTOR"),
		inverseJoinColumns=@JoinColumn(name="FK_RACKOID_RACK"))
	private Set<Rack> racks;

	private static final long serialVersionUID = 1L;

	public Distributor0() {
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
	 * @return the designationSearch
	 */
	public String getDesignationSearch() {
		return designationSearch;
	}

	/**
	 * @param designationSearch the designationSearch to set
	 */
	public void setDesignationSearch(String designationSearch) {
		this.designationSearch = designationSearch;
	}

	/**
	 * @return the racks
	 */
	public Set<Rack> getRacks() {
		return racks;
	}

	/**
	 * @param racks the racks to set
	 */
	public void setRacks(Set<Rack> racks) {
		this.racks = racks;
	}



}
