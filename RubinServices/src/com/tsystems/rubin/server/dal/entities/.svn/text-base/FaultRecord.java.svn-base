package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;

@NamedQueries({
	@NamedQuery(name = NamedQueryConstants.FAULTRECORD_FINDFAULTRECORD_BYCIRCUITID, query = "Select new com.tsystems.rubin.server.dal.dvo.FaultRecordDVO" +
			FaultRecord.COMMON_PICKLIST_FIELDS_STRING + " from FaultRecord f where f.circuit.id = ?1"),
	@NamedQuery(name = NamedQueryConstants.FAULTRECORD_FINDFAULTRECORD_BYCIRCUITID_AND_AL, query = "Select new com.tsystems.rubin.server.dal.dvo.FaultRecordDVO" + 
			FaultRecord.COMMON_PICKLIST_FIELDS_STRING + " from FaultRecord f where f.circuit.id = ?1 and" +
					" trim(both from f.circuit.additionalLetter) in('N','X')")
})
@Entity
@Table(name="FAULT_RECORD")
public class FaultRecord implements Serializable {
	
	/** The Constant COMMON_PICKLIST_FIELDS_STRING. */
	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(f.id, f.recordState)";
	
	@Id
	@Column(name="OID_FAULTRECORD")
	private Long id;

	@Column(name="LEVEL0")
	private String level;

	@Column(name="N_X_CIRCUIT")
	private String nXCircuit;

	@Column(name="PRIMAER_STOERER")
	private String primaryDisturber;

	@Column(name="RECORD_STATE")
	private String recordState;

	@Column(name="TIMESTAMP_ACTIVATED")
	private Date timestampActivated;

	@Column(name="TIMESTAMP_CLOSED")
	private Date timestampClosed;

	@Column(name="TIMESTAMP_LASTUPDATED")
	private Date timestampLastupdated;

	@Column(name="ZB")
	private String zb;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_FAULT_GROUPOID_FAULT_GROUP")
	private FaultGroup faultGroup;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_FAULT_RECORDOID_FAULTRECORD")
	private FaultRecord faultRecord;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID_TRANSPORTVE")
	private Circuit circuit;

	@OneToMany(mappedBy="faultRecord")
	private Set<FaultStatus> faultStatuses;

	@OneToMany(mappedBy="faultRecord")
	private Set<FaultHistory> faultHistories;

	@OneToMany(mappedBy="faultRecord")
	private Set<FaultRecord> faultRecords;

	@ManyToMany
	@JoinTable(name="BESCHREIBT_HISTORY",
		joinColumns=@JoinColumn(name="FK_FAULT_RECORDOID_FAULTRECORD"),
		inverseJoinColumns=@JoinColumn(name="FK_TRANSPORTVEROID_TRANSPORTVE"))
	private Set<Circuit> circuits;

	@ManyToMany
	@JoinTable(name="FAULTS",
		joinColumns=@JoinColumn(name="FK_FAULT_RECORDOID_FAULTRECORD"),
		inverseJoinColumns=@JoinColumn(name="FK_LEGOID_LEG"))
	private Set<Leg> legs;

	@ManyToMany
	@JoinTable(name="IS_MAPPED_TO",
		joinColumns=@JoinColumn(name="FK_FAULT_RECORDOID_FAULTRECORD"),
		inverseJoinColumns=@JoinColumn(name="FK_KONFIGURATIOOID_KONFIGURATI"))
	private Set<Configuration> configurations;

	@ManyToMany
	@JoinTable(name="IST_PRIMARY_RESTOR",
		joinColumns=@JoinColumn(name="FK_FAULT_RECORDOID_FAULTRECORD"),
		inverseJoinColumns=@JoinColumn(name="FK_RESTORATION_OID_RESTORATION"))
	private Set<RestorationGroup> restorationGroups;

	private static final long serialVersionUID = 1L;

	public FaultRecord() {
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
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * @return the nXCircuit
	 */
	public String getNXCircuit() {
		return nXCircuit;
	}

	/**
	 * @param circuit the nXCircuit to set
	 */
	public void setNXCircuit(String circuit) {
		nXCircuit = circuit;
	}

	/**
	 * @return the primaryDisturber
	 */
	public String getPrimaryDisturber() {
		return primaryDisturber;
	}

	/**
	 * @param primaryDisturber the primaryDisturber to set
	 */
	public void setPrimaryDisturber(String primaryDisturber) {
		this.primaryDisturber = primaryDisturber;
	}

	/**
	 * @return the recordState
	 */
	public String getRecordState() {
		return recordState;
	}

	/**
	 * @param recordState the recordState to set
	 */
	public void setRecordState(String recordState) {
		this.recordState = recordState;
	}

	/**
	 * @return the timestampActivated
	 */
	public Date getTimestampActivated() {
		return timestampActivated;
	}

	/**
	 * @param timestampActivated the timestampActivated to set
	 */
	public void setTimestampActivated(Date timestampActivated) {
		this.timestampActivated = timestampActivated;
	}

	/**
	 * @return the timestampClosed
	 */
	public Date getTimestampClosed() {
		return timestampClosed;
	}

	/**
	 * @param timestampClosed the timestampClosed to set
	 */
	public void setTimestampClosed(Date timestampClosed) {
		this.timestampClosed = timestampClosed;
	}

	/**
	 * @return the timestampLastupdated
	 */
	public Date getTimestampLastupdated() {
		return timestampLastupdated;
	}

	/**
	 * @param timestampLastupdated the timestampLastupdated to set
	 */
	public void setTimestampLastupdated(Date timestampLastupdated) {
		this.timestampLastupdated = timestampLastupdated;
	}

	/**
	 * @return the zb
	 */
	public String getZb() {
		return zb;
	}

	/**
	 * @param zb the zb to set
	 */
	public void setZb(String zb) {
		this.zb = zb;
	}

	/**
	 * @return the faultGroup
	 */
	public FaultGroup getFaultGroup() {
		return faultGroup;
	}

	/**
	 * @param faultGroup the faultGroup to set
	 */
	public void setFaultGroup(FaultGroup faultGroup) {
		this.faultGroup = faultGroup;
	}

	/**
	 * @return the faultRecord
	 */
	public FaultRecord getFaultRecord() {
		return faultRecord;
	}

	/**
	 * @param faultRecord the faultRecord to set
	 */
	public void setFaultRecord(FaultRecord faultRecord) {
		this.faultRecord = faultRecord;
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
	 * @return the faultHistories
	 */
	public Set<FaultHistory> getFaultHistories() {
		return faultHistories;
	}

	/**
	 * @param faultHistories the faultHistories to set
	 */
	public void setFaultHistories(Set<FaultHistory> faultHistories) {
		this.faultHistories = faultHistories;
	}

	/**
	 * @return the faultRecords
	 */
	public Set<FaultRecord> getFaultRecords() {
		return faultRecords;
	}

	/**
	 * @param faultRecords the faultRecords to set
	 */
	public void setFaultRecords(Set<FaultRecord> faultRecords) {
		this.faultRecords = faultRecords;
	}

	/**
	 * @return the circuits
	 */
	public Set<Circuit> getCircuits() {
		return circuits;
	}

	/**
	 * @param circuits the circuits to set
	 */
	public void setCircuits(Set<Circuit> circuits) {
		this.circuits = circuits;
	}

	/**
	 * @return the legs
	 */
	public Set<Leg> getLegs() {
		return legs;
	}

	/**
	 * @param legs the legs to set
	 */
	public void setLegs(Set<Leg> legs) {
		this.legs = legs;
	}

	/**
	 * @return the configurations
	 */
	public Set<Configuration> getConfigurations() {
		return configurations;
	}

	/**
	 * @param configurations the configurations to set
	 */
	public void setConfigurations(Set<Configuration> configurations) {
		this.configurations = configurations;
	}

	/**
	 * @return the restorationGroups
	 */
	public Set<RestorationGroup> getRestorationGroups() {
		return restorationGroups;
	}

	/**
	 * @param restorationGroups the restorationGroups to set
	 */
	public void setRestorationGroups(Set<RestorationGroup> restorationGroups) {
		this.restorationGroups = restorationGroups;
	}

	
}
