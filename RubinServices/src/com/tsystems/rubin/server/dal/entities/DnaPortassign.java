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
@Table(name="DNA_PORTASSIGN")
public class DnaPortassign implements Serializable {
	@Id
	@Column(name="OID_PORTASSIGN")
	private Long id;

	private String circuitcac;

	private String circuitid;

	private String portaddress;

	private String portnumber;

	private String tid;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_DNA_SLOTTBLOID_SLOTTBL")
	private DnaSlottbl dnaSlottbl;

	private static final long serialVersionUID = 1L;

	public DnaPortassign() {
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
	 * @return the circuitcac
	 */
	public String getCircuitcac() {
		return circuitcac;
	}

	/**
	 * @param circuitcac the circuitcac to set
	 */
	public void setCircuitcac(String circuitcac) {
		this.circuitcac = circuitcac;
	}

	/**
	 * @return the circuitid
	 */
	public String getCircuitid() {
		return circuitid;
	}

	/**
	 * @param circuitid the circuitid to set
	 */
	public void setCircuitid(String circuitid) {
		this.circuitid = circuitid;
	}

	/**
	 * @return the portaddress
	 */
	public String getPortaddress() {
		return portaddress;
	}

	/**
	 * @param portaddress the portaddress to set
	 */
	public void setPortaddress(String portaddress) {
		this.portaddress = portaddress;
	}

	/**
	 * @return the portnumber
	 */
	public String getPortnumber() {
		return portnumber;
	}

	/**
	 * @param portnumber the portnumber to set
	 */
	public void setPortnumber(String portnumber) {
		this.portnumber = portnumber;
	}

	/**
	 * @return the tid
	 */
	public String getTid() {
		return tid;
	}

	/**
	 * @param tid the tid to set
	 */
	public void setTid(String tid) {
		this.tid = tid;
	}

	/**
	 * @return the dnaSlottbl
	 */
	public DnaSlottbl getDnaSlottbl() {
		return dnaSlottbl;
	}

	/**
	 * @param dnaSlottbl the dnaSlottbl to set
	 */
	public void setDnaSlottbl(DnaSlottbl dnaSlottbl) {
		this.dnaSlottbl = dnaSlottbl;
	}

	
}
