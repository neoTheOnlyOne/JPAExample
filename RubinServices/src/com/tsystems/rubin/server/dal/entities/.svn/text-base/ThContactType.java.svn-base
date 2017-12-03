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
@Table(name="TH_CONTACT_TYPE")
public class ThContactType implements Serializable {
	@Id
	@Column(name="OID_CONTACT_TYPE")
	private Long id;

	@Column(name="CONT_DATE_LAST_UPD")
	private Date dateLastUpdated;

	@Column(name="CONT_DESIGNATION")
	private String designation;

	@Column(name="CONT_REMARK")
	private String remark;

	@Column(name="CONT_UPDATED_BY")
	private String updatedBy;

	@OneToMany(mappedBy="thContactType")
	private Set<ThContact> thContacts;

	private static final long serialVersionUID = 1L;

	public ThContactType() {
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
	 * @return the dateLastUpdated
	 */
	public Date getDateLastUpdated() {
		return dateLastUpdated;
	}

	/**
	 * @param dateLastUpdated the dateLastUpdated to set
	 */
	public void setDateLastUpdated(Date dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
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

}
