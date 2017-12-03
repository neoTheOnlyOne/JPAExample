package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Schaltauftrag implements Serializable {
	@Id
	@Column(name="OID_SCHALTAUFTRAG")
	private long oidSchaltauftrag;

	private String bearbeiter;

	@Column(name="BEARBEITER_TELEFON")
	private String bearbeiterTelefon;

	private String erledigungsmeldung;

	private String erledigungsmeldun0;

	private String folgebuchstabe;

	private Date schaltauftragsdatu;

	private String schaltauftragserte;

	private String schaltmassnahme;

	@Column(name="SONSTIGE_ANGABEN1")
	private String sonstigeAngaben1;

	@Column(name="SONSTIGE_ANGABEN2")
	private String sonstigeAngaben2;

	@Column(name="SONSTIGE_ANGABEN3")
	private String sonstigeAngaben3;

	@Column(name="SONSTIGE_ANGABEN4")
	private String sonstigeAngaben4;

	@Column(name="SONSTIGE_ANGABEN5")
	private String sonstigeAngaben5;

	@Column(name="SONSTIGE_ANGABEN6")
	private String sonstigeAngaben6;

	private String schaltauftragsvert;

	private String transvorgang;

	@Column(name="SCHALTAUFTRAG_SOLL")
	private Date schaltauftragSoll;

	@Column(name="SCHALTAUFTRAG_UEBE")
	private Date schaltauftragUebe;

	@Column(name="SCHALTAUFTRAG_STAT")
	private String schaltauftragStat;

	@Column(name="SCHALTAUFTRAG_ERLE")
	private Date schaltauftragErle;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK0FUEHRUNGOID_FUE")
	private Fuehrung fk0fuehrungoidFue;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_FUEHRUNGOID_FUE")
	private Fuehrung fkFuehrungoidFue;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_OMS_ORDEROID_OMS_ORDER")
	private OmsOrder fkOmsOrderoidOmsOrder;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID")
	private Transportverbindun fkTransportveroid;

	private static final long serialVersionUID = 1L;

	public Schaltauftrag() {
		super();
	}

	public long getOidSchaltauftrag() {
		return this.oidSchaltauftrag;
	}

	public void setOidSchaltauftrag(long oidSchaltauftrag) {
		this.oidSchaltauftrag = oidSchaltauftrag;
	}

	public String getBearbeiter() {
		return this.bearbeiter;
	}

	public void setBearbeiter(String bearbeiter) {
		this.bearbeiter = bearbeiter;
	}

	public String getBearbeiterTelefon() {
		return this.bearbeiterTelefon;
	}

	public void setBearbeiterTelefon(String bearbeiterTelefon) {
		this.bearbeiterTelefon = bearbeiterTelefon;
	}

	public String getErledigungsmeldung() {
		return this.erledigungsmeldung;
	}

	public void setErledigungsmeldung(String erledigungsmeldung) {
		this.erledigungsmeldung = erledigungsmeldung;
	}

	public String getErledigungsmeldun0() {
		return this.erledigungsmeldun0;
	}

	public void setErledigungsmeldun0(String erledigungsmeldun0) {
		this.erledigungsmeldun0 = erledigungsmeldun0;
	}

	public String getFolgebuchstabe() {
		return this.folgebuchstabe;
	}

	public void setFolgebuchstabe(String folgebuchstabe) {
		this.folgebuchstabe = folgebuchstabe;
	}

	public Date getSchaltauftragsdatu() {
		return this.schaltauftragsdatu;
	}

	public void setSchaltauftragsdatu(Date schaltauftragsdatu) {
		this.schaltauftragsdatu = schaltauftragsdatu;
	}

	public String getSchaltauftragserte() {
		return this.schaltauftragserte;
	}

	public void setSchaltauftragserte(String schaltauftragserte) {
		this.schaltauftragserte = schaltauftragserte;
	}

	public String getSchaltmassnahme() {
		return this.schaltmassnahme;
	}

	public void setSchaltmassnahme(String schaltmassnahme) {
		this.schaltmassnahme = schaltmassnahme;
	}

	public String getSonstigeAngaben1() {
		return this.sonstigeAngaben1;
	}

	public void setSonstigeAngaben1(String sonstigeAngaben1) {
		this.sonstigeAngaben1 = sonstigeAngaben1;
	}

	public String getSonstigeAngaben2() {
		return this.sonstigeAngaben2;
	}

	public void setSonstigeAngaben2(String sonstigeAngaben2) {
		this.sonstigeAngaben2 = sonstigeAngaben2;
	}

	public String getSonstigeAngaben3() {
		return this.sonstigeAngaben3;
	}

	public void setSonstigeAngaben3(String sonstigeAngaben3) {
		this.sonstigeAngaben3 = sonstigeAngaben3;
	}

	public String getSonstigeAngaben4() {
		return this.sonstigeAngaben4;
	}

	public void setSonstigeAngaben4(String sonstigeAngaben4) {
		this.sonstigeAngaben4 = sonstigeAngaben4;
	}

	public String getSonstigeAngaben5() {
		return this.sonstigeAngaben5;
	}

	public void setSonstigeAngaben5(String sonstigeAngaben5) {
		this.sonstigeAngaben5 = sonstigeAngaben5;
	}

	public String getSonstigeAngaben6() {
		return this.sonstigeAngaben6;
	}

	public void setSonstigeAngaben6(String sonstigeAngaben6) {
		this.sonstigeAngaben6 = sonstigeAngaben6;
	}

	public String getSchaltauftragsvert() {
		return this.schaltauftragsvert;
	}

	public void setSchaltauftragsvert(String schaltauftragsvert) {
		this.schaltauftragsvert = schaltauftragsvert;
	}

	public String getTransvorgang() {
		return this.transvorgang;
	}

	public void setTransvorgang(String transvorgang) {
		this.transvorgang = transvorgang;
	}

	public Date getSchaltauftragSoll() {
		return this.schaltauftragSoll;
	}

	public void setSchaltauftragSoll(Date schaltauftragSoll) {
		this.schaltauftragSoll = schaltauftragSoll;
	}

	public Date getSchaltauftragUebe() {
		return this.schaltauftragUebe;
	}

	public void setSchaltauftragUebe(Date schaltauftragUebe) {
		this.schaltauftragUebe = schaltauftragUebe;
	}

	public String getSchaltauftragStat() {
		return this.schaltauftragStat;
	}

	public void setSchaltauftragStat(String schaltauftragStat) {
		this.schaltauftragStat = schaltauftragStat;
	}

	public Date getSchaltauftragErle() {
		return this.schaltauftragErle;
	}

	public void setSchaltauftragErle(Date schaltauftragErle) {
		this.schaltauftragErle = schaltauftragErle;
	}

	public Fuehrung getFk0fuehrungoidFue() {
		return this.fk0fuehrungoidFue;
	}

	public void setFk0fuehrungoidFue(Fuehrung fk0fuehrungoidFue) {
		this.fk0fuehrungoidFue = fk0fuehrungoidFue;
	}

	public Fuehrung getFkFuehrungoidFue() {
		return this.fkFuehrungoidFue;
	}

	public void setFkFuehrungoidFue(Fuehrung fkFuehrungoidFue) {
		this.fkFuehrungoidFue = fkFuehrungoidFue;
	}

	public OmsOrder getFkOmsOrderoidOmsOrder() {
		return this.fkOmsOrderoidOmsOrder;
	}

	public void setFkOmsOrderoidOmsOrder(OmsOrder fkOmsOrderoidOmsOrder) {
		this.fkOmsOrderoidOmsOrder = fkOmsOrderoidOmsOrder;
	}

	public Transportverbindun getFkTransportveroid() {
		return this.fkTransportveroid;
	}

	public void setFkTransportveroid(Transportverbindun fkTransportveroid) {
		this.fkTransportveroid = fkTransportveroid;
	}

}
