package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="GEN_COL_SELECTED")
public class GenColSelected implements Serializable {
	@Id
	@Column(name="OID_GEN_COL_SELECTED")
	private Long id;

	@Column(name="USER_SPEC_POSITION")
	private Long userSpecPosition;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_BEARBEITER_SZERTIFIKATSNUMM")
	private User user;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_GEN_COL_AVAIOID_GEN_COL_AVA")
	private GenColAvailabe genColAvailabe;

	@ManyToMany(mappedBy="genColsSelected")
	private Set<GenColCombination> genColCombinations;

	private static final long serialVersionUID = 1L;

	public GenColSelected() {
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
	 * @return the userSpecPosition
	 */
	public Long getUserSpecPosition() {
		return userSpecPosition;
	}

	/**
	 * @param userSpecPosition the userSpecPosition to set
	 */
	public void setUserSpecPosition(Long userSpecPosition) {
		this.userSpecPosition = userSpecPosition;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the genColAvailabe
	 */
	public GenColAvailabe getGenColAvailabe() {
		return genColAvailabe;
	}

	/**
	 * @param genColAvailabe the genColAvailabe to set
	 */
	public void setGenColAvailabe(GenColAvailabe genColAvailabe) {
		this.genColAvailabe = genColAvailabe;
	}

	/**
	 * @return the genColCombinations
	 */
	public Set<GenColCombination> getGenColCombinations() {
		return genColCombinations;
	}

	/**
	 * @param genColCombinations the genColCombinations to set
	 */
	public void setGenColCombinations(Set<GenColCombination> genColCombinations) {
		this.genColCombinations = genColCombinations;
	}

	
}
