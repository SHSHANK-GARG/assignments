package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Assignment10Controller {
	@RequestMapping("/index")
	public String viewEmploy() {
		return "index";
	}
}
