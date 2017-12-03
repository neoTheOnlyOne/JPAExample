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
@Table(name="SAT_POSITION")
public class SatPosition implements Serializable {
	@Id
	@Column(name="OID_SAT_POSITION")
	private Long id;

	@Column(name="FDM_TRAEGER")
	private String fdmTransporter;

	@Column(name="TDMA_BURST")
	private String burst;

	@Column(name="TDMA_PORT")
	private String port;

	@Column(name="TDMA_SUBBURST")
	private String subBurst;

	@Column(name="TDMA_TIM")
	private String tim;

	@Column(name="TRANSPONDER")
	private String transponder;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_POSITION0OID_PO")
	private Position position;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SAT_UEBERTRAOID")
	private SatTransmissionSystem satTransmissionSystem;

	private static final long serialVersionUID = 1L;

	public SatPosition() {
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
	 * @return the fdmTransporter
	 */
	public String getFdmTransporter() {
		return fdmTransporter;
	}

	/**
	 * @param fdmTransporter the fdmTransporter to set
	 */
	public void setFdmTransporter(String fdmTransporter) {
		this.fdmTransporter = fdmTransporter;
	}

	/**
	 * @return the burst
	 */
	public String getBurst() {
		return burst;
	}

	/**
	 * @param burst the burst to set
	 */
	public void setBurst(String burst) {
		this.burst = burst;
	}

	/**
	 * @return the port
	 */
	public String getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(String port) {
		this.port = port;
	}

	/**
	 * @return the subBurst
	 */
	public String getSubBurst() {
		return subBurst;
	}

	/**
	 * @param subBurst the subBurst to set
	 */
	public void setSubBurst(String subBurst) {
		this.subBurst = subBurst;
	}

	/**
	 * @return the tim
	 */
	public String getTim() {
		return tim;
	}

	/**
	 * @param tim the tim to set
	 */
	public void setTim(String tim) {
		this.tim = tim;
	}

	/**
	 * @return the transponder
	 */
	public String getTransponder() {
		return transponder;
	}

	/**
	 * @param transponder the transponder to set
	 */
	public void setTransponder(String transponder) {
		this.transponder = transponder;
	}

	/**
	 * @return the position
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	/**
	 * @return the satTransmissionSystem
	 */
	public SatTransmissionSystem getSatTransmissionSystem() {
		return satTransmissionSystem;
	}

	/**
	 * @param satTransmissionSystem the satTransmissionSystem to set
	 */
	public void setSatTransmissionSystem(SatTransmissionSystem satTransmissionSystem) {
		this.satTransmissionSystem = satTransmissionSystem;
	}

}
