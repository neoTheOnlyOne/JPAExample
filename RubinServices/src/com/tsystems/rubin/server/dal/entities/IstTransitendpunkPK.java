//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.entities.IstTransitendpunkPK.java
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
public class IstTransitendpunkPK implements Serializable {

		@Column(name="FK_TRANSITOID_TRAN")
		private long fkTransitoidTran;

		@Column(name="FK_ENDPUNKTOID_END")
		private long fkEndpunktoidEnd;

		private static final long serialVersionUID = 1L;

		public IstTransitendpunkPK() {
			super();
		}

		public long getFkTransitoidTran() {
			return this.fkTransitoidTran;
		}

		public void setFkTransitoidTran(long fkTransitoidTran) {
			this.fkTransitoidTran = fkTransitoidTran;
		}

		public long getFkEndpunktoidEnd() {
			return this.fkEndpunktoidEnd;
		}

		public void setFkEndpunktoidEnd(long fkEndpunktoidEnd) {
			this.fkEndpunktoidEnd = fkEndpunktoidEnd;
		}

		@Override
		public boolean equals(Object o) {
			if (o == this) {
				return true;
			}
			if ( ! (o instanceof IstTransitendpunkPK)) {
				return false;
			}
			IstTransitendpunkPK other = (IstTransitendpunkPK) o;
			return (this.fkTransitoidTran == other.fkTransitoidTran)
				&& (this.fkEndpunktoidEnd == other.fkEndpunktoidEnd);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + ((int) (this.fkTransitoidTran ^ (this.fkTransitoidTran >>> 32)));
			hash = hash * prime + ((int) (this.fkEndpunktoidEnd ^ (this.fkEndpunktoidEnd >>> 32)));
			return hash;
		}

	}

