package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="WINDOW_OBJECT_USAG")
public class WindowObjectUsag implements Serializable {
	@EmbeddedId
	private WindowObjectUsagPK windowObjectUsagPK;

	@Column(name="DATE_CREATED")
	private Date dateCreated;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_FUNKTION_SECOID")
	private Resource resource;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WINDOWSECURITY")
	private Window window;

	private static final long serialVersionUID = 1L;

	public WindowObjectUsag() {
		super();
	}


	/**
	 * @return the windowObjectUsagPK
	 */
	public WindowObjectUsagPK getWindowObjectUsagPK() {
		return windowObjectUsagPK;
	}


	/**
	 * @param windowObjectUsagPK the windowObjectUsagPK to set
	 */
	public void setWindowObjectUsagPK(WindowObjectUsagPK windowObjectUsagPK) {
		this.windowObjectUsagPK = windowObjectUsagPK;
	}


	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Resource getFkFunktionSecoid() {
		return this.resource;
	}

	public void setFkFunktionSecoid(Resource fkFunktionSecoid) {
		this.resource = fkFunktionSecoid;
	}

	public Window getFkWindowsecurity() {
		return this.window;
	}

	public void setFkWindowsecurity(Window fkWindowsecurity) {
		this.window = fkWindowsecurity;
	}


}
