package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Weg implements Serializable {
	@Id
	private long oid;

	private String name;

	private String remark;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_NETZWERKOID")
	private Netzwerk fkNetzwerkoid;

	@OneToMany(mappedBy="fkWegoid")
	private Set<Transportverbindun> transportverbindunCollection;

	private static final long serialVersionUID = 1L;

	public Weg() {
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Netzwerk getFkNetzwerkoid() {
		return this.fkNetzwerkoid;
	}

	public void setFkNetzwerkoid(Netzwerk fkNetzwerkoid) {
		this.fkNetzwerkoid = fkNetzwerkoid;
	}

	public Set<Transportverbindun> getTransportverbindunCollection() {
		return this.transportverbindunCollection;
	}

	public void setTransportverbindunCollection(Set<Transportverbindun> transportverbindunCollection) {
		this.transportverbindunCollection = transportverbindunCollection;
	}

}
