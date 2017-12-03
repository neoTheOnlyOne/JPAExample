//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.entities.WirdHergestelltPK.java
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
public class WirdHergestelltPK implements Serializable {
	
		@Column(name="FK_LINIENABSCHNOID")
		private long fkLinienabschnoid;

		@Column(name="FK_L_ABSCHNITTHOID")
		private long fkLAbschnitthoid;

		private static final long serialVersionUID = 1L;

		public WirdHergestelltPK() {
			super();
		}

		public long getFkLinienabschnoid() {
			return this.fkLinienabschnoid;
		}

		public void setFkLinienabschnoid(long fkLinienabschnoid) {
			this.fkLinienabschnoid = fkLinienabschnoid;
		}

		public long getFkLAbschnitthoid() {
			return this.fkLAbschnitthoid;
		}

		public void setFkLAbschnitthoid(long fkLAbschnitthoid) {
			this.fkLAbschnitthoid = fkLAbschnitthoid;
		}

		@Override
		public boolean equals(Object o) {
			if (o == this) {
				return true;
			}
			if ( ! (o instanceof WirdHergestelltPK)) {
				return false;
			}
			WirdHergestelltPK other = (WirdHergestelltPK) o;
			return (this.fkLinienabschnoid == other.fkLinienabschnoid)
				&& (this.fkLAbschnitthoid == other.fkLAbschnitthoid);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + ((int) (this.fkLinienabschnoid ^ (this.fkLinienabschnoid >>> 32)));
			hash = hash * prime + ((int) (this.fkLAbschnitthoid ^ (this.fkLAbschnitthoid >>> 32)));
			return hash;
		}

	}

