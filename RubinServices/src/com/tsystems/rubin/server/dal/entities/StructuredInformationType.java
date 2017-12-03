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

@NamedQuery(name = NamedQueryConstants.STRUCTREDINFORMATIONTYPE_FINDALL, query = "Select new com.tsystems.rubin.server.dal.dvo.StructuredInformationTypeDVO"
		+ StructuredInformationType.COMMON_PICKLIST_FIELDS_STRING
		+ " from StructuredInformationType s " + "order by s.designation")
@Entity
@Table(name = "STRUCT_INFO_TYPE")
public class StructuredInformationType implements Serializable {

	/** The Constant COMMON_PICKLIST_FIELDS_STRING. */
	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(s.id, s.designation)";

	@Id
	@Column(name = "OID_STRUCT_INFO_TY")
	private Long id;

	@Column(name = "DESIGNATION")
	private String designation;

	@OneToMany(mappedBy = "structuredInformationType")
	private Set<StructuredInformation> structuredInformations;

	private static final long serialVersionUID = 1L;

	public StructuredInformationType() {
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
	 * @return the structuredInformations
	 */
	public Set<StructuredInformation> getStructuredInformations() {
		return structuredInformations;
	}

	/**
	 * @param structuredInformations the structuredInformations to set
	 */
	public void setStructuredInformations(
			Set<StructuredInformation> structuredInformations) {
		this.structuredInformations = structuredInformations;
	}

}
