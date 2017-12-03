//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.entities.IstBestandteilVoPK.java
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
public class IstBestandteilVoPK implements Serializable {
	
		@Column(name="FK_INSTANDHALTUOUD")
		private long fkInstandhaltuoud;

		@Column(name="FK_SEEKABELVERTOID")
		private long fkSeekabelvertoid;

		private static final long serialVersionUID = 1L;

		public IstBestandteilVoPK() {
			super();
		}

		public long getFkInstandhaltuoud() {
			return this.fkInstandhaltuoud;
		}

		public void setFkInstandhaltuoud(long fkInstandhaltuoud) {
			this.fkInstandhaltuoud = fkInstandhaltuoud;
		}

		public long getFkSeekabelvertoid() {
			return this.fkSeekabelvertoid;
		}

		public void setFkSeekabelvertoid(long fkSeekabelvertoid) {
			this.fkSeekabelvertoid = fkSeekabelvertoid;
		}

		@Override
		public boolean equals(Object o) {
			if (o == this) {
				return true;
			}
			if ( ! (o instanceof IstBestandteilVoPK)) {
				return false;
			}
			IstBestandteilVoPK other = (IstBestandteilVoPK) o;
			return (this.fkInstandhaltuoud == other.fkInstandhaltuoud)
				&& (this.fkSeekabelvertoid == other.fkSeekabelvertoid);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + ((int) (this.fkInstandhaltuoud ^ (this.fkInstandhaltuoud >>> 32)));
			hash = hash * prime + ((int) (this.fkSeekabelvertoid ^ (this.fkSeekabelvertoid >>> 32)));
			return hash;
		}

	}