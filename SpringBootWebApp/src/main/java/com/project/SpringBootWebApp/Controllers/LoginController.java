package com.project.SpringBootWebApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.project.SpringBootWebApp.Services.AuthenticateService;

@SessionAttributes("username")
@Controller
public class LoginController {

	@Autowired
	private AuthenticateService authenticateService;

	@RequestMapping("login")
	public String getLoginPage() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String getWelcomePage(@RequestParam String username, @RequestParam String password, ModelMap model) {
		if (authenticateService.authenticate(username, password)) {
			model.put("username", username);
			model.put("password", password);
			return "welcome";
		}
		model.put("errorMessage", "Inavlid Credentials! Please try again.");
		return "login";

	}
}
