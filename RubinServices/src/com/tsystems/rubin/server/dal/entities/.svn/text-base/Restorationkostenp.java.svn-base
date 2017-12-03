package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Restorationkostenp implements Serializable {
	@Id
	@Column(name="OID_RESTORATIONKOS")
	private Long id;

	private String restorationbezeich;

	private Long restorationkostenj;

	private String restorationkostenn;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_NUTZUNGSRECHOID")
	private Nutzungsrechte nutzungsrechte;

	@OneToMany(mappedBy="restorationkostenp")
	private Set<Restorationkostene> restorationkostenes;

	private static final long serialVersionUID = 1L;

	public Restorationkostenp() {
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
	 * @return the restorationbezeich
	 */
	public String getRestorationbezeich() {
		return restorationbezeich;
	}

	/**
	 * @param restorationbezeich the restorationbezeich to set
	 */
	public void setRestorationbezeich(String restorationbezeich) {
		this.restorationbezeich = restorationbezeich;
	}

	/**
	 * @return the restorationkostenj
	 */
	public Long getRestorationkostenj() {
		return restorationkostenj;
	}

	/**
	 * @param restorationkostenj the restorationkostenj to set
	 */
	public void setRestorationkostenj(Long restorationkostenj) {
		this.restorationkostenj = restorationkostenj;
	}

	/**
	 * @return the restorationkostenn
	 */
	public String getRestorationkostenn() {
		return restorationkostenn;
	}

	/**
	 * @param restorationkostenn the restorationkostenn to set
	 */
	public void setRestorationkostenn(String restorationkostenn) {
		this.restorationkostenn = restorationkostenn;
	}

	/**
	 * @return the nutzungsrechte
	 */
	public Nutzungsrechte getNutzungsrechte() {
		return nutzungsrechte;
	}

	/**
	 * @param nutzungsrechte the nutzungsrechte to set
	 */
	public void setNutzungsrechte(Nutzungsrechte nutzungsrechte) {
		this.nutzungsrechte = nutzungsrechte;
	}

	/**
	 * @return the restorationkostenes
	 */
	public Set<Restorationkostene> getRestorationkostenes() {
		return restorationkostenes;
	}

	/**
	 * @param restorationkostenes the restorationkostenes to set
	 */
	public void setRestorationkostenes(Set<Restorationkostene> restorationkostenes) {
		this.restorationkostenes = restorationkostenes;
	}


}
