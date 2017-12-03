package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Laenderkante implements Serializable {
	@Id
	@Column(name = "OID_LAENDERKANTE")
	private long oidLaenderkante;

	@Column(name = "LAENDERKANTE_ART")
	private String laenderkanteArt;

	@Column(name = "LAENDERKANTE_LAENG")
	private BigDecimal laenderkanteLaeng;

	@Column(name = "LAENDERKANTE_NOTIZ")
	private String laenderkanteNotiz;

	@Column(name = "LAENDERKANTE_NUMME")
	private BigDecimal laenderkanteNumme;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_CARRIEROID_CARR")
	private Carrier fkCarrieroidCarr;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_ENDPUNKTOID_END")
	private Terminal fkEndpunktoidEnd;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK0ENDPUNKTOID_END")
	private Terminal fk0endpunktoidEnd;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_LANDOID_LAND")
	private Country fkLandoidLand;

	@OneToMany(mappedBy = "fkLaenderkanteoid")
	private Set<Fuehrungsabschnitt> fuehrungsabschnittCollection;

	private static final long serialVersionUID = 1L;

	public Laenderkante() {
		super();
	}

	public long getOidLaenderkante() {
		return this.oidLaenderkante;
	}

	public void setOidLaenderkante(long oidLaenderkante) {
		this.oidLaenderkante = oidLaenderkante;
	}

	public String getLaenderkanteArt() {
		return this.laenderkanteArt;
	}

	public void setLaenderkanteArt(String laenderkanteArt) {
		this.laenderkanteArt = laenderkanteArt;
	}

	public BigDecimal getLaenderkanteLaeng() {
		return this.laenderkanteLaeng;
	}

	public void setLaenderkanteLaeng(BigDecimal laenderkanteLaeng) {
		this.laenderkanteLaeng = laenderkanteLaeng;
	}

	public String getLaenderkanteNotiz() {
		return this.laenderkanteNotiz;
	}

	public void setLaenderkanteNotiz(String laenderkanteNotiz) {
		this.laenderkanteNotiz = laenderkanteNotiz;
	}

	public BigDecimal getLaenderkanteNumme() {
		return this.laenderkanteNumme;
	}

	public void setLaenderkanteNumme(BigDecimal laenderkanteNumme) {
		this.laenderkanteNumme = laenderkanteNumme;
	}

	public Carrier getFkCarrieroidCarr() {
		return this.fkCarrieroidCarr;
	}

	public void setFkCarrieroidCarr(Carrier fkCarrieroidCarr) {
		this.fkCarrieroidCarr = fkCarrieroidCarr;
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

	public Country getFkLandoidLand() {
		return this.fkLandoidLand;
	}

	public void setFkLandoidLand(Country fkLandoidLand) {
		this.fkLandoidLand = fkLandoidLand;
	}

	public Set<Fuehrungsabschnitt> getFuehrungsabschnittCollection() {
		return this.fuehrungsabschnittCollection;
	}

	public void setFuehrungsabschnittCollection(
			Set<Fuehrungsabschnitt> fuehrungsabschnittCollection) {
		this.fuehrungsabschnittCollection = fuehrungsabschnittCollection;
	}

}
