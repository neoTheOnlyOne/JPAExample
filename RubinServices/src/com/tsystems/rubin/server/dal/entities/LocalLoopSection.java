package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="LL_SECTION")
public class LocalLoopSection implements Serializable {
	@Id
	@Column(name="OID_LL_SECTION")
	private Long id;

	@Column(name="DATE_UPDATED")
	private Date lastUpdate;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_FUEHRUNGSABSOID_FUEHRUNGSAB")
	private RoutingSection routingSection;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KAPAZITAETOID_KAPAZITAET")
	private Capacity capacity;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_KIND_OF_SERVOID_KIND_OF_SER")
	private KindOfService kindOfService;

	private static final long serialVersionUID = 1L;

	public LocalLoopSection() {
		super();
	}

	public long getOidLlSection() {
		return this.id;
	}

	public void setOidLlSection(long oidLlSection) {
		this.id = oidLlSection;
	}

	public Date getDateUpdated() {
		return this.lastUpdate;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.lastUpdate = dateUpdated;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public RoutingSection getFkFuehrungsabsoidFuehrungsab() {
		return this.routingSection;
	}

	public void setFkFuehrungsabsoidFuehrungsab(RoutingSection fkFuehrungsabsoidFuehrungsab) {
		this.routingSection = fkFuehrungsabsoidFuehrungsab;
	}

	public Capacity getFkKapazitaet() {
		return this.capacity;
	}

	public void setFkKapazitaet(Capacity fkKapazitaet) {
		this.capacity = fkKapazitaet;
	}

	public KindOfService getFkKindOfServoidKindOfSer() {
		return this.kindOfService;
	}

	public void setFkKindOfServoidKindOfSer(KindOfService fkKindOfServoidKindOfSer) {
		this.kindOfService = fkKindOfServoidKindOfSer;
	}

}
