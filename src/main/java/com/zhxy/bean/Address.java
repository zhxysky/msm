package com.zhxy.bean;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;

public class Address {
	private String street;
	private String city;
	
	@XmlCDATA
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	@XmlCDATA
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
