//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.entities.DnaEqhCardassignPK.java
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
public class DnaEqhCardassignPK implements Serializable {
		private String manufacturer;

		private String circuitpacktype;

		@Column(name="CTYP_ABBREVIATION")
		private String ctypAbbreviation;

		private static final long serialVersionUID = 1L;

		public DnaEqhCardassignPK() {
			super();
		}

		public String getManufacturer() {
			return this.manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		public String getCircuitpacktype() {
			return this.circuitpacktype;
		}

		public void setCircuitpacktype(String circuitpacktype) {
			this.circuitpacktype = circuitpacktype;
		}

		public String getCtypAbbreviation() {
			return this.ctypAbbreviation;
		}

		public void setCtypAbbreviation(String ctypAbbreviation) {
			this.ctypAbbreviation = ctypAbbreviation;
		}

		@Override
		public boolean equals(Object o) {
			if (o == this) {
				return true;
			}
			if ( ! (o instanceof DnaEqhCardassignPK)) {
				return false;
			}
			DnaEqhCardassignPK other = (DnaEqhCardassignPK) o;
			return this.manufacturer.equals(other.manufacturer)
				&& this.circuitpacktype.equals(other.circuitpacktype)
				&& this.ctypAbbreviation.equals(other.ctypAbbreviation);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + this.manufacturer.hashCode();
			hash = hash * prime + this.circuitpacktype.hashCode();
			hash = hash * prime + this.ctypAbbreviation.hashCode();
			return hash;
		}

	}



