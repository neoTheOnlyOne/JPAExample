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
@Table(name="DISTRIBUTOR_FRAME")
public class DistributorFrame implements Serializable {
	@Id
	@Column(name="OID_DISTRIBUTOR")
	private Long id;

	@Column(name="DI_DATE_INSTALLED")
	private Date dateInstalled;

	@Column(name="DI_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="DI_DESIGNATION")
	private String designation;

	@Column(name="DI_DESIGNATION_SUC")
	private String designationSearch;

	@Column(name="DI_FRAME_POSITION")
	private String framePosition;

	@Column(name="DI_REMARK")
	private String remark;

	@Column(name="DI_SORT_POSITION")
	private Long sortPosition;

	@Column(name="DI_UPDATED_BY")
	private String updatedBy;

	@Column(name="FK_DISTRIBUTOR_OID_DISTRIBUTOR")
	private Long fkDistributorOidDistributor;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_DISTRIBUTOR_OID")
	private DistributorFType distributorFType;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ENDPUNKTOID_ENDPUNKT")
	private Terminal terminal;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_RACKOID_RACK")
	private Rack rack;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ROOMOID_ROOM")
	private Room room;

	@OneToMany(mappedBy="distributorFrame")
	private Set<IhCableTerminati> ihCableTerminatis;

	@OneToMany(mappedBy="distributorFrame")
	private Set<Costs> costs;

	@OneToMany(mappedBy="distributorFrame")
	private Set<DistributorPoint> distributorPoints;

	private static final long serialVersionUID = 1L;

	public DistributorFrame() {
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
	 * @return the framePosition
	 */
	public String getFramePosition() {
		return framePosition;
	}

	/**
	 * @param framePosition the framePosition to set
	 */
	public void setFramePosition(String framePosition) {
		this.framePosition = framePosition;
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
	 * @return the sortPosition
	 */
	public Long getSortPosition() {
		return sortPosition;
	}

	/**
	 * @param sortPosition the sortPosition to set
	 */
	public void setSortPosition(Long sortPosition) {
		this.sortPosition = sortPosition;
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
	 * @return the fkDistributorOidDistributor
	 */
	public Long getFkDistributorOidDistributor() {
		return fkDistributorOidDistributor;
	}

	/**
	 * @param fkDistributorOidDistributor the fkDistributorOidDistributor to set
	 */
	public void setFkDistributorOidDistributor(
			Long fkDistributorOidDistributor) {
		this.fkDistributorOidDistributor = fkDistributorOidDistributor;
	}

	/**
	 * @return the distributorFType
	 */
	public DistributorFType getDistributorFType() {
		return distributorFType;
	}

	/**
	 * @param distributorFType the distributorFType to set
	 */
	public void setDistributorFType(DistributorFType distributorFType) {
		this.distributorFType = distributorFType;
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
	 * @return the rack
	 */
	public Rack getRack() {
		return rack;
	}

	/**
	 * @param rack the rack to set
	 */
	public void setRack(Rack rack) {
		this.rack = rack;
	}

	/**
	 * @return the room
	 */
	public Room getRoom() {
		return room;
	}

	/**
	 * @param room the room to set
	 */
	public void setRoom(Room room) {
		this.room = room;
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
