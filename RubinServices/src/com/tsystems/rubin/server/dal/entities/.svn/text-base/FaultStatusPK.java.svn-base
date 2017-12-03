//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.entities.FaultStatusPK.java
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
public class FaultStatusPK implements Serializable {
	
		@Column(name="FK_FUEHRUNGOID_FUEHRUNG", insertable=false, updatable=false)
		private long fkFuehrungoidFuehrung;

		@Column(name="FK_FAULT_RECORDOID_FAULTRECORD", insertable=false, updatable=false)
		private long fkFaultRecordoidFaultrecord;

		private static final long serialVersionUID = 1L;

		public FaultStatusPK() {
			super();
		}

		public long getFkFuehrungoidFuehrung() {
			return this.fkFuehrungoidFuehrung;
		}

		public void setFkFuehrungoidFuehrung(long fkFuehrungoidFuehrung) {
			this.fkFuehrungoidFuehrung = fkFuehrungoidFuehrung;
		}

		public long getFkFaultRecordoidFaultrecord() {
			return this.fkFaultRecordoidFaultrecord;
		}

		public void setFkFaultRecordoidFaultrecord(long fkFaultRecordoidFaultrecord) {
			this.fkFaultRecordoidFaultrecord = fkFaultRecordoidFaultrecord;
		}

		@Override
		public boolean equals(Object o) {
			if (o == this) {
				return true;
			}
			if ( ! (o instanceof FaultStatusPK)) {
				return false;
			}
			FaultStatusPK other = (FaultStatusPK) o;
			return (this.fkFuehrungoidFuehrung == other.fkFuehrungoidFuehrung)
				&& (this.fkFaultRecordoidFaultrecord == other.fkFaultRecordoidFaultrecord);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + ((int) (this.fkFuehrungoidFuehrung ^ (this.fkFuehrungoidFuehrung >>> 32)));
			hash = hash * prime + ((int) (this.fkFaultRecordoidFaultrecord ^ (this.fkFaultRecordoidFaultrecord >>> 32)));
			return hash;
		}

	}