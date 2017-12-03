package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Hat0 implements Serializable {
	@EmbeddedId
	private Hat0PK hat0PK;

	private static final long serialVersionUID = 1L;

	public Hat0() {
		super();
	}

	/**
	 * @return the hat0PK
	 */
	public Hat0PK getHat0PK() {
		return hat0PK;
	}

	/**
	 * @param hat0PK the hat0PK to set
	 */
	public void setHat0PK(Hat0PK hat0PK) {
		this.hat0PK = hat0PK;
	}

	
}
