package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SFC_INPUTS")
public class SfcInputs implements Serializable {
	@Id
	@Column(name="OID_SFC_INPUTS")
	private Long id;

	private String accountid;

	private String billingcountry;

	@Column(name="CARRIER_CODE")
	private String carrierCode;

	@Column(name="CARRIER_OID")
	private Long carrierOid;

	@Column(name="CRM_EMAIL")
	private String crmEmail;

	@Column(name="CRM_FAX")
	private String crmFax;

	@Column(name="CRM_MOBILE")
	private String crmMobile;

	@Column(name="CRM_PHONE")
	private String crmPhone;

	private String description;

	private String firstname;

	private String function;

	@Column(name="FUNCTION_OID")
	private Long functionId;

	@Column(name="GENERAL_NDS_CONTACT_OID")
	private Long generalNdsContactId;

	@Column(name="ICSS_REGION_C")
	private String icssRegionC;

	@Column(name="LAND_OID")
	private Long landOid;

	private String lastname;

	@Column(name="LBU_C")
	private String lbuC;

	private String name;

	private String title;

	@Column(name="TSAM_CUSTOMER_NR_C")
	private String tsamCustomerNrC;

	@Column(name="USER_ID")
	private String userId;

	private static final long serialVersionUID = 1L;

	public SfcInputs() {
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
	 * @return the accountid
	 */
	public String getAccountid() {
		return accountid;
	}

	/**
	 * @param accountid the accountid to set
	 */
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}

	/**
	 * @return the billingcountry
	 */
	public String getBillingcountry() {
		return billingcountry;
	}

	/**
	 * @param billingcountry the billingcountry to set
	 */
	public void setBillingcountry(String billingcountry) {
		this.billingcountry = billingcountry;
	}

	/**
	 * @return the carrierCode
	 */
	public String getCarrierCode() {
		return carrierCode;
	}

	/**
	 * @param carrierCode the carrierCode to set
	 */
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	/**
	 * @return the carrierOid
	 */
	public Long getCarrierOid() {
		return carrierOid;
	}

	/**
	 * @param carrierOid the carrierOid to set
	 */
	public void setCarrierOid(Long carrierOid) {
		this.carrierOid = carrierOid;
	}

	/**
	 * @return the crmEmail
	 */
	public String getCrmEmail() {
		return crmEmail;
	}

	/**
	 * @param crmEmail the crmEmail to set
	 */
	public void setCrmEmail(String crmEmail) {
		this.crmEmail = crmEmail;
	}

	/**
	 * @return the crmFax
	 */
	public String getCrmFax() {
		return crmFax;
	}

	/**
	 * @param crmFax the crmFax to set
	 */
	public void setCrmFax(String crmFax) {
		this.crmFax = crmFax;
	}

	/**
	 * @return the crmMobile
	 */
	public String getCrmMobile() {
		return crmMobile;
	}

	/**
	 * @param crmMobile the crmMobile to set
	 */
	public void setCrmMobile(String crmMobile) {
		this.crmMobile = crmMobile;
	}

	/**
	 * @return the crmPhone
	 */
	public String getCrmPhone() {
		return crmPhone;
	}

	/**
	 * @param crmPhone the crmPhone to set
	 */
	public void setCrmPhone(String crmPhone) {
		this.crmPhone = crmPhone;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the function
	 */
	public String getFunction() {
		return function;
	}

	/**
	 * @param function the function to set
	 */
	public void setFunction(String function) {
		this.function = function;
	}

	/**
	 * @return the functionId
	 */
	public Long getFunctionId() {
		return functionId;
	}

	/**
	 * @param functionId the functionId to set
	 */
	public void setFunctionId(Long functionId) {
		this.functionId = functionId;
	}

	/**
	 * @return the generalNdsContactId
	 */
	public Long getGeneralNdsContactId() {
		return generalNdsContactId;
	}

	/**
	 * @param generalNdsContactId the generalNdsContactId to set
	 */
	public void setGeneralNdsContactId(Long generalNdsContactId) {
		this.generalNdsContactId = generalNdsContactId;
	}

	/**
	 * @return the icssRegionC
	 */
	public String getIcssRegionC() {
		return icssRegionC;
	}

	/**
	 * @param icssRegionC the icssRegionC to set
	 */
	public void setIcssRegionC(String icssRegionC) {
		this.icssRegionC = icssRegionC;
	}

	/**
	 * @return the landOid
	 */
	public Long getLandOid() {
		return landOid;
	}

	/**
	 * @param landOid the landOid to set
	 */
	public void setLandOid(Long landOid) {
		this.landOid = landOid;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the lbuC
	 */
	public String getLbuC() {
		return lbuC;
	}

	/**
	 * @param lbuC the lbuC to set
	 */
	public void setLbuC(String lbuC) {
		this.lbuC = lbuC;
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
	 * @return the tsamCustomerNrC
	 */
	public String getTsamCustomerNrC() {
		return tsamCustomerNrC;
	}

	/**
	 * @param tsamCustomerNrC the tsamCustomerNrC to set
	 */
	public void setTsamCustomerNrC(String tsamCustomerNrC) {
		this.tsamCustomerNrC = tsamCustomerNrC;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
