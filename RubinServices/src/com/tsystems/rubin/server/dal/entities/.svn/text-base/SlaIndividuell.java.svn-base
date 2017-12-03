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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;

@NamedQueries({@NamedQuery(name = NamedQueryConstants.SLA_INDIVIDUELL_FINDSLAIDIVIDUELLIDBYCIRCUITID, query = "select si.id" +
		" from SlaIndividuell si JOIN si.fkTransportveroidTransportve t where t.oidTransportverbi =?1"),
		@NamedQuery(name=NamedQueryConstants.SLA_INDIVIDUELL_FINDSLAINDIVIDUELLANDCUSTOMERCLASS, query="select new com.tsystems.rubin.server.transmodservices.to.SlaIndividuellTO" +
		SlaIndividuell.COMMON_PICKLIST_FIELDS_STRING +
		" from SlaIndividuell si JOIN si.fkSlaslaOid sla JOIN sla.fkCustomerclasoidCustomercla cc order by si.id"),
		@NamedQuery(name = NamedQueryConstants.SLA_INDIVIDUELL_FINDSLAINDIVIDUELLBYCIRCUITID, query = "select si" +
		" from SlaIndividuell si JOIN si.fkTransportveroidTransportve t where t.oidTransportverbi =?1")
		})
@Entity
@Table(name = "SLA_INDIVIDUELL")
public class SlaIndividuell implements Serializable {

	/**
	 * Serial Version Id.
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * The Constant COMMON_PICKLIST_FIELDS_STRING to extract join table sla and
	 * customerclass.
	 */
	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(si.id,si.slaIndividuellName, si.slaIndividuellDateUpdated,"
			+ " si.slaIndividuellUpdatedBy, si.fkSlaslaOid.id, si.fkSlaslaOid.slaName, "
			+ "si.fkSlaslaOid.fkCustomerclasoidCustomercla.id, si.fkSlaslaOid.fkCustomerclasoidCustomercla.customerClass)";

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SlaIndividuell")
    @SequenceGenerator(name = "SlaIndividuell", sequenceName = "SLA_INDIVIDUELL_SEQUENCE", allocationSize = 1)
	@Column(name = "SLA_INDIVIDUELL_OID")
	private Long id;

	@Column(name = "SLA_INDIVIDUELL_NAME")
	private String slaIndividuellName;

	@Column(name = "SLA_INDIVIDUELL_DATE_UPDATED")
	private Date slaIndividuellDateUpdated;

	@Column(name = "SLA_INDIVIDUELL_UPDATED_BY")
	private String slaIndividuellUpdatedBy;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_SLASLA_OID")
	private Sla fkSlaslaOid;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_TRANSPORTVEROID_TRANSPORTVE")
	private Transportverbindun fkTransportveroidTransportve;

	@OneToMany(mappedBy = "fkSlaIndividuslaIndividuell")
	private Set<SlaRecordIndividuell> slaRecordIndividuellCollection;

	/**
	 * Default constructor.
	 */
	public SlaIndividuell() {
		super();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the slaIndividuellName
	 */
	public String getSlaIndividuellName() {
		return slaIndividuellName;
	}

	/**
	 * @param slaIndividuellName
	 *            the slaIndividuellName to set
	 */
	public void setSlaIndividuellName(String slaIndividuellName) {
		this.slaIndividuellName = slaIndividuellName;
	}

	/**
	 * @return the slaIndividuellDateUpdated
	 */
	public Date getSlaIndividuellDateUpdated() {
		return slaIndividuellDateUpdated;
	}

	/**
	 * @param slaIndividuellDateUpdated
	 *            the slaIndividuellDateUpdated to set
	 */
	public void setSlaIndividuellDateUpdated(Date slaIndividuellDateUpdated) {
		this.slaIndividuellDateUpdated = slaIndividuellDateUpdated;
	}

	/**
	 * @return the slaIndividuellUpdatedBy
	 */
	public String getSlaIndividuellUpdatedBy() {
		return slaIndividuellUpdatedBy;
	}

	/**
	 * @param slaIndividuellUpdatedBy
	 *            the slaIndividuellUpdatedBy to set
	 */
	public void setSlaIndividuellUpdatedBy(String slaIndividuellUpdatedBy) {
		this.slaIndividuellUpdatedBy = slaIndividuellUpdatedBy;
	}

	/**
	 * @return the fkSlaslaOid
	 */
	public Sla getFkSlaslaOid() {
		return fkSlaslaOid;
	}

	/**
	 * @param fkSlaslaOid
	 *            the fkSlaslaOid to set
	 */
	public void setFkSlaslaOid(Sla fkSlaslaOid) {
		this.fkSlaslaOid = fkSlaslaOid;
	}

	/**
	 * @return the fkTransportveroidTransportve
	 */
	public Transportverbindun getFkTransportveroidTransportve() {
		return fkTransportveroidTransportve;
	}

	/**
	 * @param fkTransportveroidTransportve
	 *            the fkTransportveroidTransportve to set
	 */
	public void setFkTransportveroidTransportve(Transportverbindun fkTransportveroidTransportve) {
		this.fkTransportveroidTransportve = fkTransportveroidTransportve;
	}

	/**
	 * @return the slaRecordIndividuellCollection
	 */
	public Set<SlaRecordIndividuell> getSlaRecordIndividuellCollection() {
		return slaRecordIndividuellCollection;
	}

	/**
	 * @param slaRecordIndividuellCollection
	 *            the slaRecordIndividuellCollection to set
	 */
	public void setSlaRecordIndividuellCollection(Set<SlaRecordIndividuell> slaRecordIndividuellCollection) {
		this.slaRecordIndividuellCollection = slaRecordIndividuellCollection;
	}
}
