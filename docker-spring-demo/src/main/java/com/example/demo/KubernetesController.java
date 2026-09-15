package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KubernetesController {

	@GetMapping("/sayHi")
	public String sayHi(String str) {
		System.out.println("sayHi called");
		return "Welcome to Kubernetes Tutorials";
	}
	
	@GetMapping("/hello")
	public String hello(String str) {
		return "hello Kubernetes World";
	}
	

	@GetMapping("/contact")
	public String contact(String str) {
		return "Kubernetes Contact";
	}
	
	@GetMapping("/public/email")
	public String email(String str) {
		return "Kubernetes Contact@gmail.com";
	}
}
