package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="KABELFORM")
public class CableForm implements Serializable {
	@Id
	@Column(name="OID_KABELFORM")
	private Long id;

	@Column(name="KABELFORM")
	private String cableForm;

	@Column(name="KABELFORM_BEMERKUN")
	private String remark;

	@OneToMany(mappedBy="cableForm")
	private Set<LineSegment> lineSegments;

	private static final long serialVersionUID = 1L;

	public CableForm() {
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
	 * @return the cableForm
	 */
	public String getCableForm() {
		return cableForm;
	}

	/**
	 * @param cableForm the cableForm to set
	 */
	public void setCableForm(String cableForm) {
		this.cableForm = cableForm;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the lineSegments
	 */
	public Set<LineSegment> getLineSegments() {
		return lineSegments;
	}

	/**
	 * @param lineSegments the lineSegments to set
	 */
	public void setLineSegments(Set<LineSegment> lineSegments) {
		this.lineSegments = lineSegments;
	}

	
}
