package com.osirees.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	
	@GetMapping(value = "/view")
	public String showHome() {
		return "home";
	}
}
