package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
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
@Table(name="DISTRIBUTOR_ELEME0")
public class DistributorEleme0 implements Serializable {
	@Id
	@Column(name="OID_DISTRIBUTOR_EL")
	private Long id;

	@Column(name="DIE_DATE_INSTALLED")
	private Date dateInstalled;

	@Column(name="DIE_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="DIE_POSITION")
	private String position;

	@Column(name="DIE_REMARK")
	private String remark;

	@Column(name="DIE_SORT_ORDER_NO")
	private Long sortOrderNo;

	@Column(name="DIE_UPDATED_BY")
	private String updatedBy;

	@Column(name="FK_DISTRIBUTOROID")
	private Long distributoroid2;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_DISTRIBUTOR_OID")
	private DistributorElemen distributorElemen;

	@OneToMany(mappedBy="distributorEleme0")
	private Set<IhCableTerminati> ihCableTerminatis;

	@OneToMany(mappedBy="distributorEleme")
	private Set<Costs> costs;

	@OneToMany(mappedBy="distributorEleme0")
	private Set<DistributorPoint> distributorPoints;

	private static final long serialVersionUID = 1L;

	public DistributorEleme0() {
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
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
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
	 * @return the sortOrderNo
	 */
	public Long getSortOrderNo() {
		return sortOrderNo;
	}

	/**
	 * @param sortOrderNo the sortOrderNo to set
	 */
	public void setSortOrderNo(Long sortOrderNo) {
		this.sortOrderNo = sortOrderNo;
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
	 * @return the distributoroid2
	 */
	public Long getDistributoroid2() {
		return distributoroid2;
	}

	/**
	 * @param distributoroid2 the distributoroid2 to set
	 */
	public void setDistributoroid2(Long distributoroid2) {
		this.distributoroid2 = distributoroid2;
	}

	/**
	 * @return the distributorElemen
	 */
	public DistributorElemen getDistributorElemen() {
		return distributorElemen;
	}

	/**
	 * @param distributorElemen the distributorElemen to set
	 */
	public void setDistributorElemen(DistributorElemen distributorElemen) {
		this.distributorElemen = distributorElemen;
	}

	/**
	 * @return the ihCableTerminatis
	 */
	public Set<IhCableTerminati> getIhCableTerminatis() {
		return ihCableTerminatis;
	}

	/**
	 * @param ihCableTerminatis the ihCableTerminatis to set
	 */
	public void setIhCableTerminatis(Set<IhCableTerminati> ihCableTerminatis) {
		this.ihCableTerminatis = ihCableTerminatis;
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

	/**
	 * @return the distributorPoints
	 */
	public Set<DistributorPoint> getDistributorPoints() {
		return distributorPoints;
	}

	/**
	 * @param distributorPoints the distributorPoints to set
	 */
	public void setDistributorPoints(Set<DistributorPoint> distributorPoints) {
		this.distributorPoints = distributorPoints;
	}

	
}
