package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tsystems.rubin.common.util.NamedQueryConstants;
@NamedQueries( {
	@NamedQuery(name = NamedQueryConstants.LSZEXTENSION_FINDALL, query = "Select l from LszExtension l"
			+ " order by l.lszExtensionId")
	 })
@Entity
@Table(name="LSZ_EXTENSION")
public class LszExtension implements Serializable {
	@Id
	@Column(name="OID_EXTENSION")
	private long oidExtension;

	@Column(name="LSZ_EXTENSION_ID")
	private String lszExtensionId;

	@Column(name="LSZ_EXTENSION_DESCRIPTION")
	private String lszExtensionDescription;

	@OneToMany(mappedBy="fkLszExtensiooidExtension")
	private Set<SlaProduct> slaProductCollection;

	@OneToMany(mappedBy="fkLszExtensiooidExtension")
	private Set<Transportverbindun> transportverbindunCollection;

	private static final long serialVersionUID = 1L;

	public LszExtension() {
		super();
	}

	public long getOidExtension() {
		return this.oidExtension;
	}

	public void setOidExtension(long oidExtension) {
		this.oidExtension = oidExtension;
	}

	public String getLszExtensionId() {
		return this.lszExtensionId;
	}

	public void setLszExtensionId(String lszExtensionId) {
		this.lszExtensionId = lszExtensionId;
	}

	public String getLszExtensionDescription() {
		return this.lszExtensionDescription;
	}

	public void setLszExtensionDescription(String lszExtensionDescription) {
		this.lszExtensionDescription = lszExtensionDescription;
	}

	public Set<SlaProduct> getSlaProductCollection() {
		return this.slaProductCollection;
	}

	public void setSlaProductCollection(Set<SlaProduct> slaProductCollection) {
		this.slaProductCollection = slaProductCollection;
	}

	public Set<Transportverbindun> getTransportverbindunCollection() {
		return this.transportverbindunCollection;
	}

	public void setTransportverbindunCollection(Set<Transportverbindun> transportverbindunCollection) {
		this.transportverbindunCollection = transportverbindunCollection;
	}

}
