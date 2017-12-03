package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SLA_PROMPT")
public class SlaPrompt implements Serializable {
	@Id
	@Column(name="SLA_PROMPT_OID")
	private Long id;

	@Column(name="SLA_PROMPT_NAME")
	private String name;

	@Column(name="SLA_PROMPT_UNIT")
	private String unit;

	@OneToMany(mappedBy="slaPrompt")
	private Set<SlaRecord> slaRecords;

	private static final long serialVersionUID = 1L;

	public SlaPrompt() {
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
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * @return the slaRecords
	 */
	public Set<SlaRecord> getSlaRecords() {
		return slaRecords;
	}

	/**
	 * @param slaRecords the slaRecords to set
	 */
	public void setSlaRecords(Set<SlaRecord> slaRecords) {
		this.slaRecords = slaRecords;
	}

}
