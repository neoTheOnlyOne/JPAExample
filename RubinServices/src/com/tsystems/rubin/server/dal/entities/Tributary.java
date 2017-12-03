package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * The Class Tributary. - An entity for KAPAZITAETSBEREITS table.
 */
@NamedQueries({
        @NamedQuery(name = NamedQueryConstants.TRIBUTARY_FINDBYPARENTTRIBUTARYID, query = "select new com.tsystems.rubin.server.dal.dvo.TributaryDVO"
                + Tributary.COMMON_PICKLIST_FIELDS_STRING_BYTRIBID
                + " from Tributary t where t.tributary.id = ?1 " + " order by t.channel"),
        @NamedQuery(name = NamedQueryConstants.TRIBUTARY_FINDBYTRIBSCHEMEID, query = "select new com.tsystems.rubin.server.dal.dvo.TributaryDVO"
                + Tributary.COMMON_PICKLIST_FIELDS_STRING_BYTRIBSCHEMEID
                + " from Tributary t where t.tribScheme.id = ?1 and t.tributary IS NULL"
                + " order by t.channel"),
        @NamedQuery(name = NamedQueryConstants.TRIBUTARY_COUNTBYTRIBSCHEMEID, query = "select count(t) from Tributary t where t.tribScheme.id = ?1 and t.tributary IS NULL"),
        @NamedQuery(name = NamedQueryConstants.TRIBUTARY_FINDALLTRIBSCHILDCOUNTFORTRIB, query = "select distinct t.id from Tributary t, Tributary ct where t.tributary.id = ?1 and ct.tributary.id=t.id"),

        @NamedQuery(name = NamedQueryConstants.TRIBUTARY_FINDALLTRIBSCHILDCOUNTFORTRIBSCHEME, query = "select distinct t.id from Tributary t, Tributary ct where t.tribScheme.id = ?1 and t.tributary is null and ct.tributary.id=t.id") 
        })
@Entity
@Table(name = "KAPAZITAETSBEREITS")
public class Tributary implements Serializable {
    
    /** The Constant COMMON_PICKLIST_FIELDS_STRING_BYTRIBSCHEMEID. */
    @Transient
    final static String COMMON_PICKLIST_FIELDS_STRING_BYTRIBSCHEMEID = "(t.id, t.sequence, "
            + "t.channel, t.timeSlot, t.capacity.id, t.capacity.name, t.notUsable, t.chanLevel, t.tribScheme.id)";

    /** The Constant COMMON_PICKLIST_FIELDS_STRING_BYTRIBID. */
    @Transient
    final static String COMMON_PICKLIST_FIELDS_STRING_BYTRIBID = "(t.id, t.sequence, "
            + "t.channel, t.timeSlot, t.capacity.id, t.capacity.name, t.notUsable, t.chanLevel, t.tribScheme.id, t.tributary.id)";

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Tributary")
    @SequenceGenerator(name = "Tributary", sequenceName = "KAPAZITAETSBEREITS_SEQUENCE", allocationSize = 1)
    @Column(name = "OID_KAPAZITAETSBER")
    private Long id;

    /** The sequence. */
    @Column(name = "VORGABE_KANALREIHE")
    private Long sequence;

    /** The channel. */
    @Column(name = "VORGABE_KANALBEZEI")
    private String channel;

    /** The time slot. */
    @Column(name = "VORGABE_ZEITSCHLIT")
    private String timeSlot;

    /** The chan level. */
    @Column(name = "LEVEL0")
    private Long chanLevel;

    /** The not usable. */
    @Column(name = "NOT_USABLE")
    private String notUsable;

    /** The trib scheme. */
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "FK_KANALRASTEROID")
    private TribScheme tribScheme;

    /** The capacity. */
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "FK_KAPAZITAETOID_K")
    private Capacity capacity;

    /** The tributary. */
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "FK_KAPAZITAETSBOID_KAPAZITAETS")
    private Tributary tributary;

    /** The tributary collection. */
    @OneToMany(mappedBy = "tributary")
    private Set<Tributary> tributaries;

    /**
     * Instantiates a new tributary.
     */
    public Tributary() {
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
	 * @return the timeSlot
	 */
	public String getTimeSlot() {
		return timeSlot;
	}


	/**
	 * @param timeSlot the timeSlot to set
	 */
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}


	/**
	 * @return the chanLevel
	 */
	public Long getChanLevel() {
		return chanLevel;
	}


	/**
	 * @param chanLevel the chanLevel to set
	 */
	public void setChanLevel(Long chanLevel) {
		this.chanLevel = chanLevel;
	}


	/**
	 * @return the notUsable
	 */
	public String getNotUsable() {
		return notUsable;
	}


	/**
	 * @param notUsable the notUsable to set
	 */
	public void setNotUsable(String notUsable) {
		this.notUsable = notUsable;
	}


	/**
	 * @return the tribScheme
	 */
	public TribScheme getTribScheme() {
		return tribScheme;
	}


	/**
	 * @param tribScheme the tribScheme to set
	 */
	public void setTribScheme(TribScheme tribScheme) {
		this.tribScheme = tribScheme;
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
	 * @return the tributary
	 */
	public Tributary getTributary() {
		return tributary;
	}


	/**
	 * @param tributary the tributary to set
	 */
	public void setTributary(Tributary tributary) {
		this.tributary = tributary;
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
     * toString.
     * 
     * @return
     * 
     * @see java.lang.Object#toString()
     */

    public String toString() {
        return new ToStringBuilder(this).append("id", this.id).append("tributary", this.tributary)
                .append("tribScheme", this.tribScheme).append("capacity", this.capacity).append(
                        "chanLevel", this.chanLevel).append("notUsable", this.notUsable).append(
                        "channel", this.channel).append("sequence", this.sequence).append(
                        "timeSlot", this.timeSlot).toString();
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
        if (!(object instanceof Tributary)) {
            return false;
        }
        Tributary rhs = (Tributary) object;
        return new EqualsBuilder().append(this.tributary, rhs.tributary).append(this.tribScheme,
                rhs.tribScheme).append(this.capacity, rhs.capacity).append(this.chanLevel,
                rhs.chanLevel).append(this.notUsable, rhs.notUsable).append(this.channel,
                rhs.channel).append(this.sequence, rhs.sequence)
                .append(this.timeSlot, rhs.timeSlot).isEquals();
    }

    /**
     * hashCode.
     * 
     * @return
     * 
     * @see java.lang.Object#hashCode()
     */

    public int hashCode() {
        return new HashCodeBuilder(523033245, 294298157).append(this.tributary).append(
                this.tribScheme).append(this.capacity).append(this.chanLevel)
                .append(this.notUsable).append(this.channel).append(this.sequence).append(
                        this.timeSlot).toHashCode();
    }
}

