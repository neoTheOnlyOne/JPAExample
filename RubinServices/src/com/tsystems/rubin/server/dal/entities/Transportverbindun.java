package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;
import com.tsystems.rubin.server.dal.entities.Cac;
import com.tsystems.rubin.server.dal.entities.Carrier;
import com.tsystems.rubin.server.dal.entities.Company;
import com.tsystems.rubin.server.dal.entities.Customer;
import com.tsystems.rubin.server.dal.entities.EndCustomer;
import com.tsystems.rubin.server.dal.entities.FaultRecord;
import com.tsystems.rubin.server.dal.entities.Fuehrung;
import com.tsystems.rubin.server.dal.entities.History;
import com.tsystems.rubin.server.dal.entities.Konfiguration;
import com.tsystems.rubin.server.dal.entities.LszExtension;
import com.tsystems.rubin.server.dal.entities.Netzwerk;
import com.tsystems.rubin.server.dal.entities.OmsOrder;
import com.tsystems.rubin.server.dal.entities.ParameterXTv;
import com.tsystems.rubin.server.dal.entities.Port;
import com.tsystems.rubin.server.dal.entities.Schaltauftrag;
import com.tsystems.rubin.server.dal.entities.SlaIndividuell;
import com.tsystems.rubin.server.dal.entities.StructInfo;
import com.tsystems.rubin.server.dal.entities.Subnetwork;
import com.tsystems.rubin.server.dal.entities.TransitionUnitPoint;
import com.tsystems.rubin.server.dal.entities.Weg;

@NamedQueries( {
		@NamedQuery(name = NamedQueryConstants.TRANSPORTVERBINDUN_FINDCIRCUITFORSNO, query = "Select t.transOrdnungsnumm"
				+ " from Transportverbindun t where t.fkEndpunktoidEnd.id =?1 and t.fk0endpunktoidEnd.id = ?2 and t.fkLszoidLsz.id = ?3 and t.transOrdnungsnumm BETWEEN ?4 and ?5 order by t.transOrdnungsnumm"),
		@NamedQuery(name = NamedQueryConstants.TRANSPORTVERBINDUN_FINDCIRCUITFORSNOC, query = "Select t.transOrdnungsnumm"
				+ " from Transportverbindun t JOIN t.fkEndpunktoidEnd e1 JOIN e1.site s1 JOIN s1.city c1 JOIN t.fk0endpunktoidEnd e2 JOIN e2.site s2 JOIN s2.city c2"
				+ " where t.fkEndpunktoidEnd.id =?1 and t.fk0endpunktoidEnd.id = ?2 and t.fkLszoidLsz.id = ?3 and c1.id = s1.city.id and c2.id = s2.city.id and t.transOrdnungsnumm BETWEEN ?4 and ?5 order by t.transOrdnungsnumm"),
		@NamedQuery(name = NamedQueryConstants.TRANSPORTVERBINDUN_FINDSNOFORCIRCUIT, query = "Select t.transOrdnungsnumm"
				+ " from Transportverbindun t where t.fkEndpunktoidEnd.id =?1 and t.fk0endpunktoidEnd.id = ?2 and t.fkLszoidLsz.id = ?3 order by t.transOrdnungsnumm"),
		@NamedQuery(name = NamedQueryConstants.TRANSPORTVERBINDUN_FINDSNOFORCIRCUITC, query = "Select t.transOrdnungsnumm"
				+ " from Transportverbindun t JOIN t.fkEndpunktoidEnd e1 JOIN e1.site s1 JOIN s1.city c1 JOIN t.fk0endpunktoidEnd e2 JOIN e2.site s2 JOIN s2.city c2"
				+ " where t.fkEndpunktoidEnd.id =?1 and t.fk0endpunktoidEnd.id = ?2 and t.fkLszoidLsz.id = ?3 and c1.id = s1.city.id and c2.id = s2.city.id order by t.transOrdnungsnumm"),
		@NamedQuery(name = NamedQueryConstants.CIRCUIT_FINDBYTGNNMSID, query = "Select t from Transportverbindun t JOIN t.fkCompanyoidCompany c JOIN c.transPermissionCollection tp where t.tgnNmsId = ?1 and tp.disSecurity = 'Y' and tp.fkBearbeiterSzertifikatsnumm.id =?2"),
		@NamedQuery(name = NamedQueryConstants.FIND_DEFAULTWEBADDRESSOFCIRCUIT, query = "Select t.basedataUrl from Transportverbindun t where t.oidTransportverbi = ?1"),
		@NamedQuery(name = NamedQueryConstants.TRANSPORTVERBINDUN_FINDCIRCUITBYCARRIER, query = "Select t from Transportverbindun t JOIN t.fkCompanyoidCompany c JOIN c.transPermissionCollection tp where t.fkCarrieroidCarrier.id = ?1 and tp.disSecurity = 'Y' and tp.fkBearbeiterSzertifikatsnumm.id = ?2"),
		@NamedQuery(name = NamedQueryConstants.TRANSPORTVERBINDUN_FINDCIRCUITBYCARRIERANDNETWORK, query = "Select t from Transportverbindun t JOIN t.fkCompanyoidCompany c JOIN c.transPermissionCollection tp where t.fkCarrieroidCarrier.id = ?1 and trim(t.fkNetzwerkoid.name) like ?2 and tp.disSecurity = 'Y' and tp.fkBearbeiterSzertifikatsnumm.id = ?3"),
		@NamedQuery(name = NamedQueryConstants.TRANSPORTVERBINDUN_FINDCIRCUITBYCARRIERANDPATH, query = "Select t from Transportverbindun t JOIN t.fkCompanyoidCompany c JOIN c.transPermissionCollection tp where t.fkCarrieroidCarrier.id = ?1 and trim(t.fkWegoid.name) like ?2 and tp.disSecurity = 'Y' and tp.fkBearbeiterSzertifikatsnumm.id = ?3"),
		@NamedQuery(name = NamedQueryConstants.TRANSPORTVERBINDUN_FINDCIRCUITBYCARRIERANDNETWORKANDPATH, query = "Select t from Transportverbindun t JOIN t.fkCompanyoidCompany c JOIN c.transPermissionCollection tp where t.fkCarrieroidCarrier.id = ?1 and trim(t.fkNetzwerkoid.name) like ?2 and trim(t.fkWegoid.name) like ?3 and tp.disSecurity = 'Y' and tp.fkBearbeiterSzertifikatsnumm.id = ?4"),
		@NamedQuery(name = NamedQueryConstants.TRANSPORTVERBINDUN_FINDCIRCUITBYTERMINALNAME, query = "Select t from Transportverbindun t JOIN t.endpunktCollection h JOIN h.customerTerminals ct JOIN t.fkCompanyoidCompany c JOIN c.transPermissionCollection tp where trim(ct.nameSearch) like ?1 and tp.disSecurity = 'Y' and tp.fkBearbeiterSzertifikatsnumm.id = ?2"),
		@NamedQuery(name = NamedQueryConstants.TRANSPORTVERBINDUN_FINDCIRCUITBYENDCUSTOMERNAME, query = "Select t from Transportverbindun t JOIN t.endCustomerCollection ec JOIN t.fkCompanyoidCompany c JOIN c.transPermissionCollection tp where trim(ec.endCustomernameSuchBsi) like ?1 and tp.disSecurity = 'Y' and tp.fkBearbeiterSzertifikatsnumm.id = ?2"),
		@NamedQuery(name = NamedQueryConstants.TRANSPORTVERBINDUN_FINDCIRCUITBYENDCUSTOMERNETWORK, query = "Select t from Transportverbindun t JOIN t.endCustomerCollection ec JOIN t.fkCompanyoidCompany c JOIN c.transPermissionCollection tp where trim(ec.endCustomernetwork) like ?1 and tp.disSecurity = 'Y' and tp.fkBearbeiterSzertifikatsnumm.id = ?2") })
@Entity
public class Transportverbindun implements Serializable {

	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(t.oidTransportverbi, s.oidStructInfo, s.designation)";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Transportverbindun")
	@SequenceGenerator(name = "Transportverbindun", sequenceName = "TRANSPORTVERBINDUN_SEQUENCE", allocationSize = 1)
	@Column(name = "OID_TRANSPORTVERBI")
	private Long oidTransportverbi;

	private String qualitaet;

	@Column(name = "SIMPLEX_DUPLEX")
	private String simplexDuplex;

	private String signalisierung;

	private BigDecimal ortsanbindung;

	@Column(name = "ENTSTOERUNG_24STUN")
	private String entstoerung24stun;

	@Column(name = "TGN_NMS_ID")
	private String tgnNmsId;

	@Column(name = "NATIONALE_BIS")
	private String nationaleBis;

	@Column(name = "AUFHEBUNG_SOLL")
	private Date aufhebungSoll;

	private String bearbeiter;

	private String einstufung;

	@Column(name = "INTERNATIONALE_ORD")
	private BigDecimal internationaleOrd;

	@Column(name = "INTERNATIONALER_FU")
	private String internationalerFu;

	@Column(name = "LETZTE_AKTUALISIER")
	private Date letzteAktualisier;

	private Date neuschaltung;

	@Column(name = "NEUSCHALTUNG_STATU")
	private String neuschaltungStatu;

	@Column(name = "TRANS_ORDNUNGSNUMM")
	private Long transOrdnungsnumm;

	private String transportverbindun;

	private String transportverbindu0;

	@Column(name = "UMSCHALTUNG_IST")
	private Date umschaltungIst;

	private BigDecimal weg;

	private String zeitleitung;

	private String zusatzbuchstabe;

	private String leitungskapazitaet;

	@Column(name = "FIKTIVE_BUCHUNG")
	private String fiktiveBuchung;

	private String echokomp;

	@Column(name = "IPSTN_VERKEHR")
	private String ipstnVerkehr;

	@Column(name = "IML_VERKEHR")
	private String imlVerkehr;

	@Column(name = "PROCESS_TYPE")
	private String processType;

	private String delay;

	@Column(name = "CREATED_ON")
	private Date createdOn;

	@Column(name = "CREATED_BY")
	private String createdBy;

	private String circuitcac;

	@Column(name = "CIRCUITCAC_ECI")
	private String circuitcacEci;

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
	private Lsc fkLszoidLsz;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_CARRIEROID_CARRIER")
	private Carrier fkCarrieroidCarrier;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_CUSTOMEROID_CUS")
	private Customer fkCustomeroidCus;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_DIENSTOID_DIENS")
	private Service fkDienstoidDiens;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_ENDPUNKTOID_END")
	private Terminal fkEndpunktoidEnd;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK0ENDPUNKTOID_END")
	private Terminal fk0endpunktoidEnd;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_KENNBUCHSTABOID")
	private IdentifyLetter fkKennbuchstaboid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_LSZ_EXTENSIOOID_EXTENSION")
	private LszExtension fkLszExtensiooidExtension;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_NETZWERKOID")
	private Netzwerk fkNetzwerkoid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_OMS_ORDEROID_OMS_ORDER")
	private OmsOrder fkOmsOrderoidOmsOrder;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_SUBNETWORKOID_S")
	private Subnetwork fkSubnetworkoidS;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_TRANSPORTVEROID")
	private Transportverbindun fkTransportveroid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_WEGOID")
	private Weg fkWegoid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_COMPANYOID_COMPANY")
	private Company fkCompanyoidCompany;

	@OneToMany(mappedBy = "fkTransportveroid")
	private Set<Schaltauftrag> schaltauftragCollection;

	@OneToMany(mappedBy = "fkTransportveroid")
	private Set<Fuehrung> fuehrungCollection;

	@OneToMany(mappedBy = "fkTransportveroid")
	private Set<Konfiguration> konfigurationCollection;

	@OneToMany(mappedBy = "fkTransportveroidTransportve")
	private Set<StructInfo> structInfoCollection;

	@OneToMany(mappedBy = "fkTransportveroidTransportve")
	private Set<EndCustomer> endCustomerCollection;

	@OneToMany(mappedBy = "fkTransportveroid")
	private Set<Transportverbindun> transportverbindunCollection;

	// @OneToMany(mappedBy="circuit")
	// private Set<LruCircuit> lruCircuitCollection;

	@ManyToMany(mappedBy = "transportverbinduns3")
	private Set<Terminal> endpunktCollection;

	@ManyToMany(mappedBy = "transportverbinduns2")
	private Set<Subnetwork> subnetworkCollection;

	@ManyToMany(mappedBy = "transportverbinduns")
	private Set<Property> eigenschaftCollection;

	@OneToMany(mappedBy = "fkTransportveroidTransportve")
	private Set<Cac> cacCollection;

	@OneToMany(mappedBy = "fkTransportveroidTransportve")
	private Set<FaultRecord> faultRecordCollection;

	@OneToMany(mappedBy = "fkTransportveroidTransportve")
	private Set<TransitionUnitPoint> transitionUnitPointCollection;

	@OneToMany(mappedBy = "fkTransportveroidTransportve")
	private Set<Port> portCollection;

	@OneToMany(mappedBy = "transportverbindun")
	private Set<History> historyCollection;

	@OneToOne(mappedBy = "fkTransportveroidTransportve")
	private SlaIndividuell slaIndividuell;

	@OneToMany(mappedBy = "fkTransportveroidTransportve")
	private Set<ParameterXTv> parameterXTvCollection;

	@ManyToMany(mappedBy = "transportverbindunCollection")
	private Set<FaultRecord> faultRecordCollection2;

	private static final long serialVersionUID = 1L;

	public Transportverbindun() {
		super();
	}

	/**
	 * @return the oidTransportverbi
	 */
	public Long getOidTransportverbi() {
		return oidTransportverbi;
	}

	/**
	 * @param oidTransportverbi
	 *            the oidTransportverbi to set
	 */
	public void setOidTransportverbi(Long oidTransportverbi) {
		this.oidTransportverbi = oidTransportverbi;
	}

	/**
	 * @return qualitaet
	 */
	public String getQualitaet() {
		return this.qualitaet;
	}

	/**
	 * @param qualitaet
	 */
	public void setQualitaet(String qualitaet) {
		this.qualitaet = qualitaet;
	}

	public String getSimplexDuplex() {
		return this.simplexDuplex;
	}

	public void setSimplexDuplex(String simplexDuplex) {
		this.simplexDuplex = simplexDuplex;
	}

	public String getSignalisierung() {
		return this.signalisierung;
	}

	public void setSignalisierung(String signalisierung) {
		this.signalisierung = signalisierung;
	}

	public BigDecimal getOrtsanbindung() {
		return this.ortsanbindung;
	}

	public void setOrtsanbindung(BigDecimal ortsanbindung) {
		this.ortsanbindung = ortsanbindung;
	}

	public String getEntstoerung24stun() {
		return this.entstoerung24stun;
	}

	public void setEntstoerung24stun(String entstoerung24stun) {
		this.entstoerung24stun = entstoerung24stun;
	}

	public String getTgnNmsId() {
		return this.tgnNmsId;
	}

	public void setTgnNmsId(String tgnNmsId) {
		this.tgnNmsId = tgnNmsId;
	}

	public String getNationaleBis() {
		return this.nationaleBis;
	}

	public void setNationaleBis(String nationaleBis) {
		this.nationaleBis = nationaleBis;
	}

	public Date getAufhebungSoll() {
		return this.aufhebungSoll;
	}

	public void setAufhebungSoll(Date aufhebungSoll) {
		this.aufhebungSoll = aufhebungSoll;
	}

	public String getBearbeiter() {
		return this.bearbeiter;
	}

	public void setBearbeiter(String bearbeiter) {
		this.bearbeiter = bearbeiter;
	}

	public String getEinstufung() {
		return this.einstufung;
	}

	public void setEinstufung(String einstufung) {
		this.einstufung = einstufung;
	}

	public BigDecimal getInternationaleOrd() {
		return this.internationaleOrd;
	}

	public void setInternationaleOrd(BigDecimal internationaleOrd) {
		this.internationaleOrd = internationaleOrd;
	}

	public String getInternationalerFu() {
		return this.internationalerFu;
	}

	public void setInternationalerFu(String internationalerFu) {
		this.internationalerFu = internationalerFu;
	}

	public Date getLetzteAktualisier() {
		return this.letzteAktualisier;
	}

	public void setLetzteAktualisier(Date letzteAktualisier) {
		this.letzteAktualisier = letzteAktualisier;
	}

	public Date getNeuschaltung() {
		return this.neuschaltung;
	}

	public void setNeuschaltung(Date neuschaltung) {
		this.neuschaltung = neuschaltung;
	}

	public String getNeuschaltungStatu() {
		return this.neuschaltungStatu;
	}

	public void setNeuschaltungStatu(String neuschaltungStatu) {
		this.neuschaltungStatu = neuschaltungStatu;
	}

	public Long getTransOrdnungsnumm() {
		return this.transOrdnungsnumm;
	}

	public void setTransOrdnungsnumm(Long transOrdnungsnumm) {
		this.transOrdnungsnumm = transOrdnungsnumm;
	}

	public String getTransportverbindun() {
		return this.transportverbindun;
	}

	public void setTransportverbindun(String transportverbindun) {
		this.transportverbindun = transportverbindun;
	}

	public String getTransportverbindu0() {
		return this.transportverbindu0;
	}

	public void setTransportverbindu0(String transportverbindu0) {
		this.transportverbindu0 = transportverbindu0;
	}

	public Date getUmschaltungIst() {
		return this.umschaltungIst;
	}

	public void setUmschaltungIst(Date umschaltungIst) {
		this.umschaltungIst = umschaltungIst;
	}

	public BigDecimal getWeg() {
		return this.weg;
	}

	public void setWeg(BigDecimal weg) {
		this.weg = weg;
	}

	public String getZeitleitung() {
		return this.zeitleitung;
	}

	public void setZeitleitung(String zeitleitung) {
		this.zeitleitung = zeitleitung;
	}

	public String getZusatzbuchstabe() {
		return this.zusatzbuchstabe;
	}

	public void setZusatzbuchstabe(String zusatzbuchstabe) {
		this.zusatzbuchstabe = zusatzbuchstabe;
	}

	public String getLeitungskapazitaet() {
		return this.leitungskapazitaet;
	}

	public void setLeitungskapazitaet(String leitungskapazitaet) {
		this.leitungskapazitaet = leitungskapazitaet;
	}

	public String getFiktiveBuchung() {
		return this.fiktiveBuchung;
	}

	public void setFiktiveBuchung(String fiktiveBuchung) {
		this.fiktiveBuchung = fiktiveBuchung;
	}

	public String getEchokomp() {
		return this.echokomp;
	}

	public void setEchokomp(String echokomp) {
		this.echokomp = echokomp;
	}

	public String getIpstnVerkehr() {
		return this.ipstnVerkehr;
	}

	public void setIpstnVerkehr(String ipstnVerkehr) {
		this.ipstnVerkehr = ipstnVerkehr;
	}

	public String getImlVerkehr() {
		return this.imlVerkehr;
	}

	public void setImlVerkehr(String imlVerkehr) {
		this.imlVerkehr = imlVerkehr;
	}

	public String getProcessType() {
		return this.processType;
	}

	public void setProcessType(String processType) {
		this.processType = processType;
	}

	public String getDelay() {
		return this.delay;
	}

	public void setDelay(String delay) {
		this.delay = delay;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCircuitcac() {
		return this.circuitcac;
	}

	public void setCircuitcac(String circuitcac) {
		this.circuitcac = circuitcac;
	}

	public String getCircuitcacEci() {
		return this.circuitcacEci;
	}

	public void setCircuitcacEci(String circuitcacEci) {
		this.circuitcacEci = circuitcacEci;
	}

	public String getTvRestoration() {
		return this.tvRestoration;
	}

	public void setTvRestoration(String tvRestoration) {
		this.tvRestoration = tvRestoration;
	}

	public String getHistoryStatus() {
		return this.historyStatus;
	}

	public void setHistoryStatus(String historyStatus) {
		this.historyStatus = historyStatus;
	}

	public Date getHistoryDate() {
		return this.historyDate;
	}

	public void setHistoryDate(Date historyDate) {
		this.historyDate = historyDate;
	}

	public BigDecimal getDelayMainMs() {
		return this.delayMainMs;
	}

	public void setDelayMainMs(BigDecimal delayMainMs) {
		this.delayMainMs = delayMainMs;
	}

	public BigDecimal getDelayXwayMs() {
		return this.delayXwayMs;
	}

	public void setDelayXwayMs(BigDecimal delayXwayMs) {
		this.delayXwayMs = delayXwayMs;
	}

	public String getExcludeVilolation() {
		return this.excludeVilolation;
	}

	public void setExcludeVilolation(String excludeVilolation) {
		this.excludeVilolation = excludeVilolation;
	}

	public String getBasedataUrl() {
		return this.basedataUrl;
	}

	public void setBasedataUrl(String basedataUrl) {
		this.basedataUrl = basedataUrl;
	}

	/**
	 * @return the fkLszoidLsz
	 */
	public Lsc getFkLszoidLsz() {
		return fkLszoidLsz;
	}

	/**
	 * @param fkLszoidLsz
	 *            the fkLszoidLsz to set
	 */
	public void setFkLszoidLsz(Lsc fkLszoidLsz) {
		this.fkLszoidLsz = fkLszoidLsz;
	}

	public Carrier getFkCarrieroidCarrier() {
		return this.fkCarrieroidCarrier;
	}

	public void setFkCarrieroidCarrier(Carrier fkCarrieroidCarrier) {
		this.fkCarrieroidCarrier = fkCarrieroidCarrier;
	}

	public Customer getFkCustomeroidCus() {
		return this.fkCustomeroidCus;
	}

	public void setFkCustomeroidCus(Customer fkCustomeroidCus) {
		this.fkCustomeroidCus = fkCustomeroidCus;
	}

	public Service getFkDienstoidDiens() {
		return this.fkDienstoidDiens;
	}

	public void setFkDienstoidDiens(Service fkDienstoidDiens) {
		this.fkDienstoidDiens = fkDienstoidDiens;
	}

	public Terminal getFkEndpunktoidEnd() {
		return this.fkEndpunktoidEnd;
	}

	public void setFkEndpunktoidEnd(Terminal fkEndpunktoidEnd) {
		this.fkEndpunktoidEnd = fkEndpunktoidEnd;
	}

	public Terminal getFk0endpunktoidEnd() {
		return this.fk0endpunktoidEnd;
	}

	public void setFk0endpunktoidEnd(Terminal fk0endpunktoidEnd) {
		this.fk0endpunktoidEnd = fk0endpunktoidEnd;
	}

	public IdentifyLetter getFkKennbuchstaboid() {
		return this.fkKennbuchstaboid;
	}

	public void setFkKennbuchstaboid(IdentifyLetter fkKennbuchstaboid) {
		this.fkKennbuchstaboid = fkKennbuchstaboid;
	}

	public LszExtension getFkLszExtensiooidExtension() {
		return this.fkLszExtensiooidExtension;
	}

	public void setFkLszExtensiooidExtension(
			LszExtension fkLszExtensiooidExtension) {
		this.fkLszExtensiooidExtension = fkLszExtensiooidExtension;
	}

	public Netzwerk getFkNetzwerkoid() {
		return this.fkNetzwerkoid;
	}

	public void setFkNetzwerkoid(Netzwerk fkNetzwerkoid) {
		this.fkNetzwerkoid = fkNetzwerkoid;
	}

	public OmsOrder getFkOmsOrderoidOmsOrder() {
		return this.fkOmsOrderoidOmsOrder;
	}

	public void setFkOmsOrderoidOmsOrder(OmsOrder fkOmsOrderoidOmsOrder) {
		this.fkOmsOrderoidOmsOrder = fkOmsOrderoidOmsOrder;
	}

	public Subnetwork getFkSubnetworkoidS() {
		return this.fkSubnetworkoidS;
	}

	public void setFkSubnetworkoidS(Subnetwork fkSubnetworkoidS) {
		this.fkSubnetworkoidS = fkSubnetworkoidS;
	}

	public Transportverbindun getFkTransportveroid() {
		return this.fkTransportveroid;
	}

	public void setFkTransportveroid(Transportverbindun fkTransportveroid) {
		this.fkTransportveroid = fkTransportveroid;
	}

	public Weg getFkWegoid() {
		return this.fkWegoid;
	}

	public void setFkWegoid(Weg fkWegoid) {
		this.fkWegoid = fkWegoid;
	}

	public Set<Konfiguration> getKonfigurationCollection() {
		return this.konfigurationCollection;
	}

	public void setKonfigurationCollection(
			Set<Konfiguration> konfigurationCollection) {
		this.konfigurationCollection = konfigurationCollection;
	}

	public Set<StructInfo> getStructInfoCollection() {
		return this.structInfoCollection;
	}

	public void setStructInfoCollection(Set<StructInfo> structInfoCollection) {
		this.structInfoCollection = structInfoCollection;
	}

	public Set<EndCustomer> getEndCustomerCollection() {
		return this.endCustomerCollection;
	}

	public void setEndCustomerCollection(Set<EndCustomer> endCustomerCollection) {
		this.endCustomerCollection = endCustomerCollection;
	}

	public Set<Transportverbindun> getTransportverbindunCollection() {
		return this.transportverbindunCollection;
	}

	public void setTransportverbindunCollection(
			Set<Transportverbindun> transportverbindunCollection) {
		this.transportverbindunCollection = transportverbindunCollection;
	}

	public Set<Terminal> getEndpunktCollection() {
		return this.endpunktCollection;
	}

	public void setEndpunktCollection(Set<Terminal> endpunktCollection) {
		this.endpunktCollection = endpunktCollection;
	}

	public Set<Subnetwork> getSubnetworkCollection() {
		return this.subnetworkCollection;
	}

	public void setSubnetworkCollection(Set<Subnetwork> subnetworkCollection) {
		this.subnetworkCollection = subnetworkCollection;
	}

	public Set<Property> getEigenschaftCollection() {
		return this.eigenschaftCollection;
	}

	public void setEigenschaftCollection(Set<Property> eigenschaftCollection) {
		this.eigenschaftCollection = eigenschaftCollection;
	}

	/**
	 * @return the schaltauftragCollection
	 */
	public Set<Schaltauftrag> getSchaltauftragCollection() {
		return schaltauftragCollection;
	}

	/**
	 * @param schaltauftragCollection
	 *            the schaltauftragCollection to set
	 */
	public void setSchaltauftragCollection(
			Set<Schaltauftrag> schaltauftragCollection) {
		this.schaltauftragCollection = schaltauftragCollection;
	}

	/**
	 * @return the fuehrungCollection
	 */
	public Set<Fuehrung> getFuehrungCollection() {
		return fuehrungCollection;
	}

	/**
	 * @param fuehrungCollection
	 *            the fuehrungCollection to set
	 */
	public void setFuehrungCollection(Set<Fuehrung> fuehrungCollection) {
		this.fuehrungCollection = fuehrungCollection;
	}

	/**
	 * @return the lruCircuitCollection
	 */
	// public Set<LruCircuit> getLruCircuitCollection() {
	// return lruCircuitCollection;
	// }
	/**
	 * @param lruCircuitCollection
	 *            the lruCircuitCollection to set
	 */
	// public void setLruCircuitCollection(Set<LruCircuit> lruCircuitCollection)
	// {
	// this.lruCircuitCollection = lruCircuitCollection;
	// }

	/**
	 * @return the fkCompanyoidCompany
	 */
	public Company getFkCompanyoidCompany() {
		return fkCompanyoidCompany;
	}

	/**
	 * @param fkCompanyoidCompany
	 *            the fkCompanyoidCompany to set
	 */
	public void setFkCompanyoidCompany(Company fkCompanyoidCompany) {
		this.fkCompanyoidCompany = fkCompanyoidCompany;
	}

	/**
	 * @return the cacCollection
	 */
	public Set<Cac> getCacCollection() {
		return cacCollection;
	}

	/**
	 * @param cacCollection
	 *            the cacCollection to set
	 */
	public void setCacCollection(Set<Cac> cacCollection) {
		this.cacCollection = cacCollection;
	}

	/**
	 * @return the faultRecordCollection
	 */
	public Set<FaultRecord> getFaultRecordCollection() {
		return faultRecordCollection;
	}

	/**
	 * @param faultRecordCollection
	 *            the faultRecordCollection to set
	 */
	public void setFaultRecordCollection(Set<FaultRecord> faultRecordCollection) {
		this.faultRecordCollection = faultRecordCollection;
	}

	/**
	 * @return the transitionUnitPointCollection
	 */
	public Set<TransitionUnitPoint> getTransitionUnitPointCollection() {
		return transitionUnitPointCollection;
	}

	/**
	 * @param transitionUnitPointCollection
	 *            the transitionUnitPointCollection to set
	 */
	public void setTransitionUnitPointCollection(
			Set<TransitionUnitPoint> transitionUnitPointCollection) {
		this.transitionUnitPointCollection = transitionUnitPointCollection;
	}

	/**
	 * @return the portCollection
	 */
	public Set<Port> getPortCollection() {
		return portCollection;
	}

	/**
	 * @param portCollection
	 *            the portCollection to set
	 */
	public void setPortCollection(Set<Port> portCollection) {
		this.portCollection = portCollection;
	}

	/**
	 * @return the historyCollection
	 */
	public Set<History> getHistoryCollection() {
		return historyCollection;
	}

	/**
	 * @param historyCollection
	 *            the historyCollection to set
	 */
	public void setHistoryCollection(Set<History> historyCollection) {
		this.historyCollection = historyCollection;
	}

	/**
	 * @return the slaIndividuell
	 */
	public SlaIndividuell getSlaIndividuell() {
		return slaIndividuell;
	}

	/**
	 * @param slaIndividuell
	 *            the slaIndividuell to set
	 */
	public void setSlaIndividuell(SlaIndividuell slaIndividuell) {
		this.slaIndividuell = slaIndividuell;
	}

	/**
	 * @return the parameterXTvCollection
	 */
	public Set<ParameterXTv> getParameterXTvCollection() {
		return parameterXTvCollection;
	}

	/**
	 * @param parameterXTvCollection
	 *            the parameterXTvCollection to set
	 */
	public void setParameterXTvCollection(
			Set<ParameterXTv> parameterXTvCollection) {
		this.parameterXTvCollection = parameterXTvCollection;
	}

	/**
	 * @return the faultRecordCollection2
	 */
	public Set<FaultRecord> getFaultRecordCollection2() {
		return faultRecordCollection2;
	}

	/**
	 * @param faultRecordCollection2
	 *            the faultRecordCollection2 to set
	 */
	public void setFaultRecordCollection2(
			Set<FaultRecord> faultRecordCollection2) {
		this.faultRecordCollection2 = faultRecordCollection2;
	}

}