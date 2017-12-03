package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PARAMETER_X_VALUE")
public class ParameterXValue implements Serializable {
	@Id
	@Column(name="OID_P_X_V")
	private Long id;

	private String default0;

	private String edit;

	@Column(name="EDIT_VALUE")
	private String editValue;

	private String parameter;

	@OneToMany(mappedBy="parameterXValue")
	private Set<ParameterXTv> parameterXTvs;

	private static final long serialVersionUID = 1L;

	public ParameterXValue() {
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
	 * @return the default0
	 */
	public String getDefault0() {
		return default0;
	}

	/**
	 * @param default0 the default0 to set
	 */
	public void setDefault0(String default0) {
		this.default0 = default0;
	}

	/**
	 * @return the edit
	 */
	public String getEdit() {
		return edit;
	}

	/**
	 * @param edit the edit to set
	 */
	public void setEdit(String edit) {
		this.edit = edit;
	}

	/**
	 * @return the editValue
	 */
	public String getEditValue() {
		return editValue;
	}

	/**
	 * @param editValue the editValue to set
	 */
	public void setEditValue(String editValue) {
		this.editValue = editValue;
	}

	/**
	 * @return the parameter
	 */
	public String getParameter() {
		return parameter;
	}

	/**
	 * @param parameter the parameter to set
	 */
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	/**
	 * @return the parameterXTvs
	 */
	public Set<ParameterXTv> getParameterXTvs() {
		return parameterXTvs;
	}

	/**
	 * @param parameterXTvs the parameterXTvs to set
	 */
	public void setParameterXTvs(Set<ParameterXTv> parameterXTvs) {
		this.parameterXTvs = parameterXTvs;
	}


}
