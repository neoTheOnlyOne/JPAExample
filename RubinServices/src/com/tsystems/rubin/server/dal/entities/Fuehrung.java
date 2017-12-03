package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;

@NamedQueries( {
	@NamedQuery(name = NamedQueryConstants.FIND_ROUTINGBYCIRCUITID, 
			    query = "Select new com.tsystems.rubin.server.dal.dvo.FuehrungDVO" + Fuehrung.COMMON_PICKLIST_FIELDS_STRING 
			            + " from Fuehrung f where f.fkTransportveroid.oidTransportverbi = ?1" )
			
 })
@Entity
public class Fuehrung implements Serializable {
	
	@Transient
    final static String COMMON_PICKLIST_FIELDS_STRING = "(f.oidFuehrung)";
	
	@Id
	@Column(name="OID_FUEHRUNG")
	private Long oidFuehrung;

	@Column(name="FUEHRUNG_FUEHRUNGS")
	private String fuehrungFuehrungs;

	@Column(name="FUEHRUNG_BEGINN")
	private Date fuehrungBeginn;

	@Column(name="FUEHRUNG_BEGINN_ST")
	private String fuehrungBeginnSt;

	@Column(name="FUEHRUNG_NOTIZ")
	private String fuehrungNotiz;

	@Column(name="FUEHRUNG_PLANMAESS")
	private String fuehrungPlanmaess;

	@Column(name="FUEHRUNG_SOLL_ENDE")
	private Date fuehrungSollEnde;

	@Column(name="FUEHRUNG_STATUS")
	private String fuehrungStatus;

	@Column(name="MASSNAHME_FUEHRUNG")
	private String massnahmeFuehrung;

	@Column(name="MASSNAHME_FUEHRUN0")
	private String massnahmeFuehrun0;

	@Column(name="SCHALTAUFTRAG_FUEH")
	private String schaltauftragFueh;

	@Column(name="SCHALTAUFTRAG_BEG")
	private String schaltauftragBeg;

	@Column(name="SCHALTAUFTRAG_END")
	private String schaltauftragEnd;

	private String restoration;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK0ENDPUNKTOID_ENDPUNKT")
	private Terminal fk0endpunktoidEndpunkt;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_ENDPUNKTOID_ENDPUNKT")
	private Terminal fkEndpunktoidEndpunkt;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK0RESTORATION_OID_RESTORATION")
	private RestorationGroup fk0restorationOidRestoration;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_RESTORATION_OID_RESTORATION")
	private RestorationGroup fkRestorationOidRestoration;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID")
	private Transportverbindun fkTransportveroid;

	@OneToMany(mappedBy="fkFuehrungoidFuehrung")
	private Set<FaultStatus> faultStatusCollection;

	@OneToMany(mappedBy="fkFuehrungoidFue")
	private Set<Fuehrungsabschnitt> fuehrungsabschnittCollection;

	@OneToMany(mappedBy="fk0fuehrungoidFue")
	private Set<Schaltauftrag> schaltauftragCollection;

	@OneToMany(mappedBy="fkFuehrungoidFue")
	private Set<Schaltauftrag> schaltauftragCollection2;

	private static final long serialVersionUID = 1L;

	public Fuehrung() {
		super();
	}

	public Long getOidFuehrung() {
		return this.oidFuehrung;
	}

	public void setOidFuehrung(Long oidFuehrung) {
		this.oidFuehrung = oidFuehrung;
	}

	public String getFuehrungFuehrungs() {
		return this.fuehrungFuehrungs;
	}

	public void setFuehrungFuehrungs(String fuehrungFuehrungs) {
		this.fuehrungFuehrungs = fuehrungFuehrungs;
	}

	public Date getFuehrungBeginn() {
		return this.fuehrungBeginn;
	}

	public void setFuehrungBeginn(Date fuehrungBeginn) {
		this.fuehrungBeginn = fuehrungBeginn;
	}

	public String getFuehrungBeginnSt() {
		return this.fuehrungBeginnSt;
	}

	public void setFuehrungBeginnSt(String fuehrungBeginnSt) {
		this.fuehrungBeginnSt = fuehrungBeginnSt;
	}

	public String getFuehrungNotiz() {
		return this.fuehrungNotiz;
	}

	public void setFuehrungNotiz(String fuehrungNotiz) {
		this.fuehrungNotiz = fuehrungNotiz;
	}

	public String getFuehrungPlanmaess() {
		return this.fuehrungPlanmaess;
	}

	public void setFuehrungPlanmaess(String fuehrungPlanmaess) {
		this.fuehrungPlanmaess = fuehrungPlanmaess;
	}

	public Date getFuehrungSollEnde() {
		return this.fuehrungSollEnde;
	}

	public void setFuehrungSollEnde(Date fuehrungSollEnde) {
		this.fuehrungSollEnde = fuehrungSollEnde;
	}

	public String getFuehrungStatus() {
		return this.fuehrungStatus;
	}

	public void setFuehrungStatus(String fuehrungStatus) {
		this.fuehrungStatus = fuehrungStatus;
	}

	public String getMassnahmeFuehrung() {
		return this.massnahmeFuehrung;
	}

	public void setMassnahmeFuehrung(String massnahmeFuehrung) {
		this.massnahmeFuehrung = massnahmeFuehrung;
	}

	public String getMassnahmeFuehrun0() {
		return this.massnahmeFuehrun0;
	}

	public void setMassnahmeFuehrun0(String massnahmeFuehrun0) {
		this.massnahmeFuehrun0 = massnahmeFuehrun0;
	}

	public String getSchaltauftragFueh() {
		return this.schaltauftragFueh;
	}

	public void setSchaltauftragFueh(String schaltauftragFueh) {
		this.schaltauftragFueh = schaltauftragFueh;
	}

	public String getSchaltauftragBeg() {
		return this.schaltauftragBeg;
	}

	public void setSchaltauftragBeg(String schaltauftragBeg) {
		this.schaltauftragBeg = schaltauftragBeg;
	}

	public String getSchaltauftragEnd() {
		return this.schaltauftragEnd;
	}

	public void setSchaltauftragEnd(String schaltauftragEnd) {
		this.schaltauftragEnd = schaltauftragEnd;
	}

	public String getRestoration() {
		return this.restoration;
	}

	public void setRestoration(String restoration) {
		this.restoration = restoration;
	}

	public Terminal getFk0endpunktoidEndpunkt() {
		return this.fk0endpunktoidEndpunkt;
	}

	public void setFk0endpunktoidEndpunkt(Terminal fk0endpunktoidEndpunkt) {
		this.fk0endpunktoidEndpunkt = fk0endpunktoidEndpunkt;
	}

	public Terminal getFkEndpunktoidEndpunkt() {
		return this.fkEndpunktoidEndpunkt;
	}

	public void setFkEndpunktoidEndpunkt(Terminal fkEndpunktoidEndpunkt) {
		this.fkEndpunktoidEndpunkt = fkEndpunktoidEndpunkt;
	}

	public RestorationGroup getFk0restorationOidRestoration() {
		return this.fk0restorationOidRestoration;
	}

	public void setFk0restorationOidRestoration(RestorationGroup fk0restorationOidRestoration) {
		this.fk0restorationOidRestoration = fk0restorationOidRestoration;
	}

	public RestorationGroup getFkRestorationOidRestoration() {
		return this.fkRestorationOidRestoration;
	}

	public void setFkRestorationOidRestoration(RestorationGroup fkRestorationOidRestoration) {
		this.fkRestorationOidRestoration = fkRestorationOidRestoration;
	}

	public Transportverbindun getFkTransportveroid() {
		return this.fkTransportveroid;
	}

	public void setFkTransportveroid(Transportverbindun fkTransportveroid) {
		this.fkTransportveroid = fkTransportveroid;
	}

	public Set<FaultStatus> getFaultStatusCollection() {
		return this.faultStatusCollection;
	}

	public void setFaultStatusCollection(Set<FaultStatus> faultStatusCollection) {
		this.faultStatusCollection = faultStatusCollection;
	}

	public Set<Fuehrungsabschnitt> getFuehrungsabschnittCollection() {
		return this.fuehrungsabschnittCollection;
	}

	public void setFuehrungsabschnittCollection(Set<Fuehrungsabschnitt> fuehrungsabschnittCollection) {
		this.fuehrungsabschnittCollection = fuehrungsabschnittCollection;
	}

	public Set<Schaltauftrag> getSchaltauftragCollection() {
		return this.schaltauftragCollection;
	}

	public void setSchaltauftragCollection(Set<Schaltauftrag> schaltauftragCollection) {
		this.schaltauftragCollection = schaltauftragCollection;
	}

	public Set<Schaltauftrag> getSchaltauftragCollection2() {
		return this.schaltauftragCollection2;
	}

	public void setSchaltauftragCollection2(Set<Schaltauftrag> schaltauftragCollection2) {
		this.schaltauftragCollection2 = schaltauftragCollection2;
	}

}
