package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Timestamp;
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
@Table(name="ARCHIVE_CIRCUIT")
public class ArchiveCircuit implements Serializable {
	@Id
	@Column(name="OID_ARCHIVE_CIRCUIT")
	private Long id;

	@Column(name="AC_SNO")
	private Long sno;

	@Column(name="AC_LSZ")
	private String lsc;

	@Column(name="AC_LSZ_EXT_ID")
	private String lscExtId;

	@Column(name="AC_TGN_NMS_ID")
	private String tgnNmsId;

	@Column(name="AC_SITE_NAME_A")
	private String siteNameA;

	@Column(name="AC_TERMINAL_ID_A")
	private String terminalIdA;

	@Column(name="AR_SITE_NAME_B")
	private String siteNameB;

	@Column(name="AC_TERMINAL_ID_B")
	private String terminalIdB;

	@Column(name="AC_CARRIERNAME")
	private String carriername;

	@Column(name="AC_CARRIERCODE")
	private String carriercode;

	@Column(name="AC_END_CUSTOMERNAME")
	private String endCustomername;

	@Column(name="AC_ALIAS")
	private String alias;

	@Column(name="AC_ARCHIVE_DATE")
	private Timestamp archiveDate;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_COMPANYOID_COMPANY")
	private Company company;

	@OneToMany(mappedBy="archiveCircuit")
	private Set<LruCircuit> lruCircuits;

	@OneToMany(mappedBy="archiveCircuit")
	private Set<ArchiveStructInfo> archiveStructInfos;

	@OneToMany(mappedBy="archiveCircuit")
	private Set<ArchiveCircuitInfo> archiveCircuitInfos;

	private static final long serialVersionUID = 1L;

	public ArchiveCircuit() {
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
	 * @return the sno
	 */
	public Long getSno() {
		return sno;
	}

	/**
	 * @param sno the sno to set
	 */
	public void setSno(Long sno) {
		this.sno = sno;
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
	 * @return the lscExtId
	 */
	public String getLscExtId() {
		return lscExtId;
	}

	/**
	 * @param lscExtId the lscExtId to set
	 */
	public void setLscExtId(String lscExtId) {
		this.lscExtId = lscExtId;
	}

	/**
	 * @return the tgnNmsId
	 */
	public String getTgnNmsId() {
		return tgnNmsId;
	}

	/**
	 * @param tgnNmsId the tgnNmsId to set
	 */
	public void setTgnNmsId(String tgnNmsId) {
		this.tgnNmsId = tgnNmsId;
	}

	/**
	 * @return the siteNameA
	 */
	public String getSiteNameA() {
		return siteNameA;
	}

	/**
	 * @param siteNameA the siteNameA to set
	 */
	public void setSiteNameA(String siteNameA) {
		this.siteNameA = siteNameA;
	}

	/**
	 * @return the terminalIdA
	 */
	public String getTerminalIdA() {
		return terminalIdA;
	}

	/**
	 * @param terminalIdA the terminalIdA to set
	 */
	public void setTerminalIdA(String terminalIdA) {
		this.terminalIdA = terminalIdA;
	}

	/**
	 * @return the siteNameB
	 */
	public String getSiteNameB() {
		return siteNameB;
	}

	/**
	 * @param siteNameB the siteNameB to set
	 */
	public void setSiteNameB(String siteNameB) {
		this.siteNameB = siteNameB;
	}

	/**
	 * @return the terminalIdB
	 */
	public String getTerminalIdB() {
		return terminalIdB;
	}

	/**
	 * @param terminalIdB the terminalIdB to set
	 */
	public void setTerminalIdB(String terminalIdB) {
		this.terminalIdB = terminalIdB;
	}

	/**
	 * @return the carriername
	 */
	public String getCarriername() {
		return carriername;
	}

	/**
	 * @param carriername the carriername to set
	 */
	public void setCarriername(String carriername) {
		this.carriername = carriername;
	}

	/**
	 * @return the carriercode
	 */
	public String getCarriercode() {
		return carriercode;
	}

	/**
	 * @param carriercode the carriercode to set
	 */
	public void setCarriercode(String carriercode) {
		this.carriercode = carriercode;
	}

	/**
	 * @return the endCustomername
	 */
	public String getEndCustomername() {
		return endCustomername;
	}

	/**
	 * @param endCustomername the endCustomername to set
	 */
	public void setEndCustomername(String endCustomername) {
		this.endCustomername = endCustomername;
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
	 * @return the archiveDate
	 */
	public Timestamp getArchiveDate() {
		return archiveDate;
	}

	/**
	 * @param archiveDate the archiveDate to set
	 */
	public void setArchiveDate(Timestamp archiveDate) {
		this.archiveDate = archiveDate;
	}

	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * @return the lruCircuits
	 */
	public Set<LruCircuit> getLruCircuits() {
		return lruCircuits;
	}

	/**
	 * @param lruCircuits the lruCircuits to set
	 */
	public void setLruCircuits(Set<LruCircuit> lruCircuits) {
		this.lruCircuits = lruCircuits;
	}

	/**
	 * @return the archiveStructInfos
	 */
	public Set<ArchiveStructInfo> getArchiveStructInfos() {
		return archiveStructInfos;
	}

	/**
	 * @param archiveStructInfos the archiveStructInfos to set
	 */
	public void setArchiveStructInfos(Set<ArchiveStructInfo> archiveStructInfos) {
		this.archiveStructInfos = archiveStructInfos;
	}

	/**
	 * @return the archiveCircuitInfos
	 */
	public Set<ArchiveCircuitInfo> getArchiveCircuitInfos() {
		return archiveCircuitInfos;
	}

	/**
	 * @param archiveCircuitInfos the archiveCircuitInfos to set
	 */
	public void setArchiveCircuitInfos(Set<ArchiveCircuitInfo> archiveCircuitInfos) {
		this.archiveCircuitInfos = archiveCircuitInfos;
	}

	
}
