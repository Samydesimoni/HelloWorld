package br.com.generation.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hello {
	
	@GetMapping("/")
	public String hellow() {
		
		return "Hello World! Hello String!";
	}
	
	@GetMapping("/bsm")
	public String bsm() { 
		return "Orientação ao Futuro \nResponsabilidade Pessoal /nMentalidade de Crescimento \nPersistÊncia \nTrabalho em Equipe \n"
			+ "Atenção aos Detalhes /nProatividade \nComunicação";
	}
	
	@GetMapping("/objetivo")
	public String objetivo() {
		return "Aprender o conceitos básicos do MySQL, e Spring Servidor";
	}
	
}
