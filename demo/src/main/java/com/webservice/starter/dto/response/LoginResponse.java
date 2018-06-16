package com.webservice.starter.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class LoginResponse {
	public String authToken;
}
