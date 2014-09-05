package com.yummynoodlebar.web.domain;

import java.io.Serializable;
import java.util.HashMap;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.BindingResult;

public class CustomerInfo implements Serializable {
	
	@NotNull
	@NotEmpty
	private String name;
	
	@NotNull
	@NotEmpty
	private String address1;
	
	@NotNull
	@NotEmpty
	private String postcode;
	
	private BindingResult validation;
	
	private HashMap<String, Boolean> errors;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	public void setValidation(BindingResult validation) {
		this.validation = validation;
	}
	
	public HashMap<String, Boolean> getErrors() {
		errors = new HashMap<String, Boolean>();
		if (validation == null) {
			errors.put("name", false);
			errors.put("address1", false);
			errors.put("postcode", false);
		} else {
			errors.put("name", validation.hasFieldErrors("name"));
			errors.put("address1", validation.hasFieldErrors("address1"));
			errors.put("postcode", validation.hasFieldErrors("postcode"));
		}
		return errors;
	}

}
