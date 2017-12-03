package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="NGVI_KEYWORDS")
public class NgviKeywords implements Serializable {
	@Id
	@Column(name = "OID")
	private Long id;

	@Column(name="HIERARCHY_LEVEL")
	private Long hierarchyLevel;

	private String keyword;

	@Column(name = "SEQUENCE0")
	private Long sequence;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_NGVI_NE_TYPEOID")
	private NgviNeType ngviNeType;

	private static final long serialVersionUID = 1L;

	public NgviKeywords() {
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
	 * @return the hierarchyLevel
	 */
	public Long getHierarchyLevel() {
		return hierarchyLevel;
	}

	/**
	 * @param hierarchyLevel the hierarchyLevel to set
	 */
	public void setHierarchyLevel(Long hierarchyLevel) {
		this.hierarchyLevel = hierarchyLevel;
	}

	/**
	 * @return the keyword
	 */
	public String getKeyword() {
		return keyword;
	}

	/**
	 * @param keyword the keyword to set
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	/**
	 * @return the sequence
	 */
	public Long getSequence() {
		return sequence;
	}

	/**
	 * @param sequence the sequence to set
	 */
	public void setSequence(Long sequence) {
		this.sequence = sequence;
	}

	/**
	 * @return the ngviNeType
	 */
	public NgviNeType getNgviNeType() {
		return ngviNeType;
	}

	/**
	 * @param ngviNeType the ngviNeType to set
	 */
	public void setNgviNeType(NgviNeType ngviNeType) {
		this.ngviNeType = ngviNeType;
	}


}
