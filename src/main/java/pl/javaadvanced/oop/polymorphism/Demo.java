package pl.javaadvanced.oop.polymorphism;

public class Demo {
    public static void main(String[] args) {
        EuropeanCar europeanCar = new EuropeanCar("Ferrari", 305);
        AmericanCar americanCar = new AmericanCar("Dodge");
        americanCar.setSpeed(210);

        System.out.println("European car's speed: " + europeanCar.getSpeed());
        System.out.println("American car's speed: " + americanCar.getSpeed());

        System.out.println("------ GRUBA KRECHA ------");

        //typ ogólny - estawiamy do niego typ konkretny
        Car europeanCar2 = new EuropeanCar("Porsche", 260);
        Car americanCar2 = new AmericanCar("GMC");
        americanCar2.setSpeed(188);

        System.out.println("European second car's speed: " + europeanCar2.getSpeed());
        System.out.println("American second car's speed: " + americanCar2.getSpeed());

        //Castowanie czy inaczej rzutowanie
        System.out.println( ((EuropeanCar) europeanCar2).getName() );
    }
}
