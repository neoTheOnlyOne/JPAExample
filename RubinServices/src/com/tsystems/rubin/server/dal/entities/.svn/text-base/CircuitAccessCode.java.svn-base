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
@Table(name="CAC")
public class CircuitAccessCode implements Serializable {
	@Id
	@Column(name="OID_CAC")
	private Long id;

	@Column(name="CAC")
	private String code	;

	@Column(name="KIND_OF_NMS")
	private String kindOfNms;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID_TRANSPORTVE")
	private Circuit circuit;

	private static final long serialVersionUID = 1L;

	public CircuitAccessCode() {
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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the kindOfNms
	 */
	public String getKindOfNms() {
		return kindOfNms;
	}

	/**
	 * @param kindOfNms the kindOfNms to set
	 */
	public void setKindOfNms(String kindOfNms) {
		this.kindOfNms = kindOfNms;
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
