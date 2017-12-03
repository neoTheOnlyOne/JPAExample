//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.entities.BeziehtSichAufPK.java
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
public class BeziehtSichAufPK implements Serializable {
	
		@Column(name="FK_LINIENABSCHNOID")
		private Long fkLinienabschnoid;

		@Column(name="FK_NUTZUNGSRECHOID")
		private Long fkNutzungsrechoid;

		private static final long serialVersionUID = 1L;

		public BeziehtSichAufPK() {
			super();
		}

		public Long getFkLinienabschnoid() {
			return this.fkLinienabschnoid;
		}

		public void setFkLinienabschnoid(Long fkLinienabschnoid) {
			this.fkLinienabschnoid = fkLinienabschnoid;
		}

		public Long getFkNutzungsrechoid() {
			return this.fkNutzungsrechoid;
		}

		public void setFkNutzungsrechoid(Long fkNutzungsrechoid) {
			this.fkNutzungsrechoid = fkNutzungsrechoid;
		}

		@Override
		public boolean equals(Object o) {
			if (o == this) {
				return true;
			}
			if ( ! (o instanceof BeziehtSichAufPK)) {
				return false;
			}
			BeziehtSichAufPK other = (BeziehtSichAufPK) o;
			return (this.fkLinienabschnoid == other.fkLinienabschnoid)
				&& (this.fkNutzungsrechoid == other.fkNutzungsrechoid);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + ((int) (this.fkLinienabschnoid ^ (this.fkLinienabschnoid >>> 32)));
			hash = hash * prime + ((int) (this.fkNutzungsrechoid ^ (this.fkNutzungsrechoid >>> 32)));
			return hash;
		}

	}


