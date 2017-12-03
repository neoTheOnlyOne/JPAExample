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
public class Vertragskapazitaet implements Serializable {
	@Id
	@Column(name="OID_VERTRAGSKAPAZI")
	private Long id;

	@Column(name="EINHEIT_POOLKAPAZI")
	private String einheitPoolkapazi;

	@Column(name="V_KAPAZITAET_ERWER")
	private Long vKapazitaetErwer;

	@Column(name="V_KAPAZITAET_NICHT")
	private Long vKapazitaetNicht;

	@Column(name="V_KAPAZITAET_ZUGEO")
	private Long vKapazitaetZugeo;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SEEKABELVERTOID")
	private Seekabelvertrag seekabelvertrag;

	@OneToMany(mappedBy="vertragskapazitaet")
	private Set<Vertragskapazitae0> vertragskapazitae0s;

	private static final long serialVersionUID = 1L;

	public Vertragskapazitaet() {
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
	 * @return the einheitPoolkapazi
	 */
	public String getEinheitPoolkapazi() {
		return einheitPoolkapazi;
	}

	/**
	 * @param einheitPoolkapazi the einheitPoolkapazi to set
	 */
	public void setEinheitPoolkapazi(String einheitPoolkapazi) {
		this.einheitPoolkapazi = einheitPoolkapazi;
	}

	/**
	 * @return the vKapazitaetErwer
	 */
	public Long getVKapazitaetErwer() {
		return vKapazitaetErwer;
	}

	/**
	 * @param kapazitaetErwer the vKapazitaetErwer to set
	 */
	public void setVKapazitaetErwer(Long kapazitaetErwer) {
		vKapazitaetErwer = kapazitaetErwer;
	}

	/**
	 * @return the vKapazitaetNicht
	 */
	public Long getVKapazitaetNicht() {
		return vKapazitaetNicht;
	}

	/**
	 * @param kapazitaetNicht the vKapazitaetNicht to set
	 */
	public void setVKapazitaetNicht(Long kapazitaetNicht) {
		vKapazitaetNicht = kapazitaetNicht;
	}

	/**
	 * @return the vKapazitaetZugeo
	 */
	public Long getVKapazitaetZugeo() {
		return vKapazitaetZugeo;
	}

	/**
	 * @param kapazitaetZugeo the vKapazitaetZugeo to set
	 */
	public void setVKapazitaetZugeo(Long kapazitaetZugeo) {
		vKapazitaetZugeo = kapazitaetZugeo;
	}

	/**
	 * @return the seekabelvertrag
	 */
	public Seekabelvertrag getSeekabelvertrag() {
		return seekabelvertrag;
	}

	/**
	 * @param seekabelvertrag the seekabelvertrag to set
	 */
	public void setSeekabelvertrag(Seekabelvertrag seekabelvertrag) {
		this.seekabelvertrag = seekabelvertrag;
	}

	/**
	 * @return the vertragskapazitae0s
	 */
	public Set<Vertragskapazitae0> getVertragskapazitae0s() {
		return vertragskapazitae0s;
	}

	/**
	 * @param vertragskapazitae0s the vertragskapazitae0s to set
	 */
	public void setVertragskapazitae0s(Set<Vertragskapazitae0> vertragskapazitae0s) {
		this.vertragskapazitae0s = vertragskapazitae0s;
	}

}
