package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="LINIENART")
public class LineType implements Serializable {
	@Id
	@Column(name="OID_LINIENART")
	private Long id;

	@Column(name="AUSBREITUNGSGESCHWINDIGKEIT")
	private Long speed;

	@Column(name="LINIENART")
	private String kind;

	@Column(name="LINIENART_BEMERKUN")
	private String remark;

	@OneToMany(mappedBy="lineType")
	private Set<Line> lines;

	private static final long serialVersionUID = 1L;

	public LineType() {
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
	 * @return the speed
	 */
	public Long getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(Long speed) {
		this.speed = speed;
	}

	/**
	 * @return the kind
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * @param kind the kind to set
	 */
	public void setKind(String kind) {
		this.kind = kind;
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
	 * @return the lines
	 */
	public Set<Line> getLines() {
		return lines;
	}

	/**
	 * @param lines the lines to set
	 */
	public void setLines(Set<Line> lines) {
		this.lines = lines;
	}

}
