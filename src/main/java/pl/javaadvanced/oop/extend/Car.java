package pl.javaadvanced.oop.extend;

public class Car {
    private String name;
    private String engine;

    public Car() {
    }

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
