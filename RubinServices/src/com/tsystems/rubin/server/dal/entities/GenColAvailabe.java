package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
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
@Table(name="GEN_COL_AVAILABE")
public class GenColAvailabe implements Serializable {
	@Id
	@Column(name="OID_GEN_COL_AVAILABLE")
	private Long id;

	@Column(name="COLUMN_DEF_SEQ_POS")
	private Long columnDefSeqPos;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_GEN_COLUMNOID_GEN_COLUMN")
	private GenColumn genColumn;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_GEN_DIALOGOID_GEN_DIALOG")
	private GenDialog genDialog;

	@OneToMany(mappedBy="genColAvailabe")
	private Set<GenColSelected> genColsSelected;

	private static final long serialVersionUID = 1L;

	public GenColAvailabe() {
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
	 * @return the columnDefSeqPos
	 */
	public Long getColumnDefSeqPos() {
		return columnDefSeqPos;
	}

	/**
	 * @param columnDefSeqPos the columnDefSeqPos to set
	 */
	public void setColumnDefSeqPos(Long columnDefSeqPos) {
		this.columnDefSeqPos = columnDefSeqPos;
	}

	/**
	 * @return the genColumn
	 */
	public GenColumn getGenColumn() {
		return genColumn;
	}

	/**
	 * @param genColumn the genColumn to set
	 */
	public void setGenColumn(GenColumn genColumn) {
		this.genColumn = genColumn;
	}

	/**
	 * @return the genDialog
	 */
	public GenDialog getGenDialog() {
		return genDialog;
	}

	/**
	 * @param genDialog the genDialog to set
	 */
	public void setGenDialog(GenDialog genDialog) {
		this.genDialog = genDialog;
	}

	/**
	 * @return the genColsSelected
	 */
	public Set<GenColSelected> getGenColsSelected() {
		return genColsSelected;
	}

	/**
	 * @param genColsSelected the genColsSelected to set
	 */
	public void setGenColsSelected(Set<GenColSelected> genColsSelected) {
		this.genColsSelected = genColsSelected;
	}

	
}
