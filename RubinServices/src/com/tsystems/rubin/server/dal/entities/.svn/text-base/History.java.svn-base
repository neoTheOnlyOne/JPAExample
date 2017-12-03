package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the HISTORY database table.
 * 
 */
@Entity
@Table(name="HISTORY")
public class History implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="History")
	@SequenceGenerator(name="History", sequenceName="HISTORY_SEQUENCE", allocationSize = 1)
	@Column(name="OID_HISTORY")
	private Long id;

	@Column(name="ACTION")
	private String action;	

	@Column(name="HISTORY_TIMESTAMP")
	private Date timestamp;

	@Column(name="USER0")
	private String user;

	//bi-directional many-to-one association to HistoryNote
	@OneToMany(mappedBy="history",cascade = CascadeType.ALL)
	private Set<HistoryNote> historyNotes;


	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID_TRANSPORTVE")
	private Circuit circuit;
    public History() {
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
	 * @return the action
	 */
	public String getAction() {
		return action;
	}
	/**
	 * @param action the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}
	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
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
	 * @return the historyNotes
	 */
	public Set<HistoryNote> getHistoryNotes() {
		return historyNotes;
	}
	/**
	 * @param historyNotes the historyNotes to set
	 */
	public void setHistoryNotes(Set<HistoryNote> historyNotes) {
		this.historyNotes = historyNotes;
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