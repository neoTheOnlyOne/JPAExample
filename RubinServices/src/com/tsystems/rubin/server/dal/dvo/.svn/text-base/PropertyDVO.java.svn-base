package com.tsystems.rubin.server.dal.dvo;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * The Class PropertyDVO. - data value objects used in constructor query
 * expression for Property.
 * 
 */
public class PropertyDVO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private Long id;

	/** The name. */
	private String name;

	/** The assignment. */
	private String assignment;

	/**
	 * Instantiates the new Property DVO.
	 * 
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param assignment
	 *            the assignment
	 */
	public PropertyDVO(Long id, String name, String assignment) {
		this.id = id;
		this.name = name;
		this.assignment = assignment;
	}

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 * 
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the assignment.
	 * 
	 * @return the assignment
	 */
	public String getAssignment() {
		return assignment;
	}

	/**
	 * Sets the assignment.
	 * 
	 * @param assignment
	 *            the assignment to set
	 */
	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this)
		                        .append("name", this.name)
		                        .append("assignment", this.assignment)
		                        .toString();
	}

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (!(object instanceof PropertyDVO)) {
			return false;
		}
		if(this == object) {
			return true;
		}
		PropertyDVO rhs = (PropertyDVO) object;
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
