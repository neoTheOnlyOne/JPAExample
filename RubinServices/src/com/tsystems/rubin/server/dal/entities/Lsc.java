package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
 * The Class Lsc. - An entity for LSZ table.
 */
@NamedQueries({
        @NamedQuery(name = NamedQueryConstants.LSC_FINDALL, query = "Select new com.tsystems.rubin.server.dal.dvo.LscDVO"
                + Lsc.COMMON_PICKLIST_FIELDS_STRING + "from Lsc l " + "order by l.code"),
        @NamedQuery(name = NamedQueryConstants.LSC_FINDBYLAYER, query = "Select new com.tsystems.rubin.server.dal.dvo.LscDVO"
                + Lsc.COMMON_PICKLIST_FIELDS_STRING
                + "from Lsc l where trim(both from l.layer.name) like ?1 "
                + "order by l.layer.name"),
        @NamedQuery(name = NamedQueryConstants.LSC_FINDBYNOMINALCAPACITY, query = "Select new com.tsystems.rubin.server.dal.dvo.LscDVO"
                + Lsc.COMMON_PICKLIST_FIELDS_STRING
                + "from Lsc l where trim(both from l.nominalCapacity) like ?1 " + "order by l.nominalCapacity"),
        @NamedQuery(name = NamedQueryConstants.LSC_FINDBYROUTINGCAPACITY, query = "select distinct new com.tsystems.rubin.server.dal.dvo.LscDVO"
                + Lsc.COMMON_PICKLIST_FIELDS_STRING
                + "from CapacityRequired cr JOIN cr.lsc l "
                + "where trim(both from cr.capacity.name) like ?1 order by l.code"),
        @NamedQuery(name = NamedQueryConstants.LSC_FINDBYCHANNELSCAPACITY, query = "select distinct new com.tsystems.rubin.server.dal.dvo.LscDVO"
                + Lsc.COMMON_PICKLIST_FIELDS_STRING
                + "from Tributary t JOIN t.tribScheme ts JOIN ts.lsc l "
                + "where trim(both from t.capacity.name) like ?1 order by l.code"),
        @NamedQuery(name = NamedQueryConstants.LSC_FINDBYCODE, query = "Select l from Lsc l where trim(both from l.code) like ?1"),
        @NamedQuery(name = NamedQueryConstants.LSC_FINDLIKEBYCODE, query = "Select new com.tsystems.rubin.server.dal.dvo.LscDVO"
                + Lsc.COMMON_PICKLIST_FIELDS_STRING
                + "from Lsc l where trim(both from l.code) like ?1 "
                + "order by l.code"),
        @NamedQuery(name = NamedQueryConstants.LSC_FINDLIKEBYACRONYMNAT, query = "Select new com.tsystems.rubin.server.dal.dvo.LscDVO"
                + Lsc.COMMON_PICKLIST_FIELDS_STRING
                + "from Lsc l where trim(both from l.acronymNat) like ?1 " + "order by l.acronymNat"),
        @NamedQuery(name = NamedQueryConstants.LSC_FINDLIKEBYFUNCTIONCODE, query = "Select new com.tsystems.rubin.server.dal.dvo.LscDVO"
                + Lsc.COMMON_PICKLIST_FIELDS_STRING
                + "from Lsc l where trim(both from l.functionCode) like ?1 " + "order by l.functionCode"),
        @NamedQuery(name = NamedQueryConstants.LSC_COUNTBYCODE, query = "Select count(l) from Lsc l where trim(both from l.code) like ?1 ")
        })
@Entity
@Table(name = "LSZ")
public class Lsc implements Serializable {

    /** The Constant COMMON_PICKLIST_FIELDS_STRING. */
    @Transient
    final static String COMMON_PICKLIST_FIELDS_STRING = "(l.id, l.functionCode, "
            + "l.acronymNat, l.nominalCapacity, l.layer.id, "
            + "l.layer.name, l.descriptionNat, l.code)";

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Lsc")
    @SequenceGenerator(name = "Lsc", sequenceName = "LSZ_SEQUENCE", allocationSize = 1)
    @Column(name = "OID_LSZ")
    private Long id;

    /** The nominal capacity. */
    @Column(name = "EIGENKAPAZITAET")
    private String nominalCapacity;

    /** The code. */
    @Column(name = "LSZ")
    private String code;

    /** The description nat. */
    @Column(name = "LSZ_LANGBEZEICHNUN")
    private String descriptionNat;

    /** The acronym nat. */
    @Column(name = "LSZ_ABKUERZUNG_NAT")
    private String acronymNat;

    /** The sno numbering rule. */
    @Column(name = "LSZ_SNO_NUMBERING_RULE")
    private String snoNumberingRule;

    /** The function code. */
    @Column(name = "LSZ_FUNCTIONCODE")
    private String functionCode;

    /** The pstn traffic orientation. */
    @Column(name = "LSZ_VERKEHRSRICHTU")
    private String pstnTrafficOrientation;

    /** The reconfigure. */
    @Column(name = "UMKONFIGURIERUNG")
    private String reconfigure;

    /** The label allowed. */
    @Column(name = "LABEL_ALLOWED")
    private String labelAllowed;

    /** The customer circuit. */
    @Column(name = "CUSTOMER_CIRCUIT")
    private String customerCircuit;

    /** The unlimited utilization. */
    @Column(name = "UNLIMITED_UTILIZATION")
    private String unlimitedUtilization;

    /** The layer. */
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "FK_LAYERARTOID_LAY")
    private Layer layer;

    /** The trib scheme collection. */
    @OneToMany(mappedBy = "lsc")
    private Set<TribScheme> tribSchemes;

    /** The capacity required collection. */
    @OneToMany(mappedBy = "lsc")
    private Set<CapacityRequired> capacitiesRequired;
    
    @OneToMany(mappedBy="lsc")
	private Set<SlaProduct> slaProducts;

	@OneToMany(mappedBy="lsc")
	private Set<Circuit> circuits;

	@ManyToMany(mappedBy="lscs")
	private Set<EqType> eqTypes;
	
    /**
     * Instantiates a new lsc.
     */
    public Lsc() {
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
	 * @return the nominalCapacity
	 */
	public String getNominalCapacity() {
		return nominalCapacity;
	}




	/**
	 * @param nominalCapacity the nominalCapacity to set
	 */
	public void setNominalCapacity(String nominalCapacity) {
		this.nominalCapacity = nominalCapacity;
	}




	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}




	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}




	/**
	 * @return the descriptionNat
	 */
	public String getDescriptionNat() {
		return descriptionNat;
	}




	/**
	 * @param descriptionNat the descriptionNat to set
	 */
	public void setDescriptionNat(String descriptionNat) {
		this.descriptionNat = descriptionNat;
	}




	/**
	 * @return the acronymNat
	 */
	public String getAcronymNat() {
		return acronymNat;
	}




	/**
	 * @param acronymNat the acronymNat to set
	 */
	public void setAcronymNat(String acronymNat) {
		this.acronymNat = acronymNat;
	}




	/**
	 * @return the snoNumberingRule
	 */
	public String getSnoNumberingRule() {
		return snoNumberingRule;
	}




	/**
	 * @param snoNumberingRule the snoNumberingRule to set
	 */
	public void setSnoNumberingRule(String snoNumberingRule) {
		this.snoNumberingRule = snoNumberingRule;
	}




	/**
	 * @return the functionCode
	 */
	public String getFunctionCode() {
		return functionCode;
	}




	/**
	 * @param functionCode the functionCode to set
	 */
	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}




	/**
	 * @return the pstnTrafficOrientation
	 */
	public String getPstnTrafficOrientation() {
		return pstnTrafficOrientation;
	}




	/**
	 * @param pstnTrafficOrientation the pstnTrafficOrientation to set
	 */
	public void setPstnTrafficOrientation(String pstnTrafficOrientation) {
		this.pstnTrafficOrientation = pstnTrafficOrientation;
	}




	/**
	 * @return the reconfigure
	 */
	public String getReconfigure() {
		return reconfigure;
	}




	/**
	 * @param reconfigure the reconfigure to set
	 */
	public void setReconfigure(String reconfigure) {
		this.reconfigure = reconfigure;
	}




	/**
	 * @return the labelAllowed
	 */
	public String getLabelAllowed() {
		return labelAllowed;
	}




	/**
	 * @param labelAllowed the labelAllowed to set
	 */
	public void setLabelAllowed(String labelAllowed) {
		this.labelAllowed = labelAllowed;
	}




	/**
	 * @return the customerCircuit
	 */
	public String getCustomerCircuit() {
		return customerCircuit;
	}




	/**
	 * @param customerCircuit the customerCircuit to set
	 */
	public void setCustomerCircuit(String customerCircuit) {
		this.customerCircuit = customerCircuit;
	}




	/**
	 * @return the unlimitedUtilization
	 */
	public String getUnlimitedUtilization() {
		return unlimitedUtilization;
	}




	/**
	 * @param unlimitedUtilization the unlimitedUtilization to set
	 */
	public void setUnlimitedUtilization(String unlimitedUtilization) {
		this.unlimitedUtilization = unlimitedUtilization;
	}




	/**
	 * @return the layer
	 */
	public Layer getLayer() {
		return layer;
	}




	/**
	 * @param layer the layer to set
	 */
	public void setLayer(Layer layer) {
		this.layer = layer;
	}




	/**
	 * @return the tribSchemes
	 */
	public Set<TribScheme> getTribSchemes() {
		return tribSchemes;
	}




	/**
	 * @param tribSchemes the tribSchemes to set
	 */
	public void setTribSchemes(Set<TribScheme> tribSchemes) {
		this.tribSchemes = tribSchemes;
	}




	/**
	 * @return the capacitiesRequired
	 */
	public Set<CapacityRequired> getCapacitiesRequired() {
		return capacitiesRequired;
	}




	/**
	 * @param capacitiesRequired the capacitiesRequired to set
	 */
	public void setCapacitiesRequired(Set<CapacityRequired> capacitiesRequired) {
		this.capacitiesRequired = capacitiesRequired;
	}




	/**
	 * @return the slaProducts
	 */
	public Set<SlaProduct> getSlaProducts() {
		return slaProducts;
	}




	/**
	 * @param slaProducts the slaProducts to set
	 */
	public void setSlaProducts(Set<SlaProduct> slaProducts) {
		this.slaProducts = slaProducts;
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
     * toString.
     * 
     * @return the string
     * 
     * @see java.lang.Object#toString()
     */

    public String toString() {
        return new ToStringBuilder(this).append("id", this.id).append("code", this.code).append(
                "functionCode", this.functionCode).append("acronymNat", this.acronymNat).append(
                "descriptionNat", this.descriptionNat).append("customerCircuit",
                this.customerCircuit).append("unlimitedUtilization", this.unlimitedUtilization)
                .append("labelAllowed", this.labelAllowed).append("nominalCapacity",
                        this.nominalCapacity).append("layer", this.layer).append("reconfigure",
                        this.reconfigure).append("snoNumberingRule", this.snoNumberingRule).append(
                        "pstnTrafficOrientation", this.pstnTrafficOrientation).toString();
    }

    /**
     * equals.
     * 
     * @param object
     *            the object
     * 
     * @return true, if equals
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */

    public boolean equals(Object object) {
        if (!(object instanceof Lsc)) {
            return false;
        }
        Lsc rhs = (Lsc) object;
        return new EqualsBuilder().append(this.code, rhs.code).append(this.functionCode,
                rhs.functionCode).append(this.acronymNat, rhs.acronymNat).append(
                this.descriptionNat, rhs.descriptionNat).append(this.customerCircuit,
                rhs.customerCircuit).append(this.unlimitedUtilization, rhs.unlimitedUtilization)
                .append(this.labelAllowed, rhs.labelAllowed).append(this.nominalCapacity,
                        rhs.nominalCapacity).append(this.layer, rhs.layer).append(this.reconfigure,
                        rhs.reconfigure).append(this.snoNumberingRule, rhs.snoNumberingRule)
                .append(this.pstnTrafficOrientation, rhs.pstnTrafficOrientation).isEquals();
    }

    /**
     * hashCode.
     * 
     * @return the int
     * 
     * @see java.lang.Object#hashCode()
     */

    public int hashCode() {
        return new HashCodeBuilder(448564867, -1698620579).append(this.code).append(
                this.functionCode).append(this.acronymNat).append(this.descriptionNat).append(
                this.customerCircuit).append(this.unlimitedUtilization).append(this.labelAllowed)
                .append(this.nominalCapacity).append(this.layer).append(this.reconfigure).append(
                        this.snoNumberingRule).append(this.pstnTrafficOrientation).toHashCode();
    }

}
