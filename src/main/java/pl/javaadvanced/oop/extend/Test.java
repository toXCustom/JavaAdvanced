package pl.javaadvanced.oop.extend;

public class Test /* extends java,lang.Object */{
    public static void main(String[] args) {
        Car car1 = new Car("Car 1", "Diesel 1.0");
        SportCar sportCar1 = new SportCar("SportCar1", "Diesel 3.5", true, "Red");

        //nazwa samochodu
        System.out.println(car1.getName());
        //nazwa sportowego samochodu
        System.out.println(sportCar1.getName());

        //dziedzicznie
        //Object -> Car -> SportCar

        System.out.println(sportCar1.carInfo());
        System.out.println("===================");
        System.out.println("get engine sport car");
        System.out.println(sportCar1.getEngine());
        System.out.println("get engine size");
        System.out.println(car1.getEngine());
    }
}
