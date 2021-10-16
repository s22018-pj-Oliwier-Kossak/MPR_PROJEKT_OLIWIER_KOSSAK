package pl.Oliwier.demo;

public class Car {
    private String Model;
    private float Engine;
    private String Color;
    private float Scales;
    private int kolo;

    Car(String Model,float Engine,String Color,float Scales,int kolo){
        this.Model=Model;
        this.Engine=Engine;
        this.Color=Color;
        this.Scales=Scales;
        this.kolo=kolo;

    }

    @Override
    public String toString() {
        return "Car{" +
                "Model='" + Model + '\'' +
                ", Engine=" + Engine +
                ", Color='" + Color + '\'' +
                ", Scales=" + Scales +
                ", kolo=" + kolo +
                '}';
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public float getEngine() {
        return Engine;
    }

    public void setEngine(float engine) {
        Engine = engine;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public float getScales() {
        return Scales;
    }

    public void setScales(float scales) {
        Scales = scales;
    }

    public int getKolo() {
        return kolo;
    }

    public void setKolo(int kolo) {
        this.kolo = kolo;
    }
}
