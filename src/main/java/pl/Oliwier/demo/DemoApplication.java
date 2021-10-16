package pl.Oliwier.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Car car1 = new Car("Ford",2,"zielony", 1400,4);
		CarService CarService=new CarService();
		car1.toString();
		CarService.print_car(car1);
		CarService.koło_zapasowe(car1);
	}

}


