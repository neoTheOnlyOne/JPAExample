package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="GEN_COLUMN")
public class GenColumn implements Serializable {
	@Id
	@Column(name="OID_GEN_COLUMN")
	private Long id;

	@Column(name="COLUMN_ID")
	private Long columnId;

	@Column(name="COLUMN_MIN_USAGE")
	private String minUsage;

	@Column(name="COLUMN_NAME")
	private String name;

	@OneToMany(mappedBy="genColumn")
	private Set<GenColCombination> genColCombinations;

	@OneToMany(mappedBy="genColumn")
	private Set<GenColAvailabe> genColsAvailable;

	private static final long serialVersionUID = 1L;

	public GenColumn() {
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
	 * @return the columnId
	 */
	public Long getColumnId() {
		return columnId;
	}

	/**
	 * @param columnId the columnId to set
	 */
	public void setColumnId(Long columnId) {
		this.columnId = columnId;
	}

	/**
	 * @return the minUsage
	 */
	public String getMinUsage() {
		return minUsage;
	}

	/**
	 * @param minUsage the minUsage to set
	 */
	public void setMinUsage(String minUsage) {
		this.minUsage = minUsage;
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
	 * @return the genColCombinations
	 */
	public Set<GenColCombination> getGenColCombinations() {
		return genColCombinations;
	}

	/**
	 * @param genColCombinations the genColCombinations to set
	 */
	public void setGenColCombinations(Set<GenColCombination> genColCombinations) {
		this.genColCombinations = genColCombinations;
	}

	/**
	 * @return the genColsAvailable
	 */
	public Set<GenColAvailabe> getGenColsAvailable() {
		return genColsAvailable;
	}

	/**
	 * @param genColsAvailable the genColsAvailable to set
	 */
	public void setGenColsAvailable(Set<GenColAvailabe> genColsAvailable) {
		this.genColsAvailable = genColsAvailable;
	}


}
