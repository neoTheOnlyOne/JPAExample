package com.tsystems.rubin.server.dal.dvo;

import java.io.Serializable;
import java.sql.Date;

public class TerminalDVO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;

	private String codeInterrupt;

	private String description;

	private String referenceCode;

	private String remark;

	private String ituSuffix;

	private String spcNumber;

	private Date lastUpdate;

	private String updatedBy;

	private CarrierDVO carrierDVO;

	private CustomerDVO customerDVO;

	private SiteDVO siteDVO;
	public TerminalDVO(){}
	
	
	public TerminalDVO(Long id, String referenceCode, String description, Long siteId,
			String siteId2 ,String abbreviationInternational,Long carrierId, String carrierName) {
		
		this.id = id;
		this.referenceCode = referenceCode;
		this.description = description;
		if(siteId != null){
			this.siteDVO = new SiteDVO();
			this.siteDVO.setId(siteId);
			this.siteDVO.setSiteId(siteId2);
			this.siteDVO.setAbbreviationInternational(abbreviationInternational);
			}
		if(carrierId!=null){
			this.carrierDVO = new CarrierDVO();
			this.carrierDVO.setId(carrierId);
			this.carrierDVO.setName(carrierName);
		}
	}

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getCodeInterrupt() {
		return codeInterrupt;
	}



	public void setCodeInterrupt(String codeInterrupt) {
		this.codeInterrupt = codeInterrupt;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getReferenceCode() {
		return referenceCode;
	}



	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}



	public String getRemark() {
		return remark;
	}



	public void setRemark(String remark) {
		this.remark = remark;
	}



	public String getItuSuffix() {
		return ituSuffix;
	}



	public void setItuSuffix(String ituSuffix) {
		this.ituSuffix = ituSuffix;
	}



	public String getSpcNumber() {
		return spcNumber;
	}



	public void setSpcNumber(String spcNumber) {
		this.spcNumber = spcNumber;
	}



	public Date getLastUpdate() {
		return lastUpdate;
	}



	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}



	public String getUpdatedBy() {
		return updatedBy;
	}



	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}



	

	public CarrierDVO getCarrierDVO() {
		return carrierDVO;
	}



	public void setCarrierDVO(CarrierDVO carrierDVO) {
		this.carrierDVO = carrierDVO;
	}



	public CustomerDVO getCustomerDVO() {
		return customerDVO;
	}



	public void setCustomerDVO(CustomerDVO customerDVO) {
		this.customerDVO = customerDVO;
	}



	public SiteDVO getSiteDVO() {
		return siteDVO;
	}



	public void setSiteDVO(SiteDVO siteDVO) {
		this.siteDVO = siteDVO;
	}
	
}
