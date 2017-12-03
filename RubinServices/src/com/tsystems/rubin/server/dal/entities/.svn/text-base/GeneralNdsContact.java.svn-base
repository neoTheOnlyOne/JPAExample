package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="GENERAL_NDS_CONTACT")
public class GeneralNdsContact implements Serializable {
	@Id
	@Column(name="OID_GNC")
	private Long id;

	@Column(name="GNC_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="GNC_H_ADRESS_LINE1")
	private String adressLine1;

	@Column(name="GNC_H_ADRESS_LINE2")
	private String adressLine2;

	@Column(name="GNC_H_ADRESS_LINE3")
	private String adressLine3;

	@Column(name="GNC_H_ADRESS_LINE4")
	private String adressLine4;

	@Column(name="GNC_H_ADRESS_LINE5")
	private String adressLine5;

	@Column(name="GNC_N_ADD_NAME")
	private String addName;

	@Column(name="GNC_N_ADD_NAME_SUCH_BSI")
	private String addNameSearch;

	@Column(name="GNC_N_NAME")
	private String name;

	@Column(name="GNC_N_NAME_SUCH_BSI")
	private String nameSearch;

	@Column(name="GNC_N_POSITION")
	private String position;

	@Column(name="GNC_N_RESPONSE")
	private String response;

	@Column(name="GNC_N_TITLE")
	private String title;

	@Column(name="GNC_P_ADRESS_LINE1")
	private String gncPAdressLine1;

	@Column(name="GNC_P_ADRESS_LINE2")
	private String gncPAdressLine2;

	@Column(name="GNC_P_ADRESS_LINE3")
	private String gncPAdressLine3;

	@Column(name="GNC_REMARKS")
	private String remarks;

	@Column(name="GNC_T_EMAIL")
	private String email;

	@Column(name="GNC_T_FAX")
	private String fax;

	@Column(name="GNC_T_MISC_NR")
	private String gncTMiscNr;

	@Column(name="GNC_T_MISC_TYPE")
	private String miscType;

	@Column(name="GNC_T_MOBILE")
	private String tMobile;

	@Column(name="GNC_T_PHONE")
	private String phone;

	@Column(name="GNC_UPDATED_BY")
	private String updatedBy;

	@OneToMany(mappedBy="generalNdsContact")
	private Set<CarrierContactAssignments> carrierContactAssignments;

	private static final long serialVersionUID = 1L;

	public GeneralNdsContact() {
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
	 * @return the adressLine1
	 */
	public String getAdressLine1() {
		return adressLine1;
	}

	/**
	 * @param adressLine1 the adressLine1 to set
	 */
	public void setAdressLine1(String adressLine1) {
		this.adressLine1 = adressLine1;
	}

	/**
	 * @return the adressLine2
	 */
	public String getAdressLine2() {
		return adressLine2;
	}

	/**
	 * @param adressLine2 the adressLine2 to set
	 */
	public void setAdressLine2(String adressLine2) {
		this.adressLine2 = adressLine2;
	}

	/**
	 * @return the adressLine3
	 */
	public String getAdressLine3() {
		return adressLine3;
	}

	/**
	 * @param adressLine3 the adressLine3 to set
	 */
	public void setAdressLine3(String adressLine3) {
		this.adressLine3 = adressLine3;
	}

	/**
	 * @return the adressLine4
	 */
	public String getAdressLine4() {
		return adressLine4;
	}

	/**
	 * @param adressLine4 the adressLine4 to set
	 */
	public void setAdressLine4(String adressLine4) {
		this.adressLine4 = adressLine4;
	}

	/**
	 * @return the adressLine5
	 */
	public String getAdressLine5() {
		return adressLine5;
	}

	/**
	 * @param adressLine5 the adressLine5 to set
	 */
	public void setAdressLine5(String adressLine5) {
		this.adressLine5 = adressLine5;
	}

	/**
	 * @return the addName
	 */
	public String getAddName() {
		return addName;
	}

	/**
	 * @param addName the addName to set
	 */
	public void setAddName(String addName) {
		this.addName = addName;
	}

	/**
	 * @return the addNameSearch
	 */
	public String getAddNameSearch() {
		return addNameSearch;
	}

	/**
	 * @param addNameSearch the addNameSearch to set
	 */
	public void setAddNameSearch(String addNameSearch) {
		this.addNameSearch = addNameSearch;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the gncPAdressLine1
	 */
	public String getGncPAdressLine1() {
		return gncPAdressLine1;
	}

	/**
	 * @param gncPAdressLine1 the gncPAdressLine1 to set
	 */
	public void setGncPAdressLine1(String gncPAdressLine1) {
		this.gncPAdressLine1 = gncPAdressLine1;
	}

	/**
	 * @return the gncPAdressLine2
	 */
	public String getGncPAdressLine2() {
		return gncPAdressLine2;
	}

	/**
	 * @param gncPAdressLine2 the gncPAdressLine2 to set
	 */
	public void setGncPAdressLine2(String gncPAdressLine2) {
		this.gncPAdressLine2 = gncPAdressLine2;
	}

	/**
	 * @return the gncPAdressLine3
	 */
	public String getGncPAdressLine3() {
		return gncPAdressLine3;
	}

	/**
	 * @param gncPAdressLine3 the gncPAdressLine3 to set
	 */
	public void setGncPAdressLine3(String gncPAdressLine3) {
		this.gncPAdressLine3 = gncPAdressLine3;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * @return the gncTMiscNr
	 */
	public String getGncTMiscNr() {
		return gncTMiscNr;
	}

	/**
	 * @param gncTMiscNr the gncTMiscNr to set
	 */
	public void setGncTMiscNr(String gncTMiscNr) {
		this.gncTMiscNr = gncTMiscNr;
	}

	/**
	 * @return the miscType
	 */
	public String getMiscType() {
		return miscType;
	}

	/**
	 * @param miscType the miscType to set
	 */
	public void setMiscType(String miscType) {
		this.miscType = miscType;
	}

	/**
	 * @return the tMobile
	 */
	public String getTMobile() {
		return tMobile;
	}

	/**
	 * @param mobile the tMobile to set
	 */
	public void setTMobile(String mobile) {
		tMobile = mobile;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
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


}
