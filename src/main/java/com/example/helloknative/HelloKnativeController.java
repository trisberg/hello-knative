package com.example.helloknative;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloKnativeController {

	@Value("${app.message:Knative}")
	String message;

	@GetMapping("/")
	public String home() {
		return "Hello " + message;
	}
}
