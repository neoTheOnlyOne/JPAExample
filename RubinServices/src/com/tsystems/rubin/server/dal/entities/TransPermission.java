package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;


@NamedQueries({
	@NamedQuery(name=NamedQueryConstants.TRANSPERMISSION_FINDUSERPERMISSIONSBYUSERIDANDCIRCUITID, query="Select new com.tsystems.rubin.server.dal.dvo.TransPermissionsDVO" +
			TransPermission.COMMON_PICKLIST_FIELDS_STRING+" from TransPermission tp JOIN tp.company co, IN (co.circuits) c where tp.user.id = ?1 and c.id=?2")
})
// 
@Entity
@Table(name="TRANS_PERMISSION")
public class TransPermission implements Serializable {
	
	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(tp.id, tp.disSecurity, tp.updSecurity, tp.delSecurity)";
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="OID_TRANS_PERMISSION")
	private Long id;

	@Column(name="DEL_SECURITY")
	private String delSecurity;

	@Column(name="DIS_SECURITY")
	private String disSecurity;

	@Column(name="UPD_SECURITY")
	private String updSecurity;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_BEARBEITER_SZERTIFIKATSNUMM")
	private User user;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_COMPANYOID_COMPANY")
	private Company company;

	public TransPermission() {
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
	 * @return the delSecurity
	 */
	public String getDelSecurity() {
		return delSecurity;
	}

	/**
	 * @param delSecurity the delSecurity to set
	 */
	public void setDelSecurity(String delSecurity) {
		this.delSecurity = delSecurity;
	}

	/**
	 * @return the disSecurity
	 */
	public String getDisSecurity() {
		return disSecurity;
	}

	/**
	 * @param disSecurity the disSecurity to set
	 */
	public void setDisSecurity(String disSecurity) {
		this.disSecurity = disSecurity;
	}

	/**
	 * @return the updSecurity
	 */
	public String getUpdSecurity() {
		return updSecurity;
	}

	/**
	 * @param updSecurity the updSecurity to set
	 */
	public void setUpdSecurity(String updSecurity) {
		this.updSecurity = updSecurity;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}


}
