package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CARRIER_CONTACT_FUCTIONS")
public class CarrierContactFuctions implements Serializable {
	@Id
	@Column(name="OID")
	private Long id;

	private String function;

	@OneToMany(mappedBy="carrierContactFuctions")
	private Set<CarrierContactAssignments> carrierContactAssignments;

	private static final long serialVersionUID = 1L;

	public CarrierContactFuctions() {
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
	 * @return the function
	 */
	public String getFunction() {
		return function;
	}

	/**
	 * @param function the function to set
	 */
	public void setFunction(String function) {
		this.function = function;
	}

	/**
	 * @return the carrierContactAssignments
	 */
	public Set<CarrierContactAssignments> getCarrierContactAssignments() {
		return carrierContactAssignments;
	}

	/**
	 * @param carrierContactAssignments the carrierContactAssignments to set
	 */
	public void setCarrierContactAssignments(
			Set<CarrierContactAssignments> carrierContactAssignments) {
		this.carrierContactAssignments = carrierContactAssignments;
	}

	
}
