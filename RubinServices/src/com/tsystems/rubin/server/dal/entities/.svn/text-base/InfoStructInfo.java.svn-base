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
@Table(name="INFO_STRUCT_INFO")
public class InfoStructInfo implements Serializable {
	@Id
	@Column(name="SI_ID")
	private Long id;

	@Column(name="SI_DESIGNATION")
	private String designation;

	@Column(name="SI_REMARK")
	private String remark;

	@Column(name="SI_SIT_DESIGNATION")
	private String sitDesignation;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_INFO_VERBINDUNG")
	private InfoVerbindung infoVerbindung;

	private static final long serialVersionUID = 1L;

	public InfoStructInfo() {
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
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the sitDesignation
	 */
	public String getSitDesignation() {
		return sitDesignation;
	}

	/**
	 * @param sitDesignation the sitDesignation to set
	 */
	public void setSitDesignation(String sitDesignation) {
		this.sitDesignation = sitDesignation;
	}

	/**
	 * @return the infoVerbindung
	 */
	public InfoVerbindung getInfoVerbindung() {
		return infoVerbindung;
	}

	/**
	 * @param infoVerbindung the infoVerbindung to set
	 */
	public void setInfoVerbindung(InfoVerbindung infoVerbindung) {
		this.infoVerbindung = infoVerbindung;
	}

}
