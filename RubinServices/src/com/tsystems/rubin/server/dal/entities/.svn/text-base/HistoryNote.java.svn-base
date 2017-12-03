package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;

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


/**
 * The persistent class for the HISTORY_NOTE database table.
 * 
 */
@Entity
@Table(name="HISTORY_NOTE")
public class HistoryNote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HistoryNote")
	@SequenceGenerator(name="HistoryNote", sequenceName="HISTORY_NOTE_SEQUENCE", allocationSize = 1)
	@Column(name="OID_HISTORY_NOTE")
	private Long id;

	@Column(name="HISTORY_RECORD")
	private String record;

	@Column(name="HR_SEQUENCE_NO")
	private Long sequenceNumber;

	//bi-directional many-to-one association to History
    @ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_HISTORYOID_HISTORY")
	private History history;

    public HistoryNote() {
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
	 * @return the record
	 */
	public String getRecord() {
		return record;
	}

	/**
	 * @param record the record to set
	 */
	public void setRecord(String record) {
		this.record = record;
	}

	/**
	 * @return the sequenceNumber
	 */
	public Long getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * @param sequenceNumber the sequenceNumber to set
	 */
	public void setSequenceNumber(Long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	/**
	 * @return the history
	 */
	public History getHistory() {
		return history;
	}

	/**
	 * @param history the history to set
	 */
	public void setHistory(History history) {
		this.history = history;
	}
    
	
}