package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;

/**
 * The persistent class for the SLA database table.
 */
@NamedQueries({@NamedQuery(name = NamedQueryConstants.SLA_FINDALLSLAWITHCUSTOMERCLASS, query = "Select new com.tsystems.rubin.server.dal.dvo.SlaDVO"
	+ Sla.COMMON_PICKLIST_FIELDS_STRING +" from Sla s JOIN s.customerclass cc order by s.id")})
@Entity
public class Sla implements Serializable {
	
	/** Serial Version Id. */
	private static final long serialVersionUID = 1L;
	
	/** The Constant COMMON_PICKLIST_FIELDS_STRING. */
	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(s.id,  s.name,  " +
			"s.customerclass.id, s.customerclass.customerClass )";
	
	@Id
	@Column(name="SLA_OID")
	private Long id;

	@Column(name="SLA_NAME")
	private String name;

	@Column(name="SLA_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="SLA_UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CUSTOMERCLASOID_CUSTOMERCLA")
	private Customerclass customerclass;

	@OneToMany(mappedBy="sla")
	private Set<SlaProduct> slaProducts;

	@OneToMany(mappedBy="sla")
	private Set<SlaIndividual> slaIndividuals;

	@OneToMany(mappedBy="sla")
	private Set<SlaRecord> slaRecords;

	public Sla() {
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
	 * @return the customerclass
	 */
	public Customerclass getCustomerclass() {
		return customerclass;
	}

	/**
	 * @param customerclass the customerclass to set
	 */
	public void setCustomerclass(Customerclass customerclass) {
		this.customerclass = customerclass;
	}

	/**
	 * @return the slaProducts
	 */
	public Set<SlaProduct> getSlaProducts() {
		return slaProducts;
	}

	/**
	 * @param slaProducts the slaProducts to set
	 */
	public void setSlaProducts(Set<SlaProduct> slaProducts) {
		this.slaProducts = slaProducts;
	}

	/**
	 * @return the slaIndividuals
	 */
	public Set<SlaIndividual> getSlaIndividuals() {
		return slaIndividuals;
	}

	/**
	 * @param slaIndividuals the slaIndividuals to set
	 */
	public void setSlaIndividuals(Set<SlaIndividual> slaIndividuals) {
		this.slaIndividuals = slaIndividuals;
	}

	/**
	 * @return the slaRecords
	 */
	public Set<SlaRecord> getSlaRecords() {
		return slaRecords;
	}

	/**
	 * @param slaRecords the slaRecords to set
	 */
	public void setSlaRecords(Set<SlaRecord> slaRecords) {
		this.slaRecords = slaRecords;
	}

	
}
