package com.rays.attachment;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public abstract class AttachmentBaseDTO {

	@Id
	@GeneratedValue(generator = "ncsPk")
	@GenericGenerator(name = "ncsPk", strategy = "native")
	@Column(name = "ID", unique = true, nullable = false)
	protected Long id;

	@Column(name = "NAME", length = 100)
	protected String name = null;

	@Column(name = "TYPE", length = 100)
	protected String type = null;

	@Column(name = "DESCRIPTION", length = 500)
	protected String description = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
