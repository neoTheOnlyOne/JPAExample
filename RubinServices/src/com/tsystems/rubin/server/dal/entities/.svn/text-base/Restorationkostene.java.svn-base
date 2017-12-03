package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Restorationkostene implements Serializable {
	@Id
	@Column(name="OID_RESTORATIONKOS")
	private Long id;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_RESTORATIONKOID")
	private Restorationkostenp restorationkostenp;

	@OneToMany(mappedBy="restorationkostene")
	private Set<Restorationnutzer> restorationnutzers;

	private static final long serialVersionUID = 1L;

	public Restorationkostene() {
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
	 * @return the restorationkostenp
	 */
	public Restorationkostenp getRestorationkostenp() {
		return restorationkostenp;
	}

	/**
	 * @param restorationkostenp the restorationkostenp to set
	 */
	public void setRestorationkostenp(Restorationkostenp restorationkostenp) {
		this.restorationkostenp = restorationkostenp;
	}

	/**
	 * @return the restorationnutzers
	 */
	public Set<Restorationnutzer> getRestorationnutzers() {
		return restorationnutzers;
	}

	/**
	 * @param restorationnutzers the restorationnutzers to set
	 */
	public void setRestorationnutzers(Set<Restorationnutzer> restorationnutzers) {
		this.restorationnutzers = restorationnutzers;
	}

}
