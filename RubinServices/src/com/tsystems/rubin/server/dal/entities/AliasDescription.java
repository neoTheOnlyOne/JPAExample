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
@Table(name="ALIASBEZEICHNUNG")
public class AliasDescription implements Serializable {
	@Id
	@Column(name="OID_ALIASBEZEICHNU")
	private Long id;

	@Column(name="ALIASBEMERKUNG")
	private String Note;

	@Column(name="ALIASKENNUNG")
	private String aliasId;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID")
	private Circuit circuit;

	@OneToMany(mappedBy="aliasDescription")
	private Set<RoutingSection> RoutingSections;

	private static final long serialVersionUID = 1L;

	public AliasDescription() {
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
	 * @return the note
	 */
	public String getNote() {
		return Note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		Note = note;
	}

	/**
	 * @return the aliasId
	 */
	public String getAliasId() {
		return aliasId;
	}

	/**
	 * @param aliasId the aliasId to set
	 */
	public void setAliasId(String aliasId) {
		this.aliasId = aliasId;
	}

	/**
	 * @return the circuit
	 */
	public Circuit getCircuit() {
		return circuit;
	}

	/**
	 * @param circuit the circuit to set
	 */
	public void setCircuit(Circuit circuit) {
		this.circuit = circuit;
	}

	/**
	 * @return the routingSections
	 */
	public Set<RoutingSection> getRoutingSections() {
		return RoutingSections;
	}

	/**
	 * @param routingSections the routingSections to set
	 */
	public void setRoutingSections(Set<RoutingSection> routingSections) {
		RoutingSections = routingSections;
	}

	}
