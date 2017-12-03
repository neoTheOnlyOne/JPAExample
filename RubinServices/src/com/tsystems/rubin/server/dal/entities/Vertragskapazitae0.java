package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vertragskapazitae0 implements Serializable {
	@Id
	@Column(name="OID_VERTRAGSKAPAZI")
	private Long id;

	private String poolbezeichnung;

	private Long poolkapazitaet;

	private String poolnotiz;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_VERTRAGSKAPAOID")
	private Vertragskapazitaet vertragskapazitaet;

	private static final long serialVersionUID = 1L;

	public Vertragskapazitae0() {
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
	 * @return the poolbezeichnung
	 */
	public String getPoolbezeichnung() {
		return poolbezeichnung;
	}

	/**
	 * @param poolbezeichnung the poolbezeichnung to set
	 */
	public void setPoolbezeichnung(String poolbezeichnung) {
		this.poolbezeichnung = poolbezeichnung;
	}

	/**
	 * @return the poolkapazitaet
	 */
	public Long getPoolkapazitaet() {
		return poolkapazitaet;
	}

	/**
	 * @param poolkapazitaet the poolkapazitaet to set
	 */
	public void setPoolkapazitaet(Long poolkapazitaet) {
		this.poolkapazitaet = poolkapazitaet;
	}

	/**
	 * @return the poolnotiz
	 */
	public String getPoolnotiz() {
		return poolnotiz;
	}

	/**
	 * @param poolnotiz the poolnotiz to set
	 */
	public void setPoolnotiz(String poolnotiz) {
		this.poolnotiz = poolnotiz;
	}

	/**
	 * @return the vertragskapazitaet
	 */
	public Vertragskapazitaet getVertragskapazitaet() {
		return vertragskapazitaet;
	}

	/**
	 * @param vertragskapazitaet the vertragskapazitaet to set
	 */
	public void setVertragskapazitaet(Vertragskapazitaet vertragskapazitaet) {
		this.vertragskapazitaet = vertragskapazitaet;
	}

}
