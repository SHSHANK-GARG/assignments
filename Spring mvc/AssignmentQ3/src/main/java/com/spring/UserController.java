package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@RequestMapping(value = "/AssignmentQ3", method = RequestMethod.GET )
	public String webPage() {
		return "index";
	}
	
	@RequestMapping(value = "/AssignmentQ3", method = RequestMethod.POST)
	public String result(@ModelAttribute User user) {
		boolean valid = user.isValid(user.getEmail(), user.getPassword());
		if(valid=true) {
			return "Success";
		}
		else {
		return "Error";
	}
	}
}
