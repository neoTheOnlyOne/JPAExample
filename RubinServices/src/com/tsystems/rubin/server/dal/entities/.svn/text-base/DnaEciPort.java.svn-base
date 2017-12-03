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
@Table(name="DNA_ECI_PORT")
public class DnaEciPort implements Serializable {
	@Id
	@Column(name="OID")
	private Long id;

	private String circuit;

	private String ne;

	private String object;

	private String port;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_PORTOID_PORT")
	private Port port1;

	private static final long serialVersionUID = 1L;

	public DnaEciPort() {
		super();
	}

	public long getOid() {
		return this.id;
	}

	public void setOid(long oid) {
		this.id = oid;
	}

	public String getCircuit() {
		return this.circuit;
	}

	public void setCircuit(String circuit) {
		this.circuit = circuit;
	}

	public String getNe() {
		return this.ne;
	}

	public void setNe(String ne) {
		this.ne = ne;
	}

	public String getObject() {
		return this.object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public Port getFkPort() {
		return this.port1;
	}

	public void setFkPort(Port port1) {
		this.port1 = port1;
	}

}
