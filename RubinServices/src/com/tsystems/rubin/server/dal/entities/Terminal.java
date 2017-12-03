package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;

@NamedQueries( {
		@NamedQuery(name = NamedQueryConstants.TERMINAL_FINDBYSITEIDREFERENCECODE, query = "Select new com.tsystems.rubin.server.dal.dvo.TerminalDVO"
			+ Terminal.COMMON_PICKLIST_FIELDS_STRING	
			+ " from Terminal t where ((?1 is not null and trim(both from t.site.siteId) like ?1 and ?2 is null) or "
				+ "(?1 is not null and trim(both from t.site.siteId)like ?1 and ?2 is not null and trim(both from t.referenceCode) like ?2)) "
				+ "order by t.site.siteId,t.referenceCode"),
		@NamedQuery(name = NamedQueryConstants.TERMINAL_FINDBYSITEDESIGNATIONNATIONALSEARCHREFERENCECODE, query = "Select new com.tsystems.rubin.server.dal.dvo.TerminalDVO"
				+ Terminal.COMMON_PICKLIST_FIELDS_STRING
				+ " from Terminal t where ((?1 is not null and trim(both from t.site.designationNationalSearch) like ?1 and ?2 is null) or "
				+ "(?1 is not null and trim(both from t.site.designationNationalSearch)like ?1 and ?2 is not null and trim(both from t.referenceCode) like ?2)) "
				+ "order by t.site.designationNationalSearch,t.referenceCode"),
		@NamedQuery(name = NamedQueryConstants.TERMINAL_FINDBYAKZNKZREFERENCECODE, query = "Select new com.tsystems.rubin.server.dal.dvo.TerminalDVO"
				+ Terminal.COMMON_PICKLIST_FIELDS_STRING
				+ " from Terminal t JOIN t.site s JOIN s.city c JOIN c.country co where ((?1 is not null and trim(both from co.akz) like ?1 and trim(both from c.nkz) like ?2 and ?3 is null) or "
				+ "(?1 is not null and trim(both from co.akz) like ?1 and trim(both from c.nkz) like ?2 and ?3 is not null and trim(both from t.referenceCode) like ?3)) "
				+ "order by t.site.siteId,t.referenceCode"),
		@NamedQuery(name = NamedQueryConstants.TERMINAL_FINDBYAKZNKZVPZREFERENCECODE, query = "Select new com.tsystems.rubin.server.dal.dvo.TerminalDVO"
				+ Terminal.COMMON_PICKLIST_FIELDS_STRING
				+ " from Terminal t JOIN t.site s JOIN s.city c JOIN c.country co where ((?1 is not null and trim(both from co.akz) like ?1 and trim(both from c.nkz) like ?2 and trim(both from s.vpz) like ?3 and ?4 is null) or "
				+ "(?1 is not null and trim(both from co.akz) like ?1 and trim(both from c.nkz) like ?2 and trim(both from s.vpz) like ?3 and ?4 is not null and trim(both from t.referenceCode) like ?4))"
				+ "order by t.site.siteId,t.referenceCode"),
		@NamedQuery(name = NamedQueryConstants.TERMINAL_FINDBYSITEIDDESCRIPTION, query = "Select new com.tsystems.rubin.server.dal.dvo.TerminalDVO"
				+ Terminal.COMMON_PICKLIST_FIELDS_STRING
				+ " from Terminal t where ((?1 is not null and trim(both from t.site.siteId) like ?1 and ?2 is null) or (?1 is not null and trim(both from t.site.siteId)like ?1 and ?2 is not null and trim(both from t.description) like ?2)) "
				+ "order by t.site.siteId,t.description"),
		@NamedQuery(name = NamedQueryConstants.TERMINAL_FINDBYSITEDESIGNATIONNATIONALSEARCHDESCRIPTION, query = "Select new com.tsystems.rubin.server.dal.dvo.TerminalDVO"
				+ Terminal.COMMON_PICKLIST_FIELDS_STRING
				+ " from Terminal t where ((?1 is not null and trim(both from t.site.designationNationalSearch) like ?1 and ?2 is null) or (?1 is not null and trim(both from t.site.designationNationalSearch)like ?1 and ?2 is not null and trim(both from t.description) like ?2)) "
				+ "order by t.site.designationNationalSearch,t.description"),
		@NamedQuery(name = NamedQueryConstants.TERMINAL_FINDBYAKZNKZDESCRIPTION, query = "Select new com.tsystems.rubin.server.dal.dvo.TerminalDVO"
				+ Terminal.COMMON_PICKLIST_FIELDS_STRING
				+ " from Terminal t JOIN t.site s JOIN s.city c JOIN c.country co where ((?1 is not null and trim(both from co.akz) like ?1 and trim(both from c.nkz) like ?2 and ?3 is null) or (?1 is not null and trim(both from co.akz) like ?1 and trim(both from c.nkz) like ?2 and ?3 is not null and trim(both from t.description) like ?3)) "
				+ "order by t.site.siteId,t.description"),
		@NamedQuery(name = NamedQueryConstants.TERMINAL_FINDBYAKZNKZVPZDESCRIPTION, query = "Select new com.tsystems.rubin.server.dal.dvo.TerminalDVO"
				+ Terminal.COMMON_PICKLIST_FIELDS_STRING
				+ " from Terminal t JOIN t.site s JOIN s.city c JOIN c.country co where ((?1 is not null and trim(both from co.akz) like ?1 and trim(both from c.nkz) like ?2 and trim(both from s.vpz) like ?3 and ?4 is null) or (?1 is not null and trim(both from co.akz) like ?1 and trim(both from c.nkz) like ?2 and trim(both from s.vpz) like ?3 and ?4 is not null and trim(both from t.description) like ?4))"
				+ "order by t.site.siteId,t.description"),
		@NamedQuery(name = NamedQueryConstants.TERMINAL_FINDBYCUSTOMERNAME, query = "Select new com.tsystems.rubin.server.dal.dvo.TerminalDVO"
				+ Terminal.COMMON_PICKLIST_FIELDS_STRING
				+ " from CustomerTerminal ct JOIN ct.terminal t where trim(both from ct.name) like ?1 "
				+ "order by t.site.siteId"),
		@NamedQuery(name = NamedQueryConstants.TERMINAL_FINDBYREFERENCECODE, query = "Select new com.tsystems.rubin.server.dal.dvo.TerminalDVO"
				+ Terminal.COMMON_PICKLIST_FIELDS_STRING
				+ " from Terminal t where trim(both from t.referenceCode) like ?1 "
				+ "order by t.referenceCode"),
		@NamedQuery(name = NamedQueryConstants.TERMINAL_FINDBYDESCRIPTION, query = "Select new com.tsystems.rubin.server.dal.dvo.TerminalDVO"
				+ Terminal.COMMON_PICKLIST_FIELDS_STRING
				+ " from Terminal t where trim(both from t.description) like ?1 "
				+ "order by t.description") })
@Entity
@Table(name = "ENDPUNKT")
public class Terminal implements Serializable {
	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(t.id, t.referenceCode, "
			+ "t.description, t.site.id,t.site.siteId ,t.site.abbreviationInternational,t.carrier.id, "
			+ "t.carrier.name)";



	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "OID_ENDPUNKT")
	private Long id;

	@Column(name = "CODIERUNG_GRENZSTE")
	private String codeInterrupt;

	@Column(name = "ENDPUNKTBEZEICHNUN")
	private String description;

	@Column(name = "ENDPUNKTKENNUNG")
	private String referenceCode;

	@Column(name = "ENDPUNKTNOTIZ")
	private String remark;

	@Column(name = "ITU_SUFFIX")
	private String ituSuffix;

	@Column(name = "SPC_NUMMER")
	private String spcNumber;

	@Column(name = "LETZTE_AKTUALISIER")
	private Date lastUpdate;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_CARRIEROID_CARR")
	private Carrier carrier;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_CUSTOMEROID_CUSTOMER")
	private Customer customer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_GRUNDSTUECKOID")
	private Site site;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_TELEHOUSEOID_TH")
	private Telehouse telehouse;

	@OneToMany(mappedBy = "terminal")
	private Set<CustomerTerminal> customerTerminals;

	@OneToMany(mappedBy = "terminalA")
	private Set<Circuit> circuits;

	@OneToMany(mappedBy = "terminalB")
	private Set<Circuit> circuits2;

	@OneToMany(mappedBy = "terminal")
	private Set<Equipment> equipments;

	@OneToMany(mappedBy = "terminal")
	private Set<WiringUnit> wiringUnits;

	@OneToMany(mappedBy = "terminal")
	private Set<Tunnel> tunnels;

	@OneToMany(mappedBy = "terminal0")
	private Set<Tunnel> tunnels2;

	@OneToMany(mappedBy = "terminal0")
	private Set<Routing> routings;

	@OneToMany(mappedBy = "terminal")
	private Set<Routing> routings2;

	@OneToMany(mappedBy = "terminalB")
	private Set<Line> lines;

	@OneToMany(mappedBy = "terminalA")
	private Set<Line> lines2;

	@OneToMany(mappedBy = "terminal")
	private Set<CrossConnect> crossConnects;

	@OneToMany(mappedBy = "terminal")
	private Set<LineSegment> lineSegments;

	@OneToMany(mappedBy = "terminal0")
	private Set<LineSegment> lineSegments2;

	@OneToMany(mappedBy = "terminal1")
	private Set<LineSegment> lineSegments3;

	@OneToMany(mappedBy = "terminal")
	private Set<TransitionUnit> transitionUnits;

	@OneToMany(mappedBy = "terminal0")
	private Set<Nutzungsrechte> nutzungsrechtes;

	@OneToMany(mappedBy = "terminal")
	private Set<Nutzungsrechte> nutzungsrechtes2;

	@OneToMany(mappedBy = "terminal")
	private Set<DistributorFrame> distributorFrames;

	@OneToMany(mappedBy = "terminal")
	private Set<Wahlstufe> wahlstufes;

	@OneToMany(mappedBy = "terminalA")
	private Set<ContractLink> contractLinks;

	@OneToMany(mappedBy = "terminalB")
	private Set<ContractLink> contractLinks2;

	@ManyToMany
	@JoinTable(name = "HAT_2", joinColumns = @JoinColumn(name = "FK_ENDPUNKTOID_END"), inverseJoinColumns = @JoinColumn(name = "FK_TRANSPORTVEROID"))
	private Set<Circuit> circuits3;

	public Terminal() {
		super();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the codeInterrupt
	 */
	public String getCodeInterrupt() {
		return codeInterrupt;
	}

	/**
	 * @param codeInterrupt
	 *            the codeInterrupt to set
	 */
	public void setCodeInterrupt(String codeInterrupt) {
		this.codeInterrupt = codeInterrupt;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the referenceCode
	 */
	public String getReferenceCode() {
		return referenceCode;
	}

	/**
	 * @param referenceCode
	 *            the referenceCode to set
	 */
	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the ituSuffix
	 */
	public String getItuSuffix() {
		return ituSuffix;
	}

	/**
	 * @param ituSuffix
	 *            the ituSuffix to set
	 */
	public void setItuSuffix(String ituSuffix) {
		this.ituSuffix = ituSuffix;
	}

	/**
	 * @return the spcNumber
	 */
	public String getSpcNumber() {
		return spcNumber;
	}

	/**
	 * @param spcNumber
	 *            the spcNumber to set
	 */
	public void setSpcNumber(String spcNumber) {
		this.spcNumber = spcNumber;
	}

	/**
	 * @return the lastUpdate
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * @param lastUpdate
	 *            the lastUpdate to set
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy
	 *            the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the carrier
	 */
	public Carrier getCarrier() {
		return carrier;
	}

	/**
	 * @param carrier
	 *            the carrier to set
	 */
	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the site
	 */
	public Site getSite() {
		return site;
	}

	/**
	 * @param site
	 *            the site to set
	 */
	public void setSite(Site site) {
		this.site = site;
	}

	/**
	 * @return the telehouse
	 */
	public Telehouse getTelehouse() {
		return telehouse;
	}

	/**
	 * @param telehouse
	 *            the telehouse to set
	 */
	public void setTelehouse(Telehouse telehouse) {
		this.telehouse = telehouse;
	}

	/**
	 * @return the customerTerminals
	 */
	public Set<CustomerTerminal> getCustomerTerminals() {
		return customerTerminals;
	}

	/**
	 * @param customerTerminals
	 *            the customerTerminals to set
	 */
	public void setCustomerTerminals(Set<CustomerTerminal> customerTerminals) {
		this.customerTerminals = customerTerminals;
	}

	/**
	 * @return the circuits
	 */
	public Set<Circuit> getCircuits() {
		return circuits;
	}

	/**
	 * @param circuits
	 *            the circuits to set
	 */
	public void setCircuits(Set<Circuit> circuits) {
		this.circuits = circuits;
	}

	/**
	 * @return the circuits2
	 */
	public Set<Circuit> getCircuits2() {
		return circuits2;
	}

	/**
	 * @param circuits2
	 *            the circuits2 to set
	 */
	public void setCircuits2(Set<Circuit> circuits2) {
		this.circuits2 = circuits2;
	}

	/**
	 * @return the equipments
	 */
	public Set<Equipment> getEquipments() {
		return equipments;
	}

	/**
	 * @param equipments
	 *            the equipments to set
	 */
	public void setEquipments(Set<Equipment> equipments) {
		this.equipments = equipments;
	}

	/**
	 * @return the wiringUnits
	 */
	public Set<WiringUnit> getWiringUnits() {
		return wiringUnits;
	}

	/**
	 * @param wiringUnits
	 *            the wiringUnits to set
	 */
	public void setWiringUnits(Set<WiringUnit> wiringUnits) {
		this.wiringUnits = wiringUnits;
	}

	/**
	 * @return the tunnels
	 */
	public Set<Tunnel> getTunnels() {
		return tunnels;
	}

	/**
	 * @param tunnels
	 *            the tunnels to set
	 */
	public void setTunnels(Set<Tunnel> tunnels) {
		this.tunnels = tunnels;
	}

	/**
	 * @return the tunnels2
	 */
	public Set<Tunnel> getTunnels2() {
		return tunnels2;
	}

	/**
	 * @param tunnels2
	 *            the tunnels2 to set
	 */
	public void setTunnels2(Set<Tunnel> tunnels2) {
		this.tunnels2 = tunnels2;
	}

	/**
	 * @return the routings
	 */
	public Set<Routing> getRoutings() {
		return routings;
	}

	/**
	 * @param routings
	 *            the routings to set
	 */
	public void setRoutings(Set<Routing> routings) {
		this.routings = routings;
	}

	/**
	 * @return the routings2
	 */
	public Set<Routing> getRoutings2() {
		return routings2;
	}

	/**
	 * @param routings2
	 *            the routings2 to set
	 */
	public void setRoutings2(Set<Routing> routings2) {
		this.routings2 = routings2;
	}

	/**
	 * @return the lines
	 */
	public Set<Line> getLines() {
		return lines;
	}

	/**
	 * @param lines
	 *            the lines to set
	 */
	public void setLines(Set<Line> lines) {
		this.lines = lines;
	}

	/**
	 * @return the lines2
	 */
	public Set<Line> getLines2() {
		return lines2;
	}

	/**
	 * @param lines2
	 *            the lines2 to set
	 */
	public void setLines2(Set<Line> lines2) {
		this.lines2 = lines2;
	}

	/**
	 * @return the crossConnects
	 */
	public Set<CrossConnect> getCrossConnects() {
		return crossConnects;
	}

	/**
	 * @param crossConnects
	 *            the crossConnects to set
	 */
	public void setCrossConnects(Set<CrossConnect> crossConnects) {
		this.crossConnects = crossConnects;
	}

	/**
	 * @return the lineSegments
	 */
	public Set<LineSegment> getLineSegments() {
		return lineSegments;
	}

	/**
	 * @param lineSegments
	 *            the lineSegments to set
	 */
	public void setLineSegments(Set<LineSegment> lineSegments) {
		this.lineSegments = lineSegments;
	}

	/**
	 * @return the lineSegments2
	 */
	public Set<LineSegment> getLineSegments2() {
		return lineSegments2;
	}

	/**
	 * @param lineSegments2
	 *            the lineSegments2 to set
	 */
	public void setLineSegments2(Set<LineSegment> lineSegments2) {
		this.lineSegments2 = lineSegments2;
	}

	/**
	 * @return the lineSegments3
	 */
	public Set<LineSegment> getLineSegments3() {
		return lineSegments3;
	}

	/**
	 * @param lineSegments3
	 *            the lineSegments3 to set
	 */
	public void setLineSegments3(Set<LineSegment> lineSegments3) {
		this.lineSegments3 = lineSegments3;
	}

	/**
	 * @return the transitionUnits
	 */
	public Set<TransitionUnit> getTransitionUnits() {
		return transitionUnits;
	}

	/**
	 * @param transitionUnits
	 *            the transitionUnits to set
	 */
	public void setTransitionUnits(Set<TransitionUnit> transitionUnits) {
		this.transitionUnits = transitionUnits;
	}

	/**
	 * @return the nutzungsrechtes
	 */
	public Set<Nutzungsrechte> getNutzungsrechtes() {
		return nutzungsrechtes;
	}

	/**
	 * @param nutzungsrechtes
	 *            the nutzungsrechtes to set
	 */
	public void setNutzungsrechtes(Set<Nutzungsrechte> nutzungsrechtes) {
		this.nutzungsrechtes = nutzungsrechtes;
	}

	/**
	 * @return the nutzungsrechtes2
	 */
	public Set<Nutzungsrechte> getNutzungsrechtes2() {
		return nutzungsrechtes2;
	}

	/**
	 * @param nutzungsrechtes2
	 *            the nutzungsrechtes2 to set
	 */
	public void setNutzungsrechtes2(Set<Nutzungsrechte> nutzungsrechtes2) {
		this.nutzungsrechtes2 = nutzungsrechtes2;
	}

	/**
	 * @return the distributorFrames
	 */
	public Set<DistributorFrame> getDistributorFrames() {
		return distributorFrames;
	}

	/**
	 * @param distributorFrames
	 *            the distributorFrames to set
	 */
	public void setDistributorFrames(Set<DistributorFrame> distributorFrames) {
		this.distributorFrames = distributorFrames;
	}

	/**
	 * @return the wahlstufes
	 */
	public Set<Wahlstufe> getWahlstufes() {
		return wahlstufes;
	}

	/**
	 * @param wahlstufes
	 *            the wahlstufes to set
	 */
	public void setWahlstufes(Set<Wahlstufe> wahlstufes) {
		this.wahlstufes = wahlstufes;
	}

	/**
	 * @return the contractLinks
	 */
	public Set<ContractLink> getContractLinks() {
		return contractLinks;
	}

	/**
	 * @param contractLinks
	 *            the contractLinks to set
	 */
	public void setContractLinks(Set<ContractLink> contractLinks) {
		this.contractLinks = contractLinks;
	}

	/**
	 * @return the contractLinks2
	 */
	public Set<ContractLink> getContractLinks2() {
		return contractLinks2;
	}

	/**
	 * @param contractLinks2
	 *            the contractLinks2 to set
	 */
	public void setContractLinks2(Set<ContractLink> contractLinks2) {
		this.contractLinks2 = contractLinks2;
	}

	/**
	 * @return the circuits3
	 */
	public Set<Circuit> getCircuits3() {
		return circuits3;
	}

	/**
	 * @param circuits3
	 *            the circuits3 to set
	 */
	public void setCircuits3(Set<Circuit> circuits3) {
		this.circuits3 = circuits3;
	}

}
