package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CARD_TYPE")
public class CardType implements Serializable {
	@Id
	@Column(name="OID_CTYP")
	private Long id;

	@Column(name="CTYP_ABBREVIATION")
	private String abbreviation;

	@Column(name="CTYP_ABBREVIATION0")
	private String abbreviation0;

	@Column(name="CTYP_CHANGED")
	private String changed;

	@Column(name="CTYP_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="CTYP_DELIMITER")
	private String delimiter;

	@Column(name="CTYP_DONT_ANALYZE_ME")
	private String dontAnalyzeMe;

	@Column(name="CTYP_EDITED_BY")
	private String editedBy;

	@Column(name="CTYP_IFC_DESIGNATI")
	private String ifcDesignation;

	@Column(name="CTYP_INTERFACE_TYP")
	private String interfaceType;

	@Column(name="CTYP_MANUFACTURER")
	private String manufacturer;

	@Column(name="CTYP_MANUFACTURER0")
	private String manufacturer0;

	@Column(name="CTYP_NO_OF_IFC_INC")
	private Long noOfIfcInc;

	@Column(name="CTYP_NO_OF_IFC_OUT")
	private Long noOfIfcOut;

	@Column(name="CTYP_NUMBER_OF_POR")
	private Long numberOfPor;

	@Column(name="CTYP_PHOTO")
	private String photo;

	@Column(name="CTYP_PHYS_DESIGN_S")
	private String physDesignS;

	@Column(name="CTYP_PHYS_DESIGNAT")
	private String physDesignat;

	@Column(name="CTYP_RECEIVE")
	private String receive;

	@Column(name="CTYP_REMARK")
	private String remark;

	@Column(name="CTYP_SAP_NO")
	private Long sapNo;

	@Column(name="CTYP_SPACE_REQUIRE")
	private Long spaceRequire;

	@Column(name="CTYP_TRANSMIT")
	private String transmit;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CONNECTOR_TYOID_CONNECTOR_T")
	private ConnectorType connectorType;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_EQ_TYPEOID_ETYP")
	private EqType eqType;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KAPAZITAETOID_KAPAZITAET")
	private Capacity capacity;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_MANUFACTUREROID")
	private Manufacturer manufacturerFk;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SERVICE_PLATOID")
	private Platform platform;

	@OneToMany(mappedBy="cardType")
	private Set<Card> cards;

	@ManyToMany
	@JoinTable(name="ZU_KOMPATIBEL_IST0",
		joinColumns=@JoinColumn(name="FK0CARD_TYPEOID_CTYP"),
		inverseJoinColumns=@JoinColumn(name="FK_CARD_TYPEOID_CTYP"))
	private Set<CardType> cardTypes;

	@ManyToMany
	@JoinTable(name="KANN_BESTEHEN_AUS",
		joinColumns=@JoinColumn(name="FK_CARD_TYPEOID_CT"),
		inverseJoinColumns=@JoinColumn(name="FK_EQ_TYPEOID_ETYP"))
	private Set<EqType> eqTypes;

	@ManyToMany(mappedBy="cardTypes")
	private Set<CardType> cardTypes2;

	private static final long serialVersionUID = 1L;

	public CardType() {
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
	 * @return the abbreviation
	 */
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
	 * @param abbreviation the abbreviation to set
	 */
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	/**
	 * @return the abbreviation0
	 */
	public String getAbbreviation0() {
		return abbreviation0;
	}

	/**
	 * @param abbreviation0 the abbreviation0 to set
	 */
	public void setAbbreviation0(String abbreviation0) {
		this.abbreviation0 = abbreviation0;
	}

	/**
	 * @return the changed
	 */
	public String getChanged() {
		return changed;
	}

	/**
	 * @param changed the changed to set
	 */
	public void setChanged(String changed) {
		this.changed = changed;
	}

	/**
	 * @return the dateUpdated
	 */
	public Date getDateUpdated() {
		return dateUpdated;
	}

	/**
	 * @param dateUpdated the dateUpdated to set
	 */
	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	/**
	 * @return the delimiter
	 */
	public String getDelimiter() {
		return delimiter;
	}

	/**
	 * @param delimiter the delimiter to set
	 */
	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}

	/**
	 * @return the dontAnalyzeMe
	 */
	public String getDontAnalyzeMe() {
		return dontAnalyzeMe;
	}

	/**
	 * @param dontAnalyzeMe the dontAnalyzeMe to set
	 */
	public void setDontAnalyzeMe(String dontAnalyzeMe) {
		this.dontAnalyzeMe = dontAnalyzeMe;
	}

	/**
	 * @return the editedBy
	 */
	public String getEditedBy() {
		return editedBy;
	}

	/**
	 * @param editedBy the editedBy to set
	 */
	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}

	/**
	 * @return the ifcDesignation
	 */
	public String getIfcDesignation() {
		return ifcDesignation;
	}

	/**
	 * @param ifcDesignation the ifcDesignation to set
	 */
	public void setIfcDesignation(String ifcDesignation) {
		this.ifcDesignation = ifcDesignation;
	}

	/**
	 * @return the interfaceType
	 */
	public String getInterfaceType() {
		return interfaceType;
	}

	/**
	 * @param interfaceType the interfaceType to set
	 */
	public void setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the manufacturer0
	 */
	public String getManufacturer0() {
		return manufacturer0;
	}

	/**
	 * @param manufacturer0 the manufacturer0 to set
	 */
	public void setManufacturer0(String manufacturer0) {
		this.manufacturer0 = manufacturer0;
	}

	/**
	 * @return the noOfIfcInc
	 */
	public Long getNoOfIfcInc() {
		return noOfIfcInc;
	}

	/**
	 * @param noOfIfcInc the noOfIfcInc to set
	 */
	public void setNoOfIfcInc(Long noOfIfcInc) {
		this.noOfIfcInc = noOfIfcInc;
	}

	/**
	 * @return the noOfIfcOut
	 */
	public Long getNoOfIfcOut() {
		return noOfIfcOut;
	}

	/**
	 * @param noOfIfcOut the noOfIfcOut to set
	 */
	public void setNoOfIfcOut(Long noOfIfcOut) {
		this.noOfIfcOut = noOfIfcOut;
	}

	/**
	 * @return the numberOfPor
	 */
	public Long getNumberOfPor() {
		return numberOfPor;
	}

	/**
	 * @param numberOfPor the numberOfPor to set
	 */
	public void setNumberOfPor(Long numberOfPor) {
		this.numberOfPor = numberOfPor;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * @return the physDesignS
	 */
	public String getPhysDesignS() {
		return physDesignS;
	}

	/**
	 * @param physDesignS the physDesignS to set
	 */
	public void setPhysDesignS(String physDesignS) {
		this.physDesignS = physDesignS;
	}

	/**
	 * @return the physDesignat
	 */
	public String getPhysDesignat() {
		return physDesignat;
	}

	/**
	 * @param physDesignat the physDesignat to set
	 */
	public void setPhysDesignat(String physDesignat) {
		this.physDesignat = physDesignat;
	}

	/**
	 * @return the receive
	 */
	public String getReceive() {
		return receive;
	}

	/**
	 * @param receive the receive to set
	 */
	public void setReceive(String receive) {
		this.receive = receive;
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
	 * @return the sapNo
	 */
	public Long getSapNo() {
		return sapNo;
	}

	/**
	 * @param sapNo the sapNo to set
	 */
	public void setSapNo(Long sapNo) {
		this.sapNo = sapNo;
	}

	/**
	 * @return the spaceRequire
	 */
	public Long getSpaceRequire() {
		return spaceRequire;
	}

	/**
	 * @param spaceRequire the spaceRequire to set
	 */
	public void setSpaceRequire(Long spaceRequire) {
		this.spaceRequire = spaceRequire;
	}

	/**
	 * @return the transmit
	 */
	public String getTransmit() {
		return transmit;
	}

	/**
	 * @param transmit the transmit to set
	 */
	public void setTransmit(String transmit) {
		this.transmit = transmit;
	}

	/**
	 * @return the connectorType
	 */
	public ConnectorType getConnectorType() {
		return connectorType;
	}

	/**
	 * @param connectorType the connectorType to set
	 */
	public void setConnectorType(ConnectorType connectorType) {
		this.connectorType = connectorType;
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
	 * @return the manufacturerFk
	 */
	public Manufacturer getManufacturerFk() {
		return manufacturerFk;
	}

	/**
	 * @param manufacturerFk the manufacturerFk to set
	 */
	public void setManufacturerFk(Manufacturer manufacturerFk) {
		this.manufacturerFk = manufacturerFk;
	}

	/**
	 * @return the platform
	 */
	public Platform getPlatform() {
		return platform;
	}

	/**
	 * @param platform the platform to set
	 */
	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	/**
	 * @return the cards
	 */
	public Set<Card> getCards() {
		return cards;
	}

	/**
	 * @param cards the cards to set
	 */
	public void setCards(Set<Card> cards) {
		this.cards = cards;
	}

	/**
	 * @return the cardTypes
	 */
	public Set<CardType> getCardTypes() {
		return cardTypes;
	}

	/**
	 * @param cardTypes the cardTypes to set
	 */
	public void setCardTypes(Set<CardType> cardTypes) {
		this.cardTypes = cardTypes;
	}

	/**
	 * @return the eqTypes
	 */
	public Set<EqType> getEqTypes() {
		return eqTypes;
	}

	/**
	 * @param eqTypes the eqTypes to set
	 */
	public void setEqTypes(Set<EqType> eqTypes) {
		this.eqTypes = eqTypes;
	}

	/**
	 * @return the cardTypes2
	 */
	public Set<CardType> getCardTypes2() {
		return cardTypes2;
	}

	/**
	 * @param cardTypes2 the cardTypes2 to set
	 */
	public void setCardTypes2(Set<CardType> cardTypes2) {
		this.cardTypes2 = cardTypes2;
	}

	
}
