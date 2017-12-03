package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="COMPANY")
public class Company implements Serializable {
	@Id
	@Column(name="OID_COMPANY")
	private Long id;

	private String comments;

	@Column(name="COMPANY_NAME")
	private String name;

	@OneToMany(mappedBy="company")
	private Set<ArchiveCircuit> archiveCircuits;

	@OneToMany(mappedBy="company")
	private Set<User> users;

	@OneToMany(mappedBy="company")
	private Set<TransPermission> transPermissions;

	@OneToMany(mappedBy="company")
	private Set<Circuit> circuits;

	private static final long serialVersionUID = 1L;

	public Company() {
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
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the archiveCircuits
	 */
	public Set<ArchiveCircuit> getArchiveCircuits() {
		return archiveCircuits;
	}

	/**
	 * @param archiveCircuits the archiveCircuits to set
	 */
	public void setArchiveCircuits(Set<ArchiveCircuit> archiveCircuits) {
		this.archiveCircuits = archiveCircuits;
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
	 * @return the circuits
	 */
	public Set<Circuit> getCircuits() {
		return circuits;
	}

	/**
	 * @param circuits the circuits to set
	 */
	public void setCircuits(Set<Circuit> circuits) {
		this.circuits = circuits;
	}

}
