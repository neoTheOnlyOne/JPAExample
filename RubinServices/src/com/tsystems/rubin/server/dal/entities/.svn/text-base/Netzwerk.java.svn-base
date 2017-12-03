package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Netzwerk implements Serializable {
	@Id
	private long oid;

	private String name;

	@Column(name="NAME_SUCH_BSI")
	private String nameSuchBsi;

	private String remark;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_CARRIEROID_CARRIER")
	private Carrier fkCarrieroidCarrier;

	@OneToMany(mappedBy="fkNetzwerkoid")
	private Set<Weg> wegCollection;

	@OneToMany(mappedBy="fkNetzwerkoid")
	private Set<Transportverbindun> transportverbindunCollection;

	private static final long serialVersionUID = 1L;

	public Netzwerk() {
		super();
	}

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameSuchBsi() {
		return this.nameSuchBsi;
	}

	public void setNameSuchBsi(String nameSuchBsi) {
		this.nameSuchBsi = nameSuchBsi;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Carrier getFkCarrieroidCarrier() {
		return this.fkCarrieroidCarrier;
	}

	public void setFkCarrieroidCarrier(Carrier fkCarrieroidCarrier) {
		this.fkCarrieroidCarrier = fkCarrieroidCarrier;
	}

	public Set<Weg> getWegCollection() {
		return this.wegCollection;
	}

	public void setWegCollection(Set<Weg> wegCollection) {
		this.wegCollection = wegCollection;
	}

	public Set<Transportverbindun> getTransportverbindunCollection() {
		return this.transportverbindunCollection;
	}

	public void setTransportverbindunCollection(Set<Transportverbindun> transportverbindunCollection) {
		this.transportverbindunCollection = transportverbindunCollection;
	}

}
