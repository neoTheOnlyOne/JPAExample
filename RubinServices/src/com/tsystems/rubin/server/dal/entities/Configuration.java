package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="KONFIGURATION")
public class Configuration implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Configuration")
	@SequenceGenerator(name = "Configuration", sequenceName = "KONFIGURATION_SEQUENCE", allocationSize = 1)
	@Column(name="OID_KONFIGURATION")
	private Long id;

	@Column(name="KONFIGURATIONS_BEG")
	private Date begin;

	@Column(name="KONFIGURATIONS_END")
	private Date end;

	@Column(name="KONFIGURATIONS_NOT")
	private String remark;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID")
	private Circuit circuit;

	@OneToMany(mappedBy="configuration")
	private Set<Channel> channels;

	@ManyToMany(mappedBy="configurations")
	private Set<FaultRecord> faultRecords;

	private static final long serialVersionUID = 1L;

	public Configuration() {
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
	 * @return the begin
	 */
	public Date getBegin() {
		return begin;
	}

	/**
	 * @param begin the begin to set
	 */
	public void setBegin(Date begin) {
		this.begin = begin;
	}

	/**
	 * @return the end
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(Date end) {
		this.end = end;
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

	/**
	 * @return the channels
	 */
	public Set<Channel> getChannels() {
		return channels;
	}

	/**
	 * @param channels the channels to set
	 */
	public void setChannels(Set<Channel> channels) {
		this.channels = channels;
	}

	/**
	 * @return the faultRecords
	 */
	public Set<FaultRecord> getFaultRecords() {
		return faultRecords;
	}

	/**
	 * @param faultRecords the faultRecords to set
	 */
	public void setFaultRecords(Set<FaultRecord> faultRecords) {
		this.faultRecords = faultRecords;
	}


}
