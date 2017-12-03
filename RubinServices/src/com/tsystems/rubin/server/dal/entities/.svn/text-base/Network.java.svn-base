package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;
@NamedQueries({
	  @NamedQuery(name = NamedQueryConstants.NETWORK_FINDALLNETWORK, query = "Select new com.tsystems.rubin.server.dal.dvo.NetworkDVO"
        + Network.COMMON_PICKLIST_FIELDS_STRING + " from Network n where n.carrier.id = ?1" + "order by n.name")
  })

@Entity
@Table(name ="NETZWERK")
public class Network implements Serializable {
	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(n.id, n.name)";
	
	@Id
	@Column(name = "OID")
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name="NAME_SUCH_BSI")
	private String nameSearch;

	@Column(name="REMARK")
	private String remark;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_CARRIEROID_CARRIER")
	private Carrier carrier;

	@OneToMany(mappedBy="network")
	private Set<Way> ways;

	@OneToMany(mappedBy="network")
	private Set<Circuit> circuits;

	private static final long serialVersionUID = 1L;

	public Network() {
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
	 * @return the nameSearch
	 */
	public String getNameSearch() {
		return nameSearch;
	}

	/**
	 * @param nameSearch the nameSearch to set
	 */
	public void setNameSearch(String nameSearch) {
		this.nameSearch = nameSearch;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the carrier
	 */
	public Carrier getCarrier() {
		return carrier;
	}

	/**
	 * @param carrier the carrier to set
	 */
	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

	/**
	 * @return the ways
	 */
	public Set<Way> getWays() {
		return ways;
	}

	/**
	 * @param ways the ways to set
	 */
	public void setWays(Set<Way> ways) {
		this.ways = ways;
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
