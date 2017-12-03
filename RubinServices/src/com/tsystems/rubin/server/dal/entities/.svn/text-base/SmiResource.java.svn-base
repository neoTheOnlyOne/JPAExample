package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SMI_RESOURCE")
public class SmiResource implements Serializable {
	@Id
	@Column(name="OID_RESOURCE")
	private Long id;

	@Column(name="CITYPOINTA")
	private String cityPointA;

	@Column(name="CUSTNO")
	private String custNo;

	@Column(name="CUSTNOINFO")
	private String custNoInfo;

	@Column(name="FOREIGNNR")
	private String foreignnr;

	@Column(name="LOCPOINTA")
	private String locPointA;

	@Column(name="LSZ")
	private String lsc;

	@Column(name="LSZERG")
	private String lscErg;

	@Column(name="NAKODAA")
	private String nakodaA;

	@Column(name="NAKODAB")
	private String nakodaB;

	@Column(name="NAMEPOINTA")
	private String namePointA;

	@Column(name="NDSSTATUS")
	private String ndsStatus;

	@Column(name="ONKZA")
	private String onkzA;

	@Column(name="ONKZB")
	private String onkzB;

	@Column(name="ORDNUNGSNR")
	private String ordnungsnr;

	@Column(name="RCOMP_NR")
	private Long rcompNr;

	@Column(name="STREETPOINTA")
	private String streetPointA;

	@Column(name="TESYSTATUS")
	private String tesyStatus;

	@Column(name="TOPRESOURCE")
	private String topResource;

	@Column(name="VPSZA")
	private String vpszA;

	@Column(name="VPSZB")
	private String vpszB;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SMI_GROUPOID_GROUP")
	private SmiGroup smiGroup;

	private static final long serialVersionUID = 1L;

	public SmiResource() {
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
	 * @return the cityPointA
	 */
	public String getCityPointA() {
		return cityPointA;
	}

	/**
	 * @param cityPointA the cityPointA to set
	 */
	public void setCityPointA(String cityPointA) {
		this.cityPointA = cityPointA;
	}

	/**
	 * @return the custNo
	 */
	public String getCustNo() {
		return custNo;
	}

	/**
	 * @param custNo the custNo to set
	 */
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	/**
	 * @return the custNoInfo
	 */
	public String getCustNoInfo() {
		return custNoInfo;
	}

	/**
	 * @param custNoInfo the custNoInfo to set
	 */
	public void setCustNoInfo(String custNoInfo) {
		this.custNoInfo = custNoInfo;
	}

	/**
	 * @return the foreignnr
	 */
	public String getForeignnr() {
		return foreignnr;
	}

	/**
	 * @param foreignnr the foreignnr to set
	 */
	public void setForeignnr(String foreignnr) {
		this.foreignnr = foreignnr;
	}

	/**
	 * @return the locPointA
	 */
	public String getLocPointA() {
		return locPointA;
	}

	/**
	 * @param locPointA the locPointA to set
	 */
	public void setLocPointA(String locPointA) {
		this.locPointA = locPointA;
	}

	/**
	 * @return the lsc
	 */
	public String getLsc() {
		return lsc;
	}

	/**
	 * @param lsc the lsc to set
	 */
	public void setLsc(String lsc) {
		this.lsc = lsc;
	}

	/**
	 * @return the lscErg
	 */
	public String getLscErg() {
		return lscErg;
	}

	/**
	 * @param lscErg the lscErg to set
	 */
	public void setLscErg(String lscErg) {
		this.lscErg = lscErg;
	}

	/**
	 * @return the nakodaA
	 */
	public String getNakodaA() {
		return nakodaA;
	}

	/**
	 * @param nakodaA the nakodaA to set
	 */
	public void setNakodaA(String nakodaA) {
		this.nakodaA = nakodaA;
	}

	/**
	 * @return the nakodaB
	 */
	public String getNakodaB() {
		return nakodaB;
	}

	/**
	 * @param nakodaB the nakodaB to set
	 */
	public void setNakodaB(String nakodaB) {
		this.nakodaB = nakodaB;
	}

	/**
	 * @return the namePointA
	 */
	public String getNamePointA() {
		return namePointA;
	}

	/**
	 * @param namePointA the namePointA to set
	 */
	public void setNamePointA(String namePointA) {
		this.namePointA = namePointA;
	}

	/**
	 * @return the ndsStatus
	 */
	public String getNdsStatus() {
		return ndsStatus;
	}

	/**
	 * @param ndsStatus the ndsStatus to set
	 */
	public void setNdsStatus(String ndsStatus) {
		this.ndsStatus = ndsStatus;
	}

	/**
	 * @return the onkzA
	 */
	public String getOnkzA() {
		return onkzA;
	}

	/**
	 * @param onkzA the onkzA to set
	 */
	public void setOnkzA(String onkzA) {
		this.onkzA = onkzA;
	}

	/**
	 * @return the onkzB
	 */
	public String getOnkzB() {
		return onkzB;
	}

	/**
	 * @param onkzB the onkzB to set
	 */
	public void setOnkzB(String onkzB) {
		this.onkzB = onkzB;
	}

	/**
	 * @return the ordnungsnr
	 */
	public String getOrdnungsnr() {
		return ordnungsnr;
	}

	/**
	 * @param ordnungsnr the ordnungsnr to set
	 */
	public void setOrdnungsnr(String ordnungsnr) {
		this.ordnungsnr = ordnungsnr;
	}

	/**
	 * @return the rcompNr
	 */
	public Long getRcompNr() {
		return rcompNr;
	}

	/**
	 * @param rcompNr the rcompNr to set
	 */
	public void setRcompNr(Long rcompNr) {
		this.rcompNr = rcompNr;
	}

	/**
	 * @return the streetPointA
	 */
	public String getStreetPointA() {
		return streetPointA;
	}

	/**
	 * @param streetPointA the streetPointA to set
	 */
	public void setStreetPointA(String streetPointA) {
		this.streetPointA = streetPointA;
	}

	/**
	 * @return the tesyStatus
	 */
	public String getTesyStatus() {
		return tesyStatus;
	}

	/**
	 * @param tesyStatus the tesyStatus to set
	 */
	public void setTesyStatus(String tesyStatus) {
		this.tesyStatus = tesyStatus;
	}

	/**
	 * @return the topResource
	 */
	public String getTopResource() {
		return topResource;
	}

	/**
	 * @param topResource the topResource to set
	 */
	public void setTopResource(String topResource) {
		this.topResource = topResource;
	}

	/**
	 * @return the vpszA
	 */
	public String getVpszA() {
		return vpszA;
	}

	/**
	 * @param vpszA the vpszA to set
	 */
	public void setVpszA(String vpszA) {
		this.vpszA = vpszA;
	}

	/**
	 * @return the vpszB
	 */
	public String getVpszB() {
		return vpszB;
	}

	/**
	 * @param vpszB the vpszB to set
	 */
	public void setVpszB(String vpszB) {
		this.vpszB = vpszB;
	}

	/**
	 * @return the smiGroup
	 */
	public SmiGroup getSmiGroup() {
		return smiGroup;
	}

	/**
	 * @param smiGroup the smiGroup to set
	 */
	public void setSmiGroup(SmiGroup smiGroup) {
		this.smiGroup = smiGroup;
	}

}
