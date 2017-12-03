package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="INFO_CABLE")
public class InfoCable implements Serializable {
	@EmbeddedId
	private InfoCablePK infoCablePK;

	@Column(name="CA_CB_DESIGNATION")
	private String caCbDesignation;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="CA_DISTRIB_E_A1_FK", referencedColumnName="DE_DISTRIB_E_ID"),
		@JoinColumn(name="CA_DISTRIB_E_A2_FK", referencedColumnName="DE_OID_DISTRIBUTOR")
	})
	private InfoDistributorE infoDistributorE;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="CA_DISTRIB_E_B1_FK", referencedColumnName="DE_DISTRIB_E_ID"),
		@JoinColumn(name="CA_DISTRIB_E_B2_FK", referencedColumnName="DE_OID_DISTRIBUTOR")
	})
	private InfoDistributorE infoDistributorE2;

	private static final long serialVersionUID = 1L;

	public InfoCable() {
		super();
	}

	

	/**
	 * @return the infoCablePK
	 */
	public InfoCablePK getInfoCablePK() {
		return infoCablePK;
	}



	/**
	 * @param infoCablePK the infoCablePK to set
	 */
	public void setInfoCablePK(InfoCablePK infoCablePK) {
		this.infoCablePK = infoCablePK;
	}



	public String getCaCbDesignation() {
		return this.caCbDesignation;
	}

	public void setCaCbDesignation(String caCbDesignation) {
		this.caCbDesignation = caCbDesignation;
	}

	public InfoDistributorE getInfoDistributorE() {
		return this.infoDistributorE;
	}

	public void setInfoDistributorE(InfoDistributorE infoDistributorE) {
		this.infoDistributorE = infoDistributorE;
	}

	public InfoDistributorE getInfoDistributorE2() {
		return this.infoDistributorE2;
	}

	public void setInfoDistributorE2(InfoDistributorE infoDistributorE2) {
		this.infoDistributorE2 = infoDistributorE2;
	}


	
}
