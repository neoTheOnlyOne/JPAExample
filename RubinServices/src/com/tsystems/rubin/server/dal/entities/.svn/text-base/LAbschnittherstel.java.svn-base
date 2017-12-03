package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="L_ABSCHNITTHERSTEL")
public class LAbschnittherstel implements Serializable {
	@Id
	@Column(name="OID_L_ABSCHNITTHER")
	private Long id;

	@Column(name ="HERSTELLERNAME")
	private String name;

	@Column(name="HERSTELLERNAME_SUC")
	private String nameSearch;

	@Column(name="HERSTELLERNOTIZ")
	private String remark;

	private static final long serialVersionUID = 1L;

	public LAbschnittherstel() {
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

	
}
