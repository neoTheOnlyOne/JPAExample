package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INFO_FAULT_STATUS")
public class InfoFaultStatus implements Serializable {
	@Id
	@Column(name="FS_OID")
	private Long id;

	@Column(name="FS_FAULT_FK")
	private Long faultFk;

	@Column(name="FS_STATUS_FAULT")
	private String statusFault;

	@Column(name="FS_STATUS_VERBINDUNG")
	private String fsStatusVerbindung;

	@Column(name="FS_VERBINDUNG_FK")
	private Long fsVerbindungFk;

	private static final long serialVersionUID = 1L;

	public InfoFaultStatus() {
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
	 * @return the faultFk
	 */
	public Long getFaultFk() {
		return faultFk;
	}

	/**
	 * @param faultFk the faultFk to set
	 */
	public void setFaultFk(Long faultFk) {
		this.faultFk = faultFk;
	}

	/**
	 * @return the statusFault
	 */
	public String getStatusFault() {
		return statusFault;
	}

	/**
	 * @param statusFault the statusFault to set
	 */
	public void setStatusFault(String statusFault) {
		this.statusFault = statusFault;
	}

	/**
	 * @return the fsStatusVerbindung
	 */
	public String getFsStatusVerbindung() {
		return fsStatusVerbindung;
	}

	/**
	 * @param fsStatusVerbindung the fsStatusVerbindung to set
	 */
	public void setFsStatusVerbindung(String fsStatusVerbindung) {
		this.fsStatusVerbindung = fsStatusVerbindung;
	}

	/**
	 * @return the fsVerbindungFk
	 */
	public Long getFsVerbindungFk() {
		return fsVerbindungFk;
	}

	/**
	 * @param fsVerbindungFk the fsVerbindungFk to set
	 */
	public void setFsVerbindungFk(Long fsVerbindungFk) {
		this.fsVerbindungFk = fsVerbindungFk;
	}

}
