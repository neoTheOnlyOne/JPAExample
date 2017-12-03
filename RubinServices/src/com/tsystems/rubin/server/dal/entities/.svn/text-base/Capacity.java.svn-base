package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.tsystems.rubin.common.util.NamedQueryConstants;

/**
 * The Class Capacity. - An entity for KAPAZITAET table.
 */
@NamedQueries( {
	@NamedQuery(name = NamedQueryConstants.CAPACITY_FINDALL, query = "Select new com.tsystems.rubin.server.dal.dvo.CapacityDVO"
			+ Capacity.COMMON_PICKLIST_FIELDS_STRING
			+ " from Capacity c "
			+ "order by c.name"),
	@NamedQuery(name = NamedQueryConstants.CAPACITY_FINDROUTINGCAPACITY, query = "Select distinct new com.tsystems.rubin.server.dal.dvo.CapacityDVO"
			+ Capacity.COMMON_PICKLIST_FIELDS_STRING
			+ " from CapacityRequired cr JOIN cr.capacity c  "
			+ " JOIN cr.lsc l "),
	@NamedQuery(name = NamedQueryConstants.CAPACITY_FINDCHANNELSCAPACITY, query = "Select distinct new com.tsystems.rubin.server.dal.dvo.CapacityDVO"
			+ Capacity.COMMON_PICKLIST_FIELDS_STRING
			+ " from Tributary cr JOIN cr.capacity c JOIN cr.tribScheme ts JOIN ts.lsc l "
			+ " order by c.name"),
	@NamedQuery(name = NamedQueryConstants.CAPACITY_COUNTCAPACITYBYNAME, query = "Select count(c)"
			+ " from Capacity c where trim(both from c.name) like ?1"),
	@NamedQuery(name = NamedQueryConstants.CAPACITY_FINDALLFORTRANSSEARCH, query = "Select new com.tsystems.rubin.server.dal.dvo.CapacityDVO"
			+ Capacity.TRANS_COMMON_PICKLIST_FIELDS_STRING
			+ " from Capacity c " + "order by c.name") })
@Entity
@Table(name = "KAPAZITAET")
public class Capacity implements Serializable {

	/** The Constant COMMON_PICKLIST_FIELDS_STRING. */
	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(c.id, c.name, "
			+ "c.sequence, c.factor, c.unit, " + "c.description, "
			+ "c.defaultCapacity)";

	/** The Constant TRANS_COMMON_PICKLIST_FIELDS_STRING. */
	@Transient
	final static String TRANS_COMMON_PICKLIST_FIELDS_STRING = "(c.id, c.name)";

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Capacity")
	@SequenceGenerator(name = "Capacity", sequenceName = "KAPAZITAET_SEQUENCE", allocationSize = 1)
	@Column(name = "OID_KAPAZITAET")
	private Long id;

	/** The name. */
	@Column(name = "KAPAZITAETSWERT")
	private String name;

	/** The sequence. */
	@Column(name = "KAPAZITAETSREIHENF")
	private Long sequence;

	/** The factor. */
	@Column(name = "KAPAZITAETSFAKTOR")
	private Long factor;

	/** The unit. */
	@Column(name = "KAPAITAETSFAKTOREI")
	private String unit;

	/** The description. */
	@Column(name = "KAPAZITAETSBEMERKU")
	private String description;

	/** The default capacity. */
	@Column(name = "KAPAZITAETS_DEFAULTWERT")
	private String defaultCapacity;

	@OneToMany(mappedBy = "capacity")
	private Set<Position> position0s;

	@OneToMany(mappedBy = "capacity")
	private Set<Port> ports;

	@OneToMany(mappedBy = "capacity")
	private Set<EqType> eqTypes;

	@OneToMany(mappedBy = "capacity")
	private Set<Channel> channels;

	@OneToMany(mappedBy = "capacity")
	private Set<CapacityRequired> capacitiesRequired;

	@OneToMany(mappedBy = "capacity")
	private Set<Tributary> tributaries;

	@OneToMany(mappedBy="capacity")
	private Set<Transitteilmenge> transitteilmenges;

	@OneToMany(mappedBy="capacity")
	private Set<Transit> transits;

	@OneToMany(mappedBy="capacity")
	private Set<LeadTime> leadTimes;

	@OneToMany(mappedBy="capacity")
	private Set<CardType> cardTypes;

	@OneToMany(mappedBy="capacity")
	private Set<IruKontingent> iruKontingents;

	
	@OneToMany(mappedBy="capacity")
	private Set<LocalLoopSection> localLoopSections;

	@OneToMany(mappedBy="capacity")
	private Set<Nutzungskontingent> nutzungskontingents;

	@OneToMany(mappedBy="capacity")
	private Set<LAbschnittfehler> lAbschnittfehlers;

	@OneToMany(mappedBy="capacity")
	private Set<Interface> interfaces;

	@OneToMany(mappedBy="capacity")
	private Set<Nutzungsrechte> nutzungsrechtes;

	@OneToMany(mappedBy="capacity")
	private Set<Nutzungsrechte> nutzungsrechtes2;

	@OneToMany(mappedBy="capacity")
	private Set<Nutzungsrechte> nutzungsrechtes3;

	/**
	 * Instantiates a new capacity.
	 */
	public Capacity() {
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
	 * @return the sequence
	 */
	public Long getSequence() {
		return sequence;
	}


	/**
	 * @param sequence the sequence to set
	 */
	public void setSequence(Long sequence) {
		this.sequence = sequence;
	}


	/**
	 * @return the factor
	 */
	public Long getFactor() {
		return factor;
	}


	/**
	 * @param factor the factor to set
	 */
	public void setFactor(Long factor) {
		this.factor = factor;
	}


	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}


	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the defaultCapacity
	 */
	public String getDefaultCapacity() {
		return defaultCapacity;
	}


	/**
	 * @param defaultCapacity the defaultCapacity to set
	 */
	public void setDefaultCapacity(String defaultCapacity) {
		this.defaultCapacity = defaultCapacity;
	}


	/**
	 * @return the position0s
	 */
	public Set<Position> getPosition0s() {
		return position0s;
	}


	/**
	 * @param position0s the position0s to set
	 */
	public void setPosition0s(Set<Position> position0s) {
		this.position0s = position0s;
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
	 * @return the eqTypes
	 */
	public Set<EqType> getEqTypes() {
		return eqTypes;
	}


	/**
	 * @param eqTypes the eqTypes to set
	 */
	public void setEqTypes(Set<EqType> eqTypes) {
		this.eqTypes = eqTypes;
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


	/**
	 * @return the capacitiesRequired
	 */
	public Set<CapacityRequired> getCapacitiesRequired() {
		return capacitiesRequired;
	}


	/**
	 * @param capacitiesRequired the capacitiesRequired to set
	 */
	public void setCapacitiesRequired(Set<CapacityRequired> capacitiesRequired) {
		this.capacitiesRequired = capacitiesRequired;
	}


	/**
	 * @return the tributaries
	 */
	public Set<Tributary> getTributaries() {
		return tributaries;
	}


	/**
	 * @param tributaries the tributaries to set
	 */
	public void setTributaries(Set<Tributary> tributaries) {
		this.tributaries = tributaries;
	}


	/**
	 * @return the transitteilmenges
	 */
	public Set<Transitteilmenge> getTransitteilmenges() {
		return transitteilmenges;
	}


	/**
	 * @param transitteilmenges the transitteilmenges to set
	 */
	public void setTransitteilmenges(Set<Transitteilmenge> transitteilmenges) {
		this.transitteilmenges = transitteilmenges;
	}


	/**
	 * @return the transits
	 */
	public Set<Transit> getTransits() {
		return transits;
	}


	/**
	 * @param transits the transits to set
	 */
	public void setTransits(Set<Transit> transits) {
		this.transits = transits;
	}


	/**
	 * @return the leadTimes
	 */
	public Set<LeadTime> getLeadTimes() {
		return leadTimes;
	}


	/**
	 * @param leadTimes the leadTimes to set
	 */
	public void setLeadTimes(Set<LeadTime> leadTimes) {
		this.leadTimes = leadTimes;
	}


	/**
	 * @return the cardTypes
	 */
	public Set<CardType> getCardTypes() {
		return cardTypes;
	}


	/**
	 * @param cardTypes the cardTypes to set
	 */
	public void setCardTypes(Set<CardType> cardTypes) {
		this.cardTypes = cardTypes;
	}


	/**
	 * @return the iruKontingents
	 */
	public Set<IruKontingent> getIruKontingents() {
		return iruKontingents;
	}


	/**
	 * @param iruKontingents the iruKontingents to set
	 */
	public void setIruKontingents(Set<IruKontingent> iruKontingents) {
		this.iruKontingents = iruKontingents;
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
	 * @return the nutzungskontingents
	 */
	public Set<Nutzungskontingent> getNutzungskontingents() {
		return nutzungskontingents;
	}


	/**
	 * @param nutzungskontingents the nutzungskontingents to set
	 */
	public void setNutzungskontingents(Set<Nutzungskontingent> nutzungskontingents) {
		this.nutzungskontingents = nutzungskontingents;
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
	 * @return the interfaces
	 */
	public Set<Interface> getInterfaces() {
		return interfaces;
	}


	/**
	 * @param interfaces the interfaces to set
	 */
	public void setInterfaces(Set<Interface> interfaces) {
		this.interfaces = interfaces;
	}


	/**
	 * @return the nutzungsrechtes
	 */
	public Set<Nutzungsrechte> getNutzungsrechtes() {
		return nutzungsrechtes;
	}


	/**
	 * @param nutzungsrechtes the nutzungsrechtes to set
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
	 * @param nutzungsrechtes2 the nutzungsrechtes2 to set
	 */
	public void setNutzungsrechtes2(Set<Nutzungsrechte> nutzungsrechtes2) {
		this.nutzungsrechtes2 = nutzungsrechtes2;
	}


	/**
	 * @return the nutzungsrechtes3
	 */
	public Set<Nutzungsrechte> getNutzungsrechtes3() {
		return nutzungsrechtes3;
	}


	/**
	 * @param nutzungsrechtes3 the nutzungsrechtes3 to set
	 */
	public void setNutzungsrechtes3(Set<Nutzungsrechte> nutzungsrechtes3) {
		this.nutzungsrechtes3 = nutzungsrechtes3;
	}


	/**
	 * toString.
	 * 
	 * @return
	 * 
	 * @see java.lang.Object#toString()
	 */

	public String toString() {
		return new ToStringBuilder(this).append("id", this.id).append("name",
				this.name).append("defaultCapacity", this.defaultCapacity)
				.append("unit", this.unit).append("sequence", this.sequence)
				.append("description", this.description).append("factor",
						this.factor).toString();

	}

	/**
	 * equals.
	 * 
	 * @param object
	 * @return
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

	public boolean equals(Object object) {
		if (!(object instanceof Capacity)) {
			return false;
		}
		Capacity rhs = (Capacity) object;
		return new EqualsBuilder().append(this.name, rhs.name).append(
				this.defaultCapacity, rhs.defaultCapacity).append(this.unit,
				rhs.unit).append(this.sequence, rhs.sequence).append(
				this.description, rhs.description).append(this.factor,
				rhs.factor).isEquals();
	}

	/**
	 * hashCode.
	 * 
	 * @return
	 * 
	 * @see java.lang.Object#hashCode()
	 */

	public int hashCode() {
		return new HashCodeBuilder(1779553455, 1904947793).append(this.name)
				.append(this.defaultCapacity).append(this.unit).append(
						this.sequence).append(this.description).append(
						this.factor).toHashCode();
	}

}
