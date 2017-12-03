package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;

@NamedQueries( {
		@NamedQuery(name = NamedQueryConstants.SLA_INDIVIDUAL_FINDSLAIDIVIDUALIDBYCIRCUITID, query = "select si.id"
				+ " from SlaIndividual si JOIN si.circuit c where c.id =?1"),
		@NamedQuery(name = NamedQueryConstants.SLA_INDIVIDUAL_FINDSLAINDIVIDUALANDCUSTOMERCLASS, query = "select new com.tsystems.rubin.server.dal.dvo.SlaIndividualDVO"
				+ SlaIndividual.COMMON_PICKLIST_FIELDS_STRING
				+ " from SlaIndividual si JOIN si.sla sla JOIN sla.customerclass cc order by si.id"),
		@NamedQuery(name = NamedQueryConstants.SLA_INDIVIDUAL_FINDSLAINDIVIDUALBYCIRCUITID, query = "select si"
				+ " from SlaIndividual si JOIN si.circuit c where c.id =?1") })
@Entity				
@Table(name = "SLA_INDIVIDUELL")
public class SlaIndividual implements Serializable {

	/**
	 * Serial Version Id.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The Constant COMMON_PICKLIST_FIELDS_STRING to extract join table sla and
	 * customerclass.
	 */
	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(si.id,si.name, si.dateUpdated,"
			+ " si.updatedBy, si.sla.id, si.sla.name, "
			+ "si.sla.customerclass.id, si.sla.customerclass.customerClass)";


	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SlaIndividuell")
    @SequenceGenerator(name = "SlaIndividuell", sequenceName = "SLA_INDIVIDUELL_SEQUENCE", allocationSize = 1)
	@Column(name = "SLA_INDIVIDUELL_OID")
	private Long id;

	@Column(name = "SLA_INDIVIDUELL_NAME")
	private String name;

	@Column(name = "SLA_INDIVIDUELL_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name = "SLA_INDIVIDUELL_UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "FK_SLASLA_OID")
	private Sla sla;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID_TRANSPORTVE")
	private Circuit circuit;

	@OneToMany(mappedBy = "slaIndividual")
	private Set<SlaRecordIndividual> slaRecordIndividuals;

	/**
	 * Default constructor.
	 */
	public SlaIndividual() {
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dateUpdated
	 */
	public Date getDateUpdated() {
		return dateUpdated;
	}

	/**
	 * @param dateUpdated the dateUpdated to set
	 */
	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the sla
	 */
	public Sla getSla() {
		return sla;
	}

	/**
	 * @param sla the sla to set
	 */
	public void setSla(Sla sla) {
		this.sla = sla;
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
	 * @return the slaRecordIndividuals
	 */
	public Set<SlaRecordIndividual> getSlaRecordIndividuals() {
		return slaRecordIndividuals;
	}

	/**
	 * @param slaRecordIndividuals the slaRecordIndividuals to set
	 */
	public void setSlaRecordIndividuals(
			Set<SlaRecordIndividual> slaRecordIndividuals) {
		this.slaRecordIndividuals = slaRecordIndividuals;
	}


}
