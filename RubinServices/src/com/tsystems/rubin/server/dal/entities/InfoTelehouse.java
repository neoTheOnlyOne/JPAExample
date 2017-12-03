package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="INFO_TELEHOUSE")
public class InfoTelehouse implements Serializable {
	@Id
	@Column(name="TH_TELEHOUSE_ID")
	private Long id;

	@Column(name="TH_ABKUERZ")
	private String abkuerz;

	@Column(name="TH_ADRESS_STATE")
	private String adressState;

	@Column(name="TH_ADRESS1")
	private String adress1;

	@Column(name="TH_CA_ABBR")
	private String abbreviation;

	@Column(name="TH_CA_CODE")
	private String code;

	@Column(name="TH_CA_IKS")
	private String iks;

	@Column(name="TH_CA_ITU")
	private String itu;

	@Column(name="TH_CA_NAKODA")
	private String nakoda;

	@Column(name="TH_CA_NAME")
	private String name;

	@Column(name="TH_CA_NAME_UPCASE")
	private String nameUpcase;

	@Column(name="TH_CA_PROVIDER")
	private String provider;

	@Column(name="TH_CA_REMARK")
	private String remark;

	@Column(name="TH_CA_VERTRAGSCARR")
	private String vertragscarr;

	@Column(name="TH_CITY")
	private String city;

	@Column(name="TH_DIRECT_TO_SITE")
	private String directToSite;

	@Column(name="TH_FLOOR")
	private String floor;

	@Column(name="TH_GR_GEO_BR_GRUND")
	private Long grGeoBrGrund;

	@Column(name="TH_GR_GEO_BR_ZUS")
	private String grGeoBrZus;

	@Column(name="TH_GR_GEO_LA_GRUND")
	private Long grGeoLaGrund;

	@Column(name="TH_GR_GEO_LA_ZUS")
	private String grGeoLaZus;

	@Column(name="TH_GR_GK_HO_GRUND")
	private Long grGkHoGrund;

	@Column(name="TH_GR_GK_RE_GRUND")
	private Long grGkReGrund;

	@Column(name="TH_GR_GRUND_INT")
	private String grGrundInt;

	@Column(name="TH_GR_GRUND_K_INT")
	private String grGrundKInt;

	@Column(name="TH_GR_GRUND_K_NAT")
	private String grGrundKNat;

	@Column(name="TH_GR_GRUND_KENN")
	private String grGrundKenn;

	@Column(name="TH_GR_GRUND_NAT")
	private String grGrundNat;

	@Column(name="TH_GR_GRUND_NAT_UP")
	private String grGrundNatUp;

	@Column(name="TH_GR_GRUND_NOTIZ")
	private String grGrundNotiz;

	@Column(name="TH_GR_HO_UEBER_NN")
	private Long grHoUeberNn;

	@Column(name="TH_GR_ITU_BEZEICH")
	private String grItuBezeich;

	@Column(name="TH_GR_ORBIT_LA_GR")
	private Long grOrbitLaGr;

	@Column(name="TH_GR_ORBIT_LAGE")
	private String grOrbitLage;

	@Column(name="TH_LA_LAND_ABK_INT")
	private String thLaLandAbkInt;

	@Column(name="TH_LA_LAND_ABK_NAT")
	private String thLaLandAbkNat;

	@Column(name="TH_LA_LANDBEZ_I_UP")
	private String thLaLandbezIUp;

	@Column(name="TH_LA_LANDBEZ_INT")
	private String thLaLandbezInt;

	@Column(name="TH_LA_LANDBEZ_N_UP")
	private String thLaLandbezNUp;

	@Column(name="TH_LA_LANDBEZ_NAT")
	private String thLaLandbezNat;

	@Column(name="TH_LA_LANDKENN_ZUS")
	private Long thLaLandkennZus;

	@Column(name="TH_LA_LANDKENNUNG")
	private String thLaLandkennung;

	@Column(name="TH_LA_LANDNOTIZ")
	private String thLaLandnotiz;

	@Column(name="TH_NAME")
	private String thName;

	@Column(name="TH_NAME_UPCASE")
	private String thNameUpcase;

	@Column(name="TH_PHOTO")
	private String thPhoto;

	@Column(name="TH_REMARK")
	private String thRemark;

	@Column(name="TH_STREET")
	private String thStreet;

	@Column(name="TH_TT_ABBREVIATION")
	private String thTtAbbreviation;

	@Column(name="TH_TT_DESIGNATION")
	private String thTtDesignation;

	@Column(name="TH_TT_REMARK")
	private String thTtRemark;

	@Column(name="TH_ZIP_CITY")
	private String thZipCity;

	@OneToMany(mappedBy="infoTelehouse")
	private Set<InfoEquipment> infoEquipments;

	@OneToMany(mappedBy="infoTelehouse")
	private Set<InfoThContact> infoThContacts;

	@OneToMany(mappedBy="infoTelehouse")
	private Set<InfoCosts> infoCosts;

	@OneToMany(mappedBy="infoTelehouse")
	private Set<InfoRack> infoRacks;

	@OneToMany(mappedBy="infoTelehouse")
	private Set<InfoCard> infoCards;

	@OneToMany(mappedBy="infoTelehouse")
	private Set<InfoDistributorE> infoDistributorEs;

	@OneToMany(mappedBy="infoTelehouse")
	private Set<InfoRoom> infoRooms;

	private static final long serialVersionUID = 1L;

	public InfoTelehouse() {
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
	 * @return the abkuerz
	 */
	public String getAbkuerz() {
		return abkuerz;
	}

	/**
	 * @param abkuerz the abkuerz to set
	 */
	public void setAbkuerz(String abkuerz) {
		this.abkuerz = abkuerz;
	}

	/**
	 * @return the adressState
	 */
	public String getAdressState() {
		return adressState;
	}

	/**
	 * @param adressState the adressState to set
	 */
	public void setAdressState(String adressState) {
		this.adressState = adressState;
	}

	/**
	 * @return the adress1
	 */
	public String getAdress1() {
		return adress1;
	}

	/**
	 * @param adress1 the adress1 to set
	 */
	public void setAdress1(String adress1) {
		this.adress1 = adress1;
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
	 * @return the iks
	 */
	public String getIks() {
		return iks;
	}

	/**
	 * @param iks the iks to set
	 */
	public void setIks(String iks) {
		this.iks = iks;
	}

	/**
	 * @return the itu
	 */
	public String getItu() {
		return itu;
	}

	/**
	 * @param itu the itu to set
	 */
	public void setItu(String itu) {
		this.itu = itu;
	}

	/**
	 * @return the nakoda
	 */
	public String getNakoda() {
		return nakoda;
	}

	/**
	 * @param nakoda the nakoda to set
	 */
	public void setNakoda(String nakoda) {
		this.nakoda = nakoda;
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
	 * @return the nameUpcase
	 */
	public String getNameUpcase() {
		return nameUpcase;
	}

	/**
	 * @param nameUpcase the nameUpcase to set
	 */
	public void setNameUpcase(String nameUpcase) {
		this.nameUpcase = nameUpcase;
	}

	/**
	 * @return the provider
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * @param provider the provider to set
	 */
	public void setProvider(String provider) {
		this.provider = provider;
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
	 * @return the vertragscarr
	 */
	public String getVertragscarr() {
		return vertragscarr;
	}

	/**
	 * @param vertragscarr the vertragscarr to set
	 */
	public void setVertragscarr(String vertragscarr) {
		this.vertragscarr = vertragscarr;
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
	 * @return the directToSite
	 */
	public String getDirectToSite() {
		return directToSite;
	}

	/**
	 * @param directToSite the directToSite to set
	 */
	public void setDirectToSite(String directToSite) {
		this.directToSite = directToSite;
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
	 * @return the grGeoBrGrund
	 */
	public Long getGrGeoBrGrund() {
		return grGeoBrGrund;
	}

	/**
	 * @param grGeoBrGrund the grGeoBrGrund to set
	 */
	public void setGrGeoBrGrund(Long grGeoBrGrund) {
		this.grGeoBrGrund = grGeoBrGrund;
	}

	/**
	 * @return the grGeoBrZus
	 */
	public String getGrGeoBrZus() {
		return grGeoBrZus;
	}

	/**
	 * @param grGeoBrZus the grGeoBrZus to set
	 */
	public void setGrGeoBrZus(String grGeoBrZus) {
		this.grGeoBrZus = grGeoBrZus;
	}

	/**
	 * @return the grGeoLaGrund
	 */
	public Long getGrGeoLaGrund() {
		return grGeoLaGrund;
	}

	/**
	 * @param grGeoLaGrund the grGeoLaGrund to set
	 */
	public void setGrGeoLaGrund(Long grGeoLaGrund) {
		this.grGeoLaGrund = grGeoLaGrund;
	}

	/**
	 * @return the grGeoLaZus
	 */
	public String getGrGeoLaZus() {
		return grGeoLaZus;
	}

	/**
	 * @param grGeoLaZus the grGeoLaZus to set
	 */
	public void setGrGeoLaZus(String grGeoLaZus) {
		this.grGeoLaZus = grGeoLaZus;
	}

	/**
	 * @return the grGkHoGrund
	 */
	public Long getGrGkHoGrund() {
		return grGkHoGrund;
	}

	/**
	 * @param grGkHoGrund the grGkHoGrund to set
	 */
	public void setGrGkHoGrund(Long grGkHoGrund) {
		this.grGkHoGrund = grGkHoGrund;
	}

	/**
	 * @return the grGkReGrund
	 */
	public Long getGrGkReGrund() {
		return grGkReGrund;
	}

	/**
	 * @param grGkReGrund the grGkReGrund to set
	 */
	public void setGrGkReGrund(Long grGkReGrund) {
		this.grGkReGrund = grGkReGrund;
	}

	/**
	 * @return the grGrundInt
	 */
	public String getGrGrundInt() {
		return grGrundInt;
	}

	/**
	 * @param grGrundInt the grGrundInt to set
	 */
	public void setGrGrundInt(String grGrundInt) {
		this.grGrundInt = grGrundInt;
	}

	/**
	 * @return the grGrundKInt
	 */
	public String getGrGrundKInt() {
		return grGrundKInt;
	}

	/**
	 * @param grGrundKInt the grGrundKInt to set
	 */
	public void setGrGrundKInt(String grGrundKInt) {
		this.grGrundKInt = grGrundKInt;
	}

	/**
	 * @return the grGrundKNat
	 */
	public String getGrGrundKNat() {
		return grGrundKNat;
	}

	/**
	 * @param grGrundKNat the grGrundKNat to set
	 */
	public void setGrGrundKNat(String grGrundKNat) {
		this.grGrundKNat = grGrundKNat;
	}

	/**
	 * @return the grGrundKenn
	 */
	public String getGrGrundKenn() {
		return grGrundKenn;
	}

	/**
	 * @param grGrundKenn the grGrundKenn to set
	 */
	public void setGrGrundKenn(String grGrundKenn) {
		this.grGrundKenn = grGrundKenn;
	}

	/**
	 * @return the grGrundNat
	 */
	public String getGrGrundNat() {
		return grGrundNat;
	}

	/**
	 * @param grGrundNat the grGrundNat to set
	 */
	public void setGrGrundNat(String grGrundNat) {
		this.grGrundNat = grGrundNat;
	}

	/**
	 * @return the grGrundNatUp
	 */
	public String getGrGrundNatUp() {
		return grGrundNatUp;
	}

	/**
	 * @param grGrundNatUp the grGrundNatUp to set
	 */
	public void setGrGrundNatUp(String grGrundNatUp) {
		this.grGrundNatUp = grGrundNatUp;
	}

	/**
	 * @return the grGrundNotiz
	 */
	public String getGrGrundNotiz() {
		return grGrundNotiz;
	}

	/**
	 * @param grGrundNotiz the grGrundNotiz to set
	 */
	public void setGrGrundNotiz(String grGrundNotiz) {
		this.grGrundNotiz = grGrundNotiz;
	}

	/**
	 * @return the grHoUeberNn
	 */
	public Long getGrHoUeberNn() {
		return grHoUeberNn;
	}

	/**
	 * @param grHoUeberNn the grHoUeberNn to set
	 */
	public void setGrHoUeberNn(Long grHoUeberNn) {
		this.grHoUeberNn = grHoUeberNn;
	}

	/**
	 * @return the grItuBezeich
	 */
	public String getGrItuBezeich() {
		return grItuBezeich;
	}

	/**
	 * @param grItuBezeich the grItuBezeich to set
	 */
	public void setGrItuBezeich(String grItuBezeich) {
		this.grItuBezeich = grItuBezeich;
	}

	/**
	 * @return the grOrbitLaGr
	 */
	public Long getGrOrbitLaGr() {
		return grOrbitLaGr;
	}

	/**
	 * @param grOrbitLaGr the grOrbitLaGr to set
	 */
	public void setGrOrbitLaGr(Long grOrbitLaGr) {
		this.grOrbitLaGr = grOrbitLaGr;
	}

	/**
	 * @return the grOrbitLage
	 */
	public String getGrOrbitLage() {
		return grOrbitLage;
	}

	/**
	 * @param grOrbitLage the grOrbitLage to set
	 */
	public void setGrOrbitLage(String grOrbitLage) {
		this.grOrbitLage = grOrbitLage;
	}

	/**
	 * @return the thLaLandAbkInt
	 */
	public String getThLaLandAbkInt() {
		return thLaLandAbkInt;
	}

	/**
	 * @param thLaLandAbkInt the thLaLandAbkInt to set
	 */
	public void setThLaLandAbkInt(String thLaLandAbkInt) {
		this.thLaLandAbkInt = thLaLandAbkInt;
	}

	/**
	 * @return the thLaLandAbkNat
	 */
	public String getThLaLandAbkNat() {
		return thLaLandAbkNat;
	}

	/**
	 * @param thLaLandAbkNat the thLaLandAbkNat to set
	 */
	public void setThLaLandAbkNat(String thLaLandAbkNat) {
		this.thLaLandAbkNat = thLaLandAbkNat;
	}

	/**
	 * @return the thLaLandbezIUp
	 */
	public String getThLaLandbezIUp() {
		return thLaLandbezIUp;
	}

	/**
	 * @param thLaLandbezIUp the thLaLandbezIUp to set
	 */
	public void setThLaLandbezIUp(String thLaLandbezIUp) {
		this.thLaLandbezIUp = thLaLandbezIUp;
	}

	/**
	 * @return the thLaLandbezInt
	 */
	public String getThLaLandbezInt() {
		return thLaLandbezInt;
	}

	/**
	 * @param thLaLandbezInt the thLaLandbezInt to set
	 */
	public void setThLaLandbezInt(String thLaLandbezInt) {
		this.thLaLandbezInt = thLaLandbezInt;
	}

	/**
	 * @return the thLaLandbezNUp
	 */
	public String getThLaLandbezNUp() {
		return thLaLandbezNUp;
	}

	/**
	 * @param thLaLandbezNUp the thLaLandbezNUp to set
	 */
	public void setThLaLandbezNUp(String thLaLandbezNUp) {
		this.thLaLandbezNUp = thLaLandbezNUp;
	}

	/**
	 * @return the thLaLandbezNat
	 */
	public String getThLaLandbezNat() {
		return thLaLandbezNat;
	}

	/**
	 * @param thLaLandbezNat the thLaLandbezNat to set
	 */
	public void setThLaLandbezNat(String thLaLandbezNat) {
		this.thLaLandbezNat = thLaLandbezNat;
	}

	/**
	 * @return the thLaLandkennZus
	 */
	public Long getThLaLandkennZus() {
		return thLaLandkennZus;
	}

	/**
	 * @param thLaLandkennZus the thLaLandkennZus to set
	 */
	public void setThLaLandkennZus(Long thLaLandkennZus) {
		this.thLaLandkennZus = thLaLandkennZus;
	}

	/**
	 * @return the thLaLandkennung
	 */
	public String getThLaLandkennung() {
		return thLaLandkennung;
	}

	/**
	 * @param thLaLandkennung the thLaLandkennung to set
	 */
	public void setThLaLandkennung(String thLaLandkennung) {
		this.thLaLandkennung = thLaLandkennung;
	}

	/**
	 * @return the thLaLandnotiz
	 */
	public String getThLaLandnotiz() {
		return thLaLandnotiz;
	}

	/**
	 * @param thLaLandnotiz the thLaLandnotiz to set
	 */
	public void setThLaLandnotiz(String thLaLandnotiz) {
		this.thLaLandnotiz = thLaLandnotiz;
	}

	/**
	 * @return the thName
	 */
	public String getThName() {
		return thName;
	}

	/**
	 * @param thName the thName to set
	 */
	public void setThName(String thName) {
		this.thName = thName;
	}

	/**
	 * @return the thNameUpcase
	 */
	public String getThNameUpcase() {
		return thNameUpcase;
	}

	/**
	 * @param thNameUpcase the thNameUpcase to set
	 */
	public void setThNameUpcase(String thNameUpcase) {
		this.thNameUpcase = thNameUpcase;
	}

	/**
	 * @return the thPhoto
	 */
	public String getThPhoto() {
		return thPhoto;
	}

	/**
	 * @param thPhoto the thPhoto to set
	 */
	public void setThPhoto(String thPhoto) {
		this.thPhoto = thPhoto;
	}

	/**
	 * @return the thRemark
	 */
	public String getThRemark() {
		return thRemark;
	}

	/**
	 * @param thRemark the thRemark to set
	 */
	public void setThRemark(String thRemark) {
		this.thRemark = thRemark;
	}

	/**
	 * @return the thStreet
	 */
	public String getThStreet() {
		return thStreet;
	}

	/**
	 * @param thStreet the thStreet to set
	 */
	public void setThStreet(String thStreet) {
		this.thStreet = thStreet;
	}

	/**
	 * @return the thTtAbbreviation
	 */
	public String getThTtAbbreviation() {
		return thTtAbbreviation;
	}

	/**
	 * @param thTtAbbreviation the thTtAbbreviation to set
	 */
	public void setThTtAbbreviation(String thTtAbbreviation) {
		this.thTtAbbreviation = thTtAbbreviation;
	}

	/**
	 * @return the thTtDesignation
	 */
	public String getThTtDesignation() {
		return thTtDesignation;
	}

	/**
	 * @param thTtDesignation the thTtDesignation to set
	 */
	public void setThTtDesignation(String thTtDesignation) {
		this.thTtDesignation = thTtDesignation;
	}

	/**
	 * @return the thTtRemark
	 */
	public String getThTtRemark() {
		return thTtRemark;
	}

	/**
	 * @param thTtRemark the thTtRemark to set
	 */
	public void setThTtRemark(String thTtRemark) {
		this.thTtRemark = thTtRemark;
	}

	/**
	 * @return the thZipCity
	 */
	public String getThZipCity() {
		return thZipCity;
	}

	/**
	 * @param thZipCity the thZipCity to set
	 */
	public void setThZipCity(String thZipCity) {
		this.thZipCity = thZipCity;
	}

	/**
	 * @return the infoEquipments
	 */
	public Set<InfoEquipment> getInfoEquipments() {
		return infoEquipments;
	}

	/**
	 * @param infoEquipments the infoEquipments to set
	 */
	public void setInfoEquipments(Set<InfoEquipment> infoEquipments) {
		this.infoEquipments = infoEquipments;
	}

	/**
	 * @return the infoThContacts
	 */
	public Set<InfoThContact> getInfoThContacts() {
		return infoThContacts;
	}

	/**
	 * @param infoThContacts the infoThContacts to set
	 */
	public void setInfoThContacts(Set<InfoThContact> infoThContacts) {
		this.infoThContacts = infoThContacts;
	}

	/**
	 * @return the infoCosts
	 */
	public Set<InfoCosts> getInfoCosts() {
		return infoCosts;
	}

	/**
	 * @param infoCosts the infoCosts to set
	 */
	public void setInfoCosts(Set<InfoCosts> infoCosts) {
		this.infoCosts = infoCosts;
	}

	/**
	 * @return the infoRacks
	 */
	public Set<InfoRack> getInfoRacks() {
		return infoRacks;
	}

	/**
	 * @param infoRacks the infoRacks to set
	 */
	public void setInfoRacks(Set<InfoRack> infoRacks) {
		this.infoRacks = infoRacks;
	}

	/**
	 * @return the infoCards
	 */
	public Set<InfoCard> getInfoCards() {
		return infoCards;
	}

	/**
	 * @param infoCards the infoCards to set
	 */
	public void setInfoCards(Set<InfoCard> infoCards) {
		this.infoCards = infoCards;
	}

	/**
	 * @return the infoDistributorEs
	 */
	public Set<InfoDistributorE> getInfoDistributorEs() {
		return infoDistributorEs;
	}

	/**
	 * @param infoDistributorEs the infoDistributorEs to set
	 */
	public void setInfoDistributorEs(Set<InfoDistributorE> infoDistributorEs) {
		this.infoDistributorEs = infoDistributorEs;
	}

	/**
	 * @return the infoRooms
	 */
	public Set<InfoRoom> getInfoRooms() {
		return infoRooms;
	}

	/**
	 * @param infoRooms the infoRooms to set
	 */
	public void setInfoRooms(Set<InfoRoom> infoRooms) {
		this.infoRooms = infoRooms;
	}

	
}
