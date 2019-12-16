package com.demo.firstApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping(value="/health")
	public String gethealth(){
		
		
		return "application up and running";
	}
	
	
}
