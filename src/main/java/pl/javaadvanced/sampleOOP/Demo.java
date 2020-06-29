package pl.javaadvanced.sampleOOP;

public class Demo {
    public static void main(String[] args) {
        Creature human1 = new Human("Jan Kowalski");
        Creature human2 = new Human("Paweł Bilski");
        Creature human3 = new Human("Paula Linicka");
        System.out.println(human1.getName());
        ((Human) human1).setInWater(true);
        ((Human) human2).setInWater(false);
        ((Human) human3).setInWater(true);

        Creature fish1 = new Fish("Skalar");
        Creature fish2 = new Fish("Bojownik");
        Creature fish3 = new Fish("Kirysek");

        fish1.move();
        fish2.move();
        fish3.move();
        human1.move();
        human2.move();
        human3.move();
    }
}
