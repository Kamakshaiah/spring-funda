package com.springboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloWorldController {
	
	@GetMapping("")
	public String index() {
		return "Hi Welcome to Spring demo app..."; 
	}
	
	@GetMapping("/hello-world")
	public String helloworld() {
		return "Hello World!"; 
	}
}
