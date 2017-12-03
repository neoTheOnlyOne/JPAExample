package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * The Class CapacityRequired. - An entity for KAPAZITAETSBEDARF table.
 */
@Entity
@Table(name = "KAPAZITAETSBEDARF")
public class CapacityRequired implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    @Id
    @Column(name = "OID_KAPAZITAETSBED")
    private Long id;

    /** The number of. */
    @Column(name = "ANZAHL_BENOETIGTE")
    private Long numberOf;

    /** The capacity. */
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "FK_KAPAZITAETOID_K")
    private Capacity capacity;

    /** The lsc. */
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "FK_LSZOID_LSZ")
    private Lsc lsc;

    /**
     * Instantiates a new capacity required.
     */
    public CapacityRequired() {
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
	 * @return the numberOf
	 */
	public Long getNumberOf() {
		return numberOf;
	}



	/**
	 * @param numberOf the numberOf to set
	 */
	public void setNumberOf(Long numberOf) {
		this.numberOf = numberOf;
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
	 * @return the lsc
	 */
	public Lsc getLsc() {
		return lsc;
	}



	/**
	 * @param lsc the lsc to set
	 */
	public void setLsc(Lsc lsc) {
		this.lsc = lsc;
	}



	/**
     * toString.
     * 
     * @return
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return new ToStringBuilder(this).append("id", this.id).append("lsc", this.lsc).append(
                "capacity", this.capacity).append("numberOf", this.numberOf).toString();
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
        if (!(object instanceof CapacityRequired)) {
            return false;
        }
        CapacityRequired rhs = (CapacityRequired) object;
        return new EqualsBuilder().append(this.lsc, rhs.lsc).append(this.capacity, rhs.capacity)
                .append(this.numberOf, rhs.numberOf).isEquals();
    }

    /**
     * hashCode.
     * 
     * @return
     * 
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return new HashCodeBuilder(1717665337, 1763693425).append(this.lsc).append(this.capacity)
                .append(this.numberOf).toHashCode();
    }

}
