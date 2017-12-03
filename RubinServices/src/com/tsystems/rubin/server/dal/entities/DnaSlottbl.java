package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DNA_SLOTTBL")
public class DnaSlottbl implements Serializable {
	@Id
	@Column(name="OID_SLOTTBL")
	private Long id;

	private String circuitpacktype;

	@Column(name="EQH_STATUS")
	private String eqhStatus;

	private String serialnumber;

	private String slotabbreviation;

	private String slotaddress;

	private String slotposition;

	private String slottrc;

	private String tid;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CARDOID_CARD")
	private Card card;

	@OneToMany(mappedBy="dnaSlottbl")
	private Set<DnaPortassign> dnaPortassigns;

	private static final long serialVersionUID = 1L;

	public DnaSlottbl() {
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
	 * @return the circuitpacktype
	 */
	public String getCircuitpacktype() {
		return circuitpacktype;
	}

	/**
	 * @param circuitpacktype the circuitpacktype to set
	 */
	public void setCircuitpacktype(String circuitpacktype) {
		this.circuitpacktype = circuitpacktype;
	}

	/**
	 * @return the eqhStatus
	 */
	public String getEqhStatus() {
		return eqhStatus;
	}

	/**
	 * @param eqhStatus the eqhStatus to set
	 */
	public void setEqhStatus(String eqhStatus) {
		this.eqhStatus = eqhStatus;
	}

	/**
	 * @return the serialnumber
	 */
	public String getSerialnumber() {
		return serialnumber;
	}

	/**
	 * @param serialnumber the serialnumber to set
	 */
	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}

	/**
	 * @return the slotabbreviation
	 */
	public String getSlotabbreviation() {
		return slotabbreviation;
	}

	/**
	 * @param slotabbreviation the slotabbreviation to set
	 */
	public void setSlotabbreviation(String slotabbreviation) {
		this.slotabbreviation = slotabbreviation;
	}

	/**
	 * @return the slotaddress
	 */
	public String getSlotaddress() {
		return slotaddress;
	}

	/**
	 * @param slotaddress the slotaddress to set
	 */
	public void setSlotaddress(String slotaddress) {
		this.slotaddress = slotaddress;
	}

	/**
	 * @return the slotposition
	 */
	public String getSlotposition() {
		return slotposition;
	}

	/**
	 * @param slotposition the slotposition to set
	 */
	public void setSlotposition(String slotposition) {
		this.slotposition = slotposition;
	}

	/**
	 * @return the slottrc
	 */
	public String getSlottrc() {
		return slottrc;
	}

	/**
	 * @param slottrc the slottrc to set
	 */
	public void setSlottrc(String slottrc) {
		this.slottrc = slottrc;
	}

	/**
	 * @return the tid
	 */
	public String getTid() {
		return tid;
	}

	/**
	 * @param tid the tid to set
	 */
	public void setTid(String tid) {
		this.tid = tid;
	}

	/**
	 * @return the card
	 */
	public Card getCard() {
		return card;
	}

	/**
	 * @param card the card to set
	 */
	public void setCard(Card card) {
		this.card = card;
	}

	/**
	 * @return the dnaPortassigns
	 */
	public Set<DnaPortassign> getDnaPortassigns() {
		return dnaPortassigns;
	}

	/**
	 * @param dnaPortassigns the dnaPortassigns to set
	 */
	public void setDnaPortassigns(Set<DnaPortassign> dnaPortassigns) {
		this.dnaPortassigns = dnaPortassigns;
	}

	}
