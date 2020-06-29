package pl.javaadvanced.oop.encapsulation.car;

public class LuxuryCar extends Car {
    private String luxuryPackage;

    public String getCarInfo() {
        return "Luzury car: " +
                " brand : " + brand +
                " radio : " + radio +
                " engine : " + engine +
                " name : " + getName();
    }
}
