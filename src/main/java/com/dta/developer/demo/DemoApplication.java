package com.dta.developer.demo;

import java.util.Arrays;
import java.util.List;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	ApplicationRunner init(PizzaRepository repository) {

		List<Pizza> pizzas = Arrays.asList(new Pizza("PEP", "Peperonni", 11.5), new Pizza("FRO", "4 fromages", 10.),
				new Pizza("MAR", "Margherita", 9.5), new Pizza("REI", "Reine", 10.5),
				new Pizza("NAP", "Napolitaine", 12.), new Pizza("IND", "Indienne", 11.5),
				new Pizza("CAN", "Cannibal", 12.5), new Pizza("SAV", "Savoyarde", 12.));

		return args -> {
			pizzas.stream().forEach(pizza -> repository.save(pizza));
			repository.findAll().forEach(System.out::println);
		};
	}
}
