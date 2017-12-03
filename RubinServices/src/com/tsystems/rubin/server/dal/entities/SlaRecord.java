package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;
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
@Table(name="SLA_RECORD")
public class SlaRecord implements Serializable {
	@Id
	@Column(name="SLA_RECORD_OID")
	private Long id;

	@Column(name="DISPLAY_VALUE")
	private String displayValue;

	@Column(name="VALUE_FORMAT")
	private String valueFormat;

	@Column(name="VALUE_TEXT")
	private String valueText;

	@Column(name="VALUE_NUM")
	private Long valueNum;

	@Column(name="VALUE_TIME")
	private Date valueTime;

	@Column(name="SLA_SORTORDER")
	private Long sortingOrderNumber;

	@Column(name="SLA_RECORD_UPDATED_BY")
	private String updatedBy;

	@Column(name="SLA_RECORD_DATE_UPDATED")
	private Date dateUpdated;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SLASLA_OID")
	private Sla sla;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SLA_ADDON_VASLA_ADDON_VALUE")
	private SlaAddonValues slaAddonValues;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SLA_PROMPTSLA_PROMPT_OID")
	private SlaPrompt slaPrompt;

	@OneToMany(mappedBy="slaRecord")
	private Set<SlaRecordIndividual> slaRecordIndividuals;

	private static final long serialVersionUID = 1L;

	public SlaRecord() {
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
	 * @return the displayValue
	 */
	public String getDisplayValue() {
		return displayValue;
	}

	/**
	 * @param displayValue the displayValue to set
	 */
	public void setDisplayValue(String displayValue) {
		this.displayValue = displayValue;
	}

	/**
	 * @return the valueFormat
	 */
	public String getValueFormat() {
		return valueFormat;
	}

	/**
	 * @param valueFormat the valueFormat to set
	 */
	public void setValueFormat(String valueFormat) {
		this.valueFormat = valueFormat;
	}

	/**
	 * @return the valueText
	 */
	public String getValueText() {
		return valueText;
	}

	/**
	 * @param valueText the valueText to set
	 */
	public void setValueText(String valueText) {
		this.valueText = valueText;
	}

	/**
	 * @return the valueNum
	 */
	public Long getValueNum() {
		return valueNum;
	}

	/**
	 * @param valueNum the valueNum to set
	 */
	public void setValueNum(Long valueNum) {
		this.valueNum = valueNum;
	}

	/**
	 * @return the valueTime
	 */
	public Date getValueTime() {
		return valueTime;
	}

	/**
	 * @param valueTime the valueTime to set
	 */
	public void setValueTime(Date valueTime) {
		this.valueTime = valueTime;
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
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the dateUpdated
	 */
	public Date getDateUpdated() {
		return dateUpdated;
	}

	/**
	 * @param dateUpdated the dateUpdated to set
	 */
	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	/**
	 * @return the sla
	 */
	public Sla getSla() {
		return sla;
	}

	/**
	 * @param sla the sla to set
	 */
	public void setSla(Sla sla) {
		this.sla = sla;
	}

	/**
	 * @return the slaAddonValues
	 */
	public SlaAddonValues getSlaAddonValues() {
		return slaAddonValues;
	}

	/**
	 * @param slaAddonValues the slaAddonValues to set
	 */
	public void setSlaAddonValues(SlaAddonValues slaAddonValues) {
		this.slaAddonValues = slaAddonValues;
	}

	/**
	 * @return the slaPrompt
	 */
	public SlaPrompt getSlaPrompt() {
		return slaPrompt;
	}

	/**
	 * @param slaPrompt the slaPrompt to set
	 */
	public void setSlaPrompt(SlaPrompt slaPrompt) {
		this.slaPrompt = slaPrompt;
	}

	/**
	 * @return the slaRecordIndividuals
	 */
	public Set<SlaRecordIndividual> getSlaRecordIndividuals() {
		return slaRecordIndividuals;
	}

	/**
	 * @param slaRecordIndividuals the slaRecordIndividuals to set
	 */
	public void setSlaRecordIndividuals(
			Set<SlaRecordIndividual> slaRecordIndividuals) {
		this.slaRecordIndividuals = slaRecordIndividuals;
	}

}
