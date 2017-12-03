package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SAT_UEBERTRAGUNGSV")
public class SatTransmissionSystem implements Serializable {
	@Id
	@Column(name="OID_SAT_UEBERTRAGU")
	private Long id;

	@Column(name="SAT_UEBERTRAGUNGSV")
	private String remark;
	
	@Column(name="SATELLITENUEBERTRA")
	private String satTransmissionSystemId;

	@OneToMany(mappedBy="satTransmissionSystem")
	private Set<SatPosition> satPositions;

	private static final long serialVersionUID = 1L;

	public SatTransmissionSystem() {
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
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the satTransmissionSystemId
	 */
	public String getSatTransmissionSystemId() {
		return satTransmissionSystemId;
	}

	/**
	 * @param satTransmissionSystemId the satTransmissionSystemId to set
	 */
	public void setSatTransmissionSystemId(String satTransmissionSystemId) {
		this.satTransmissionSystemId = satTransmissionSystemId;
	}

	/**
	 * @return the satPositions
	 */
	public Set<SatPosition> getSatPositions() {
		return satPositions;
	}

	/**
	 * @param satPositions the satPositions to set
	 */
	public void setSatPositions(Set<SatPosition> satPositions) {
		this.satPositions = satPositions;
	}

}
