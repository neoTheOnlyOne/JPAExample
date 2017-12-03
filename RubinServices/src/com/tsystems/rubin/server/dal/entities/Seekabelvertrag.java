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
public class Seekabelvertrag implements Serializable {
	@Id
	@Column(name="OID_SEEKABELVERTRA")
	private Long id;

	private Long anlagennummer;

	private String bearbeiterkennung;

	@Column(name="BEZEICHG_SEEKABEL0")
	private String bezeichgSeekabel0;

	@Column(name="BEZEICHG_SEEKABELV")
	private String bezeichgSeekabelv;

	private String bezugsgroesse;

	@Column(name="C_MA_DATUM")
	private Date cMaDatum;

	@Column(name="IKS_ID_NUMMER")
	private String iksIdNummer;

	@Column(name="IKS_ID_NUMMER_SUCH")
	private String iksIdNummerSuch;

	@Column(name="LEBENSDAUER_LINIE")
	private Long lebensdauerLinie;

	@Column(name="LETZTE_AKTUALISIER")
	private Date letzteAktualisier;

	private String linienstatus;

	@Column(name="MOU_DATUM")
	private Date mouDatum;

	@Column(name="RFS_DATE_IST_DATUM")
	private Date rfsDateIstDatum;

	@Column(name="RK_AUFTRAGS_NUMMER")
	private Long rkAuftragsNummer;

	private String seekabelvertragsno;

	@Column(name="SMISSY_NUMMER")
	private String smissyNummer;

	@Column(name="SYSTEM_BUDGET")
	private Long systemBudget;

	private String systemart;

	@Column(name="VERTRAGS_RFS_DATE")
	private Date vertragsRfsDate;

	private Date vertragsausserbetr;

	private Long votingrights;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LINIEOID_LINIE")
	private Line line;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SEEKABELFINAOID")
	private Seekabelfinanzieru seekabelfinanzieru;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WAEHRUNGOID_WAE")
	private Waehrung waehrung;

	@OneToMany(mappedBy="seekabelvertrag")
	private Set<Vertragsaenderung> vertragsaenderungs;

	@OneToMany(mappedBy="seekabelvertrag")
	private Set<Vertragskapazitaet> vertragskapazitaets;

	@OneToMany(mappedBy="seekabelvertrag")
	private Set<Instandhaltungskos> instandhaltungskos;

	@OneToMany(mappedBy="seekabelvertrag")
	private Set<Gremium> gremiums;

	@OneToMany(mappedBy="seekabelvertrag")
	private Set<Investition> investitions;

	@OneToMany(mappedBy="seekabelvertrag")
	private Set<Nutzungsrechte> nutzungsrechtes;

	private static final long serialVersionUID = 1L;

	public Seekabelvertrag() {
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
	 * @return the anlagennummer
	 */
	public Long getAnlagennummer() {
		return anlagennummer;
	}

	/**
	 * @param anlagennummer the anlagennummer to set
	 */
	public void setAnlagennummer(Long anlagennummer) {
		this.anlagennummer = anlagennummer;
	}

	/**
	 * @return the bearbeiterkennung
	 */
	public String getBearbeiterkennung() {
		return bearbeiterkennung;
	}

	/**
	 * @param bearbeiterkennung the bearbeiterkennung to set
	 */
	public void setBearbeiterkennung(String bearbeiterkennung) {
		this.bearbeiterkennung = bearbeiterkennung;
	}

	/**
	 * @return the bezeichgSeekabel0
	 */
	public String getBezeichgSeekabel0() {
		return bezeichgSeekabel0;
	}

	/**
	 * @param bezeichgSeekabel0 the bezeichgSeekabel0 to set
	 */
	public void setBezeichgSeekabel0(String bezeichgSeekabel0) {
		this.bezeichgSeekabel0 = bezeichgSeekabel0;
	}

	/**
	 * @return the bezeichgSeekabelv
	 */
	public String getBezeichgSeekabelv() {
		return bezeichgSeekabelv;
	}

	/**
	 * @param bezeichgSeekabelv the bezeichgSeekabelv to set
	 */
	public void setBezeichgSeekabelv(String bezeichgSeekabelv) {
		this.bezeichgSeekabelv = bezeichgSeekabelv;
	}

	/**
	 * @return the bezugsgroesse
	 */
	public String getBezugsgroesse() {
		return bezugsgroesse;
	}

	/**
	 * @param bezugsgroesse the bezugsgroesse to set
	 */
	public void setBezugsgroesse(String bezugsgroesse) {
		this.bezugsgroesse = bezugsgroesse;
	}

	/**
	 * @return the cMaDatum
	 */
	public Date getCMaDatum() {
		return cMaDatum;
	}

	/**
	 * @param maDatum the cMaDatum to set
	 */
	public void setCMaDatum(Date maDatum) {
		cMaDatum = maDatum;
	}

	/**
	 * @return the iksIdNummer
	 */
	public String getIksIdNummer() {
		return iksIdNummer;
	}

	/**
	 * @param iksIdNummer the iksIdNummer to set
	 */
	public void setIksIdNummer(String iksIdNummer) {
		this.iksIdNummer = iksIdNummer;
	}

	/**
	 * @return the iksIdNummerSuch
	 */
	public String getIksIdNummerSuch() {
		return iksIdNummerSuch;
	}

	/**
	 * @param iksIdNummerSuch the iksIdNummerSuch to set
	 */
	public void setIksIdNummerSuch(String iksIdNummerSuch) {
		this.iksIdNummerSuch = iksIdNummerSuch;
	}

	/**
	 * @return the lebensdauerLinie
	 */
	public Long getLebensdauerLinie() {
		return lebensdauerLinie;
	}

	/**
	 * @param lebensdauerLinie the lebensdauerLinie to set
	 */
	public void setLebensdauerLinie(Long lebensdauerLinie) {
		this.lebensdauerLinie = lebensdauerLinie;
	}

	/**
	 * @return the letzteAktualisier
	 */
	public Date getLetzteAktualisier() {
		return letzteAktualisier;
	}

	/**
	 * @param letzteAktualisier the letzteAktualisier to set
	 */
	public void setLetzteAktualisier(Date letzteAktualisier) {
		this.letzteAktualisier = letzteAktualisier;
	}

	/**
	 * @return the linienstatus
	 */
	public String getLinienstatus() {
		return linienstatus;
	}

	/**
	 * @param linienstatus the linienstatus to set
	 */
	public void setLinienstatus(String linienstatus) {
		this.linienstatus = linienstatus;
	}

	/**
	 * @return the mouDatum
	 */
	public Date getMouDatum() {
		return mouDatum;
	}

	/**
	 * @param mouDatum the mouDatum to set
	 */
	public void setMouDatum(Date mouDatum) {
		this.mouDatum = mouDatum;
	}

	/**
	 * @return the rfsDateIstDatum
	 */
	public Date getRfsDateIstDatum() {
		return rfsDateIstDatum;
	}

	/**
	 * @param rfsDateIstDatum the rfsDateIstDatum to set
	 */
	public void setRfsDateIstDatum(Date rfsDateIstDatum) {
		this.rfsDateIstDatum = rfsDateIstDatum;
	}

	/**
	 * @return the rkAuftragsNummer
	 */
	public Long getRkAuftragsNummer() {
		return rkAuftragsNummer;
	}

	/**
	 * @param rkAuftragsNummer the rkAuftragsNummer to set
	 */
	public void setRkAuftragsNummer(Long rkAuftragsNummer) {
		this.rkAuftragsNummer = rkAuftragsNummer;
	}

	/**
	 * @return the seekabelvertragsno
	 */
	public String getSeekabelvertragsno() {
		return seekabelvertragsno;
	}

	/**
	 * @param seekabelvertragsno the seekabelvertragsno to set
	 */
	public void setSeekabelvertragsno(String seekabelvertragsno) {
		this.seekabelvertragsno = seekabelvertragsno;
	}

	/**
	 * @return the smissyNummer
	 */
	public String getSmissyNummer() {
		return smissyNummer;
	}

	/**
	 * @param smissyNummer the smissyNummer to set
	 */
	public void setSmissyNummer(String smissyNummer) {
		this.smissyNummer = smissyNummer;
	}

	/**
	 * @return the systemBudget
	 */
	public Long getSystemBudget() {
		return systemBudget;
	}

	/**
	 * @param systemBudget the systemBudget to set
	 */
	public void setSystemBudget(Long systemBudget) {
		this.systemBudget = systemBudget;
	}

	/**
	 * @return the systemart
	 */
	public String getSystemart() {
		return systemart;
	}

	/**
	 * @param systemart the systemart to set
	 */
	public void setSystemart(String systemart) {
		this.systemart = systemart;
	}

	/**
	 * @return the vertragsRfsDate
	 */
	public Date getVertragsRfsDate() {
		return vertragsRfsDate;
	}

	/**
	 * @param vertragsRfsDate the vertragsRfsDate to set
	 */
	public void setVertragsRfsDate(Date vertragsRfsDate) {
		this.vertragsRfsDate = vertragsRfsDate;
	}

	/**
	 * @return the vertragsausserbetr
	 */
	public Date getVertragsausserbetr() {
		return vertragsausserbetr;
	}

	/**
	 * @param vertragsausserbetr the vertragsausserbetr to set
	 */
	public void setVertragsausserbetr(Date vertragsausserbetr) {
		this.vertragsausserbetr = vertragsausserbetr;
	}

	/**
	 * @return the votingrights
	 */
	public Long getVotingrights() {
		return votingrights;
	}

	/**
	 * @param votingrights the votingrights to set
	 */
	public void setVotingrights(Long votingrights) {
		this.votingrights = votingrights;
	}

	/**
	 * @return the line
	 */
	public Line getLine() {
		return line;
	}

	/**
	 * @param line the line to set
	 */
	public void setLine(Line line) {
		this.line = line;
	}

	/**
	 * @return the seekabelfinanzieru
	 */
	public Seekabelfinanzieru getSeekabelfinanzieru() {
		return seekabelfinanzieru;
	}

	/**
	 * @param seekabelfinanzieru the seekabelfinanzieru to set
	 */
	public void setSeekabelfinanzieru(Seekabelfinanzieru seekabelfinanzieru) {
		this.seekabelfinanzieru = seekabelfinanzieru;
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
	 * @return the vertragsaenderungs
	 */
	public Set<Vertragsaenderung> getVertragsaenderungs() {
		return vertragsaenderungs;
	}

	/**
	 * @param vertragsaenderungs the vertragsaenderungs to set
	 */
	public void setVertragsaenderungs(Set<Vertragsaenderung> vertragsaenderungs) {
		this.vertragsaenderungs = vertragsaenderungs;
	}

	/**
	 * @return the vertragskapazitaets
	 */
	public Set<Vertragskapazitaet> getVertragskapazitaets() {
		return vertragskapazitaets;
	}

	/**
	 * @param vertragskapazitaets the vertragskapazitaets to set
	 */
	public void setVertragskapazitaets(Set<Vertragskapazitaet> vertragskapazitaets) {
		this.vertragskapazitaets = vertragskapazitaets;
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
	 * @return the gremiums
	 */
	public Set<Gremium> getGremiums() {
		return gremiums;
	}

	/**
	 * @param gremiums the gremiums to set
	 */
	public void setGremiums(Set<Gremium> gremiums) {
		this.gremiums = gremiums;
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
