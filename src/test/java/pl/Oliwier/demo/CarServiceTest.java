package pl.Oliwier.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarServiceTest {
    private CarService CarService= new CarService(null);
    @Test
    void shouldAddExtraWeels(){
        Car car =new Car("ford","focus",2,"321","niebieski",2000,4);
        CarService.addWheel(car);
        assertThat(car.getWheels()).isEqualTo(5);
    }

    @Test
    void shouldAddExtraWeels2(){
        Car car =new Car("ford","focus",2,"321","niebieski",2000,5);
        CarService.addWheel(car);
        assertThat(car.getWheels()).isEqualTo(5);
    }


    @Test
    void modelTest(){
        Car car =new Car(null,"focus",2,"321","niebieski",2000,4);
        String carModel=CarService.CarMethod2Marka(car,"ford");
        assertThat(carModel).isEqualTo("ford");
    }
    @Test
    void modelTest2(){
        Car car =new Car("","focus",2,"321","niebieski",2000,4);
        String carModel=CarService.CarMethod2Marka(car,"ford");
        assertThat(carModel).isEqualTo("ford");
    }

    @Test
    void WeigthTest(){
        Car car =new Car(null,"focus",2,"321","niebieski",1000,4);
        CarService.CarMethod3Weight(car);
        assertThat(car.getWeight()).isEqualTo(500);
    }
    @Test
    void WeigthTest2(){
        Car car =new Car(null,"focus",2,"321","niebieski",900,4);
        CarService.CarMethod3Weight(car);
        assertThat(car.getWeight()).isEqualTo(1800);
    }
    @Test
    void WeigthTest3(){
        Car car =new Car(null,"focus",2,"321","niebieski",2500,4);
        CarService.CarMethod3Weight(car);
        assertThat(car.getWeight()).isEqualTo(25000);
    }

    @Test
    void ColorTest(){
        Car car =new Car(null,"focus",2,"321","niebieki",2500,4);
        CarService.CarMethod5Color(car);
        assertThat(car.getColor()).isEqualTo("niebiekixd");
    }

    @Test
    void ColorTest2(){
        Car car =new Car(null,"focus",2,"321","niebieski",2500,4);
        CarService.CarMethod5Color(car);
        assertThat(car.getColor()).isEqualTo("NIEBIESKI");
    }
    @Test
    void CapacityTest(){
        Car car =new Car(null,"focus",1,"321","niebieski",2500,4);
        CarService.CarMethod6Capacity(car);
        assertThat(car.getModel()).isEqualTo("focus");
    }
    @Test
    void CapacityTest2(){
        Car car =new Car(null,null,3,"321","niebieski",2500,4);
        CarService.CarMethod6Capacity(car);
        assertThat(car.getModel()).isEqualTo("mustang");
    }
    @Test
    void VINTest(){
        Car car =new Car(null,null,3,null,"niebieski",2500,4);
        CarService.CarMethod4VIN(car);
        assertThat(car.getVIN()).isEqualTo("7312");
    }


}
