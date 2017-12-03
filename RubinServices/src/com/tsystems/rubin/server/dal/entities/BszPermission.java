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
@Table(name="BSZ_PERMISSION")
public class BszPermission implements Serializable {
	  /** The id. */
    @Id
    @Column(name = "OID_PERMISSION")
    private Long id;

    /** The bsz permitted. */
    @Column(name = "BSZ_PERMITTED")
    private String bszPermitted;

    /** The user. */
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "FK_BEARBEITER_SZERTIFIKATSNUMM")
    private User user;

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new bsz permission.
     */
    public BszPermission() {
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
	 * @return the bszPermitted
	 */
	public String getBszPermitted() {
		return bszPermitted;
	}

	/**
	 * @param bszPermitted the bszPermitted to set
	 */
	public void setBszPermitted(String bszPermitted) {
		this.bszPermitted = bszPermitted;
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

    
}
