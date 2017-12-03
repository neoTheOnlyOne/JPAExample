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
	@NamedQuery(name = NamedQueryConstants.FIND_DEFAULTWEBADDRESS, 
			    query = "Select " + ZentraleSystemdat.COMMON_PICKLIST_FIELDS_STRING + " from ZentraleSystemdat z" 
			             + " where trim(z.zentArt) = 'URLNAME'")
			
 })
@Entity
@Table(name="ZENTRALE_SYSTEMDAT")
public class ZentraleSystemdat implements Serializable {
	
	/**
	 * The constant COMMON_PICKLIST_FIELDS_STRING.
	 */
	@Transient
    final static String COMMON_PICKLIST_FIELDS_STRING = "z.zent4";
	
	@Id
	@Column(name="OID_ZENTRALE_SYSTE")
	private long oidZentraleSyste;

	@Column(name="ZENT_JAHR")
	private Date zentJahr;

	@Column(name="ZENT_1")
	private String zent1;

	@Column(name="ZENT_2")
	private String zent2;

	@Column(name="ZENT_3")
	private String zent3;

	@Column(name="ZENT_4")
	private String zent4;

	@Column(name="ZENT_ART")
	private String zentArt;

	private static final long serialVersionUID = 1L;

	public ZentraleSystemdat() {
		super();
	}

	public long getOidZentraleSyste() {
		return this.oidZentraleSyste;
	}

	public void setOidZentraleSyste(long oidZentraleSyste) {
		this.oidZentraleSyste = oidZentraleSyste;
	}

	public Date getZentJahr() {
		return this.zentJahr;
	}

	public void setZentJahr(Date zentJahr) {
		this.zentJahr = zentJahr;
	}

	public String getZent1() {
		return this.zent1;
	}

	public void setZent1(String zent1) {
		this.zent1 = zent1;
	}

	public String getZent2() {
		return this.zent2;
	}

	public void setZent2(String zent2) {
		this.zent2 = zent2;
	}

	public String getZent3() {
		return this.zent3;
	}

	public void setZent3(String zent3) {
		this.zent3 = zent3;
	}

	public String getZent4() {
		return this.zent4;
	}

	public void setZent4(String zent4) {
		this.zent4 = zent4;
	}

	public String getZentArt() {
		return this.zentArt;
	}

	public void setZentArt(String zentArt) {
		this.zentArt = zentArt;
	}

}
