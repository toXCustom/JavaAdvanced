package pl.javaadvanced.oop.polymorphism;

public class EuropeanCar extends Car {
    private String name;

    public EuropeanCar(String name, int speed) {
        this.name = name;
        setSpeed(speed);
    }

    public String getName() {
        return name;
    }
}
