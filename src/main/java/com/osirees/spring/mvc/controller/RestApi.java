package com.osirees.spring.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

	@ResponseBody
	@GetMapping(value = "/api", produces="application/json")
	public String testApi() {
		return "Success-6";
	}
}
