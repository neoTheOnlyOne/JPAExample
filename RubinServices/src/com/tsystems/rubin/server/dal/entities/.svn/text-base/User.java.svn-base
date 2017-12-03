package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.tsystems.rubin.common.util.CommonConstants;
import com.tsystems.rubin.common.util.NamedQueryConstants;

/**
 * The Class User. - An entity for BEARBEITER_SECU table.
 */
@NamedQueries({@NamedQuery(name = NamedQueryConstants.USER_FINDBYUSERID, query = "Select user from User user where trim(both from user.userId) like ?1")
    })
/*
 * * The Class User.
 */
@Entity
@Table(name = "BEARBEITER_SECU")
public class User implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BearbeiterSecu")
    @SequenceGenerator(name = "BearbeiterSecu", sequenceName = CommonConstants.BEARBEITER_SECU_SEQUENCE, allocationSize = 1)
    @Column(name = "ZERTIFIKATSNUMMER")
    private Long id;

    /** The phone nr. */
    @Column(name = "BEARBEITER_TELEFON")
    private String phoneNr;

    /** The location. */
    @Column(name = "BEARBEITERARBEITSO")
    private String location;

    /** The surname. */
    @Column(name = "BEARBEITERFAMILIEN")
    private String surname;

    /** The user id. */
    @Column(name = "BEARBEITERKENNUNG")
    private String userId;

    /** The user code. */
    @Column(name = "BEARBEITERKUERZEL")
    private String userCode;

    /** The first name. */
    @Column(name = "BEARBEITERVORNAME")
    private String firstName;

    /** The last activity date. */
    @Column(name = "LAST_ACTIVITY")
    private Date lastActivityDate;

    /** The online. */
    @Column(name = "LOGGED_ON_INDICATO")
    private String online;

    /** The password. */
    @Column(name = "PASSWORD")
    private String password;

    /** The password change date. */
    @Column(name = "PASSWORD_CHANGE_DA")
    private Date passwordChangeDate;

    /** The security admin indicator. */
    @Column(name = "SECURITY_ADMIN_IND")
    private String securityAdminIndicator;

    /** The status. */
    @Column(name = "STATUS")
    private String status;

    /** The workstation. */
    @Column(name = "WORKSTATION")
    private String workstation;

    /** The user group. */
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "FK_GRUPPEOID_GRUPP")
    private UserGroup userGroup;
    
    @ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_COMPANYOID_COMPANY")
	private Company company;
    
    @ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_WN_ISCCOID_WN_I")
	private WnIscc wnIscc;

    @OneToMany(mappedBy="user")
	private Set<LruCircuit> lruCircuits;

	@OneToMany(mappedBy="user")
	private Set<TransPermission> transPermissions;

	@OneToMany(mappedBy="user")
	private Set<BszPermission> bszPermissions;

	@OneToMany(mappedBy="user")
	private Set<GenColSelected> genColsSelected;

	@OneToMany(mappedBy="user")
	private Set<Abfrage> abfrages;
	
	@OneToMany(mappedBy="user")
	private Set<TeleContact> teleContacts;

	@OneToMany(mappedBy="user")
	private Set<ActivityAudit> activityAudits;
	
    /**
     * Instantiates a new user.
     */
    public User() {
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
	 * @return the phoneNr
	 */
	public String getPhoneNr() {
		return phoneNr;
	}



	/**
	 * @param phoneNr the phoneNr to set
	 */
	public void setPhoneNr(String phoneNr) {
		this.phoneNr = phoneNr;
	}



	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}



	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}



	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}



	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}



	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}



	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}



	/**
	 * @return the userCode
	 */
	public String getUserCode() {
		return userCode;
	}



	/**
	 * @param userCode the userCode to set
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}



	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}



	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	/**
	 * @return the lastActivityDate
	 */
	public Date getLastActivityDate() {
		return lastActivityDate;
	}



	/**
	 * @param lastActivityDate the lastActivityDate to set
	 */
	public void setLastActivityDate(Date lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
	}



	/**
	 * @return the online
	 */
	public String getOnline() {
		return online;
	}



	/**
	 * @param online the online to set
	 */
	public void setOnline(String online) {
		this.online = online;
	}



	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}



	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}



	/**
	 * @return the passwordChangeDate
	 */
	public Date getPasswordChangeDate() {
		return passwordChangeDate;
	}



	/**
	 * @param passwordChangeDate the passwordChangeDate to set
	 */
	public void setPasswordChangeDate(Date passwordChangeDate) {
		this.passwordChangeDate = passwordChangeDate;
	}



	/**
	 * @return the securityAdminIndicator
	 */
	public String getSecurityAdminIndicator() {
		return securityAdminIndicator;
	}



	/**
	 * @param securityAdminIndicator the securityAdminIndicator to set
	 */
	public void setSecurityAdminIndicator(String securityAdminIndicator) {
		this.securityAdminIndicator = securityAdminIndicator;
	}



	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}



	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}



	/**
	 * @return the workstation
	 */
	public String getWorkstation() {
		return workstation;
	}



	/**
	 * @param workstation the workstation to set
	 */
	public void setWorkstation(String workstation) {
		this.workstation = workstation;
	}



	/**
	 * @return the userGroup
	 */
	public UserGroup getUserGroup() {
		return userGroup;
	}



	/**
	 * @param userGroup the userGroup to set
	 */
	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
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



	/**
	 * @return the wnIscc
	 */
	public WnIscc getWnIscc() {
		return wnIscc;
	}



	/**
	 * @param wnIscc the wnIscc to set
	 */
	public void setWnIscc(WnIscc wnIscc) {
		this.wnIscc = wnIscc;
	}



	/**
	 * @return the lruCircuits
	 */
	public Set<LruCircuit> getLruCircuits() {
		return lruCircuits;
	}



	/**
	 * @param lruCircuits the lruCircuits to set
	 */
	public void setLruCircuits(Set<LruCircuit> lruCircuits) {
		this.lruCircuits = lruCircuits;
	}



	/**
	 * @return the transPermissions
	 */
	public Set<TransPermission> getTransPermissions() {
		return transPermissions;
	}



	/**
	 * @param transPermissions the transPermissions to set
	 */
	public void setTransPermissions(Set<TransPermission> transPermissions) {
		this.transPermissions = transPermissions;
	}



	/**
	 * @return the bszPermissions
	 */
	public Set<BszPermission> getBszPermissions() {
		return bszPermissions;
	}



	/**
	 * @param bszPermissions the bszPermissions to set
	 */
	public void setBszPermissions(Set<BszPermission> bszPermissions) {
		this.bszPermissions = bszPermissions;
	}



	/**
	 * @return the genColsSelected
	 */
	public Set<GenColSelected> getGenColsSelected() {
		return genColsSelected;
	}



	/**
	 * @param genColsSelected the genColsSelected to set
	 */
	public void setGenColsSelected(Set<GenColSelected> genColsSelected) {
		this.genColsSelected = genColsSelected;
	}



	/**
	 * @return the abfrages
	 */
	public Set<Abfrage> getAbfrages() {
		return abfrages;
	}



	/**
	 * @param abfrages the abfrages to set
	 */
	public void setAbfrages(Set<Abfrage> abfrages) {
		this.abfrages = abfrages;
	}



	/**
	 * @return the telecontacts
	 */
	public Set<TeleContact> getTeleContacts() {
		return teleContacts;
	}



	/**
	 * @param teleContacts the telecontacts to set
	 */
	public void setTeleContacts(Set<TeleContact> teleContacts) {
		this.teleContacts = teleContacts;
	}



	/**
	 * @return the activityAudits
	 */
	public Set<ActivityAudit> getActivityAudits() {
		return activityAudits;
	}



	/**
	 * @param activityAudits the activityAudits to set
	 */
	public void setActivityAudits(Set<ActivityAudit> activityAudits) {
		this.activityAudits = activityAudits;
	}



	/**
     * toString.
     * 
     * @return
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return new ToStringBuilder(this).append("id", this.id).append("userGroup", this.userGroup)
                .append("userId", this.userId).append("firstName", this.firstName).append(
                        "surname", this.surname).append("password", this.password).append("status",
                        this.status).append("lastActivityDate", this.lastActivityDate).append(
                        "passwordChangeDate", this.passwordChangeDate).append(
                        "securityAdminIndicator", this.securityAdminIndicator).append("userCode",
                        this.userCode).append("workstation", this.workstation).append("online",
                        this.online).append("phoneNr", this.phoneNr).append("location",
                        this.location).toString();
    }

    /**
     * equals.
     * 
     * @param object
     * @return
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object object) {
        if (!(object instanceof User)) {
            return false;
        }
        User rhs = (User) object;
        return new EqualsBuilder().append(this.userGroup, rhs.userGroup).append(this.userId,
                rhs.userId).append(this.firstName, rhs.firstName).append(this.surname, rhs.surname)
                .append(this.password, rhs.password).append(this.status, rhs.status).append(
                        this.lastActivityDate, rhs.lastActivityDate).append(
                        this.passwordChangeDate, rhs.passwordChangeDate).append(
                        this.securityAdminIndicator, rhs.securityAdminIndicator).append(
                        this.userCode, rhs.userCode).append(this.workstation, rhs.workstation)
                .append(this.online, rhs.online).append(this.phoneNr, rhs.phoneNr).append(
                        this.location, rhs.location).isEquals();
    }

    /**
     * hashCode.
     * 
     * @return
     * 
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return new HashCodeBuilder(-1881914901, 973991065).append(this.userGroup).append(
                this.userId).append(this.firstName).append(this.surname).append(this.password)
                .append(this.status).append(this.lastActivityDate).append(this.passwordChangeDate)
                .append(this.securityAdminIndicator).append(this.userCode).append(this.workstation)
                .append(this.online).append(this.phoneNr).append(this.location).toHashCode();
    }
}
