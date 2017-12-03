package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="OMS_ORDER")
public class OmsOrder implements Serializable {
	@Id
	@Column(name="OID_OMS_ORDER")
	private Long id;

	@Column(name="DATE_N")
	private Date dateN;

	@Column(name="DATE_Z")
	private Date dateZ;

	@Column(name="OMS_ID")
	private String omsId;

	@Column(name="OMS_ORDER_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="OMS_ORDER_UPDATED_BY")
	private String updatedBy;

	@Column(name="OMS_STATE")
	private String state;

	@Column(name="ORDER_TYPE")
	private String orderType;

	@Column(name="PROCESSTYPE")
	private String processtype;

	@Column(name="REMARKS")
	private String remarks;

	@OneToMany(mappedBy="omsOrder")
	private Set<CWO> cwos;

	@OneToMany(mappedBy="omsOrder")
	private Set<Circuit> circuits;

	private static final long serialVersionUID = 1L;

	public OmsOrder() {
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
	 * @return the dateN
	 */
	public Date getDateN() {
		return dateN;
	}

	/**
	 * @param dateN the dateN to set
	 */
	public void setDateN(Date dateN) {
		this.dateN = dateN;
	}

	/**
	 * @return the dateZ
	 */
	public Date getDateZ() {
		return dateZ;
	}

	/**
	 * @param dateZ the dateZ to set
	 */
	public void setDateZ(Date dateZ) {
		this.dateZ = dateZ;
	}

	/**
	 * @return the omsId
	 */
	public String getOmsId() {
		return omsId;
	}

	/**
	 * @param omsId the omsId to set
	 */
	public void setOmsId(String omsId) {
		this.omsId = omsId;
	}

	/**
	 * @return the dateUpdated
	 */
	public Date getDateUpdated() {
		return dateUpdated;
	}

	/**
	 * @param dateUpdated the dateUpdated to set
	 */
	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the orderType
	 */
	public String getOrderType() {
		return orderType;
	}

	/**
	 * @param orderType the orderType to set
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	/**
	 * @return the processtype
	 */
	public String getProcesstype() {
		return processtype;
	}

	/**
	 * @param processtype the processtype to set
	 */
	public void setProcesstype(String processtype) {
		this.processtype = processtype;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the cwos
	 */
	public Set<CWO> getCwos() {
		return cwos;
	}

	/**
	 * @param cwos the cwos to set
	 */
	public void setCwos(Set<CWO> cwos) {
		this.cwos = cwos;
	}

	/**
	 * @return the circuits
	 */
	public Set<Circuit> getCircuits() {
		return circuits;
	}

	/**
	 * @param circuits the circuits to set
	 */
	public void setCircuits(Set<Circuit> circuits) {
		this.circuits = circuits;
	}

}
