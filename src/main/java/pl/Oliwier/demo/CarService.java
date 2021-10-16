package pl.Oliwier.demo;

public class CarService {
     private int kolo=4 ;
    public void print_car(Car car){

        System.out.println(car);
    }
    public void koło_zapasowe(){
        System.out.println("Dodaje koło zapasowe:");
        kolo++;
        if(kolo>5){
            System.out.println("Nie można dodać Koła");
        }
        else{
            System.out.println("Dodaj koło");
            }
        }
    }

