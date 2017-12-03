package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Kanal implements Serializable {
	@Id
	@Column(name="OID_KANAL")
	private long oidKanal;

	private String kanalbezeichnung;

	private BigDecimal kanalreihenfolge;

	private String kanalvormerk;

	private String zeitschlitzbezeich;

	private String kanalsperre;

	@Column(name="KANAL_GUELTIG_AB")
	private Date kanalGueltigAb;

	@Column(name="KANAL_GUELTIG_BIS")
	private Date kanalGueltigBis;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_KANALOID_KANAL")
	private Kanal fkKanaloidKanal;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_KAPAZITAETOID_K")
	private Capacity fkKapazitaetoidK;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_KONFIGURATIOOID")
	private Konfiguration fkKonfiguratiooid;

	@OneToMany(mappedBy="fkKanaloidKanal")
	private Set<Kanal> kanalCollection;

	@ManyToMany(mappedBy="kanalCollection")
	private Set<Fuehrungsabschnitt> fuehrungsabschnittCollection;

	private static final long serialVersionUID = 1L;

	public Kanal() {
		super();
	}

	public long getOidKanal() {
		return this.oidKanal;
	}

	public void setOidKanal(long oidKanal) {
		this.oidKanal = oidKanal;
	}

	public String getKanalbezeichnung() {
		return this.kanalbezeichnung;
	}

	public void setKanalbezeichnung(String kanalbezeichnung) {
		this.kanalbezeichnung = kanalbezeichnung;
	}

	public BigDecimal getKanalreihenfolge() {
		return this.kanalreihenfolge;
	}

	public void setKanalreihenfolge(BigDecimal kanalreihenfolge) {
		this.kanalreihenfolge = kanalreihenfolge;
	}

	public String getKanalvormerk() {
		return this.kanalvormerk;
	}

	public void setKanalvormerk(String kanalvormerk) {
		this.kanalvormerk = kanalvormerk;
	}

	public String getZeitschlitzbezeich() {
		return this.zeitschlitzbezeich;
	}

	public void setZeitschlitzbezeich(String zeitschlitzbezeich) {
		this.zeitschlitzbezeich = zeitschlitzbezeich;
	}

	public String getKanalsperre() {
		return this.kanalsperre;
	}

	public void setKanalsperre(String kanalsperre) {
		this.kanalsperre = kanalsperre;
	}

	public Date getKanalGueltigAb() {
		return this.kanalGueltigAb;
	}

	public void setKanalGueltigAb(Date kanalGueltigAb) {
		this.kanalGueltigAb = kanalGueltigAb;
	}

	public Date getKanalGueltigBis() {
		return this.kanalGueltigBis;
	}

	public void setKanalGueltigBis(Date kanalGueltigBis) {
		this.kanalGueltigBis = kanalGueltigBis;
	}

	public Kanal getFkKanaloidKanal() {
		return this.fkKanaloidKanal;
	}

	public void setFkKanaloidKanal(Kanal fkKanaloidKanal) {
		this.fkKanaloidKanal = fkKanaloidKanal;
	}

	public Capacity getFkKapazitaetoidK() {
		return this.fkKapazitaetoidK;
	}

	public void setFkKapazitaetoidK(Capacity fkKapazitaetoidK) {
		this.fkKapazitaetoidK = fkKapazitaetoidK;
	}

	public Konfiguration getFkKonfiguratiooid() {
		return this.fkKonfiguratiooid;
	}

	public void setFkKonfiguratiooid(Konfiguration fkKonfiguratiooid) {
		this.fkKonfiguratiooid = fkKonfiguratiooid;
	}

	public Set<Kanal> getKanalCollection() {
		return this.kanalCollection;
	}

	public void setKanalCollection(Set<Kanal> kanalCollection) {
		this.kanalCollection = kanalCollection;
	}

	public Set<Fuehrungsabschnitt> getFuehrungsabschnittCollection() {
		return this.fuehrungsabschnittCollection;
	}

	public void setFuehrungsabschnittCollection(Set<Fuehrungsabschnitt> fuehrungsabschnittCollection) {
		this.fuehrungsabschnittCollection = fuehrungsabschnittCollection;
	}

}
