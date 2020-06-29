package pl.javaadvanced.oop.abstraction;

public abstract class Car {
    protected String name;
    public abstract String getSpeed();

    public String getCarInfo() {
        return "Car name : " + name;
    }
}
