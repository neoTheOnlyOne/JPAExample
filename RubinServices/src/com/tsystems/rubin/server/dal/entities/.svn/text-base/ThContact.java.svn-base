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
import javax.persistence.Table;

@Entity
@Table(name="TH_CONTACT")
public class ThContact implements Serializable {
	@Id
	@Column(name="OID_TH_CONTACT")
	private Long id;

	@Column(name="CON_ADDRESS1")
	private String address1;

	@Column(name="CON_ADDRESS2")
	private String address2;

	@Column(name="CON_ADDRESS3")
	private String address3;

	@Column(name="CON_ADDRESS4")
	private String address4;

	@Column(name="CON_ADDRESS5")
	private String address5;

	@Column(name="CON_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="CON_NAME1")
	private String name1;

	@Column(name="CON_NAME2")
	private String name2;

	@Column(name="CON_PHONEFAX1")
	private String phonefax1;

	@Column(name="CON_PHONEFAX2")
	private String phonefax2;

	@Column(name="CON_PHONEFAX3")
	private String phonefax3;

	@Column(name="CON_PHONEFAX4")
	private String phonefax4;

	@Column(name="CON_POSITION")
	private String position;

	@Column(name="CON_REMARKS")
	private String remarks;

	@Column(name="CON_RESPONSE")
	private String response;

	@Column(name="CON_STAFF_WITH_ACC")
	private String staffWithAcc;

	@Column(name="CON_TYPE")
	private String type;

	@Column(name="CON_UPDATED_BY")
	private String updatedBy;

	@Column(name="RUBIN_FOREIGN_KEY")
	private String rubinForeignKey;

	@Column(name="RUBIN_TO_DEL")
	private String rubinToDel;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SERVICE_PLATOID")
	private Platform platform;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TELEHOUSEOID_TH")
	private Telehouse telehouse;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TH_CONTACT_TOID")
	private ThContactType thContactType;

	@OneToMany(mappedBy="thContact")
	private Set<NdsSpimsAuftrag> ndsSpimsAuftrags;

	private static final long serialVersionUID = 1L;

	public ThContact() {
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
	 * @return the staffWithAcc
	 */
	public String getStaffWithAcc() {
		return staffWithAcc;
	}

	/**
	 * @param staffWithAcc the staffWithAcc to set
	 */
	public void setStaffWithAcc(String staffWithAcc) {
		this.staffWithAcc = staffWithAcc;
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
	 * @return the thContactType
	 */
	public ThContactType getThContactType() {
		return thContactType;
	}

	/**
	 * @param thContactType the thContactType to set
	 */
	public void setThContactType(ThContactType thContactType) {
		this.thContactType = thContactType;
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

}
