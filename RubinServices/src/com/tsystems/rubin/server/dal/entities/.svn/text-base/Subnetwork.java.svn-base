package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.tsystems.rubin.common.util.NamedQueryConstants;
@NamedQueries({
    @NamedQuery(name = NamedQueryConstants.SUBNETWORK_FINDALL, query = "Select new com.tsystems.rubin.server.dal.dvo.SubnetworkDVO"
            + Subnetwork.COMMON_PICKLIST_FIELDS_STRING + " from Subnetwork s " + "order by s.name"),
    @NamedQuery(name = NamedQueryConstants.SUBNETWORK_FINDBYSUBNETWORKLABELNULL, query = "Select new com.tsystems.rubin.server.dal.dvo.SubnetworkDVO"
            + Subnetwork.COMMON_PICKLIST_FIELDS_STRING + " from Subnetwork s WHERE trim(both from s.label) IS NULL order by s.name"),
    @NamedQuery(name = NamedQueryConstants.SUBNETWORK_FINDBYSUBNETWORKLABEL, query = "Select new com.tsystems.rubin.server.dal.dvo.SubnetworkDVO"
            + Subnetwork.COMMON_PICKLIST_FIELDS_STRING + " from Subnetwork s WHERE trim(both from s.label) IS NOT NULL " + "order by s.name"),
    @NamedQuery(name = NamedQueryConstants.SUBNETWORK_FINDFIRSTSUBNETBYCIRCUITID, query = "Select new com.tsystems.rubin.server.dal.dvo.SubnetworkDVO"
			+ Subnetwork.COMMON_PICKLIST_FIELDS_STRING
			+ " from Subnetwork s JOIN s.circuits c where c.id = ?1 order by s.name"),
	@NamedQuery(name = NamedQueryConstants.SUBNETWORK_FINDFURTHERSUBNETBYCIRCUITID, query = "Select new com.tsystems.rubin.server.dal.dvo.SubnetworkDVO"
			+ Subnetwork.COMMON_PICKLIST_FIELDS_STRING
			+ " from Subnetwork s LEFT JOIN s.circuits2 c2 where c2.id = ?1 order by s.name")
    })
@Entity
public class Subnetwork implements Serializable {
	@Transient
	final static String COMMON_PICKLIST_FIELDS_STRING = "(s.id, s.name, s.label)";
	@Id
	@Column(name = "OID_SUBNETWORK")
	private Long id;

	@Column(name = "SUBNETWORKNAME")
	private String name;

	@Column(name = "SUBNETWORKLABEL")
	private String label;

	@Column(name = "SUBNETWORKNOTIZ")
	private String remark;

	@OneToMany(mappedBy = "subnetwork")
	private Set<Circuit> circuits;

	@ManyToMany
	@JoinTable(name = "HAT_LABEL", joinColumns = @JoinColumn(name = "FK_SUBNETWORKOID_SUBNETWORK"), 
			inverseJoinColumns = @JoinColumn(name = "FK_TRANSPORTVEROID_TRANSPORTVE"))
	private Set<Circuit> circuits2;

	private static final long serialVersionUID = 1L;

	public Subnetwork() {
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
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}



	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
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



	/**
	 * @return the circuits2
	 */
	public Set<Circuit> getCircuits2() {
		return circuits2;
	}



	/**
	 * @param circuits2 the circuits2 to set
	 */
	public void setCircuits2(Set<Circuit> circuits2) {
		this.circuits2 = circuits2;
	}



	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this).append("name", this.name).append("label", this.label).append("remark",
				this.remark).toString();
	}

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (!(object instanceof Subnetwork)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		Subnetwork rhs = (Subnetwork) object;
		return new EqualsBuilder().append(this.label, rhs.label).append(this.remark, rhs.remark).append(this.name,
				rhs.name).isEquals();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(1116815721, -873486177).append(this.label).append(this.remark).append(this.name)
				.toHashCode();
	}

}
