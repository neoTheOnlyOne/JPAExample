//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.entities.SstEndpNeuOutPK.java
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
public class SstEndpNeuOutPK implements Serializable {

		@Column(name="FK_SST_NDS_OMS_OMS_ID", insertable=false, updatable=false)
		private String fkSstNdsOmsOmsId;

		@Column(name="FK_SST_NDS_OMS_OMS_SUB_ID", insertable=false, updatable=false)
		private String fkSstNdsOmsOmsSubId;

		@Column(name="FK_SST_NDS_OMS_MES", insertable=false, updatable=false)
		private String fkSstNdsOmsMes;

		private String typ;

		private String endpunkt;

		private static final long serialVersionUID = 1L;

		public SstEndpNeuOutPK() {
			super();
		}

		public String getFkSstNdsOmsOmsId() {
			return this.fkSstNdsOmsOmsId;
		}

		public void setFkSstNdsOmsOmsId(String fkSstNdsOmsOmsId) {
			this.fkSstNdsOmsOmsId = fkSstNdsOmsOmsId;
		}

		public String getFkSstNdsOmsOmsSubId() {
			return this.fkSstNdsOmsOmsSubId;
		}

		public void setFkSstNdsOmsOmsSubId(String fkSstNdsOmsOmsSubId) {
			this.fkSstNdsOmsOmsSubId = fkSstNdsOmsOmsSubId;
		}

		public String getFkSstNdsOmsMes() {
			return this.fkSstNdsOmsMes;
		}

		public void setFkSstNdsOmsMes(String fkSstNdsOmsMes) {
			this.fkSstNdsOmsMes = fkSstNdsOmsMes;
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
			if ( ! (o instanceof SstEndpNeuOutPK)) {
				return false;
			}
			SstEndpNeuOutPK other = (SstEndpNeuOutPK) o;
			return this.fkSstNdsOmsOmsId.equals(other.fkSstNdsOmsOmsId)
				&& this.fkSstNdsOmsOmsSubId.equals(other.fkSstNdsOmsOmsSubId)
				&& this.fkSstNdsOmsMes.equals(other.fkSstNdsOmsMes)
				&& this.typ.equals(other.typ)
				&& this.endpunkt.equals(other.endpunkt);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + this.fkSstNdsOmsOmsId.hashCode();
			hash = hash * prime + this.fkSstNdsOmsOmsSubId.hashCode();
			hash = hash * prime + this.fkSstNdsOmsMes.hashCode();
			hash = hash * prime + this.typ.hashCode();
			hash = hash * prime + this.endpunkt.hashCode();
			return hash;
		}

	}

