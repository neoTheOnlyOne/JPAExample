package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;

@NamedQueries( {
		@NamedQuery(name = NamedQueryConstants.SLA_RECORD_INDIVIDUAL_FINDSLARECORDSOFSLAINDIVIDUAL, query = "Select new com.tsystems.rubin.server.dal.dvo.SlaRecordIndividualDVO"
				+ SlaRecordIndividual.COMMON_PICKLIST_FIELDS_STRING
				+ " from SlaRecordIndividual sri "
				+ "JOIN sri.slaIndividual si where si.id = ?1"),
		@NamedQuery(name = NamedQueryConstants.SLA_RECORD_INDIVIDUAL_FINDSLARECORDINDIVIDUALBYSLAINDIVIDUALID, query = "Select sri from SlaRecordIndividual sri "
				+ "JOIN sri.slaIndividual si where si.id = ?1") })
@Entity
@Table(name="SLA_RECORD_INDIVIDUELL")
public class SlaRecordIndividual implements Serializable {

	/** The Serial version Id. */
	private static final long serialVersionUID = 1L;
	
	/** The Constant COMMON_PICKLIST_FIELDS_STRING. */
	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(sri.id, sri.sortingOrderNumber, "
			+ "sri.value, sri.slaRecord.id, sri.slaRecord.displayValue, "
			+ "sri.slaRecord.sortingOrderNumber, sri.slaRecord.slaAddonValues.id, "
			+ "sri.slaRecord.slaAddonValues.value,"
			+ "sri.slaRecord.slaAddonValues.slaAddonGroup.id, "
			+ "sri.slaRecord.slaAddonValues.slaAddonGroup.name,"
			+ "sri.slaRecord.slaPrompt.id, sri.slaRecord.slaPrompt.name, "
			+ "sri.slaRecord.slaPrompt.unit)";
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SlaRecordIndividuell")
    @SequenceGenerator(name = "SlaRecordIndividuell", sequenceName = "SLA_RECORD_IND_SEQUENCE", allocationSize = 1)
	@Column(name="SLA_RECORD_INDIVIDUELL_OID")
	private Long id;

	@Column(name="SLA_RECORD_INDIVIDUELL_SORTORD")
	private Long sortingOrderNumber;

	@Column(name="SLA_RECORD_INDIVIDUELL_VALUE")
	private String value;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SLA_INDIVIDUSLA_INDIVIDUELL")
	private SlaIndividual slaIndividual;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SLA_RECORDSLA_RECORD_OID")
	private SlaRecord slaRecord;

	public SlaRecordIndividual() {
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
	 * @return the sortingOrderNumber
	 */
	public Long getSortingOrderNumber() {
		return sortingOrderNumber;
	}

	/**
	 * @param sortingOrderNumber the sortingOrderNumber to set
	 */
	public void setSortingOrderNumber(Long sortingOrderNumber) {
		this.sortingOrderNumber = sortingOrderNumber;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the slaIndividual
	 */
	public SlaIndividual getSlaIndividual() {
		return slaIndividual;
	}

	/**
	 * @param slaIndividual the slaIndividual to set
	 */
	public void setSlaIndividual(SlaIndividual slaIndividual) {
		this.slaIndividual = slaIndividual;
	}

	/**
	 * @return the slaRecord
	 */
	public SlaRecord getSlaRecord() {
		return slaRecord;
	}

	/**
	 * @param slaRecord the slaRecord to set
	 */
	public void setSlaRecord(SlaRecord slaRecord) {
		this.slaRecord = slaRecord;
	}
}
