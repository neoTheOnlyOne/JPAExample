package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="FAULT_HISTORY")
public class FaultHistory implements Serializable {
	@Id
	@Column(name="OID_FH")
	private Long id;

	@Column(name="FH_FAULT_STATUS")
	private String status;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_FAULT_RECORDOID_FAULTRECORD")
	private FaultRecord faultRecord;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID_TRANSPORTVE")
	private Circuit circuit;

	private static final long serialVersionUID = 1L;

	public FaultHistory() {
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the faultRecord
	 */
	public FaultRecord getFaultRecord() {
		return faultRecord;
	}

	/**
	 * @param faultRecord the faultRecord to set
	 */
	public void setFaultRecord(FaultRecord faultRecord) {
		this.faultRecord = faultRecord;
	}

	/**
	 * @return the circuit
	 */
	public Circuit getCircuit() {
		return circuit;
	}

	/**
	 * @param circuit the circuit to set
	 */
	public void setCircuit(Circuit circuit) {
		this.circuit = circuit;
	}

	
}
