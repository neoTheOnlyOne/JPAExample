package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customerclass implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="OID_CUSTOMERCLASS")
	private Long id;

	@Column(name="CLASS")
	private String customerClass;

	@Column(name="CLASS_VISIBLE")
	private String classVisible;

	@OneToMany(mappedBy="customerClass")
	private Set<Carrier> carriers;

	@OneToMany(mappedBy="customerclass")
	private Set<Sla> slas;

	public Customerclass() {
		super();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the customerClass
	 */
	public String getCustomerClass() {
		return customerClass;
	}

	/**
	 * @param customerClass the customerClass to set
	 */
	public void setCustomerClass(String customerClass) {
		this.customerClass = customerClass;
	}

	/**
	 * @return the classVisible
	 */
	public String getClassVisible() {
		return classVisible;
	}

	/**
	 * @param classVisible the classVisible to set
	 */
	public void setClassVisible(String classVisible) {
		this.classVisible = classVisible;
	}

	/**
	 * @return the carriers
	 */
	public Set<Carrier> getCarriers() {
		return carriers;
	}

	/**
	 * @param carriers the carriers to set
	 */
	public void setCarriers(Set<Carrier> carriers) {
		this.carriers = carriers;
	}

	/**
	 * @return the slas
	 */
	public Set<Sla> getSlas() {
		return slas;
	}

	/**
	 * @param slas the slas to set
	 */
	public void setSlas(Set<Sla> slas) {
		this.slas = slas;
	}

}
