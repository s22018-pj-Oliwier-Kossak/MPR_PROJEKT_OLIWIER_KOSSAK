package pl.Oliwier.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Car car1 = new Car("Ford",2,"zielony", 1400);
		car1.setColor("zielony");
		car1.setModel("ford");
		car1.setEngine(17);
		car1.setScales(2000);
		CarService.print_car();

	}

}


