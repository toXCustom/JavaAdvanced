package pl.javaadvanced.oop.composite;

public class Test {
    public static void main(String[] args) {
        Engine engine = new Engine("Diesel", "5.0");
        engine.getFuel(); //nie ma setterow, raz powolany obiekt zawsze zostanie taki sam - immutable class

        Car car1 = new Car("V40", "Volvo");
        car1.setEngine(engine);

        Car car2 = new Car("V70", "Volvo", engine);

        Car car3 = new Car("V50", "Volvo", new Engine("Petrol", "2.0"));

        System.out.println("Car 1 engine : fuel");
        System.out.println(car1.getEngine().getFuel());

        System.out.println("Car2 engine : size");
        System.out.println(car2.getEngine().getFuel());

        System.out.println("Car 3 engine: ");
        System.out.println(car3.getEngine());

        Engine newEngine = car3.getEngine();
        //newEngine można przekazać
        Car car4 = new Car("Focus", "Ford", newEngine);
    }
}
