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
@Table(name="SST_INFO_OUT")
public class SstInfoOut implements Serializable {
	@EmbeddedId
	private SstInfoOutPK sstInfoOutPK;

	@Column(name="INFOLINE_1")
	private String infoline1;

	@Column(name="INFOLINE_11")
	private String infoline11;

	@Column(name="INFOLINE_12")
	private String infoline12;

	@Column(name="INFOLINE_13")
	private String infoline13;

	@Column(name="INFOLINE_14")
	private String infoline14;

	@Column(name="INFOLINE_15")
	private String infoline15;

	@Column(name="INFOLINE_16")
	private String infoline16;

	@Column(name="INFOLINE_17")
	private String infoline17;

	@Column(name="INFOLINE_18")
	private String infoline18;

	@Column(name="INFOLINE_19")
	private String infoline19;

	@Column(name="INFOLINE_2")
	private String infoline2;

	@Column(name="INFOLINE_20")
	private String infoline20;

	@Column(name="INFOLINE_3")
	private String infoline3;

	@Column(name="INFOLINE_4")
	private String infoline4;

	@Column(name="INFOLINE_5")
	private String infoline5;

	@Column(name="INFOLINE_6")
	private String infoline6;

	@Column(name="INFOLINE_7")
	private String infoline7;

	@Column(name="INFOLINE_8")
	private String infoline8;

	@Column(name="INFOLINE_9")
	private String infoline9;

	private String infoline10;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="FK_SST_NDS_OMS_OMS_SUB_ID", referencedColumnName="OMS_SUB_ID"),
		@JoinColumn(name="FK_SST_NDS_OMS_OMS_ID", referencedColumnName="OMS_ID"),
		@JoinColumn(name="FK_SST_NDS_OMS_MES", referencedColumnName="MESSAGE_ID")
	})
	private SstNdsOmsOut sstNdsOmsOut;

	private static final long serialVersionUID = 1L;

	public SstInfoOut() {
		super();
	}

	/**
	 * @return the sstInfoOutPK
	 */
	public SstInfoOutPK getSstInfoOutPK() {
		return sstInfoOutPK;
	}

	/**
	 * @param sstInfoOutPK the sstInfoOutPK to set
	 */
	public void setSstInfoOutPK(SstInfoOutPK sstInfoOutPK) {
		this.sstInfoOutPK = sstInfoOutPK;
	}

	public String getInfoline1() {
		return this.infoline1;
	}

	public void setInfoline1(String infoline1) {
		this.infoline1 = infoline1;
	}

	public String getInfoline11() {
		return this.infoline11;
	}

	public void setInfoline11(String infoline11) {
		this.infoline11 = infoline11;
	}

	public String getInfoline12() {
		return this.infoline12;
	}

	public void setInfoline12(String infoline12) {
		this.infoline12 = infoline12;
	}

	public String getInfoline13() {
		return this.infoline13;
	}

	public void setInfoline13(String infoline13) {
		this.infoline13 = infoline13;
	}

	public String getInfoline14() {
		return this.infoline14;
	}

	public void setInfoline14(String infoline14) {
		this.infoline14 = infoline14;
	}

	public String getInfoline15() {
		return this.infoline15;
	}

	public void setInfoline15(String infoline15) {
		this.infoline15 = infoline15;
	}

	public String getInfoline16() {
		return this.infoline16;
	}

	public void setInfoline16(String infoline16) {
		this.infoline16 = infoline16;
	}

	public String getInfoline17() {
		return this.infoline17;
	}

	public void setInfoline17(String infoline17) {
		this.infoline17 = infoline17;
	}

	public String getInfoline18() {
		return this.infoline18;
	}

	public void setInfoline18(String infoline18) {
		this.infoline18 = infoline18;
	}

	public String getInfoline19() {
		return this.infoline19;
	}

	public void setInfoline19(String infoline19) {
		this.infoline19 = infoline19;
	}

	public String getInfoline2() {
		return this.infoline2;
	}

	public void setInfoline2(String infoline2) {
		this.infoline2 = infoline2;
	}

	public String getInfoline20() {
		return this.infoline20;
	}

	public void setInfoline20(String infoline20) {
		this.infoline20 = infoline20;
	}

	public String getInfoline3() {
		return this.infoline3;
	}

	public void setInfoline3(String infoline3) {
		this.infoline3 = infoline3;
	}

	public String getInfoline4() {
		return this.infoline4;
	}

	public void setInfoline4(String infoline4) {
		this.infoline4 = infoline4;
	}

	public String getInfoline5() {
		return this.infoline5;
	}

	public void setInfoline5(String infoline5) {
		this.infoline5 = infoline5;
	}

	public String getInfoline6() {
		return this.infoline6;
	}

	public void setInfoline6(String infoline6) {
		this.infoline6 = infoline6;
	}

	public String getInfoline7() {
		return this.infoline7;
	}

	public void setInfoline7(String infoline7) {
		this.infoline7 = infoline7;
	}

	public String getInfoline8() {
		return this.infoline8;
	}

	public void setInfoline8(String infoline8) {
		this.infoline8 = infoline8;
	}

	public String getInfoline9() {
		return this.infoline9;
	}

	public void setInfoline9(String infoline9) {
		this.infoline9 = infoline9;
	}

	public String getInfoline10() {
		return this.infoline10;
	}

	public void setInfoline10(String infoline10) {
		this.infoline10 = infoline10;
	}

	public SstNdsOmsOut getSstNdsOmsOut() {
		return this.sstNdsOmsOut;
	}

	public void setSstNdsOmsOut(SstNdsOmsOut sstNdsOmsOut) {
		this.sstNdsOmsOut = sstNdsOmsOut;
	}

}
