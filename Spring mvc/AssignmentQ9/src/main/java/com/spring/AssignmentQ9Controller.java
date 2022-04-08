package com.spring;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AssignmentQ9Controller
{
    @RequestMapping(value = { "/employ" }, method = { RequestMethod.GET })
    public String vis() {
        return "employ";
    }
    
    @RequestMapping(value = { "/employ" }, method = { RequestMethod.POST })
    public String vish() {
        return "employ2";
    }
    
    @RequestMapping(value = { "/employ1" }, method = { RequestMethod.POST })
    public String vish1() {
        return "employ3";
    }
}
