package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="KANAL")
public class Channel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Channel")
	@SequenceGenerator(name = "Channel", sequenceName = "KANAL_SEQUENCE", allocationSize = 1)
	@Column(name="OID_KANAL")
	private Long id	;

	@Column(name="KANAL_GUELTIG_AB")
	private Date validStart;

	@Column(name="KANAL_GUELTIG_BIS")
	private Date validUntil;

	@Column(name="KANALBEZEICHNUNG")
	private String designation;

	@Column(name="KANALREIHENFOLGE")
	private Long sequenceNumber;

	@Column(name="KANALSPERRE")
	private String lockOrUnlock;

	@Column(name="KANALVORMERK")
	private String mark;
	
	@Column(name="ZEITSCHLITZBEZEICH")
	private String timeslotDesignation;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KANALOID_KANAL")
	private Channel channel;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KAPAZITAETOID_K")
	private Capacity capacity;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KONFIGURATIOOID")
	private Configuration configuration;

	@OneToMany(mappedBy="channel")
	private Set<Channel> channels;

	@OneToMany(mappedBy="channel")
	private Set<SatChannel> satChannels;

	@ManyToMany(mappedBy="channels")
	private Set<RoutingSection> routingSections;

	private static final long serialVersionUID = 1L;

	public Channel() {
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
	 * @return the validStart
	 */
	public Date getValidStart() {
		return validStart;
	}

	/**
	 * @param validStart the validStart to set
	 */
	public void setValidStart(Date validStart) {
		this.validStart = validStart;
	}

	/**
	 * @return the validUntil
	 */
	public Date getValidUntil() {
		return validUntil;
	}

	/**
	 * @param validUntil the validUntil to set
	 */
	public void setValidUntil(Date validUntil) {
		this.validUntil = validUntil;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the sequenceNumber
	 */
	public Long getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * @param sequenceNumber the sequenceNumber to set
	 */
	public void setSequenceNumber(Long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	/**
	 * @return the lockOrUnlock
	 */
	public String getLockOrUnlock() {
		return lockOrUnlock;
	}

	/**
	 * @param lockOrUnlock the lockOrUnlock to set
	 */
	public void setLockOrUnlock(String lockOrUnlock) {
		this.lockOrUnlock = lockOrUnlock;
	}

	/**
	 * @return the mark
	 */
	public String getMark() {
		return mark;
	}

	/**
	 * @param mark the mark to set
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}

	/**
	 * @return the timeslotDesignation
	 */
	public String getTimeslotDesignation() {
		return timeslotDesignation;
	}

	/**
	 * @param timeslotDesignation the timeslotDesignation to set
	 */
	public void setTimeslotDesignation(String timeslotDesignation) {
		this.timeslotDesignation = timeslotDesignation;
	}

	/**
	 * @return the channel
	 */
	public Channel getChannel() {
		return channel;
	}

	/**
	 * @param channel the channel to set
	 */
	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	/**
	 * @return the capacity
	 */
	public Capacity getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(Capacity capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the configuration
	 */
	public Configuration getConfiguration() {
		return configuration;
	}

	/**
	 * @param configuration the configuration to set
	 */
	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
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
	 * @return the satChannels
	 */
	public Set<SatChannel> getSatChannels() {
		return satChannels;
	}

	/**
	 * @param satChannels the satChannels to set
	 */
	public void setSatChannels(Set<SatChannel> satChannels) {
		this.satChannels = satChannels;
	}

	/**
	 * @return the routingSections
	 */
	public Set<RoutingSection> getRoutingSections() {
		return routingSections;
	}

	/**
	 * @param routingSections the routingSections to set
	 */
	public void setRoutingSections(Set<RoutingSection> routingSections) {
		this.routingSections = routingSections;
	}

	
}
