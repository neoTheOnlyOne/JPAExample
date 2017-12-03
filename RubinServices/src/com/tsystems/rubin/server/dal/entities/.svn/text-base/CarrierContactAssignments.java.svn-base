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
@Table(name="CARRIER_CONTACT_ASSIGNMENTS")
public class CarrierContactAssignments implements Serializable {
	@Id
	@Column(name="OID")
	private Long id;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CARRIEROID_CARRIER")
	private Carrier carrier;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CARRIER_CONTOID")
	private CarrierContactFuctions carrierContactFuctions;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_GENERAL_NDS_OID_GNC")
	private GeneralNdsContact generalNdsContact;

	private static final long serialVersionUID = 1L;

	public CarrierContactAssignments() {
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
	 * @return the carrier
	 */
	public Carrier getCarrier() {
		return carrier;
	}

	/**
	 * @param carrier the carrier to set
	 */
	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

	/**
	 * @return the carrierContactFuctions
	 */
	public CarrierContactFuctions getCarrierContactFuctions() {
		return carrierContactFuctions;
	}

	/**
	 * @param carrierContactFuctions the carrierContactFuctions to set
	 */
	public void setCarrierContactFuctions(
			CarrierContactFuctions carrierContactFuctions) {
		this.carrierContactFuctions = carrierContactFuctions;
	}

	/**
	 * @return the generalNdsContact
	 */
	public GeneralNdsContact getGeneralNdsContact() {
		return generalNdsContact;
	}

	/**
	 * @param generalNdsContact the generalNdsContact to set
	 */
	public void setGeneralNdsContact(GeneralNdsContact generalNdsContact) {
		this.generalNdsContact = generalNdsContact;
	}

	

}
