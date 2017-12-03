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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="IH_CABLE")
public class IhCable implements Serializable {
	@Id
	@Column(name="OID_INHOUSE_CABLE")
	private Long id;

	@Column(name="IHC_DATE_INSTALLED")
	private Date dateInstalled;

	@Column(name="IHC_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="IHC_DESIGNATION")
	private String designation;

	@Column(name="IHC_DESIGNATION_SU")
	private String designationSearch;

	@Column(name="IHC_UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_IH_CABLE_TYPOID")
	private IhCableType ihCableType;

	@OneToMany(mappedBy="ihCable")
	private Set<IhCableTerminati> ihCableTerminations;

	@OneToMany(mappedBy="ihCable")
	private Set<Costs> costs;

	private static final long serialVersionUID = 1L;

	public IhCable() {
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
	 * @return the dateInstalled
	 */
	public Date getDateInstalled() {
		return dateInstalled;
	}

	/**
	 * @param dateInstalled the dateInstalled to set
	 */
	public void setDateInstalled(Date dateInstalled) {
		this.dateInstalled = dateInstalled;
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
	 * @return the designationSearch
	 */
	public String getDesignationSearch() {
		return designationSearch;
	}

	/**
	 * @param designationSearch the designationSearch to set
	 */
	public void setDesignationSearch(String designationSearch) {
		this.designationSearch = designationSearch;
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
	 * @return the ihCableType
	 */
	public IhCableType getIhCableType() {
		return ihCableType;
	}

	/**
	 * @param ihCableType the ihCableType to set
	 */
	public void setIhCableType(IhCableType ihCableType) {
		this.ihCableType = ihCableType;
	}

	/**
	 * @return the ihCableTerminations
	 */
	public Set<IhCableTerminati> getIhCableTerminations() {
		return ihCableTerminations;
	}

	/**
	 * @param ihCableTerminations the ihCableTerminations to set
	 */
	public void setIhCableTerminations(Set<IhCableTerminati> ihCableTerminations) {
		this.ihCableTerminations = ihCableTerminations;
	}

	/**
	 * @return the costs
	 */
	public Set<Costs> getCosts() {
		return costs;
	}

	/**
	 * @param costs the costs to set
	 */
	public void setCosts(Set<Costs> costs) {
		this.costs = costs;
	}

	
}
