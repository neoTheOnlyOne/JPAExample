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
@Table(name="WORKING_AREA")
public class WorkingArea implements Serializable {
	@Id
	@Column(name="OID_WORKING_AREA")
	private Long id;

	@Column(name="CAPACITY_AREA_AVAILABILITY")
	private String capacityAreaAvailability;

	@Column(name="CONTRACT_STATUS")
	private String contractStatus;

	@Column(name="INHOUSE_WIRING")
	private String inhouseWiring;

	@Column(name="LAST_UPDATED")
	private Date lastUpdated;

	@Column(name="LINK_TO_ORDER_FORM")
	private String linkToOrderForm;

	private String notes;

	private String priority;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LANDOID_LAND")
	private Country country;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LOCAL_LOOP_COID_LOOP_CONTRA")
	private LocalLoopContract localLoopContract;

	@OneToMany(mappedBy="workingArea")
	private Set<KindOfService> kindOfServices;

	@OneToMany(mappedBy="workingArea")
	private Set<LeadTime> leadTimes;

	@OneToMany(mappedBy="workingArea")
	private Set<OrderProcedure> orderProcedures;

	@OneToMany(mappedBy="workingArea")
	private Set<RoutingSection> routingSections;

	@OneToMany(mappedBy="workingArea")
	private Set<Interface> interfaces;

	private static final long serialVersionUID = 1L;

	public WorkingArea() {
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
	 * @return the capacityAreaAvailability
	 */
	public String getCapacityAreaAvailability() {
		return capacityAreaAvailability;
	}

	/**
	 * @param capacityAreaAvailability the capacityAreaAvailability to set
	 */
	public void setCapacityAreaAvailability(String capacityAreaAvailability) {
		this.capacityAreaAvailability = capacityAreaAvailability;
	}

	/**
	 * @return the contractStatus
	 */
	public String getContractStatus() {
		return contractStatus;
	}

	/**
	 * @param contractStatus the contractStatus to set
	 */
	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	/**
	 * @return the inhouseWiring
	 */
	public String getInhouseWiring() {
		return inhouseWiring;
	}

	/**
	 * @param inhouseWiring the inhouseWiring to set
	 */
	public void setInhouseWiring(String inhouseWiring) {
		this.inhouseWiring = inhouseWiring;
	}

	/**
	 * @return the lastUpdated
	 */
	public Date getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * @param lastUpdated the lastUpdated to set
	 */
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	/**
	 * @return the linkToOrderForm
	 */
	public String getLinkToOrderForm() {
		return linkToOrderForm;
	}

	/**
	 * @param linkToOrderForm the linkToOrderForm to set
	 */
	public void setLinkToOrderForm(String linkToOrderForm) {
		this.linkToOrderForm = linkToOrderForm;
	}

	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
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
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * @return the localLoopContract
	 */
	public LocalLoopContract getLocalLoopContract() {
		return localLoopContract;
	}

	/**
	 * @param localLoopContract the localLoopContract to set
	 */
	public void setLocalLoopContract(LocalLoopContract localLoopContract) {
		this.localLoopContract = localLoopContract;
	}

	/**
	 * @return the kindOfServices
	 */
	public Set<KindOfService> getKindOfServices() {
		return kindOfServices;
	}

	/**
	 * @param kindOfServices the kindOfServices to set
	 */
	public void setKindOfServices(Set<KindOfService> kindOfServices) {
		this.kindOfServices = kindOfServices;
	}

	/**
	 * @return the leadTimes
	 */
	public Set<LeadTime> getLeadTimes() {
		return leadTimes;
	}

	/**
	 * @param leadTimes the leadTimes to set
	 */
	public void setLeadTimes(Set<LeadTime> leadTimes) {
		this.leadTimes = leadTimes;
	}

	/**
	 * @return the orderProcedures
	 */
	public Set<OrderProcedure> getOrderProcedures() {
		return orderProcedures;
	}

	/**
	 * @param orderProcedures the orderProcedures to set
	 */
	public void setOrderProcedures(Set<OrderProcedure> orderProcedures) {
		this.orderProcedures = orderProcedures;
	}

	/**
	 * @return the routingSections
	 */
	public Set<RoutingSection> getRoutingSections() {
		return routingSections;
	}

	/**
	 * @param routingSections the routingSections to set
	 */
	public void setRoutingSections(Set<RoutingSection> routingSections) {
		this.routingSections = routingSections;
	}

	/**
	 * @return the interfaces
	 */
	public Set<Interface> getInterfaces() {
		return interfaces;
	}

	/**
	 * @param interfaces the interfaces to set
	 */
	public void setInterfaces(Set<Interface> interfaces) {
		this.interfaces = interfaces;
	}

}
