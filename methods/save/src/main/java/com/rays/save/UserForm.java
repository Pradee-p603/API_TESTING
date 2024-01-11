package com.rays.save;

import javax.validation.constraints.NotEmpty;

public class UserForm {
	private Long id;

	@NotEmpty(message = "firstName is required")
	private String firstName;

	@NotEmpty(message = "lastName is required")
	private String lastName;

	@NotEmpty(message = "login id is rquired")
	private String LoginId;

	@NotEmpty(message = "password is required")
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

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


	public UserDTO initDTO(UserDTO dto) {
		if (id != null && id > 0) {
			dto.setId(id);
		} else {
			dto.setId(null);

		}
		return dto;
	}

		public UserDTO getDTO() {
			UserDTO dto = initDTO(new UserDTO());
			dto.setFirstName(firstName);
			dto.setLastName(lastName);
			dto.setLoginId(LoginId);
			dto.setPassword(password);
			
			return dto;
		}
	}



