package br.org.generation.helloWord.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class listabsm {
	
	@GetMapping
	public String bsm() {
		return "Orientação ao Futuro <br> Responsabilidade Pessoal <br> Mentalidade de Crescimento <br> PersistÊncia \nTrabalho em Equipe <br> Atenção aos Detalhes <br> Proatividade <br> Comunicação";
		
				
	}
	
	

}
