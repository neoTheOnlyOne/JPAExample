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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Linie implements Serializable {
	@Id
	@Column(name="OID_LINIE")
	private long oidLinie;

	private String linienlangbezeichn;

	@Column(name="LETZTE_AKTUALISIER")
	private Date letzteAktualisier;

	private String bearbeiterkennung;

	@Column(name="LINIEN_NOTIZ")
	private String linienNotiz;

	private String linienbezeichnung;

	private String linienkennung;

	@Column(name="FK_LINIENARTOID_LI")
	private BigDecimal fkLinienartoidLi;

	@Column(name="LINIENBEZ_SUCH_BSI")
	private String linienbezSuchBsi;

	@Column(name="LINIENKENNUNG_SUCH")
	private String linienkennungSuch;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_ENDPUNKTOID_END")
	private Terminal fkEndpunktoidEnd;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK0ENDPUNKTOID_END")
	private Terminal fk0endpunktoidEnd;

	@OneToMany(mappedBy="fkLinieoidLinie")
	private Set<Linienabschnitt> linienabschnittCollection;

	private static final long serialVersionUID = 1L;

	public Linie() {
		super();
	}

	public long getOidLinie() {
		return this.oidLinie;
	}

	public void setOidLinie(long oidLinie) {
		this.oidLinie = oidLinie;
	}

	public String getLinienlangbezeichn() {
		return this.linienlangbezeichn;
	}

	public void setLinienlangbezeichn(String linienlangbezeichn) {
		this.linienlangbezeichn = linienlangbezeichn;
	}

	public Date getLetzteAktualisier() {
		return this.letzteAktualisier;
	}

	public void setLetzteAktualisier(Date letzteAktualisier) {
		this.letzteAktualisier = letzteAktualisier;
	}

	public String getBearbeiterkennung() {
		return this.bearbeiterkennung;
	}

	public void setBearbeiterkennung(String bearbeiterkennung) {
		this.bearbeiterkennung = bearbeiterkennung;
	}

	public String getLinienNotiz() {
		return this.linienNotiz;
	}

	public void setLinienNotiz(String linienNotiz) {
		this.linienNotiz = linienNotiz;
	}

	public String getLinienbezeichnung() {
		return this.linienbezeichnung;
	}

	public void setLinienbezeichnung(String linienbezeichnung) {
		this.linienbezeichnung = linienbezeichnung;
	}

	public String getLinienkennung() {
		return this.linienkennung;
	}

	public void setLinienkennung(String linienkennung) {
		this.linienkennung = linienkennung;
	}

	public BigDecimal getFkLinienartoidLi() {
		return this.fkLinienartoidLi;
	}

	public void setFkLinienartoidLi(BigDecimal fkLinienartoidLi) {
		this.fkLinienartoidLi = fkLinienartoidLi;
	}

	public String getLinienbezSuchBsi() {
		return this.linienbezSuchBsi;
	}

	public void setLinienbezSuchBsi(String linienbezSuchBsi) {
		this.linienbezSuchBsi = linienbezSuchBsi;
	}

	public String getLinienkennungSuch() {
		return this.linienkennungSuch;
	}

	public void setLinienkennungSuch(String linienkennungSuch) {
		this.linienkennungSuch = linienkennungSuch;
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

	public Set<Linienabschnitt> getLinienabschnittCollection() {
		return this.linienabschnittCollection;
	}

	public void setLinienabschnittCollection(Set<Linienabschnitt> linienabschnittCollection) {
		this.linienabschnittCollection = linienabschnittCollection;
	}

}
