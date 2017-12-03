package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="WN_ISCC")
public class WnIscc implements Serializable {
	@Id
	@Column(name="OID_WN_ISCC")
	private Long id;

	@Column(name="WN_ISCC_BEZEICHNUN")
	private String wnIsccBezeichnun;

	@OneToMany(mappedBy="wnIscc")
	private Set<User> users;

	@OneToMany(mappedBy="wnIscc")
	private Set<Country> countries;

	private static final long serialVersionUID = 1L;

	public WnIscc() {
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
	 * @return the wnIsccBezeichnun
	 */
	public String getWnIsccBezeichnun() {
		return wnIsccBezeichnun;
	}

	/**
	 * @param wnIsccBezeichnun the wnIsccBezeichnun to set
	 */
	public void setWnIsccBezeichnun(String wnIsccBezeichnun) {
		this.wnIsccBezeichnun = wnIsccBezeichnun;
	}

	/**
	 * @return the users
	 */
	public Set<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(Set<User> users) {
		this.users = users;
	}

	/**
	 * @return the countries
	 */
	public Set<Country> getCountries() {
		return countries;
	}

	/**
	 * @param countries the countries to set
	 */
	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}

}
