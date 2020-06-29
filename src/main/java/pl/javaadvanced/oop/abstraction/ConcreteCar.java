package pl.javaadvanced.oop.abstraction;

public class ConcreteCar extends Car {

    private int speed;

    public ConcreteCar(int speed, String name) {
        this.speed = speed;
        this.name = name; //ustawiam pole z nadklasy
    }

    @Override
    public String getSpeed() {
        return null;
    }
}
