package pl.Oliwier.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
    public  Car(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Marka;
    private String Model;
    private float Capacity;
    private String VIN;
    private String Color;
    private int Weight;
    private int Wheels;


   Car(String Marka,String Model,float Capacity,String VIN,String Color,int Weight,int Wheels){
        this.Marka=Marka;
        this.Model=Model;
        this.Capacity=Capacity;
        this.VIN=VIN;
        this.Color=Color;
        this.Weight=Weight;
        this.Wheels=Wheels;

    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", Marka='" + Marka + '\'' +
                ", Model='" + Model + '\'' +
                ", Capacity=" + Capacity +
                ", VIN='" + VIN + '\'' +
                ", Color='" + Color + '\'' +
                ", Weight=" + Weight +
                ", Wheels=" + Wheels +
                '}';
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    public float getCapacity() {
        return Capacity;
    }

    public void setCapacity(float capacity) {
        Capacity = capacity;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getWheels() {
        return Wheels;
    }

    public void setWheels(int wheels) {
        Wheels = wheels;
    }
}
