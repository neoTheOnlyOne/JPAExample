package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;

/**
 * The persistent class for the ZENTRALE_SYSTEMDAT database table.
 * 
 */
@NamedQueries( {
		@NamedQuery(name = NamedQueryConstants.FIND_DEFAULTWEBADDRESS, query = "Select new com.tsystems.rubin.server.dal.dvo.CentralSystemDataDVO"
				+ CentralSystemData.COMMON_PICKLIST_FIELDS_STRING
				+ " from CentralSystemData c"
				+ " where trim(both from c.type) = 'URLNAME'"),
		@NamedQuery(name = NamedQueryConstants.CENTRALSYSTEMDATA_FINDCENTRALSYSTEMDATA_BYTYPE, query = "Select new com.tsystems.rubin.server.dal.dvo.CentralSystemDataDVO"
				+ CentralSystemData.COMMON_PICKLIST_FIELDS_STRING
				+ " from CentralSystemData c"
				+ " where trim(both from c.type) = 'LAUFZEITBERECHNUNG'"),
		@NamedQuery(name = NamedQueryConstants.FIND_TGN_NMS_ID, query = "Select  new com.tsystems.rubin.server.dal.dvo.CentralSystemDataDVO (c.id, c.data2, c.year) from CentralSystemData as c"
				+ " where trim(both from c.type) like ?1")

})
@Entity
@Table(name="ZENTRALE_SYSTEMDAT")
public class CentralSystemData implements Serializable {
	
	/**
	 * The constant COMMON_PICKLIST_FIELDS_STRING.
	 */
	@Transient
    final static String COMMON_PICKLIST_FIELDS_STRING = "(c.data1, c.data2, c.data3, c.data4)";
	
	@Id
	@Column(name="OID_ZENTRALE_SYSTE")
	private Long id;

	@Column(name="ZENT_JAHR")
	private Date year;

	@Column(name="ZENT_1")
	private String data1;

	@Column(name="ZENT_2")
	private String data2;

	@Column(name="ZENT_3")
	private String data3;

	@Column(name="ZENT_4")
	private String data4;

	@Column(name="ZENT_ART")
	private String type;

	private static final long serialVersionUID = 1L;

	public CentralSystemData() {
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
	 * @return the year
	 */
	public Date getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(Date year) {
		this.year = year;
	}

	/**
	 * @return the data1
	 */
	public String getData1() {
		return data1;
	}

	/**
	 * @param data1 the data1 to set
	 */
	public void setData1(String data1) {
		this.data1 = data1;
	}

	/**
	 * @return the data2
	 */
	public String getData2() {
		return data2;
	}

	/**
	 * @param data2 the data2 to set
	 */
	public void setData2(String data2) {
		this.data2 = data2;
	}

	/**
	 * @return the data3
	 */
	public String getData3() {
		return data3;
	}

	/**
	 * @param data3 the data3 to set
	 */
	public void setData3(String data3) {
		this.data3 = data3;
	}

	/**
	 * @return the data4
	 */
	public String getData4() {
		return data4;
	}

	/**
	 * @param data4 the data4 to set
	 */
	public void setData4(String data4) {
		this.data4 = data4;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	
}
