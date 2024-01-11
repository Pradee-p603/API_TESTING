package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;

public class UserRegistrationForm extends BaseForm {
	@NotEmpty(message = "first name is required")
	private String firstName;

	@NotEmpty(message = "last name is required")
	private String lastName;

	@NotEmpty(message = "loginid name is required")
	private String loginId;

	@NotEmpty(message = "password name is required")
	private String password;


	public String getFirstName() {
		return firstName;
	}

	public void setFirsName(String firsName) {
		this.firstName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	

}
