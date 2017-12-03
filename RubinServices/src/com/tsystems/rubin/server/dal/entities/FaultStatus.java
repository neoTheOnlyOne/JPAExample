package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="FAULT_STATUS")
public class FaultStatus implements Serializable {
	@EmbeddedId
	private FaultStatusPK faultStatusPK;

	@Column(name="BEARBEITUNGS_STATUS")
	private String processingStatus;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_FAULT_RECORDOID_FAULTRECORD")
	private FaultRecord faultRecord;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_FUEHRUNGOID_FUEHRUNG")
	private Routing routing;

	private static final long serialVersionUID = 1L;

	public FaultStatus() {
		super();
	}



	/**
	 * @return the faultStatusPK
	 */
	public FaultStatusPK getFaultStatusPK() {
		return faultStatusPK;
	}



	/**
	 * @param faultStatusPK the faultStatusPK to set
	 */
	public void setFaultStatusPK(FaultStatusPK faultStatusPK) {
		this.faultStatusPK = faultStatusPK;
	}



	public String getBearbeitungsStatus() {
		return this.processingStatus;
	}

	public void setBearbeitungsStatus(String bearbeitungsStatus) {
		this.processingStatus = bearbeitungsStatus;
	}

	public FaultRecord getFkFaultRecord() {
		return this.faultRecord;
	}

	public void setFkFaultRecord(FaultRecord fkFaultRecord) {
		this.faultRecord = fkFaultRecord;
	}

	public Routing getFkFuehrung() {
		return this.routing;
	}

	public void setFkFuehrung(Routing fkFuehrung) {
		this.routing = fkFuehrung;
	}


	

}
