package pl.Oliwier.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")

public class CarREstController {
    private final CarService carService;
    public CarREstController(CarService carService){
        this.carService=carService;
    }
  /*  @GetMapping
    public ResponseEntity<String> Hello(){

        return ResponseEntity.ok("hello World");
    } */
    @GetMapping("/method/{model}/{color}")
    public ResponseEntity<Car> CarSecondMethod(@PathVariable String model,@PathVariable String color) {

        return  ResponseEntity.ok(carService.CarSecondMethod(model,color));
    }
    @GetMapping("/methods")
    public ResponseEntity<Car> CarSecondMethod2(@RequestParam String model, @RequestParam String color){

        return ResponseEntity.ok(carService.CarSecondMethod(model,color));
    }
}
