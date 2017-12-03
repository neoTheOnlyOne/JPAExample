package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SST_OMS_NDS_IN")
public class SstOmsNdsIn implements Serializable {
	@EmbeddedId
	private SstOmsNdsInPK sstOmsNdsInPK;

	@Column(name="A_CITY")
	private String aCity;

	@Column(name="A_SITE")
	private String aSite;

	@Column(name="A_SITE_ID")
	private String aSiteId;

	@Column(name="A_TERMINAL_ID")
	private String aTerminalId;

	private String al;

	private String alias;

	@Column(name="B_CITY")
	private String bCity;

	@Column(name="B_SITE")
	private String bSite;

	@Column(name="B_SITE_ID")
	private String bSiteId;

	@Column(name="B_TERMINAL_ID")
	private String bTerminalId;

	@Column(name="DATE_N")
	private String dateN;

	@Column(name="DATE_Z")
	private String dateZ;

	private String il;

	@Column(name="LEAD_INFO")
	private String leadInfo;

	@Column(name="LSZ")
	private String lsc;

	@Column(name="LSZ_EXTENSION")
	private String lscExtension;

	@Column(name="OMS_STATE")
	private String omsState;

	@Column(name="ORDER_TYPE")
	private String orderType;

	private String processtype;

	private String remarks;

	private String schrittnr;

	@Column(name="SECTION_INFO_FK")
	private String sectionInfoFk;

	@Column(name="SECTION_TYPE")
	private String sectionType;

	private String sno;

	@Column(name="TGN_NMS_KK")
	private String tgnNmsKk;

	@OneToMany(mappedBy="sstOmsNdsIn")
	private Set<SstEndpNeuIn> sstEndpNeuIns;

	@OneToMany(mappedBy="sstOmsNdsIn")
	private Set<SstInfoIn> sstInfoIns;

	private static final long serialVersionUID = 1L;

	public SstOmsNdsIn() {
		super();
	}


	/**
	 * @return the sstOmsNdsInPK
	 */
	public SstOmsNdsInPK getSstOmsNdsInPK() {
		return sstOmsNdsInPK;
	}


	/**
	 * @param sstOmsNdsInPK the sstOmsNdsInPK to set
	 */
	public void setSstOmsNdsInPK(SstOmsNdsInPK sstOmsNdsInPK) {
		this.sstOmsNdsInPK = sstOmsNdsInPK;
	}


	public String getACity() {
		return this.aCity;
	}

	public void setACity(String aCity) {
		this.aCity = aCity;
	}

	public String getASite() {
		return this.aSite;
	}

	public void setASite(String aSite) {
		this.aSite = aSite;
	}

	public String getASiteId() {
		return this.aSiteId;
	}

	public void setASiteId(String aSiteId) {
		this.aSiteId = aSiteId;
	}

	public String getATerminalId() {
		return this.aTerminalId;
	}

	public void setATerminalId(String aTerminalId) {
		this.aTerminalId = aTerminalId;
	}

	public String getAl() {
		return this.al;
	}

	public void setAl(String al) {
		this.al = al;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getBCity() {
		return this.bCity;
	}

	public void setBCity(String bCity) {
		this.bCity = bCity;
	}

	public String getBSite() {
		return this.bSite;
	}

	public void setBSite(String bSite) {
		this.bSite = bSite;
	}

	public String getBSiteId() {
		return this.bSiteId;
	}

	public void setBSiteId(String bSiteId) {
		this.bSiteId = bSiteId;
	}

	public String getBTerminalId() {
		return this.bTerminalId;
	}

	public void setBTerminalId(String bTerminalId) {
		this.bTerminalId = bTerminalId;
	}

	public String getDateN() {
		return this.dateN;
	}

	public void setDateN(String dateN) {
		this.dateN = dateN;
	}

	public String getDateZ() {
		return this.dateZ;
	}

	public void setDateZ(String dateZ) {
		this.dateZ = dateZ;
	}

	public String getIl() {
		return this.il;
	}

	public void setIl(String il) {
		this.il = il;
	}

	public String getLeadInfo() {
		return this.leadInfo;
	}

	public void setLeadInfo(String leadInfo) {
		this.leadInfo = leadInfo;
	}

	public String getLsz() {
		return this.lsc;
	}

	public void setLsz(String lsz) {
		this.lsc = lsz;
	}

	public String getLszExtension() {
		return this.lscExtension;
	}

	public void setLszExtension(String lszExtension) {
		this.lscExtension = lszExtension;
	}

	public String getOmsState() {
		return this.omsState;
	}

	public void setOmsState(String omsState) {
		this.omsState = omsState;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getProcesstype() {
		return this.processtype;
	}

	public void setProcesstype(String processtype) {
		this.processtype = processtype;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSchrittnr() {
		return this.schrittnr;
	}

	public void setSchrittnr(String schrittnr) {
		this.schrittnr = schrittnr;
	}

	public String getSectionInfoFk() {
		return this.sectionInfoFk;
	}

	public void setSectionInfoFk(String sectionInfoFk) {
		this.sectionInfoFk = sectionInfoFk;
	}

	public String getSectionType() {
		return this.sectionType;
	}

	public void setSectionType(String sectionType) {
		this.sectionType = sectionType;
	}

	public String getSno() {
		return this.sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getTgnNmsKk() {
		return this.tgnNmsKk;
	}

	public void setTgnNmsKk(String tgnNmsKk) {
		this.tgnNmsKk = tgnNmsKk;
	}

	public Set<SstEndpNeuIn> getSstEndpNeuInCollection() {
		return this.sstEndpNeuIns;
	}

	public void setSstEndpNeuInCollection(Set<SstEndpNeuIn> sstEndpNeuInCollection) {
		this.sstEndpNeuIns = sstEndpNeuInCollection;
	}

	public Set<SstInfoIn> getSstInfoInCollection() {
		return this.sstInfoIns;
	}

	public void setSstInfoInCollection(Set<SstInfoIn> sstInfoInCollection) {
		this.sstInfoIns = sstInfoInCollection;
	}


}
