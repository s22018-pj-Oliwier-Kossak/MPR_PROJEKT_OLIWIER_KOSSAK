package pl.Oliwier.demo;

public class Car {
    private String Model;
    private float Engine;
    private String Color;
    private float Scales;

    Car(String Model,float Engine,String Color,float Scales){
        this.Model=Model;
        this.Engine=Engine;
        this.Color=Color;
        this.Scales=Scales;

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
}
