package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="IH_ROUTING_SECTION")
public class IhRoutingSection implements Serializable {
	@Id
	@Column(name="OID_IH_ROUTING_SEC")
	private long oidIhRoutingSec;

	@Column(name="RT_SECTION_NO")
	private BigDecimal rtSectionNo;

	@Column(name="RT_TYPE_OF_WIRING")
	private String rtTypeOfWiring;

	@Column(name="RT_UPDATED_BY")
	private String rtUpdatedBy;

	@Column(name="RT_DATE_UPDATED")
	private Date rtDateUpdated;

	@Column(name="RT_TYPE_OF_CONNECTION")
	private String rtTypeOfConnection;

	@Column(name="RT_CROSSOVER")
	private String rtCrossover;

	@Column(name="RT_DIRECTION")
	private String rtDirection;

	@Column(name="RT_MEDIA_NO")
	private BigDecimal rtMediaNo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_FUEHRUNGSABSOID")
	private Fuehrungsabschnitt fkFuehrungsabsoid;

	private static final long serialVersionUID = 1L;

	public IhRoutingSection() {
		super();
	}

	public long getOidIhRoutingSec() {
		return this.oidIhRoutingSec;
	}

	public void setOidIhRoutingSec(long oidIhRoutingSec) {
		this.oidIhRoutingSec = oidIhRoutingSec;
	}

	public BigDecimal getRtSectionNo() {
		return this.rtSectionNo;
	}

	public void setRtSectionNo(BigDecimal rtSectionNo) {
		this.rtSectionNo = rtSectionNo;
	}

	public String getRtTypeOfWiring() {
		return this.rtTypeOfWiring;
	}

	public void setRtTypeOfWiring(String rtTypeOfWiring) {
		this.rtTypeOfWiring = rtTypeOfWiring;
	}

	public String getRtUpdatedBy() {
		return this.rtUpdatedBy;
	}

	public void setRtUpdatedBy(String rtUpdatedBy) {
		this.rtUpdatedBy = rtUpdatedBy;
	}

	public Date getRtDateUpdated() {
		return this.rtDateUpdated;
	}

	public void setRtDateUpdated(Date rtDateUpdated) {
		this.rtDateUpdated = rtDateUpdated;
	}

	public String getRtTypeOfConnection() {
		return this.rtTypeOfConnection;
	}

	public void setRtTypeOfConnection(String rtTypeOfConnection) {
		this.rtTypeOfConnection = rtTypeOfConnection;
	}

	public String getRtCrossover() {
		return this.rtCrossover;
	}

	public void setRtCrossover(String rtCrossover) {
		this.rtCrossover = rtCrossover;
	}

	public String getRtDirection() {
		return this.rtDirection;
	}

	public void setRtDirection(String rtDirection) {
		this.rtDirection = rtDirection;
	}

	public BigDecimal getRtMediaNo() {
		return this.rtMediaNo;
	}

	public void setRtMediaNo(BigDecimal rtMediaNo) {
		this.rtMediaNo = rtMediaNo;
	}

	public Fuehrungsabschnitt getFkFuehrungsabsoid() {
		return this.fkFuehrungsabsoid;
	}

	public void setFkFuehrungsabsoid(Fuehrungsabschnitt fkFuehrungsabsoid) {
		this.fkFuehrungsabsoid = fkFuehrungsabsoid;
	}

}
