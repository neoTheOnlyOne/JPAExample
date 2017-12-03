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
@Table(name="INFO_ABSCHNITT")
public class InfoSegment implements Serializable {
	@Id
	@Column(name="ABSCHNITT_ID")
	private Long id;

	@Column(name="A_ART")
	private String aArt;

	@Column(name="A_BREITE_A")
	private String aBreiteA;

	@Column(name="A_BREITE_B")
	private String aBreiteB;

	@Column(name="A_BSZ_A")
	private String aBszA;

	@Column(name="A_BSZ_B")
	private String aBszB;

	@Column(name="A_CON_CARRIER")
	private String aConCarrier;

	@Column(name="A_CONTRACT")
	private String aContract;

	@Column(name="A_ENDPUNKT_A")
	private String aEndpunktA;

	@Column(name="A_ENDPUNKT_B")
	private String aEndpunktB;

	@Column(name="A_ENDSZ_A")
	private String aEndszA;

	@Column(name="A_ENDSZ_B")
	private String aEndszB;

	@Column(name="A_EXCLUDE_VIOLATION")
	private String excludeViolation;

	@Column(name="A_FUNCTIONCODE")
	private String functioncode;

	@Column(name="A_GRUNDSTUECK_A")
	private String siteA;

	@Column(name="A_GRUNDSTUECK_B")
	private String siteB;

	@Column(name="A_IHRS_CONSISTENCY")
	private String ihrsConsistency;

	@Column(name="A_IHRS_DESIGN_DATE")
	private Date ihrsDesignDate;

	@Column(name="A_KANAL")
	private String channel;

	@Column(name="A_KB")
	private String kb;

	@Column(name="A_KURZBEZ_A")
	private String kurzbezA;

	@Column(name="A_KURZBEZ_B")
	private String kurzbezB;

	@Column(name="A_LAENDERKANTE")
	private String tunnel;

	@Column(name="A_LAENGE_A")
	private String laengeA;

	@Column(name="A_LAENGE_B")
	private String laengeB;

	@Column(name="A_LAENGE_KM")
	private Long laengeKm;

	@Column(name="A_LINIENBEZEICHNUN")
	private String aLinienbezeichnun;

	@Column(name="A_LINIENKENNUNG")
	private String lineId;

	@Column(name="A_LSZ")
	private String lsc;

	@Column(name="A_ONR")
	private Long aOnr;

	@Column(name="A_POSITION")
	private String position;

	@Column(name="A_V_KAPAZITAET")
	private String capacity;

	@Column(name="A_ZB")
	private String zb;

	@Column(name="A_ZEITSCHLITZ_V_B")
	private String timeslotzVB;

	@Column(name="ABSCHNITT_NR")
	private Long segmentNr;

	@Column(name="FK_ALIAS")
	private Long alias;

	@Column(name="FK_FUEHRUNG")
	private Long routing;

	@Column(name="FK_VERBINDUNG")
	private Long fkVerbindung;

	@OneToMany(mappedBy="infoSegment")
	private Set<InfoInhouse> infoInhouses;

	private static final long serialVersionUID = 1L;

	public InfoSegment() {
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
	 * @return the aArt
	 */
	public String getAArt() {
		return aArt;
	}

	/**
	 * @param art the aArt to set
	 */
	public void setAArt(String art) {
		aArt = art;
	}

	/**
	 * @return the aBreiteA
	 */
	public String getABreiteA() {
		return aBreiteA;
	}

	/**
	 * @param breiteA the aBreiteA to set
	 */
	public void setABreiteA(String breiteA) {
		aBreiteA = breiteA;
	}

	/**
	 * @return the aBreiteB
	 */
	public String getABreiteB() {
		return aBreiteB;
	}

	/**
	 * @param breiteB the aBreiteB to set
	 */
	public void setABreiteB(String breiteB) {
		aBreiteB = breiteB;
	}

	/**
	 * @return the aBszA
	 */
	public String getABszA() {
		return aBszA;
	}

	/**
	 * @param bszA the aBszA to set
	 */
	public void setABszA(String bszA) {
		aBszA = bszA;
	}

	/**
	 * @return the aBszB
	 */
	public String getABszB() {
		return aBszB;
	}

	/**
	 * @param bszB the aBszB to set
	 */
	public void setABszB(String bszB) {
		aBszB = bszB;
	}

	/**
	 * @return the aConCarrier
	 */
	public String getAConCarrier() {
		return aConCarrier;
	}

	/**
	 * @param conCarrier the aConCarrier to set
	 */
	public void setAConCarrier(String conCarrier) {
		aConCarrier = conCarrier;
	}

	/**
	 * @return the aContract
	 */
	public String getAContract() {
		return aContract;
	}

	/**
	 * @param contract the aContract to set
	 */
	public void setAContract(String contract) {
		aContract = contract;
	}

	/**
	 * @return the aEndpunktA
	 */
	public String getAEndpunktA() {
		return aEndpunktA;
	}

	/**
	 * @param endpunktA the aEndpunktA to set
	 */
	public void setAEndpunktA(String endpunktA) {
		aEndpunktA = endpunktA;
	}

	/**
	 * @return the aEndpunktB
	 */
	public String getAEndpunktB() {
		return aEndpunktB;
	}

	/**
	 * @param endpunktB the aEndpunktB to set
	 */
	public void setAEndpunktB(String endpunktB) {
		aEndpunktB = endpunktB;
	}

	/**
	 * @return the aEndszA
	 */
	public String getAEndszA() {
		return aEndszA;
	}

	/**
	 * @param endszA the aEndszA to set
	 */
	public void setAEndszA(String endszA) {
		aEndszA = endszA;
	}

	/**
	 * @return the aEndszB
	 */
	public String getAEndszB() {
		return aEndszB;
	}

	/**
	 * @param endszB the aEndszB to set
	 */
	public void setAEndszB(String endszB) {
		aEndszB = endszB;
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
	 * @return the ihrsConsistency
	 */
	public String getIhrsConsistency() {
		return ihrsConsistency;
	}

	/**
	 * @param ihrsConsistency the ihrsConsistency to set
	 */
	public void setIhrsConsistency(String ihrsConsistency) {
		this.ihrsConsistency = ihrsConsistency;
	}

	/**
	 * @return the ihrsDesignDate
	 */
	public Date getIhrsDesignDate() {
		return ihrsDesignDate;
	}

	/**
	 * @param ihrsDesignDate the ihrsDesignDate to set
	 */
	public void setIhrsDesignDate(Date ihrsDesignDate) {
		this.ihrsDesignDate = ihrsDesignDate;
	}

	/**
	 * @return the channel
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * @param channel the channel to set
	 */
	public void setChannel(String channel) {
		this.channel = channel;
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
	 * @return the tunnel
	 */
	public String getTunnel() {
		return tunnel;
	}

	/**
	 * @param tunnel the tunnel to set
	 */
	public void setTunnel(String tunnel) {
		this.tunnel = tunnel;
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
	 * @return the laengeKm
	 */
	public Long getLaengeKm() {
		return laengeKm;
	}

	/**
	 * @param laengeKm the laengeKm to set
	 */
	public void setLaengeKm(Long laengeKm) {
		this.laengeKm = laengeKm;
	}

	/**
	 * @return the aLinienbezeichnun
	 */
	public String getALinienbezeichnun() {
		return aLinienbezeichnun;
	}

	/**
	 * @param linienbezeichnun the aLinienbezeichnun to set
	 */
	public void setALinienbezeichnun(String linienbezeichnun) {
		aLinienbezeichnun = linienbezeichnun;
	}

	/**
	 * @return the lineId
	 */
	public String getLineId() {
		return lineId;
	}

	/**
	 * @param lineId the lineId to set
	 */
	public void setLineId(String lineId) {
		this.lineId = lineId;
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
	 * @return the aOnr
	 */
	public Long getAOnr() {
		return aOnr;
	}

	/**
	 * @param onr the aOnr to set
	 */
	public void setAOnr(Long onr) {
		aOnr = onr;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
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
	 * @return the timeslotzVB
	 */
	public String getTimeslotzVB() {
		return timeslotzVB;
	}

	/**
	 * @param timeslotzVB the timeslotzVB to set
	 */
	public void setTimeslotzVB(String timeslotzVB) {
		this.timeslotzVB = timeslotzVB;
	}

	/**
	 * @return the segmentNr
	 */
	public Long getSegmentNr() {
		return segmentNr;
	}

	/**
	 * @param segmentNr the segmentNr to set
	 */
	public void setSegmentNr(Long segmentNr) {
		this.segmentNr = segmentNr;
	}

	/**
	 * @return the alias
	 */
	public Long getAlias() {
		return alias;
	}

	/**
	 * @param alias the alias to set
	 */
	public void setAlias(Long alias) {
		this.alias = alias;
	}

	/**
	 * @return the routing
	 */
	public Long getRouting() {
		return routing;
	}

	/**
	 * @param routing the routing to set
	 */
	public void setRouting(Long routing) {
		this.routing = routing;
	}

	/**
	 * @return the fkVerbindung
	 */
	public Long getFkVerbindung() {
		return fkVerbindung;
	}

	/**
	 * @param fkVerbindung the fkVerbindung to set
	 */
	public void setFkVerbindung(Long fkVerbindung) {
		this.fkVerbindung = fkVerbindung;
	}

	/**
	 * @return the infoInhouses
	 */
	public Set<InfoInhouse> getInfoInhouses() {
		return infoInhouses;
	}

	/**
	 * @param infoInhouses the infoInhouses to set
	 */
	public void setInfoInhouses(Set<InfoInhouse> infoInhouses) {
		this.infoInhouses = infoInhouses;
	}

}
