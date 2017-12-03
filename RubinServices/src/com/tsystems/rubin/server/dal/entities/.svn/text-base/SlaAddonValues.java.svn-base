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
@Table(name="SLA_ADDON_VALUES")
public class SlaAddonValues implements Serializable {
	@Id
	@Column(name="SLA_ADDON_VALUES_OID")
	private Long id;

	@Column(name="SLA_ADDON_VALUE")
	private String value;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SLA_ADDON_GRSLA_ADDON_GROUP")
	private SlaAddonGroup slaAddonGroup;

	@OneToMany(mappedBy="slaAddonValues")
	private Set<SlaRecord> slaRecords;

	private static final long serialVersionUID = 1L;

	public SlaAddonValues() {
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
	 * @return the slaAddonValue
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the slaAddonValue to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the slaAddonGroup
	 */
	public SlaAddonGroup getSlaAddonGroup() {
		return slaAddonGroup;
	}

	/**
	 * @param slaAddonGroup the slaAddonGroup to set
	 */
	public void setSlaAddonGroup(SlaAddonGroup slaAddonGroup) {
		this.slaAddonGroup = slaAddonGroup;
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
