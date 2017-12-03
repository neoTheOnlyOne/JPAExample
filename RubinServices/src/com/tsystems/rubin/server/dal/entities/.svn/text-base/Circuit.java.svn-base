package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;

@NamedQueries( {
		@NamedQuery(name = NamedQueryConstants.CIRCUIT_FINDCIRCUITFORSNO, query = "Select c.sno"
				+ " from Circuit c where c.terminalA.id =?1 and c.terminalB.id = ?2 and c.lsc.id = ?3 and c.sno BETWEEN ?4 and ?5 order by c.sno"),
		@NamedQuery(name = NamedQueryConstants.CIRCUIT_FINDCIRCUITFORSNOC, query = "Select c.sno"
				+ " from Circuit c JOIN c.terminalA t1 JOIN t1.site s1 JOIN s1.city c1 JOIN c.terminalB t2 JOIN t2.site s2 JOIN s2.city c2"
				+ " where c.terminalA.id =?1 and c.terminalB.id = ?2 and c.lsc.id = ?3 and c1.id = s1.city.id and c2.id = s2.city.id and c.sno BETWEEN ?4 and ?5 order by c.sno"),
		@NamedQuery(name = NamedQueryConstants.CIRCUIT_FINDSNOFORCIRCUIT, query = "Select c.sno"
				+ " from Circuit c where c.terminalA.id =?1 and c.terminalB.id = ?2 and c.lsc.id = ?3 order by c.sno"),
		@NamedQuery(name = NamedQueryConstants.CIRCUIT_FINDSNOFORCIRCUITC, query = "Select c.sno"
				+ " from Circuit c JOIN c.terminalA t1 JOIN t1.site s1 JOIN s1.city c1 JOIN c.terminalB t2 JOIN t2.site s2 JOIN s2.city c2"
				+ " where c.terminalA.id =?1 and c.terminalB.id = ?2 and c.lsc.id = ?3 and c1.id = s1.city.id and c2.id = s2.city.id order by c.sno"),
		@NamedQuery(name = NamedQueryConstants.CIRCUIT_FINDBYTGNNMSID, query = "Select c from Circuit c JOIN c.company co JOIN co.transPermissions tp where trim(both from c.tgnNmsId) like ?1 and tp.disSecurity = 'Y' and tp.user.id =?2"),
		@NamedQuery(name = NamedQueryConstants.CIRCUIT_FIND_DEFAULTWEBADDRESSOFCIRCUIT, query = "Select c.basedataUrl from Circuit c where c.id = ?1"),
		@NamedQuery(name = NamedQueryConstants.CIRCUIT_FINDCIRCUITBYCARRIER, query = "Select c from Circuit c JOIN c.company co JOIN co.transPermissions tp where c.carrier.id = ?1 and tp.disSecurity = 'Y' and tp.user.id = ?2"),
		@NamedQuery(name = NamedQueryConstants.CIRCUIT_FINDCIRCUITBYCARRIERANDNETWORK, query = "Select c from Circuit c JOIN c.company co JOIN co.transPermissions tp where c.carrier.id = ?1 and c.network.id = ?2 and tp.disSecurity = 'Y' and tp.user.id = ?3"),
		@NamedQuery(name = NamedQueryConstants.CIRCUIT_FINDCIRCUITBYCARRIERANDPATH, query = "Select c from Circuit c JOIN c.company co JOIN co.transPermissions tp where c.carrier.id = ?1 and c.way2.id = ?2 and tp.disSecurity = 'Y' and tp.user.id = ?3"),
		@NamedQuery(name = NamedQueryConstants.CIRCUIT_FINDCIRCUITBYCARRIERANDNETWORKANDPATH, query = "Select c from Circuit c JOIN c.company co JOIN co.transPermissions tp where c.carrier.id = ?1 and c.network.id = ?2 and c.way2.id = ?3 and tp.disSecurity = 'Y' and tp.user.id = ?4"),
		@NamedQuery(name = NamedQueryConstants.CIRCUIT_FINDCIRCUITBYTERMINALNAME, query = "Select c from Circuit c JOIN c.terminals t JOIN t.customerTerminals ct JOIN c.company co JOIN co.transPermissions tp where trim(both from ct.nameSearch) like ?1 and tp.disSecurity = 'Y' and tp.user.id = ?2"),
		@NamedQuery(name = NamedQueryConstants.CIRCUIT_FINDCIRCUITBYENDCUSTOMERNAME, query = "Select c from Circuit c JOIN c.endCustomers ec JOIN c.company co JOIN co.transPermissions tp where trim(both from ec.nameSearch) like ?1 and tp.disSecurity = 'Y' and tp.user.id = ?2"),
		@NamedQuery(name = NamedQueryConstants.CIRCUIT_FINDCIRCUITBYENDCUSTOMERNETWORK, query = "Select c from Circuit c JOIN c.endCustomers ec JOIN c.company co JOIN co.transPermissions tp where trim(both from ec.network) like ?1 and tp.disSecurity = 'Y' and tp.user.id = ?2"), 
		@NamedQuery(name = NamedQueryConstants.CIRCUIT_FIND_CIRCUIT_BYID, query = "Select new com.tsystems.rubin.server.dal.dvo.CircuitDVO" + 
				Circuit.COMMON_PICKLIST_FIELDS_STRING + " from Circuit c where c.id = ?1"),
		@NamedQuery(name = NamedQueryConstants.CIRCUIT_FIND_LSZ_BYCIRCUITID, query = "Select c.lsc.code from Circuit c where c.id = ?1")
				})
@Entity
@Table(name = "TRANSPORTVERBINDUN")
public class Circuit implements Serializable {
	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(c.id," +
			                                            " c.lsc.code, " +
			                                            " c.sno, " +
			                                            " c.additionalLetter, " +
			                                            " c.identifyLetter.identifyLetterId, " +
			                                            " c.lscExtension.lscExtensionId, " +
			                                            " c.terminalA.site.designationNational, " +
			                                            " c.terminalA.ituSuffix, " +
			                                            " c.terminalB.site.designationNational, " +
			                                            " c.terminalB.ituSuffix, " +
			                                            " c.tgnNmsId, " +
			                                            " c.status)";
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Transportverbindun")
	@SequenceGenerator(name = "Transportverbindun", sequenceName = "TRANSPORTVERBINDUN_SEQUENCE", allocationSize = 1)
	@Column(name = "OID_TRANSPORTVERBI")
	private Long id;

	@Column(name = "QUALITAET")
	private String quality;

	@Column(name = "SIMPLEX_DUPLEX")
	private String simplexDuplex;

	@Column(name = "SIGNALISIERUNG")
	private String signalling;

	@Column(name = "ORTSANBINDUNG")
	private Long connectionType;

	@Column(name = "ENTSTOERUNG_24STUN")
	private String reconstruct24h;

	@Column(name = "TGN_NMS_ID")
	private String tgnNmsId;

	@Column(name = "NATIONALE_BIS")
	private String nationaleBis;

	@Column(name = "AUFHEBUNG_SOLL")
	private Date disconnectionDate;

	@Column(name = "BEARBEITER")
	private String user;

	@Column(name = "EINSTUFUNG")
	private String level;

	@Column(name = "INTERNATIONALE_ORD")
	private Long internationalSno;

	@Column(name = "INTERNATIONALER_FU")
	private String internationalFunctionCode;

	@Column(name = "LETZTE_AKTUALISIER")
	private Date lastUpdate;

	@Column(name = "NEUSCHALTUNG")
	private Date establishDate;

	@Column(name = "NEUSCHALTUNG_STATU")
	private String status;

	@Column(name = "TRANS_ORDNUNGSNUMM")
	private Long sno;

	@Column(name = "TRANSPORTVERBINDUN")
	private String consistencies;

	@Column(name = "TRANSPORTVERBINDU0")
	private String remark;

	@Column(name = "UMSCHALTUNG_IST")
	private Date cutOverDate;

	@Column(name = "WEG")
	private Long way;

	@Column(name = "ZEITLEITUNG")
	private String temporary;

	@Column(name = "ZUSATZBUCHSTABE")
	private String additionalLetter;

	@Column(name = "LEITUNGSKAPAZITAET")
	private String capacity;

	@Column(name = "FIKTIVE_BUCHUNG")
	private String fictionalOrder;

	@Column(name = "ECHOKOMP")
	private String echoCancellation;

	@Column(name = "IPSTN_VERKEHR")
	private String ipstnTraffic;

	@Column(name = "IML_VERKEHR")
	private String imlTraffic;

	@Column(name = "PROCESS_TYPE")
	private String processType;

	@Column(name = "DELAY")
	private String delay;

	@Column(name = "CREATED_ON")
	private Date createdOn;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CIRCUITCAC")
	private String cacLucent;

	@Column(name = "CIRCUITCAC_ECI")
	private String cacEci;

	@Column(name = "TV_RESTORATION")
	private String tvRestoration;

	@Column(name = "HISTORY_STATUS")
	private String historyStatus;

	@Column(name = "HISTORY_DATE")
	private Date historyDate;

	@Column(name = "DELAY_MAIN_MS")
	private BigDecimal delayMainMs;

	@Column(name = "DELAY_XWAY_MS")
	private BigDecimal delayXwayMs;

	@Column(name = "EXCLUDE_VILOLATION")
	private String excludeVilolation;

	@Column(name = "BASEDATA_URL")
	private String basedataUrl;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_LSZOID_LSZ")
	private Lsc lsc;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_CARRIEROID_CARRIER")
	private Carrier carrier;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_CUSTOMEROID_CUS")
	private Customer customer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_DIENSTOID_DIENS")
	private Service service;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_ENDPUNKTOID_END")
	private Terminal terminalA;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK0ENDPUNKTOID_END")
	private Terminal terminalB;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_KENNBUCHSTABOID")
	private IdentifyLetter identifyLetter;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_LSZ_EXTENSIOOID_EXTENSION")
	private LscExtension lscExtension;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_NETZWERKOID")
	private Network network;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_OMS_ORDEROID_OMS_ORDER")
	private OmsOrder omsOrder;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_SUBNETWORKOID_S")
	private Subnetwork subnetwork;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_TRANSPORTVEROID")
	private Circuit circuit;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_WEGOID")
	private Way way2;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_COMPANYOID_COMPANY")
	private Company company;

	@OneToMany(mappedBy = "circuit")
	private Set<CircuitAccessCode> circuitAccessCodes;

	@OneToMany(mappedBy = "circuit")
	private Set<FaultRecord> faultRecords;

	@OneToMany(mappedBy = "circuit")
	private Set<TransitionUnitPoint> transitionUnitPoints;

	@OneToMany(mappedBy = "circuit")
	private Set<Port> ports;

	@OneToMany(mappedBy = "circuit")
	private Set<History> histories;

	@OneToMany(mappedBy = "circuit")
	private Set<SlaIndividual> slaIndividuals;

	@OneToMany(mappedBy = "circuit")
	private Set<ParameterXTv> parameterXTvs;

	@OneToMany(mappedBy = "circuit")
	private Set<EndCustomer> endCustomers;

	@OneToMany(mappedBy = "circuit")
	private Set<FaultHistory> faultHistories;

	@OneToMany(mappedBy = "circuit")
	private Set<Configuration> configurations;

	@OneToMany(mappedBy = "circuit")
	private Set<Routing> routings;

	@OneToMany(mappedBy = "circuit")
	private Set<CWO> cwos;

	@OneToMany(mappedBy = "circuit")
	private Set<StructuredInformation> structuredInformations;

	@OneToMany(mappedBy = "circuit")
	private Set<LruCircuit> lruCircuits;

	@OneToMany(mappedBy = "circuit")
	private Set<Circuit> circuits;

	@OneToMany(mappedBy = "circuit")
	private Set<AliasDescription> aliasDescriptions;

	@ManyToMany(mappedBy = "circuits3")
	private Set<Terminal> terminals;

	@ManyToMany(mappedBy = "circuits")
	private Set<Equipment> equipments;

	@ManyToMany(mappedBy = "circuits")
	private Set<Property> properties;

	@ManyToMany(mappedBy = "circuits2")
	private Set<Subnetwork> subnetworks;

	@ManyToMany(mappedBy = "circuits")
	private Set<FaultRecord> faultRecords2;

	private static final long serialVersionUID = 1L;

	public Circuit() {
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
	 * @return the quality
	 */
	public String getQuality() {
		return quality;
	}

	/**
	 * @param quality
	 *            the quality to set
	 */
	public void setQuality(String quality) {
		this.quality = quality;
	}

	/**
	 * @return the simplexDuplex
	 */
	public String getSimplexDuplex() {
		return simplexDuplex;
	}

	/**
	 * @param simplexDuplex
	 *            the simplexDuplex to set
	 */
	public void setSimplexDuplex(String simplexDuplex) {
		this.simplexDuplex = simplexDuplex;
	}

	/**
	 * @return the signalling
	 */
	public String getSignalling() {
		return signalling;
	}

	/**
	 * @param signalling
	 *            the signalling to set
	 */
	public void setSignalling(String signalling) {
		this.signalling = signalling;
	}

	/**
	 * @return the connectionType
	 */
	public Long getConnectionType() {
		return connectionType;
	}

	/**
	 * @param connectionType
	 *            the connectionType to set
	 */
	public void setConnectionType(Long connectionType) {
		this.connectionType = connectionType;
	}

	/**
	 * @return the reconstruct24h
	 */
	public String getReconstruct24h() {
		return reconstruct24h;
	}

	/**
	 * @param reconstruct24h
	 *            the reconstruct24h to set
	 */
	public void setReconstruct24h(String reconstruct24h) {
		this.reconstruct24h = reconstruct24h;
	}

	/**
	 * @return the tgnNmsId
	 */
	public String getTgnNmsId() {
		return tgnNmsId;
	}

	/**
	 * @param tgnNmsId
	 *            the tgnNmsId to set
	 */
	public void setTgnNmsId(String tgnNmsId) {
		this.tgnNmsId = tgnNmsId;
	}

	/**
	 * @return the nationaleBis
	 */
	public String getNationaleBis() {
		return nationaleBis;
	}

	/**
	 * @param nationaleBis
	 *            the nationaleBis to set
	 */
	public void setNationaleBis(String nationaleBis) {
		this.nationaleBis = nationaleBis;
	}

	/**
	 * @return the disconnectionDate
	 */
	public Date getDisconnectionDate() {
		return disconnectionDate;
	}

	/**
	 * @param disconnectionDate
	 *            the disconnectionDate to set
	 */
	public void setDisconnectionDate(Date disconnectionDate) {
		this.disconnectionDate = disconnectionDate;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * @return the internationalSno
	 */
	public Long getInternationalSno() {
		return internationalSno;
	}

	/**
	 * @param internationalSno
	 *            the internationalSno to set
	 */
	public void setInternationalSno(Long internationalSno) {
		this.internationalSno = internationalSno;
	}

	/**
	 * @return the internationalFunctionCode
	 */
	public String getInternationalFunctionCode() {
		return internationalFunctionCode;
	}

	/**
	 * @param internationalFunctionCode
	 *            the internationalFunctionCode to set
	 */
	public void setInternationalFunctionCode(String internationalFunctionCode) {
		this.internationalFunctionCode = internationalFunctionCode;
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
	 * @return the establishDate
	 */
	public Date getEstablishDate() {
		return establishDate;
	}

	/**
	 * @param establishDate
	 *            the establishDate to set
	 */
	public void setEstablishDate(Date establishDate) {
		this.establishDate = establishDate;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the sno
	 */
	public Long getSno() {
		return sno;
	}

	/**
	 * @param sno
	 *            the sno to set
	 */
	public void setSno(Long sno) {
		this.sno = sno;
	}

	/**
	 * @return the consistencies
	 */
	public String getConsistencies() {
		return consistencies;
	}

	/**
	 * @param consistencies
	 *            the consistencies to set
	 */
	public void setConsistencies(String consistencies) {
		this.consistencies = consistencies;
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
	 * @return the cutOverDate
	 */
	public Date getCutOverDate() {
		return cutOverDate;
	}

	/**
	 * @param cutOverDate
	 *            the cutOverDate to set
	 */
	public void setCutOverDate(Date cutOverDate) {
		this.cutOverDate = cutOverDate;
	}

	/**
	 * @return the way
	 */
	public Long getWay() {
		return way;
	}

	/**
	 * @param way
	 *            the way to set
	 */
	public void setWay(Long way) {
		this.way = way;
	}

	/**
	 * @return the temporary
	 */
	public String getTemporary() {
		return temporary;
	}

	/**
	 * @param temporary
	 *            the temporary to set
	 */
	public void setTemporary(String temporary) {
		this.temporary = temporary;
	}

	/**
	 * @return the additionalLetter
	 */
	public String getAdditionalLetter() {
		return additionalLetter;
	}

	/**
	 * @param additionalLetter
	 *            the additionalLetter to set
	 */
	public void setAdditionalLetter(String additionalLetter) {
		this.additionalLetter = additionalLetter;
	}

	/**
	 * @return the capacity
	 */
	public String getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity
	 *            the capacity to set
	 */
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the fictionalOrder
	 */
	public String getFictionalOrder() {
		return fictionalOrder;
	}

	/**
	 * @param fictionalOrder
	 *            the fictionalOrder to set
	 */
	public void setFictionalOrder(String fictionalOrder) {
		this.fictionalOrder = fictionalOrder;
	}

	/**
	 * @return the echoCancellation
	 */
	public String getEchoCancellation() {
		return echoCancellation;
	}

	/**
	 * @param echoCancellation
	 *            the echoCancellation to set
	 */
	public void setEchoCancellation(String echoCancellation) {
		this.echoCancellation = echoCancellation;
	}

	/**
	 * @return the ipstnTraffic
	 */
	public String getIpstnTraffic() {
		return ipstnTraffic;
	}

	/**
	 * @param ipstnTraffic
	 *            the ipstnTraffic to set
	 */
	public void setIpstnTraffic(String ipstnTraffic) {
		this.ipstnTraffic = ipstnTraffic;
	}

	/**
	 * @return the imlTraffic
	 */
	public String getImlTraffic() {
		return imlTraffic;
	}

	/**
	 * @param imlTraffic
	 *            the imlTraffic to set
	 */
	public void setImlTraffic(String imlTraffic) {
		this.imlTraffic = imlTraffic;
	}

	/**
	 * @return the processType
	 */
	public String getProcessType() {
		return processType;
	}

	/**
	 * @param processType
	 *            the processType to set
	 */
	public void setProcessType(String processType) {
		this.processType = processType;
	}

	/**
	 * @return the delay
	 */
	public String getDelay() {
		return delay;
	}

	/**
	 * @param delay
	 *            the delay to set
	 */
	public void setDelay(String delay) {
		this.delay = delay;
	}

	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return createdOn;
	}

	/**
	 * @param createdOn
	 *            the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the cacLucent
	 */
	public String getCacLucent() {
		return cacLucent;
	}

	/**
	 * @param cacLucent
	 *            the cacLucent to set
	 */
	public void setCacLucent(String cacLucent) {
		this.cacLucent = cacLucent;
	}

	/**
	 * @return the cacEci
	 */
	public String getCacEci() {
		return cacEci;
	}

	/**
	 * @param cacEci
	 *            the cacEci to set
	 */
	public void setCacEci(String cacEci) {
		this.cacEci = cacEci;
	}

	/**
	 * @return the tvRestoration
	 */
	public String getTvRestoration() {
		return tvRestoration;
	}

	/**
	 * @param tvRestoration
	 *            the tvRestoration to set
	 */
	public void setTvRestoration(String tvRestoration) {
		this.tvRestoration = tvRestoration;
	}

	/**
	 * @return the historyStatus
	 */
	public String getHistoryStatus() {
		return historyStatus;
	}

	/**
	 * @param historyStatus
	 *            the historyStatus to set
	 */
	public void setHistoryStatus(String historyStatus) {
		this.historyStatus = historyStatus;
	}

	/**
	 * @return the historyDate
	 */
	public Date getHistoryDate() {
		return historyDate;
	}

	/**
	 * @param historyDate
	 *            the historyDate to set
	 */
	public void setHistoryDate(Date historyDate) {
		this.historyDate = historyDate;
	}

	/**
	 * @return the delayMainMs
	 */
	public BigDecimal getDelayMainMs() {
		return delayMainMs;
	}

	/**
	 * @param delayMainMs
	 *            the delayMainMs to set
	 */
	public void setDelayMainMs(BigDecimal delayMainMs) {
		this.delayMainMs = delayMainMs;
	}

	/**
	 * @return the delayXwayMs
	 */
	public BigDecimal getDelayXwayMs() {
		return delayXwayMs;
	}

	/**
	 * @param delayXwayMs
	 *            the delayXwayMs to set
	 */
	public void setDelayXwayMs(BigDecimal delayXwayMs) {
		this.delayXwayMs = delayXwayMs;
	}

	/**
	 * @return the excludeVilolation
	 */
	public String getExcludeVilolation() {
		return excludeVilolation;
	}

	/**
	 * @param excludeVilolation
	 *            the excludeVilolation to set
	 */
	public void setExcludeVilolation(String excludeVilolation) {
		this.excludeVilolation = excludeVilolation;
	}

	/**
	 * @return the basedataUrl
	 */
	public String getBasedataUrl() {
		return basedataUrl;
	}

	/**
	 * @param basedataUrl
	 *            the basedataUrl to set
	 */
	public void setBasedataUrl(String basedataUrl) {
		this.basedataUrl = basedataUrl;
	}

	/**
	 * @return the lsc
	 */
	public Lsc getLsc() {
		return lsc;
	}

	/**
	 * @param lsc
	 *            the lsc to set
	 */
	public void setLsc(Lsc lsc) {
		this.lsc = lsc;
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
	 * @return the service
	 */
	public Service getService() {
		return service;
	}

	/**
	 * @param service
	 *            the service to set
	 */
	public void setService(Service service) {
		this.service = service;
	}

	/**
	 * @return the terminalA
	 */
	public Terminal getTerminalA() {
		return terminalA;
	}

	/**
	 * @param terminalA
	 *            the terminalA to set
	 */
	public void setTerminalA(Terminal terminalA) {
		this.terminalA = terminalA;
	}

	/**
	 * @return the terminalB
	 */
	public Terminal getTerminalB() {
		return terminalB;
	}

	/**
	 * @param terminalB
	 *            the terminalB to set
	 */
	public void setTerminalB(Terminal terminalB) {
		this.terminalB = terminalB;
	}

	/**
	 * @return the identifyLetter
	 */
	public IdentifyLetter getIdentifyLetter() {
		return identifyLetter;
	}

	/**
	 * @param identifyLetter
	 *            the identifyLetter to set
	 */
	public void setIdentifyLetter(IdentifyLetter identifyLetter) {
		this.identifyLetter = identifyLetter;
	}

	/**
	 * @return the lscExtension
	 */
	public LscExtension getLscExtension() {
		return lscExtension;
	}

	/**
	 * @param lscExtension
	 *            the lscExtension to set
	 */
	public void setLscExtension(LscExtension lscExtension) {
		this.lscExtension = lscExtension;
	}

	/**
	 * @return the network
	 */
	public Network getNetwork() {
		return network;
	}

	/**
	 * @param network
	 *            the network to set
	 */
	public void setNetwork(Network network) {
		this.network = network;
	}

	/**
	 * @return the omsOrder
	 */
	public OmsOrder getOmsOrder() {
		return omsOrder;
	}

	/**
	 * @param omsOrder
	 *            the omsOrder to set
	 */
	public void setOmsOrder(OmsOrder omsOrder) {
		this.omsOrder = omsOrder;
	}

	/**
	 * @return the subnetwork
	 */
	public Subnetwork getSubnetwork() {
		return subnetwork;
	}

	/**
	 * @param subnetwork
	 *            the subnetwork to set
	 */
	public void setSubnetwork(Subnetwork subnetwork) {
		this.subnetwork = subnetwork;
	}

	/**
	 * @return the circuit
	 */
	public Circuit getCircuit() {
		return circuit;
	}

	/**
	 * @param circuit
	 *            the circuit to set
	 */
	public void setCircuit(Circuit circuit) {
		this.circuit = circuit;
	}

	/**
	 * @return the way2
	 */
	public Way getWay2() {
		return way2;
	}

	/**
	 * @param way2
	 *            the way2 to set
	 */
	public void setWay2(Way way2) {
		this.way2 = way2;
	}

	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * @return the circuitAccessCodes
	 */
	public Set<CircuitAccessCode> getCircuitAccessCodes() {
		return circuitAccessCodes;
	}

	/**
	 * @param circuitAccessCodes
	 *            the circuitAccessCodes to set
	 */
	public void setCircuitAccessCodes(Set<CircuitAccessCode> circuitAccessCodes) {
		this.circuitAccessCodes = circuitAccessCodes;
	}

	/**
	 * @return the faultRecords
	 */
	public Set<FaultRecord> getFaultRecords() {
		return faultRecords;
	}

	/**
	 * @param faultRecords
	 *            the faultRecords to set
	 */
	public void setFaultRecords(Set<FaultRecord> faultRecords) {
		this.faultRecords = faultRecords;
	}

	/**
	 * @return the transitionUnitPoints
	 */
	public Set<TransitionUnitPoint> getTransitionUnitPoints() {
		return transitionUnitPoints;
	}

	/**
	 * @param transitionUnitPoints
	 *            the transitionUnitPoints to set
	 */
	public void setTransitionUnitPoints(
			Set<TransitionUnitPoint> transitionUnitPoints) {
		this.transitionUnitPoints = transitionUnitPoints;
	}

	/**
	 * @return the ports
	 */
	public Set<Port> getPorts() {
		return ports;
	}

	/**
	 * @param ports
	 *            the ports to set
	 */
	public void setPorts(Set<Port> ports) {
		this.ports = ports;
	}

	/**
	 * @return the histories
	 */
	public Set<History> getHistories() {
		return histories;
	}

	/**
	 * @param histories
	 *            the histories to set
	 */
	public void setHistories(Set<History> histories) {
		this.histories = histories;
	}

	/**
	 * @return the slaIndividuals
	 */
	public Set<SlaIndividual> getSlaIndividuals() {
		return slaIndividuals;
	}

	/**
	 * @param slaIndividuals
	 *            the slaIndividuals to set
	 */
	public void setSlaIndividuals(Set<SlaIndividual> slaIndividuals) {
		this.slaIndividuals = slaIndividuals;
	}

	/**
	 * @return the parameterXTvs
	 */
	public Set<ParameterXTv> getParameterXTvs() {
		return parameterXTvs;
	}

	/**
	 * @param parameterXTvs
	 *            the parameterXTvs to set
	 */
	public void setParameterXTvs(Set<ParameterXTv> parameterXTvs) {
		this.parameterXTvs = parameterXTvs;
	}

	/**
	 * @return the endCustomers
	 */
	public Set<EndCustomer> getEndCustomers() {
		return endCustomers;
	}

	/**
	 * @param endCustomers
	 *            the endCustomers to set
	 */
	public void setEndCustomers(Set<EndCustomer> endCustomers) {
		this.endCustomers = endCustomers;
	}

	/**
	 * @return the faultHistories
	 */
	public Set<FaultHistory> getFaultHistories() {
		return faultHistories;
	}

	/**
	 * @param faultHistories
	 *            the faultHistories to set
	 */
	public void setFaultHistories(Set<FaultHistory> faultHistories) {
		this.faultHistories = faultHistories;
	}

	/**
	 * @return the configurations
	 */
	public Set<Configuration> getConfigurations() {
		return configurations;
	}

	/**
	 * @param configurations
	 *            the configurations to set
	 */
	public void setConfigurations(Set<Configuration> configurations) {
		this.configurations = configurations;
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
	 * @return the cwos
	 */
	public Set<CWO> getCwos() {
		return cwos;
	}

	/**
	 * @param cwos
	 *            the cwos to set
	 */
	public void setCwos(Set<CWO> cwos) {
		this.cwos = cwos;
	}

	/**
	 * @return the structuredInformations
	 */
	public Set<StructuredInformation> getStructuredInformations() {
		return structuredInformations;
	}

	/**
	 * @param structuredInformations
	 *            the structuredInformations to set
	 */
	public void setStructuredInformations(
			Set<StructuredInformation> structuredInformations) {
		this.structuredInformations = structuredInformations;
	}

	/**
	 * @return the lruCircuits
	 */
	public Set<LruCircuit> getLruCircuits() {
		return lruCircuits;
	}

	/**
	 * @param lruCircuits
	 *            the lruCircuits to set
	 */
	public void setLruCircuits(Set<LruCircuit> lruCircuits) {
		this.lruCircuits = lruCircuits;
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
	 * @return the aliasDescriptions
	 */
	public Set<AliasDescription> getAliasDescriptions() {
		return aliasDescriptions;
	}

	/**
	 * @param aliasDescriptions
	 *            the aliasDescriptions to set
	 */
	public void setAliasDescriptions(Set<AliasDescription> aliasDescriptions) {
		this.aliasDescriptions = aliasDescriptions;
	}

	/**
	 * @return the terminals
	 */
	public Set<Terminal> getTerminals() {
		return terminals;
	}

	/**
	 * @param terminals
	 *            the terminals to set
	 */
	public void setTerminals(Set<Terminal> terminals) {
		this.terminals = terminals;
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
	 * @return the properties
	 */
	public Set<Property> getProperties() {
		return properties;
	}

	/**
	 * @param properties
	 *            the properties to set
	 */
	public void setProperties(Set<Property> properties) {
		properties = properties;
	}

	/**
	 * @return the subnetworks
	 */
	public Set<Subnetwork> getSubnetworks() {
		return subnetworks;
	}

	/**
	 * @param subnetworks
	 *            the subnetworks to set
	 */
	public void setSubnetworks(Set<Subnetwork> subnetworks) {
		this.subnetworks = subnetworks;
	}

	/**
	 * @return the faultRecords2
	 */
	public Set<FaultRecord> getFaultRecords2() {
		return faultRecords2;
	}

	/**
	 * @param faultRecords2
	 *            the faultRecords2 to set
	 */
	public void setFaultRecords2(Set<FaultRecord> faultRecords2) {
		this.faultRecords2 = faultRecords2;
	}

}