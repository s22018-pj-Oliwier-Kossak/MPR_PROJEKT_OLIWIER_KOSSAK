package pl.Oliwier.demo;

import org.springframework.stereotype.Service;

@Service
public class CarService {
    private final CarRepository CarRepository;

    public CarService(CarRepository carRepository) {
        CarRepository = carRepository;
    }

    public void print_car(Car car){

        System.out.println(car);
    }
    public Car CarSecondMethod(String model,String color){

        Car car=new Car(model,1,color,4,5);
        Car car1=new Car("ford",2,"neivieski",32,32);

        return CarRepository.save(car1);


    }
    public static void koło_zapasowe(Car car){
        System.out.println("Dodaje koło zapasowe:");
        int kolo=car.getKolo();
        if(kolo>5){
            System.out.println("Nie można dodać Koła");
        }
        else{
            System.out.println("Dodaj koło");
            kolo++;
            }
        }



}

