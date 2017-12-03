package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cac implements Serializable {
	@Id
	@Column(name="OID_CAC")
	private long oidCac;

	@Column(name="KIND_OF_NMS")
	private String kindOfNms;

	private String cac;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID_TRANSPORTVE")
	private Transportverbindun fkTransportveroidTransportve;

	private static final long serialVersionUID = 1L;

	public Cac() {
		super();
	}

	public long getOidCac() {
		return this.oidCac;
	}

	public void setOidCac(long oidCac) {
		this.oidCac = oidCac;
	}

	public String getKindOfNms() {
		return this.kindOfNms;
	}

	public void setKindOfNms(String kindOfNms) {
		this.kindOfNms = kindOfNms;
	}

	public String getCac() {
		return this.cac;
	}

	public void setCac(String cac) {
		this.cac = cac;
	}

	public Transportverbindun getFkTransportveroidTransportve() {
		return this.fkTransportveroidTransportve;
	}

	public void setFkTransportveroidTransportve(Transportverbindun fkTransportveroidTransportve) {
		this.fkTransportveroidTransportve = fkTransportveroidTransportve;
	}

}
