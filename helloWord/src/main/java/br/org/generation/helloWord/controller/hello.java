package br.org.generation.helloWord.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hello {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World! Hello Spring!";
		
				
		
	}

}
