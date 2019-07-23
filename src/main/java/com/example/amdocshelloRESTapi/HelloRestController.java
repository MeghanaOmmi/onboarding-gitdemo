package com.example.amdocshelloRESTapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloRestController {
	@GetMapping("/hello")
	public String sayHello() {
		String str = "Hi!  I am Meghana and Welcome to REST API !!";
		return str; 
	}

}
