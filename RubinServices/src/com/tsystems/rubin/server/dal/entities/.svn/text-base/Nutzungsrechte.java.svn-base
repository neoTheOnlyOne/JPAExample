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
public class Nutzungsrechte implements Serializable {
	@Id
	@Column(name="OID_NUTZUNGSRECHTE")
	private Long id;

	@Column(name="BEARBEITERKENNUNG")
	private String userId;

	@Column(name="BEMERKUNG_1")
	private String remark1;

	@Column(name="BEMERKUNG_2")
	private String remark2;

	@Column(name="BEMERKUNG_3")
	private String remark3;

	@Column(name="IRU_RECHTE_ERWORBE")
	private Long iruRechteErworbe;

	@Column(name="IRU_RECHTE_VERK_JO")
	private Long iruRechteVerkJo;

	@Column(name="IRU_RECHTE_VERK_WH")
	private Long iruRechteVerkWh;

	@Column(name="IRU_RECHTE_VERKAUF")
	private Long iruRechteVerkauf;

	@Column(name="JOINTLY_OWNED")
	private Long jointlyOwned;

	@Column(name="KOSTEN_PRO_IRU")
	private Long kostenProIru;

	@Column(name="KOSTEN_PRO_NUTZUNG")
	private Long kostenProNutzung;

	@Column(name="LETZTE_AKTUALISIER")
	private Date lastUpdate;

	private String nutzungsrechteart;

	private String nutzungsrechtenoti;

	private Long nutzungsrechtenumm;

	@Column(name="PREIS_PRO_IRU_VERK")
	private Long preisProIruVerk;

	@Column(name="WHOLY_OWNED")
	private Long wholyOwned;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK0ENDPUNKTOID_END")
	private Terminal terminal0;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ENDPUNKTOID_END")
	private Terminal terminal;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK0KAPAZITAETOID_K")
	private Capacity capacity0;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KAPAZITAETOID_K")
	private Capacity capacity;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK1KAPAZITAETOID_K")
	private Capacity capacity1;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SEEKABELVERTOID")
	private Seekabelvertrag seekabelvertrag;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSITOID_TRAN")
	private Transit transit;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WAEHRUNGOID_WAE")
	private Waehrung waehrung;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK0WAEHRUNGOID_WAE")
	private Waehrung waehrung0;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK1WAEHRUNGOID_WAE")
	private Waehrung waehrung1;

	@OneToMany(mappedBy="nutzungsrechte")
	private Set<Landfuehrungsabsch> landfuehrungsabschs;

	@OneToMany(mappedBy="nutzungsrechte")
	private Set<Nutzungspartner> nutzungspartners;

	@OneToMany(mappedBy="nutzungsrechte")
	private Set<Restorationkostenp> restorationkostenps;

	@OneToMany(mappedBy="nutzungsrechte")
	private Set<IruNehmer> iruNehmers;

	private static final long serialVersionUID = 1L;

	public Nutzungsrechte() {
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
	 * @return the remark1
	 */
	public String getRemark1() {
		return remark1;
	}

	/**
	 * @param remark1 the remark1 to set
	 */
	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	/**
	 * @return the remark2
	 */
	public String getRemark2() {
		return remark2;
	}

	/**
	 * @param remark2 the remark2 to set
	 */
	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	/**
	 * @return the remark3
	 */
	public String getRemark3() {
		return remark3;
	}

	/**
	 * @param remark3 the remark3 to set
	 */
	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}

	/**
	 * @return the iruRechteErworbe
	 */
	public Long getIruRechteErworbe() {
		return iruRechteErworbe;
	}

	/**
	 * @param iruRechteErworbe the iruRechteErworbe to set
	 */
	public void setIruRechteErworbe(Long iruRechteErworbe) {
		this.iruRechteErworbe = iruRechteErworbe;
	}

	/**
	 * @return the iruRechteVerkJo
	 */
	public Long getIruRechteVerkJo() {
		return iruRechteVerkJo;
	}

	/**
	 * @param iruRechteVerkJo the iruRechteVerkJo to set
	 */
	public void setIruRechteVerkJo(Long iruRechteVerkJo) {
		this.iruRechteVerkJo = iruRechteVerkJo;
	}

	/**
	 * @return the iruRechteVerkWh
	 */
	public Long getIruRechteVerkWh() {
		return iruRechteVerkWh;
	}

	/**
	 * @param iruRechteVerkWh the iruRechteVerkWh to set
	 */
	public void setIruRechteVerkWh(Long iruRechteVerkWh) {
		this.iruRechteVerkWh = iruRechteVerkWh;
	}

	/**
	 * @return the iruRechteVerkauf
	 */
	public Long getIruRechteVerkauf() {
		return iruRechteVerkauf;
	}

	/**
	 * @param iruRechteVerkauf the iruRechteVerkauf to set
	 */
	public void setIruRechteVerkauf(Long iruRechteVerkauf) {
		this.iruRechteVerkauf = iruRechteVerkauf;
	}

	/**
	 * @return the jointlyOwned
	 */
	public Long getJointlyOwned() {
		return jointlyOwned;
	}

	/**
	 * @param jointlyOwned the jointlyOwned to set
	 */
	public void setJointlyOwned(Long jointlyOwned) {
		this.jointlyOwned = jointlyOwned;
	}

	/**
	 * @return the kostenProIru
	 */
	public Long getKostenProIru() {
		return kostenProIru;
	}

	/**
	 * @param kostenProIru the kostenProIru to set
	 */
	public void setKostenProIru(Long kostenProIru) {
		this.kostenProIru = kostenProIru;
	}

	/**
	 * @return the kostenProNutzung
	 */
	public Long getKostenProNutzung() {
		return kostenProNutzung;
	}

	/**
	 * @param kostenProNutzung the kostenProNutzung to set
	 */
	public void setKostenProNutzung(Long kostenProNutzung) {
		this.kostenProNutzung = kostenProNutzung;
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
	 * @return the nutzungsrechteart
	 */
	public String getNutzungsrechteart() {
		return nutzungsrechteart;
	}

	/**
	 * @param nutzungsrechteart the nutzungsrechteart to set
	 */
	public void setNutzungsrechteart(String nutzungsrechteart) {
		this.nutzungsrechteart = nutzungsrechteart;
	}

	/**
	 * @return the nutzungsrechtenoti
	 */
	public String getNutzungsrechtenoti() {
		return nutzungsrechtenoti;
	}

	/**
	 * @param nutzungsrechtenoti the nutzungsrechtenoti to set
	 */
	public void setNutzungsrechtenoti(String nutzungsrechtenoti) {
		this.nutzungsrechtenoti = nutzungsrechtenoti;
	}

	/**
	 * @return the nutzungsrechtenumm
	 */
	public Long getNutzungsrechtenumm() {
		return nutzungsrechtenumm;
	}

	/**
	 * @param nutzungsrechtenumm the nutzungsrechtenumm to set
	 */
	public void setNutzungsrechtenumm(Long nutzungsrechtenumm) {
		this.nutzungsrechtenumm = nutzungsrechtenumm;
	}

	/**
	 * @return the preisProIruVerk
	 */
	public Long getPreisProIruVerk() {
		return preisProIruVerk;
	}

	/**
	 * @param preisProIruVerk the preisProIruVerk to set
	 */
	public void setPreisProIruVerk(Long preisProIruVerk) {
		this.preisProIruVerk = preisProIruVerk;
	}

	/**
	 * @return the wholyOwned
	 */
	public Long getWholyOwned() {
		return wholyOwned;
	}

	/**
	 * @param wholyOwned the wholyOwned to set
	 */
	public void setWholyOwned(Long wholyOwned) {
		this.wholyOwned = wholyOwned;
	}

	/**
	 * @return the terminal0
	 */
	public Terminal getTerminal0() {
		return terminal0;
	}

	/**
	 * @param terminal0 the terminal0 to set
	 */
	public void setTerminal0(Terminal terminal0) {
		this.terminal0 = terminal0;
	}

	/**
	 * @return the terminal
	 */
	public Terminal getTerminal() {
		return terminal;
	}

	/**
	 * @param terminal the terminal to set
	 */
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}

	/**
	 * @return the capacity0
	 */
	public Capacity getCapacity0() {
		return capacity0;
	}

	/**
	 * @param capacity0 the capacity0 to set
	 */
	public void setCapacity0(Capacity capacity0) {
		this.capacity0 = capacity0;
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
	 * @return the capacity1
	 */
	public Capacity getCapacity1() {
		return capacity1;
	}

	/**
	 * @param capacity1 the capacity1 to set
	 */
	public void setCapacity1(Capacity capacity1) {
		this.capacity1 = capacity1;
	}

	/**
	 * @return the seekabelvertrag
	 */
	public Seekabelvertrag getSeekabelvertrag() {
		return seekabelvertrag;
	}

	/**
	 * @param seekabelvertrag the seekabelvertrag to set
	 */
	public void setSeekabelvertrag(Seekabelvertrag seekabelvertrag) {
		this.seekabelvertrag = seekabelvertrag;
	}

	/**
	 * @return the transit
	 */
	public Transit getTransit() {
		return transit;
	}

	/**
	 * @param transit the transit to set
	 */
	public void setTransit(Transit transit) {
		this.transit = transit;
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
	 * @return the waehrung0
	 */
	public Waehrung getWaehrung0() {
		return waehrung0;
	}

	/**
	 * @param waehrung0 the waehrung0 to set
	 */
	public void setWaehrung0(Waehrung waehrung0) {
		this.waehrung0 = waehrung0;
	}

	/**
	 * @return the waehrung1
	 */
	public Waehrung getWaehrung1() {
		return waehrung1;
	}

	/**
	 * @param waehrung1 the waehrung1 to set
	 */
	public void setWaehrung1(Waehrung waehrung1) {
		this.waehrung1 = waehrung1;
	}

	/**
	 * @return the landfuehrungsabschs
	 */
	public Set<Landfuehrungsabsch> getLandfuehrungsabschs() {
		return landfuehrungsabschs;
	}

	/**
	 * @param landfuehrungsabschs the landfuehrungsabschs to set
	 */
	public void setLandfuehrungsabschs(Set<Landfuehrungsabsch> landfuehrungsabschs) {
		this.landfuehrungsabschs = landfuehrungsabschs;
	}

	/**
	 * @return the nutzungspartners
	 */
	public Set<Nutzungspartner> getNutzungspartners() {
		return nutzungspartners;
	}

	/**
	 * @param nutzungspartners the nutzungspartners to set
	 */
	public void setNutzungspartners(Set<Nutzungspartner> nutzungspartners) {
		this.nutzungspartners = nutzungspartners;
	}

	/**
	 * @return the restorationkostenps
	 */
	public Set<Restorationkostenp> getRestorationkostenps() {
		return restorationkostenps;
	}

	/**
	 * @param restorationkostenps the restorationkostenps to set
	 */
	public void setRestorationkostenps(Set<Restorationkostenp> restorationkostenps) {
		this.restorationkostenps = restorationkostenps;
	}

	/**
	 * @return the iruNehmers
	 */
	public Set<IruNehmer> getIruNehmers() {
		return iruNehmers;
	}

	/**
	 * @param iruNehmers the iruNehmers to set
	 */
	public void setIruNehmers(Set<IruNehmer> iruNehmers) {
		this.iruNehmers = iruNehmers;
	}
	
}
