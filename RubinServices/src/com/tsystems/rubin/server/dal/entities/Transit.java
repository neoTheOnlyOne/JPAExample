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
public class Transit implements Serializable {
	@Id
	@Column(name="OID_TRANSIT")
	private Long id;

	@Column(name="BEARBEITERKENNUNG")
	private String userId;

	@Column(name="BEZEICHG_TRANSIT")
	private String bezeichgTransit;

	@Column(name="BEZEICHG_TRANSIT_S")
	private String bezeichgTransitS;

	@Column(name="FK_LINIEOID_LINIE")
	private Long fkLinieoidLinie;

	private Long gesamttransitkapaz;

	@Column(name="IKS_T_ID_NUMMER")
	private String iksTIdNummer;

	@Column(name="KOSTEN_PRO_EINHEIT")
	private Long kostenProEinheit;

	@Column(name="LETZTE_AKTUALISIER")
	private Date lastUpdate;

	@Column(name="TRANSITBEGINN")
	private Date begin;

	private String transitbereich;

	@Column(name="TRANSITENDE")
	private Date end;

	private Long transitlaenge;

	@Column(name="TRANSITNOTIZ")
	private String remark;

	@Column(name="TRANSITSTATUS_2")
	private String transitstatus2;

	private String transitsystemart;

	@Column(name="TRANSITTYP")
	private String type;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CARRIEROID_CARR")
	private Carrier carrier;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KAPAZITAETOID_K")
	private Capacity capacity;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WAEHRUNGOID_WAE")
	private Waehrung waehrung;

	@OneToMany(mappedBy="transit")
	private Set<Transitteilmenge> transitteilmenges;

	@OneToMany(mappedBy="transit")
	private Set<Instandhaltungskos> instandhaltungskos;

	@OneToMany(mappedBy="transit")
	private Set<Investition> investitions;

	@OneToMany(mappedBy="transit")
	private Set<Nutzungsrechte> nutzungsrechtes;

	private static final long serialVersionUID = 1L;

	public Transit() {
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
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the bezeichgTransit
	 */
	public String getBezeichgTransit() {
		return bezeichgTransit;
	}

	/**
	 * @param bezeichgTransit the bezeichgTransit to set
	 */
	public void setBezeichgTransit(String bezeichgTransit) {
		this.bezeichgTransit = bezeichgTransit;
	}

	/**
	 * @return the bezeichgTransitS
	 */
	public String getBezeichgTransitS() {
		return bezeichgTransitS;
	}

	/**
	 * @param bezeichgTransitS the bezeichgTransitS to set
	 */
	public void setBezeichgTransitS(String bezeichgTransitS) {
		this.bezeichgTransitS = bezeichgTransitS;
	}

	/**
	 * @return the fkLinieoidLinie
	 */
	public Long getFkLinieoidLinie() {
		return fkLinieoidLinie;
	}

	/**
	 * @param fkLinieoidLinie the fkLinieoidLinie to set
	 */
	public void setFkLinieoidLinie(Long fkLinieoidLinie) {
		this.fkLinieoidLinie = fkLinieoidLinie;
	}

	/**
	 * @return the gesamttransitkapaz
	 */
	public Long getGesamttransitkapaz() {
		return gesamttransitkapaz;
	}

	/**
	 * @param gesamttransitkapaz the gesamttransitkapaz to set
	 */
	public void setGesamttransitkapaz(Long gesamttransitkapaz) {
		this.gesamttransitkapaz = gesamttransitkapaz;
	}

	/**
	 * @return the iksTIdNummer
	 */
	public String getIksTIdNummer() {
		return iksTIdNummer;
	}

	/**
	 * @param iksTIdNummer the iksTIdNummer to set
	 */
	public void setIksTIdNummer(String iksTIdNummer) {
		this.iksTIdNummer = iksTIdNummer;
	}

	/**
	 * @return the kostenProEinheit
	 */
	public Long getKostenProEinheit() {
		return kostenProEinheit;
	}

	/**
	 * @param kostenProEinheit the kostenProEinheit to set
	 */
	public void setKostenProEinheit(Long kostenProEinheit) {
		this.kostenProEinheit = kostenProEinheit;
	}

	/**
	 * @return the lastUpdate
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * @param lastUpdate the lastUpdate to set
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * @return the begin
	 */
	public Date getBegin() {
		return begin;
	}

	/**
	 * @param begin the begin to set
	 */
	public void setBegin(Date begin) {
		this.begin = begin;
	}

	/**
	 * @return the transitbereich
	 */
	public String getTransitbereich() {
		return transitbereich;
	}

	/**
	 * @param transitbereich the transitbereich to set
	 */
	public void setTransitbereich(String transitbereich) {
		this.transitbereich = transitbereich;
	}

	/**
	 * @return the end
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(Date end) {
		this.end = end;
	}

	/**
	 * @return the transitlaenge
	 */
	public Long getTransitlaenge() {
		return transitlaenge;
	}

	/**
	 * @param transitlaenge the transitlaenge to set
	 */
	public void setTransitlaenge(Long transitlaenge) {
		this.transitlaenge = transitlaenge;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the transitstatus2
	 */
	public String getTransitstatus2() {
		return transitstatus2;
	}

	/**
	 * @param transitstatus2 the transitstatus2 to set
	 */
	public void setTransitstatus2(String transitstatus2) {
		this.transitstatus2 = transitstatus2;
	}

	/**
	 * @return the transitsystemart
	 */
	public String getTransitsystemart() {
		return transitsystemart;
	}

	/**
	 * @param transitsystemart the transitsystemart to set
	 */
	public void setTransitsystemart(String transitsystemart) {
		this.transitsystemart = transitsystemart;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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
	 * @return the transitteilmenges
	 */
	public Set<Transitteilmenge> getTransitteilmenges() {
		return transitteilmenges;
	}

	/**
	 * @param transitteilmenges the transitteilmenges to set
	 */
	public void setTransitteilmenges(Set<Transitteilmenge> transitteilmenges) {
		this.transitteilmenges = transitteilmenges;
	}

	/**
	 * @return the instandhaltungskos
	 */
	public Set<Instandhaltungskos> getInstandhaltungskos() {
		return instandhaltungskos;
	}

	/**
	 * @param instandhaltungskos the instandhaltungskos to set
	 */
	public void setInstandhaltungskos(Set<Instandhaltungskos> instandhaltungskos) {
		this.instandhaltungskos = instandhaltungskos;
	}

	/**
	 * @return the investitions
	 */
	public Set<Investition> getInvestitions() {
		return investitions;
	}

	/**
	 * @param investitions the investitions to set
	 */
	public void setInvestitions(Set<Investition> investitions) {
		this.investitions = investitions;
	}

	/**
	 * @return the nutzungsrechtes
	 */
	public Set<Nutzungsrechte> getNutzungsrechtes() {
		return nutzungsrechtes;
	}

	/**
	 * @param nutzungsrechtes the nutzungsrechtes to set
	 */
	public void setNutzungsrechtes(Set<Nutzungsrechte> nutzungsrechtes) {
		this.nutzungsrechtes = nutzungsrechtes;
	}

}
