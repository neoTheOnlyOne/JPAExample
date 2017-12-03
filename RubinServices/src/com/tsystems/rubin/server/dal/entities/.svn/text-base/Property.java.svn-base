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
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.tsystems.rubin.common.util.NamedQueryConstants;

/**
 * The Class Property. - An entity for EIGENSCHAFT table.
 */
@NamedQueries({
    @NamedQuery(name = NamedQueryConstants.PROPERTY_FINDALL, query = "Select new com.tsystems.rubin.server.dal.dvo.PropertyDVO"
            + Property.COMMON_PICKLIST_FIELDS_STRING + " from Property p " + "where p.assignment='T'"
                                                                                           +"order by p.name"),
    @NamedQuery(name = NamedQueryConstants.PROPERTY_FINDBYCIRCUITID, query = "Select new com.tsystems.rubin.server.dal.dvo.PropertyDVO"
    	    + Property.COMMON_PICKLIST_FIELDS_STRING + " from Property p, IN (p.circuits) c " 
    	    + "where c.id = ?1 order by p.name")
                                                                                                                                                                                                                                                                 
     })
@Entity
@Table(name = "EIGENSCHAFT")
public class Property implements Serializable {
	
	/** The Constant COMMON_PICKLIST_FIELDS_STRING. */
    @Transient
	final static String COMMON_PICKLIST_FIELDS_STRING="(p.id,p.name,p.assignment)";
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="OID_EIGENSCHAFT")
	private Long id;

	@Column(name="EIGENSCHAFTSNAME")
	private String name;

	@Column(name="EIGENSCHAFTSZUORDN")
	private String assignment;

	@ManyToMany
	@JoinTable(name="BESITZT0",
		joinColumns=@JoinColumn(name="FK_EIGENSCHAFTOID"),
		inverseJoinColumns=@JoinColumn(name="FK_TRANSPORTVEROID"))
	private Set<Circuit> circuits;
	
	@ManyToMany
	@JoinTable(name="BESITZT",
		joinColumns=@JoinColumn(name="FK_EIGENSCHAFTOID"),
		inverseJoinColumns=@JoinColumn(name="FK_LINIENABSCHNOID"))
	private Set<LineSegment> lineSegments;
	
	public Property() {
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
	 * @return the assignment
	 */
	public String getAssignment() {
		return assignment;
	}


	/**
	 * @param assignment the assignment to set
	 */
	public void setAssignment(String assignment) {
		this.assignment = assignment;
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
	 * @return the lineSegments
	 */
	public Set<LineSegment> getLineSegments() {
		return lineSegments;
	}


	/**
	 * @param lineSegments the lineSegments to set
	 */
	public void setLineSegments(Set<LineSegment> lineSegments) {
		this.lineSegments = lineSegments;
	}


	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this)
		                        .append("id", this.id)
		                        .append("name", this.name)
		                        .append("assignment", this.assignment)
		                        .toString();
	}

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (!(object instanceof Property)) {
			return false;
		}
		if(this == object) {
			return true;
		}
		Property rhs = (Property) object;
		return new EqualsBuilder()
		                       .append(this.assignment, rhs.assignment)
		                       .append(this.name, rhs.name)
		                       .isEquals();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(16943793, 1140600043)
		                       .append(this.assignment)
		                       .append(this.name)
				               .toHashCode();
	}
	
}
