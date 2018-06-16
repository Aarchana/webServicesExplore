package com.webservice.starter.domain;

import javax.persistence.Entity;

@Entity
public class Permission {
	public UserType type;
	public UserAccessLevel accessType;
}
