package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Terminalinfo implements Serializable {
	@Id
	@Column(name="OID_TERMINALINFO")
	private Long id;

	@Column(name="FK_ENDPUNKTOID_END")
	private Long fkEndpunktoidEnd;

	@Column(name="TERMINAL_DTAG_INST")
	private Long terminalDtagInst;

	@Column(name="TERMINAL_DTAG_PROZ")
	private Long terminalDtagProz;

	@Column(name="TERMINALCODE")
	private String code;

	@Column(name="TERMINALNOTIZ")
	private String remark;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_LINIENABSCHNOID")
	private LineSegment lineSegment;

	private static final long serialVersionUID = 1L;

	public Terminalinfo() {
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
	 * @return the fkEndpunktoidEnd
	 */
	public Long getFkEndpunktoidEnd() {
		return fkEndpunktoidEnd;
	}

	/**
	 * @param fkEndpunktoidEnd the fkEndpunktoidEnd to set
	 */
	public void setFkEndpunktoidEnd(Long fkEndpunktoidEnd) {
		this.fkEndpunktoidEnd = fkEndpunktoidEnd;
	}

	/**
	 * @return the terminalDtagInst
	 */
	public Long getTerminalDtagInst() {
		return terminalDtagInst;
	}

	/**
	 * @param terminalDtagInst the terminalDtagInst to set
	 */
	public void setTerminalDtagInst(Long terminalDtagInst) {
		this.terminalDtagInst = terminalDtagInst;
	}

	/**
	 * @return the terminalDtagProz
	 */
	public Long getTerminalDtagProz() {
		return terminalDtagProz;
	}

	/**
	 * @param terminalDtagProz the terminalDtagProz to set
	 */
	public void setTerminalDtagProz(Long terminalDtagProz) {
		this.terminalDtagProz = terminalDtagProz;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
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
	 * @return the lineSegment
	 */
	public LineSegment getLineSegment() {
		return lineSegment;
	}

	/**
	 * @param lineSegment the lineSegment to set
	 */
	public void setLineSegment(LineSegment lineSegment) {
		this.lineSegment = lineSegment;
	}

}
