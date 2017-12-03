package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Telehouse implements Serializable {
	@Id
	@Column(name="OID_TH")
	private Long id;

	@Column(name="TH_BSZ")
	private String bsz;

	@Column(name="TH_FACHSZ")
	private String fachsz;

	@Column(name="TH_NAME")
	private String name;

	@Column(name="TH_NAME_SUCH_BSI")
	private String nameSearch;

	@Column(name="TH_ABBREVIATION")
	private String abbreviation;

	@Column(name="TH_TYPE")
	private String type;

	@Column(name="TH_COUNTRY")
	private String country;

	@Column(name="TH_OPERATOR")
	private String operator;

	@Column(name="TH_CITY")
	private String city;

	@Column(name="TH_ADRESS1")
	private String address1;

	@Column(name="TH_STREET")
	private String street;

	@Column(name="TH_FLOOR")
	private String floor;

	@Column(name="TH_ZIP_CITY")
	private String zipCity;

	@Column(name="TH_ADRESS_STATE")
	private String addressState;

	@Column(name="TH_DIRECTIONS_TO_S")
	private String directionsTos;

	@Column(name="TH_PHOTO")
	private String photo;

	@Column(name="TH_REMARK")
	private String remark;

	@Column(name="TH_UPDATED_BY")
	private String updatedBy;

	@Column(name="TH_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="RUBIN_FOREIGN_KEY")
	private String rubinForeignKey;

	@Column(name="RUBIN_TO_DEL")
	private String rubinToDel;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CARRIEROID_CARR")
	private Carrier carrier;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_GRUNDSTUECKOID")
	private Site site;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TELEHOUSE_TYOID")
	private TelehouseType telehouseType;

	@OneToMany(mappedBy="telehouse")
	private Set<Terminal> terminals;
	
	@OneToMany(mappedBy="telehouse")
	private Set<Equipment> equipments;

	@OneToMany(mappedBy="telehouse")
	private Set<Card> cards;

	@OneToMany(mappedBy="telehouse")
	private Set<ThContact> thContacts;

	@OneToMany(mappedBy="telehouse")
	private Set<NdsSpimsAuftrag> ndsSpimsAuftrags;

	@OneToMany(mappedBy="telehouse")
	private Set<Room> rooms;

	@OneToMany(mappedBy="telehouse")
	private Set<Costs> costs;
	
	private static final long serialVersionUID = 1L;

	public Telehouse() {
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
	 * @return the bsz
	 */
	public String getBsz() {
		return bsz;
	}

	/**
	 * @param bsz the bsz to set
	 */
	public void setBsz(String bsz) {
		this.bsz = bsz;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the nameSearch
	 */
	public String getNameSearch() {
		return nameSearch;
	}

	/**
	 * @param nameSearch the nameSearch to set
	 */
	public void setNameSearch(String nameSearch) {
		this.nameSearch = nameSearch;
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
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the operator
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * @param operator the operator to set
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the floor
	 */
	public String getFloor() {
		return floor;
	}

	/**
	 * @param floor the floor to set
	 */
	public void setFloor(String floor) {
		this.floor = floor;
	}

	/**
	 * @return the zipCity
	 */
	public String getZipCity() {
		return zipCity;
	}

	/**
	 * @param zipCity the zipCity to set
	 */
	public void setZipCity(String zipCity) {
		this.zipCity = zipCity;
	}

	/**
	 * @return the addressState
	 */
	public String getAddressState() {
		return addressState;
	}

	/**
	 * @param addressState the addressState to set
	 */
	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	/**
	 * @return the directionsTos
	 */
	public String getDirectionsTos() {
		return directionsTos;
	}

	/**
	 * @param directionsTos the directionsTos to set
	 */
	public void setDirectionsTos(String directionsTos) {
		this.directionsTos = directionsTos;
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
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
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
	 * @return the rubinForeignKey
	 */
	public String getRubinForeignKey() {
		return rubinForeignKey;
	}

	/**
	 * @param rubinForeignKey the rubinForeignKey to set
	 */
	public void setRubinForeignKey(String rubinForeignKey) {
		this.rubinForeignKey = rubinForeignKey;
	}

	/**
	 * @return the rubinToDel
	 */
	public String getRubinToDel() {
		return rubinToDel;
	}

	/**
	 * @param rubinToDel the rubinToDel to set
	 */
	public void setRubinToDel(String rubinToDel) {
		this.rubinToDel = rubinToDel;
	}

	/**
	 * @return the carrier
	 */
	public Carrier getCarrier() {
		return carrier;
	}

	/**
	 * @param carrier the carrier to set
	 */
	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

	/**
	 * @return the site
	 */
	public Site getSite() {
		return site;
	}

	/**
	 * @param site the site to set
	 */
	public void setSite(Site site) {
		this.site = site;
	}

	/**
	 * @return the telehouseType
	 */
	public TelehouseType getTelehouseType() {
		return telehouseType;
	}

	/**
	 * @param telehouseType the telehouseType to set
	 */
	public void setTelehouseType(TelehouseType telehouseType) {
		this.telehouseType = telehouseType;
	}

	/**
	 * @return the terminals
	 */
	public Set<Terminal> getTerminals() {
		return terminals;
	}

	/**
	 * @param terminals the terminals to set
	 */
	public void setTerminals(Set<Terminal> terminals) {
		this.terminals = terminals;
	}

	/**
	 * @return the equipments
	 */
	public Set<Equipment> getEquipments() {
		return equipments;
	}

	/**
	 * @param equipments the equipments to set
	 */
	public void setEquipments(Set<Equipment> equipments) {
		this.equipments = equipments;
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
	 * @return the thContacts
	 */
	public Set<ThContact> getThContacts() {
		return thContacts;
	}

	/**
	 * @param thContacts the thContacts to set
	 */
	public void setThContacts(Set<ThContact> thContacts) {
		this.thContacts = thContacts;
	}

	/**
	 * @return the ndsSpimsAuftrags
	 */
	public Set<NdsSpimsAuftrag> getNdsSpimsAuftrags() {
		return ndsSpimsAuftrags;
	}

	/**
	 * @param ndsSpimsAuftrags the ndsSpimsAuftrags to set
	 */
	public void setNdsSpimsAuftrags(Set<NdsSpimsAuftrag> ndsSpimsAuftrags) {
		this.ndsSpimsAuftrags = ndsSpimsAuftrags;
	}

	/**
	 * @return the rooms
	 */
	public Set<Room> getRooms() {
		return rooms;
	}

	/**
	 * @param rooms the rooms to set
	 */
	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}

	/**
	 * @return the costs
	 */
	public Set<Costs> getCosts() {
		return costs;
	}

	/**
	 * @param costs the costs to set
	 */
	public void setCosts(Set<Costs> costs) {
		this.costs = costs;
	}

}
