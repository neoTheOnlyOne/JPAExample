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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Port implements Serializable {
	@Id
	@Column(name="OID_PORT")
	private Long id;

	@Column(name="CARRIER_OID")
	private Long carrierOid;

	@Column(name="PORT_ATTENUATION")
	private Long attenuation;

	@Column(name="PORT_CC_NOT_NULL")
	private String ccNotNull;

	@Column(name="PORT_CONTRACTIONAL_CAPACITY")
	private Long contractionalCapacity;

	@Column(name="PORT_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="PORT_EMS_DESIGNATI")
	private String emsDesignati;

	@Column(name="PORT_F1_F2")
	private String f1F2;

	@Column(name="PORT_FINISH_DATE")
	private Date finishDate;

	@Column(name="PORT_IP_ADDRESS")
	private String ipAddress;

	@Column(name="PORT_IPV6_ADDRESS")
	private String ipv6Address;

	@Column(name="PORT_PHYS_DESIGNAT")
	private String physDesignat;

	@Column(name="PORT_REMARK")
	private String remark;

	@Column(name="PORT_RESERVATION_DATE")
	private Date reservationDate;

	@Column(name="PORT_RESERVED_BY")
	private String reservedBy;

	@Column(name="PORT_RESERVED_FOR")
	private String reservedFor;

	@Column(name="PORT_RESERVED_PHONE")
	private String reservedPhone;

	@Column(name="PORT_SORT_ORDER_NO")
	private Long sortOrderNo;

	@Column(name="PORT_STATUS")
	private String status;

	@Column(name="PORT_STATUS_UPDATED")
	private Date statusUpdated;

	@Column(name="PORT_UPDATED_BY")
	private String updatedBy;

	@Column(name="SPIMS_FOREIGN_KEY")
	private String spimsForeignKey;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CARDOID_CARD")
	private Card card;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CONNECTOR_TYOID_CONNECTOR_T")
	private ConnectorType connectorType;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_EQUIPMENTOID_EQ")
	private Equipment equipment;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KAPAZITAETOID_KAPAZITAET")
	private Capacity capacity;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID_TRANSPORTVE")
	private Circuit circuit;

	@OneToMany(mappedBy="port")
	private Set<PpHistory> ppHistories;

	@OneToMany(mappedBy="port")
	private Set<Connector> connectors;

	@OneToMany(mappedBy="port1")
	private Set<DnaEciPort> dnaEciPorts;

	@ManyToMany(mappedBy="ports")
	private Set<RoutingSection> routingSections;

	private static final long serialVersionUID = 1L;

	public Port() {
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
	 * @return the carrierOid
	 */
	public Long getCarrierOid() {
		return carrierOid;
	}

	/**
	 * @param carrierOid the carrierOid to set
	 */
	public void setCarrierOid(Long carrierOid) {
		this.carrierOid = carrierOid;
	}

	/**
	 * @return the attenuation
	 */
	public Long getAttenuation() {
		return attenuation;
	}

	/**
	 * @param attenuation the attenuation to set
	 */
	public void setAttenuation(Long attenuation) {
		this.attenuation = attenuation;
	}

	/**
	 * @return the ccNotNull
	 */
	public String getCcNotNull() {
		return ccNotNull;
	}

	/**
	 * @param ccNotNull the ccNotNull to set
	 */
	public void setCcNotNull(String ccNotNull) {
		this.ccNotNull = ccNotNull;
	}

	/**
	 * @return the contractionalCapacity
	 */
	public Long getContractionalCapacity() {
		return contractionalCapacity;
	}

	/**
	 * @param contractionalCapacity the contractionalCapacity to set
	 */
	public void setContractionalCapacity(Long contractionalCapacity) {
		this.contractionalCapacity = contractionalCapacity;
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
	 * @return the emsDesignati
	 */
	public String getEmsDesignati() {
		return emsDesignati;
	}

	/**
	 * @param emsDesignati the emsDesignati to set
	 */
	public void setEmsDesignati(String emsDesignati) {
		this.emsDesignati = emsDesignati;
	}

	/**
	 * @return the f1F2
	 */
	public String getF1F2() {
		return f1F2;
	}

	/**
	 * @param f1f2 the f1F2 to set
	 */
	public void setF1F2(String f1f2) {
		f1F2 = f1f2;
	}

	/**
	 * @return the finishDate
	 */
	public Date getFinishDate() {
		return finishDate;
	}

	/**
	 * @param finishDate the finishDate to set
	 */
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * @param ipAddress the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * @return the ipv6Address
	 */
	public String getIpv6Address() {
		return ipv6Address;
	}

	/**
	 * @param ipv6Address the ipv6Address to set
	 */
	public void setIpv6Address(String ipv6Address) {
		this.ipv6Address = ipv6Address;
	}

	/**
	 * @return the physDesignat
	 */
	public String getPhysDesignat() {
		return physDesignat;
	}

	/**
	 * @param physDesignat the physDesignat to set
	 */
	public void setPhysDesignat(String physDesignat) {
		this.physDesignat = physDesignat;
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
	 * @return the reservationDate
	 */
	public Date getReservationDate() {
		return reservationDate;
	}

	/**
	 * @param reservationDate the reservationDate to set
	 */
	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	/**
	 * @return the reservedBy
	 */
	public String getReservedBy() {
		return reservedBy;
	}

	/**
	 * @param reservedBy the reservedBy to set
	 */
	public void setReservedBy(String reservedBy) {
		this.reservedBy = reservedBy;
	}

	/**
	 * @return the reservedFor
	 */
	public String getReservedFor() {
		return reservedFor;
	}

	/**
	 * @param reservedFor the reservedFor to set
	 */
	public void setReservedFor(String reservedFor) {
		this.reservedFor = reservedFor;
	}

	/**
	 * @return the reservedPhone
	 */
	public String getReservedPhone() {
		return reservedPhone;
	}

	/**
	 * @param reservedPhone the reservedPhone to set
	 */
	public void setReservedPhone(String reservedPhone) {
		this.reservedPhone = reservedPhone;
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the statusUpdated
	 */
	public Date getStatusUpdated() {
		return statusUpdated;
	}

	/**
	 * @param statusUpdated the statusUpdated to set
	 */
	public void setStatusUpdated(Date statusUpdated) {
		this.statusUpdated = statusUpdated;
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
	 * @return the spimsForeignKey
	 */
	public String getSpimsForeignKey() {
		return spimsForeignKey;
	}

	/**
	 * @param spimsForeignKey the spimsForeignKey to set
	 */
	public void setSpimsForeignKey(String spimsForeignKey) {
		this.spimsForeignKey = spimsForeignKey;
	}

	/**
	 * @return the card
	 */
	public Card getCard() {
		return card;
	}

	/**
	 * @param card the card to set
	 */
	public void setCard(Card card) {
		this.card = card;
	}

	/**
	 * @return the connectorType
	 */
	public ConnectorType getConnectorType() {
		return connectorType;
	}

	/**
	 * @param connectorType the connectorType to set
	 */
	public void setConnectorType(ConnectorType connectorType) {
		this.connectorType = connectorType;
	}

	/**
	 * @return the equipment
	 */
	public Equipment getEquipment() {
		return equipment;
	}

	/**
	 * @param equipment the equipment to set
	 */
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	/**
	 * @return the capacity
	 */
	public Capacity getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(Capacity capacity) {
		this.capacity = capacity;
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
	 * @return the ppHistories
	 */
	public Set<PpHistory> getPpHistories() {
		return ppHistories;
	}

	/**
	 * @param ppHistories the ppHistories to set
	 */
	public void setPpHistories(Set<PpHistory> ppHistories) {
		this.ppHistories = ppHistories;
	}

	/**
	 * @return the connectors
	 */
	public Set<Connector> getConnectors() {
		return connectors;
	}

	/**
	 * @param connectors the connectors to set
	 */
	public void setConnectors(Set<Connector> connectors) {
		this.connectors = connectors;
	}

	/**
	 * @return the dnaEciPorts
	 */
	public Set<DnaEciPort> getDnaEciPorts() {
		return dnaEciPorts;
	}

	/**
	 * @param dnaEciPorts the dnaEciPorts to set
	 */
	public void setDnaEciPorts(Set<DnaEciPort> dnaEciPorts) {
		this.dnaEciPorts = dnaEciPorts;
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

}
