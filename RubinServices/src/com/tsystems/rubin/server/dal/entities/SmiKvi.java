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
@Table(name="SMI_KVI")
public class SmiKvi implements Serializable {
	@Id
	@Column(name="OID_KVI")
	private Long id;

	private Date datetime;

	private String importsystem;

	@Column(name="KVI_NAME")
	private String kviName;

	@Column(name="XMLNS_XSI")
	private String xmlnsXsi;

	@Column(name="XSI_NONSSCHLOC")
	private String xsiNonsschloc;

	@OneToMany(mappedBy="smiKvi")
	private Set<SmiDrops> smiDrops;

	@OneToMany(mappedBy="smiKvi")
	private Set<SmiMaintenance> smisMaintenance;

	private static final long serialVersionUID = 1L;

	public SmiKvi() {
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
	 * @return the datetime
	 */
	public Date getDatetime() {
		return datetime;
	}

	/**
	 * @param datetime the datetime to set
	 */
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	/**
	 * @return the importsystem
	 */
	public String getImportsystem() {
		return importsystem;
	}

	/**
	 * @param importsystem the importsystem to set
	 */
	public void setImportsystem(String importsystem) {
		this.importsystem = importsystem;
	}

	/**
	 * @return the kviName
	 */
	public String getKviName() {
		return kviName;
	}

	/**
	 * @param kviName the kviName to set
	 */
	public void setKviName(String kviName) {
		this.kviName = kviName;
	}

	/**
	 * @return the xmlnsXsi
	 */
	public String getXmlnsXsi() {
		return xmlnsXsi;
	}

	/**
	 * @param xmlnsXsi the xmlnsXsi to set
	 */
	public void setXmlnsXsi(String xmlnsXsi) {
		this.xmlnsXsi = xmlnsXsi;
	}

	/**
	 * @return the xsiNonsschloc
	 */
	public String getXsiNonsschloc() {
		return xsiNonsschloc;
	}

	/**
	 * @param xsiNonsschloc the xsiNonsschloc to set
	 */
	public void setXsiNonsschloc(String xsiNonsschloc) {
		this.xsiNonsschloc = xsiNonsschloc;
	}

	/**
	 * @return the smiDrops
	 */
	public Set<SmiDrops> getSmiDrops() {
		return smiDrops;
	}

	/**
	 * @param smiDrops the smiDrops to set
	 */
	public void setSmiDrops(Set<SmiDrops> smiDrops) {
		this.smiDrops = smiDrops;
	}

	/**
	 * @return the smisMaintenance
	 */
	public Set<SmiMaintenance> getSmisMaintenance() {
		return smisMaintenance;
	}

	/**
	 * @param smisMaintenance the smisMaintenance to set
	 */
	public void setSmisMaintenance(Set<SmiMaintenance> smisMaintenance) {
		this.smisMaintenance = smisMaintenance;
	}

}
