package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Instandhaltungsabk implements Serializable {
	@Id
	@Column(name="OUD_INSTANDHALTUNG")
	private Long id;

	@Column(name="DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="IH_ABK_KURZBEZEICH")
	private String ihAbkKurzbezeich;

	@Column(name="IH_ABKOMMEN_GUELTI")
	private Date ihAbkommenGuelti;

	@Column(name="IH_ABKOMMENBEZEICH")
	private String ihAbkommenbezeich;

	@Column(name="IH_ABKOMMENKURZBEZ")
	private String ihAbkommenkurzbez;

	@Column(name="IH_ABKOMMENNOTIZ")
	private String ihAbkommennotiz;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_REGIONOID_REGIO")
	private Region region;

	private static final long serialVersionUID = 1L;

	public Instandhaltungsabk() {
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
	 * @return the ihAbkKurzbezeich
	 */
	public String getIhAbkKurzbezeich() {
		return ihAbkKurzbezeich;
	}

	/**
	 * @param ihAbkKurzbezeich the ihAbkKurzbezeich to set
	 */
	public void setIhAbkKurzbezeich(String ihAbkKurzbezeich) {
		this.ihAbkKurzbezeich = ihAbkKurzbezeich;
	}

	/**
	 * @return the ihAbkommenGuelti
	 */
	public Date getIhAbkommenGuelti() {
		return ihAbkommenGuelti;
	}

	/**
	 * @param ihAbkommenGuelti the ihAbkommenGuelti to set
	 */
	public void setIhAbkommenGuelti(Date ihAbkommenGuelti) {
		this.ihAbkommenGuelti = ihAbkommenGuelti;
	}

	/**
	 * @return the ihAbkommenbezeich
	 */
	public String getIhAbkommenbezeich() {
		return ihAbkommenbezeich;
	}

	/**
	 * @param ihAbkommenbezeich the ihAbkommenbezeich to set
	 */
	public void setIhAbkommenbezeich(String ihAbkommenbezeich) {
		this.ihAbkommenbezeich = ihAbkommenbezeich;
	}

	/**
	 * @return the ihAbkommenkurzbez
	 */
	public String getIhAbkommenkurzbez() {
		return ihAbkommenkurzbez;
	}

	/**
	 * @param ihAbkommenkurzbez the ihAbkommenkurzbez to set
	 */
	public void setIhAbkommenkurzbez(String ihAbkommenkurzbez) {
		this.ihAbkommenkurzbez = ihAbkommenkurzbez;
	}

	/**
	 * @return the ihAbkommennotiz
	 */
	public String getIhAbkommennotiz() {
		return ihAbkommennotiz;
	}

	/**
	 * @param ihAbkommennotiz the ihAbkommennotiz to set
	 */
	public void setIhAbkommennotiz(String ihAbkommennotiz) {
		this.ihAbkommennotiz = ihAbkommennotiz;
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
	 * @return the region
	 */
	public Region getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(Region region) {
		this.region = region;
	}

}
