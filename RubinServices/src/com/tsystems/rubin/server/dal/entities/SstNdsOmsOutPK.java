//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.dal.entities.SstNdsOmsOutPK.java
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
public class SstNdsOmsOutPK implements Serializable {
	
		@Column(name="OMS_SUB_ID")
		private String omsSubId;

		@Column(name="OMS_ID")
		private String omsId;

		@Column(name="MESSAGE_ID")
		private String messageId;

		private static final long serialVersionUID = 1L;

		public SstNdsOmsOutPK() {
			super();
		}

		public String getOmsSubId() {
			return this.omsSubId;
		}

		public void setOmsSubId(String omsSubId) {
			this.omsSubId = omsSubId;
		}

		public String getOmsId() {
			return this.omsId;
		}

		public void setOmsId(String omsId) {
			this.omsId = omsId;
		}

		public String getMessageId() {
			return this.messageId;
		}

		public void setMessageId(String messageId) {
			this.messageId = messageId;
		}

		@Override
		public boolean equals(Object o) {
			if (o == this) {
				return true;
			}
			if ( ! (o instanceof SstNdsOmsOutPK)) {
				return false;
			}
			SstNdsOmsOutPK other = (SstNdsOmsOutPK) o;
			return this.omsSubId.equals(other.omsSubId)
				&& this.omsId.equals(other.omsId)
				&& this.messageId.equals(other.messageId);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + this.omsSubId.hashCode();
			hash = hash * prime + this.omsId.hashCode();
			hash = hash * prime + this.messageId.hashCode();
			return hash;
		}

	}

