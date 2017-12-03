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
@Table(name="INFO_EQUIPMENT")
public class InfoEquipment implements Serializable {
	@Id
	@Column(name="EQ_EQUIPMENT_ID")
	private Long id;

	@Column(name="EQ_ALIAS")
	private String alias;

	@Column(name="EQ_BUSY")
	private String busy;

	@Column(name="EQ_CT_DESIGNATION")
	private String designation;

	@Column(name="EQ_CUSTOMER_FK")
	private Long customerFk;

	@Column(name="EQ_DATE_ASSEMBLED")
	private Date dateAssembled;

	@Column(name="EQ_DATE_INSTALLED")
	private Date dateInstalled;

	@Column(name="EQ_DESIGNATION")
	private String eqDesignation;

	@Column(name="EQ_E_FACHSZ")
	private String eqEFachsz;

	@Column(name="EQ_ET_ABBR_UPCASE")
	private String eqEtAbbrUpcase;

	@Column(name="EQ_ET_ABBREVIATION")
	private String eqEtAbbreviation;

	@Column(name="EQ_ET_DESIGNATION")
	private String eqEtDesignation;

	@Column(name="EQ_ET_FACHSZ_TYPE")
	private String eqEtFachszType;

	@Column(name="EQ_ET_FORM_FACTOR")
	private String eqEtFormFactor;

	@Column(name="EQ_ET_MANU_ORD_NO")
	private String eqEtManuOrdNo;

	@Column(name="EQ_ET_NR_OF_PORTS")
	private Long eqEtNrOfPorts;

	@Column(name="EQ_ET_PHOTO")
	private String eqEtPhoto;

	@Column(name="EQ_ET_REMARK")
	private String eqEtRemark;

	@Column(name="EQ_ET_RX_NO_MEDMAX")
	private Long eqEtRxNoMedmax;

	@Column(name="EQ_ET_SAP_NO")
	private Long eqEtSapNo;

	@Column(name="EQ_ET_TX_NO_MEDMAX")
	private Long eqEtTxNoMedmax;

	@Column(name="EQ_FREE_PORTS")
	private String eqFreePorts;

	@Column(name="EQ_HW_RELEASE")
	private String eqHwRelease;

	@Column(name="EQ_IP_ADDRESS")
	private String eqIpAddress;

	@Column(name="EQ_IPV6_ADDRESS")
	private String eqIpv6Address;

	@Column(name="EQ_KA_KAPAZITAETSWERT")
	private String eqKaKapazitaetswert;

	@Column(name="EQ_MA_ABBREVIATION")
	private String eqMaAbbreviation;

	@Column(name="EQ_MA_NAME")
	private String eqMaName;

	@Column(name="EQ_MA_NAME_UPCASE")
	private String eqMaNameUpcase;

	@Column(name="EQ_MA_REMARK")
	private String eqMaRemark;

	@Column(name="EQ_MANUFACTURER_ID")
	private String eqManufacturerId;

	@Column(name="EQ_PHOTO")
	private String eqPhoto;

	@Column(name="EQ_RA_BAY")
	private String eqRaBay;

	@Column(name="EQ_RA_DESIGNATION")
	private String eqRaDesignation;

	@Column(name="EQ_RA_ROW")
	private String eqRaRow;

	@Column(name="EQ_RA_SPACE")
	private String eqRaSpace;

	@Column(name="EQ_REMARK")
	private String eqRemark;

	@Column(name="EQ_RFS_DATE")
	private Date eqRfsDate;

	@Column(name="EQ_RO_BUILDING")
	private String eqRoBuilding;

	@Column(name="EQ_RO_DESIGNATION")
	private String eqRoDesignation;

	@Column(name="EQ_RO_FLOOR")
	private String eqRoFloor;

	@Column(name="EQ_SAP_ASSET_NO")
	private String eqSapAssetNo;

	@Column(name="EQ_SNO")
	private String eqSno;

	@Column(name="EQ_SNO_UPCASE")
	private String eqSnoUpcase;

	@Column(name="EQ_SP_ABBREVIATION")
	private String eqSpAbbreviation;

	@Column(name="EQ_SP_DESIGNATION")
	private String eqSpDesignation;

	@Column(name="EQ_SP_REMARK")
	private String eqSpRemark;

	@Column(name="EQ_SPARE_PART_LOCATION")
	private String eqSparePartLocation;

	@Column(name="EQ_STATUS")
	private String eqStatus;

	@Column(name="EQ_STATUS_UPDATED")
	private Date eqStatusUpdated;

	@Column(name="EQ_TELE_INFRASTRUC")
	private String eqTeleInfrastruc;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EQ_TELEHOUSE_FK")
	private InfoTelehouse infoTelehouse;

	@OneToMany(mappedBy="infoEquipment")
	private Set<InfoCosts> infoCosts;

	@OneToMany(mappedBy="infoEquipment")
	private Set<InfoCard> infoCards;

	@OneToMany(mappedBy="infoEquipment")
	private Set<InfoPort> infoPorts;

	private static final long serialVersionUID = 1L;

	public InfoEquipment() {
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
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
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
	 * @return the customerFk
	 */
	public Long getCustomerFk() {
		return customerFk;
	}

	/**
	 * @param customerFk the customerFk to set
	 */
	public void setCustomerFk(Long customerFk) {
		this.customerFk = customerFk;
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
	 * @return the eqEFachsz
	 */
	public String getEqEFachsz() {
		return eqEFachsz;
	}

	/**
	 * @param eqEFachsz the eqEFachsz to set
	 */
	public void setEqEFachsz(String eqEFachsz) {
		this.eqEFachsz = eqEFachsz;
	}

	/**
	 * @return the eqEtAbbrUpcase
	 */
	public String getEqEtAbbrUpcase() {
		return eqEtAbbrUpcase;
	}

	/**
	 * @param eqEtAbbrUpcase the eqEtAbbrUpcase to set
	 */
	public void setEqEtAbbrUpcase(String eqEtAbbrUpcase) {
		this.eqEtAbbrUpcase = eqEtAbbrUpcase;
	}

	/**
	 * @return the eqEtAbbreviation
	 */
	public String getEqEtAbbreviation() {
		return eqEtAbbreviation;
	}

	/**
	 * @param eqEtAbbreviation the eqEtAbbreviation to set
	 */
	public void setEqEtAbbreviation(String eqEtAbbreviation) {
		this.eqEtAbbreviation = eqEtAbbreviation;
	}

	/**
	 * @return the eqEtDesignation
	 */
	public String getEqEtDesignation() {
		return eqEtDesignation;
	}

	/**
	 * @param eqEtDesignation the eqEtDesignation to set
	 */
	public void setEqEtDesignation(String eqEtDesignation) {
		this.eqEtDesignation = eqEtDesignation;
	}

	/**
	 * @return the eqEtFachszType
	 */
	public String getEqEtFachszType() {
		return eqEtFachszType;
	}

	/**
	 * @param eqEtFachszType the eqEtFachszType to set
	 */
	public void setEqEtFachszType(String eqEtFachszType) {
		this.eqEtFachszType = eqEtFachszType;
	}

	/**
	 * @return the eqEtFormFactor
	 */
	public String getEqEtFormFactor() {
		return eqEtFormFactor;
	}

	/**
	 * @param eqEtFormFactor the eqEtFormFactor to set
	 */
	public void setEqEtFormFactor(String eqEtFormFactor) {
		this.eqEtFormFactor = eqEtFormFactor;
	}

	/**
	 * @return the eqEtManuOrdNo
	 */
	public String getEqEtManuOrdNo() {
		return eqEtManuOrdNo;
	}

	/**
	 * @param eqEtManuOrdNo the eqEtManuOrdNo to set
	 */
	public void setEqEtManuOrdNo(String eqEtManuOrdNo) {
		this.eqEtManuOrdNo = eqEtManuOrdNo;
	}

	/**
	 * @return the eqEtNrOfPorts
	 */
	public Long getEqEtNrOfPorts() {
		return eqEtNrOfPorts;
	}

	/**
	 * @param eqEtNrOfPorts the eqEtNrOfPorts to set
	 */
	public void setEqEtNrOfPorts(Long eqEtNrOfPorts) {
		this.eqEtNrOfPorts = eqEtNrOfPorts;
	}

	/**
	 * @return the eqEtPhoto
	 */
	public String getEqEtPhoto() {
		return eqEtPhoto;
	}

	/**
	 * @param eqEtPhoto the eqEtPhoto to set
	 */
	public void setEqEtPhoto(String eqEtPhoto) {
		this.eqEtPhoto = eqEtPhoto;
	}

	/**
	 * @return the eqEtRemark
	 */
	public String getEqEtRemark() {
		return eqEtRemark;
	}

	/**
	 * @param eqEtRemark the eqEtRemark to set
	 */
	public void setEqEtRemark(String eqEtRemark) {
		this.eqEtRemark = eqEtRemark;
	}

	/**
	 * @return the eqEtRxNoMedmax
	 */
	public Long getEqEtRxNoMedmax() {
		return eqEtRxNoMedmax;
	}

	/**
	 * @param eqEtRxNoMedmax the eqEtRxNoMedmax to set
	 */
	public void setEqEtRxNoMedmax(Long eqEtRxNoMedmax) {
		this.eqEtRxNoMedmax = eqEtRxNoMedmax;
	}

	/**
	 * @return the eqEtSapNo
	 */
	public Long getEqEtSapNo() {
		return eqEtSapNo;
	}

	/**
	 * @param eqEtSapNo the eqEtSapNo to set
	 */
	public void setEqEtSapNo(Long eqEtSapNo) {
		this.eqEtSapNo = eqEtSapNo;
	}

	/**
	 * @return the eqEtTxNoMedmax
	 */
	public Long getEqEtTxNoMedmax() {
		return eqEtTxNoMedmax;
	}

	/**
	 * @param eqEtTxNoMedmax the eqEtTxNoMedmax to set
	 */
	public void setEqEtTxNoMedmax(Long eqEtTxNoMedmax) {
		this.eqEtTxNoMedmax = eqEtTxNoMedmax;
	}

	/**
	 * @return the eqFreePorts
	 */
	public String getEqFreePorts() {
		return eqFreePorts;
	}

	/**
	 * @param eqFreePorts the eqFreePorts to set
	 */
	public void setEqFreePorts(String eqFreePorts) {
		this.eqFreePorts = eqFreePorts;
	}

	/**
	 * @return the eqHwRelease
	 */
	public String getEqHwRelease() {
		return eqHwRelease;
	}

	/**
	 * @param eqHwRelease the eqHwRelease to set
	 */
	public void setEqHwRelease(String eqHwRelease) {
		this.eqHwRelease = eqHwRelease;
	}

	/**
	 * @return the eqIpAddress
	 */
	public String getEqIpAddress() {
		return eqIpAddress;
	}

	/**
	 * @param eqIpAddress the eqIpAddress to set
	 */
	public void setEqIpAddress(String eqIpAddress) {
		this.eqIpAddress = eqIpAddress;
	}

	/**
	 * @return the eqIpv6Address
	 */
	public String getEqIpv6Address() {
		return eqIpv6Address;
	}

	/**
	 * @param eqIpv6Address the eqIpv6Address to set
	 */
	public void setEqIpv6Address(String eqIpv6Address) {
		this.eqIpv6Address = eqIpv6Address;
	}

	/**
	 * @return the eqKaKapazitaetswert
	 */
	public String getEqKaKapazitaetswert() {
		return eqKaKapazitaetswert;
	}

	/**
	 * @param eqKaKapazitaetswert the eqKaKapazitaetswert to set
	 */
	public void setEqKaKapazitaetswert(String eqKaKapazitaetswert) {
		this.eqKaKapazitaetswert = eqKaKapazitaetswert;
	}

	/**
	 * @return the eqMaAbbreviation
	 */
	public String getEqMaAbbreviation() {
		return eqMaAbbreviation;
	}

	/**
	 * @param eqMaAbbreviation the eqMaAbbreviation to set
	 */
	public void setEqMaAbbreviation(String eqMaAbbreviation) {
		this.eqMaAbbreviation = eqMaAbbreviation;
	}

	/**
	 * @return the eqMaName
	 */
	public String getEqMaName() {
		return eqMaName;
	}

	/**
	 * @param eqMaName the eqMaName to set
	 */
	public void setEqMaName(String eqMaName) {
		this.eqMaName = eqMaName;
	}

	/**
	 * @return the eqMaNameUpcase
	 */
	public String getEqMaNameUpcase() {
		return eqMaNameUpcase;
	}

	/**
	 * @param eqMaNameUpcase the eqMaNameUpcase to set
	 */
	public void setEqMaNameUpcase(String eqMaNameUpcase) {
		this.eqMaNameUpcase = eqMaNameUpcase;
	}

	/**
	 * @return the eqMaRemark
	 */
	public String getEqMaRemark() {
		return eqMaRemark;
	}

	/**
	 * @param eqMaRemark the eqMaRemark to set
	 */
	public void setEqMaRemark(String eqMaRemark) {
		this.eqMaRemark = eqMaRemark;
	}

	/**
	 * @return the eqManufacturerId
	 */
	public String getEqManufacturerId() {
		return eqManufacturerId;
	}

	/**
	 * @param eqManufacturerId the eqManufacturerId to set
	 */
	public void setEqManufacturerId(String eqManufacturerId) {
		this.eqManufacturerId = eqManufacturerId;
	}

	/**
	 * @return the eqPhoto
	 */
	public String getEqPhoto() {
		return eqPhoto;
	}

	/**
	 * @param eqPhoto the eqPhoto to set
	 */
	public void setEqPhoto(String eqPhoto) {
		this.eqPhoto = eqPhoto;
	}

	/**
	 * @return the eqRaBay
	 */
	public String getEqRaBay() {
		return eqRaBay;
	}

	/**
	 * @param eqRaBay the eqRaBay to set
	 */
	public void setEqRaBay(String eqRaBay) {
		this.eqRaBay = eqRaBay;
	}

	/**
	 * @return the eqRaDesignation
	 */
	public String getEqRaDesignation() {
		return eqRaDesignation;
	}

	/**
	 * @param eqRaDesignation the eqRaDesignation to set
	 */
	public void setEqRaDesignation(String eqRaDesignation) {
		this.eqRaDesignation = eqRaDesignation;
	}

	/**
	 * @return the eqRaRow
	 */
	public String getEqRaRow() {
		return eqRaRow;
	}

	/**
	 * @param eqRaRow the eqRaRow to set
	 */
	public void setEqRaRow(String eqRaRow) {
		this.eqRaRow = eqRaRow;
	}

	/**
	 * @return the eqRaSpace
	 */
	public String getEqRaSpace() {
		return eqRaSpace;
	}

	/**
	 * @param eqRaSpace the eqRaSpace to set
	 */
	public void setEqRaSpace(String eqRaSpace) {
		this.eqRaSpace = eqRaSpace;
	}

	/**
	 * @return the eqRemark
	 */
	public String getEqRemark() {
		return eqRemark;
	}

	/**
	 * @param eqRemark the eqRemark to set
	 */
	public void setEqRemark(String eqRemark) {
		this.eqRemark = eqRemark;
	}

	/**
	 * @return the eqRfsDate
	 */
	public Date getEqRfsDate() {
		return eqRfsDate;
	}

	/**
	 * @param eqRfsDate the eqRfsDate to set
	 */
	public void setEqRfsDate(Date eqRfsDate) {
		this.eqRfsDate = eqRfsDate;
	}

	/**
	 * @return the eqRoBuilding
	 */
	public String getEqRoBuilding() {
		return eqRoBuilding;
	}

	/**
	 * @param eqRoBuilding the eqRoBuilding to set
	 */
	public void setEqRoBuilding(String eqRoBuilding) {
		this.eqRoBuilding = eqRoBuilding;
	}

	/**
	 * @return the eqRoDesignation
	 */
	public String getEqRoDesignation() {
		return eqRoDesignation;
	}

	/**
	 * @param eqRoDesignation the eqRoDesignation to set
	 */
	public void setEqRoDesignation(String eqRoDesignation) {
		this.eqRoDesignation = eqRoDesignation;
	}

	/**
	 * @return the eqRoFloor
	 */
	public String getEqRoFloor() {
		return eqRoFloor;
	}

	/**
	 * @param eqRoFloor the eqRoFloor to set
	 */
	public void setEqRoFloor(String eqRoFloor) {
		this.eqRoFloor = eqRoFloor;
	}

	/**
	 * @return the eqSapAssetNo
	 */
	public String getEqSapAssetNo() {
		return eqSapAssetNo;
	}

	/**
	 * @param eqSapAssetNo the eqSapAssetNo to set
	 */
	public void setEqSapAssetNo(String eqSapAssetNo) {
		this.eqSapAssetNo = eqSapAssetNo;
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
	 * @return the eqSnoUpcase
	 */
	public String getEqSnoUpcase() {
		return eqSnoUpcase;
	}

	/**
	 * @param eqSnoUpcase the eqSnoUpcase to set
	 */
	public void setEqSnoUpcase(String eqSnoUpcase) {
		this.eqSnoUpcase = eqSnoUpcase;
	}

	/**
	 * @return the eqSpAbbreviation
	 */
	public String getEqSpAbbreviation() {
		return eqSpAbbreviation;
	}

	/**
	 * @param eqSpAbbreviation the eqSpAbbreviation to set
	 */
	public void setEqSpAbbreviation(String eqSpAbbreviation) {
		this.eqSpAbbreviation = eqSpAbbreviation;
	}

	/**
	 * @return the eqSpDesignation
	 */
	public String getEqSpDesignation() {
		return eqSpDesignation;
	}

	/**
	 * @param eqSpDesignation the eqSpDesignation to set
	 */
	public void setEqSpDesignation(String eqSpDesignation) {
		this.eqSpDesignation = eqSpDesignation;
	}

	/**
	 * @return the eqSpRemark
	 */
	public String getEqSpRemark() {
		return eqSpRemark;
	}

	/**
	 * @param eqSpRemark the eqSpRemark to set
	 */
	public void setEqSpRemark(String eqSpRemark) {
		this.eqSpRemark = eqSpRemark;
	}

	/**
	 * @return the eqSparePartLocation
	 */
	public String getEqSparePartLocation() {
		return eqSparePartLocation;
	}

	/**
	 * @param eqSparePartLocation the eqSparePartLocation to set
	 */
	public void setEqSparePartLocation(String eqSparePartLocation) {
		this.eqSparePartLocation = eqSparePartLocation;
	}

	/**
	 * @return the eqStatus
	 */
	public String getEqStatus() {
		return eqStatus;
	}

	/**
	 * @param eqStatus the eqStatus to set
	 */
	public void setEqStatus(String eqStatus) {
		this.eqStatus = eqStatus;
	}

	/**
	 * @return the eqStatusUpdated
	 */
	public Date getEqStatusUpdated() {
		return eqStatusUpdated;
	}

	/**
	 * @param eqStatusUpdated the eqStatusUpdated to set
	 */
	public void setEqStatusUpdated(Date eqStatusUpdated) {
		this.eqStatusUpdated = eqStatusUpdated;
	}

	/**
	 * @return the eqTeleInfrastruc
	 */
	public String getEqTeleInfrastruc() {
		return eqTeleInfrastruc;
	}

	/**
	 * @param eqTeleInfrastruc the eqTeleInfrastruc to set
	 */
	public void setEqTeleInfrastruc(String eqTeleInfrastruc) {
		this.eqTeleInfrastruc = eqTeleInfrastruc;
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
	 * @return the infoCards
	 */
	public Set<InfoCard> getInfoCards() {
		return infoCards;
	}

	/**
	 * @param infoCards the infoCards to set
	 */
	public void setInfoCards(Set<InfoCard> infoCards) {
		this.infoCards = infoCards;
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
