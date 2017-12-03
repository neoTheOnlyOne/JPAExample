package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SCHALTAUFTRAG")
public class CWO implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CWO")
	@SequenceGenerator(name = "CWO", sequenceName = "SCHALTAUFTRAG_SEQUENCE", allocationSize = 1)
	@Column(name="OID_SCHALTAUFTRAG")
	private Long id;

	@Column(name="BEARBEITER")
	private String user;

	@Column(name="BEARBEITER_TELEFON")
	private String userPhoneNumber;

	@Column(name="ERLEDIGUNGSMELDUN0")
	private String bookCompletionInformationBy;
	
	@Column(name="ERLEDIGUNGSMELDUNG")
	private String bookCompletionInformationTo;

	@Column(name="FOLGEBUCHSTABE")
	private String sequenceLetter;

	@Column(name="SCHALTAUFTRAG_ERLE")
	private Date bookCompletionDate;

	@Column(name="SCHALTAUFTRAG_SOLL")
	private Date planned;

	@Column(name="SCHALTAUFTRAG_STAT")
	private String status;

	@Column(name="SCHALTAUFTRAG_UEBE")
	private Date commitDate;

	@Column(name="SCHALTAUFTRAGSDATU")
	private Date date;

	@Column(name="SCHALTAUFTRAGSERTE")
	private String issue;

	@Column(name="SCHALTAUFTRAGSVERT")
	private String distributorRemark;

	@Column(name="SCHALTMASSNAHME")
	private String typeOfCwo;

	@Column(name="SONSTIGE_ANGABEN1")
	private String information1;

	@Column(name="SONSTIGE_ANGABEN2")
	private String information2;

	@Column(name="SONSTIGE_ANGABEN3")
	private String information3;

	@Column(name="SONSTIGE_ANGABEN4")
	private String information4;

	@Column(name="SONSTIGE_ANGABEN5")
	private String information5;

	@Column(name="SONSTIGE_ANGABEN6")
	private String information6;

	@Column(name="TRANSVORGANG")
	private String transEvent;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_FUEHRUNGOID_FUE")
	private Routing routing;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK0FUEHRUNGOID_FUE")
	private Routing routing1;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_OMS_ORDEROID_OMS_ORDER")
	private OmsOrder omsOrder;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID")
	private Circuit circuit;

	private static final long serialVersionUID = 1L;

	public CWO() {
		super();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the userPhoneNumber
	 */
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	/**
	 * @param userPhoneNumber the userPhoneNumber to set
	 */
	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	/**
	 * @return the bookCompletionInformationBy
	 */
	public String getBookCompletionInformationBy() {
		return bookCompletionInformationBy;
	}

	/**
	 * @param bookCompletionInformationBy the bookCompletionInformationBy to set
	 */
	public void setBookCompletionInformationBy(String bookCompletionInformationBy) {
		this.bookCompletionInformationBy = bookCompletionInformationBy;
	}

	/**
	 * @return the bookCompletionInformationTo
	 */
	public String getBookCompletionInformationTo() {
		return bookCompletionInformationTo;
	}

	/**
	 * @param bookCompletionInformationTo the bookCompletionInformationTo to set
	 */
	public void setBookCompletionInformationTo(String bookCompletionInformationTo) {
		this.bookCompletionInformationTo = bookCompletionInformationTo;
	}

	/**
	 * @return the sequenceLetter
	 */
	public String getSequenceLetter() {
		return sequenceLetter;
	}

	/**
	 * @param sequenceLetter the sequenceLetter to set
	 */
	public void setSequenceLetter(String sequenceLetter) {
		this.sequenceLetter = sequenceLetter;
	}

	/**
	 * @return the bookCompletionDate
	 */
	public Date getBookCompletionDate() {
		return bookCompletionDate;
	}

	/**
	 * @param bookCompletionDate the bookCompletionDate to set
	 */
	public void setBookCompletionDate(Date bookCompletionDate) {
		this.bookCompletionDate = bookCompletionDate;
	}

	/**
	 * @return the planned
	 */
	public Date getPlanned() {
		return planned;
	}

	/**
	 * @param planned the planned to set
	 */
	public void setPlanned(Date planned) {
		this.planned = planned;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the commitDate
	 */
	public Date getCommitDate() {
		return commitDate;
	}

	/**
	 * @param commitDate the commitDate to set
	 */
	public void setCommitDate(Date commitDate) {
		this.commitDate = commitDate;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the issue
	 */
	public String getIssue() {
		return issue;
	}

	/**
	 * @param issue the issue to set
	 */
	public void setIssue(String issue) {
		this.issue = issue;
	}

	/**
	 * @return the distributorRemark
	 */
	public String getDistributorRemark() {
		return distributorRemark;
	}

	/**
	 * @param distributorRemark the distributorRemark to set
	 */
	public void setDistributorRemark(String distributorRemark) {
		this.distributorRemark = distributorRemark;
	}

	/**
	 * @return the typeOfCwo
	 */
	public String getTypeOfCwo() {
		return typeOfCwo;
	}

	/**
	 * @param typeOfCwo the typeOfCwo to set
	 */
	public void setTypeOfCwo(String typeOfCwo) {
		this.typeOfCwo = typeOfCwo;
	}

	/**
	 * @return the information1
	 */
	public String getInformation1() {
		return information1;
	}

	/**
	 * @param information1 the information1 to set
	 */
	public void setInformation1(String information1) {
		this.information1 = information1;
	}

	/**
	 * @return the information2
	 */
	public String getInformation2() {
		return information2;
	}

	/**
	 * @param information2 the information2 to set
	 */
	public void setInformation2(String information2) {
		this.information2 = information2;
	}

	/**
	 * @return the information3
	 */
	public String getInformation3() {
		return information3;
	}

	/**
	 * @param information3 the information3 to set
	 */
	public void setInformation3(String information3) {
		this.information3 = information3;
	}

	/**
	 * @return the information4
	 */
	public String getInformation4() {
		return information4;
	}

	/**
	 * @param information4 the information4 to set
	 */
	public void setInformation4(String information4) {
		this.information4 = information4;
	}

	/**
	 * @return the information5
	 */
	public String getInformation5() {
		return information5;
	}

	/**
	 * @param information5 the information5 to set
	 */
	public void setInformation5(String information5) {
		this.information5 = information5;
	}

	/**
	 * @return the information6
	 */
	public String getInformation6() {
		return information6;
	}

	/**
	 * @param information6 the information6 to set
	 */
	public void setInformation6(String information6) {
		this.information6 = information6;
	}

	/**
	 * @return the transEvent
	 */
	public String getTransEvent() {
		return transEvent;
	}

	/**
	 * @param transEvent the transEvent to set
	 */
	public void setTransEvent(String transEvent) {
		this.transEvent = transEvent;
	}

	/**
	 * @return the routing
	 */
	public Routing getRouting() {
		return routing;
	}

	/**
	 * @param routing the routing to set
	 */
	public void setRouting(Routing routing) {
		this.routing = routing;
	}

	/**
	 * @return the routing1
	 */
	public Routing getRouting1() {
		return routing1;
	}

	/**
	 * @param routing1 the routing1 to set
	 */
	public void setRouting1(Routing routing1) {
		this.routing1 = routing1;
	}

	/**
	 * @return the omsOrder
	 */
	public OmsOrder getOmsOrder() {
		return omsOrder;
	}

	/**
	 * @param omsOrder the omsOrder to set
	 */
	public void setOmsOrder(OmsOrder omsOrder) {
		this.omsOrder = omsOrder;
	}

	/**
	 * @return the circuit
	 */
	public Circuit getCircuit() {
		return circuit;
	}

	/**
	 * @param circuit the circuit to set
	 */
	public void setCircuit(Circuit circuit) {
		this.circuit = circuit;
	}

	
}
