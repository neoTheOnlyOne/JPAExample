package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="INFO_PORT")
public class InfoPort implements Serializable {
	@Id
	@Column(name="PO_PORT_ID")
	private Long id;

	@Column(name="PO_CONTRACT_CAPACITY")
	private Long contractCapacity;

	@Column(name="PO_CT_DESIGNATION")
	private String ctDesignation;

	@Column(name="PO_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="PO_EMS_DESIG")
	private String emsDesignation;

	@Column(name="PO_F1_F2")
	private String f1F2;

	@Column(name="PO_FINISH_DATE")
	private Date finishDate;

	@Column(name="PO_IP_ADDRESS")
	private String ipAddress;

	@Column(name="PO_IPV6_ADDRESS")
	private String ipv6Address;

	@Column(name="PO_KA_KAPAZITAETSWERT")
	private String kaKapazitaetswert;

	@Column(name="PO_PHYS_DESIG")
	private String physDesig;

	@Column(name="PO_REMARK")
	private String remark;

	@Column(name="PO_RESERVATION_DATE")
	private Date reservationDate;

	@Column(name="PO_RESERVED_BY")
	private String reservedBy;

	@Column(name="PO_RESERVED_FOR")
	private String reservedFor;

	@Column(name="PO_RESERVED_PHONE")
	private String reservedPhone;

	@Column(name="PO_RESERVED_V_TGN_NMS_ID")
	private String reservedVTgnNmsId;

	@Column(name="PO_SORT_ORDER_NO")
	private Long sortOrderNo;

	@Column(name="PO_STATUS")
	private String status;

	@Column(name="PO_STATUS_UPDATED")
	private Date statusUpdated;

	@Column(name="PO_UPDATED_BY")
	private String updatedBy;

	@Column(name="PO_V_TGN_NMS_ID")
	private String vTgnNmsId;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PO_CARD_FK")
	private InfoCard infoCard;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PO_EQUIPMENT_FK")
	private InfoEquipment infoEquipment;

	private static final long serialVersionUID = 1L;

	public InfoPort() {
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
	 * @return the contractCapacity
	 */
	public Long getContractCapacity() {
		return contractCapacity;
	}

	/**
	 * @param contractCapacity the contractCapacity to set
	 */
	public void setContractCapacity(Long contractCapacity) {
		this.contractCapacity = contractCapacity;
	}

	/**
	 * @return the ctDesignation
	 */
	public String getCtDesignation() {
		return ctDesignation;
	}

	/**
	 * @param ctDesignation the ctDesignation to set
	 */
	public void setCtDesignation(String ctDesignation) {
		this.ctDesignation = ctDesignation;
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
	 * @return the emsDesignation
	 */
	public String getEmsDesignation() {
		return emsDesignation;
	}

	/**
	 * @param emsDesignation the emsDesignation to set
	 */
	public void setEmsDesignation(String emsDesignation) {
		this.emsDesignation = emsDesignation;
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
	 * @return the kaKapazitaetswert
	 */
	public String getKaKapazitaetswert() {
		return kaKapazitaetswert;
	}

	/**
	 * @param kaKapazitaetswert the kaKapazitaetswert to set
	 */
	public void setKaKapazitaetswert(String kaKapazitaetswert) {
		this.kaKapazitaetswert = kaKapazitaetswert;
	}

	/**
	 * @return the physDesig
	 */
	public String getPhysDesig() {
		return physDesig;
	}

	/**
	 * @param physDesig the physDesig to set
	 */
	public void setPhysDesig(String physDesig) {
		this.physDesig = physDesig;
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
	 * @return the reservedVTgnNmsId
	 */
	public String getReservedVTgnNmsId() {
		return reservedVTgnNmsId;
	}

	/**
	 * @param reservedVTgnNmsId the reservedVTgnNmsId to set
	 */
	public void setReservedVTgnNmsId(String reservedVTgnNmsId) {
		this.reservedVTgnNmsId = reservedVTgnNmsId;
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
	 * @return the vTgnNmsId
	 */
	public String getVTgnNmsId() {
		return vTgnNmsId;
	}

	/**
	 * @param tgnNmsId the vTgnNmsId to set
	 */
	public void setVTgnNmsId(String tgnNmsId) {
		vTgnNmsId = tgnNmsId;
	}

	/**
	 * @return the infoCard
	 */
	public InfoCard getInfoCard() {
		return infoCard;
	}

	/**
	 * @param infoCard the infoCard to set
	 */
	public void setInfoCard(InfoCard infoCard) {
		this.infoCard = infoCard;
	}

	/**
	 * @return the infoEquipment
	 */
	public InfoEquipment getInfoEquipment() {
		return infoEquipment;
	}

	/**
	 * @param infoEquipment the infoEquipment to set
	 */
	public void setInfoEquipment(InfoEquipment infoEquipment) {
		this.infoEquipment = infoEquipment;
	}

}
