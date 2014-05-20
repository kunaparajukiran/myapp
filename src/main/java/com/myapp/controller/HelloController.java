package com.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping(value="/greeting")
	public @ResponseBody String sayHello(Model model) {
		  model.addAttribute("message", "Hello Spring MVC Framework!");
		  return "Helolo";
	}

}
