package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;
@NamedQueries( {
	@NamedQuery(name = NamedQueryConstants.FIND_E_ROUTINGSCTIONTYPEINFO_BYROUTINGSECTIONID, 
			    query = "Select new com.tsystems.rubin.server.dal.dvo.CrossConnectDVO" + 
			             CrossConnect.COMMON_PICKLIST_FIELDS_STRING + " from CrossConnect c" + 
			             " where c.routingSection.id = ?1")
			
 })
@Entity
@Table(name="CROSS_CONNECT")
public class CrossConnect implements Serializable {
	/** The Constant COMMON_PICKLIST_FIELDS_STRING. */
    @Transient
	final static String COMMON_PICKLIST_FIELDS_STRING="(c.terminal.site.designationNational," +
			                                           "c.terminal.ituSuffix)";

	@Id
	@Column(name="CC_OID")
	private Long id;

	@Column(name="CC_NOTE")
	private String note;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ENDPUNKTOID_ENDPUNKT")
	private Terminal terminal;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_FUEHRUNGSABSOID_FUEHRUNGSAB")
	private RoutingSection routingSection;

	private static final long serialVersionUID = 1L;

	public CrossConnect() {
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
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the terminal
	 */
	public Terminal getTerminal() {
		return terminal;
	}

	/**
	 * @param terminal the terminal to set
	 */
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}

	/**
	 * @return the routingSection
	 */
	public RoutingSection getRoutingSection() {
		return routingSection;
	}

	/**
	 * @param routingSection the routingSection to set
	 */
	public void setRoutingSection(RoutingSection routingSection) {
		this.routingSection = routingSection;
	}


}
