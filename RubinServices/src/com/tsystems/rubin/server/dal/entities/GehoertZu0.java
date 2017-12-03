package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="GEHOERT_ZU0")
public class GehoertZu0 implements Serializable {
	@EmbeddedId
	private GehoertZu0PK  gehoertZu0PK;

	private static final long serialVersionUID = 1L;

	public GehoertZu0() {
		super();
	}

	/**
	 * @return the gehoertZu0PK
	 */
	public GehoertZu0PK getGehoertZu0PK() {
		return gehoertZu0PK;
	}

	/**
	 * @param gehoertZu0PK the gehoertZu0PK to set
	 */
	public void setGehoertZu0PK(GehoertZu0PK gehoertZu0PK) {
		this.gehoertZu0PK = gehoertZu0PK;
	}

	

}
