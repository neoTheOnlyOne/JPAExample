package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="RESTORATION_GROUP")
public class RestorationGroup implements Serializable {
	@Id
	@Column(name="OID_RESTORATION_GROUP")
	private Long id;

	@Column(name="BEARBEITER")
	private String user;

	@Column(name="STATUS")
	private String status;

	@Column(name="TIMESTAMP_LASTUPDATED")
	private Date timestampLastupdated;

	@OneToMany(mappedBy="restorationGroup0")
	private Set<Routing> routings;

	@OneToMany(mappedBy="restorationGroup")
	private Set<Routing> routings2;

	@ManyToMany(mappedBy="restorationGroups")
	private Set<FaultRecord> faultRecords;

	private static final long serialVersionUID = 1L;

	public RestorationGroup() {
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
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the timestampLastupdated
	 */
	public Date getTimestampLastupdated() {
		return timestampLastupdated;
	}

	/**
	 * @param timestampLastupdated the timestampLastupdated to set
	 */
	public void setTimestampLastupdated(Date timestampLastupdated) {
		this.timestampLastupdated = timestampLastupdated;
	}

	/**
	 * @return the routings
	 */
	public Set<Routing> getRoutings() {
		return routings;
	}

	/**
	 * @param routings the routings to set
	 */
	public void setRoutings(Set<Routing> routings) {
		this.routings = routings;
	}

	/**
	 * @return the routings2
	 */
	public Set<Routing> getRoutings2() {
		return routings2;
	}

	/**
	 * @param routings2 the routings2 to set
	 */
	public void setRoutings2(Set<Routing> routings2) {
		this.routings2 = routings2;
	}

	/**
	 * @return the faultRecords
	 */
	public Set<FaultRecord> getFaultRecords() {
		return faultRecords;
	}

	/**
	 * @param faultRecords the faultRecords to set
	 */
	public void setFaultRecords(Set<FaultRecord> faultRecords) {
		this.faultRecords = faultRecords;
	}

}
