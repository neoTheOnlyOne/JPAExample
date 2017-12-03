package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Position0 implements Serializable {
	@Id
	@Column(name="OID_POSITION")
	private long oidPosition;

	@Column(name="POSITION_REIHENFOL")
	private BigDecimal positionReihenfol;

	@Column(name="POSITION_BESCHALTU")
	private Date positionBeschaltu;

	@Column(name="POSITION_BESCHALT0")
	private Date positionBeschalt0;

	private String positionsbezeichnu;

	private String positionsvormerk;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_KAPAZITAETOID_K")
	private Capacity fkKapazitaetoidK;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_LINIENABSCHNOID")
	private Linienabschnitt fkLinienabschnoid;

	@OneToMany(mappedBy="fkPosition0oidPo")
	private Set<Fuehrungsabschnitt> fuehrungsabschnittCollection;

	private static final long serialVersionUID = 1L;

	public Position0() {
		super();
	}

	public long getOidPosition() {
		return this.oidPosition;
	}

	public void setOidPosition(long oidPosition) {
		this.oidPosition = oidPosition;
	}

	public BigDecimal getPositionReihenfol() {
		return this.positionReihenfol;
	}

	public void setPositionReihenfol(BigDecimal positionReihenfol) {
		this.positionReihenfol = positionReihenfol;
	}

	public Date getPositionBeschaltu() {
		return this.positionBeschaltu;
	}

	public void setPositionBeschaltu(Date positionBeschaltu) {
		this.positionBeschaltu = positionBeschaltu;
	}

	public Date getPositionBeschalt0() {
		return this.positionBeschalt0;
	}

	public void setPositionBeschalt0(Date positionBeschalt0) {
		this.positionBeschalt0 = positionBeschalt0;
	}

	public String getPositionsbezeichnu() {
		return this.positionsbezeichnu;
	}

	public void setPositionsbezeichnu(String positionsbezeichnu) {
		this.positionsbezeichnu = positionsbezeichnu;
	}

	public String getPositionsvormerk() {
		return this.positionsvormerk;
	}

	public void setPositionsvormerk(String positionsvormerk) {
		this.positionsvormerk = positionsvormerk;
	}

	public Capacity getFkKapazitaetoidK() {
		return this.fkKapazitaetoidK;
	}

	public void setFkKapazitaetoidK(Capacity fkKapazitaetoidK) {
		this.fkKapazitaetoidK = fkKapazitaetoidK;
	}

	public Linienabschnitt getFkLinienabschnoid() {
		return this.fkLinienabschnoid;
	}

	public void setFkLinienabschnoid(Linienabschnitt fkLinienabschnoid) {
		this.fkLinienabschnoid = fkLinienabschnoid;
	}

	public Set<Fuehrungsabschnitt> getFuehrungsabschnittCollection() {
		return this.fuehrungsabschnittCollection;
	}

	public void setFuehrungsabschnittCollection(Set<Fuehrungsabschnitt> fuehrungsabschnittCollection) {
		this.fuehrungsabschnittCollection = fuehrungsabschnittCollection;
	}

}
