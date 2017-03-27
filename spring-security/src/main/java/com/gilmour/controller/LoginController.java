package com.gilmour.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by alicana on 27/03/2017.
 */

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
		System.out.println("In the login method");
		return "login";
		// tells internalViewResolver /WEB-INF/jsp/ directory look for login.jsp
	}

}
