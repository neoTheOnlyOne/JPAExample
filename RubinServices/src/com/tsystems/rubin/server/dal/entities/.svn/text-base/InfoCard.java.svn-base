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
@Table(name="INFO_CARD")
public class InfoCard implements Serializable {
	@Id
	@Column(name="CD_CARD_ID")
	private Long id;

	@Column(name="CD_BUSY")
	private String busy;

	@Column(name="CD_CT_ABBR_UPCASE")
	private String abbreviationUpcase;

	@Column(name="CD_CT_ABBREVIATION")
	private String abbreviation;

	@Column(name="CD_CT_DESIG_UPCASE")
	private String desigUpcase;

	@Column(name="CD_CT_DESIGNATION")
	private String designation;

	@Column(name="CD_CT_MANU_ORDER_NO")
	private String manuOrderNo;

	@Column(name="CD_CT_NR_OF_PORTS")
	private Long nrOfPorts;

	@Column(name="CD_CT_PHOTO")
	private String photo;

	@Column(name="CD_CT_PHYS_DESIG")
	private String physDesig;

	@Column(name="CD_CT_REMARK")
	private String remark;

	@Column(name="CD_CT_RX_NO_MEDMAX")
	private Long rxNoMedmax;

	@Column(name="CD_CT_SAP_NO")
	private Long sapNo;

	@Column(name="CD_CT_TX_NO_MEDMAX")
	private Long txNoMedmax;

	@Column(name="CD_DATE_ASSEMBLED")
	private Date dateAssembled;

	@Column(name="CD_DATE_INSTALLED")
	private Date dateInstalled;

	@Column(name="CD_EMS_DESIGNATION")
	private String emsDesignation;

	@Column(name="CD_EQ_DESIGNATION")
	private String eqDesignation;

	@Column(name="CD_EQ_SNO")
	private String eqSno;

	@Column(name="CD_ET_DESIGNATION")
	private String etDesignation;

	@Column(name="CD_ET_MANUFACTURER")
	private String manufacturer;

	@Column(name="CD_FREE_PORTS")
	private String freePorts;

	@Column(name="CD_KA_KAPAZITAETSWERT")
	private String ownCapacity;

	@Column(name="CD_MA_ABBREVIATION")
	private String maAbbreviation;

	@Column(name="CD_MA_NAME")
	private String name;

	@Column(name="CD_MA_NAME_UPCASE")
	private String nameUpcase;

	@Column(name="CD_MA_REMARK")
	private String maRemark;

	@Column(name="CD_MANU_ID")
	private String manuId;

	@Column(name="CD_PHOTO")
	private String cdPhoto;

	@Column(name="CD_PHYS_DESIGNAT")
	private String physDesignat;

	@Column(name="CD_POSITION")
	private String position;

	@Column(name="CD_RA_BAY")
	private String bay;

	@Column(name="CD_RA_DESIGNATION")
	private String raDesignation;

	@Column(name="CD_RA_ROW")
	private String row;

	@Column(name="CD_RA_SPACE")
	private String space;

	@Column(name="CD_REMARK")
	private String cdRemark;

	@Column(name="CD_RFS_DATE")
	private Date date;

	@Column(name="CD_RO_BUILDING")
	private String building;

	@Column(name="CD_RO_DESIGNATION")
	private String cdRoDesignation;

	@Column(name="CD_RO_FLOOR")
	private String floor;

	@Column(name="CD_SAP_ASSET_NO")
	private String sapAssetNo;

	@Column(name="CD_SNO")
	private String sno;

	@Column(name="CD_SNO_UPCASE")
	private String snoUpcase;

	@Column(name="CD_SOFTW_VERSION")
	private String softwVersion;

	@Column(name="CD_SP_ABBREVIATION")
	private String cdSpAbbreviation;

	@Column(name="CD_SP_DESIGNATION")
	private String cdSpDesignation;

	@Column(name="CD_SP_REMARK")
	private String cdSpRemark;

	@Column(name="CD_SPARE_PART_LOCATION")
	private String sparePartLocation;

	@Column(name="CD_STATUS")
	private String status;

	@Column(name="CD_STATUS_UPDATED")
	private Date cdStatusUpdated;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CD_EQUIPMENT_FK")
	private InfoEquipment infoEquipment;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CD_TELEHOUSE_FK")
	private InfoTelehouse infoTelehouse;

	@OneToMany(mappedBy="infoCard")
	private Set<InfoCosts> infoCosts;

	@OneToMany(mappedBy="infoCard")
	private Set<InfoPort> infoPorts;

	private static final long serialVersionUID = 1L;

	public InfoCard() {
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
	 * @return the busy
	 */
	public String getBusy() {
		return busy;
	}

	/**
	 * @param busy the busy to set
	 */
	public void setBusy(String busy) {
		this.busy = busy;
	}

	/**
	 * @return the abbreviationUpcase
	 */
	public String getAbbreviationUpcase() {
		return abbreviationUpcase;
	}

	/**
	 * @param abbreviationUpcase the abbreviationUpcase to set
	 */
	public void setAbbreviationUpcase(String abbreviationUpcase) {
		this.abbreviationUpcase = abbreviationUpcase;
	}

	/**
	 * @return the abbreviation
	 */
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
	 * @param abbreviation the abbreviation to set
	 */
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	/**
	 * @return the desigUpcase
	 */
	public String getDesigUpcase() {
		return desigUpcase;
	}

	/**
	 * @param desigUpcase the desigUpcase to set
	 */
	public void setDesigUpcase(String desigUpcase) {
		this.desigUpcase = desigUpcase;
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
	 * @return the manuOrderNo
	 */
	public String getManuOrderNo() {
		return manuOrderNo;
	}

	/**
	 * @param manuOrderNo the manuOrderNo to set
	 */
	public void setManuOrderNo(String manuOrderNo) {
		this.manuOrderNo = manuOrderNo;
	}

	/**
	 * @return the nrOfPorts
	 */
	public Long getNrOfPorts() {
		return nrOfPorts;
	}

	/**
	 * @param nrOfPorts the nrOfPorts to set
	 */
	public void setNrOfPorts(Long nrOfPorts) {
		this.nrOfPorts = nrOfPorts;
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
	 * @return the rxNoMedmax
	 */
	public Long getRxNoMedmax() {
		return rxNoMedmax;
	}

	/**
	 * @param rxNoMedmax the rxNoMedmax to set
	 */
	public void setRxNoMedmax(Long rxNoMedmax) {
		this.rxNoMedmax = rxNoMedmax;
	}

	/**
	 * @return the sapNo
	 */
	public Long getSapNo() {
		return sapNo;
	}

	/**
	 * @param sapNo the sapNo to set
	 */
	public void setSapNo(Long sapNo) {
		this.sapNo = sapNo;
	}

	/**
	 * @return the txNoMedmax
	 */
	public Long getTxNoMedmax() {
		return txNoMedmax;
	}

	/**
	 * @param txNoMedmax the txNoMedmax to set
	 */
	public void setTxNoMedmax(Long txNoMedmax) {
		this.txNoMedmax = txNoMedmax;
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
	 * @return the eqDesignation
	 */
	public String getEqDesignation() {
		return eqDesignation;
	}

	/**
	 * @param eqDesignation the eqDesignation to set
	 */
	public void setEqDesignation(String eqDesignation) {
		this.eqDesignation = eqDesignation;
	}

	/**
	 * @return the eqSno
	 */
	public String getEqSno() {
		return eqSno;
	}

	/**
	 * @param eqSno the eqSno to set
	 */
	public void setEqSno(String eqSno) {
		this.eqSno = eqSno;
	}

	/**
	 * @return the etDesignation
	 */
	public String getEtDesignation() {
		return etDesignation;
	}

	/**
	 * @param etDesignation the etDesignation to set
	 */
	public void setEtDesignation(String etDesignation) {
		this.etDesignation = etDesignation;
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
	 * @return the freePorts
	 */
	public String getFreePorts() {
		return freePorts;
	}

	/**
	 * @param freePorts the freePorts to set
	 */
	public void setFreePorts(String freePorts) {
		this.freePorts = freePorts;
	}

	/**
	 * @return the ownCapacity
	 */
	public String getOwnCapacity() {
		return ownCapacity;
	}

	/**
	 * @param ownCapacity the ownCapacity to set
	 */
	public void setOwnCapacity(String ownCapacity) {
		this.ownCapacity = ownCapacity;
	}

	/**
	 * @return the maAbbreviation
	 */
	public String getMaAbbreviation() {
		return maAbbreviation;
	}

	/**
	 * @param maAbbreviation the maAbbreviation to set
	 */
	public void setMaAbbreviation(String maAbbreviation) {
		this.maAbbreviation = maAbbreviation;
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
	 * @return the nameUpcase
	 */
	public String getNameUpcase() {
		return nameUpcase;
	}

	/**
	 * @param nameUpcase the nameUpcase to set
	 */
	public void setNameUpcase(String nameUpcase) {
		this.nameUpcase = nameUpcase;
	}

	/**
	 * @return the maRemark
	 */
	public String getMaRemark() {
		return maRemark;
	}

	/**
	 * @param maRemark the maRemark to set
	 */
	public void setMaRemark(String maRemark) {
		this.maRemark = maRemark;
	}

	/**
	 * @return the manuId
	 */
	public String getManuId() {
		return manuId;
	}

	/**
	 * @param manuId the manuId to set
	 */
	public void setManuId(String manuId) {
		this.manuId = manuId;
	}

	/**
	 * @return the cdPhoto
	 */
	public String getCdPhoto() {
		return cdPhoto;
	}

	/**
	 * @param cdPhoto the cdPhoto to set
	 */
	public void setCdPhoto(String cdPhoto) {
		this.cdPhoto = cdPhoto;
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
	 * @return the bay
	 */
	public String getBay() {
		return bay;
	}

	/**
	 * @param bay the bay to set
	 */
	public void setBay(String bay) {
		this.bay = bay;
	}

	/**
	 * @return the raDesignation
	 */
	public String getRaDesignation() {
		return raDesignation;
	}

	/**
	 * @param raDesignation the raDesignation to set
	 */
	public void setRaDesignation(String raDesignation) {
		this.raDesignation = raDesignation;
	}

	/**
	 * @return the row
	 */
	public String getRow() {
		return row;
	}

	/**
	 * @param row the row to set
	 */
	public void setRow(String row) {
		this.row = row;
	}

	/**
	 * @return the space
	 */
	public String getSpace() {
		return space;
	}

	/**
	 * @param space the space to set
	 */
	public void setSpace(String space) {
		this.space = space;
	}

	/**
	 * @return the cdRemark
	 */
	public String getCdRemark() {
		return cdRemark;
	}

	/**
	 * @param cdRemark the cdRemark to set
	 */
	public void setCdRemark(String cdRemark) {
		this.cdRemark = cdRemark;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the building
	 */
	public String getBuilding() {
		return building;
	}

	/**
	 * @param building the building to set
	 */
	public void setBuilding(String building) {
		this.building = building;
	}

	/**
	 * @return the cdRoDesignation
	 */
	public String getCdRoDesignation() {
		return cdRoDesignation;
	}

	/**
	 * @param cdRoDesignation the cdRoDesignation to set
	 */
	public void setCdRoDesignation(String cdRoDesignation) {
		this.cdRoDesignation = cdRoDesignation;
	}

	/**
	 * @return the floor
	 */
	public String getFloor() {
		return floor;
	}

	/**
	 * @param floor the floor to set
	 */
	public void setFloor(String floor) {
		this.floor = floor;
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
	 * @return the sno
	 */
	public String getSno() {
		return sno;
	}

	/**
	 * @param sno the sno to set
	 */
	public void setSno(String sno) {
		this.sno = sno;
	}

	/**
	 * @return the snoUpcase
	 */
	public String getSnoUpcase() {
		return snoUpcase;
	}

	/**
	 * @param snoUpcase the snoUpcase to set
	 */
	public void setSnoUpcase(String snoUpcase) {
		this.snoUpcase = snoUpcase;
	}

	/**
	 * @return the softwVersion
	 */
	public String getSoftwVersion() {
		return softwVersion;
	}

	/**
	 * @param softwVersion the softwVersion to set
	 */
	public void setSoftwVersion(String softwVersion) {
		this.softwVersion = softwVersion;
	}

	/**
	 * @return the cdSpAbbreviation
	 */
	public String getCdSpAbbreviation() {
		return cdSpAbbreviation;
	}

	/**
	 * @param cdSpAbbreviation the cdSpAbbreviation to set
	 */
	public void setCdSpAbbreviation(String cdSpAbbreviation) {
		this.cdSpAbbreviation = cdSpAbbreviation;
	}

	/**
	 * @return the cdSpDesignation
	 */
	public String getCdSpDesignation() {
		return cdSpDesignation;
	}

	/**
	 * @param cdSpDesignation the cdSpDesignation to set
	 */
	public void setCdSpDesignation(String cdSpDesignation) {
		this.cdSpDesignation = cdSpDesignation;
	}

	/**
	 * @return the cdSpRemark
	 */
	public String getCdSpRemark() {
		return cdSpRemark;
	}

	/**
	 * @param cdSpRemark the cdSpRemark to set
	 */
	public void setCdSpRemark(String cdSpRemark) {
		this.cdSpRemark = cdSpRemark;
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
	 * @return the cdStatusUpdated
	 */
	public Date getCdStatusUpdated() {
		return cdStatusUpdated;
	}

	/**
	 * @param cdStatusUpdated the cdStatusUpdated to set
	 */
	public void setCdStatusUpdated(Date cdStatusUpdated) {
		this.cdStatusUpdated = cdStatusUpdated;
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

	/**
	 * @return the infoTelehouse
	 */
	public InfoTelehouse getInfoTelehouse() {
		return infoTelehouse;
	}

	/**
	 * @param infoTelehouse the infoTelehouse to set
	 */
	public void setInfoTelehouse(InfoTelehouse infoTelehouse) {
		this.infoTelehouse = infoTelehouse;
	}

	/**
	 * @return the infoCosts
	 */
	public Set<InfoCosts> getInfoCosts() {
		return infoCosts;
	}

	/**
	 * @param infoCosts the infoCosts to set
	 */
	public void setInfoCosts(Set<InfoCosts> infoCosts) {
		this.infoCosts = infoCosts;
	}

	/**
	 * @return the infoPorts
	 */
	public Set<InfoPort> getInfoPorts() {
		return infoPorts;
	}

	/**
	 * @param infoPorts the infoPorts to set
	 */
	public void setInfoPorts(Set<InfoPort> infoPorts) {
		this.infoPorts = infoPorts;
	}


}
