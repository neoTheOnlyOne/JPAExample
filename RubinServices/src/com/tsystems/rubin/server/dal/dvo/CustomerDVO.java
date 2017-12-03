package com.tsystems.rubin.server.dal.dvo;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import com.tsystems.rubin.server.dal.entities.Circuit;
import com.tsystems.rubin.server.dal.entities.City;
import com.tsystems.rubin.server.dal.entities.Terminal;

public class CustomerDVO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;

	private String name1;

	private String nameSearch;

	private String name2;

	private String remark;

	private String updatedBy;

	private Date lastUpdate;

	//private CustomerType customerType;

	private City city;

	private Set<Terminal> terminals;

	private Set<Circuit> circuits;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getNameSearch() {
		return nameSearch;
	}

	public void setNameSearch(String nameSearch) {
		this.nameSearch = nameSearch;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	// public CustomerType getCustomerType() {
	// return customerType;
	// }
	//
	// public void setCustomerType(CustomerType customerType) {
	// this.customerType = customerType;
	// }

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Set<Terminal> getTerminals() {
		return terminals;
	}

	public void setTerminals(Set<Terminal> terminals) {
		this.terminals = terminals;
	}

	public Set<Circuit> getTransportverbinduns() {
		return circuits;
	}

	public void setTransportverbinduns(Set<Circuit> transportverbinduns) {
		this.circuits = transportverbinduns;
	}


}
