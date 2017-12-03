package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BEZIEHT_SICH_AUF")
public class BeziehtSichAuf implements Serializable {
	@EmbeddedId
	private BeziehtSichAufPK pk;

	private static final long serialVersionUID = 1L;

	public BeziehtSichAuf() {
		super();
	}

	public BeziehtSichAufPK getPk() {
		return this.pk;
	}

	public void setPk(BeziehtSichAufPK pk) {
		this.pk = pk;
	}


	
}
