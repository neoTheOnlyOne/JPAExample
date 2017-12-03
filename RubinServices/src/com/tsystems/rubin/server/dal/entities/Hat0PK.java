//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.entities.Hat0PK.java
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
public class Hat0PK implements Serializable {
	
		@Column(name="FK_LANDOID_LAND")
		private long fkLandoidLand;

		@Column(name="FK_RESPONSIBILIOID_RESPONSIBIL")
		private long fkResponsibilioidResponsibil;

		private static final long serialVersionUID = 1L;

		public Hat0PK() {
			super();
		}

		public long getFkLandoidLand() {
			return this.fkLandoidLand;
		}

		public void setFkLandoidLand(long fkLandoidLand) {
			this.fkLandoidLand = fkLandoidLand;
		}

		public long getFkResponsibilioidResponsibil() {
			return this.fkResponsibilioidResponsibil;
		}

		public void setFkResponsibilioidResponsibil(long fkResponsibilioidResponsibil) {
			this.fkResponsibilioidResponsibil = fkResponsibilioidResponsibil;
		}

		@Override
		public boolean equals(Object o) {
			if (o == this) {
				return true;
			}
			if ( ! (o instanceof Hat0PK)) {
				return false;
			}
			Hat0PK other = (Hat0PK) o;
			return (this.fkLandoidLand == other.fkLandoidLand)
				&& (this.fkResponsibilioidResponsibil == other.fkResponsibilioidResponsibil);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + ((int) (this.fkLandoidLand ^ (this.fkLandoidLand >>> 32)));
			hash = hash * prime + ((int) (this.fkResponsibilioidResponsibil ^ (this.fkResponsibilioidResponsibil >>> 32)));
			return hash;
		}

	}
