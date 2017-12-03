package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.tsystems.rubin.common.util.NamedQueryConstants;

/**
 * The Class Layer. - An entity for LAYERART table.
 */

@NamedQueries({
        @NamedQuery(name = NamedQueryConstants.LAYER_FINDALL, query = "Select new com.tsystems.rubin.server.dal.dvo.LayerDVO"
                + Layer.COMMON_PICKLIST_FIELDS_STRING + "from Layer l " + "order by l.name"),
        @NamedQuery(name = NamedQueryConstants.LAYER_COUNTBYNAME, query = "Select count(l)"
                + "from Layer l where trim(both from l.name) like ?1")
                })
@Entity
@Table(name = "LAYERART")
public class Layer implements Serializable {

    /** The Constant COMMON_PICKLIST_FIELDS_STRING. */
    @Transient
    static final String COMMON_PICKLIST_FIELDS_STRING = "(l.id, l.name, l.description)";

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Layerart")
    @SequenceGenerator(name = "Layerart", sequenceName = "LAYERART_SEQUENCE", allocationSize = 1)
    @Column(name = "OID_LAYERART")
    private Long id;

    /** The name. */
    @Column(name = "LAYER0")
    private String name;

    /** The description. */
    @Column(name = "LAYERART_BEMERKUNG")
    private String description;

    @OneToMany(mappedBy="layer")
	private Set<Lsc> lscs;
    /**
     * Instantiates a new layer.
     */
    public Layer() {
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the lscs
	 */
	public Set<Lsc> getLscs() {
		return lscs;
	}


	/**
	 * @param lscs the lscs to set
	 */
	public void setLscs(Set<Lsc> lscs) {
		this.lscs = lscs;
	}


	/**
     * toString.
     * 
     * @return
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return new ToStringBuilder(this).append("id", this.id).append("name", this.name).append(
                "description", this.description).toString();
    }

    /**
     * equals.
     * 
     * @param object
     * @return
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object object) {
        if (!(object instanceof Layer)) {
            return false;
        }
        Layer rhs = (Layer) object;
        return new EqualsBuilder().append(this.name, rhs.name).append(this.description,
                rhs.description).isEquals();
    }

    /**
     * hashCode.
     * 
     * @return
     * 
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return new HashCodeBuilder(1248865317, -417569183).append(this.name).append(
                this.description).toHashCode();
    }
}
