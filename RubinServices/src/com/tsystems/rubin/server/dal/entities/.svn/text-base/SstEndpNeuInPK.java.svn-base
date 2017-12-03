//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.entities.SstEndpNeuInPK.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update:  Aug 10, 2009
 * 
 * Copyright © 2008 by T-Systems International GmbH, 
 * Frankfurt/Main
 * All rights, including that of the extracts pressure, 
 * photomechanical reproduction (including microscopy),
 * and the evaluation of databases, or similar
 * organizations, reserved.
 **/
//======================================================================================================================


//======================================================================================================================
//====== Package 
//======================================================================================================================
package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SstEndpNeuInPK implements Serializable {
	
		@Column(name="FK_SST_OMS_NDS_OMS_ID", insertable=false, updatable=false)
		private String fkSstOmsNdsOmsId;

		@Column(name="FK_SST_OMS_NDS_OMS_SUB_ID", insertable=false, updatable=false)
		private String fkSstOmsNdsOmsSubId;

		@Column(name="FK_SST_OMS_NDS_MES", insertable=false, updatable=false)
		private String fkSstOmsNdsMes;

		private String typ;

		private String endpunkt;

		private static final long serialVersionUID = 1L;

		public SstEndpNeuInPK() {
			super();
		}

		public String getFkSstOmsNdsOmsId() {
			return this.fkSstOmsNdsOmsId;
		}

		public void setFkSstOmsNdsOmsId(String fkSstOmsNdsOmsId) {
			this.fkSstOmsNdsOmsId = fkSstOmsNdsOmsId;
		}

		public String getFkSstOmsNdsOmsSubId() {
			return this.fkSstOmsNdsOmsSubId;
		}

		public void setFkSstOmsNdsOmsSubId(String fkSstOmsNdsOmsSubId) {
			this.fkSstOmsNdsOmsSubId = fkSstOmsNdsOmsSubId;
		}

		public String getFkSstOmsNdsMes() {
			return this.fkSstOmsNdsMes;
		}

		public void setFkSstOmsNdsMes(String fkSstOmsNdsMes) {
			this.fkSstOmsNdsMes = fkSstOmsNdsMes;
		}

		public String getTyp() {
			return this.typ;
		}

		public void setTyp(String typ) {
			this.typ = typ;
		}

		public String getEndpunkt() {
			return this.endpunkt;
		}

		public void setEndpunkt(String endpunkt) {
			this.endpunkt = endpunkt;
		}

		@Override
		public boolean equals(Object o) {
			if (o == this) {
				return true;
			}
			if ( ! (o instanceof SstEndpNeuInPK)) {
				return false;
			}
			SstEndpNeuInPK other = (SstEndpNeuInPK) o;
			return this.fkSstOmsNdsOmsId.equals(other.fkSstOmsNdsOmsId)
				&& this.fkSstOmsNdsOmsSubId.equals(other.fkSstOmsNdsOmsSubId)
				&& this.fkSstOmsNdsMes.equals(other.fkSstOmsNdsMes)
				&& this.typ.equals(other.typ)
				&& this.endpunkt.equals(other.endpunkt);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + this.fkSstOmsNdsOmsId.hashCode();
			hash = hash * prime + this.fkSstOmsNdsOmsSubId.hashCode();
			hash = hash * prime + this.fkSstOmsNdsMes.hashCode();
			hash = hash * prime + this.typ.hashCode();
			hash = hash * prime + this.endpunkt.hashCode();
			return hash;
		}

	}


