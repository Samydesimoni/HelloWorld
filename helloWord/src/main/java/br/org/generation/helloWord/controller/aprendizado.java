package br.org.generation.helloWord.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aprendizado")
public class aprendizado {
	
	@GetMapping
	public String aprendizados() {
		return "Aprendi sobre MySQL e Spring (servidor)";
		
		
		
	}

}
