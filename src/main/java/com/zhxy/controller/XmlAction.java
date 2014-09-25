package com.zhxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.bean.Address;
import com.zhxy.bean.Customer;
import com.zhxy.bean.PhoneNumber;

@Controller
public class XmlAction {

	@RequestMapping(value = "/xml")
	public @ResponseBody
	Customer getUser() {
		Customer customer = new Customer();
		customer.setName("Jane Doe");

		Address address = new Address();
		address.setStreet("123 Any Street");
		address.setCity("My Town");
		customer.setAddress(address);

		PhoneNumber workPhoneNumber = new PhoneNumber();
		workPhoneNumber.setType("work");
		workPhoneNumber.setValue("613-555-1111");
		customer.getPhoneNumbers().add(workPhoneNumber);

		PhoneNumber cellPhoneNumber = new PhoneNumber();
		cellPhoneNumber.setType("cell");
		cellPhoneNumber.setValue("613-555-2222");
		customer.getPhoneNumbers().add(cellPhoneNumber);
		
		return customer;
	}

}
