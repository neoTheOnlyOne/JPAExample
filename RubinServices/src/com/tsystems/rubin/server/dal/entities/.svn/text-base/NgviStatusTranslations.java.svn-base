package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NGVI_STATUS_TRANSLATIONS")
public class NgviStatusTranslations implements Serializable {
	@Id
	@Column(name = "OID")
	private Long id;

	@Column(name="EQH_STATUS")
	private String eqhStatus;

	@Column(name="NGVI_STATUS")
	private String ngviStatus;

	private static final long serialVersionUID = 1L;

	public NgviStatusTranslations() {
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
	 * @return the eqhStatus
	 */
	public String getEqhStatus() {
		return eqhStatus;
	}

	/**
	 * @param eqhStatus the eqhStatus to set
	 */
	public void setEqhStatus(String eqhStatus) {
		this.eqhStatus = eqhStatus;
	}

	/**
	 * @return the ngviStatus
	 */
	public String getNgviStatus() {
		return ngviStatus;
	}

	/**
	 * @param ngviStatus the ngviStatus to set
	 */
	public void setNgviStatus(String ngviStatus) {
		this.ngviStatus = ngviStatus;
	}

}
