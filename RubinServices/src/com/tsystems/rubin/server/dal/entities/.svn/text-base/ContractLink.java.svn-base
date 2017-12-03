package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CONTRACT_LINK")
public class ContractLink implements Serializable {
	@Id
	@Column(name="OID_CONTRACT_LINK")
	private Long id;

	@Column(name="CONTRACT_LINK_TYPE")
	private String type;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ENDPUNKTOID_ENDPUNKT")
	private Terminal terminalA;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK0ENDPUNKTOID_ENDPUNKT")
	private Terminal terminalB;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_NUTZUNGSKONTOID_NUTZUNGSKON")
	private Nutzungskontingent nutzungskontingent;

	private static final long serialVersionUID = 1L;

	public ContractLink() {
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the terminalA
	 */
	public Terminal getTerminalA() {
		return terminalA;
	}

	/**
	 * @param terminalA the terminalA to set
	 */
	public void setTerminalA(Terminal terminalA) {
		this.terminalA = terminalA;
	}

	/**
	 * @return the terminalB
	 */
	public Terminal getTerminalB() {
		return terminalB;
	}

	/**
	 * @param terminalB the terminalB to set
	 */
	public void setTerminalB(Terminal terminalB) {
		this.terminalB = terminalB;
	}

	/**
	 * @return the nutzungskontingent
	 */
	public Nutzungskontingent getNutzungskontingent() {
		return nutzungskontingent;
	}

	/**
	 * @param nutzungskontingent the nutzungskontingent to set
	 */
	public void setNutzungskontingent(Nutzungskontingent nutzungskontingent) {
		this.nutzungskontingent = nutzungskontingent;
	}


}
