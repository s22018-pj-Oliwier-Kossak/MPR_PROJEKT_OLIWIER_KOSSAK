package pl.Oliwier.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")

public class CarREstController {
    private final CarService carService;
    public CarREstController(CarService carService){
        this.carService=carService;
    }
  /*  @GetMapping
    public ResponseEntity<String> Hello(){

        return ResponseEntity.ok("hello World");
    } */
    @GetMapping
    public ResponseEntity<Car> CarSecondMethod(){

        return ResponseEntity.ok(carService.CarSecondMethod("model","color"));
    }
}
