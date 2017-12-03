//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.entities.InfoCablePK.java
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
public class InfoCablePK implements Serializable {
	
		@Column(name="CA_DISTRIB_E_A1_FK", insertable=false, updatable=false)
		private long caDistribEA1Fk;

		@Column(name="CA_DISTRIB_E_A2_FK", insertable=false, updatable=false)
		private long caDistribEA2Fk;

		@Column(name="CA_DISTRIB_E_B1_FK", insertable=false, updatable=false)
		private long caDistribEB1Fk;

		@Column(name="CA_DISTRIB_E_B2_FK", insertable=false, updatable=false)
		private long caDistribEB2Fk;

		@Column(name="CA_CABLE_ID")
		private long caCableId;

		private static final long serialVersionUID = 1L;

		public InfoCablePK() {
			super();
		}

		public long getCaDistribEA1Fk() {
			return this.caDistribEA1Fk;
		}

		public void setCaDistribEA1Fk(long caDistribEA1Fk) {
			this.caDistribEA1Fk = caDistribEA1Fk;
		}

		public long getCaDistribEA2Fk() {
			return this.caDistribEA2Fk;
		}

		public void setCaDistribEA2Fk(long caDistribEA2Fk) {
			this.caDistribEA2Fk = caDistribEA2Fk;
		}

		public long getCaDistribEB1Fk() {
			return this.caDistribEB1Fk;
		}

		public void setCaDistribEB1Fk(long caDistribEB1Fk) {
			this.caDistribEB1Fk = caDistribEB1Fk;
		}

		public long getCaDistribEB2Fk() {
			return this.caDistribEB2Fk;
		}

		public void setCaDistribEB2Fk(long caDistribEB2Fk) {
			this.caDistribEB2Fk = caDistribEB2Fk;
		}

		public long getCaCableId() {
			return this.caCableId;
		}

		public void setCaCableId(long caCableId) {
			this.caCableId = caCableId;
		}

		@Override
		public boolean equals(Object o) {
			if (o == this) {
				return true;
			}
			if ( ! (o instanceof InfoCablePK)) {
				return false;
			}
			InfoCablePK other = (InfoCablePK) o;
			return (this.caDistribEA1Fk == other.caDistribEA1Fk)
				&& (this.caDistribEA2Fk == other.caDistribEA2Fk)
				&& (this.caDistribEB1Fk == other.caDistribEB1Fk)
				&& (this.caDistribEB2Fk == other.caDistribEB2Fk)
				&& (this.caCableId == other.caCableId);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + ((int) (this.caDistribEA1Fk ^ (this.caDistribEA1Fk >>> 32)));
			hash = hash * prime + ((int) (this.caDistribEA2Fk ^ (this.caDistribEA2Fk >>> 32)));
			hash = hash * prime + ((int) (this.caDistribEB1Fk ^ (this.caDistribEB1Fk >>> 32)));
			hash = hash * prime + ((int) (this.caDistribEB2Fk ^ (this.caDistribEB2Fk >>> 32)));
			hash = hash * prime + ((int) (this.caCableId ^ (this.caCableId >>> 32)));
			return hash;
		}

	}


