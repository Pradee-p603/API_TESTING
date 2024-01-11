package com.rays.authenticate;

import javax.validation.constraints.NotEmpty;

public class UserForm {
	@NotEmpty(message = "login id is required")
	private String LoginId;
	@NotEmpty(message = "password is required")
	private String password;
	public String getLoginId() {
		return LoginId;
	}
	public void setLoginId(String loginId) {
		LoginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
