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

@Entity
public class Card implements Serializable {
	@Id
	@Column(name="OID_CARD")
	private Long id;

	@Column(name="CARD_DATE_ASSEMBLED")
	private Date dateAssembled;

	@Column(name="CARD_DATE_INSTALLE")
	private Date dateInstalle;

	@Column(name="CARD_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="CARD_DNA_STATUS")
	private String dnaStatus;

	@Column(name="CARD_ECI_STATUS")
	private String eciStatus;

	@Column(name="CARD_EMS_DESIGNATI")
	private String emsDesignati;

	@Column(name="CARD_MANUFACTURER")
	private String manufacturer;

	@Column(name="CARD_NGVI_STATUS")
	private String ngviStatus;

	@Column(name="CARD_PHOTO")
	private String photo;

	@Column(name="CARD_PHYSICAL_DESI")
	private String physicalDesi;

	@Column(name="CARD_POSITION")
	private String position;

	@Column(name="CARD_REMARK")
	private String remark;

	@Column(name="CARD_RFS_DATE")
	private Date rfsDate;

	@Column(name="CARD_SAP_ASSET_NO")
	private String sapAssetNo;

	@Column(name="CARD_SERIAL_NO")
	private String serialNo;

	@Column(name="CARD_SERIAL_NO_SUC")
	private String serialNoSuc;

	@Column(name="CARD_SOFTWARE_VERS")
	private String softwareVers;

	@Column(name="CARD_SPARE_PART_LOCATION")
	private String sparePartLocation;

	@Column(name="CARD_STATUS")
	private String status;

	@Column(name="CARD_STATUS_UPDATED")
	private Date statusUpdated;

	@Column(name="CARD_UPDATED_BY")
	private String updatedBy;

	@Column(name="SPIMS_FOREIGN_KEY")
	private String spimsForeignKey;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CARD_TYPEOID_CT")
	private CardType cardType;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_EQUIPMENTOID_EQ")
	private Equipment equipment;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TELEHOUSEOID_TH")
	private Telehouse telehouse;

	@OneToMany(mappedBy="card")
	private Set<DnaSlottbl> dnaSlottbls;

	@OneToMany(mappedBy="card")
	private Set<Costs> costs;

	@OneToMany(mappedBy="card")
	private Set<Port> ports;

	private static final long serialVersionUID = 1L;

	public Card() {
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
	 * @return the dateAssembled
	 */
	public Date getDateAssembled() {
		return dateAssembled;
	}

	/**
	 * @param dateAssembled the dateAssembled to set
	 */
	public void setDateAssembled(Date dateAssembled) {
		this.dateAssembled = dateAssembled;
	}

	/**
	 * @return the dateInstalle
	 */
	public Date getDateInstalle() {
		return dateInstalle;
	}

	/**
	 * @param dateInstalle the dateInstalle to set
	 */
	public void setDateInstalle(Date dateInstalle) {
		this.dateInstalle = dateInstalle;
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
	 * @return the dnaStatus
	 */
	public String getDnaStatus() {
		return dnaStatus;
	}

	/**
	 * @param dnaStatus the dnaStatus to set
	 */
	public void setDnaStatus(String dnaStatus) {
		this.dnaStatus = dnaStatus;
	}

	/**
	 * @return the eciStatus
	 */
	public String getEciStatus() {
		return eciStatus;
	}

	/**
	 * @param eciStatus the eciStatus to set
	 */
	public void setEciStatus(String eciStatus) {
		this.eciStatus = eciStatus;
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
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the ngviStatus
	 */
	public String getNgviStatus() {
		return ngviStatus;
	}

	/**
	 * @param ngviStatus the ngviStatus to set
	 */
	public void setNgviStatus(String ngviStatus) {
		this.ngviStatus = ngviStatus;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * @return the physicalDesi
	 */
	public String getPhysicalDesi() {
		return physicalDesi;
	}

	/**
	 * @param physicalDesi the physicalDesi to set
	 */
	public void setPhysicalDesi(String physicalDesi) {
		this.physicalDesi = physicalDesi;
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
	 * @return the rfsDate
	 */
	public Date getRfsDate() {
		return rfsDate;
	}

	/**
	 * @param rfsDate the rfsDate to set
	 */
	public void setRfsDate(Date rfsDate) {
		this.rfsDate = rfsDate;
	}

	/**
	 * @return the sapAssetNo
	 */
	public String getSapAssetNo() {
		return sapAssetNo;
	}

	/**
	 * @param sapAssetNo the sapAssetNo to set
	 */
	public void setSapAssetNo(String sapAssetNo) {
		this.sapAssetNo = sapAssetNo;
	}

	/**
	 * @return the serialNo
	 */
	public String getSerialNo() {
		return serialNo;
	}

	/**
	 * @param serialNo the serialNo to set
	 */
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	/**
	 * @return the serialNoSuc
	 */
	public String getSerialNoSuc() {
		return serialNoSuc;
	}

	/**
	 * @param serialNoSuc the serialNoSuc to set
	 */
	public void setSerialNoSuc(String serialNoSuc) {
		this.serialNoSuc = serialNoSuc;
	}

	/**
	 * @return the softwareVers
	 */
	public String getSoftwareVers() {
		return softwareVers;
	}

	/**
	 * @param softwareVers the softwareVers to set
	 */
	public void setSoftwareVers(String softwareVers) {
		this.softwareVers = softwareVers;
	}

	/**
	 * @return the sparePartLocation
	 */
	public String getSparePartLocation() {
		return sparePartLocation;
	}

	/**
	 * @param sparePartLocation the sparePartLocation to set
	 */
	public void setSparePartLocation(String sparePartLocation) {
		this.sparePartLocation = sparePartLocation;
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
	 * @return the cardType
	 */
	public CardType getCardType() {
		return cardType;
	}

	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
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
	 * @return the telehouse
	 */
	public Telehouse getTelehouse() {
		return telehouse;
	}

	/**
	 * @param telehouse the telehouse to set
	 */
	public void setTelehouse(Telehouse telehouse) {
		this.telehouse = telehouse;
	}

	/**
	 * @return the dnaSlottbls
	 */
	public Set<DnaSlottbl> getDnaSlottbls() {
		return dnaSlottbls;
	}

	/**
	 * @param dnaSlottbls the dnaSlottbls to set
	 */
	public void setDnaSlottbls(Set<DnaSlottbl> dnaSlottbls) {
		this.dnaSlottbls = dnaSlottbls;
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
	 * @return the ports
	 */
	public Set<Port> getPorts() {
		return ports;
	}

	/**
	 * @param ports the ports to set
	 */
	public void setPorts(Set<Port> ports) {
		this.ports = ports;
	}

	
}
