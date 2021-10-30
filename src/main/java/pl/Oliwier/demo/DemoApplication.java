package pl.Oliwier.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	CarService CarService;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

}


