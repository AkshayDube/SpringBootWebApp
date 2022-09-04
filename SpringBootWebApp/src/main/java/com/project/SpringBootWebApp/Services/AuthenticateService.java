package com.project.SpringBootWebApp.Services;

import org.springframework.stereotype.Service;

@Service
public class AuthenticateService {

	public boolean authenticate(String username,String password) {
		boolean isValidUsername=username.equalsIgnoreCase("akshay");
		boolean isValidPassword=password.equalsIgnoreCase("123456");
		return isValidUsername && isValidPassword;
	}
}
