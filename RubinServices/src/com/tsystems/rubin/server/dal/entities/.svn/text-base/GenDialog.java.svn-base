package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="GEN_DIALOG")
public class GenDialog implements Serializable {
	@Id
	@Column(name="OID_GEN_DIALOG")
	private String id;

	@Column(name="DIALOG_ID")
	private Long dialogId;

	@Column(name="DIALOG_NAME")
	private String dialogName;

	@Column(name="PANEL_ID")
	private Long panelId;

	@Column(name="PANEL_NAME")
	private String panelName;

	@Column(name="WINDOW_ID")
	private Long windowId;

	@Column(name="WINDOW_NAME")
	private String windowName;

	@OneToMany(mappedBy="genDialog")
	private Set<GenColAvailabe> genColsAvailable;

	private static final long serialVersionUID = 1L;

	public GenDialog() {
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
	 * @return the dialogId
	 */
	public Long getDialogId() {
		return dialogId;
	}

	/**
	 * @param dialogId the dialogId to set
	 */
	public void setDialogId(Long dialogId) {
		this.dialogId = dialogId;
	}

	/**
	 * @return the dialogName
	 */
	public String getDialogName() {
		return dialogName;
	}

	/**
	 * @param dialogName the dialogName to set
	 */
	public void setDialogName(String dialogName) {
		this.dialogName = dialogName;
	}

	/**
	 * @return the panelId
	 */
	public Long getPanelId() {
		return panelId;
	}

	/**
	 * @param panelId the panelId to set
	 */
	public void setPanelId(Long panelId) {
		this.panelId = panelId;
	}

	/**
	 * @return the panelName
	 */
	public String getPanelName() {
		return panelName;
	}

	/**
	 * @param panelName the panelName to set
	 */
	public void setPanelName(String panelName) {
		this.panelName = panelName;
	}

	/**
	 * @return the windowId
	 */
	public Long getWindowId() {
		return windowId;
	}

	/**
	 * @param windowId the windowId to set
	 */
	public void setWindowId(Long windowId) {
		this.windowId = windowId;
	}

	/**
	 * @return the windowName
	 */
	public String getWindowName() {
		return windowName;
	}

	/**
	 * @param windowName the windowName to set
	 */
	public void setWindowName(String windowName) {
		this.windowName = windowName;
	}

	/**
	 * @return the genColsAvailable
	 */
	public Set<GenColAvailabe> getGenColsAvailable() {
		return genColsAvailable;
	}

	/**
	 * @param genColsAvailable the genColsAvailable to set
	 */
	public void setGenColsAvailable(Set<GenColAvailabe> genColsAvailable) {
		this.genColsAvailable = genColsAvailable;
	}

}
