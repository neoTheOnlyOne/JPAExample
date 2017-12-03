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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Linienabschnitt implements Serializable {
	@Id
	@Column(name="OID_LINIENABSCHNIT")
	private long oidLinienabschnit;

	@Column(name="L_ABSCHNITTSCODE")
	private String lAbschnittscode;

	private String bearbeiterkennung;

	@Column(name="LETZTE_AKTUALISIER")
	private Date letzteAktualisier;

	private BigDecimal linienabschnittlae;

	private String linienabschnittnot;

	private BigDecimal linienabschnittnum;

	private String restaurationhinwei;

	@Column(name="RFCS_IST")
	private Date rfcsIst;

	@Column(name="RFCS_SOLL")
	private Date rfcsSoll;

	@Column(name="RFPA_IST")
	private Date rfpaIst;

	@Column(name="RFPA_SOLL")
	private Date rfpaSoll;

	@Column(name="SOLL_AUFHEBUNG_LIN")
	private Date sollAufhebungLin;

	@Column(name="FK_KABELFORMOID_KA")
	private BigDecimal fkKabelformoidKa;

	@Column(name="EXCLUDE_VIOLATION")
	private String excludeViolation;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_ENDPUNKTOID_END")
	private Terminal fkEndpunktoidEnd;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK0ENDPUNKTOID_END")
	private Terminal fk0endpunktoidEnd;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK1ENDPUNKTOID_END")
	private Terminal fk1endpunktoidEnd;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_LINIEOID_LINIE")
	private Linie fkLinieoidLinie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_REGIONOID_REGIO")
	private Region fkRegionoidRegio;

	@OneToMany(mappedBy="fkLinienabschnoid")
	private Set<Position0> position0Collection;

	@ManyToMany
	@JoinTable(name="KANN_GEHOEREN_ZU",
		joinColumns=@JoinColumn(name="FK_LINIENABSCHNOID"),
		inverseJoinColumns=@JoinColumn(name="FK_REGIONOID_REGIO"))
	private Set<Region> regionCollection;

	private static final long serialVersionUID = 1L;

	public Linienabschnitt() {
		super();
	}

	public long getOidLinienabschnit() {
		return this.oidLinienabschnit;
	}

	public void setOidLinienabschnit(long oidLinienabschnit) {
		this.oidLinienabschnit = oidLinienabschnit;
	}

	public String getLAbschnittscode() {
		return this.lAbschnittscode;
	}

	public void setLAbschnittscode(String lAbschnittscode) {
		this.lAbschnittscode = lAbschnittscode;
	}

	public String getBearbeiterkennung() {
		return this.bearbeiterkennung;
	}

	public void setBearbeiterkennung(String bearbeiterkennung) {
		this.bearbeiterkennung = bearbeiterkennung;
	}

	public Date getLetzteAktualisier() {
		return this.letzteAktualisier;
	}

	public void setLetzteAktualisier(Date letzteAktualisier) {
		this.letzteAktualisier = letzteAktualisier;
	}

	public BigDecimal getLinienabschnittlae() {
		return this.linienabschnittlae;
	}

	public void setLinienabschnittlae(BigDecimal linienabschnittlae) {
		this.linienabschnittlae = linienabschnittlae;
	}

	public String getLinienabschnittnot() {
		return this.linienabschnittnot;
	}

	public void setLinienabschnittnot(String linienabschnittnot) {
		this.linienabschnittnot = linienabschnittnot;
	}

	public BigDecimal getLinienabschnittnum() {
		return this.linienabschnittnum;
	}

	public void setLinienabschnittnum(BigDecimal linienabschnittnum) {
		this.linienabschnittnum = linienabschnittnum;
	}

	public String getRestaurationhinwei() {
		return this.restaurationhinwei;
	}

	public void setRestaurationhinwei(String restaurationhinwei) {
		this.restaurationhinwei = restaurationhinwei;
	}

	public Date getRfcsIst() {
		return this.rfcsIst;
	}

	public void setRfcsIst(Date rfcsIst) {
		this.rfcsIst = rfcsIst;
	}

	public Date getRfcsSoll() {
		return this.rfcsSoll;
	}

	public void setRfcsSoll(Date rfcsSoll) {
		this.rfcsSoll = rfcsSoll;
	}

	public Date getRfpaIst() {
		return this.rfpaIst;
	}

	public void setRfpaIst(Date rfpaIst) {
		this.rfpaIst = rfpaIst;
	}

	public Date getRfpaSoll() {
		return this.rfpaSoll;
	}

	public void setRfpaSoll(Date rfpaSoll) {
		this.rfpaSoll = rfpaSoll;
	}

	public Date getSollAufhebungLin() {
		return this.sollAufhebungLin;
	}

	public void setSollAufhebungLin(Date sollAufhebungLin) {
		this.sollAufhebungLin = sollAufhebungLin;
	}

	public BigDecimal getFkKabelformoidKa() {
		return this.fkKabelformoidKa;
	}

	public void setFkKabelformoidKa(BigDecimal fkKabelformoidKa) {
		this.fkKabelformoidKa = fkKabelformoidKa;
	}

	public String getExcludeViolation() {
		return this.excludeViolation;
	}

	public void setExcludeViolation(String excludeViolation) {
		this.excludeViolation = excludeViolation;
	}

	public Terminal getFkEndpunktoidEnd() {
		return this.fkEndpunktoidEnd;
	}

	public void setFkEndpunktoidEnd(Terminal fkEndpunktoidEnd) {
		this.fkEndpunktoidEnd = fkEndpunktoidEnd;
	}

	public Terminal getFk0endpunktoidEnd() {
		return this.fk0endpunktoidEnd;
	}

	public void setFk0endpunktoidEnd(Terminal fk0endpunktoidEnd) {
		this.fk0endpunktoidEnd = fk0endpunktoidEnd;
	}

	public Terminal getFk1endpunktoidEnd() {
		return this.fk1endpunktoidEnd;
	}

	public void setFk1endpunktoidEnd(Terminal fk1endpunktoidEnd) {
		this.fk1endpunktoidEnd = fk1endpunktoidEnd;
	}

	public Linie getFkLinieoidLinie() {
		return this.fkLinieoidLinie;
	}

	public void setFkLinieoidLinie(Linie fkLinieoidLinie) {
		this.fkLinieoidLinie = fkLinieoidLinie;
	}

	public Region getFkRegionoidRegio() {
		return this.fkRegionoidRegio;
	}

	public void setFkRegionoidRegio(Region fkRegionoidRegio) {
		this.fkRegionoidRegio = fkRegionoidRegio;
	}

	public Set<Position0> getPosition0Collection() {
		return this.position0Collection;
	}

	public void setPosition0Collection(Set<Position0> position0Collection) {
		this.position0Collection = position0Collection;
	}

	public Set<Region> getRegionCollection() {
		return this.regionCollection;
	}

	public void setRegionCollection(Set<Region> regionCollection) {
		this.regionCollection = regionCollection;
	}

}
