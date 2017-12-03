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
@Table(name="SMI_DROP")
public class SmiDrop implements Serializable {
	@Id
	@Column(name="OID_DROP")
	private Long id;

	@Column(name="FOREIGN0")
	private String foreign;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SMI_DROPSOID_DROPS")
	private SmiDrops smiDrops;

	private static final long serialVersionUID = 1L;

	public SmiDrop() {
		super();
	}

	public long getOidDrop() {
		return this.id;
	}

	public void setOidDrop(long oidDrop) {
		this.id = oidDrop;
	}

	public String getForeign0() {
		return this.foreign;
	}

	public void setForeign0(String foreign0) {
		this.foreign = foreign0;
	}

	public SmiDrops getFkSmiDrops() {
		return this.smiDrops;
	}

	public void setFkSmiDrops(SmiDrops fkSmiDrops) {
		this.smiDrops = fkSmiDrops;
	}

}
