package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;

@NamedQuery(name = NamedQueryConstants.STRUCTINFOTYPE_FINDALL, query = "Select new com.tsystems.rubin.server.dal.dvo.StructInfoTypeDVO"
		+ StructInfoType.COMMON_PICKLIST_FIELDS_STRING
		+ " from StructInfoType s " + "order by s.designation")
@Entity
@Table(name = "STRUCT_INFO_TYPE")
public class StructInfoType implements Serializable {

	/** The Constant COMMON_PICKLIST_FIELDS_STRING. */
	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(s.id, s.designation)";

	@Id
	@Column(name = "OID_STRUCT_INFO_TY")
	private Long id;

	private String designation;

	@OneToMany(mappedBy = "fkStructInfoOidStructInfo")
	private Set<StructInfo> structInfoCollection;

	private static final long serialVersionUID = 1L;

	public StructInfoType() {
		super();
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Set<StructInfo> getStructInfoCollection() {
		return this.structInfoCollection;
	}

	public void setStructInfoCollection(Set<StructInfo> structInfoCollection) {
		this.structInfoCollection = structInfoCollection;
	}

}
