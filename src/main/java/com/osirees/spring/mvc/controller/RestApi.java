package com.osirees.spring.mvc.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.osirees.spring.mvc.model.Profile;

@RestController
public class RestApi {

	@ResponseBody
	@GetMapping(value = "/api", produces=MediaType.APPLICATION_JSON_VALUE)
	public Profile testApi() {
		return new Profile("Deepak", "Mr", "Mumbai");
	}
}
