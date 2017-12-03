package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restorationkompone implements Serializable {
	@Id
	@Column(name="OID_RESTORATIONKOM")
	private Long id;

	@Column(name="ANZAHL_FREIE_TAGE")
	private Long anzahlFreieTage;

	@Column(name="ANZAHL_SCHALTKAPA0")
	private Long anzahlSchaltkapa0;

	@Column(name="ANZAHL_SCHALTKAPA1")
	private Long anzahlSchaltkapa1;

	@Column(name="ANZAHL_SCHALTKAPA2")
	private Long anzahlSchaltkapa2;

	@Column(name="ANZAHL_SCHALTKAPAZ")
	private Long anzahlSchaltkapaz;

	@Column(name="ANZAHL_VERTRAGSKA0")
	private Long anzahlVertragska0;

	@Column(name="ANZAHL_VERTRAGSKA1")
	private Long anzahlVertragska1;

	@Column(name="ANZAHL_VERTRAGSKA2")
	private Long anzahlVertragska2;

	@Column(name="ANZAHL_VERTRAGSKAP")
	private Long anzahlVertragskap;

	private String bearbeiterkennung;

	@Column(name="BEZEICHNUNG_ERSATZ")
	private String bezeichnungErsatz;

	@Column(name="ERSATZWEG_SCHALTKA")
	private String ersatzwegSchaltka;

	@Column(name="ERSATZWEG_VERTRAGS")
	private String ersatzwegVertrags;

	private String ersatzwegnotiz;

	@Column(name="FK_RESTORATIONKOID")
	private Long fkRestorationkoid;

	@Column(name="GUELTIGKEIT_VERTRA")
	private Date gueltigkeitVertra;

	@Column(name="JAHRESKOSTEN_ERSAT")
	private Long jahreskostenErsat;

	@Column(name="KOSTEN_ERSATZKAPA0")
	private Long kostenErsatzkapa0;

	@Column(name="KOSTEN_ERSATZKAPA1")
	private Long kostenErsatzkapa1;

	@Column(name="KOSTEN_ERSATZKAPA2")
	private Long kostenErsatzkapa2;

	@Column(name="KOSTEN_ERSATZKAPAZ")
	private Long kostenErsatzkapaz;

	@Column(name="KURS_ERSATZWEG_QU0")
	private String kursErsatzwegQu0;

	@Column(name="KURS_ERSATZWEG_QU1")
	private String kursErsatzwegQu1;

	@Column(name="KURS_ERSATZWEG_QU2")
	private String kursErsatzwegQu2;

	@Column(name="KURS_ERSATZWEG_QUA")
	private String kursErsatzwegQua;

	@Column(name="LETZTE_AKTUALISIER")
	private Date letzteAktualisier;

	private String vertragsbezeichnun;

	private String vertragsmodalitaet;

	@Column(name="VORAUSKOSTEN_ERSA0")
	private Long vorauskostenErsa0;

	@Column(name="VORAUSKOSTEN_ERSAT")
	private Long vorauskostenErsat;

	@Column(name="WAEHRUNG_ERSATZWEG")
	private String waehrungErsatzweg;

	@Column(name="ZUSATZKOSTEN_ERSAT")
	private Long zusatzkostenErsat;

	private static final long serialVersionUID = 1L;

	public Restorationkompone() {
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
	 * @return the anzahlFreieTage
	 */
	public Long getAnzahlFreieTage() {
		return anzahlFreieTage;
	}

	/**
	 * @param anzahlFreieTage the anzahlFreieTage to set
	 */
	public void setAnzahlFreieTage(Long anzahlFreieTage) {
		this.anzahlFreieTage = anzahlFreieTage;
	}

	/**
	 * @return the anzahlSchaltkapa0
	 */
	public Long getAnzahlSchaltkapa0() {
		return anzahlSchaltkapa0;
	}

	/**
	 * @param anzahlSchaltkapa0 the anzahlSchaltkapa0 to set
	 */
	public void setAnzahlSchaltkapa0(Long anzahlSchaltkapa0) {
		this.anzahlSchaltkapa0 = anzahlSchaltkapa0;
	}

	/**
	 * @return the anzahlSchaltkapa1
	 */
	public Long getAnzahlSchaltkapa1() {
		return anzahlSchaltkapa1;
	}

	/**
	 * @param anzahlSchaltkapa1 the anzahlSchaltkapa1 to set
	 */
	public void setAnzahlSchaltkapa1(Long anzahlSchaltkapa1) {
		this.anzahlSchaltkapa1 = anzahlSchaltkapa1;
	}

	/**
	 * @return the anzahlSchaltkapa2
	 */
	public Long getAnzahlSchaltkapa2() {
		return anzahlSchaltkapa2;
	}

	/**
	 * @param anzahlSchaltkapa2 the anzahlSchaltkapa2 to set
	 */
	public void setAnzahlSchaltkapa2(Long anzahlSchaltkapa2) {
		this.anzahlSchaltkapa2 = anzahlSchaltkapa2;
	}

	/**
	 * @return the anzahlSchaltkapaz
	 */
	public Long getAnzahlSchaltkapaz() {
		return anzahlSchaltkapaz;
	}

	/**
	 * @param anzahlSchaltkapaz the anzahlSchaltkapaz to set
	 */
	public void setAnzahlSchaltkapaz(Long anzahlSchaltkapaz) {
		this.anzahlSchaltkapaz = anzahlSchaltkapaz;
	}

	/**
	 * @return the anzahlVertragska0
	 */
	public Long getAnzahlVertragska0() {
		return anzahlVertragska0;
	}

	/**
	 * @param anzahlVertragska0 the anzahlVertragska0 to set
	 */
	public void setAnzahlVertragska0(Long anzahlVertragska0) {
		this.anzahlVertragska0 = anzahlVertragska0;
	}

	/**
	 * @return the anzahlVertragska1
	 */
	public Long getAnzahlVertragska1() {
		return anzahlVertragska1;
	}

	/**
	 * @param anzahlVertragska1 the anzahlVertragska1 to set
	 */
	public void setAnzahlVertragska1(Long anzahlVertragska1) {
		this.anzahlVertragska1 = anzahlVertragska1;
	}

	/**
	 * @return the anzahlVertragska2
	 */
	public Long getAnzahlVertragska2() {
		return anzahlVertragska2;
	}

	/**
	 * @param anzahlVertragska2 the anzahlVertragska2 to set
	 */
	public void setAnzahlVertragska2(Long anzahlVertragska2) {
		this.anzahlVertragska2 = anzahlVertragska2;
	}

	/**
	 * @return the anzahlVertragskap
	 */
	public Long getAnzahlVertragskap() {
		return anzahlVertragskap;
	}

	/**
	 * @param anzahlVertragskap the anzahlVertragskap to set
	 */
	public void setAnzahlVertragskap(Long anzahlVertragskap) {
		this.anzahlVertragskap = anzahlVertragskap;
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
	 * @return the bezeichnungErsatz
	 */
	public String getBezeichnungErsatz() {
		return bezeichnungErsatz;
	}

	/**
	 * @param bezeichnungErsatz the bezeichnungErsatz to set
	 */
	public void setBezeichnungErsatz(String bezeichnungErsatz) {
		this.bezeichnungErsatz = bezeichnungErsatz;
	}

	/**
	 * @return the ersatzwegSchaltka
	 */
	public String getErsatzwegSchaltka() {
		return ersatzwegSchaltka;
	}

	/**
	 * @param ersatzwegSchaltka the ersatzwegSchaltka to set
	 */
	public void setErsatzwegSchaltka(String ersatzwegSchaltka) {
		this.ersatzwegSchaltka = ersatzwegSchaltka;
	}

	/**
	 * @return the ersatzwegVertrags
	 */
	public String getErsatzwegVertrags() {
		return ersatzwegVertrags;
	}

	/**
	 * @param ersatzwegVertrags the ersatzwegVertrags to set
	 */
	public void setErsatzwegVertrags(String ersatzwegVertrags) {
		this.ersatzwegVertrags = ersatzwegVertrags;
	}

	/**
	 * @return the ersatzwegnotiz
	 */
	public String getErsatzwegnotiz() {
		return ersatzwegnotiz;
	}

	/**
	 * @param ersatzwegnotiz the ersatzwegnotiz to set
	 */
	public void setErsatzwegnotiz(String ersatzwegnotiz) {
		this.ersatzwegnotiz = ersatzwegnotiz;
	}

	/**
	 * @return the fkRestorationkoid
	 */
	public Long getFkRestorationkoid() {
		return fkRestorationkoid;
	}

	/**
	 * @param fkRestorationkoid the fkRestorationkoid to set
	 */
	public void setFkRestorationkoid(Long fkRestorationkoid) {
		this.fkRestorationkoid = fkRestorationkoid;
	}

	/**
	 * @return the gueltigkeitVertra
	 */
	public Date getGueltigkeitVertra() {
		return gueltigkeitVertra;
	}

	/**
	 * @param gueltigkeitVertra the gueltigkeitVertra to set
	 */
	public void setGueltigkeitVertra(Date gueltigkeitVertra) {
		this.gueltigkeitVertra = gueltigkeitVertra;
	}

	/**
	 * @return the jahreskostenErsat
	 */
	public Long getJahreskostenErsat() {
		return jahreskostenErsat;
	}

	/**
	 * @param jahreskostenErsat the jahreskostenErsat to set
	 */
	public void setJahreskostenErsat(Long jahreskostenErsat) {
		this.jahreskostenErsat = jahreskostenErsat;
	}

	/**
	 * @return the kostenErsatzkapa0
	 */
	public Long getKostenErsatzkapa0() {
		return kostenErsatzkapa0;
	}

	/**
	 * @param kostenErsatzkapa0 the kostenErsatzkapa0 to set
	 */
	public void setKostenErsatzkapa0(Long kostenErsatzkapa0) {
		this.kostenErsatzkapa0 = kostenErsatzkapa0;
	}

	/**
	 * @return the kostenErsatzkapa1
	 */
	public Long getKostenErsatzkapa1() {
		return kostenErsatzkapa1;
	}

	/**
	 * @param kostenErsatzkapa1 the kostenErsatzkapa1 to set
	 */
	public void setKostenErsatzkapa1(Long kostenErsatzkapa1) {
		this.kostenErsatzkapa1 = kostenErsatzkapa1;
	}

	/**
	 * @return the kostenErsatzkapa2
	 */
	public Long getKostenErsatzkapa2() {
		return kostenErsatzkapa2;
	}

	/**
	 * @param kostenErsatzkapa2 the kostenErsatzkapa2 to set
	 */
	public void setKostenErsatzkapa2(Long kostenErsatzkapa2) {
		this.kostenErsatzkapa2 = kostenErsatzkapa2;
	}

	/**
	 * @return the kostenErsatzkapaz
	 */
	public Long getKostenErsatzkapaz() {
		return kostenErsatzkapaz;
	}

	/**
	 * @param kostenErsatzkapaz the kostenErsatzkapaz to set
	 */
	public void setKostenErsatzkapaz(Long kostenErsatzkapaz) {
		this.kostenErsatzkapaz = kostenErsatzkapaz;
	}

	/**
	 * @return the kursErsatzwegQu0
	 */
	public String getKursErsatzwegQu0() {
		return kursErsatzwegQu0;
	}

	/**
	 * @param kursErsatzwegQu0 the kursErsatzwegQu0 to set
	 */
	public void setKursErsatzwegQu0(String kursErsatzwegQu0) {
		this.kursErsatzwegQu0 = kursErsatzwegQu0;
	}

	/**
	 * @return the kursErsatzwegQu1
	 */
	public String getKursErsatzwegQu1() {
		return kursErsatzwegQu1;
	}

	/**
	 * @param kursErsatzwegQu1 the kursErsatzwegQu1 to set
	 */
	public void setKursErsatzwegQu1(String kursErsatzwegQu1) {
		this.kursErsatzwegQu1 = kursErsatzwegQu1;
	}

	/**
	 * @return the kursErsatzwegQu2
	 */
	public String getKursErsatzwegQu2() {
		return kursErsatzwegQu2;
	}

	/**
	 * @param kursErsatzwegQu2 the kursErsatzwegQu2 to set
	 */
	public void setKursErsatzwegQu2(String kursErsatzwegQu2) {
		this.kursErsatzwegQu2 = kursErsatzwegQu2;
	}

	/**
	 * @return the kursErsatzwegQua
	 */
	public String getKursErsatzwegQua() {
		return kursErsatzwegQua;
	}

	/**
	 * @param kursErsatzwegQua the kursErsatzwegQua to set
	 */
	public void setKursErsatzwegQua(String kursErsatzwegQua) {
		this.kursErsatzwegQua = kursErsatzwegQua;
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
	 * @return the vertragsbezeichnun
	 */
	public String getVertragsbezeichnun() {
		return vertragsbezeichnun;
	}

	/**
	 * @param vertragsbezeichnun the vertragsbezeichnun to set
	 */
	public void setVertragsbezeichnun(String vertragsbezeichnun) {
		this.vertragsbezeichnun = vertragsbezeichnun;
	}

	/**
	 * @return the vertragsmodalitaet
	 */
	public String getVertragsmodalitaet() {
		return vertragsmodalitaet;
	}

	/**
	 * @param vertragsmodalitaet the vertragsmodalitaet to set
	 */
	public void setVertragsmodalitaet(String vertragsmodalitaet) {
		this.vertragsmodalitaet = vertragsmodalitaet;
	}

	/**
	 * @return the vorauskostenErsa0
	 */
	public Long getVorauskostenErsa0() {
		return vorauskostenErsa0;
	}

	/**
	 * @param vorauskostenErsa0 the vorauskostenErsa0 to set
	 */
	public void setVorauskostenErsa0(Long vorauskostenErsa0) {
		this.vorauskostenErsa0 = vorauskostenErsa0;
	}

	/**
	 * @return the vorauskostenErsat
	 */
	public Long getVorauskostenErsat() {
		return vorauskostenErsat;
	}

	/**
	 * @param vorauskostenErsat the vorauskostenErsat to set
	 */
	public void setVorauskostenErsat(Long vorauskostenErsat) {
		this.vorauskostenErsat = vorauskostenErsat;
	}

	/**
	 * @return the waehrungErsatzweg
	 */
	public String getWaehrungErsatzweg() {
		return waehrungErsatzweg;
	}

	/**
	 * @param waehrungErsatzweg the waehrungErsatzweg to set
	 */
	public void setWaehrungErsatzweg(String waehrungErsatzweg) {
		this.waehrungErsatzweg = waehrungErsatzweg;
	}

	/**
	 * @return the zusatzkostenErsat
	 */
	public Long getZusatzkostenErsat() {
		return zusatzkostenErsat;
	}

	/**
	 * @param zusatzkostenErsat the zusatzkostenErsat to set
	 */
	public void setZusatzkostenErsat(Long zusatzkostenErsat) {
		this.zusatzkostenErsat = zusatzkostenErsat;
	}

}
