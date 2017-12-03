package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="GEN_COL_COMBINATION")
public class GenColCombination implements Serializable {
	@Id
	@Column(name="OID_GEN_COL_COMBINATION")
	private Long id;

	@Column(name="COMPONENT_ATTRIBUT_NAME")
	private String componentAttributName;

	@Column(name="COMPONENT_DEF_SELECTION")
	private String componentDefSelection;

	@Column(name="COMPONENT_PART_NO")
	private Long componentPartNo;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_GEN_COLUMNOID_GEN_COLUMN")
	private GenColumn genColumn;

	@ManyToMany
	@JoinTable(name="GEN_USER_SPEC_COMB",
		joinColumns=@JoinColumn(name="FK_GEN_COL_COMBOID_GEN_COL_COM"),
		inverseJoinColumns=@JoinColumn(name="FK_GEN_COL_SELEOID_GEN_COL_SEL"))
	private Set<GenColSelected> genColsSelected;

	private static final long serialVersionUID = 1L;

	public GenColCombination() {
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
	 * @return the componentAttributName
	 */
	public String getComponentAttributName() {
		return componentAttributName;
	}

	/**
	 * @param componentAttributName the componentAttributName to set
	 */
	public void setComponentAttributName(String componentAttributName) {
		this.componentAttributName = componentAttributName;
	}

	/**
	 * @return the componentDefSelection
	 */
	public String getComponentDefSelection() {
		return componentDefSelection;
	}

	/**
	 * @param componentDefSelection the componentDefSelection to set
	 */
	public void setComponentDefSelection(String componentDefSelection) {
		this.componentDefSelection = componentDefSelection;
	}

	/**
	 * @return the componentPartNo
	 */
	public Long getComponentPartNo() {
		return componentPartNo;
	}

	/**
	 * @param componentPartNo the componentPartNo to set
	 */
	public void setComponentPartNo(Long componentPartNo) {
		this.componentPartNo = componentPartNo;
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
