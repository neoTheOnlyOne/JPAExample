package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="INFO_SLA_RECORD")
public class InfoSlaRecord implements Serializable {
	@Id
	@Column(name="INFO_SLA_RECORD_OID")
	private Long id;

	@Column(name="ADDON_GROUP_NAME")
	private String addonGroupName;

	@Column(name="ADDON_VALUE")
	private String addonValue;

	@Column(name="DISPLAY_VALUE")
	private String displayValue;

	@Column(name="PROMPT_NAME")
	private String promptName;

	@Column(name="PROMPT_UNIT")
	private String promptUnit;

	@Column(name="VALUE_FORMAT")
	private String valueFormat;

	@Column(name="VALUE_INDIVIDUELL")
	private String valueIndividuell;

	@Column(name="VALUE_NUM")
	private Long valueNum;

	@Column(name="VALUE_TEXT")
	private String valueText;

	@Column(name="VALUE_TIME")
	private Date valueTime;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_INFO_VERBINDUNG")
	private InfoVerbindung infoVerbindung;

	private static final long serialVersionUID = 1L;

	public InfoSlaRecord() {
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
	 * @return the addonGroupName
	 */
	public String getAddonGroupName() {
		return addonGroupName;
	}

	/**
	 * @param addonGroupName the addonGroupName to set
	 */
	public void setAddonGroupName(String addonGroupName) {
		this.addonGroupName = addonGroupName;
	}

	/**
	 * @return the addonValue
	 */
	public String getAddonValue() {
		return addonValue;
	}

	/**
	 * @param addonValue the addonValue to set
	 */
	public void setAddonValue(String addonValue) {
		this.addonValue = addonValue;
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
	 * @return the promptName
	 */
	public String getPromptName() {
		return promptName;
	}

	/**
	 * @param promptName the promptName to set
	 */
	public void setPromptName(String promptName) {
		this.promptName = promptName;
	}

	/**
	 * @return the promptUnit
	 */
	public String getPromptUnit() {
		return promptUnit;
	}

	/**
	 * @param promptUnit the promptUnit to set
	 */
	public void setPromptUnit(String promptUnit) {
		this.promptUnit = promptUnit;
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
	 * @return the valueIndividuell
	 */
	public String getValueIndividuell() {
		return valueIndividuell;
	}

	/**
	 * @param valueIndividuell the valueIndividuell to set
	 */
	public void setValueIndividuell(String valueIndividuell) {
		this.valueIndividuell = valueIndividuell;
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
	 * @return the infoVerbindung
	 */
	public InfoVerbindung getInfoVerbindung() {
		return infoVerbindung;
	}

	/**
	 * @param infoVerbindung the infoVerbindung to set
	 */
	public void setInfoVerbindung(InfoVerbindung infoVerbindung) {
		this.infoVerbindung = infoVerbindung;
	}

}
