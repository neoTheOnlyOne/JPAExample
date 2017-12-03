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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;

@NamedQueries({
    @NamedQuery(name = NamedQueryConstants.CARRIER_FINDCARRIERBYCARRIERNAMEANDPROVIDER, query = "Select new com.tsystems.rubin.server.dal.dvo.CarrierDVO"
            + Carrier.COMMON_PICKLIST_FIELDS_STRING + " from Carrier c  where trim(both from c.nameSearch) like ?1 and c.telehouseProvider = 'Y'" + "order by c.name"),
    @NamedQuery(name = NamedQueryConstants.CARRIER_FINDCARRIERBYCARRIERCODEANDPROVIDER, query = "Select new com.tsystems.rubin.server.dal.dvo.CarrierDVO"
        + Carrier.COMMON_PICKLIST_FIELDS_STRING + " from Carrier c  where trim(both from c.code) like ?1 and c.telehouseProvider = 'Y'" + "order by c.name"),
    @NamedQuery(name = NamedQueryConstants.CARRIER_FINDCARRIERBYCARRIERCODE_CARRIERCODEANDPROVIDER, query = "Select distinct new com.tsystems.rubin.server.dal.dvo.CarrierDVO"
        + Carrier.COMMON_PICKLIST_FIELDS_STRING + " from Carriercode cc  JOIN cc.carrier c where trim(both from cc.code) like ?1 and c.telehouseProvider = 'Y'" + "order by c.name"),
    @NamedQuery(name = NamedQueryConstants.CARRIER_FINDCARRIERBYCARRIERNAME, query = "Select new com.tsystems.rubin.server.dal.dvo.CarrierDVO"
        + Carrier.COMMON_PICKLIST_FIELDS_STRING + " from Carrier c  where trim(both from c.nameSearch) like ?1" + "order by c.name"),
    @NamedQuery(name = NamedQueryConstants.CARRIER_FINDCARRIERBYCARRIERCODE, query = "Select new com.tsystems.rubin.server.dal.dvo.CarrierDVO"
        + Carrier.COMMON_PICKLIST_FIELDS_STRING + " from Carrier c  where trim(both from c.code) like ?1" + "order by c.name"),
    @NamedQuery(name = NamedQueryConstants.CARRIER_FINDCARRIERBYCARRIERCODE_CARRIERCODE, query = "Select distinct new com.tsystems.rubin.server.dal.dvo.CarrierDVO"
        + Carrier.COMMON_PICKLIST_FIELDS_STRING + " from Carriercode cc  JOIN cc.carrier c where trim(both from cc.code) like ?1" + "order by c.name"),
    @NamedQuery(name = NamedQueryConstants.CARRIER_FINDCARRIERBYCARRIERCUSTOMERID, query = "Select new com.tsystems.rubin.server.dal.dvo.CarrierDVO"
        + Carrier.COMMON_PICKLIST_FIELDS_STRING + " from Carrier c  where trim(both from c.customerId) like ?1" + "order by c.name"),
    @NamedQuery(name = NamedQueryConstants.CARRIER_FINDCARRIERBYTRC, query = "Select new com.tsystems.rubin.server.dal.dvo.CarrierDVO"
        + Carrier.COMMON_PICKLIST_FIELDS_STRING + " from Carrier c  where trim(both from c.ituCarrierAbbreviation) like ?1" + "order by c.name"),
    @NamedQuery(name = NamedQueryConstants.CARRIER_FINDCARRIERBYCARRIERCUSTOMERIDANDPROVIDER, query = "Select new com.tsystems.rubin.server.dal.dvo.CarrierDVO"
        + Carrier.COMMON_PICKLIST_FIELDS_STRING + " from Carrier c  where trim(both from c.customerId) like ?1 and c.telehouseProvider = 'Y'" + "order by c.name"),
    @NamedQuery(name = NamedQueryConstants.CARRIER_FINDCARRIERBYTRCANDPROVIDER, query = "Select new com.tsystems.rubin.server.dal.dvo.CarrierDVO"
        + Carrier.COMMON_PICKLIST_FIELDS_STRING + " from Carrier c  where trim(both from c.ituCarrierAbbreviation) like ?1 and c.telehouseProvider = 'Y'" + "order by c.name")
    })


@Entity
public class Carrier implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(c.id, c.name, "
			+ "c.ituCarrierAbbreviation, c.customerId, c.code, c.country.id, c.country.countryId, c.country.nationalDesignation)";
	
	@Id
	@Column(name="OID_CARRIER")
	private Long id;
	
	@Column(name="CARRIERNAME")
	private String name;

	@Column(name="CARRIERNAME_SUCH_B")
	private String nameSearch;
	
	@Column(name="CARRIERNOTIZ")
	private String remark;

	@Column(name="ITU_CARRIERABKUERZ")
	private String ituCarrierAbbreviation;

	@Column(name="IKS_CARRIERBEZEICH")
	private String iksCarrierDescription;

	@Column(name="CARRIERKURZBEZEICH")
	private String abbreviation;

	@Column(name="LETZTE_AKTUALISIER")
	private Date lastUpdate;

	@Column(name="CARRIERCUSTOMER_ID")
	private String customerId;
	
	@Column(name="CARRIERCODE")
	private String code;

	@Column(name="TELEHOUSE_PROVIDER")
	private String telehouseProvider;

	@Column(name="VERTRAGSCARRIER")
	private String contractor;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CUSTOMERCLASOID_CUSTOMERCLA")
	private Customerclass customerClass;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LANDOID_LAND")
	private Country country;

	@OneToMany(mappedBy="carrier")
	private Set<Telehouse> telehouses;

	@OneToMany(mappedBy="carrier")
	private Set<Carriercode> carrierCodes;

	@OneToMany(mappedBy="carrier")
	private Set<Terminal> terminals;

	@OneToMany(mappedBy="carrier")
	private Set<Network> networks;

	@OneToMany(mappedBy="carrier")
	private Set<Circuit> circuits;

	@OneToMany(mappedBy="carrier")
	private Set<Tunnel> tunnels;

	@OneToMany(mappedBy="carrier")
	private Set<LocalLoopContract> localLoopContracts;
	
	@OneToMany(mappedBy="carrier")
	private Set<TeleContact> teleContacts;

	@OneToMany(mappedBy="carrier")
	private Set<Nutzungspartner> nutzungspartners;

	@OneToMany(mappedBy="carrier")
	private Set<Nutzungspartner> nutzungspartners2;

	@OneToMany(mappedBy="carrier")
	private Set<Transit> transits;

	@OneToMany(mappedBy="carrier")
	private Set<Customerid> customerids;

	@OneToMany(mappedBy="carrier")
	private Set<Restorationnutzer> restorationnutzers;
	
	@OneToMany(mappedBy="carrier")
	private Set<ContactPerson> contactPersons;

	@OneToMany(mappedBy="carrier")
	private Set<PostalAddress> postalAddresses;

	@OneToMany(mappedBy="carrier")
	private Set<CarrierContactAssignments> carrierContactAssignments;

	@OneToMany(mappedBy="carrier")
	private Set<TransitionUnit> transitionUnits;

	@OneToMany(mappedBy="carrier0")
	private Set<IruNehmer> iruNehmers;

	@OneToMany(mappedBy="carrier")
	private Set<IruNehmer> iruNehmers2;

	public Carrier() {
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
	 * @return the ituCarrierAbbreviation
	 */
	public String getItuCarrierAbbreviation() {
		return ituCarrierAbbreviation;
	}

	/**
	 * @param ituCarrierAbbreviation the ituCarrierAbbreviation to set
	 */
	public void setItuCarrierAbbreviation(String ituCarrierAbbreviation) {
		this.ituCarrierAbbreviation = ituCarrierAbbreviation;
	}

	/**
	 * @return the iksCarrierDescription
	 */
	public String getIksCarrierDescription() {
		return iksCarrierDescription;
	}

	/**
	 * @param iksCarrierDescription the iksCarrierDescription to set
	 */
	public void setIksCarrierDescription(String iksCarrierDescription) {
		this.iksCarrierDescription = iksCarrierDescription;
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
	 * @return the lastUpdate
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * @param lastUpdate the lastUpdate to set
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the telehouseProvider
	 */
	public String getTelehouseProvider() {
		return telehouseProvider;
	}

	/**
	 * @param telehouseProvider the telehouseProvider to set
	 */
	public void setTelehouseProvider(String telehouseProvider) {
		this.telehouseProvider = telehouseProvider;
	}

	/**
	 * @return the contractor
	 */
	public String getContractor() {
		return contractor;
	}

	/**
	 * @param contractor the contractor to set
	 */
	public void setContractor(String contractor) {
		this.contractor = contractor;
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
	 * @return the customerClass
	 */
	public Customerclass getCustomerClass() {
		return customerClass;
	}

	/**
	 * @param customerClass the customerClass to set
	 */
	public void setCustomerClass(Customerclass customerClass) {
		this.customerClass = customerClass;
	}

	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * @return the telehouses
	 */
	public Set<Telehouse> getTelehouses() {
		return telehouses;
	}

	/**
	 * @param telehouses the telehouses to set
	 */
	public void setTelehouses(Set<Telehouse> telehouses) {
		this.telehouses = telehouses;
	}

	/**
	 * @return the carrierCodes
	 */
	public Set<Carriercode> getCarrierCodes() {
		return carrierCodes;
	}

	/**
	 * @param carrierCodes the carrierCodes to set
	 */
	public void setCarrierCodes(Set<Carriercode> carrierCodes) {
		this.carrierCodes = carrierCodes;
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
	 * @return the networks
	 */
	public Set<Network> getNetworks() {
		return networks;
	}

	/**
	 * @param networks the networks to set
	 */
	public void setNetworks(Set<Network> networks) {
		this.networks = networks;
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
	 * @return the tunnels
	 */
	public Set<Tunnel> getTunnels() {
		return tunnels;
	}

	/**
	 * @param tunnels the tunnels to set
	 */
	public void setTunnels(Set<Tunnel> tunnels) {
		this.tunnels = tunnels;
	}

	/**
	 * @return the localLoopContracts
	 */
	public Set<LocalLoopContract> getLocalLoopContracts() {
		return localLoopContracts;
	}

	/**
	 * @param localLoopContracts the localLoopContracts to set
	 */
	public void setLocalLoopContracts(Set<LocalLoopContract> localLoopContracts) {
		this.localLoopContracts = localLoopContracts;
	}

	/**
	 * @return the telecontacts
	 */
	public Set<TeleContact> getTeleContacts() {
		return teleContacts;
	}

	/**
	 * @param teleContacts the telecontacts to set
	 */
	public void setTeleContacts(Set<TeleContact> teleContacts) {
		this.teleContacts = teleContacts;
	}

	/**
	 * @return the nutzungspartners
	 */
	public Set<Nutzungspartner> getNutzungspartners() {
		return nutzungspartners;
	}

	/**
	 * @param nutzungspartners the nutzungspartners to set
	 */
	public void setNutzungspartners(Set<Nutzungspartner> nutzungspartners) {
		this.nutzungspartners = nutzungspartners;
	}

	/**
	 * @return the nutzungspartners2
	 */
	public Set<Nutzungspartner> getNutzungspartners2() {
		return nutzungspartners2;
	}

	/**
	 * @param nutzungspartners2 the nutzungspartners2 to set
	 */
	public void setNutzungspartners2(Set<Nutzungspartner> nutzungspartners2) {
		this.nutzungspartners2 = nutzungspartners2;
	}

	/**
	 * @return the transits
	 */
	public Set<Transit> getTransits() {
		return transits;
	}

	/**
	 * @param transits the transits to set
	 */
	public void setTransits(Set<Transit> transits) {
		this.transits = transits;
	}

	/**
	 * @return the customerids
	 */
	public Set<Customerid> getCustomerids() {
		return customerids;
	}

	/**
	 * @param customerids the customerids to set
	 */
	public void setCustomerids(Set<Customerid> customerids) {
		this.customerids = customerids;
	}

	/**
	 * @return the restorationnutzers
	 */
	public Set<Restorationnutzer> getRestorationnutzers() {
		return restorationnutzers;
	}

	/**
	 * @param restorationnutzers the restorationnutzers to set
	 */
	public void setRestorationnutzers(Set<Restorationnutzer> restorationnutzers) {
		this.restorationnutzers = restorationnutzers;
	}

	/**
	 * @return the contactPersons
	 */
	public Set<ContactPerson> getContactPersons() {
		return contactPersons;
	}

	/**
	 * @param contactPersons the contactPersons to set
	 */
	public void setContactPersons(Set<ContactPerson> contactPersons) {
		this.contactPersons = contactPersons;
	}

	/**
	 * @return the postalAddresses
	 */
	public Set<PostalAddress> getPostalAddresses() {
		return postalAddresses;
	}

	/**
	 * @param postalAddresses the postalAddresses to set
	 */
	public void setPostalAddresses(Set<PostalAddress> postalAddresses) {
		this.postalAddresses = postalAddresses;
	}

	/**
	 * @return the carrierContactAssignments
	 */
	public Set<CarrierContactAssignments> getCarrierContactAssignments() {
		return carrierContactAssignments;
	}

	/**
	 * @param carrierContactAssignments the carrierContactAssignments to set
	 */
	public void setCarrierContactAssignments(
			Set<CarrierContactAssignments> carrierContactAssignments) {
		this.carrierContactAssignments = carrierContactAssignments;
	}

	/**
	 * @return the transitionUnits
	 */
	public Set<TransitionUnit> getTransitionUnits() {
		return transitionUnits;
	}

	/**
	 * @param transitionUnits the transitionUnits to set
	 */
	public void setTransitionUnits(Set<TransitionUnit> transitionUnits) {
		this.transitionUnits = transitionUnits;
	}

	/**
	 * @return the iruNehmers
	 */
	public Set<IruNehmer> getIruNehmers() {
		return iruNehmers;
	}

	/**
	 * @param iruNehmers the iruNehmers to set
	 */
	public void setIruNehmers(Set<IruNehmer> iruNehmers) {
		this.iruNehmers = iruNehmers;
	}

	/**
	 * @return the iruNehmers2
	 */
	public Set<IruNehmer> getIruNehmers2() {
		return iruNehmers2;
	}

	/**
	 * @param iruNehmers2 the iruNehmers2 to set
	 */
	public void setIruNehmers2(Set<IruNehmer> iruNehmers2) {
		this.iruNehmers2 = iruNehmers2;
	}


}
