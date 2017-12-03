//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.entities.GehoertZu0PK.java
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
public class GehoertZu0PK implements Serializable {
	
		@Column(name="FK_ANSPRECHPARTOID")
		private long fkAnsprechpartoid;

		@Column(name="FK_TRANSITOID_TRAN")
		private long fkTransitoidTran;

		private static final long serialVersionUID = 1L;

		public GehoertZu0PK() {
			super();
		}

		public long getFkAnsprechpartoid() {
			return this.fkAnsprechpartoid;
		}

		public void setFkAnsprechpartoid(long fkAnsprechpartoid) {
			this.fkAnsprechpartoid = fkAnsprechpartoid;
		}

		public long getFkTransitoidTran() {
			return this.fkTransitoidTran;
		}

		public void setFkTransitoidTran(long fkTransitoidTran) {
			this.fkTransitoidTran = fkTransitoidTran;
		}

		@Override
		public boolean equals(Object o) {
			if (o == this) {
				return true;
			}
			if ( ! (o instanceof GehoertZu0PK)) {
				return false;
			}
			GehoertZu0PK other = (GehoertZu0PK) o;
			return (this.fkAnsprechpartoid == other.fkAnsprechpartoid)
				&& (this.fkTransitoidTran == other.fkTransitoidTran);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + ((int) (this.fkAnsprechpartoid ^ (this.fkAnsprechpartoid >>> 32)));
			hash = hash * prime + ((int) (this.fkTransitoidTran ^ (this.fkTransitoidTran >>> 32)));
			return hash;
		}

	}