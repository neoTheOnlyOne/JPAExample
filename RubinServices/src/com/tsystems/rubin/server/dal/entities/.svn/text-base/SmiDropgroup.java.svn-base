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
@Table(name="SMI_DROPGROUP")
public class SmiDropgroup implements Serializable {
	@Id
	@Column(name="OID_DROPGROUP")
	private Long id;
	
	@Column(name="FOREIGN0")
	private String foreign;

	private String foreignnr;

	@Column(name="GROUP0")
	private String group;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SMI_DROPSOID_DROPS")
	private SmiDrops smiDrops;

	private static final long serialVersionUID = 1L;

	public SmiDropgroup() {
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
	 * @return the foreign
	 */
	public String getForeign() {
		return foreign;
	}

	/**
	 * @param foreign the foreign to set
	 */
	public void setForeign(String foreign) {
		this.foreign = foreign;
	}

	/**
	 * @return the foreignnr
	 */
	public String getForeignnr() {
		return foreignnr;
	}

	/**
	 * @param foreignnr the foreignnr to set
	 */
	public void setForeignnr(String foreignnr) {
		this.foreignnr = foreignnr;
	}

	/**
	 * @return the group
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * @param group the group to set
	 */
	public void setGroup(String group) {
		this.group = group;
	}

	/**
	 * @return the smiDrops
	 */
	public SmiDrops getSmiDrops() {
		return smiDrops;
	}

	/**
	 * @param smiDrops the smiDrops to set
	 */
	public void setSmiDrops(SmiDrops smiDrops) {
		this.smiDrops = smiDrops;
	}

}
