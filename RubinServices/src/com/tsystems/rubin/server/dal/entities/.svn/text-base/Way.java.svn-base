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
    @NamedQuery(name = NamedQueryConstants.WAY_FINDALLPATH, query = "Select new com.tsystems.rubin.server.dal.dvo.WayDVO"
            + Way.COMMON_PICKLIST_FIELDS_STRING + " from Way w where w.network.id = ?1 " + "order by w.name")
    })
@Entity
@Table(name = "WEG")
public class Way implements Serializable {
	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(w.id, w.name)";
	
	@Id
	@Column(name = "OID")
	private Long id;

	private String name;

	private String remark;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_NETZWERKOID")
	private Network network;

	@OneToMany(mappedBy="way2")
	private Set<Circuit> circuit;

	private static final long serialVersionUID = 1L;

	public Way() {
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
	 * @return the network
	 */
	public Network getNetwork() {
		return network;
	}

	/**
	 * @param network the network to set
	 */
	public void setNetwork(Network network) {
		this.network = network;
	}

	/**
	 * @return the circuit
	 */
	public Set<Circuit> getCircuit() {
		return circuit;
	}

	/**
	 * @param circuit the circuit to set
	 */
	public void setCircuit(Set<Circuit> circuit) {
		this.circuit = circuit;
	}

}
