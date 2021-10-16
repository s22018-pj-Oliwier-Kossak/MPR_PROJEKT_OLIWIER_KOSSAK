package pl.Oliwier.demo;

public class CarService {

    public void print_car(Car car){

        System.out.println(car);
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

