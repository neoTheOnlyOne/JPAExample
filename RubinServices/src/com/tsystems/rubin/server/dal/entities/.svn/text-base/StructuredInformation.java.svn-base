package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;

@NamedQueries( {
		@NamedQuery(name = NamedQueryConstants.STRUCTURED_INFORMATION_OFCIRCUIT, query = "Select new com.tsystems.rubin.server.dal.dvo.StructuredInformationDVO"
				+ StructuredInformation.COMMON_PICKLIST_FIELDS_STRING
				+ " from StructuredInformation s JOIN s.structuredInformationType st"
				+ " JOIN s.circuit c"
				+ " where c.id = ?1"
				+ " order by s.designation"),
		@NamedQuery(name = NamedQueryConstants.STRUCTUREDINFORMATION_BYID, query = "Select new com.tsystems.rubin.server.dal.dvo.StructuredInformationDVO"
				+ StructuredInformation.COMMON_PICKLIST_FIELDS_STRING
				+ " from StructuredInformation s where s.id = ?1"),
		@NamedQuery(name = NamedQueryConstants.FIND_CIRCUITID_BYSTRUCTUREDINFORMATIONID, query = "Select s.circuit.id"
				+ " from StructuredInformation s where s.id = ?1") })
@Entity
@Table(name="STRUCT_INFO")
public class StructuredInformation implements Serializable {
	

	/** The Constant COMMON_PICKLIST_FIELDS_STRING. */
    @Transient
	final static String COMMON_PICKLIST_FIELDS_STRING="(s.id, s.designation,s.remark, s.structuredInformationType.id, " +
			                        "s.structuredInformationType.designation, s.circuit.id)";
	
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "StructInfo")
    @SequenceGenerator(name = "StructInfo", sequenceName = "STRUCT_INFO_SEQUENCE", allocationSize = 1)
	@Column(name="OID_STRUCT_INFO")
	private Long id;

	@Column(name="DESIGNATION")
	private String designation;

	@Column(name="REMARK")
	private String remark;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_STRUCT_INFO_OID_STRUCT_INFO")
	private StructuredInformationType structuredInformationType;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID_TRANSPORTVE")
	private Circuit circuit;

	@ManyToMany(mappedBy="structuredInformations")
	private Set<RoutingSection> routingSection;
	
	private static final long serialVersionUID = 1L;

	public StructuredInformation() {
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
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the structuredInformationType
	 */
	public StructuredInformationType getStructuredInformationType() {
		return structuredInformationType;
	}

	/**
	 * @param structuredInformationType the structuredInformationType to set
	 */
	public void setStructuredInformationType(
			StructuredInformationType structuredInformationType) {
		this.structuredInformationType = structuredInformationType;
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
	 * @return the routingSection
	 */
	public Set<RoutingSection> getRoutingSection() {
		return routingSection;
	}

	/**
	 * @param routingSection the routingSection to set
	 */
	public void setRoutingSection(Set<RoutingSection> routingSection) {
		this.routingSection = routingSection;
	}

}
