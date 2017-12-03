package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Waehrung implements Serializable {
	@Id
	@Column(name="OID_WAEHRUNG")
	private Long id;

	@Column(name="DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	private String waehrungsbezeichnu;

	@Column(name="WAEHRUNGSKURZBEZ_S")
	private String waehrungskurzbezS;

	private String waehrungskurzbezei;

	@OneToMany(mappedBy="waehrung")
	private Set<Transitteilmenge> transitteilmenges;

	@OneToMany(mappedBy="waehrung")
	private Set<Instandhaltungskos> instandhaltungskosn;

	@OneToMany(mappedBy="waehrung")
	private Set<Transit> transits;

	@OneToMany(mappedBy="waehrung")
	private Set<IruKontingent> iruKontingents;

	@OneToMany(mappedBy="waehrung")
	private Set<Nutzungskontingent> nutzungskontingents;

	@OneToMany(mappedBy="waehrung")
	private Set<Investition> investitions;

	@OneToMany(mappedBy="waehrung")
	private Set<Costs> costs;

	@OneToMany(mappedBy="waehrung")
	private Set<Seekabelvertrag> seekabelvertrags;

	@OneToMany(mappedBy="waehrung")
	private Set<LAbschnittkapazit> lAbschnittkapazits;

	@OneToMany(mappedBy="waehrung")
	private Set<IruNehmer> iruNehmers;

	@OneToMany(mappedBy="waehrung")
	private Set<Nutzungsrechte> nutzungsrechtes;

	@OneToMany(mappedBy="waehrung0")
	private Set<Nutzungsrechte> nutzungsrechtes2;

	@OneToMany(mappedBy="waehrung1")
	private Set<Nutzungsrechte> nutzungsrechtes3;

	private static final long serialVersionUID = 1L;

	public Waehrung() {
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
	 * @return the dateUpdated
	 */
	public Date getDateUpdated() {
		return dateUpdated;
	}

	/**
	 * @param dateUpdated the dateUpdated to set
	 */
	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the waehrungsbezeichnu
	 */
	public String getWaehrungsbezeichnu() {
		return waehrungsbezeichnu;
	}

	/**
	 * @param waehrungsbezeichnu the waehrungsbezeichnu to set
	 */
	public void setWaehrungsbezeichnu(String waehrungsbezeichnu) {
		this.waehrungsbezeichnu = waehrungsbezeichnu;
	}

	/**
	 * @return the waehrungskurzbezS
	 */
	public String getWaehrungskurzbezS() {
		return waehrungskurzbezS;
	}

	/**
	 * @param waehrungskurzbezS the waehrungskurzbezS to set
	 */
	public void setWaehrungskurzbezS(String waehrungskurzbezS) {
		this.waehrungskurzbezS = waehrungskurzbezS;
	}

	/**
	 * @return the waehrungskurzbezei
	 */
	public String getWaehrungskurzbezei() {
		return waehrungskurzbezei;
	}

	/**
	 * @param waehrungskurzbezei the waehrungskurzbezei to set
	 */
	public void setWaehrungskurzbezei(String waehrungskurzbezei) {
		this.waehrungskurzbezei = waehrungskurzbezei;
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
	 * @return the instandhaltungskosn
	 */
	public Set<Instandhaltungskos> getInstandhaltungskosn() {
		return instandhaltungskosn;
	}

	/**
	 * @param instandhaltungskosn the instandhaltungskosn to set
	 */
	public void setInstandhaltungskosn(Set<Instandhaltungskos> instandhaltungskosn) {
		this.instandhaltungskosn = instandhaltungskosn;
	}

	/**
	 * @return the transits
	 */
	public Set<Transit> getTransits() {
		return transits;
	}

	/**
	 * @param transits the transits to set
	 */
	public void setTransits(Set<Transit> transits) {
		this.transits = transits;
	}

	/**
	 * @return the iruKontingents
	 */
	public Set<IruKontingent> getIruKontingents() {
		return iruKontingents;
	}

	/**
	 * @param iruKontingents the iruKontingents to set
	 */
	public void setIruKontingents(Set<IruKontingent> iruKontingents) {
		this.iruKontingents = iruKontingents;
	}

	/**
	 * @return the nutzungskontingents
	 */
	public Set<Nutzungskontingent> getNutzungskontingents() {
		return nutzungskontingents;
	}

	/**
	 * @param nutzungskontingents the nutzungskontingents to set
	 */
	public void setNutzungskontingents(Set<Nutzungskontingent> nutzungskontingents) {
		this.nutzungskontingents = nutzungskontingents;
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
	 * @return the costs
	 */
	public Set<Costs> getCosts() {
		return costs;
	}

	/**
	 * @param costs the costs to set
	 */
	public void setCosts(Set<Costs> costs) {
		this.costs = costs;
	}

	/**
	 * @return the seekabelvertrags
	 */
	public Set<Seekabelvertrag> getSeekabelvertrags() {
		return seekabelvertrags;
	}

	/**
	 * @param seekabelvertrags the seekabelvertrags to set
	 */
	public void setSeekabelvertrags(Set<Seekabelvertrag> seekabelvertrags) {
		this.seekabelvertrags = seekabelvertrags;
	}

	/**
	 * @return the lAbschnittkapazits
	 */
	public Set<LAbschnittkapazit> getLAbschnittkapazits() {
		return lAbschnittkapazits;
	}

	/**
	 * @param abschnittkapazits the lAbschnittkapazits to set
	 */
	public void setLAbschnittkapazits(Set<LAbschnittkapazit> abschnittkapazits) {
		lAbschnittkapazits = abschnittkapazits;
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

	/**
	 * @return the nutzungsrechtes2
	 */
	public Set<Nutzungsrechte> getNutzungsrechtes2() {
		return nutzungsrechtes2;
	}

	/**
	 * @param nutzungsrechtes2 the nutzungsrechtes2 to set
	 */
	public void setNutzungsrechtes2(Set<Nutzungsrechte> nutzungsrechtes2) {
		this.nutzungsrechtes2 = nutzungsrechtes2;
	}

	/**
	 * @return the nutzungsrechtes3
	 */
	public Set<Nutzungsrechte> getNutzungsrechtes3() {
		return nutzungsrechtes3;
	}

	/**
	 * @param nutzungsrechtes3 the nutzungsrechtes3 to set
	 */
	public void setNutzungsrechtes3(Set<Nutzungsrechte> nutzungsrechtes3) {
		this.nutzungsrechtes3 = nutzungsrechtes3;
	}

}
