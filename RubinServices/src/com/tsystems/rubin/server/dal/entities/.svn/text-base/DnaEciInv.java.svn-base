package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DNA_ECI_INV")
public class DnaEciInv implements Serializable {
	@Id
	@Column(name="OID_ECI_INV")
	private Long id;

	private String abbreviation;

	@Column(name="ECI_STATUS")
	private String status;

	@Column(name="EMS_NAME")
	private String emsName;

	@Column(name="EMS_NAME_SUCH_BSI")
	private String nameSearch;

	private String endpunkt;

	@Column(name="FK_CARDOID_CARD")
	private Long fkCardoidCard;

	private String name;

	private String ne;

	private String serial;

	private String type;

	private static final long serialVersionUID = 1L;

	public DnaEciInv() {
		super();
	}

	public long getOidEciInv() {
		return this.id;
	}

	public void setOidEciInv(long oidEciInv) {
		this.id = oidEciInv;
	}

	public String getAbbreviation() {
		return this.abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getEciStatus() {
		return this.status;
	}

	public void setEciStatus(String eciStatus) {
		this.status = eciStatus;
	}

	public String getEmsName() {
		return this.emsName;
	}

	public void setEmsName(String emsName) {
		this.emsName = emsName;
	}

	public String getEmsNameSuchBsi() {
		return this.nameSearch;
	}

	public void setEmsNameSuchBsi(String emsNameSuchBsi) {
		this.nameSearch = emsNameSuchBsi;
	}

	public String getEndpunkt() {
		return this.endpunkt;
	}

	public void setEndpunkt(String endpunkt) {
		this.endpunkt = endpunkt;
	}

	public Long getFkCardoidCard() {
		return this.fkCardoidCard;
	}

	public void setFkCardoidCard(Long fkCardoidCard) {
		this.fkCardoidCard = fkCardoidCard;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNe() {
		return this.ne;
	}

	public void setNe(String ne) {
		this.ne = ne;
	}

	public String getSerial() {
		return this.serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
