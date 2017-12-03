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
		@NamedQuery(name = NamedQueryConstants.FIND_ROUTINGSECTIONBYROUTINGID, query = "Select new com.tsystems.rubin.server.dal.dvo.RoutingSectionDVO"
				+ RoutingSection.COMMON_PICKLIST_FIELDS_STRING
				+ " from RoutingSection rs"
				+ " where rs.routing.id = ?1 order by rs.sequencNumber"),
		@NamedQuery(name = NamedQueryConstants.FIND_P_ROUTINGSCTIONTYPEINFO_BYROUTINGSECTIONID, query = "Select new com.tsystems.rubin.server.dal.dvo.RoutingSectionTypeInfoDVO"
				+ RoutingSection.ROUTINGSECTIONTYPE_P_FIELDS_STRING
				+ " from RoutingSection rs" + " where rs.id = ?1"),
		@NamedQuery(name = NamedQueryConstants.FIND_L_ROUTINGSCTIONTYPEINFO_BYROUTINGSECTIONID, query = "Select new com.tsystems.rubin.server.dal.dvo.RoutingSectionTypeInfoDVO"
				+ RoutingSection.ROUTINGSECTIONTYPE_L_FIELDS_STRING
				+ " from RoutingSection rs" + " where rs.id = ?1"),
		@NamedQuery(name = NamedQueryConstants.FIND_K_ROUTINGSCTIONTYPEINFO_BYROUTINGSECTIONID, query = "Select new com.tsystems.rubin.server.dal.dvo.RoutingSectionTypeInfoDVO"
				+ RoutingSection.ROUTINGSECTIONTYPE_K_FIELDS_STRING
				+ " from RoutingSection rs, IN (rs.channels) ch"
				+ " where rs.id = ?1")
			
 })
@Entity
@Table(name="FUEHRUNGSABSCHNITT")
public class RoutingSection implements Serializable {
	
	@Transient
    final static String COMMON_PICKLIST_FIELDS_STRING = "(rs.id, rs.type)";
	
	@Transient
	final static String ROUTINGSECTIONTYPE_P_FIELDS_STRING = "(rs.position.lineSegment.line.lineId," +
			                                                 " rs.position.lineSegment.code, " +
			                                                 " rs.position.lineSegment.length, " +
			                                                 " rs.position.lineSegment.line.lineType.speed, " +
			                                                 " rs.position.lineSegment.terminal.site.designationNational," +
			                                                 " rs.position.lineSegment.terminal.ituSuffix," +
			                                                 " rs.position.lineSegment.terminal0.site.designationNational," +
			                                                 " rs.position.lineSegment.terminal0.ituSuffix)";
	@Transient
	final static String ROUTINGSECTIONTYPE_L_FIELDS_STRING = "(rs.tunnel.type," +
			                                                 " rs.tunnel.terminal.site.designationNational," +
			                                                 " rs.tunnel.terminal.ituSuffix," +
			                                                 " rs.tunnel.terminal0.site.designationNational," +
			                                                 " rs.tunnel.terminal0.ituSuffix, " +
			                                                 " rs.tunnel.terminal.site.basicLatitude, " +
                                                             " rs.tunnel.terminal.site.basicLongitude, " +
                                                             " rs.tunnel.terminal0.site.basicLatitude, " +
                                                             " rs.tunnel.terminal0.site.basicLongitude)";
	@Transient
	final static String ROUTINGSECTIONTYPE_K_FIELDS_STRING = "(ch.configuration.circuit.id," +
			                                                 " ch.configuration.circuit.sno," +
			                                                 " ch.configuration.circuit.delayMainMs," +
			                                                 " ch.configuration.circuit.lsc.code," +
			                                                 " ch.configuration.circuit.terminalA.site.designationNational," +
			                                                 " ch.configuration.circuit.terminalA.ituSuffix," +
			                                                 " ch.configuration.circuit.terminalB.site.designationNational," +
			                                                 " ch.configuration.circuit.terminalB.ituSuffix)";
	
	@Id
	@Column(name="OID_FUEHRUNGSABSCH")
	private Long id;

	@Column(name="FUEHRUNGSABSCHNITT")
	private String type;

	@Column(name="FUEHRUNGSABSCHNIT0")
	private Long sequencNumber;

	@Column(name="FUEHRUNGSABSCHNIT1")
	private Long sequenceFactor;

	@Column(name="FUEHRUNGSABSCHNIT2")
	private String remark;

	@Column(name="FUEHRUNGSAB_IHRS_CONSISTENCY")
	private String ihrsConsistency;

	@Column(name="FUEHRUNGSAB_IHRS_DESIGN_DATE")
	private Date ihrsDesignDate;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_FUEHRUNGOID_FUE")
	private Routing routing;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LAENDERKANTEOID")
	private Tunnel tunnel;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LEGOID_LEG")
	private Leg leg;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_POSITION0OID_PO")
	private Position position;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SECURE_SECTIOID_SECURE_SECT")
	private SecureSection secureSection;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ALIASBEZEICHOID_ALIASBEZEIC")
	private AliasDescription aliasDescription;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_NUTZUNGSKONTOID_NUTZUNGSKON")
	private Nutzungskontingent nutzungskontingent;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WORKING_AREAOID_WORKING_ARE")
	private WorkingArea workingArea;
	
	
	
	@OneToMany(mappedBy="routingSection")
	private Set<CrossConnect> crossConnects;

	@OneToMany(mappedBy="routingSection")
	private Set<InhouseRoutingSection> inhouseRoutingSections;

	@OneToMany(mappedBy="routingSection")
	private Set<LocalLoopSection> localLoopSections;

	@ManyToMany
	@JoinTable(name="BELEGT_A_ODER_B",
		joinColumns=@JoinColumn(name="FK_FUEHRUNGSABSOID_FUEHRUNGSAB"),
		inverseJoinColumns=@JoinColumn(name="FK_WIRING_UNITOID_WIRING_UNIT"))
	private Set<WiringUnit> wiringUnits;

	@ManyToMany
	@JoinTable(name="STRUCTURES",
		joinColumns=@JoinColumn(name="FK_FUEHRUNGSABSOID_FUEHRUNGSAB"),
		inverseJoinColumns=@JoinColumn(name="FK_STRUCT_INFOOID_STRUCT_INFO"))
	private Set<StructuredInformation> structuredInformations;

	@ManyToMany
	@JoinTable(name="IST_ZUGEODNET_AUF",
		joinColumns=@JoinColumn(name="FK_FUEHRUNGSABSOID"),
		inverseJoinColumns=@JoinColumn(name="FK_PORTOID_PORT"))
	private Set<Port> ports;
	
	@ManyToMany
	@JoinTable(name="WEIST_AUF",
		joinColumns=@JoinColumn(name="FK_FUEHRUNGSABSOID"),
		inverseJoinColumns=@JoinColumn(name="FK_KANALOID_KANAL"))
	private Set<Channel> channels;

	private static final long serialVersionUID = 1L;

	public RoutingSection() {
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the sequencNumber
	 */
	public Long getSequencNumber() {
		return sequencNumber;
	}

	/**
	 * @param sequencNumber the sequencNumber to set
	 */
	public void setSequencNumber(Long sequencNumber) {
		this.sequencNumber = sequencNumber;
	}

	/**
	 * @return the sequenceFactor
	 */
	public Long getSequenceFactor() {
		return sequenceFactor;
	}

	/**
	 * @param sequenceFactor the sequenceFactor to set
	 */
	public void setSequenceFactor(Long sequenceFactor) {
		this.sequenceFactor = sequenceFactor;
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
	 * @return the routing
	 */
	public Routing getRouting() {
		return routing;
	}

	/**
	 * @param routing the routing to set
	 */
	public void setRouting(Routing routing) {
		this.routing = routing;
	}

	/**
	 * @return the tunnel
	 */
	public Tunnel getTunnel() {
		return tunnel;
	}

	/**
	 * @param tunnel the tunnel to set
	 */
	public void setTunnel(Tunnel tunnel) {
		this.tunnel = tunnel;
	}

	/**
	 * @return the leg
	 */
	public Leg getLeg() {
		return leg;
	}

	/**
	 * @param leg the leg to set
	 */
	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	/**
	 * @return the position
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	/**
	 * @return the secureSection
	 */
	public SecureSection getSecureSection() {
		return secureSection;
	}

	/**
	 * @param secureSection the secureSection to set
	 */
	public void setSecureSection(SecureSection secureSection) {
		this.secureSection = secureSection;
	}

	/**
	 * @return the aliasDescription
	 */
	public AliasDescription getAliasDescription() {
		return aliasDescription;
	}

	/**
	 * @param aliasDescription the aliasDescription to set
	 */
	public void setAliasDescription(AliasDescription aliasDescription) {
		this.aliasDescription = aliasDescription;
	}

	/**
	 * @return the nutzungskontingent
	 */
	public Nutzungskontingent getNutzungskontingent() {
		return nutzungskontingent;
	}

	/**
	 * @param nutzungskontingent the nutzungskontingent to set
	 */
	public void setNutzungskontingent(Nutzungskontingent nutzungskontingent) {
		this.nutzungskontingent = nutzungskontingent;
	}

	/**
	 * @return the workingArea
	 */
	public WorkingArea getWorkingArea() {
		return workingArea;
	}

	/**
	 * @param workingArea the workingArea to set
	 */
	public void setWorkingArea(WorkingArea workingArea) {
		this.workingArea = workingArea;
	}

	/**
	 * @return the crossConnects
	 */
	public Set<CrossConnect> getCrossConnects() {
		return crossConnects;
	}

	/**
	 * @param crossConnects the crossConnects to set
	 */
	public void setCrossConnects(Set<CrossConnect> crossConnects) {
		this.crossConnects = crossConnects;
	}

	/**
	 * @return the inhouseRoutingSections
	 */
	public Set<InhouseRoutingSection> getInhouseRoutingSections() {
		return inhouseRoutingSections;
	}

	/**
	 * @param inhouseRoutingSections the inhouseRoutingSections to set
	 */
	public void setInhouseRoutingSections(
			Set<InhouseRoutingSection> inhouseRoutingSections) {
		this.inhouseRoutingSections = inhouseRoutingSections;
	}

	/**
	 * @return the localLoopSections
	 */
	public Set<LocalLoopSection> getLocalLoopSections() {
		return localLoopSections;
	}

	/**
	 * @param localLoopSections the localLoopSections to set
	 */
	public void setLocalLoopSections(Set<LocalLoopSection> localLoopSections) {
		this.localLoopSections = localLoopSections;
	}

	/**
	 * @return the wiringUnits
	 */
	public Set<WiringUnit> getWiringUnits() {
		return wiringUnits;
	}

	/**
	 * @param wiringUnits the wiringUnits to set
	 */
	public void setWiringUnits(Set<WiringUnit> wiringUnits) {
		this.wiringUnits = wiringUnits;
	}

	/**
	 * @return the structuredInformations
	 */
	public Set<StructuredInformation> getStructuredInformations() {
		return structuredInformations;
	}

	/**
	 * @param structuredInformations the structuredInformations to set
	 */
	public void setStructuredInformations(
			Set<StructuredInformation> structuredInformations) {
		this.structuredInformations = structuredInformations;
	}

	/**
	 * @return the ports
	 */
	public Set<Port> getPorts() {
		return ports;
	}

	/**
	 * @param ports the ports to set
	 */
	public void setPorts(Set<Port> ports) {
		this.ports = ports;
	}

	/**
	 * @return the channels
	 */
	public Set<Channel> getChannels() {
		return channels;
	}

	/**
	 * @param channels the channels to set
	 */
	public void setChannels(Set<Channel> channels) {
		this.channels = channels;
	}


}
