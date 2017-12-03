package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PARAMETER_X_TV")
public class ParameterXTv implements Serializable {
	@EmbeddedId
	private ParameterXTvPK parameterXTvPK;

	@Column(name="EDIT_VALUE")
	private String editValue;

	private String terminal;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_PARAMETER_X_OID_P_X_V")
	private ParameterXValue parameterXValue;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID_TRANSPORTVE")
	private Circuit circuit;

	private static final long serialVersionUID = 1L;

	public ParameterXTv() {
		super();
	}


	/**
	 * @return the parameterXTvPK
	 */
	public ParameterXTvPK getParameterXTvPK() {
		return parameterXTvPK;
	}


	/**
	 * @param parameterXTvPK the parameterXTvPK to set
	 */
	public void setParameterXTvPK(ParameterXTvPK parameterXTvPK) {
		this.parameterXTvPK = parameterXTvPK;
	}


	public String getEditValue() {
		return this.editValue;
	}

	public void setEditValue(String editValue) {
		this.editValue = editValue;
	}

	public String getTerminal() {
		return this.terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public ParameterXValue getFkParameterX() {
		return this.parameterXValue;
	}

	public void setFkParameterX(ParameterXValue fkParameterX) {
		this.parameterXValue = fkParameterX;
	}

	public Circuit getFkTransportveroidTransportve() {
		return this.circuit;
	}

	public void setFkTransportveroidTransportve(Circuit fkTransportveroidTransportve) {
		this.circuit = fkTransportveroidTransportve;
	}


	}
