//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.entities.WindowObjectUsagPK.java
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
public class WindowObjectUsagPK implements Serializable {
		@Column(name="FK_WINDOWSECURITY", insertable=false, updatable=false)
		private String fkWindowsecurity2;

		@Column(name="FK_FUNKTION_SECOID", insertable=false, updatable=false)
		private long fkFunktionSecoid2;

		private static final long serialVersionUID = 1L;

		public WindowObjectUsagPK() {
			super();
		}

		public String getFkWindowsecurity2() {
			return this.fkWindowsecurity2;
		}

		public void setFkWindowsecurity2(String fkWindowsecurity2) {
			this.fkWindowsecurity2 = fkWindowsecurity2;
		}

		public long getFkFunktionSecoid2() {
			return this.fkFunktionSecoid2;
		}

		public void setFkFunktionSecoid2(long fkFunktionSecoid2) {
			this.fkFunktionSecoid2 = fkFunktionSecoid2;
		}

		@Override
		public boolean equals(Object o) {
			if (o == this) {
				return true;
			}
			if ( ! (o instanceof WindowObjectUsagPK)) {
				return false;
			}
			WindowObjectUsagPK other = (WindowObjectUsagPK) o;
			return this.fkWindowsecurity2.equals(other.fkWindowsecurity2)
				&& (this.fkFunktionSecoid2 == other.fkFunktionSecoid2);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + this.fkWindowsecurity2.hashCode();
			hash = hash * prime + ((int) (this.fkFunktionSecoid2 ^ (this.fkFunktionSecoid2 >>> 32)));
			return hash;
		}

	}

