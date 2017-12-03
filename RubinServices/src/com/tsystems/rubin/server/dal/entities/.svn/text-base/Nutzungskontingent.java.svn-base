package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Nutzungskontingent implements Serializable {
	@Id
	@Column(name="OID_NUTZUNGSKONTIN")
	private Long id;

	@Column(name="DATUM_KONTINGENT_B")
	private Date datumKontingentB;

	@Column(name="KONTINGENT_BESCHA0")
	private Long kontingentBescha0;

	@Column(name="KONTINGENT_BESCHAL")
	private Long kontingentBeschal;

	@Column(name="KONTINGENT_GEPLANT")
	private Long kontingentGeplant;

	@Column(name="KONTINGENT_NUTZBAR")
	private Long kontingentNutzbar;

	@Column(name="KONTINGENT_VEREINB")
	private Long kontingentVereinb;

	@Column(name="KOSTEN_PRO_KONTING")
	private Long kostenProKonting;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_DIENSTOID_DIENS")
	private Service service;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KAPAZITAETOID_K")
	private Capacity capacity;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_NUTZUNGSPARTOID")
	private Nutzungspartner nutzungspartner;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WAEHRUNGOID_WAE")
	private Waehrung waehrung;

	@OneToMany(mappedBy="nutzungskontingent")
	private Set<ContractLink> contractLinks;

	@OneToMany(mappedBy="nutzungskontingent")
	private Set<IruKontingent> iruKontingents;

	@OneToMany(mappedBy="nutzungskontingent")
	private Set<RoutingSection> routingSections;

	private static final long serialVersionUID = 1L;

	public Nutzungskontingent() {
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
	 * @return the kontingentBescha0
	 */
	public Long getKontingentBescha0() {
		return kontingentBescha0;
	}

	/**
	 * @param kontingentBescha0 the kontingentBescha0 to set
	 */
	public void setKontingentBescha0(Long kontingentBescha0) {
		this.kontingentBescha0 = kontingentBescha0;
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
	 * @return the kontingentGeplant
	 */
	public Long getKontingentGeplant() {
		return kontingentGeplant;
	}

	/**
	 * @param kontingentGeplant the kontingentGeplant to set
	 */
	public void setKontingentGeplant(Long kontingentGeplant) {
		this.kontingentGeplant = kontingentGeplant;
	}

	/**
	 * @return the kontingentNutzbar
	 */
	public Long getKontingentNutzbar() {
		return kontingentNutzbar;
	}

	/**
	 * @param kontingentNutzbar the kontingentNutzbar to set
	 */
	public void setKontingentNutzbar(Long kontingentNutzbar) {
		this.kontingentNutzbar = kontingentNutzbar;
	}

	/**
	 * @return the kontingentVereinb
	 */
	public Long getKontingentVereinb() {
		return kontingentVereinb;
	}

	/**
	 * @param kontingentVereinb the kontingentVereinb to set
	 */
	public void setKontingentVereinb(Long kontingentVereinb) {
		this.kontingentVereinb = kontingentVereinb;
	}

	/**
	 * @return the kostenProKonting
	 */
	public Long getKostenProKonting() {
		return kostenProKonting;
	}

	/**
	 * @param kostenProKonting the kostenProKonting to set
	 */
	public void setKostenProKonting(Long kostenProKonting) {
		this.kostenProKonting = kostenProKonting;
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
	 * @return the nutzungspartner
	 */
	public Nutzungspartner getNutzungspartner() {
		return nutzungspartner;
	}

	/**
	 * @param nutzungspartner the nutzungspartner to set
	 */
	public void setNutzungspartner(Nutzungspartner nutzungspartner) {
		this.nutzungspartner = nutzungspartner;
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

	/**
	 * @return the contractLinks
	 */
	public Set<ContractLink> getContractLinks() {
		return contractLinks;
	}

	/**
	 * @param contractLinks the contractLinks to set
	 */
	public void setContractLinks(Set<ContractLink> contractLinks) {
		this.contractLinks = contractLinks;
	}

	/**
	 * @return the iruKontingents
	 */
	public Set<IruKontingent> getIruKontingents() {
		return iruKontingents;
	}

	/**
	 * @param iruKontingents the iruKontingents to set
	 */
	public void setIruKontingents(Set<IruKontingent> iruKontingents) {
		this.iruKontingents = iruKontingents;
	}

	/**
	 * @return the routingSections
	 */
	public Set<RoutingSection> getRoutingSections() {
		return routingSections;
	}

	/**
	 * @param routingSections the routingSections to set
	 */
	public void setRoutingSections(Set<RoutingSection> routingSections) {
		this.routingSections = routingSections;
	}
}
