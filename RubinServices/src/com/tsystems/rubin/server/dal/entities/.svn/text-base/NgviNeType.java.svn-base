package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="NGVI_NE_TYPE")
public class NgviNeType implements Serializable {
	@Id
	@Column(name = "OID")
	private Long id;

	@Column(name="NE_TYPE")
	private String type;

	@OneToMany(mappedBy="ngviNeType")
	private Set<NgviKeywords> ngviKeywords;

	@OneToMany(mappedBy="ngviNeType")
	private Set<NgviNetworkElement> ngviNetworkElements;

	private static final long serialVersionUID = 1L;

	public NgviNeType() {
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
	 * @return the ngviKeywords
	 */
	public Set<NgviKeywords> getNgviKeywords() {
		return ngviKeywords;
	}

	/**
	 * @param ngviKeywords the ngviKeywords to set
	 */
	public void setNgviKeywords(Set<NgviKeywords> ngviKeywords) {
		this.ngviKeywords = ngviKeywords;
	}

	/**
	 * @return the ngviNetworkElements
	 */
	public Set<NgviNetworkElement> getNgviNetworkElements() {
		return ngviNetworkElements;
	}

	/**
	 * @param ngviNetworkElements the ngviNetworkElements to set
	 */
	public void setNgviNetworkElements(Set<NgviNetworkElement> ngviNetworkElements) {
		this.ngviNetworkElements = ngviNetworkElements;
	}

}
