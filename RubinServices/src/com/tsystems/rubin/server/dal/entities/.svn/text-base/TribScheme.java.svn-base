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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * The Class TribScheme. - An entity for KANALRASTER table.
 */
@Entity
@Table(name = "KANALRASTER")
public class TribScheme implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TribScheme")
	@SequenceGenerator(name = "TribScheme", sequenceName = "KANALRASTER_SEQUENCE", allocationSize = 1)
	@Column(name = "OID_KANALRASTER")
	private Long id;

	/** The name. */
	@Column(name = "KANALRASTER")
	private Long name;

	/** The description. */
	@Column(name = "BEMERKUNG")
	private String description;

	/** The default scheme. */
	@Column(name = "DEFAULT_RASTER")
	private String defaultScheme;

	/** The lsc. */
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "FK_LSZOID_LSZ")
	private Lsc lsc;

	/** The tributary collection. */
	@OneToMany(mappedBy = "tribScheme")
	private Set<Tributary> tributaries;

	/**
	 * Instantiates a new trib scheme.
	 */
	public TribScheme() {
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
	public Long getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(Long name) {
		this.name = name;
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
	 * @return the defaultScheme
	 */
	public String getDefaultScheme() {
		return defaultScheme;
	}



	/**
	 * @param defaultScheme the defaultScheme to set
	 */
	public void setDefaultScheme(String defaultScheme) {
		this.defaultScheme = defaultScheme;
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
		return new ToStringBuilder(this).append("id", this.id).append("name",
				this.name).append("lsc", this.lsc).append("defaultScheme",
				this.defaultScheme).append("description", this.description)
				.toString();
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
		if (!(object instanceof TribScheme)) {
			return false;
		}
		TribScheme rhs = (TribScheme) object;
		return new EqualsBuilder().append(this.name, rhs.name).append(this.lsc,
				rhs.lsc).append(this.defaultScheme, rhs.defaultScheme).append(
				this.description, rhs.description).isEquals();
	}

	/**
	 * hashCode.
	 * 
	 * @return
	 * 
	 * @see java.lang.Object#hashCode()
	 */

	public int hashCode() {
		return new HashCodeBuilder(-603902961, 1024489427).append(this.name)
				.append(this.lsc).append(this.defaultScheme).append(
						this.description).toHashCode();
	}

}
