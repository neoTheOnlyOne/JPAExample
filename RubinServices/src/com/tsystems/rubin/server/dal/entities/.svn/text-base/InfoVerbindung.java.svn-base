package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="INFO_VERBINDUNG")
public class InfoVerbindung implements Serializable {
	@Id
	@Column(name="VERBINDUNG_ID")
	private Long id;

	private Date aufhebung;

	private String bedarfstraeger;

	@Column(name="EC_ANSCHRIFT1")
	private String addressLine1;

	@Column(name="EC_ANSCHRIFT2")
	private String addressLine2;

	@Column(name="EC_ANSCHRIFT3")
	private String addressLine3;

	@Column(name="EC_NAME")
	private String name;

	@Column(name="EC_NAMESUCHBSI")
	private String nameSearch;

	@Column(name="EC_NETWORK")
	private String network;

	@Column(name="EC_NETWORK_UC")
	private String networkUc;

	private String fiktiv;

	@Column(name="FK_CARRIER")
	private Long fkCarrier;

	private String nationale;

	@Column(name="NEU_STATUS")
	private String neuStatus;

	private Date neuschaltung;

	@Column(name="SLA_NAME_INDIVIDUELL")
	private String slaNameIndividuell;

	private String subnetwork;

	private String subnetworklabel;

	private Date umschaltung;

	@Column(name="V_BREITE_A")
	private String breiteA;

	@Column(name="V_BREITE_B")
	private String breiteB;

	@Column(name="V_BSZ_A")
	private String bszA;

	@Column(name="V_BSZ_B")
	private String bszB;

	@Column(name="V_CAC")
	private String cac;

	@Column(name="V_CAC_ECI")
	private String cacEci;

	@Column(name="V_CARRIERKURZ_A")
	private String carrierkurzA;

	@Column(name="V_CARRIERKURZ_B")
	private String carrierkurzB;

	@Column(name="V_CARRIERNAME_A")
	private String carriernameA;

	@Column(name="V_CARRIERNAME_B")
	private String carriernameB;

	@Column(name="V_CUSTOMER_CIRCUIT")
	private String customerCircuit;

	@Column(name="V_DELAY")
	private String delay;

	@Column(name="V_DELAY_MAIN_MS_CALCULATED")
	private Long delayMainMsCalculated;

	@Column(name="V_DELAY_MAIN_MS_MEASURED")
	private Long delayMainMsMeasured;

	@Column(name="V_DELAY_XWAY_MS_CALCULATED")
	private Long delayXwayMsCalculated;

	@Column(name="V_DELAY_XWAY_MS_MEASURED")
	private Long delayXwayMsMeasured;

	@Column(name="V_DISCONNECT_STATUS")
	private String disconnectStatus;

	@Column(name="V_ENDPUNKT_A")
	private String terminalA;

	@Column(name="V_ENDPUNKT_B")
	private String terminalB;

	@Column(name="V_ENDSZ_A")
	private String endszA;

	@Column(name="V_ENDSZ_B")
	private String endszB;

	@Column(name="V_EXCLUDE_VIOLATION")
	private String excludeViolation;

	@Column(name="V_FUNCTIONCODE")
	private String functioncode;

	@Column(name="V_GRUNDSTUECK_A")
	private String siteA;

	@Column(name="V_GRUNDSTUECK_B")
	private String siteB;

	@Column(name="V_KAPAZITAET")
	private String capacity;

	@Column(name="V_KB")
	private String kb;

	@Column(name="V_KURZBEZ_A")
	private String kurzbezA;

	@Column(name="V_KURZBEZ_B")
	private String kurzbezB;

	@Column(name="V_L_KENNUNG_A")
	private String verbindungIdA;

	@Column(name="V_L_KENNUNG_B")
	private String verbindungIdB;

	@Column(name="V_LAENGE_A")
	private String laengeA;

	@Column(name="V_LAENGE_B")
	private String laengeB;

	@Column(name="V_LAENGE_LUFTLINIE")
	private Long laengeLuftlinie;

	@Column(name="V_LANDBEZEICHN_A")
	private String landbezeichnA;

	@Column(name="V_LANDBEZEICHN_B")
	private String landbezeichnB;

	@Column(name="V_LSZ")
	private String lsc;

	@Column(name="V_LSZ_EXTENSION")
	private String lscExtension;

	@Column(name="V_NETWORK_NAME")
	private String networkName;

	@Column(name="V_NETWORK_NAME_UPPER_CASE")
	private String networkNameUpperCase;

	@Column(name="V_NOTIZ")
	private String notiz;

	@Column(name="V_ONR")
	private Long onr;

	@Column(name="V_PATH_NAME")
	private String pathName;

	@Column(name="V_TGN_NMS_ID")
	private String tgnNmsId;

	@Column(name="V_ZB")
	private String zb;

	@OneToMany(mappedBy="infoVerbindung")
	private Set<InfoStructInfo> infoStructInfoCollection;

	@OneToMany(mappedBy="infoVerbindung")
	private Set<InfoAliasDescription> infoAliasbezeichnCollection;

	@OneToMany(mappedBy="infoVerbindung")
	private Set<InfoEigenschaft> infoEigenschaftCollection;

	@OneToMany(mappedBy="infoVerbindung")
	private Set<InfoSlaRecord> infoSlaRecordCollection;

	private static final long serialVersionUID = 1L;

	public InfoVerbindung() {
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
	 * @return the aufhebung
	 */
	public Date getAufhebung() {
		return aufhebung;
	}

	/**
	 * @param aufhebung the aufhebung to set
	 */
	public void setAufhebung(Date aufhebung) {
		this.aufhebung = aufhebung;
	}

	/**
	 * @return the bedarfstraeger
	 */
	public String getBedarfstraeger() {
		return bedarfstraeger;
	}

	/**
	 * @param bedarfstraeger the bedarfstraeger to set
	 */
	public void setBedarfstraeger(String bedarfstraeger) {
		this.bedarfstraeger = bedarfstraeger;
	}

	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * @return the addressLine3
	 */
	public String getAddressLine3() {
		return addressLine3;
	}

	/**
	 * @param addressLine3 the addressLine3 to set
	 */
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
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
	 * @return the nameSearch
	 */
	public String getNameSearch() {
		return nameSearch;
	}

	/**
	 * @param nameSearch the nameSearch to set
	 */
	public void setNameSearch(String nameSearch) {
		this.nameSearch = nameSearch;
	}

	/**
	 * @return the network
	 */
	public String getNetwork() {
		return network;
	}

	/**
	 * @param network the network to set
	 */
	public void setNetwork(String network) {
		this.network = network;
	}

	/**
	 * @return the networkUc
	 */
	public String getNetworkUc() {
		return networkUc;
	}

	/**
	 * @param networkUc the networkUc to set
	 */
	public void setNetworkUc(String networkUc) {
		this.networkUc = networkUc;
	}

	/**
	 * @return the fiktiv
	 */
	public String getFiktiv() {
		return fiktiv;
	}

	/**
	 * @param fiktiv the fiktiv to set
	 */
	public void setFiktiv(String fiktiv) {
		this.fiktiv = fiktiv;
	}

	/**
	 * @return the fkCarrier
	 */
	public Long getFkCarrier() {
		return fkCarrier;
	}

	/**
	 * @param fkCarrier the fkCarrier to set
	 */
	public void setFkCarrier(Long fkCarrier) {
		this.fkCarrier = fkCarrier;
	}

	/**
	 * @return the nationale
	 */
	public String getNationale() {
		return nationale;
	}

	/**
	 * @param nationale the nationale to set
	 */
	public void setNationale(String nationale) {
		this.nationale = nationale;
	}

	/**
	 * @return the neuStatus
	 */
	public String getNeuStatus() {
		return neuStatus;
	}

	/**
	 * @param neuStatus the neuStatus to set
	 */
	public void setNeuStatus(String neuStatus) {
		this.neuStatus = neuStatus;
	}

	/**
	 * @return the neuschaltung
	 */
	public Date getNeuschaltung() {
		return neuschaltung;
	}

	/**
	 * @param neuschaltung the neuschaltung to set
	 */
	public void setNeuschaltung(Date neuschaltung) {
		this.neuschaltung = neuschaltung;
	}

	/**
	 * @return the slaNameIndividuell
	 */
	public String getSlaNameIndividuell() {
		return slaNameIndividuell;
	}

	/**
	 * @param slaNameIndividuell the slaNameIndividuell to set
	 */
	public void setSlaNameIndividuell(String slaNameIndividuell) {
		this.slaNameIndividuell = slaNameIndividuell;
	}

	/**
	 * @return the subnetwork
	 */
	public String getSubnetwork() {
		return subnetwork;
	}

	/**
	 * @param subnetwork the subnetwork to set
	 */
	public void setSubnetwork(String subnetwork) {
		this.subnetwork = subnetwork;
	}

	/**
	 * @return the subnetworklabel
	 */
	public String getSubnetworklabel() {
		return subnetworklabel;
	}

	/**
	 * @param subnetworklabel the subnetworklabel to set
	 */
	public void setSubnetworklabel(String subnetworklabel) {
		this.subnetworklabel = subnetworklabel;
	}

	/**
	 * @return the umschaltung
	 */
	public Date getUmschaltung() {
		return umschaltung;
	}

	/**
	 * @param umschaltung the umschaltung to set
	 */
	public void setUmschaltung(Date umschaltung) {
		this.umschaltung = umschaltung;
	}

	/**
	 * @return the breiteA
	 */
	public String getBreiteA() {
		return breiteA;
	}

	/**
	 * @param breiteA the breiteA to set
	 */
	public void setBreiteA(String breiteA) {
		this.breiteA = breiteA;
	}

	/**
	 * @return the breiteB
	 */
	public String getBreiteB() {
		return breiteB;
	}

	/**
	 * @param breiteB the breiteB to set
	 */
	public void setBreiteB(String breiteB) {
		this.breiteB = breiteB;
	}

	/**
	 * @return the bszA
	 */
	public String getBszA() {
		return bszA;
	}

	/**
	 * @param bszA the bszA to set
	 */
	public void setBszA(String bszA) {
		this.bszA = bszA;
	}

	/**
	 * @return the bszB
	 */
	public String getBszB() {
		return bszB;
	}

	/**
	 * @param bszB the bszB to set
	 */
	public void setBszB(String bszB) {
		this.bszB = bszB;
	}

	/**
	 * @return the cac
	 */
	public String getCac() {
		return cac;
	}

	/**
	 * @param cac the cac to set
	 */
	public void setCac(String cac) {
		this.cac = cac;
	}

	/**
	 * @return the cacEci
	 */
	public String getCacEci() {
		return cacEci;
	}

	/**
	 * @param cacEci the cacEci to set
	 */
	public void setCacEci(String cacEci) {
		this.cacEci = cacEci;
	}

	/**
	 * @return the carrierkurzA
	 */
	public String getCarrierkurzA() {
		return carrierkurzA;
	}

	/**
	 * @param carrierkurzA the carrierkurzA to set
	 */
	public void setCarrierkurzA(String carrierkurzA) {
		this.carrierkurzA = carrierkurzA;
	}

	/**
	 * @return the carrierkurzB
	 */
	public String getCarrierkurzB() {
		return carrierkurzB;
	}

	/**
	 * @param carrierkurzB the carrierkurzB to set
	 */
	public void setCarrierkurzB(String carrierkurzB) {
		this.carrierkurzB = carrierkurzB;
	}

	/**
	 * @return the carriernameA
	 */
	public String getCarriernameA() {
		return carriernameA;
	}

	/**
	 * @param carriernameA the carriernameA to set
	 */
	public void setCarriernameA(String carriernameA) {
		this.carriernameA = carriernameA;
	}

	/**
	 * @return the carriernameB
	 */
	public String getCarriernameB() {
		return carriernameB;
	}

	/**
	 * @param carriernameB the carriernameB to set
	 */
	public void setCarriernameB(String carriernameB) {
		this.carriernameB = carriernameB;
	}

	/**
	 * @return the customerCircuit
	 */
	public String getCustomerCircuit() {
		return customerCircuit;
	}

	/**
	 * @param customerCircuit the customerCircuit to set
	 */
	public void setCustomerCircuit(String customerCircuit) {
		this.customerCircuit = customerCircuit;
	}

	/**
	 * @return the delay
	 */
	public String getDelay() {
		return delay;
	}

	/**
	 * @param delay the delay to set
	 */
	public void setDelay(String delay) {
		this.delay = delay;
	}

	/**
	 * @return the delayMainMsCalculated
	 */
	public Long getDelayMainMsCalculated() {
		return delayMainMsCalculated;
	}

	/**
	 * @param delayMainMsCalculated the delayMainMsCalculated to set
	 */
	public void setDelayMainMsCalculated(Long delayMainMsCalculated) {
		this.delayMainMsCalculated = delayMainMsCalculated;
	}

	/**
	 * @return the delayMainMsMeasured
	 */
	public Long getDelayMainMsMeasured() {
		return delayMainMsMeasured;
	}

	/**
	 * @param delayMainMsMeasured the delayMainMsMeasured to set
	 */
	public void setDelayMainMsMeasured(Long delayMainMsMeasured) {
		this.delayMainMsMeasured = delayMainMsMeasured;
	}

	/**
	 * @return the delayXwayMsCalculated
	 */
	public Long getDelayXwayMsCalculated() {
		return delayXwayMsCalculated;
	}

	/**
	 * @param delayXwayMsCalculated the delayXwayMsCalculated to set
	 */
	public void setDelayXwayMsCalculated(Long delayXwayMsCalculated) {
		this.delayXwayMsCalculated = delayXwayMsCalculated;
	}

	/**
	 * @return the delayXwayMsMeasured
	 */
	public Long getDelayXwayMsMeasured() {
		return delayXwayMsMeasured;
	}

	/**
	 * @param delayXwayMsMeasured the delayXwayMsMeasured to set
	 */
	public void setDelayXwayMsMeasured(Long delayXwayMsMeasured) {
		this.delayXwayMsMeasured = delayXwayMsMeasured;
	}

	/**
	 * @return the disconnectStatus
	 */
	public String getDisconnectStatus() {
		return disconnectStatus;
	}

	/**
	 * @param disconnectStatus the disconnectStatus to set
	 */
	public void setDisconnectStatus(String disconnectStatus) {
		this.disconnectStatus = disconnectStatus;
	}

	/**
	 * @return the terminalA
	 */
	public String getTerminalA() {
		return terminalA;
	}

	/**
	 * @param terminalA the terminalA to set
	 */
	public void setTerminalA(String terminalA) {
		this.terminalA = terminalA;
	}

	/**
	 * @return the terminalB
	 */
	public String getTerminalB() {
		return terminalB;
	}

	/**
	 * @param terminalB the terminalB to set
	 */
	public void setTerminalB(String terminalB) {
		this.terminalB = terminalB;
	}

	/**
	 * @return the endszA
	 */
	public String getEndszA() {
		return endszA;
	}

	/**
	 * @param endszA the endszA to set
	 */
	public void setEndszA(String endszA) {
		this.endszA = endszA;
	}

	/**
	 * @return the endszB
	 */
	public String getEndszB() {
		return endszB;
	}

	/**
	 * @param endszB the endszB to set
	 */
	public void setEndszB(String endszB) {
		this.endszB = endszB;
	}

	/**
	 * @return the excludeViolation
	 */
	public String getExcludeViolation() {
		return excludeViolation;
	}

	/**
	 * @param excludeViolation the excludeViolation to set
	 */
	public void setExcludeViolation(String excludeViolation) {
		this.excludeViolation = excludeViolation;
	}

	/**
	 * @return the functioncode
	 */
	public String getFunctioncode() {
		return functioncode;
	}

	/**
	 * @param functioncode the functioncode to set
	 */
	public void setFunctioncode(String functioncode) {
		this.functioncode = functioncode;
	}

	/**
	 * @return the siteA
	 */
	public String getSiteA() {
		return siteA;
	}

	/**
	 * @param siteA the siteA to set
	 */
	public void setSiteA(String siteA) {
		this.siteA = siteA;
	}

	/**
	 * @return the siteB
	 */
	public String getSiteB() {
		return siteB;
	}

	/**
	 * @param siteB the siteB to set
	 */
	public void setSiteB(String siteB) {
		this.siteB = siteB;
	}

	/**
	 * @return the capacity
	 */
	public String getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the kb
	 */
	public String getKb() {
		return kb;
	}

	/**
	 * @param kb the kb to set
	 */
	public void setKb(String kb) {
		this.kb = kb;
	}

	/**
	 * @return the kurzbezA
	 */
	public String getKurzbezA() {
		return kurzbezA;
	}

	/**
	 * @param kurzbezA the kurzbezA to set
	 */
	public void setKurzbezA(String kurzbezA) {
		this.kurzbezA = kurzbezA;
	}

	/**
	 * @return the kurzbezB
	 */
	public String getKurzbezB() {
		return kurzbezB;
	}

	/**
	 * @param kurzbezB the kurzbezB to set
	 */
	public void setKurzbezB(String kurzbezB) {
		this.kurzbezB = kurzbezB;
	}

	/**
	 * @return the verbindungIdA
	 */
	public String getVerbindungIdA() {
		return verbindungIdA;
	}

	/**
	 * @param verbindungIdA the verbindungIdA to set
	 */
	public void setVerbindungIdA(String verbindungIdA) {
		this.verbindungIdA = verbindungIdA;
	}

	/**
	 * @return the verbindungIdB
	 */
	public String getVerbindungIdB() {
		return verbindungIdB;
	}

	/**
	 * @param verbindungIdB the verbindungIdB to set
	 */
	public void setVerbindungIdB(String verbindungIdB) {
		this.verbindungIdB = verbindungIdB;
	}

	/**
	 * @return the laengeA
	 */
	public String getLaengeA() {
		return laengeA;
	}

	/**
	 * @param laengeA the laengeA to set
	 */
	public void setLaengeA(String laengeA) {
		this.laengeA = laengeA;
	}

	/**
	 * @return the laengeB
	 */
	public String getLaengeB() {
		return laengeB;
	}

	/**
	 * @param laengeB the laengeB to set
	 */
	public void setLaengeB(String laengeB) {
		this.laengeB = laengeB;
	}

	/**
	 * @return the laengeLuftlinie
	 */
	public Long getLaengeLuftlinie() {
		return laengeLuftlinie;
	}

	/**
	 * @param laengeLuftlinie the laengeLuftlinie to set
	 */
	public void setLaengeLuftlinie(Long laengeLuftlinie) {
		this.laengeLuftlinie = laengeLuftlinie;
	}

	/**
	 * @return the landbezeichnA
	 */
	public String getLandbezeichnA() {
		return landbezeichnA;
	}

	/**
	 * @param landbezeichnA the landbezeichnA to set
	 */
	public void setLandbezeichnA(String landbezeichnA) {
		this.landbezeichnA = landbezeichnA;
	}

	/**
	 * @return the landbezeichnB
	 */
	public String getLandbezeichnB() {
		return landbezeichnB;
	}

	/**
	 * @param landbezeichnB the landbezeichnB to set
	 */
	public void setLandbezeichnB(String landbezeichnB) {
		this.landbezeichnB = landbezeichnB;
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
	 * @return the lscExtension
	 */
	public String getLscExtension() {
		return lscExtension;
	}

	/**
	 * @param lscExtension the lscExtension to set
	 */
	public void setLscExtension(String lscExtension) {
		this.lscExtension = lscExtension;
	}

	/**
	 * @return the networkName
	 */
	public String getNetworkName() {
		return networkName;
	}

	/**
	 * @param networkName the networkName to set
	 */
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

	/**
	 * @return the networkNameUpperCase
	 */
	public String getNetworkNameUpperCase() {
		return networkNameUpperCase;
	}

	/**
	 * @param networkNameUpperCase the networkNameUpperCase to set
	 */
	public void setNetworkNameUpperCase(String networkNameUpperCase) {
		this.networkNameUpperCase = networkNameUpperCase;
	}

	/**
	 * @return the notiz
	 */
	public String getNotiz() {
		return notiz;
	}

	/**
	 * @param notiz the notiz to set
	 */
	public void setNotiz(String notiz) {
		this.notiz = notiz;
	}

	/**
	 * @return the onr
	 */
	public Long getOnr() {
		return onr;
	}

	/**
	 * @param onr the onr to set
	 */
	public void setOnr(Long onr) {
		this.onr = onr;
	}

	/**
	 * @return the pathName
	 */
	public String getPathName() {
		return pathName;
	}

	/**
	 * @param pathName the pathName to set
	 */
	public void setPathName(String pathName) {
		this.pathName = pathName;
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
	 * @return the zb
	 */
	public String getZb() {
		return zb;
	}

	/**
	 * @param zb the zb to set
	 */
	public void setZb(String zb) {
		this.zb = zb;
	}

	/**
	 * @return the infoStructInfoCollection
	 */
	public Set<InfoStructInfo> getInfoStructInfoCollection() {
		return infoStructInfoCollection;
	}

	/**
	 * @param infoStructInfoCollection the infoStructInfoCollection to set
	 */
	public void setInfoStructInfoCollection(
			Set<InfoStructInfo> infoStructInfoCollection) {
		this.infoStructInfoCollection = infoStructInfoCollection;
	}

	/**
	 * @return the infoAliasbezeichnCollection
	 */
	public Set<InfoAliasDescription> getInfoAliasbezeichnCollection() {
		return infoAliasbezeichnCollection;
	}

	/**
	 * @param infoAliasbezeichnCollection the infoAliasbezeichnCollection to set
	 */
	public void setInfoAliasbezeichnCollection(
			Set<InfoAliasDescription> infoAliasbezeichnCollection) {
		this.infoAliasbezeichnCollection = infoAliasbezeichnCollection;
	}

	/**
	 * @return the infoEigenschaftCollection
	 */
	public Set<InfoEigenschaft> getInfoEigenschaftCollection() {
		return infoEigenschaftCollection;
	}

	/**
	 * @param infoEigenschaftCollection the infoEigenschaftCollection to set
	 */
	public void setInfoEigenschaftCollection(
			Set<InfoEigenschaft> infoEigenschaftCollection) {
		this.infoEigenschaftCollection = infoEigenschaftCollection;
	}

	/**
	 * @return the infoSlaRecordCollection
	 */
	public Set<InfoSlaRecord> getInfoSlaRecordCollection() {
		return infoSlaRecordCollection;
	}

	/**
	 * @param infoSlaRecordCollection the infoSlaRecordCollection to set
	 */
	public void setInfoSlaRecordCollection(
			Set<InfoSlaRecord> infoSlaRecordCollection) {
		this.infoSlaRecordCollection = infoSlaRecordCollection;
	}

	
}
