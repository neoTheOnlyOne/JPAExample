package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
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

@Entity
public class Equipment implements Serializable {
	@Id
	@Column(name="OID_EQUIPMENT")
	private Long id;

	@Column(name="EQ_ALIAS")
	private String alias;

	@Column(name="EQ_DATE_ASSEMBLED")
	private Date dateAssembled;

	@Column(name="EQ_DATE_INSTALLED")
	private Date dateInstalled;

	@Column(name="EQ_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="EQ_FACHSZ")
	private String fachsz;

	@Column(name="EQ_IP_ADDRESS")
	private String ipAddress;

	@Column(name="EQ_IPV6_ADDRESS")
	private String ipv6Address;

	@Column(name="EQ_MANUFACTURER_ID")
	private String manufacturerId;

	@Column(name="EQ_PHOTO")
	private String photo;

	@Column(name="EQ_POSITION")
	private String position;

	@Column(name="EQ_REMARK")
	private String remark;

	@Column(name="EQ_RFS_DATE")
	private Date rfsDate;

	@Column(name="EQ_SAP_ASSET_NO")
	private String sapAssetNo;

	@Column(name="EQ_SERIAL_NO")
	private String serialNo;

	@Column(name="EQ_SERIAL_NO_SUCH")
	private String serialNoSuch;

	@Column(name="EQ_SOFTWARE_VERSIO")
	private String softwareVersion;

	@Column(name="EQ_SPARE_PART_LOCATION")
	private String sparePartLocation;

	@Column(name="EQ_STATUS")
	private String status;

	@Column(name="EQ_STATUS_UPDATED")
	private Date statusUpdated;

	@Column(name="EQ_TELE_INFRASTRUC")
	private String teleInfrastructure;

	@Column(name="EQ_TID")
	private String tid;

	@Column(name="EQ_UPDATED_BY")
	private String updatedBy;

	@Column(name="SPIMS_FOREIGN_KEY")
	private String spimsForeignKey;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CUSTOMEROID_CUSTOMER")
	private Customer customer;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ENDPUNKTOID_ENDPUNKT")
	private Terminal terminal;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_EQ_TYPEOID_ETYP")
	private EqType eqType;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_RACKOID_RACK")
	private Rack rack;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ROOMOID_ROOM")
	private Room room;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TELEHOUSEOID_TH")
	private Telehouse telehouse;

	@OneToMany(mappedBy="equipment")
	private Set<Card> cards;

	@OneToMany(mappedBy="equipment")
	private Set<WiringUnit> wiringUnits;

	@OneToMany(mappedBy="equipment")
	private Set<Costs> costs;

	@OneToMany(mappedBy="equipment")
	private Set<Port> ports;

	@ManyToMany
	@JoinTable(name="GEHOERT_ZU_END_A_O",
		joinColumns=@JoinColumn(name="FK_EQUIPMENTOID_EQ"),
		inverseJoinColumns=@JoinColumn(name="FK_TRANSPORTVEROID"))
	private Set<Circuit> circuits;

	@ManyToMany(mappedBy="equipments")
	private Set<Cable> cables;

	private static final long serialVersionUID = 1L;

	public Equipment() {
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
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * @return the dateAssembled
	 */
	public Date getDateAssembled() {
		return dateAssembled;
	}

	/**
	 * @param dateAssembled the dateAssembled to set
	 */
	public void setDateAssembled(Date dateAssembled) {
		this.dateAssembled = dateAssembled;
	}

	/**
	 * @return the dateInstalled
	 */
	public Date getDateInstalled() {
		return dateInstalled;
	}

	/**
	 * @param dateInstalled the dateInstalled to set
	 */
	public void setDateInstalled(Date dateInstalled) {
		this.dateInstalled = dateInstalled;
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
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * @param ipAddress the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * @return the ipv6Address
	 */
	public String getIpv6Address() {
		return ipv6Address;
	}

	/**
	 * @param ipv6Address the ipv6Address to set
	 */
	public void setIpv6Address(String ipv6Address) {
		this.ipv6Address = ipv6Address;
	}

	/**
	 * @return the manufacturerId
	 */
	public String getManufacturerId() {
		return manufacturerId;
	}

	/**
	 * @param manufacturerId the manufacturerId to set
	 */
	public void setManufacturerId(String manufacturerId) {
		this.manufacturerId = manufacturerId;
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
	 * @return the rfsDate
	 */
	public Date getRfsDate() {
		return rfsDate;
	}

	/**
	 * @param rfsDate the rfsDate to set
	 */
	public void setRfsDate(Date rfsDate) {
		this.rfsDate = rfsDate;
	}

	/**
	 * @return the sapAssetNo
	 */
	public String getSapAssetNo() {
		return sapAssetNo;
	}

	/**
	 * @param sapAssetNo the sapAssetNo to set
	 */
	public void setSapAssetNo(String sapAssetNo) {
		this.sapAssetNo = sapAssetNo;
	}

	/**
	 * @return the serialNo
	 */
	public String getSerialNo() {
		return serialNo;
	}

	/**
	 * @param serialNo the serialNo to set
	 */
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	/**
	 * @return the serialNoSuch
	 */
	public String getSerialNoSuch() {
		return serialNoSuch;
	}

	/**
	 * @param serialNoSuch the serialNoSuch to set
	 */
	public void setSerialNoSuch(String serialNoSuch) {
		this.serialNoSuch = serialNoSuch;
	}

	/**
	 * @return the softwareVersion
	 */
	public String getSoftwareVersion() {
		return softwareVersion;
	}

	/**
	 * @param softwareVersion the softwareVersion to set
	 */
	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	/**
	 * @return the sparePartLocation
	 */
	public String getSparePartLocation() {
		return sparePartLocation;
	}

	/**
	 * @param sparePartLocation the sparePartLocation to set
	 */
	public void setSparePartLocation(String sparePartLocation) {
		this.sparePartLocation = sparePartLocation;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the statusUpdated
	 */
	public Date getStatusUpdated() {
		return statusUpdated;
	}

	/**
	 * @param statusUpdated the statusUpdated to set
	 */
	public void setStatusUpdated(Date statusUpdated) {
		this.statusUpdated = statusUpdated;
	}

	/**
	 * @return the teleInfrastructure
	 */
	public String getTeleInfrastructure() {
		return teleInfrastructure;
	}

	/**
	 * @param teleInfrastructure the teleInfrastructure to set
	 */
	public void setTeleInfrastructure(String teleInfrastructure) {
		this.teleInfrastructure = teleInfrastructure;
	}

	/**
	 * @return the tid
	 */
	public String getTid() {
		return tid;
	}

	/**
	 * @param tid the tid to set
	 */
	public void setTid(String tid) {
		this.tid = tid;
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
	 * @return the spimsForeignKey
	 */
	public String getSpimsForeignKey() {
		return spimsForeignKey;
	}

	/**
	 * @param spimsForeignKey the spimsForeignKey to set
	 */
	public void setSpimsForeignKey(String spimsForeignKey) {
		this.spimsForeignKey = spimsForeignKey;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the terminal
	 */
	public Terminal getTerminal() {
		return terminal;
	}

	/**
	 * @param terminal the terminal to set
	 */
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
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
	 * @return the rack
	 */
	public Rack getRack() {
		return rack;
	}

	/**
	 * @param rack the rack to set
	 */
	public void setRack(Rack rack) {
		this.rack = rack;
	}

	/**
	 * @return the room
	 */
	public Room getRoom() {
		return room;
	}

	/**
	 * @param room the room to set
	 */
	public void setRoom(Room room) {
		this.room = room;
	}

	/**
	 * @return the telehouse
	 */
	public Telehouse getTelehouse() {
		return telehouse;
	}

	/**
	 * @param telehouse the telehouse to set
	 */
	public void setTelehouse(Telehouse telehouse) {
		this.telehouse = telehouse;
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
	 * @return the wiringUnits
	 */
	public Set<WiringUnit> getWiringUnits() {
		return wiringUnits;
	}

	/**
	 * @param wiringUnits the wiringUnits to set
	 */
	public void setWiringUnits(Set<WiringUnit> wiringUnits) {
		this.wiringUnits = wiringUnits;
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

	/**
	 * @return the ports
	 */
	public Set<Port> getPorts() {
		return ports;
	}

	/**
	 * @param ports the ports to set
	 */
	public void setPorts(Set<Port> ports) {
		this.ports = ports;
	}

	/**
	 * @return the circuits
	 */
	public Set<Circuit> getCircuits() {
		return circuits;
	}

	/**
	 * @param circuits the circuits to set
	 */
	public void setCircuits(Set<Circuit> circuits) {
		this.circuits = circuits;
	}

	/**
	 * @return the cables
	 */
	public Set<Cable> getCables() {
		return cables;
	}

	/**
	 * @param cables the cables to set
	 */
	public void setCables(Set<Cable> cables) {
		this.cables = cables;
	}

}
