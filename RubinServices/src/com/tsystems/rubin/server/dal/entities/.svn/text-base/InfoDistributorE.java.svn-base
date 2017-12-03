package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="INFO_DISTRIBUTOR_E")
public class InfoDistributorE implements Serializable {
	@EmbeddedId
	private InfoDistributorEPK infoDistributorEPK;

	@Column(name="DE_BUSY")
	private String busy;

	@Column(name="DE_DATE_INSTALLED")
	private Date dateInstalled;

	@Column(name="DE_DET_DESI_UPCASE")
	private String detDesiUpcase;

	@Column(name="DE_DET_DESIGNATION")
	private String detDesignation;

	@Column(name="DE_DET_FORM_FACTOR")
	private String detFormFactor;

	@Column(name="DE_DET_MANU_ORD_NO")
	private String detManuOrdNo;

	@Column(name="DE_DET_NO_OF_DPS")
	private Long detNoOfDps;

	@Column(name="DE_DET_PHOTO")
	private String detPhoto;

	@Column(name="DE_DET_REMARK")
	private String detRemark;

	@Column(name="DE_DET_SAP_NO")
	private Long detSapNo;

	@Column(name="DE_DF_DATE_INST")
	private Date dDateInst;

	@Column(name="DE_DF_DESIG_UPCASE")
	private String desigUpcase;

	@Column(name="DE_DF_DESIGNATION")
	private String designation;

	@Column(name="DE_DF_RACK_POSITION")
	private String rackPosition;

	@Column(name="DE_DF_REMARK")
	private String remark;

	@Column(name="DE_DFT_DESI_UPCASE")
	private String desiUpcase;

	@Column(name="DE_DFT_DESIGNATION")
	private String dftDesignation;

	@Column(name="DE_DFT_FORM_FACTOR")
	private String dftFormFactor;

	@Column(name="DE_DFT_HAS_COLUMNS")
	private String dftHasColumns;

	@Column(name="DE_DFT_MANU_ORD_NO")
	private String dftManuOrdNo;

	@Column(name="DE_DFT_PHOTO")
	private String dftPhoto;

	@Column(name="DE_DFT_REMARK")
	private String dftRemark;

	@Column(name="DE_DFT_SAP_NO")
	private Long dftSapNo;

	@Column(name="DE_DG_DESIG_UPCASE")
	private String dgDesigUpcase;

	@Column(name="DE_DG_DESIGNATION")
	private String dgDesignation;

	@Column(name="DE_ELEM_PO_COUNT")
	private Long elemPoCount;

	@Column(name="DE_ENDPUNKT_FK")
	private Long endpunktFk;

	@Column(name="DE_FREE_PINS")
	private String freePins;

	@Column(name="DE_POSITION")
	private String position;

	@Column(name="DE_RA_BAY")
	private String raBay;

	@Column(name="DE_RA_DESIGNATION")
	private String raDesignation;

	@Column(name="DE_RA_ROW")
	private String raRow;

	@Column(name="DE_RA_SPACE")
	private String raSpace;

	@Column(name="DE_REMARK")
	private String deRemark;

	@Column(name="DE_RO_BUILDING")
	private String deRoBuilding;

	@Column(name="DE_RO_DESIGNATION")
	private String deRoDesignation;

	@Column(name="DE_RO_FLOOR")
	private String deRoFloor;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="DE_TELEHOUSE_FK")
	private InfoTelehouse infoTelehouse;

	@OneToMany(mappedBy="infoDistributorE")
	private Set<InfoCosts> infoCostsCollection;

	@OneToMany(mappedBy="infoDistributorE")
	private Set<InfoCable> infoCables;

	@OneToMany(mappedBy="infoDistributorE2")
	private Set<InfoCable> infoCables2;

	private static final long serialVersionUID = 1L;

	public InfoDistributorE() {
		super();
	}


	/**
	 * @return the infoDistributorEPK
	 */
	public InfoDistributorEPK getInfoDistributorEPK() {
		return infoDistributorEPK;
	}


	/**
	 * @param infoDistributorEPK the infoDistributorEPK to set
	 */
	public void setInfoDistributorEPK(InfoDistributorEPK infoDistributorEPK) {
		this.infoDistributorEPK = infoDistributorEPK;
	}


	public String getDeBusy() {
		return this.busy;
	}

	public void setDeBusy(String deBusy) {
		this.busy = deBusy;
	}

	public Date getDeDateInstalled() {
		return this.dateInstalled;
	}

	public void setDeDateInstalled(Date deDateInstalled) {
		this.dateInstalled = deDateInstalled;
	}

	public String getDeDetDesiUpcase() {
		return this.detDesiUpcase;
	}

	public void setDeDetDesiUpcase(String deDetDesiUpcase) {
		this.detDesiUpcase = deDetDesiUpcase;
	}

	public String getDeDetDesignation() {
		return this.detDesignation;
	}

	public void setDeDetDesignation(String deDetDesignation) {
		this.detDesignation = deDetDesignation;
	}

	public String getDeDetFormFactor() {
		return this.detFormFactor;
	}

	public void setDeDetFormFactor(String deDetFormFactor) {
		this.detFormFactor = deDetFormFactor;
	}

	public String getDeDetManuOrdNo() {
		return this.detManuOrdNo;
	}

	public void setDeDetManuOrdNo(String deDetManuOrdNo) {
		this.detManuOrdNo = deDetManuOrdNo;
	}

	public Long getDeDetNoOfDps() {
		return this.detNoOfDps;
	}

	public void setDeDetNoOfDps(Long deDetNoOfDps) {
		this.detNoOfDps = deDetNoOfDps;
	}

	public String getDeDetPhoto() {
		return this.detPhoto;
	}

	public void setDeDetPhoto(String deDetPhoto) {
		this.detPhoto = deDetPhoto;
	}

	public String getDeDetRemark() {
		return this.detRemark;
	}

	public void setDeDetRemark(String deDetRemark) {
		this.detRemark = deDetRemark;
	}

	public Long getDeDetSapNo() {
		return this.detSapNo;
	}

	public void setDeDetSapNo(Long deDetSapNo) {
		this.detSapNo = deDetSapNo;
	}

	public Date getDeDfDateInst() {
		return this.dDateInst;
	}

	public void setDeDfDateInst(Date deDfDateInst) {
		this.dDateInst = deDfDateInst;
	}

	public String getDeDfDesigUpcase() {
		return this.desigUpcase;
	}

	public void setDeDfDesigUpcase(String deDfDesigUpcase) {
		this.desigUpcase = deDfDesigUpcase;
	}

	public String getDeDfDesignation() {
		return this.designation;
	}

	public void setDeDfDesignation(String deDfDesignation) {
		this.designation = deDfDesignation;
	}

	public String getDeDfRackPosition() {
		return this.rackPosition;
	}

	public void setDeDfRackPosition(String deDfRackPosition) {
		this.rackPosition = deDfRackPosition;
	}

	public String getDeDfRemark() {
		return this.remark;
	}

	public void setDeDfRemark(String deDfRemark) {
		this.remark = deDfRemark;
	}

	public String getDeDftDesiUpcase() {
		return this.desiUpcase;
	}

	public void setDeDftDesiUpcase(String deDftDesiUpcase) {
		this.desiUpcase = deDftDesiUpcase;
	}

	public String getDeDftDesignation() {
		return this.dftDesignation;
	}

	public void setDeDftDesignation(String deDftDesignation) {
		this.dftDesignation = deDftDesignation;
	}

	public String getDeDftFormFactor() {
		return this.dftFormFactor;
	}

	public void setDeDftFormFactor(String deDftFormFactor) {
		this.dftFormFactor = deDftFormFactor;
	}

	public String getDeDftHasColumns() {
		return this.dftHasColumns;
	}

	public void setDeDftHasColumns(String deDftHasColumns) {
		this.dftHasColumns = deDftHasColumns;
	}

	public String getDeDftManuOrdNo() {
		return this.dftManuOrdNo;
	}

	public void setDeDftManuOrdNo(String deDftManuOrdNo) {
		this.dftManuOrdNo = deDftManuOrdNo;
	}

	public String getDeDftPhoto() {
		return this.dftPhoto;
	}

	public void setDeDftPhoto(String deDftPhoto) {
		this.dftPhoto = deDftPhoto;
	}

	public String getDeDftRemark() {
		return this.dftRemark;
	}

	public void setDeDftRemark(String deDftRemark) {
		this.dftRemark = deDftRemark;
	}

	public Long getDeDftSapNo() {
		return this.dftSapNo;
	}

	public void setDeDftSapNo(Long deDftSapNo) {
		this.dftSapNo = deDftSapNo;
	}

	public String getDeDgDesigUpcase() {
		return this.dgDesigUpcase;
	}

	public void setDeDgDesigUpcase(String deDgDesigUpcase) {
		this.dgDesigUpcase = deDgDesigUpcase;
	}

	public String getDeDgDesignation() {
		return this.dgDesignation;
	}

	public void setDeDgDesignation(String deDgDesignation) {
		this.dgDesignation = deDgDesignation;
	}

	public Long getDeElemPoCount() {
		return this.elemPoCount;
	}

	public void setDeElemPoCount(Long deElemPoCount) {
		this.elemPoCount = deElemPoCount;
	}

	public Long getDeEndpunktFk() {
		return this.endpunktFk;
	}

	public void setDeEndpunktFk(Long deEndpunktFk) {
		this.endpunktFk = deEndpunktFk;
	}

	public String getDeFreePins() {
		return this.freePins;
	}

	public void setDeFreePins(String deFreePins) {
		this.freePins = deFreePins;
	}

	public String getDePosition() {
		return this.position;
	}

	public void setDePosition(String dePosition) {
		this.position = dePosition;
	}

	public String getDeRaBay() {
		return this.raBay;
	}

	public void setDeRaBay(String deRaBay) {
		this.raBay = deRaBay;
	}

	public String getDeRaDesignation() {
		return this.raDesignation;
	}

	public void setDeRaDesignation(String deRaDesignation) {
		this.raDesignation = deRaDesignation;
	}

	public String getDeRaRow() {
		return this.raRow;
	}

	public void setDeRaRow(String deRaRow) {
		this.raRow = deRaRow;
	}

	public String getDeRaSpace() {
		return this.raSpace;
	}

	public void setDeRaSpace(String deRaSpace) {
		this.raSpace = deRaSpace;
	}

	public String getDeRemark() {
		return this.deRemark;
	}

	public void setDeRemark(String deRemark) {
		this.deRemark = deRemark;
	}

	public String getDeRoBuilding() {
		return this.deRoBuilding;
	}

	public void setDeRoBuilding(String deRoBuilding) {
		this.deRoBuilding = deRoBuilding;
	}

	public String getDeRoDesignation() {
		return this.deRoDesignation;
	}

	public void setDeRoDesignation(String deRoDesignation) {
		this.deRoDesignation = deRoDesignation;
	}

	public String getDeRoFloor() {
		return this.deRoFloor;
	}

	public void setDeRoFloor(String deRoFloor) {
		this.deRoFloor = deRoFloor;
	}

	public InfoTelehouse getDeTelehouseFk() {
		return this.infoTelehouse;
	}

	public void setDeTelehouseFk(InfoTelehouse deTelehouseFk) {
		this.infoTelehouse = deTelehouseFk;
	}

	public Set<InfoCosts> getInfoCostsCollection() {
		return this.infoCostsCollection;
	}

	public void setInfoCostsCollection(Set<InfoCosts> infoCostsCollection) {
		this.infoCostsCollection = infoCostsCollection;
	}

	public Set<InfoCable> getInfoCableCollection() {
		return this.infoCables;
	}

	public void setInfoCableCollection(Set<InfoCable> infoCableCollection) {
		this.infoCables = infoCableCollection;
	}

	public Set<InfoCable> getInfoCableCollection2() {
		return this.infoCables2;
	}

	public void setInfoCableCollection2(Set<InfoCable> infoCableCollection2) {
		this.infoCables2 = infoCableCollection2;
	}



}
