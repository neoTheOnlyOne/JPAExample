package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="INFO_CUSTOMER")
public class InfoCustomer implements Serializable {
	@Id
	@Column(name="CU_CUSTOMER_ID")
	private Long id;

	@Column(name="CU_CT_ABBREVIATION")
	private String cuCtAbbreviation;

	@Column(name="CU_CT_DESIGNATION")
	private String designation;

	@Column(name="CU_CT_REMARK")
	private String remark;

	@Column(name="CU_NAME1")
	private String name1;

	@Column(name="CU_NAME1_UPCASE")
	private String name1Upcase;

	@Column(name="CU_NAME2")
	private String name2;

	@Column(name="CU_REMARK")
	private String cuRemark;

	@OneToMany(mappedBy="infoCustomer")
	private Set<InfoRack> infoRacks;

	private static final long serialVersionUID = 1L;

	public InfoCustomer() {
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
	 * @return the cuCtAbbreviation
	 */
	public String getCuCtAbbreviation() {
		return cuCtAbbreviation;
	}

	/**
	 * @param cuCtAbbreviation the cuCtAbbreviation to set
	 */
	public void setCuCtAbbreviation(String cuCtAbbreviation) {
		this.cuCtAbbreviation = cuCtAbbreviation;
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
	 * @return the name1Upcase
	 */
	public String getName1Upcase() {
		return name1Upcase;
	}

	/**
	 * @param name1Upcase the name1Upcase to set
	 */
	public void setName1Upcase(String name1Upcase) {
		this.name1Upcase = name1Upcase;
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
	 * @return the cuRemark
	 */
	public String getCuRemark() {
		return cuRemark;
	}

	/**
	 * @param cuRemark the cuRemark to set
	 */
	public void setCuRemark(String cuRemark) {
		this.cuRemark = cuRemark;
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

}
