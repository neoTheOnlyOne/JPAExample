package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PP_HISTORY")
public class PpHistory implements Serializable {
	@Id
	@Column(name="OID_PP_HISTORY")
	private Long id;

	@Column(name="PP_HISTORY_CHANGED_BY")
	private String changedBy;

	@Column(name="PP_HISTORY_CIRCUIT")
	private String circuit;

	@Column(name="PP_HISTORY_FINISH_DATE")
	private Date finishDate;

	@Column(name="PP_HISTORY_FOR")
	private String historyFor;

	@Column(name="PP_HISTORY_STATUS")
	private String status;

	@Column(name="PP_HISTORY_TIMESTAMP_CHANGE")
	private Date timestampChange;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_DISTRIBUTOR_OID_DISTRIBUTOR")
	private DistributorPoint distributorPoint;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_PORTOID_PORT")
	private Port port;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSITION_UOID_TU_POINT")
	private TransitionUnitPoint transitionUnitPoint;

	private static final long serialVersionUID = 1L;

	public PpHistory() {
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
	 * @return the changedBy
	 */
	public String getChangedBy() {
		return changedBy;
	}

	/**
	 * @param changedBy the changedBy to set
	 */
	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	/**
	 * @return the circuit
	 */
	public String getCircuit() {
		return circuit;
	}

	/**
	 * @param circuit the circuit to set
	 */
	public void setCircuit(String circuit) {
		this.circuit = circuit;
	}

	/**
	 * @return the finishDate
	 */
	public Date getFinishDate() {
		return finishDate;
	}

	/**
	 * @param finishDate the finishDate to set
	 */
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	/**
	 * @return the historyFor
	 */
	public String getHistoryFor() {
		return historyFor;
	}

	/**
	 * @param historyFor the historyFor to set
	 */
	public void setHistoryFor(String historyFor) {
		this.historyFor = historyFor;
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
	 * @return the timestampChange
	 */
	public Date getTimestampChange() {
		return timestampChange;
	}

	/**
	 * @param timestampChange the timestampChange to set
	 */
	public void setTimestampChange(Date timestampChange) {
		this.timestampChange = timestampChange;
	}

	/**
	 * @return the distributorPoint
	 */
	public DistributorPoint getDistributorPoint() {
		return distributorPoint;
	}

	/**
	 * @param distributorPoint the distributorPoint to set
	 */
	public void setDistributorPoint(DistributorPoint distributorPoint) {
		this.distributorPoint = distributorPoint;
	}

	/**
	 * @return the port
	 */
	public Port getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(Port port) {
		this.port = port;
	}

	/**
	 * @return the transitionUnitPoint
	 */
	public TransitionUnitPoint getTransitionUnitPoint() {
		return transitionUnitPoint;
	}

	/**
	 * @param transitionUnitPoint the transitionUnitPoint to set
	 */
	public void setTransitionUnitPoint(TransitionUnitPoint transitionUnitPoint) {
		this.transitionUnitPoint = transitionUnitPoint;
	}

}
