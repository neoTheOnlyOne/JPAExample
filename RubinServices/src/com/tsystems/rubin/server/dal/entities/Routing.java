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
	@NamedQuery(name = NamedQueryConstants.FIND_ROUTINGBYCIRCUITID, 
			    query = "Select new com.tsystems.rubin.server.dal.dvo.RoutingDVO" + Routing.COMMON_PICKLIST_FIELDS_STRING 
			            + " from Routing r where r.circuit.id = ?1" ),
			            @NamedQuery(name = NamedQueryConstants.ROUTING_FINDBYCIRCUITID_AND_FUEHRUNGSTATUS,
			        		    query = "Select r from Routing r where trim(both from r.typeOfRoutingBegin) = 'R' and trim(both from r.activeStatus) = 'I' and r.circuit.id = ?1")
			
 })
@Entity
@Table(name="FUEHRUNG")
public class Routing implements Serializable {
	
	@Transient
    final static String COMMON_PICKLIST_FIELDS_STRING = "(r.id)";
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Routing")
	@SequenceGenerator(name = "Routing", sequenceName = "FUEHRUNG_SEQUENCE", allocationSize = 1)
	@Column(name="OID_FUEHRUNG")
	private Long id;

	@Column(name="FUEHRUNG_FUEHRUNGS")
	private String typeOfRouting;

	@Column(name="FUEHRUNG_BEGINN")
	private Date start;

	@Column(name="FUEHRUNG_BEGINN_ST")
	private String activeStatus;

	@Column(name="FUEHRUNG_NOTIZ")
	private String remark;

	@Column(name="FUEHRUNG_PLANMAESS")
	private String plan;

	@Column(name="FUEHRUNG_SOLL_ENDE")
	private Date plannedEnd;

	@Column(name="FUEHRUNG_STATUS")
	private String consistenciesStatus;

	@Column(name="MASSNAHME_FUEHRUNG")
	private String typeOfRoutingBegin;

	@Column(name="MASSNAHME_FUEHRUN0")
	private String typeOfRoutingEnd;

	@Column(name="SCHALTAUFTRAG_FUEH")
	private String cwoAvailable;

	@Column(name="SCHALTAUFTRAG_BEG")
	private String cwoBeginAvailable;

	@Column(name="SCHALTAUFTRAG_END")
	private String cwoEndAvailable;

	@Column(name="RESTORATION")
	private String restorationAvailable;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK0ENDPUNKTOID_ENDPUNKT")
	private Terminal terminal0;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ENDPUNKTOID_ENDPUNKT")
	private Terminal terminal;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK0RESTORATION_OID_RESTORATION")
	private RestorationGroup restorationGroup0;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_RESTORATION_OID_RESTORATION")
	private RestorationGroup restorationGroup;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID")
	private Circuit circuit;

	@OneToMany(mappedBy="routing")
	private Set<FaultStatus> faultStatuses;

	@OneToMany(mappedBy="routing")
	private Set<RoutingSection> routingSections;

	@OneToMany(mappedBy="routing")
	private Set<CWO> cwos;

	@OneToMany(mappedBy="routing")
	private Set<CWO> cwos2;

	private static final long serialVersionUID = 1L;

	public Routing() {
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
	 * @return the typeOfRouting
	 */
	public String getTypeOfRouting() {
		return typeOfRouting;
	}

	/**
	 * @param typeOfRouting the typeOfRouting to set
	 */
	public void setTypeOfRouting(String typeOfRouting) {
		this.typeOfRouting = typeOfRouting;
	}

	/**
	 * @return the start
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart(Date start) {
		this.start = start;
	}

	/**
	 * @return the activeStatus
	 */
	public String getActiveStatus() {
		return activeStatus;
	}

	/**
	 * @param activeStatus the activeStatus to set
	 */
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
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
	 * @return the plan
	 */
	public String getPlan() {
		return plan;
	}

	/**
	 * @param plan the plan to set
	 */
	public void setPlan(String plan) {
		this.plan = plan;
	}

	/**
	 * @return the plannedEnd
	 */
	public Date getPlannedEnd() {
		return plannedEnd;
	}

	/**
	 * @param plannedEnd the plannedEnd to set
	 */
	public void setPlannedEnd(Date plannedEnd) {
		this.plannedEnd = plannedEnd;
	}

	/**
	 * @return the consistenciesStatus
	 */
	public String getConsistenciesStatus() {
		return consistenciesStatus;
	}

	/**
	 * @param consistenciesStatus the consistenciesStatus to set
	 */
	public void setConsistenciesStatus(String consistenciesStatus) {
		this.consistenciesStatus = consistenciesStatus;
	}

	/**
	 * @return the typeOfRoutingBegin
	 */
	public String getTypeOfRoutingBegin() {
		return typeOfRoutingBegin;
	}

	/**
	 * @param typeOfRoutingBegin the typeOfRoutingBegin to set
	 */
	public void setTypeOfRoutingBegin(String typeOfRoutingBegin) {
		this.typeOfRoutingBegin = typeOfRoutingBegin;
	}

	/**
	 * @return the typeOfRoutingEnd
	 */
	public String getTypeOfRoutingEnd() {
		return typeOfRoutingEnd;
	}

	/**
	 * @param typeOfRoutingEnd the typeOfRoutingEnd to set
	 */
	public void setTypeOfRoutingEnd(String typeOfRoutingEnd) {
		this.typeOfRoutingEnd = typeOfRoutingEnd;
	}

	/**
	 * @return the cwoAvailable
	 */
	public String getCwoAvailable() {
		return cwoAvailable;
	}

	/**
	 * @param cwoAvailable the cwoAvailable to set
	 */
	public void setCwoAvailable(String cwoAvailable) {
		this.cwoAvailable = cwoAvailable;
	}

	/**
	 * @return the cwoBeginAvailable
	 */
	public String getCwoBeginAvailable() {
		return cwoBeginAvailable;
	}

	/**
	 * @param cwoBeginAvailable the cwoBeginAvailable to set
	 */
	public void setCwoBeginAvailable(String cwoBeginAvailable) {
		this.cwoBeginAvailable = cwoBeginAvailable;
	}

	/**
	 * @return the cwoEndAvailable
	 */
	public String getCwoEndAvailable() {
		return cwoEndAvailable;
	}

	/**
	 * @param cwoEndAvailable the cwoEndAvailable to set
	 */
	public void setCwoEndAvailable(String cwoEndAvailable) {
		this.cwoEndAvailable = cwoEndAvailable;
	}

	/**
	 * @return the restorationAvailable
	 */
	public String getRestorationAvailable() {
		return restorationAvailable;
	}

	/**
	 * @param restorationAvailable the restorationAvailable to set
	 */
	public void setRestorationAvailable(String restorationAvailable) {
		this.restorationAvailable = restorationAvailable;
	}

	/**
	 * @return the terminal0
	 */
	public Terminal getTerminal0() {
		return terminal0;
	}

	/**
	 * @param terminal0 the terminal0 to set
	 */
	public void setTerminal0(Terminal terminal0) {
		this.terminal0 = terminal0;
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
	 * @return the restorationGroup0
	 */
	public RestorationGroup getRestorationGroup0() {
		return restorationGroup0;
	}

	/**
	 * @param restorationGroup0 the restorationGroup0 to set
	 */
	public void setRestorationGroup0(RestorationGroup restorationGroup0) {
		this.restorationGroup0 = restorationGroup0;
	}

	/**
	 * @return the restorationGroup
	 */
	public RestorationGroup getRestorationGroup() {
		return restorationGroup;
	}

	/**
	 * @param restorationGroup the restorationGroup to set
	 */
	public void setRestorationGroup(RestorationGroup restorationGroup) {
		this.restorationGroup = restorationGroup;
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
	 * @return the faultStatuses
	 */
	public Set<FaultStatus> getFaultStatuses() {
		return faultStatuses;
	}

	/**
	 * @param faultStatuses the faultStatuses to set
	 */
	public void setFaultStatuses(Set<FaultStatus> faultStatuses) {
		this.faultStatuses = faultStatuses;
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
	 * @return the cwos
	 */
	public Set<CWO> getCwos() {
		return cwos;
	}

	/**
	 * @param cwos the cwos to set
	 */
	public void setCwos(Set<CWO> cwos) {
		this.cwos = cwos;
	}

	/**
	 * @return the cwos2
	 */
	public Set<CWO> getCwos2() {
		return cwos2;
	}

	/**
	 * @param cwos2 the cwos2 to set
	 */
	public void setCwos2(Set<CWO> cwos2) {
		this.cwos2 = cwos2;
	}

}
