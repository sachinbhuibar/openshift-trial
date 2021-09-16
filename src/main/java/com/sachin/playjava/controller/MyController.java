package com.sachin.playjava.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyController {
	@GetMapping("/test-docker")
	public String getData() {
		return "in docker tutorial project play java: version 3";
	}
}


