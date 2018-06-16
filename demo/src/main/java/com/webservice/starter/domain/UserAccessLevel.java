package com.webservice.starter.domain;

import org.springframework.security.core.GrantedAuthority;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UserAccessLevel implements GrantedAuthority {
	LOGIN("login");
	
	private final String identifier;

	UserAccessLevel(String identifier) {
	        this.identifier = identifier;
	    }

	    @JsonValue
	    @Override
	    public String getAuthority() {
	        return this.identifier;
	    }

	    @Override
	    public String toString() {
	        return identifier;
	    }
}
