package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
public class HelloController {
	
	@Value("${message:default}")
	String message;

	@GetMapping("/")
	public String welcome() {
		return "Welcome to Azure Spring Cloud";
	}
	
	@GetMapping("/message")
	public String printMessage() {
		return message;
	}
	
}
