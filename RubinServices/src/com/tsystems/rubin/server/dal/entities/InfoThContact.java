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
@Table(name="INFO_TH_CONTACT")
public class InfoThContact implements Serializable {
	@Id
	@Column(name="TC_TH_CONTACT_ID")
	private Long id;

	@Column(name="TC_ADDRESS1")
	private String address1;

	@Column(name="TC_ADDRESS2")
	private String address2;

	@Column(name="TC_ADDRESS3")
	private String address3;

	@Column(name="TC_ADDRESS4")
	private String address4;

	@Column(name="TC_ADDRESS5")
	private String address5;

	@Column(name="TC_NAME1")
	private String name1;

	@Column(name="TC_NAME2")
	private String name2;

	@Column(name="TC_PHONEFAX1")
	private String phonefax1;

	@Column(name="TC_PHONEFAX2")
	private String phonefax2;

	@Column(name="TC_PHONEFAX3")
	private String phonefax3;

	@Column(name="TC_PHONEFAX4")
	private String phonefax4;

	@Column(name="TC_POSITION")
	private String position;

	@Column(name="TC_REMARKS")
	private String remarks;

	@Column(name="TC_RESPONSE")
	private String response;

	@Column(name="TC_SP_ABBREVIATION")
	private String spAbbreviation;

	@Column(name="TC_SP_DESIGNATION")
	private String spDesignation;

	@Column(name="TC_SP_REMARK")
	private String spRemark;

	@Column(name="TC_STAFF_ACCESS")
	private String staffAccess;

	@Column(name="TC_TT_CONT_DESIGNATION")
	private String ttContDesignation;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="TC_TELEHOUSE_FK")
	private InfoTelehouse infoTelehouse;

	private static final long serialVersionUID = 1L;

	public InfoThContact() {
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
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * @return the address3
	 */
	public String getAddress3() {
		return address3;
	}

	/**
	 * @param address3 the address3 to set
	 */
	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	/**
	 * @return the address4
	 */
	public String getAddress4() {
		return address4;
	}

	/**
	 * @param address4 the address4 to set
	 */
	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	/**
	 * @return the address5
	 */
	public String getAddress5() {
		return address5;
	}

	/**
	 * @param address5 the address5 to set
	 */
	public void setAddress5(String address5) {
		this.address5 = address5;
	}

	/**
	 * @return the name1
	 */
	public String getName1() {
		return name1;
	}

	/**
	 * @param name1 the name1 to set
	 */
	public void setName1(String name1) {
		this.name1 = name1;
	}

	/**
	 * @return the name2
	 */
	public String getName2() {
		return name2;
	}

	/**
	 * @param name2 the name2 to set
	 */
	public void setName2(String name2) {
		this.name2 = name2;
	}

	/**
	 * @return the phonefax1
	 */
	public String getPhonefax1() {
		return phonefax1;
	}

	/**
	 * @param phonefax1 the phonefax1 to set
	 */
	public void setPhonefax1(String phonefax1) {
		this.phonefax1 = phonefax1;
	}

	/**
	 * @return the phonefax2
	 */
	public String getPhonefax2() {
		return phonefax2;
	}

	/**
	 * @param phonefax2 the phonefax2 to set
	 */
	public void setPhonefax2(String phonefax2) {
		this.phonefax2 = phonefax2;
	}

	/**
	 * @return the phonefax3
	 */
	public String getPhonefax3() {
		return phonefax3;
	}

	/**
	 * @param phonefax3 the phonefax3 to set
	 */
	public void setPhonefax3(String phonefax3) {
		this.phonefax3 = phonefax3;
	}

	/**
	 * @return the phonefax4
	 */
	public String getPhonefax4() {
		return phonefax4;
	}

	/**
	 * @param phonefax4 the phonefax4 to set
	 */
	public void setPhonefax4(String phonefax4) {
		this.phonefax4 = phonefax4;
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
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the response
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(String response) {
		this.response = response;
	}

	/**
	 * @return the spAbbreviation
	 */
	public String getSpAbbreviation() {
		return spAbbreviation;
	}

	/**
	 * @param spAbbreviation the spAbbreviation to set
	 */
	public void setSpAbbreviation(String spAbbreviation) {
		this.spAbbreviation = spAbbreviation;
	}

	/**
	 * @return the spDesignation
	 */
	public String getSpDesignation() {
		return spDesignation;
	}

	/**
	 * @param spDesignation the spDesignation to set
	 */
	public void setSpDesignation(String spDesignation) {
		this.spDesignation = spDesignation;
	}

	/**
	 * @return the spRemark
	 */
	public String getSpRemark() {
		return spRemark;
	}

	/**
	 * @param spRemark the spRemark to set
	 */
	public void setSpRemark(String spRemark) {
		this.spRemark = spRemark;
	}

	/**
	 * @return the staffAccess
	 */
	public String getStaffAccess() {
		return staffAccess;
	}

	/**
	 * @param staffAccess the staffAccess to set
	 */
	public void setStaffAccess(String staffAccess) {
		this.staffAccess = staffAccess;
	}

	/**
	 * @return the ttContDesignation
	 */
	public String getTtContDesignation() {
		return ttContDesignation;
	}

	/**
	 * @param ttContDesignation the ttContDesignation to set
	 */
	public void setTtContDesignation(String ttContDesignation) {
		this.ttContDesignation = ttContDesignation;
	}

	/**
	 * @return the infoTelehouse
	 */
	public InfoTelehouse getInfoTelehouse() {
		return infoTelehouse;
	}

	/**
	 * @param infoTelehouse the infoTelehouse to set
	 */
	public void setInfoTelehouse(InfoTelehouse infoTelehouse) {
		this.infoTelehouse = infoTelehouse;
	}

}
