/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: TributaryDVO.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update:  Jun 25, 2009 
 * 
 * Copyright © 2008 by T-Systems International GmbH, 
 * Frankfurt/Main
 * All rights, including that of the extracts pressure, 
 * photomechanical reproduction (including microscopy),
 * and the evaluation of databases, or similar
 * organizations, reserved.
 * 
 */
package com.tsystems.rubin.server.dal.dvo;

import java.io.Serializable;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.tsystems.rubin.common.util.CommonUtilities;

/**
 * The Class TributaryDVO.- data value objects used in constructor query expression for Tributary.
 */
public class TributaryDVO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    private Long id;

    /** The sequence. */
    private String sequence;

    /** The channel. */
    private String channel;

    /** The time slot. */
    private String timeSlot;

    /** The capacity dvo. */
    private CapacityDVO capacityDVO;

    /** The trib scheme dvo. */
    private TribSchemeDVO tribSchemeDVO;

    /** The tributary dvo collection. */
    private Set<TributaryDVO> tributaryDVOs;

    /** The parent tributary dvo. */
    private TributaryDVO parentTributaryDVO;

    /** The not usable. */
    private String notUsable;

    /** The chan level. */
    private String chanLevel;

    /**
     * Instantiates a new tributary dvo.
     */
    public TributaryDVO() {

    }

    /**
     * Instantiates a new tributary dvo.
     * 
     * @param id
     *            the id
     * @param sequence
     *            the sequence
     * @param channel
     *            the channel
     * @param timeSlot
     *            the time slot
     * @param capacityId
     *            the capacity id
     * @param name
     *            the name
     * @param notUsable
     *            the not usable
     * @param chanLevel
     *            the chan level
     * @param tribSchemeDVOId
     *            the trib scheme dvo id
     * @param parentTributaryDVOId
     *            the parent tributary dvo id
     */
    public TributaryDVO(Long id, Long sequence, String channel, String timeSlot, Long capacityId,
            String name, String notUsable, Long chanLevel, Long tribSchemeDVOId,
            Long parentTributaryDVOId) {
        this.id = id;
        this.sequence = String.valueOf(sequence);
        this.channel = channel;
        this.timeSlot = timeSlot;
        this.capacityDVO = new CapacityDVO();
        if (name != null) {
            this.capacityDVO.setId(capacityId);
            this.capacityDVO.setName(name);
        }
        this.notUsable = notUsable;
        this.chanLevel = String.valueOf(chanLevel);

        this.tribSchemeDVO = new TribSchemeDVO();
        this.tribSchemeDVO.setId(tribSchemeDVOId);

        this.parentTributaryDVO = new TributaryDVO();
        this.parentTributaryDVO.setId(parentTributaryDVOId);
    }

    /**
     * Instantiates a new tributary dvo.
     * 
     * @param id
     *            the id
     * @param sequence
     *            the sequence
     * @param channel
     *            the channel
     * @param timeSlot
     *            the time slot
     * @param capacityId
     *            the capacity id
     * @param name
     *            the name
     * @param notUsable
     *            the not usable
     * @param chanLevel
     *            the chan level
     * @param tribSchemeTOId
     *            the trib scheme to id
     */
    public TributaryDVO(Long id, Long sequence, String channel, String timeSlot, Long capacityId,
            String name, String notUsable, Long chanLevel, Long tribSchemeTOId) {
        this.id = id;
        this.sequence = String.valueOf(sequence);
        this.channel = channel;
        this.timeSlot = timeSlot;
        this.capacityDVO = new CapacityDVO();
        if (name != null) {
            this.capacityDVO.setId(capacityId);
            this.capacityDVO.setName(name);
        }
        this.notUsable = notUsable;
        this.chanLevel = String.valueOf(chanLevel);

        this.tribSchemeDVO = new TribSchemeDVO();
        this.tribSchemeDVO.setId(tribSchemeTOId);

    }

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public final Long getId() {
        return id;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public final void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the sequence.
     * 
     * @return the sequence
     */
    public final String getSequence() {
        return CommonUtilities.getTextValue(sequence);
    }

    /**
     * Sets the sequence.
     * 
     * @param sequence
     *            the new sequence
     */
    public final void setSequence(String sequence) {
        this.sequence = sequence;
    }

    /**
     * Gets the channel.
     * 
     * @return the channel
     */
    public final String getChannel() {
        return CommonUtilities.getTextValue(channel);
    }

    /**
     * Sets the channel.
     * 
     * @param channel
     *            the new channel
     */
    public final void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * Gets the time slot.
     * 
     * @return the time slot
     */
    public final String getTimeSlot() {
        return CommonUtilities.getTextValue(timeSlot);
    }

    /**
     * Sets the time slot.
     * 
     * @param timeSlot
     *            the new time slot
     */
    public final void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    /**
     * Gets the not usable.
     * 
     * @return the not usable
     */
    public final String getNotUsable() {
        return CommonUtilities.getTextValue(notUsable);
    }

    /**
     * Sets the not usable.
     * 
     * @param notUsable
     *            the new not usable
     */
    public final void setNotUsable(String notUsable) {
        this.notUsable = notUsable;
    }

    /**
     * Gets the chan level.
     * 
     * @return the chan level
     */
    public final String getChanLevel() {
        return CommonUtilities.getTextValue(chanLevel);
    }

    /**
     * Sets the chan level.
     * 
     * @param chanLevel
     *            the new chan level
     */
    public final void setChanLevel(String chanLevel) {
        this.chanLevel = chanLevel;
    }

    /**
     * Gets the capacity dvo.
     * 
     * @return the capacity dvo
     */
    public CapacityDVO getCapacityDVO() {
        return capacityDVO;
    }

    /**
     * Sets the capacity dvo.
     * 
     * @param capacityDVO
     *            the new capacity dvo
     */
    public void setCapacityDVO(CapacityDVO capacityDVO) {
        this.capacityDVO = capacityDVO;
    }

    /**
     * Gets the trib scheme dvo.
     * 
     * @return the trib scheme dvo
     */
    public TribSchemeDVO getTribSchemeDVO() {
        return tribSchemeDVO;
    }

    /**
     * Sets the trib scheme dvo.
     * 
     * @param tribSchemeDVO
     *            the new trib scheme dvo
     */
    public void setTribSchemeDVO(TribSchemeDVO tribSchemeDVO) {
        this.tribSchemeDVO = tribSchemeDVO;
    }

    /**
     * Gets the tributary dvo collection.
     * 
     * @return the tributary dvo collection
     */
    public Set<TributaryDVO> getTributaryDVOs() {
        return tributaryDVOs;
    }

    /**
     * Sets the tributary dvo collection.
     * 
     * @param tributaryDVOCollection
     *            the new tributary dvo collection
     */
    public void setTributaryDVOs(Set<TributaryDVO> tributaryDVOCollection) {
        this.tributaryDVOs = tributaryDVOCollection;
    }

    /**
     * Gets the parent tributary dvo.
     * 
     * @return the parent tributary dvo
     */
    public TributaryDVO getParentTributaryDVO() {
        return parentTributaryDVO;
    }

    /**
     * Sets the parent tributary dvo.
     * 
     * @param parentTributaryDVO
     *            the new parent tributary dvo
     */
    public void setParentTributaryDVO(TributaryDVO parentTributaryDVO) {
        this.parentTributaryDVO = parentTributaryDVO;
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
        if (!(object instanceof TributaryDVO)) {
            return false;
        }
        TributaryDVO rhs = (TributaryDVO) object;
        return new EqualsBuilder().append(this.parentTributaryDVO, rhs.parentTributaryDVO).append(
                this.tribSchemeDVO, rhs.tribSchemeDVO).append(this.capacityDVO, rhs.capacityDVO)
                .append(this.chanLevel, rhs.chanLevel).append(this.notUsable, rhs.notUsable)
                .append(this.channel, rhs.channel).append(this.sequence, rhs.sequence).append(
                        this.timeSlot, rhs.timeSlot).isEquals();
    }

    /**
     * hashCode.
     * 
     * @return
     * 
     * @see java.lang.Object#hashCode()
     */

    public int hashCode() {
        return new HashCodeBuilder(523033245, 294298157).append(this.parentTributaryDVO).append(
                this.tribSchemeDVO).append(this.capacityDVO).append(this.chanLevel).append(
                this.notUsable).append(this.channel).append(this.sequence).append(this.timeSlot)
                .toHashCode();
    }

}
