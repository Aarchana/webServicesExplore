package com.webservice.starter.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class User {
	public Long id;
	@Column(name = "username", unique = true, nullable = false)
	@NotBlank
	public String username;
	public String firstName;
	public String lastName;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@Column(name = "password", nullable = false)
	@NotBlank
	@Size(min = 8, max = 255)
	public String password;
	public UserType type;
	@NotBlank
	@Email
	@Size(max = 255)
	public String email;
}
