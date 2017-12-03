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
@Table(name="TELEHOUSE_TYPE")
public class TelehouseType implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="OID_TELEHOUSE_TYPE")
	private Long id;

	@Column(name="THT_DESIGNATION")
	private String designation;

	@Column(name="THT_ABBREVIATION")
	private String abbreviation;

	@Column(name="THT_UPDATED_BY")
	private String updatedBy;

	@Column(name="THT_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="THT_REMARK")
	private String remark;

	@OneToMany(mappedBy="telehouseType")
	private Set<Telehouse> telehouses;

	

	public TelehouseType() {
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

}
