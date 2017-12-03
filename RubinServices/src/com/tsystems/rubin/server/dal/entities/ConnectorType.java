package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CONNECTOR_TYPE")
public class ConnectorType implements Serializable {
	@Id
	@Column(name="OID_CONNECTOR_TYPE")
	private Long id;

	@Column(name="CT_DATE_UPDATED")
	private Date dateUpdated;

	@Column(name="CT_DESIGNATION")
	private String designation;

	@Column(name="CT_DESIGNATION_SUCH_BSI")
	private String designationSearch;

	@Column(name="CT_DIRECTION")
	private String direction;

	@Column(name="CT_NO_OF_MEDIA_MAX")
	private Long noOfMediaMax;

	@Column(name="CT_REMARKS")
	private String remarks;

	@Column(name="CT_TYPE_OF_MEDIA")
	private String typeOfMedia;

	@Column(name="CT_UPDATED_BY")
	private String updatedBy;

	@OneToMany(mappedBy="connectorType")
	private Set<CardType> cardTypes;

	@OneToMany(mappedBy="connectorType")
	private Set<DistributorElemen> distributorElemens;

	@OneToMany(mappedBy="connectorType")
	private Set<Port> ports;

	@OneToMany(mappedBy="connectorType")
	private Set<EqType> eqTypes;

	@ManyToMany
	@JoinTable(name="ZU_KOMPATIBEL_IST",
		joinColumns=@JoinColumn(name="FK_CONNECTOR_TYOID_CONNECTOR_T"),
		inverseJoinColumns=@JoinColumn(name="FK0CONNECTOR_TYOID_CONNECTOR_T"))
	private Set<ConnectorType> connectorTypes;

	@ManyToMany(mappedBy="connectorTypes")
	private Set<ConnectorType> connectorTypes2;

	private static final long serialVersionUID = 1L;

	public ConnectorType() {
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
	 * @return the dateUpdated
	 */
	public Date getDateUpdated() {
		return dateUpdated;
	}

	/**
	 * @param dateUpdated the dateUpdated to set
	 */
	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the designationSearch
	 */
	public String getDesignationSearch() {
		return designationSearch;
	}

	/**
	 * @param designationSearch the designationSearch to set
	 */
	public void setDesignationSearch(String designationSearch) {
		this.designationSearch = designationSearch;
	}

	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * @param direction the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * @return the noOfMediaMax
	 */
	public Long getNoOfMediaMax() {
		return noOfMediaMax;
	}

	/**
	 * @param noOfMediaMax the noOfMediaMax to set
	 */
	public void setNoOfMediaMax(Long noOfMediaMax) {
		this.noOfMediaMax = noOfMediaMax;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the typeOfMedia
	 */
	public String getTypeOfMedia() {
		return typeOfMedia;
	}

	/**
	 * @param typeOfMedia the typeOfMedia to set
	 */
	public void setTypeOfMedia(String typeOfMedia) {
		this.typeOfMedia = typeOfMedia;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the cardTypes
	 */
	public Set<CardType> getCardTypes() {
		return cardTypes;
	}

	/**
	 * @param cardTypes the cardTypes to set
	 */
	public void setCardTypes(Set<CardType> cardTypes) {
		this.cardTypes = cardTypes;
	}

	/**
	 * @return the distributorElemens
	 */
	public Set<DistributorElemen> getDistributorElemens() {
		return distributorElemens;
	}

	/**
	 * @param distributorElemens the distributorElemens to set
	 */
	public void setDistributorElemens(Set<DistributorElemen> distributorElemens) {
		this.distributorElemens = distributorElemens;
	}

	/**
	 * @return the ports
	 */
	public Set<Port> getPorts() {
		return ports;
	}

	/**
	 * @param ports the ports to set
	 */
	public void setPorts(Set<Port> ports) {
		this.ports = ports;
	}

	/**
	 * @return the eqTypes
	 */
	public Set<EqType> getEqTypes() {
		return eqTypes;
	}

	/**
	 * @param eqTypes the eqTypes to set
	 */
	public void setEqTypes(Set<EqType> eqTypes) {
		this.eqTypes = eqTypes;
	}

	/**
	 * @return the connectorTypes
	 */
	public Set<ConnectorType> getConnectorTypes() {
		return connectorTypes;
	}

	/**
	 * @param connectorTypes the connectorTypes to set
	 */
	public void setConnectorTypes(Set<ConnectorType> connectorTypes) {
		this.connectorTypes = connectorTypes;
	}

	/**
	 * @return the connectorTypes2
	 */
	public Set<ConnectorType> getConnectorTypes2() {
		return connectorTypes2;
	}

	/**
	 * @param connectorTypes2 the connectorTypes2 to set
	 */
	public void setConnectorTypes2(Set<ConnectorType> connectorTypes2) {
		this.connectorTypes2 = connectorTypes2;
	}

	
}
