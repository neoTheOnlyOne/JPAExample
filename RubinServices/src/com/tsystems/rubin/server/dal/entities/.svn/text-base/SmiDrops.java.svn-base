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
import javax.persistence.Table;

@Entity
@Table(name="SMI_DROPS")
public class SmiDrops implements Serializable {
	@Id
	@Column(name="OID_DROPS")
	private Long id;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SMI_KVIOID_KVI")
	private SmiKvi smiKvi;

	@OneToMany(mappedBy="smiDrops")
	private Set<SmiDrop> smiDrops;

	@OneToMany(mappedBy="smiDrops")
	private Set<SmiDropgroup> smiDropgroups;

	private static final long serialVersionUID = 1L;

	public SmiDrops() {
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
	 * @return the smiKvi
	 */
	public SmiKvi getSmiKvi() {
		return smiKvi;
	}

	/**
	 * @param smiKvi the smiKvi to set
	 */
	public void setSmiKvi(SmiKvi smiKvi) {
		this.smiKvi = smiKvi;
	}

	/**
	 * @return the smiDrops
	 */
	public Set<SmiDrop> getSmiDrops() {
		return smiDrops;
	}

	/**
	 * @param smiDrops the smiDrops to set
	 */
	public void setSmiDrops(Set<SmiDrop> smiDrops) {
		this.smiDrops = smiDrops;
	}

	/**
	 * @return the smiDropgroups
	 */
	public Set<SmiDropgroup> getSmiDropgroups() {
		return smiDropgroups;
	}

	/**
	 * @param smiDropgroups the smiDropgroups to set
	 */
	public void setSmiDropgroups(Set<SmiDropgroup> smiDropgroups) {
		this.smiDropgroups = smiDropgroups;
	}

}
