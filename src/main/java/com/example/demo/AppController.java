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
	
	@GetMapping("admin1")
	public String admin1() {
		
		return "welcome to admin1";
	}
	
	@GetMapping("admin1")
	public String admin2() {
		
		return "welcome to admin1";
	}
	
	@GetMapping("admin1")
	public String admin3() {
		
		return "welcome to admin1";
	}
	
	@GetMapping("admin1")
	public String admin4() {
		
		return "welcome to admin4";
	}

	@GetMapping("admin1")
	public String admin5() {
		
		return "welcome to admin5";
	}
	
	@GetMapping("admin1")
	public String admin6() {
		
		return "welcome to admin6";
	}
	
	@GetMapping("admin7")
	public String admin7() {
		
		return "welcome to admin7";
	}

}
