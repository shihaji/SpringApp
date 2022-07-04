package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	
	@GetMapping("home")
	public String home() {
		
		return "load balancer rocks now !!! and all looks good ";
	}
	
	
	@GetMapping("admin")
	public String admin() {
		
		return "welcome to admin have a nice day";
	}
	


}