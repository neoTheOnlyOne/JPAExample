package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Konfiguration implements Serializable {
	@Id
	@Column(name="OID_KONFIGURATION")
	private long oidKonfiguration;

	@Column(name="KONFIGURATIONS_BEG")
	private Date konfigurationsBeg;

	@Column(name="KONFIGURATIONS_END")
	private Date konfigurationsEnd;

	@Column(name="KONFIGURATIONS_NOT")
	private String konfigurationsNot;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID")
	private Transportverbindun fkTransportveroid;

	@OneToMany(mappedBy="fkKonfiguratiooid")
	private Set<Kanal> kanalCollection;

	@ManyToMany(mappedBy="konfigurationCollection")
	private Set<FaultRecord> faultRecordCollection;

	private static final long serialVersionUID = 1L;

	public Konfiguration() {
		super();
	}

	public long getOidKonfiguration() {
		return this.oidKonfiguration;
	}

	public void setOidKonfiguration(long oidKonfiguration) {
		this.oidKonfiguration = oidKonfiguration;
	}

	public Date getKonfigurationsBeg() {
		return this.konfigurationsBeg;
	}

	public void setKonfigurationsBeg(Date konfigurationsBeg) {
		this.konfigurationsBeg = konfigurationsBeg;
	}

	public Date getKonfigurationsEnd() {
		return this.konfigurationsEnd;
	}

	public void setKonfigurationsEnd(Date konfigurationsEnd) {
		this.konfigurationsEnd = konfigurationsEnd;
	}

	public String getKonfigurationsNot() {
		return this.konfigurationsNot;
	}

	public void setKonfigurationsNot(String konfigurationsNot) {
		this.konfigurationsNot = konfigurationsNot;
	}

	public Transportverbindun getFkTransportveroid() {
		return this.fkTransportveroid;
	}

	public void setFkTransportveroid(Transportverbindun fkTransportveroid) {
		this.fkTransportveroid = fkTransportveroid;
	}

	public Set<Kanal> getKanalCollection() {
		return this.kanalCollection;
	}

	public void setKanalCollection(Set<Kanal> kanalCollection) {
		this.kanalCollection = kanalCollection;
	}

	public Set<FaultRecord> getFaultRecordCollection() {
		return this.faultRecordCollection;
	}

	public void setFaultRecordCollection(Set<FaultRecord> faultRecordCollection) {
		this.faultRecordCollection = faultRecordCollection;
	}

}
