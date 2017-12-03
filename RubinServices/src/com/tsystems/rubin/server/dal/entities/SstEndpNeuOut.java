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
@Table(name="SST_ENDP_NEU_OUT")
public class SstEndpNeuOut implements Serializable {
	@EmbeddedId
	private SstEndpNeuOutPK sstEndpNeuOutPK;

	@Column(name="BEMERKUNG_1")
	private String remark1;

	@Column(name="BEMERKUNG_2")
	private String remark2;

	@Column(name="BEMERKUNG_3")
	private String remark3;

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
		@JoinColumn(name="FK_SST_NDS_OMS_OMS_SUB_ID", referencedColumnName="OMS_SUB_ID"),
		@JoinColumn(name="FK_SST_NDS_OMS_OMS_ID", referencedColumnName="OMS_ID"),
		@JoinColumn(name="FK_SST_NDS_OMS_MES", referencedColumnName="MESSAGE_ID")
	})
	private SstNdsOmsOut sstNdsOmsOut;

	private static final long serialVersionUID = 1L;

	public SstEndpNeuOut() {
		super();
	}




	/**
	 * @return the sstEndpNeuOutPK
	 */
	public SstEndpNeuOutPK getSstEndpNeuOutPK() {
		return sstEndpNeuOutPK;
	}




	/**
	 * @param sstEndpNeuOutPK the sstEndpNeuOutPK to set
	 */
	public void setSstEndpNeuOutPK(SstEndpNeuOutPK sstEndpNeuOutPK) {
		this.sstEndpNeuOutPK = sstEndpNeuOutPK;
	}




	/**
	 * @return the remark1
	 */
	public String getRemark1() {
		return remark1;
	}

	/**
	 * @param remark1 the remark1 to set
	 */
	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	/**
	 * @return the remark2
	 */
	public String getRemark2() {
		return remark2;
	}

	/**
	 * @param remark2 the remark2 to set
	 */
	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	/**
	 * @return the remark3
	 */
	public String getRemark3() {
		return remark3;
	}

	/**
	 * @param remark3 the remark3 to set
	 */
	public void setRemark3(String remark3) {
		this.remark3 = remark3;
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

	public SstNdsOmsOut getSstNdsOmsOut() {
		return this.sstNdsOmsOut;
	}

	public void setSstNdsOmsOut(SstNdsOmsOut sstNdsOmsOut) {
		this.sstNdsOmsOut = sstNdsOmsOut;
	}

}
