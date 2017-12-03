//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.entities.InfoDistributorEPK.java
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
public class InfoDistributorEPK implements Serializable {
	
		@Column(name="DE_DISTRIB_E_ID")
		private long deDistribEId;

		@Column(name="DE_OID_DISTRIBUTOR")
		private long deOidDistributor;

		private static final long serialVersionUID = 1L;

		public InfoDistributorEPK() {
			super();
		}

		public long getDeDistribEId() {
			return this.deDistribEId;
		}

		public void setDeDistribEId(long deDistribEId) {
			this.deDistribEId = deDistribEId;
		}

		public long getDeOidDistributor() {
			return this.deOidDistributor;
		}

		public void setDeOidDistributor(long deOidDistributor) {
			this.deOidDistributor = deOidDistributor;
		}

		@Override
		public boolean equals(Object o) {
			if (o == this) {
				return true;
			}
			if ( ! (o instanceof InfoDistributorEPK)) {
				return false;
			}
			InfoDistributorEPK other = (InfoDistributorEPK) o;
			return (this.deDistribEId == other.deDistribEId)
				&& (this.deOidDistributor == other.deOidDistributor);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + ((int) (this.deDistribEId ^ (this.deDistribEId >>> 32)));
			hash = hash * prime + ((int) (this.deOidDistributor ^ (this.deOidDistributor >>> 32)));
			return hash;
		}

	}


