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

@NamedQueries({
	@NamedQuery(name=NamedQueryConstants.SLA_RECORD_INDIVIDUELL_FINDSLARECORDSOFSLAINDIVIDUELL, query="Select new com.tsystems.rubin.server.transmodservices.to.SlaRecordIndividuellTO" +
			SlaRecordIndividuell.COMMON_PICKLIST_FIELDS_STRING+ " from SlaRecordIndividuell sri " +
			"JOIN sri.fkSlaIndividuslaIndividuell si where si.id = ?1 order by sri.id"),
	@NamedQuery(name=NamedQueryConstants.SLA_RECORD_INDIVIDUELL_FINDSLARECORDINDIVIDUELLBYSLAINDIVIDUELLID, query="Select sri from SlaRecordIndividuell sri " +
			"JOIN sri.fkSlaIndividuslaIndividuell si where si.id = ?1")
})
@Entity
@Table(name="SLA_RECORD_INDIVIDUELL")
public class SlaRecordIndividuell implements Serializable {

	/** The Serial version Id. */
	private static final long serialVersionUID = 1L;
	
	/** The Constant COMMON_PICKLIST_FIELDS_STRING. */
	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(sri.id, sri.slaRecordIndividuellSortord, "
			+ "sri.slaRecordIndividuellValue, sri.fkSlaRecordslaRecordOid.id, sri.fkSlaRecordslaRecordOid.displayValue, "
			+ "sri.fkSlaRecordslaRecordOid.slaSortorder, sri.fkSlaRecordslaRecordOid.fkSlaAddonVaslaAddonValue.id, "
			+ "sri.fkSlaRecordslaRecordOid.fkSlaAddonVaslaAddonValue.slaAddonValue,"
			+ "sri.fkSlaRecordslaRecordOid.fkSlaAddonVaslaAddonValue.fkSlaAddonGrslaAddonGroup.id, "
			+ "sri.fkSlaRecordslaRecordOid.fkSlaAddonVaslaAddonValue.fkSlaAddonGrslaAddonGroup.slaAddonGroupName,"
			+ "sri.fkSlaRecordslaRecordOid.fkSlaPromptslaPromptOid.id, sri.fkSlaRecordslaRecordOid.fkSlaPromptslaPromptOid.slaPromptName, "
			+ "sri.fkSlaRecordslaRecordOid.fkSlaPromptslaPromptOid.slaPromptUnit)";
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SlaRecordIndividuell")
    @SequenceGenerator(name = "SlaRecordIndividuell", sequenceName = "SLA_RECORD_IND_SEQUENCE", allocationSize = 1)
	@Column(name="SLA_RECORD_INDIVIDUELL_OID")
	private Long id;

	@Column(name="SLA_RECORD_INDIVIDUELL_SORTORD")
	private Long slaRecordIndividuellSortord;

	@Column(name="SLA_RECORD_INDIVIDUELL_VALUE")
	private String slaRecordIndividuellValue;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_SLA_INDIVIDUSLA_INDIVIDUELL")
	private SlaIndividuell fkSlaIndividuslaIndividuell;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_SLA_RECORDSLA_RECORD_OID")
	private SlaRecord fkSlaRecordslaRecordOid;

	public SlaRecordIndividuell() {
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

	public Long getSlaRecordIndividuellSortord() {
		return this.slaRecordIndividuellSortord;
	}

	public void setSlaRecordIndividuellSortord(Long slaRecordIndividuellSortord) {
		this.slaRecordIndividuellSortord = slaRecordIndividuellSortord;
	}

	public String getSlaRecordIndividuellValue() {
		return this.slaRecordIndividuellValue;
	}

	public void setSlaRecordIndividuellValue(String slaRecordIndividuellValue) {
		this.slaRecordIndividuellValue = slaRecordIndividuellValue;
	}

	public SlaIndividuell getFkSlaIndividuslaIndividuell() {
		return this.fkSlaIndividuslaIndividuell;
	}

	public void setFkSlaIndividuslaIndividuell(SlaIndividuell fkSlaIndividuslaIndividuell) {
		this.fkSlaIndividuslaIndividuell = fkSlaIndividuslaIndividuell;
	}

	public SlaRecord getFkSlaRecordslaRecordOid() {
		return this.fkSlaRecordslaRecordOid;
	}

	public void setFkSlaRecordslaRecordOid(SlaRecord fkSlaRecordslaRecordOid) {
		this.fkSlaRecordslaRecordOid = fkSlaRecordslaRecordOid;
	}

}
