package pl.Oliwier.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class CarServiceTest {

    @Mock
    private CarRepository CarRepository;

    @InjectMocks
    private CarService CarService;

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
    @Test
    void ShouldFinID(){

        Mockito.when(CarRepository.findById(ArgumentMatchers.any()))
                .thenReturn(Optional.of(new Car()));
        Car car= CarService.finBYId(112L);
        assertThat(car).isNotNull();
    }
    @Test
    void notShouldFinID(){

        Mockito.when(CarRepository.findById(ArgumentMatchers.any())).thenReturn(Optional.empty());
        Car car= CarService.finBYId(1L);
        assertThat(car).isNull();
    }

    @Test
    void CarExistsById(){
        Mockito.when(CarRepository.existsById(ArgumentMatchers.any())).thenReturn(true);
        boolean car = CarService.carExistsbyId(1L);
        assertThat(car).isEqualTo(true);

    }

    @Test
    void CarNotExistsById(){
        Mockito.when(CarRepository.existsById(ArgumentMatchers.any())).thenReturn(false);
        boolean car = CarService.carExistsbyId(1L);
        assertThat(car).isEqualTo(false);
    }

    @Test
    void findAllbyId(){
        Mockito.when(CarRepository.findAll());
        List car = CarRepository.findAll();
        assertThat(car).isNotNull();
    }

    @Test
    void shouldCountCarById(){
       Mockito.when(CarRepository.count(ArgumentMatchers.any())).thenReturn(1L);
        Long car = CarService.countById(1L);
        assertThat(car).isEqualTo(1L);


    }



}
