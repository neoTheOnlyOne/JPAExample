//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.entities.HatAnsprechpartnePK.java
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
public class HatAnsprechpartnePK implements Serializable {

	
		@Column(name="FK_ANSPRECHPARTOID_ANSPRECHPAR")
		private long fkAnsprechpartoidAnsprechpar;

		@Column(name="FK_WORKING_AREAOID_WORKING_ARE")
		private long fkWorkingAreaoidWorkingAre;

		private static final long serialVersionUID = 1L;

		public HatAnsprechpartnePK() {
			super();
		}

		public long getFkAnsprechpartoidAnsprechpar() {
			return this.fkAnsprechpartoidAnsprechpar;
		}

		public void setFkAnsprechpartoidAnsprechpar(long fkAnsprechpartoidAnsprechpar) {
			this.fkAnsprechpartoidAnsprechpar = fkAnsprechpartoidAnsprechpar;
		}

		public long getFkWorkingAreaoidWorkingAre() {
			return this.fkWorkingAreaoidWorkingAre;
		}

		public void setFkWorkingAreaoidWorkingAre(long fkWorkingAreaoidWorkingAre) {
			this.fkWorkingAreaoidWorkingAre = fkWorkingAreaoidWorkingAre;
		}

		@Override
		public boolean equals(Object o) {
			if (o == this) {
				return true;
			}
			if ( ! (o instanceof HatAnsprechpartnePK)) {
				return false;
			}
			HatAnsprechpartnePK other = (HatAnsprechpartnePK) o;
			return (this.fkAnsprechpartoidAnsprechpar == other.fkAnsprechpartoidAnsprechpar)
				&& (this.fkWorkingAreaoidWorkingAre == other.fkWorkingAreaoidWorkingAre);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + ((int) (this.fkAnsprechpartoidAnsprechpar ^ (this.fkAnsprechpartoidAnsprechpar >>> 32)));
			hash = hash * prime + ((int) (this.fkWorkingAreaoidWorkingAre ^ (this.fkWorkingAreaoidWorkingAre >>> 32)));
			return hash;
		}

	}
