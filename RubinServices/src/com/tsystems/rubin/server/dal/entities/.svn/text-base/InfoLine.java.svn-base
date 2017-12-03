package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="INFO_LINIE")
public class InfoLine implements Serializable {
	@Id
	@Column(name="LINIE_ID")
	private Long id;

	@Column(name="L_BEZEICHNUNG")
	private String lBezeichnung;

	@Column(name="L_BREITE_A")
	private String lBreiteA;

	@Column(name="L_BREITE_B")
	private String lBreiteB;

	@Column(name="L_BSZ_A")
	private String lBszA;

	@Column(name="L_BSZ_B")
	private String lBszB;

	@Column(name="L_ENDPUNKT_A")
	private String lEndpunktA;

	@Column(name="L_ENDPUNKT_B")
	private String lEndpunktB;

	@Column(name="L_ENDSZ_A")
	private String lEndszA;

	@Column(name="L_ENDSZ_B")
	private String lEndszB;

	@Column(name="L_GRUNDSTUECK_A")
	private String lGrundstueckA;

	@Column(name="L_GRUNDSTUECK_B")
	private String lGrundstueckB;

	@Column(name="L_KENNUNG")
	private String lKennung;

	@Column(name="L_LAENGE_A")
	private String lLaengeA;

	@Column(name="L_LAENGE_B")
	private String lLaengeB;

	@OneToMany(mappedBy="infoLine")
	private Set<InfoLinienabschni> infoLinienabschnis;

	private static final long serialVersionUID = 1L;

	public InfoLine() {
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
	 * @return the lBezeichnung
	 */
	public String getLBezeichnung() {
		return lBezeichnung;
	}

	/**
	 * @param bezeichnung the lBezeichnung to set
	 */
	public void setLBezeichnung(String bezeichnung) {
		lBezeichnung = bezeichnung;
	}

	/**
	 * @return the lBreiteA
	 */
	public String getLBreiteA() {
		return lBreiteA;
	}

	/**
	 * @param breiteA the lBreiteA to set
	 */
	public void setLBreiteA(String breiteA) {
		lBreiteA = breiteA;
	}

	/**
	 * @return the lBreiteB
	 */
	public String getLBreiteB() {
		return lBreiteB;
	}

	/**
	 * @param breiteB the lBreiteB to set
	 */
	public void setLBreiteB(String breiteB) {
		lBreiteB = breiteB;
	}

	/**
	 * @return the lBszA
	 */
	public String getLBszA() {
		return lBszA;
	}

	/**
	 * @param bszA the lBszA to set
	 */
	public void setLBszA(String bszA) {
		lBszA = bszA;
	}

	/**
	 * @return the lBszB
	 */
	public String getLBszB() {
		return lBszB;
	}

	/**
	 * @param bszB the lBszB to set
	 */
	public void setLBszB(String bszB) {
		lBszB = bszB;
	}

	/**
	 * @return the lEndpunktA
	 */
	public String getLEndpunktA() {
		return lEndpunktA;
	}

	/**
	 * @param endpunktA the lEndpunktA to set
	 */
	public void setLEndpunktA(String endpunktA) {
		lEndpunktA = endpunktA;
	}

	/**
	 * @return the lEndpunktB
	 */
	public String getLEndpunktB() {
		return lEndpunktB;
	}

	/**
	 * @param endpunktB the lEndpunktB to set
	 */
	public void setLEndpunktB(String endpunktB) {
		lEndpunktB = endpunktB;
	}

	/**
	 * @return the lEndszA
	 */
	public String getLEndszA() {
		return lEndszA;
	}

	/**
	 * @param endszA the lEndszA to set
	 */
	public void setLEndszA(String endszA) {
		lEndszA = endszA;
	}

	/**
	 * @return the lEndszB
	 */
	public String getLEndszB() {
		return lEndszB;
	}

	/**
	 * @param endszB the lEndszB to set
	 */
	public void setLEndszB(String endszB) {
		lEndszB = endszB;
	}

	/**
	 * @return the lGrundstueckA
	 */
	public String getLGrundstueckA() {
		return lGrundstueckA;
	}

	/**
	 * @param grundstueckA the lGrundstueckA to set
	 */
	public void setLGrundstueckA(String grundstueckA) {
		lGrundstueckA = grundstueckA;
	}

	/**
	 * @return the lGrundstueckB
	 */
	public String getLGrundstueckB() {
		return lGrundstueckB;
	}

	/**
	 * @param grundstueckB the lGrundstueckB to set
	 */
	public void setLGrundstueckB(String grundstueckB) {
		lGrundstueckB = grundstueckB;
	}

	/**
	 * @return the lKennung
	 */
	public String getLKennung() {
		return lKennung;
	}

	/**
	 * @param kennung the lKennung to set
	 */
	public void setLKennung(String kennung) {
		lKennung = kennung;
	}

	/**
	 * @return the lLaengeA
	 */
	public String getLLaengeA() {
		return lLaengeA;
	}

	/**
	 * @param laengeA the lLaengeA to set
	 */
	public void setLLaengeA(String laengeA) {
		lLaengeA = laengeA;
	}

	/**
	 * @return the lLaengeB
	 */
	public String getLLaengeB() {
		return lLaengeB;
	}

	/**
	 * @param laengeB the lLaengeB to set
	 */
	public void setLLaengeB(String laengeB) {
		lLaengeB = laengeB;
	}

	/**
	 * @return the infoLinienabschnis
	 */
	public Set<InfoLinienabschni> getInfoLinienabschnis() {
		return infoLinienabschnis;
	}

	/**
	 * @param infoLinienabschnis the infoLinienabschnis to set
	 */
	public void setInfoLinienabschnis(Set<InfoLinienabschni> infoLinienabschnis) {
		this.infoLinienabschnis = infoLinienabschnis;
	}


}
