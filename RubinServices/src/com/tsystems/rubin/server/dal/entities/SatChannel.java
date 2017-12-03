package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SAT_KANAL")
public class SatChannel implements Serializable {
	@Id
	@Column(name="OID_SAT_KANAL")
	private Long id;

	@Column(name="IC_EMPFANGS_CHANNE")
	private String receiveChannel;

	@Column(name="IC_SENDE_CHANNEL")
	private String transmitChannel;

	@Column(name="SC_CHANNEL_ART")
	private String type;

	@Column(name="SC_DISTANCE_CHANNE")
	private String distanceChannel;

	@Column(name="SC_LOCAL_CHANNEL")
	private String localChannel;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KANALOID_KANAL")
	private Channel channel;

	private static final long serialVersionUID = 1L;

	public SatChannel() {
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
	 * @return the receiveChannel
	 */
	public String getReceiveChannel() {
		return receiveChannel;
	}

	/**
	 * @param receiveChannel the receiveChannel to set
	 */
	public void setReceiveChannel(String receiveChannel) {
		this.receiveChannel = receiveChannel;
	}

	/**
	 * @return the transmitChannel
	 */
	public String getTransmitChannel() {
		return transmitChannel;
	}

	/**
	 * @param transmitChannel the transmitChannel to set
	 */
	public void setTransmitChannel(String transmitChannel) {
		this.transmitChannel = transmitChannel;
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
	 * @return the distanceChannel
	 */
	public String getDistanceChannel() {
		return distanceChannel;
	}

	/**
	 * @param distanceChannel the distanceChannel to set
	 */
	public void setDistanceChannel(String distanceChannel) {
		this.distanceChannel = distanceChannel;
	}

	/**
	 * @return the localChannel
	 */
	public String getLocalChannel() {
		return localChannel;
	}

	/**
	 * @param localChannel the localChannel to set
	 */
	public void setLocalChannel(String localChannel) {
		this.localChannel = localChannel;
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


}
