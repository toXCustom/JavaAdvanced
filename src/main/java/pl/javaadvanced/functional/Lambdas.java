package pl.javaadvanced.functional;

public class Lambdas {
    public static void main(String[] args) {
        //thread po staremu
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Nowy wątek w akcji!");
            }
        });
        thread.start();

        //Java 8 style
        // () -> {}
        //zamiast robić new Runnable() robimy () -> {} bo to jest interfejs funkcyjny i wiadomo jaką metodę nadpisać
        Thread thread1 = new Thread(() -> {
            System.out.println("Nowy wątek z lambdy!");
        });
        thread1.start();

        //Lambda:
        //() - lista argumentów - z typami lub bez
        //

        Movable humanLongVersion = new Movable() {
            @Override
            public void walk() {
                System.out.println("I'm walking (version standard - pre Java 8)");
            }
        };
        humanLongVersion.walk();

        Movable human = () -> {
            System.out.println("I'm walking");
        };
        human.walk();

        /*String shark = "Shark";
        Swim<String> sharkSwimming = shark -> {}*/
    }
}
