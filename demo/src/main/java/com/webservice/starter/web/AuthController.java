package com.webservice.starter.web;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;

import com.webservice.starter.dto.response.LoginResponse;

@RestController
public class AuthController {
	
	@RequestMapping("/")
	public LoginResponse login( @RequestHeader("User-Info") String userAuthInfo) {
		return LoginResponse.builder().authToken(RequestContextHolder.currentRequestAttributes().getSessionId()).build();
	}
}
