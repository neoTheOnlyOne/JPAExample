package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Window implements Serializable {
	@Id
	@Column(name="SECURITY_ID")
	private String id;

	@Column(name="SECURITY_REQUIRED")
	private String securityRequired;

	@Column(name="TITLE_BAR")
	private String titleBar;

	@OneToMany(mappedBy="window")
	private Set<WindowObjectUsag> windowObjectUsages;

	private static final long serialVersionUID = 1L;

	public Window() {
		super();
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the securityRequired
	 */
	public String getSecurityRequired() {
		return securityRequired;
	}

	/**
	 * @param securityRequired the securityRequired to set
	 */
	public void setSecurityRequired(String securityRequired) {
		this.securityRequired = securityRequired;
	}

	/**
	 * @return the titleBar
	 */
	public String getTitleBar() {
		return titleBar;
	}

	/**
	 * @param titleBar the titleBar to set
	 */
	public void setTitleBar(String titleBar) {
		this.titleBar = titleBar;
	}

	/**
	 * @return the windowObjectUsages
	 */
	public Set<WindowObjectUsag> getWindowObjectUsages() {
		return windowObjectUsages;
	}

	/**
	 * @param windowObjectUsages the windowObjectUsages to set
	 */
	public void setWindowObjectUsages(Set<WindowObjectUsag> windowObjectUsages) {
		this.windowObjectUsages = windowObjectUsages;
	}

}
