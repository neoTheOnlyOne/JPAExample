package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="IRU_KONTINGENT")
public class IruKontingent implements Serializable {
	@Id
	@Column(name="OID_IRU_KONTINGENT")
	private Long id;

	@Column(name="DATUM_KONTINGENT_B")
	private Date datumKontingentB;

	@Column(name="FK_IRU_NEHMEROID_I")
	private Long fkIruNehmeroidI;

	@Column(name="IRU_KONTING_IN_64K")
	private Long iruKontingIn64k;

	@Column(name="IRU_KONTINGENT_WEI")
	private Long iruKontingentWei;

	@Column(name="IRU_VERKAUFSPREIS")
	private Long iruVerkaufspreis;

	@Column(name="IRU_VERTRAG_GUELT0")
	private Date iruVertragGuelt0;

	@Column(name="IRU_VERTRAG_GUELTI")
	private Date iruVertragGuelti;

	@Column(name="KONTINGENT_BESCHAL")
	private Long kontingentBeschal;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_DIENSTOID_DIENS")
	private Service service;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KAPAZITAETOID_K")
	private Capacity capacity;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_NUTZUNGSKONTOID")
	private Nutzungskontingent nutzungskontingent;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WAEHRUNGOID_WAE")
	private Waehrung waehrung;

	private static final long serialVersionUID = 1L;

	public IruKontingent() {
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
	 * @return the datumKontingentB
	 */
	public Date getDatumKontingentB() {
		return datumKontingentB;
	}

	/**
	 * @param datumKontingentB the datumKontingentB to set
	 */
	public void setDatumKontingentB(Date datumKontingentB) {
		this.datumKontingentB = datumKontingentB;
	}

	/**
	 * @return the fkIruNehmeroidI
	 */
	public Long getFkIruNehmeroidI() {
		return fkIruNehmeroidI;
	}

	/**
	 * @param fkIruNehmeroidI the fkIruNehmeroidI to set
	 */
	public void setFkIruNehmeroidI(Long fkIruNehmeroidI) {
		this.fkIruNehmeroidI = fkIruNehmeroidI;
	}

	/**
	 * @return the iruKontingIn64k
	 */
	public Long getIruKontingIn64k() {
		return iruKontingIn64k;
	}

	/**
	 * @param iruKontingIn64k the iruKontingIn64k to set
	 */
	public void setIruKontingIn64k(Long iruKontingIn64k) {
		this.iruKontingIn64k = iruKontingIn64k;
	}

	/**
	 * @return the iruKontingentWei
	 */
	public Long getIruKontingentWei() {
		return iruKontingentWei;
	}

	/**
	 * @param iruKontingentWei the iruKontingentWei to set
	 */
	public void setIruKontingentWei(Long iruKontingentWei) {
		this.iruKontingentWei = iruKontingentWei;
	}

	/**
	 * @return the iruVerkaufspreis
	 */
	public Long getIruVerkaufspreis() {
		return iruVerkaufspreis;
	}

	/**
	 * @param iruVerkaufspreis the iruVerkaufspreis to set
	 */
	public void setIruVerkaufspreis(Long iruVerkaufspreis) {
		this.iruVerkaufspreis = iruVerkaufspreis;
	}

	/**
	 * @return the iruVertragGuelt0
	 */
	public Date getIruVertragGuelt0() {
		return iruVertragGuelt0;
	}

	/**
	 * @param iruVertragGuelt0 the iruVertragGuelt0 to set
	 */
	public void setIruVertragGuelt0(Date iruVertragGuelt0) {
		this.iruVertragGuelt0 = iruVertragGuelt0;
	}

	/**
	 * @return the iruVertragGuelti
	 */
	public Date getIruVertragGuelti() {
		return iruVertragGuelti;
	}

	/**
	 * @param iruVertragGuelti the iruVertragGuelti to set
	 */
	public void setIruVertragGuelti(Date iruVertragGuelti) {
		this.iruVertragGuelti = iruVertragGuelti;
	}

	/**
	 * @return the kontingentBeschal
	 */
	public Long getKontingentBeschal() {
		return kontingentBeschal;
	}

	/**
	 * @param kontingentBeschal the kontingentBeschal to set
	 */
	public void setKontingentBeschal(Long kontingentBeschal) {
		this.kontingentBeschal = kontingentBeschal;
	}

	/**
	 * @return the service
	 */
	public Service getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(Service service) {
		this.service = service;
	}

	/**
	 * @return the capacity
	 */
	public Capacity getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(Capacity capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the nutzungskontingent
	 */
	public Nutzungskontingent getNutzungskontingent() {
		return nutzungskontingent;
	}

	/**
	 * @param nutzungskontingent the nutzungskontingent to set
	 */
	public void setNutzungskontingent(Nutzungskontingent nutzungskontingent) {
		this.nutzungskontingent = nutzungskontingent;
	}

	/**
	 * @return the waehrung
	 */
	public Waehrung getWaehrung() {
		return waehrung;
	}

	/**
	 * @param waehrung the waehrung to set
	 */
	public void setWaehrung(Waehrung waehrung) {
		this.waehrung = waehrung;
	}

}
