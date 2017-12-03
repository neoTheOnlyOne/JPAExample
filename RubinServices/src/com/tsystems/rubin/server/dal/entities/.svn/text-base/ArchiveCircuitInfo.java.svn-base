package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ARCHIVE_CIRCUIT_INFO")
public class ArchiveCircuitInfo implements Serializable {
	@Id
	@Column(name="OID_ARCHIVE_CIRCUIT_INFO")
	private Long id;

	@Column(name="ACI_RECORD")
	@Lob
	private byte[] aciRecord;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ARCHIVE_CIRCOID_ARCHIVE_CIR")
	private ArchiveCircuit archiveCircuit;

	private static final long serialVersionUID = 1L;

	public ArchiveCircuitInfo() {
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
	 * @return the aciRecord
	 */
	public byte[] getAciRecord() {
		return aciRecord;
	}

	/**
	 * @param aciRecord the aciRecord to set
	 */
	public void setAciRecord(byte[] aciRecord) {
		this.aciRecord = aciRecord;
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
