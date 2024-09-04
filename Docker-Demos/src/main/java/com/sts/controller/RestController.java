package com.sts.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController

public class RestController {

	@GetMapping("/docker")
	public String getShow() {
		
		return "Docker demo sucess";
	}
	
}
