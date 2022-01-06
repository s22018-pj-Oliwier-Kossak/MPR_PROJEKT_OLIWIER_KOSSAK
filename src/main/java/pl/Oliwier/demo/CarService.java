package pl.Oliwier.demo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Optional;


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

        Car car=new Car("Ford",model,2,"212",color,2000,4);


        return CarRepository.save(car);


    }
    public String CarMethod2Marka(Car car,String marka){
        if(car.getMarka() == null || car.getMarka().isBlank()){
            car.setMarka(marka);
        }
        return car.getMarka();
    }
    public void CarMethod4VIN(Car car){
        String VIN=car.getVIN();
        if(VIN==null || VIN.isBlank()){
            VIN="7312";
            car.setVIN(VIN);
        }

        else{
            car.getVIN();
        }
    }

    public static void addWheel(Car car){

        int Wheels=car.getWheels();
        if(Wheels>=5){
            Wheels= car.getWheels();
            car.setWheels(Wheels);
            System.out.println("Nie można dodać Koła");
        }
        else{
            System.out.println("Dodaj koło");
            Wheels++;
            car.setWheels(Wheels);
        }
    }
    public void CarMethod3Weight(Car car){

        if(car.getWeight()==1000){
            int weight= car.getWeight()/2;
            car.setWeight(weight);
            System.out.println("Waga to "+weight);
        }
        else if(car.getWeight()<1000){
            int weight= car.getWeight()*2;
            car.setWeight(weight);
            System.out.println("Waga to "+weight);

        }
        else{
            int weight= car.getWeight()*10;
            car.setWeight(weight);
            System.out.println("Waga to "+weight);
        }
    }
    public void CarMethod5Color(Car car){
        String color=car.getColor();
        if(color=="niebieski"){

            color=car.getColor().toUpperCase(Locale.ROOT);
            car.setColor(color);
            System.out.println(color);

        }
        else{
            color=car.getColor()+"xd";
            car.setColor(color);
            System.out.println("color nie jest niebieski");

        }
    }
    public void CarMethod6Capacity(Car car){
        float capacity=  car.getCapacity();
        String model=car.getModel();
        if(capacity==2){
            model="focus";
            car.setModel(model);
            System.out.println("Model "+ model);
        }
        else if(capacity>2){
            model="mustang";
            car.setModel(model);
            System.out.println("Model "+ model);
        }
    }


    public List<Car> FindAllById(){

        return CarRepository.findAll();

    }

    public Long countById(Long id){

        return CarRepository.count();
    }
    public Car finBYId(Long id){
        Optional<Car> byId = CarRepository.findById(id);
        return  byId.orElse(null);
    }
    public boolean carExistsbyId(Long id){

        return CarRepository.existsById(id);

    }
    public void DeleteById(Car car){

         CarRepository.delete(car);

    }


}

