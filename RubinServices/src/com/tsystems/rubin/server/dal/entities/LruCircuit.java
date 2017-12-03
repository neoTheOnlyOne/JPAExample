package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Timestamp;

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.tsystems.rubin.common.util.NamedQueryConstants;
@NamedQueries({
    @NamedQuery(name = NamedQueryConstants.FIND_LRUCIRCUIT_BYPROPERTY, 
    		           query = "Select distinct l from LruCircuit l " + 
    		                   "where l.circuit.id = ?1 and l.user.id = ?2")
     })
@Entity
@Table(name = "LRU_CIRCUIT")
public class LruCircuit implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LRU_CIRCUIT")
	@SequenceGenerator(name = "LRU_CIRCUIT", sequenceName = "LRU_CIRCUIT_SEQUENCE", allocationSize = 1)
	@Column(name = "OID_LRU_CIRCUIT")
	private Long id;

	private String usage;

	@Column(name = "TIMESTAMP_LAST_USED")
	private Timestamp timestampLastUsed;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "FK_TRANSPORTVEROID_TRANSPORTVE")
	private Circuit circuit;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "FK_ARCHIVE_CIRCOID_ARCHIVE_CIR")
	private ArchiveCircuit archiveCircuit;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "FK_BEARBEITER_SZERTIFIKATSNUMM")
	private User user;

	private static final long serialVersionUID = 1L;

	public LruCircuit() {
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
	 * @return the usage
	 */
	public String getUsage() {
		return usage;
	}


	/**
	 * @param usage the usage to set
	 */
	public void setUsage(String usage) {
		this.usage = usage;
	}


	/**
	 * @return the timestampLastUsed
	 */
	public Timestamp getTimestampLastUsed() {
		return timestampLastUsed;
	}


	/**
	 * @param timestampLastUsed the timestampLastUsed to set
	 */
	public void setTimestampLastUsed(Timestamp timestampLastUsed) {
		this.timestampLastUsed = timestampLastUsed;
	}


	/**
	 * @return the circuit
	 */
	public Circuit getCircuit() {
		return circuit;
	}


	/**
	 * @param circuit the circuit to set
	 */
	public void setCircuit(Circuit circuit) {
		this.circuit = circuit;
	}


	/**
	 * @return the archiveCircuit
	 */
	public ArchiveCircuit getArchiveCircuit() {
		return archiveCircuit;
	}


	/**
	 * @param archiveCircuit the archiveCircuit to set
	 */
	public void setArchiveCircuit(ArchiveCircuit archiveCircuit) {
		this.archiveCircuit = archiveCircuit;
	}


	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}


	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}


	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this).append("usage", this.usage).append(
				"oidLruCircuit", this.id).append(
				"timestampLastUsed", this.timestampLastUsed).append(
				"bearBeiterSecu", this.user).append("circuit", this.circuit)
				.append("archiveCircuit", this.archiveCircuit).toString();
	}

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (!(object instanceof LruCircuit)) {
			return false;
		}
		LruCircuit rhs = (LruCircuit) object;
		return new EqualsBuilder().appendSuper(super.equals(object)).append(
				this.archiveCircuit, rhs.archiveCircuit).append(
				this.id, rhs.id).append(this.user,
				rhs.user).append(this.usage, rhs.usage).append(this.circuit,
				rhs.circuit).append(this.timestampLastUsed,
				rhs.timestampLastUsed).isEquals();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(1174902411, 931162349).appendSuper(
				super.hashCode()).append(this.archiveCircuit).append(
				this.id).append(this.user).append(this.usage)
				.append(this.circuit).append(this.timestampLastUsed)
				.toHashCode();
	}

}
