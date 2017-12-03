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
@Table(name="DESIGNATION_SCHEMES")
public class DesignationSchemes implements Serializable {
	@Id
	@Column(name="OID_DESINATION_SCHEMES")
	private Long id;

	@Column(name="DS_CARD_EMS_DESIGN")
	private String cardEmsDesign;

	@Column(name="DS_CARD_PHYSICAL_D")
	private String cardPhysicalD;

	@Column(name="DS_F1_F2")
	private String f1F2;

	@Column(name="DS_POSITION")
	private String position;

	@Column(name="DS_SLOTTBL_ADDRESS")
	private String slottblAddress;

	@Column(name="DS_SLOTTBL_POSITION")
	private String slottblPosition;

	@Column(name="DS_SORTNR")
	private Long sortnr;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_EQ_TYPEOID_ETYP")
	private EqType eqType;

	private static final long serialVersionUID = 1L;

	public DesignationSchemes() {
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
	 * @return the cardEmsDesign
	 */
	public String getCardEmsDesign() {
		return cardEmsDesign;
	}

	/**
	 * @param cardEmsDesign the cardEmsDesign to set
	 */
	public void setCardEmsDesign(String cardEmsDesign) {
		this.cardEmsDesign = cardEmsDesign;
	}

	/**
	 * @return the cardPhysicalD
	 */
	public String getCardPhysicalD() {
		return cardPhysicalD;
	}

	/**
	 * @param cardPhysicalD the cardPhysicalD to set
	 */
	public void setCardPhysicalD(String cardPhysicalD) {
		this.cardPhysicalD = cardPhysicalD;
	}

	/**
	 * @return the f1F2
	 */
	public String getF1F2() {
		return f1F2;
	}

	/**
	 * @param f1f2 the f1F2 to set
	 */
	public void setF1F2(String f1f2) {
		f1F2 = f1f2;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the slottblAddress
	 */
	public String getSlottblAddress() {
		return slottblAddress;
	}

	/**
	 * @param slottblAddress the slottblAddress to set
	 */
	public void setSlottblAddress(String slottblAddress) {
		this.slottblAddress = slottblAddress;
	}

	/**
	 * @return the slottblPosition
	 */
	public String getSlottblPosition() {
		return slottblPosition;
	}

	/**
	 * @param slottblPosition the slottblPosition to set
	 */
	public void setSlottblPosition(String slottblPosition) {
		this.slottblPosition = slottblPosition;
	}

	/**
	 * @return the sortnr
	 */
	public Long getSortnr() {
		return sortnr;
	}

	/**
	 * @param sortnr the sortnr to set
	 */
	public void setSortnr(Long sortnr) {
		this.sortnr = sortnr;
	}

	/**
	 * @return the eqType
	 */
	public EqType getEqType() {
		return eqType;
	}

	/**
	 * @param eqType the eqType to set
	 */
	public void setEqType(EqType eqType) {
		this.eqType = eqType;
	}

	
}
