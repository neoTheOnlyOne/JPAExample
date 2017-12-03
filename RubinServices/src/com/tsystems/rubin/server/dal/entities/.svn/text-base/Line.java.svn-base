package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
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
@Table(name ="LINIE")
public class Line implements Serializable {
	@Id
	@Column(name="OID_LINIE")
	private Long id;

	@Column(name="BEARBEITERKENNUNG")
	private String userId;

	@Column(name="LETZTE_AKTUALISIER")
	private Date lastUpdate;

	@Column(name="LINIEN_NOTIZ")
	private String remark;

	@Column(name="LINIENBEZ_SUCH_BSI")
	private String designationSearch;

	@Column(name="LINIENBEZEICHNUNG")
	private String designation;

	@Column(name="LINIENKENNUNG")
	private String lineId;

	@Column(name="LINIENKENNUNG_SUCH")
	private String idSearch;
	
	@Column(name="LINIENLANGBEZEICHN")
	private String designationLong;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK0ENDPUNKTOID_END")
	private Terminal terminalA;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_ENDPUNKTOID_END")
	private Terminal terminalB;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LINIENARTOID_LI")
	private LineType lineType;

	@OneToMany(mappedBy="line")
	private Set<LineSegment> lineSegments;

	@OneToMany(mappedBy="line")
	private Set<Seekabelvertrag> seekabelvertrags;

	private static final long serialVersionUID = 1L;

	public Line() {
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
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the lastUpdate
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * @param lastUpdate the lastUpdate to set
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
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
	 * @return the designationSearch
	 */
	public String getDesignationSearch() {
		return designationSearch;
	}

	/**
	 * @param designationSearch the designationSearch to set
	 */
	public void setDesignationSearch(String designationSearch) {
		this.designationSearch = designationSearch;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the lineId
	 */
	public String getLineId() {
		return lineId;
	}

	/**
	 * @param lineId the lineId to set
	 */
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	/**
	 * @return the idSearch
	 */
	public String getIdSearch() {
		return idSearch;
	}

	/**
	 * @param idSearch the idSearch to set
	 */
	public void setIdSearch(String idSearch) {
		this.idSearch = idSearch;
	}

	/**
	 * @return the designationLong
	 */
	public String getDesignationLong() {
		return designationLong;
	}

	/**
	 * @param designationLong the designationLong to set
	 */
	public void setDesignationLong(String designationLong) {
		this.designationLong = designationLong;
	}

	/**
	 * @return the terminalA
	 */
	public Terminal getTerminalA() {
		return terminalA;
	}

	/**
	 * @param terminalA the terminalA to set
	 */
	public void setTerminalA(Terminal terminalA) {
		this.terminalA = terminalA;
	}

	/**
	 * @return the terminalB
	 */
	public Terminal getTerminalB() {
		return terminalB;
	}

	/**
	 * @param terminalB the terminalB to set
	 */
	public void setTerminalB(Terminal terminalB) {
		this.terminalB = terminalB;
	}

	/**
	 * @return the lineType
	 */
	public LineType getLineType() {
		return lineType;
	}

	/**
	 * @param lineType the lineType to set
	 */
	public void setLineType(LineType lineType) {
		this.lineType = lineType;
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

	/**
	 * @return the seekabelvertrags
	 */
	public Set<Seekabelvertrag> getSeekabelvertrags() {
		return seekabelvertrags;
	}

	/**
	 * @param seekabelvertrags the seekabelvertrags to set
	 */
	public void setSeekabelvertrags(Set<Seekabelvertrag> seekabelvertrags) {
		this.seekabelvertrags = seekabelvertrags;
	}


}
