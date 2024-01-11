package com.rays.common;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseForm {

	private Long Id;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	
	

}
