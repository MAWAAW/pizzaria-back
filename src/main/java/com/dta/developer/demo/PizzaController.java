package com.dta.developer.demo;

import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PizzaController {

	private PizzaRepository repository;
	
	public PizzaController(PizzaRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/best-pizzas")
    public Collection<Pizza> pizzas() {
        return repository.findAll();
    }

}
