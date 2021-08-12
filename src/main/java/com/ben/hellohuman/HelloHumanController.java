package com.ben.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "lastname", required = false) String lastname) {
		String output;
		if(name == null && lastname == null) {
			output = "<h1>Hello Human</h1>" + "<br> Welcome to Springboot!";
		} else if(lastname == null) {
			output = "Hello " + name + "<br> Welcome to Springboot!";
		} else {
			output = "Hello {name}" + name + " " + lastname + "Welcome to Springboot!";
		}
		
		return output;
	}
}
