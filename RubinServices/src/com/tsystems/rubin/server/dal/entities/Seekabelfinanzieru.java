package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Seekabelfinanzieru implements Serializable {
	@Id
	@Column(name="OID_SEEKABELFINANZ")
	private Long id;

	@Column(name="DATE_UPDATED")
	private Date dateUpdated;

	private String finanzierungsmeth0;

	private String finanzierungsmetho;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@OneToMany(mappedBy="seekabelfinanzieru")
	private Set<Seekabelvertrag> seekabelvertrags;

	private static final long serialVersionUID = 1L;

	public Seekabelfinanzieru() {
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
	 * @return the finanzierungsmeth0
	 */
	public String getFinanzierungsmeth0() {
		return finanzierungsmeth0;
	}

	/**
	 * @param finanzierungsmeth0 the finanzierungsmeth0 to set
	 */
	public void setFinanzierungsmeth0(String finanzierungsmeth0) {
		this.finanzierungsmeth0 = finanzierungsmeth0;
	}

	/**
	 * @return the finanzierungsmetho
	 */
	public String getFinanzierungsmetho() {
		return finanzierungsmetho;
	}

	/**
	 * @param finanzierungsmetho the finanzierungsmetho to set
	 */
	public void setFinanzierungsmetho(String finanzierungsmetho) {
		this.finanzierungsmetho = finanzierungsmetho;
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
	 * @return the seekabelvertrags
	 */
	public Set<Seekabelvertrag> getSeekabelvertrags() {
		return seekabelvertrags;
	}

	/**
	 * @param seekabelvertrags the seekabelvertrags to set
	 */
	public void setSeekabelvertrags(Set<Seekabelvertrag> seekabelvertrags) {
		this.seekabelvertrags = seekabelvertrags;
	}


}
