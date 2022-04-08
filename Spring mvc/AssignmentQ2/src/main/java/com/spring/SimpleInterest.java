package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleInterest {
	@RequestMapping(value = "/before", method = RequestMethod.GET)
	public String interest() {
		return "before";
	}
	
	@RequestMapping(value = "/before", method = RequestMethod.POST)
	public String result(@RequestParam("principal")int principal,
			   @RequestParam("rate")int rate,
			   @RequestParam("time")int time, ModelMap mv) {
		mv.addAttribute("principal",principal);
		mv.addAttribute("rate",rate);
		mv.addAttribute("rate",rate);
		return "after";
	}
}
