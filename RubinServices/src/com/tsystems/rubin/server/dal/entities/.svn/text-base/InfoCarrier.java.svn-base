package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="INFO_CARRIER")
public class InfoCarrier implements Serializable {
	@Id
	@Column(name="CARRIER_ID")
	private Long id;

	@Column(name="C_ABKUERZUNG")
	private String cAbkuerzung;

	@Column(name="C_CLASS")
	private String cClass;

	@Column(name="C_CODE1")
	private String code1;

	@Column(name="C_CODE2")
	private String code2;

	@Column(name="C_CODE3")
	private String code3;

	@Column(name="C_CODE4")
	private String code4;

	@Column(name="C_CUST_ID1")
	private String custId1;

	@Column(name="C_CUST_ID2")
	private String custId2;

	@Column(name="C_CUST_ID3")
	private String custId3;

	@Column(name="C_CUST_ID4")
	private String custId4;

	@Column(name="C_INTERNATIONAL")
	private String international;

	@Column(name="C_LAND_INTERNATION")
	private String landInternational;

	@Column(name="C_LAND_NATIONAL")
	private String landNational;

	@Column(name="C_LANDKENNUNG")
	private String landId;

	@Column(name="C_NATIONAL")
	private String national;

	@Column(name="C_NOTIZ")
	private String notiz;

	@OneToMany(mappedBy="infoCarrier")
	private Set<InfoEndpunkt> infoEndpunkt;

	@OneToMany(mappedBy="infoCarrier")
	private Set<InfoAnsprechpartn> infoAnsprechpartners;

	private static final long serialVersionUID = 1L;

	public InfoCarrier() {
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
	 * @return the cAbkuerzung
	 */
	public String getCAbkuerzung() {
		return cAbkuerzung;
	}

	/**
	 * @param abkuerzung the cAbkuerzung to set
	 */
	public void setCAbkuerzung(String abkuerzung) {
		cAbkuerzung = abkuerzung;
	}

	/**
	 * @return the cClass
	 */
	public String getCClass() {
		return cClass;
	}

	/**
	 * @param class1 the cClass to set
	 */
	public void setCClass(String class1) {
		cClass = class1;
	}

	/**
	 * @return the code1
	 */
	public String getCode1() {
		return code1;
	}

	/**
	 * @param code1 the code1 to set
	 */
	public void setCode1(String code1) {
		this.code1 = code1;
	}

	/**
	 * @return the code2
	 */
	public String getCode2() {
		return code2;
	}

	/**
	 * @param code2 the code2 to set
	 */
	public void setCode2(String code2) {
		this.code2 = code2;
	}

	/**
	 * @return the code3
	 */
	public String getCode3() {
		return code3;
	}

	/**
	 * @param code3 the code3 to set
	 */
	public void setCode3(String code3) {
		this.code3 = code3;
	}

	/**
	 * @return the code4
	 */
	public String getCode4() {
		return code4;
	}

	/**
	 * @param code4 the code4 to set
	 */
	public void setCode4(String code4) {
		this.code4 = code4;
	}

	/**
	 * @return the custId1
	 */
	public String getCustId1() {
		return custId1;
	}

	/**
	 * @param custId1 the custId1 to set
	 */
	public void setCustId1(String custId1) {
		this.custId1 = custId1;
	}

	/**
	 * @return the custId2
	 */
	public String getCustId2() {
		return custId2;
	}

	/**
	 * @param custId2 the custId2 to set
	 */
	public void setCustId2(String custId2) {
		this.custId2 = custId2;
	}

	/**
	 * @return the custId3
	 */
	public String getCustId3() {
		return custId3;
	}

	/**
	 * @param custId3 the custId3 to set
	 */
	public void setCustId3(String custId3) {
		this.custId3 = custId3;
	}

	/**
	 * @return the custId4
	 */
	public String getCustId4() {
		return custId4;
	}

	/**
	 * @param custId4 the custId4 to set
	 */
	public void setCustId4(String custId4) {
		this.custId4 = custId4;
	}

	/**
	 * @return the international
	 */
	public String getInternational() {
		return international;
	}

	/**
	 * @param international the international to set
	 */
	public void setInternational(String international) {
		this.international = international;
	}

	/**
	 * @return the landInternational
	 */
	public String getLandInternational() {
		return landInternational;
	}

	/**
	 * @param landInternational the landInternational to set
	 */
	public void setLandInternational(String landInternational) {
		this.landInternational = landInternational;
	}

	/**
	 * @return the landNational
	 */
	public String getLandNational() {
		return landNational;
	}

	/**
	 * @param landNational the landNational to set
	 */
	public void setLandNational(String landNational) {
		this.landNational = landNational;
	}

	/**
	 * @return the landId
	 */
	public String getLandId() {
		return landId;
	}

	/**
	 * @param landId the landId to set
	 */
	public void setLandId(String landId) {
		this.landId = landId;
	}

	/**
	 * @return the national
	 */
	public String getNational() {
		return national;
	}

	/**
	 * @param national the national to set
	 */
	public void setNational(String national) {
		this.national = national;
	}

	/**
	 * @return the notiz
	 */
	public String getNotiz() {
		return notiz;
	}

	/**
	 * @param notiz the notiz to set
	 */
	public void setNotiz(String notiz) {
		this.notiz = notiz;
	}

	/**
	 * @return the infoEndpunkt
	 */
	public Set<InfoEndpunkt> getInfoEndpunkt() {
		return infoEndpunkt;
	}

	/**
	 * @param infoEndpunkt the infoEndpunkt to set
	 */
	public void setInfoEndpunkt(Set<InfoEndpunkt> infoEndpunkt) {
		this.infoEndpunkt = infoEndpunkt;
	}

	/**
	 * @return the infoAnsprechpartners
	 */
	public Set<InfoAnsprechpartn> getInfoAnsprechpartners() {
		return infoAnsprechpartners;
	}

	/**
	 * @param infoAnsprechpartners the infoAnsprechpartners to set
	 */
	public void setInfoAnsprechpartners(Set<InfoAnsprechpartn> infoAnsprechpartners) {
		this.infoAnsprechpartners = infoAnsprechpartners;
	}


}
