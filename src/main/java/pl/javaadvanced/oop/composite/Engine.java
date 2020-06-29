package pl.javaadvanced.oop.composite;

public class Engine {
    private String fuel;
    private String size;

    //klasa z konstruktorem ale bez setterów, to tak zwana immutable class
    public Engine(String fuel, String size) {
        this.fuel = fuel;
        this.size = size;
    }

    public String getFuel() {
        return fuel;
    }

    public String getSize() {
        return size;
    }
}
