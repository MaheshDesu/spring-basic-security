package com.example.spring.security.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noAuth/rest")
public class NoAuthenticationController {
	
	@GetMapping("/sayHi")
	public String sayHi() {
		return "Hi";
	}

}
