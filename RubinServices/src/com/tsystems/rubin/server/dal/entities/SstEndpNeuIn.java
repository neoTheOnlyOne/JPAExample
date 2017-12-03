package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SST_ENDP_NEU_IN")
public class SstEndpNeuIn implements Serializable {
	@EmbeddedId
	private SstEndpNeuInPK sstEndpNeuInPK;

	@Column(name="BEMERKUNG_1")
	private String bemerkung1;

	@Column(name="BEMERKUNG_2")
	private String bemerkung2;

	@Column(name="BEMERKUNG_3")
	private String bemerkung3;

	private String carrier;

	@Column(name="END_ANSPR_TEL")
	private String endAnsprTel;

	@Column(name="END_FIRMENNAME")
	private String endFirmenname;

	@Column(name="END_FNAM")
	private String endFnam;

	@Column(name="END_ORTSNAME")
	private String endOrtsname;

	@Column(name="END_PLZ")
	private String endPlz;

	@Column(name="END_STRASSE")
	private String endStrasse;

	@Column(name="END_TEL")
	private String endTel;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="FK_SST_OMS_NDS_OMS_SUB_ID", referencedColumnName="OMS_SUB_ID"),
		@JoinColumn(name="FK_SST_OMS_NDS_OMS_ID", referencedColumnName="OMS_ID"),
		@JoinColumn(name="FK_SST_OMS_NDS_MES", referencedColumnName="MESSAGE_ID")
	})
	private SstOmsNdsIn sstOmsNdsIn;

	private static final long serialVersionUID = 1L;

	public SstEndpNeuIn() {
		super();
	}

	

	/**
	 * @return the sstEndpNeuInPK
	 */
	public SstEndpNeuInPK getSstEndpNeuInPK() {
		return sstEndpNeuInPK;
	}



	/**
	 * @param sstEndpNeuInPK the sstEndpNeuInPK to set
	 */
	public void setSstEndpNeuInPK(SstEndpNeuInPK sstEndpNeuInPK) {
		this.sstEndpNeuInPK = sstEndpNeuInPK;
	}



	public String getBemerkung1() {
		return this.bemerkung1;
	}

	public void setBemerkung1(String bemerkung1) {
		this.bemerkung1 = bemerkung1;
	}

	public String getBemerkung2() {
		return this.bemerkung2;
	}

	public void setBemerkung2(String bemerkung2) {
		this.bemerkung2 = bemerkung2;
	}

	public String getBemerkung3() {
		return this.bemerkung3;
	}

	public void setBemerkung3(String bemerkung3) {
		this.bemerkung3 = bemerkung3;
	}

	public String getCarrier() {
		return this.carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getEndAnsprTel() {
		return this.endAnsprTel;
	}

	public void setEndAnsprTel(String endAnsprTel) {
		this.endAnsprTel = endAnsprTel;
	}

	public String getEndFirmenname() {
		return this.endFirmenname;
	}

	public void setEndFirmenname(String endFirmenname) {
		this.endFirmenname = endFirmenname;
	}

	public String getEndFnam() {
		return this.endFnam;
	}

	public void setEndFnam(String endFnam) {
		this.endFnam = endFnam;
	}

	public String getEndOrtsname() {
		return this.endOrtsname;
	}

	public void setEndOrtsname(String endOrtsname) {
		this.endOrtsname = endOrtsname;
	}

	public String getEndPlz() {
		return this.endPlz;
	}

	public void setEndPlz(String endPlz) {
		this.endPlz = endPlz;
	}

	public String getEndStrasse() {
		return this.endStrasse;
	}

	public void setEndStrasse(String endStrasse) {
		this.endStrasse = endStrasse;
	}

	public String getEndTel() {
		return this.endTel;
	}

	public void setEndTel(String endTel) {
		this.endTel = endTel;
	}

	public SstOmsNdsIn getSstOmsNdsIn() {
		return this.sstOmsNdsIn;
	}

	public void setSstOmsNdsIn(SstOmsNdsIn sstOmsNdsIn) {
		this.sstOmsNdsIn = sstOmsNdsIn;
	}


}
