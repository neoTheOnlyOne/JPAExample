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

@Entity
@Table(name="INFO_INHOUSE")
public class InfoInhouse implements Serializable {
	@Id
	@Column(name="IH_OID")
	private Long id;

	@Column(name="IH_FACHSZ")
	private String fachsz;

	@Column(name="IH_RACK_INFO")
	private String rackInfo;

	@Column(name="IH_RX_TX")
	private String rxTx;

	@Column(name="IH_SECTION_NO")
	private Long sectionNo;

	@Column(name="IH_UNIT")
	private String unit;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="IH_ABSCHNITT_FK")
	private InfoSegment infoSegment;

	private static final long serialVersionUID = 1L;

	public InfoInhouse() {
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
	 * @return the fachsz
	 */
	public String getFachsz() {
		return fachsz;
	}

	/**
	 * @param fachsz the fachsz to set
	 */
	public void setFachsz(String fachsz) {
		this.fachsz = fachsz;
	}

	/**
	 * @return the rackInfo
	 */
	public String getRackInfo() {
		return rackInfo;
	}

	/**
	 * @param rackInfo the rackInfo to set
	 */
	public void setRackInfo(String rackInfo) {
		this.rackInfo = rackInfo;
	}

	/**
	 * @return the rxTx
	 */
	public String getRxTx() {
		return rxTx;
	}

	/**
	 * @param rxTx the rxTx to set
	 */
	public void setRxTx(String rxTx) {
		this.rxTx = rxTx;
	}

	/**
	 * @return the sectionNo
	 */
	public Long getSectionNo() {
		return sectionNo;
	}

	/**
	 * @param sectionNo the sectionNo to set
	 */
	public void setSectionNo(Long sectionNo) {
		this.sectionNo = sectionNo;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * @return the infoSegment
	 */
	public InfoSegment getInfoSegment() {
		return infoSegment;
	}

	/**
	 * @param infoSegment the infoSegment to set
	 */
	public void setInfoSegment(InfoSegment infoSegment) {
		this.infoSegment = infoSegment;
	}


}
