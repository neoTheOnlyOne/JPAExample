package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;

@NamedQuery(name = NamedQueryConstants.IDENTIFYLETTER_FINDALL, query = "Select new com.tsystems.rubin.server.dal.dvo.IdentifyLetterDVO"
	+ IdentifyLetter.COMMON_PICKLIST_FIELDS_STRING
	+ " from IdentifyLetter i "
	+ "order by i.designation")
@Entity
@Table(name = "KENNBUCHSTABE")
public class IdentifyLetter implements Serializable {

	/** The Constant COMMON_PICKLIST_FIELDS_STRING. */
	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(i.id, i.designation, "
			+ "i.identifyLetterId)";

	@Id
	@Column(name = "OID_KENNBUCHSTABE")
	private Long id;

	@Column(name = "KENNBUCHSTABENBEZE")
	private String designation;

	@Column(name = "KENNBUCHSTABEKENNU")
	private String identifyLetterId;

	@OneToMany(mappedBy = "identifyLetter")
	private Set<Circuit> circuits;

	private static final long serialVersionUID = 1L;

	public IdentifyLetter() {
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
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the identifyLetterId
	 */
	public String getIdentifyLetterId() {
		return identifyLetterId;
	}

	/**
	 * @param identifyLetterId the identifyLetterId to set
	 */
	public void setIdentifyLetterId(String identifyLetterId) {
		this.identifyLetterId = identifyLetterId;
	}

	/**
	 * @return the circuits
	 */
	public Set<Circuit> getCircuits() {
		return circuits;
	}

	/**
	 * @param circuits the circuits to set
	 */
	public void setCircuits(Set<Circuit> circuits) {
		this.circuits = circuits;
	}

	
}
