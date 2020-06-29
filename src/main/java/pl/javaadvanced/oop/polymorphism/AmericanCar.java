package pl.javaadvanced.oop.polymorphism;

public class AmericanCar extends Car {
    private String name;

    public AmericanCar(String name) {
        this.name = name;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() * 2;
    }
}
