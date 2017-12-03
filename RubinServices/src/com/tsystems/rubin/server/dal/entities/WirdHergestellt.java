package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="WIRD_HERGESTELLT")
public class WirdHergestellt implements Serializable {
	@EmbeddedId
	private WirdHergestelltPK wirdHergestelltPK;

	private static final long serialVersionUID = 1L;

	public WirdHergestellt() {
		super();
	}

	/**
	 * @return the wirdHergestelltPK
	 */
	public WirdHergestelltPK getWirdHergestelltPK() {
		return wirdHergestelltPK;
	}

	/**
	 * @param wirdHergestelltPK the wirdHergestelltPK to set
	 */
	public void setWirdHergestelltPK(WirdHergestelltPK wirdHergestelltPK) {
		this.wirdHergestelltPK = wirdHergestelltPK;
	}

	
}
