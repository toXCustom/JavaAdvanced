package pl.javaadvanced.oop.abstraction;

public class Test {
    public static void main(String[] args) {
        //test inicjowania abstrakcyjnej klasy
        //Car car = new Car();

        ConcreteCar concreteCar = new ConcreteCar(200, "Auto 1");

        System.out.println(concreteCar.getSpeed()); //metoda bezpośrednio z klasy
        System.out.println(concreteCar.getCarInfo()); //metoda z nadklasy
    }
}
