/**
 * 
 */
package com.spring.demo.model;

import java.io.Serializable;

/**
 * @date 2017年7月31日 下午3:36:24
 * @author tiankun
 * 
 */
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2951644283792084590L;
	
	private Integer id;
	private String fullName;
	private String country;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", fullName=" + fullName + ", country="
				+ country + "]";
	}
	
	
}
