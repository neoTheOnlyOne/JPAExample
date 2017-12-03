package com.tsystems.rubin.server.dal.entities;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;
@NamedQueries({
    @NamedQuery(name = NamedQueryConstants.STRUCT_INFO_OFCIRCUIT, query = "Select new com.tsystems.rubin.server.dal.dvo.StructInfoDVO"
    	                                      + StructInfo.COMMON_PICKLIST_FIELDS_STRING + " from StructInfo s JOIN s.fkStructInfoOidStructInfo st" +
    	                                  	" JOIN s.fkTransportveroidTransportve t" + " where t.oidTransportverbi = ?1" + " order by s.designation"),
    @NamedQuery(name = NamedQueryConstants.STRUCTINFO_BYID, query = "Select new com.tsystems.rubin.server.dal.dvo.StructInfoDVO"
                       + StructInfo.COMMON_PICKLIST_FIELDS_STRING + " from StructInfo s where s.oidStructInfo = ?1"),
    @NamedQuery(name = NamedQueryConstants.FIND_CIRCUITID_BYSTRUCTINFOID, query = "Select s.fkTransportveroidTransportve.oidTransportverbi" + 
    		           " from StructInfo s where s.oidStructInfo = ?1")
     })
@Entity
@Table(name="STRUCT_INFO")
public class StructInfo implements Serializable {
	

	/** The Constant COMMON_PICKLIST_FIELDS_STRING. */
    @Transient
	final static String COMMON_PICKLIST_FIELDS_STRING="(s.oidStructInfo, s.designation,s.remark, s.fkStructInfoOidStructInfo.id, " +
			                        "s.fkStructInfoOidStructInfo.designation, s.fkTransportveroidTransportve.oidTransportverbi)";
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "StructInfo")
    @SequenceGenerator(name = "StructInfo", sequenceName = "STRUCT_INFO_SEQUENCE", allocationSize = 1)
	@Column(name="OID_STRUCT_INFO")
	private Long oidStructInfo;

	private String designation;

	private String remark;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_STRUCT_INFO_OID_STRUCT_INFO")
	private StructInfoType fkStructInfoOidStructInfo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_TRANSPORTVEROID_TRANSPORTVE")
	private Transportverbindun fkTransportveroidTransportve;

	private static final long serialVersionUID = 1L;

	public StructInfo() {
		super();
	}

	public Long getOidStructInfo() {
		return this.oidStructInfo;
	}

	public void setOidStructInfo(Long oidStructInfo) {
		this.oidStructInfo = oidStructInfo;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public StructInfoType getFkStructInfoOidStructInfo() {
		return this.fkStructInfoOidStructInfo;
	}

	public void setFkStructInfoOidStructInfo(StructInfoType fkStructInfoOidStructInfo) {
		this.fkStructInfoOidStructInfo = fkStructInfoOidStructInfo;
	}

	public Transportverbindun getFkTransportveroidTransportve() {
		return this.fkTransportveroidTransportve;
	}

	public void setFkTransportveroidTransportve(Transportverbindun fkTransportveroidTransportve) {
		this.fkTransportveroidTransportve = fkTransportveroidTransportve;
	}

}
