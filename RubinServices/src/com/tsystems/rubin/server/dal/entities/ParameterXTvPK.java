//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.entities.ParameterXTvPK.java
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
public class ParameterXTvPK implements Serializable {
	
		@Column(name="FK_TRANSPORTVEROID_TRANSPORTVE", insertable=false, updatable=false)
		private long fkTransportveroidTransportve2;

		@Column(name="FK_PARAMETER_X_OID_P_X_V", insertable=false, updatable=false)
		private long fkParameterXOidPXV;

		private static final long serialVersionUID = 1L;

		public ParameterXTvPK() {
			super();
		}

		public long getFkTransportveroidTransportve2() {
			return this.fkTransportveroidTransportve2;
		}

		public void setFkTransportveroidTransportve2(long fkTransportveroidTransportve2) {
			this.fkTransportveroidTransportve2 = fkTransportveroidTransportve2;
		}

		public long getFkParameterXOidPXV() {
			return this.fkParameterXOidPXV;
		}

		public void setFkParameterXOidPXV(long fkParameterXOidPXV) {
			this.fkParameterXOidPXV = fkParameterXOidPXV;
		}

		@Override
		public boolean equals(Object o) {
			if (o == this) {
				return true;
			}
			if ( ! (o instanceof ParameterXTvPK)) {
				return false;
			}
			ParameterXTvPK other = (ParameterXTvPK) o;
			return (this.fkTransportveroidTransportve2 == other.fkTransportveroidTransportve2)
				&& (this.fkParameterXOidPXV == other.fkParameterXOidPXV);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + ((int) (this.fkTransportveroidTransportve2 ^ (this.fkTransportveroidTransportve2 >>> 32)));
			hash = hash * prime + ((int) (this.fkParameterXOidPXV ^ (this.fkParameterXOidPXV >>> 32)));
			return hash;
		}

	}

