package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.tsystems.rubin.common.util.NamedQueryConstants;

@NamedQueries( {
	@NamedQuery(name = NamedQueryConstants.FIND_ROUTINGSECTIONBYROUTINGID, 
			    query = "Select new com.tsystems.rubin.server.dal.dvo.FuehrungsabschnittDVO" + 
			             Fuehrungsabschnitt.COMMON_PICKLIST_FIELDS_STRING + " from Fuehrungsabschnitt f" + 
			            " where f.fkFuehrungoidFue.oidFuehrung = ?1 order by f.fuehrungsabschnit0"),
	@NamedQuery(name = NamedQueryConstants.FIND_P_ROUTINGSCTIONTYPEINFO_BYROUTINGSECTIONID,
			    query = "Select new com.tsystems.rubin.server.dal.dvo.RoutingSectionTypeInfoDVO" + 
			             Fuehrungsabschnitt.ROUTINGSECTIONTYPE_P_FIELDS_STRING + " from Fuehrungsabschnitt f" + 
			            " where f.oidFuehrungsabsch = ?1"),
    @NamedQuery(name = NamedQueryConstants.FIND_L_ROUTINGSCTIONTYPEINFO_BYROUTINGSECTIONID,
    		    query = "Select new com.tsystems.rubin.server.dal.dvo.RoutingSectionTypeInfoDVO" +
    		             Fuehrungsabschnitt.ROUTINGSECTIONTYPE_L_FIELDS_STRING + " from Fuehrungsabschnitt f" +
    		            " where f.oidFuehrungsabsch = ?1"),
   @NamedQuery(name = NamedQueryConstants.FIND_K_ROUTINGSCTIONTYPEINFO_BYROUTINGSECTIONID,
		       query = "Select new com.tsystems.rubin.server.dal.dvo.RoutingSectionTypeInfoDVO" + 
		                Fuehrungsabschnitt.ROUTINGSECTIONTYPE_K_FIELDS_STRING + " from Fuehrungsabschnitt f, IN (f.kanalCollection) k" + 
		                " where f.oidFuehrungsabsch = ?1")
			
 })
@Entity
public class Fuehrungsabschnitt implements Serializable {
	
	@Transient
    final static String COMMON_PICKLIST_FIELDS_STRING = "(f.oidFuehrungsabsch, f.fuehrungsabschnitt)";
	
	@Transient
	final static String ROUTINGSECTIONTYPE_P_FIELDS_STRING = "(f.fkPosition0oidPo.fkLinienabschnoid.fkLinieoidLinie.linienkennung," +
			                                                 " f.fkPosition0oidPo.fkLinienabschnoid.lAbschnittscode," +
			                                                 " f.fkPosition0oidPo.fkLinienabschnoid.fkEndpunktoidEnd.site.designationNational," +
			                                                 " f.fkPosition0oidPo.fkLinienabschnoid.fkEndpunktoidEnd.ituSuffix," +
	                                                         " f.fkPosition0oidPo.fkLinienabschnoid.fk0endpunktoidEnd.site.designationNational," +
                                                             " f.fkPosition0oidPo.fkLinienabschnoid.fk0endpunktoidEnd.ituSuffix)";
			                                                
	@Transient
	final static String ROUTINGSECTIONTYPE_L_FIELDS_STRING = "(f.fkLaenderkanteoid.laenderkanteArt," +
	                                                         " f.fkLaenderkanteoid.fkEndpunktoidEnd.site.designationNational," +
                                                             " f.fkLaenderkanteoid.fkEndpunktoidEnd.ituSuffix," +
	                                                         " f.fkLaenderkanteoid.fk0endpunktoidEnd.site.designationNational," +
                                                             " f.fkLaenderkanteoid.fk0endpunktoidEnd.ituSuffix)";
			                                                 
			                                                 
	
	@Transient
	final static String ROUTINGSECTIONTYPE_K_FIELDS_STRING = "(k.fkKonfiguratiooid.fkTransportveroid.oidTransportverbi," +
			                                                 " k.fkKonfiguratiooid.fkTransportveroid.transOrdnungsnumm," +
			                                                 " k.fkKonfiguratiooid.fkTransportveroid.fkLszoidLsz.code," +
			                                                 " k.fkKonfiguratiooid.fkTransportveroid.fkEndpunktoidEnd.site.designationNational," +
			                                                 " k.fkKonfiguratiooid.fkTransportveroid.fkEndpunktoidEnd.ituSuffix," +
			                                                 " k.fkKonfiguratiooid.fkTransportveroid.fk0endpunktoidEnd.site.designationNational," +
			                                                 " k.fkKonfiguratiooid.fkTransportveroid.fk0endpunktoidEnd.ituSuffix)";
	
	@Id
	@Column(name="OID_FUEHRUNGSABSCH")
	private Long oidFuehrungsabsch;

	private String fuehrungsabschnitt;

	private BigDecimal fuehrungsabschnit0;

	private BigDecimal fuehrungsabschnit1;

	private String fuehrungsabschnit2;

	@Column(name="FUEHRUNGSAB_IHRS_CONSISTENCY")
	private String fuehrungsabIhrsConsistency;

	@Column(name="FUEHRUNGSAB_IHRS_DESIGN_DATE")
	private Date fuehrungsabIhrsDesignDate;

	@Column(name="FK_WORKING_AREAOID_WORKING_ARE")
	private BigDecimal fkWorkingAreaoidWorkingAre;

	@Column(name="FK_NUTZUNGSKONTOID_NUTZUNGSKON")
	private BigDecimal fkNutzungskontoidNutzungskon;

	@Column(name="FK_ALIASBEZEICHOID_ALIASBEZEIC")
	private BigDecimal fkAliasbezeichoidAliasbezeic;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_FUEHRUNGOID_FUE")
	private Fuehrung fkFuehrungoidFue;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_LAENDERKANTEOID")
	private Laenderkante fkLaenderkanteoid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_LEGOID_LEG")
	private Leg fkLegoidLeg;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_POSITION0OID_PO")
	private Position0 fkPosition0oidPo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_SECURE_SECTIOID_SECURE_SECT")
	private SecureSection fkSecureSectioidSecureSect;

	@OneToMany(mappedBy="fkFuehrungsabsoidFuehrungsab")
	private Set<CrossConnect> crossConnectCollection;

	@OneToMany(mappedBy="fkFuehrungsabsoid")
	private Set<IhRoutingSection> ihRoutingSectionCollection;

	@ManyToMany
	@JoinTable(name="WEIST_AUF",
		joinColumns=@JoinColumn(name="FK_FUEHRUNGSABSOID"),
		inverseJoinColumns=@JoinColumn(name="FK_KANALOID_KANAL"))
	private Set<Kanal> kanalCollection;

	private static final long serialVersionUID = 1L;

	public Fuehrungsabschnitt() {
		super();
	}

	public Long getOidFuehrungsabsch() {
		return this.oidFuehrungsabsch;
	}

	public void setOidFuehrungsabsch(Long oidFuehrungsabsch) {
		this.oidFuehrungsabsch = oidFuehrungsabsch;
	}

	public String getFuehrungsabschnitt() {
		return this.fuehrungsabschnitt;
	}

	public void setFuehrungsabschnitt(String fuehrungsabschnitt) {
		this.fuehrungsabschnitt = fuehrungsabschnitt;
	}

	public BigDecimal getFuehrungsabschnit0() {
		return this.fuehrungsabschnit0;
	}

	public void setFuehrungsabschnit0(BigDecimal fuehrungsabschnit0) {
		this.fuehrungsabschnit0 = fuehrungsabschnit0;
	}

	public BigDecimal getFuehrungsabschnit1() {
		return this.fuehrungsabschnit1;
	}

	public void setFuehrungsabschnit1(BigDecimal fuehrungsabschnit1) {
		this.fuehrungsabschnit1 = fuehrungsabschnit1;
	}

	public String getFuehrungsabschnit2() {
		return this.fuehrungsabschnit2;
	}

	public void setFuehrungsabschnit2(String fuehrungsabschnit2) {
		this.fuehrungsabschnit2 = fuehrungsabschnit2;
	}

	public String getFuehrungsabIhrsConsistency() {
		return this.fuehrungsabIhrsConsistency;
	}

	public void setFuehrungsabIhrsConsistency(String fuehrungsabIhrsConsistency) {
		this.fuehrungsabIhrsConsistency = fuehrungsabIhrsConsistency;
	}

	public Date getFuehrungsabIhrsDesignDate() {
		return this.fuehrungsabIhrsDesignDate;
	}

	public void setFuehrungsabIhrsDesignDate(Date fuehrungsabIhrsDesignDate) {
		this.fuehrungsabIhrsDesignDate = fuehrungsabIhrsDesignDate;
	}

	public BigDecimal getFkWorkingAreaoidWorkingAre() {
		return this.fkWorkingAreaoidWorkingAre;
	}

	public void setFkWorkingAreaoidWorkingAre(BigDecimal fkWorkingAreaoidWorkingAre) {
		this.fkWorkingAreaoidWorkingAre = fkWorkingAreaoidWorkingAre;
	}

	public BigDecimal getFkNutzungskontoidNutzungskon() {
		return this.fkNutzungskontoidNutzungskon;
	}

	public void setFkNutzungskontoidNutzungskon(BigDecimal fkNutzungskontoidNutzungskon) {
		this.fkNutzungskontoidNutzungskon = fkNutzungskontoidNutzungskon;
	}

	public BigDecimal getFkAliasbezeichoidAliasbezeic() {
		return this.fkAliasbezeichoidAliasbezeic;
	}

	public void setFkAliasbezeichoidAliasbezeic(BigDecimal fkAliasbezeichoidAliasbezeic) {
		this.fkAliasbezeichoidAliasbezeic = fkAliasbezeichoidAliasbezeic;
	}

	public Fuehrung getFkFuehrungoidFue() {
		return this.fkFuehrungoidFue;
	}

	public void setFkFuehrungoidFue(Fuehrung fkFuehrungoidFue) {
		this.fkFuehrungoidFue = fkFuehrungoidFue;
	}

	public Laenderkante getFkLaenderkanteoid() {
		return this.fkLaenderkanteoid;
	}

	public void setFkLaenderkanteoid(Laenderkante fkLaenderkanteoid) {
		this.fkLaenderkanteoid = fkLaenderkanteoid;
	}

	public Leg getFkLegoidLeg() {
		return this.fkLegoidLeg;
	}

	public void setFkLegoidLeg(Leg fkLegoidLeg) {
		this.fkLegoidLeg = fkLegoidLeg;
	}

	public Position0 getFkPosition0oidPo() {
		return this.fkPosition0oidPo;
	}

	public void setFkPosition0oidPo(Position0 fkPosition0oidPo) {
		this.fkPosition0oidPo = fkPosition0oidPo;
	}

	public SecureSection getFkSecureSectioidSecureSect() {
		return this.fkSecureSectioidSecureSect;
	}

	public void setFkSecureSectioidSecureSect(SecureSection fkSecureSectioidSecureSect) {
		this.fkSecureSectioidSecureSect = fkSecureSectioidSecureSect;
	}

	public Set<CrossConnect> getCrossConnectCollection() {
		return this.crossConnectCollection;
	}

	public void setCrossConnectCollection(Set<CrossConnect> crossConnectCollection) {
		this.crossConnectCollection = crossConnectCollection;
	}

	public Set<IhRoutingSection> getIhRoutingSectionCollection() {
		return this.ihRoutingSectionCollection;
	}

	public void setIhRoutingSectionCollection(Set<IhRoutingSection> ihRoutingSectionCollection) {
		this.ihRoutingSectionCollection = ihRoutingSectionCollection;
	}

	public Set<Kanal> getKanalCollection() {
		return this.kanalCollection;
	}

	public void setKanalCollection(Set<Kanal> kanalCollection) {
		this.kanalCollection = kanalCollection;
	}

}
