package com.osirees.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	
	@GetMapping(value = "/view")
	public String index(Model model) {
        model.addAttribute("recipient", "World");
        return "home";
    }
}
