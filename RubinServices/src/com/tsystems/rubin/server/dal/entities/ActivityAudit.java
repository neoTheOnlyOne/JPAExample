package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ACTIVITY_AUDIT")
public class ActivityAudit implements Serializable {
	 /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACTIVITY_AUDIT")
    @SequenceGenerator(name = "ACTIVITY_AUDIT", sequenceName = "ACTIVITY_AUDIT_SEQUENCE", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    /** The activity. */
    private String activity;

    /** The date. */
    @Column(name = "DATE0")
    private Date date;


    /** The time. */
    @Column(name = "TIME0")
    private Time time;


	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_BEARBEITER_SZER")
	private User user;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_FUNKTION_SECOID")
	private Resource resourceId;

	private static final long serialVersionUID = 1L;

	public ActivityAudit() {
		super();
	}

	public long getId() {
		return this.id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	

	/**
	 * @return the activity
	 */
	public String getActivity() {
		return activity;
	}

	/**
	 * @param activity the activity to set
	 */
	public void setActivity(String activity) {
		this.activity = activity;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the time
	 */
	public Time getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(Time time) {
		this.time = time;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the resourceId
	 */
	public Resource getResourceId() {
		return resourceId;
	}

	/**
	 * @param resourceId the resourceId to set
	 */
	public void setResourceId(Resource resourceId) {
		this.resourceId = resourceId;
	}


	
}
