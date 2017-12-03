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
@Table(name="INFO_RACK")
public class InfoRack implements Serializable {
	@Id
	@Column(name="RA_RACK_ID")
	private Long id;

	@Column(name="RA_ALIAS")
	private String alias;

	@Column(name="RA_ALIAS_UPCASE")
	private String aliasUpcase;

	@Column(name="RA_BAY")
	private String bay;

	@Column(name="RA_DATE_INSTALLED")
	private Date dateInstalled;

	@Column(name="RA_DESIG_UPCASE")
	private String desigUpcase;

	@Column(name="RA_DESIGNATION")
	private String designation;

	@Column(name="RA_MA_ABBREVIATION")
	private String maAbbreviation;

	@Column(name="RA_MA_NAME")
	private String maName;

	@Column(name="RA_MA_NAME_UPCASE")
	private String maNameUpcase;

	@Column(name="RA_MA_REMARK")
	private String maRemark;

	@Column(name="RA_PHOTO")
	private String photo;

	@Column(name="RA_REMARK")
	private String remark;

	@Column(name="RA_RO_BUILDING")
	private String roBuilding;

	@Column(name="RA_RO_DESIGNATION")
	private String roDesignation;

	@Column(name="RA_RO_FLOOR")
	private String roFloor;

	@Column(name="RA_ROW")
	private String row;

	@Column(name="RA_RT_ABBREVIATION")
	private String rtAbbreviation;

	@Column(name="RA_RT_DESIG_UPCASE")
	private String rtDesigUpcase;

	@Column(name="RA_RT_DESIGNATION")
	private String rtDesignation;

	@Column(name="RA_RT_DIMENSION")
	private String rtDimension;

	@Column(name="RA_RT_MANU_ORD_NO")
	private String rtManuOrdNo;

	@Column(name="RA_RT_REMARK")
	private String rtRemark;

	@Column(name="RA_RT_SAP_NO")
	private Long rtSapNo;

	@Column(name="RA_SP_DESIGNATION")
	private String spDesignation;

	@Column(name="RA_SPACE")
	private String space;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="RA_CUSTOMER_FK")
	private InfoCustomer infoCustomer;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="RA_TELEHOUSE_FK")
	private InfoTelehouse infoTelehouse;

	@OneToMany(mappedBy="infoRack")
	private Set<InfoCosts> infoCosts;

	private static final long serialVersionUID = 1L;

	public InfoRack() {
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
	 * @return the aliasUpcase
	 */
	public String getAliasUpcase() {
		return aliasUpcase;
	}

	/**
	 * @param aliasUpcase the aliasUpcase to set
	 */
	public void setAliasUpcase(String aliasUpcase) {
		this.aliasUpcase = aliasUpcase;
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
	 * @return the maName
	 */
	public String getMaName() {
		return maName;
	}

	/**
	 * @param maName the maName to set
	 */
	public void setMaName(String maName) {
		this.maName = maName;
	}

	/**
	 * @return the maNameUpcase
	 */
	public String getMaNameUpcase() {
		return maNameUpcase;
	}

	/**
	 * @param maNameUpcase the maNameUpcase to set
	 */
	public void setMaNameUpcase(String maNameUpcase) {
		this.maNameUpcase = maNameUpcase;
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
	 * @return the roBuilding
	 */
	public String getRoBuilding() {
		return roBuilding;
	}

	/**
	 * @param roBuilding the roBuilding to set
	 */
	public void setRoBuilding(String roBuilding) {
		this.roBuilding = roBuilding;
	}

	/**
	 * @return the roDesignation
	 */
	public String getRoDesignation() {
		return roDesignation;
	}

	/**
	 * @param roDesignation the roDesignation to set
	 */
	public void setRoDesignation(String roDesignation) {
		this.roDesignation = roDesignation;
	}

	/**
	 * @return the roFloor
	 */
	public String getRoFloor() {
		return roFloor;
	}

	/**
	 * @param roFloor the roFloor to set
	 */
	public void setRoFloor(String roFloor) {
		this.roFloor = roFloor;
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
	 * @return the rtAbbreviation
	 */
	public String getRtAbbreviation() {
		return rtAbbreviation;
	}

	/**
	 * @param rtAbbreviation the rtAbbreviation to set
	 */
	public void setRtAbbreviation(String rtAbbreviation) {
		this.rtAbbreviation = rtAbbreviation;
	}

	/**
	 * @return the rtDesigUpcase
	 */
	public String getRtDesigUpcase() {
		return rtDesigUpcase;
	}

	/**
	 * @param rtDesigUpcase the rtDesigUpcase to set
	 */
	public void setRtDesigUpcase(String rtDesigUpcase) {
		this.rtDesigUpcase = rtDesigUpcase;
	}

	/**
	 * @return the rtDesignation
	 */
	public String getRtDesignation() {
		return rtDesignation;
	}

	/**
	 * @param rtDesignation the rtDesignation to set
	 */
	public void setRtDesignation(String rtDesignation) {
		this.rtDesignation = rtDesignation;
	}

	/**
	 * @return the rtDimension
	 */
	public String getRtDimension() {
		return rtDimension;
	}

	/**
	 * @param rtDimension the rtDimension to set
	 */
	public void setRtDimension(String rtDimension) {
		this.rtDimension = rtDimension;
	}

	/**
	 * @return the rtManuOrdNo
	 */
	public String getRtManuOrdNo() {
		return rtManuOrdNo;
	}

	/**
	 * @param rtManuOrdNo the rtManuOrdNo to set
	 */
	public void setRtManuOrdNo(String rtManuOrdNo) {
		this.rtManuOrdNo = rtManuOrdNo;
	}

	/**
	 * @return the rtRemark
	 */
	public String getRtRemark() {
		return rtRemark;
	}

	/**
	 * @param rtRemark the rtRemark to set
	 */
	public void setRtRemark(String rtRemark) {
		this.rtRemark = rtRemark;
	}

	/**
	 * @return the rtSapNo
	 */
	public Long getRtSapNo() {
		return rtSapNo;
	}

	/**
	 * @param rtSapNo the rtSapNo to set
	 */
	public void setRtSapNo(Long rtSapNo) {
		this.rtSapNo = rtSapNo;
	}

	/**
	 * @return the spDesignation
	 */
	public String getSpDesignation() {
		return spDesignation;
	}

	/**
	 * @param spDesignation the spDesignation to set
	 */
	public void setSpDesignation(String spDesignation) {
		this.spDesignation = spDesignation;
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
	 * @return the infoCustomer
	 */
	public InfoCustomer getInfoCustomer() {
		return infoCustomer;
	}

	/**
	 * @param infoCustomer the infoCustomer to set
	 */
	public void setInfoCustomer(InfoCustomer infoCustomer) {
		this.infoCustomer = infoCustomer;
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

}
