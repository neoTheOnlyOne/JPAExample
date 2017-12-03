package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="HAT_ANSPRECHPARTN0")
public class HatAnsprechpartn0 implements Serializable {
	@EmbeddedId
	private HatAnsprechpartn0PK  hatAnsprechpartn0PK;

	private static final long serialVersionUID = 1L;

	public HatAnsprechpartn0() {
		super();
	}

	/**
	 * @return the hatAnsprechpartn0PK
	 */
	public HatAnsprechpartn0PK getHatAnsprechpartn0PK() {
		return hatAnsprechpartn0PK;
	}

	/**
	 * @param hatAnsprechpartn0PK the hatAnsprechpartn0PK to set
	 */
	public void setHatAnsprechpartn0PK(HatAnsprechpartn0PK hatAnsprechpartn0PK) {
		this.hatAnsprechpartn0PK = hatAnsprechpartn0PK;
	}

	}
