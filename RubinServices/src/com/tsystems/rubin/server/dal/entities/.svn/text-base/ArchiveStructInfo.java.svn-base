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
@Table(name="ARCHIVE_STRUCT_INFO")
public class ArchiveStructInfo implements Serializable {
	@Id
	@Column(name="OID_ARCHIVE_STRUCT_INFO")
	private Long id;

	@Column(name="AS_STRUCT_INFO_TYPE_NAME")
	private String typeName;

	@Column(name="AS_STRUCT_INFO_VALUE")
	private String value;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ARCHIVE_CIRCOID_ARCHIVE_CIR")
	private ArchiveCircuit archiveCircuit;

	private static final long serialVersionUID = 1L;

	public ArchiveStructInfo() {
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
	 * @return the typeName
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * @param typeName the typeName to set
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the archiveCircuit
	 */
	public ArchiveCircuit getArchiveCircuit() {
		return archiveCircuit;
	}

	/**
	 * @param archiveCircuit the archiveCircuit to set
	 */
	public void setArchiveCircuit(ArchiveCircuit archiveCircuit) {
		this.archiveCircuit = archiveCircuit;
	}

	
}
