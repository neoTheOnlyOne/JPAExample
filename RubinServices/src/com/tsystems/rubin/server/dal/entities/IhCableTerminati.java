package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="IH_CABLE_TERMINATI")
public class IhCableTerminati implements Serializable {
	@Id
	@Column(name="OID_IH_CABLE_TERMI")
	private Long id;

	@Column(name="IHCT_DI_OR_DIE")
	private String ihctDiOrDie;

	@Column(name="IHCT_SIDE")
	private String ihctSide;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_DISTRIBUTOR_OID")
	private DistributorEleme0 distributorEleme0;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_DISTRIBUTOROID")
	private DistributorFrame distributorFrame;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_IH_CABLEOID_INH")
	private IhCable ihCable;

	private static final long serialVersionUID = 1L;

	public IhCableTerminati() {
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
	 * @return the ihctDiOrDie
	 */
	public String getIhctDiOrDie() {
		return ihctDiOrDie;
	}

	/**
	 * @param ihctDiOrDie the ihctDiOrDie to set
	 */
	public void setIhctDiOrDie(String ihctDiOrDie) {
		this.ihctDiOrDie = ihctDiOrDie;
	}

	/**
	 * @return the ihctSide
	 */
	public String getIhctSide() {
		return ihctSide;
	}

	/**
	 * @param ihctSide the ihctSide to set
	 */
	public void setIhctSide(String ihctSide) {
		this.ihctSide = ihctSide;
	}

	/**
	 * @return the distributorEleme0
	 */
	public DistributorEleme0 getDistributorEleme0() {
		return distributorEleme0;
	}

	/**
	 * @param distributorEleme0 the distributorEleme0 to set
	 */
	public void setDistributorEleme0(DistributorEleme0 distributorEleme0) {
		this.distributorEleme0 = distributorEleme0;
	}

	/**
	 * @return the distributorFrame
	 */
	public DistributorFrame getDistributorFrame() {
		return distributorFrame;
	}

	/**
	 * @param distributorFrame the distributorFrame to set
	 */
	public void setDistributorFrame(DistributorFrame distributorFrame) {
		this.distributorFrame = distributorFrame;
	}

	/**
	 * @return the ihCable
	 */
	public IhCable getIhCable() {
		return ihCable;
	}

	/**
	 * @param ihCable the ihCable to set
	 */
	public void setIhCable(IhCable ihCable) {
		this.ihCable = ihCable;
	}


}
