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
@Table(name="INFO_EIGENSCHAFT")
public class InfoEigenschaft implements Serializable {
	@Id
	@Column(name="EIGENSCHAFT_ID")
	private Long id;

	@Column(name="EIGENSCHAFT")
	private String property;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_VERBINDUNG")
	private InfoVerbindung infoVerbindung;

	private static final long serialVersionUID = 1L;

	public InfoEigenschaft() {
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
	 * @return the property
	 */
	public String getProperty() {
		return property;
	}

	/**
	 * @param property the property to set
	 */
	public void setProperty(String property) {
		this.property = property;
	}

	/**
	 * @return the infoVerbindung
	 */
	public InfoVerbindung getInfoVerbindung() {
		return infoVerbindung;
	}

	/**
	 * @param infoVerbindung the infoVerbindung to set
	 */
	public void setInfoVerbindung(InfoVerbindung infoVerbindung) {
		this.infoVerbindung = infoVerbindung;
	}



}
