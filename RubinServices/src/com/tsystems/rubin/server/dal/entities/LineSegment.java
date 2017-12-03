package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LINIENABSCHNITT")
public class LineSegment implements Serializable {
	@Id
	@Column(name="OID_LINIENABSCHNIT")
	private Long id;

	@Column(name="BEARBEITERKENNUNG")
	private String userId;

	@Column(name="EXCLUDE_VIOLATION")
	private String excludeViolation;

	@Column(name="L_ABSCHNITTSCODE")
	private String code;

	@Column(name="LETZTE_AKTUALISIER")
	private Date lastUpdate;

	@Column(name="LINIENABSCHNITTLAE")
	private BigDecimal length;

	@Column(name="LINIENABSCHNITTNOT")
	private String remark;

	@Column(name="LINIENABSCHNITTNUM")
	private Long number;

	@Column(name="RESTAURATIONHINWEI")
	private String restorationNote;
	
	@Column(name="RFCS_IST")
	private Date rfcsActual;

	@Column(name="RFCS_SOLL")
	private Date rfcsplanned;

	@Column(name="RFPA_IST")
	private Date rfpaActual;

	@Column(name="RFPA_SOLL")
	private Date rfpaPlanned;

	@Column(name="SOLL_AUFHEBUNG_LIN")
	private Date disConnectionPlanned;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK1ENDPUNKTOID_END")
	private Terminal terminal1;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK0ENDPUNKTOID_END")
	private Terminal terminal0;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ENDPUNKTOID_END")
	private Terminal terminal;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KABELFORMOID_KA")
	private CableForm cableForm;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LINIEOID_LINIE")
	private Line line;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_REGIONOID_REGIO")
	private Region region;

	@OneToMany(mappedBy="lineSegment")
	private Set<Terminalinfo> terminalInfos;

	@OneToMany(mappedBy="lineSegment")
	private Set<LAbschnittfehler> lAbschnittfehlers;

	@OneToMany(mappedBy="lineSegment")
	private Set<Position> positions;

	@OneToMany(mappedBy="lineSegments")
	private Set<LAbschnittkapazit> lAbschnittkapazits;

	@ManyToMany
	@JoinTable(name="KANN_GEHOEREN_ZU",
		joinColumns=@JoinColumn(name="FK_LINIENABSCHNOID"),
		inverseJoinColumns=@JoinColumn(name="FK_REGIONOID_REGIO"))
	private Set<Region> regions;

	@ManyToMany(mappedBy="lineSegments")
	private Set<Property> properties;

	private static final long serialVersionUID = 1L;

	public LineSegment() {
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
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the lastUpdate
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * @param lastUpdate the lastUpdate to set
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * @return the length
	 */
	public BigDecimal getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(BigDecimal length) {
		this.length = length;
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
	 * @return the number
	 */
	public Long getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(Long number) {
		this.number = number;
	}

	/**
	 * @return the restorationNote
	 */
	public String getRestorationNote() {
		return restorationNote;
	}

	/**
	 * @param restorationNote the restorationNote to set
	 */
	public void setRestorationNote(String restorationNote) {
		this.restorationNote = restorationNote;
	}

	/**
	 * @return the rfcsActual
	 */
	public Date getRfcsActual() {
		return rfcsActual;
	}

	/**
	 * @param rfcsActual the rfcsActual to set
	 */
	public void setRfcsActual(Date rfcsActual) {
		this.rfcsActual = rfcsActual;
	}

	/**
	 * @return the rfcsplanned
	 */
	public Date getRfcsplanned() {
		return rfcsplanned;
	}

	/**
	 * @param rfcsplanned the rfcsplanned to set
	 */
	public void setRfcsplanned(Date rfcsplanned) {
		this.rfcsplanned = rfcsplanned;
	}

	/**
	 * @return the rfpaActual
	 */
	public Date getRfpaActual() {
		return rfpaActual;
	}

	/**
	 * @param rfpaActual the rfpaActual to set
	 */
	public void setRfpaActual(Date rfpaActual) {
		this.rfpaActual = rfpaActual;
	}

	/**
	 * @return the rfpaPlanned
	 */
	public Date getRfpaPlanned() {
		return rfpaPlanned;
	}

	/**
	 * @param rfpaPlanned the rfpaPlanned to set
	 */
	public void setRfpaPlanned(Date rfpaPlanned) {
		this.rfpaPlanned = rfpaPlanned;
	}

	/**
	 * @return the disConnectionPlanned
	 */
	public Date getDisConnectionPlanned() {
		return disConnectionPlanned;
	}

	/**
	 * @param disConnectionPlanned the disConnectionPlanned to set
	 */
	public void setDisConnectionPlanned(Date disConnectionPlanned) {
		this.disConnectionPlanned = disConnectionPlanned;
	}

	/**
	 * @return the terminal1
	 */
	public Terminal getTerminal1() {
		return terminal1;
	}

	/**
	 * @param terminal1 the terminal1 to set
	 */
	public void setTerminal1(Terminal terminal1) {
		this.terminal1 = terminal1;
	}

	/**
	 * @return the terminal0
	 */
	public Terminal getTerminal0() {
		return terminal0;
	}

	/**
	 * @param terminal0 the terminal0 to set
	 */
	public void setTerminal0(Terminal terminal0) {
		this.terminal0 = terminal0;
	}

	/**
	 * @return the terminal
	 */
	public Terminal getTerminal() {
		return terminal;
	}

	/**
	 * @param terminal the terminal to set
	 */
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}

	/**
	 * @return the cableForm
	 */
	public CableForm getCableForm() {
		return cableForm;
	}

	/**
	 * @param cableForm the cableForm to set
	 */
	public void setCableForm(CableForm cableForm) {
		this.cableForm = cableForm;
	}

	/**
	 * @return the line
	 */
	public Line getLine() {
		return line;
	}

	/**
	 * @param line the line to set
	 */
	public void setLine(Line line) {
		this.line = line;
	}

	/**
	 * @return the region
	 */
	public Region getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(Region region) {
		this.region = region;
	}

	/**
	 * @return the terminalInfos
	 */
	public Set<Terminalinfo> getTerminalInfos() {
		return terminalInfos;
	}

	/**
	 * @param terminalInfos the terminalInfos to set
	 */
	public void setTerminalInfos(Set<Terminalinfo> terminalInfos) {
		this.terminalInfos = terminalInfos;
	}

	/**
	 * @return the lAbschnittfehlers
	 */
	public Set<LAbschnittfehler> getLAbschnittfehlers() {
		return lAbschnittfehlers;
	}

	/**
	 * @param abschnittfehlers the lAbschnittfehlers to set
	 */
	public void setLAbschnittfehlers(Set<LAbschnittfehler> abschnittfehlers) {
		lAbschnittfehlers = abschnittfehlers;
	}

	/**
	 * @return the positions
	 */
	public Set<Position> getPositions() {
		return positions;
	}

	/**
	 * @param positions the positions to set
	 */
	public void setPositions(Set<Position> positions) {
		this.positions = positions;
	}

	/**
	 * @return the lAbschnittkapazits
	 */
	public Set<LAbschnittkapazit> getLAbschnittkapazits() {
		return lAbschnittkapazits;
	}

	/**
	 * @param abschnittkapazits the lAbschnittkapazits to set
	 */
	public void setLAbschnittkapazits(Set<LAbschnittkapazit> abschnittkapazits) {
		lAbschnittkapazits = abschnittkapazits;
	}

	/**
	 * @return the regions
	 */
	public Set<Region> getRegions() {
		return regions;
	}

	/**
	 * @param regions the regions to set
	 */
	public void setRegions(Set<Region> regions) {
		this.regions = regions;
	}

	/**
	 * @return the properties
	 */
	public Set<Property> getProperties() {
		return properties;
	}

	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Set<Property> properties) {
		this.properties = properties;
	}

}
