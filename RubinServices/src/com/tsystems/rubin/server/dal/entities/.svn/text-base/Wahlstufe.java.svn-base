package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Wahlstufe implements Serializable {
	@Id
	@Column(name="OID_WAHLSTUFE")
	private Long id;

	@Column(name="BS_ANGABE")
	private String bsAngabe;

	private String gruppe;

	private String kennzahl;

	private String wahlstufe;

	@Column(name="WAHLSTUFE_NOTIZ")
	private String notice;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ENDPUNKTOID_END")
	private Terminal terminal;

	private static final long serialVersionUID = 1L;

	public Wahlstufe() {
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
	 * @return the bsAngabe
	 */
	public String getBsAngabe() {
		return bsAngabe;
	}

	/**
	 * @param bsAngabe the bsAngabe to set
	 */
	public void setBsAngabe(String bsAngabe) {
		this.bsAngabe = bsAngabe;
	}

	/**
	 * @return the gruppe
	 */
	public String getGruppe() {
		return gruppe;
	}

	/**
	 * @param gruppe the gruppe to set
	 */
	public void setGruppe(String gruppe) {
		this.gruppe = gruppe;
	}

	/**
	 * @return the kennzahl
	 */
	public String getKennzahl() {
		return kennzahl;
	}

	/**
	 * @param kennzahl the kennzahl to set
	 */
	public void setKennzahl(String kennzahl) {
		this.kennzahl = kennzahl;
	}

	/**
	 * @return the wahlstufe
	 */
	public String getWahlstufe() {
		return wahlstufe;
	}

	/**
	 * @param wahlstufe the wahlstufe to set
	 */
	public void setWahlstufe(String wahlstufe) {
		this.wahlstufe = wahlstufe;
	}

	/**
	 * @return the notice
	 */
	public String getNotice() {
		return notice;
	}

	/**
	 * @param notice the notice to set
	 */
	public void setNotice(String notice) {
		this.notice = notice;
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

	}
