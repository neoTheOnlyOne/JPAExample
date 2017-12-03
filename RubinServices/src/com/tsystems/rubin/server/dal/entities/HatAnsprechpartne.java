package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="HAT_ANSPRECHPARTNE")
public class HatAnsprechpartne implements Serializable {
	@EmbeddedId
	private HatAnsprechpartnePK hatAnsprechpartnePK;

	private static final long serialVersionUID = 1L;

	public HatAnsprechpartne() {
		super();
	}

	/**
	 * @return the hatAnsprechpartnePK
	 */
	public HatAnsprechpartnePK getHatAnsprechpartnePK() {
		return hatAnsprechpartnePK;
	}

	/**
	 * @param hatAnsprechpartnePK the hatAnsprechpartnePK to set
	 */
	public void setHatAnsprechpartnePK(HatAnsprechpartnePK hatAnsprechpartnePK) {
		this.hatAnsprechpartnePK = hatAnsprechpartnePK;
	}

	}
