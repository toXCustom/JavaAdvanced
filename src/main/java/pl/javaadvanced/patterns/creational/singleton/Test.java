package pl.javaadvanced.patterns.creational.singleton;

public class Test {

    public static void main(String[] args) {

        EagerSingleton.getInstance();

        //EagerSingleton singleton = new EagerSingleton(); //private konstruktor i nie możemy się do niego dostać

        EagerSingleton.getInstance();


        LazySingleton.getInstance();
        LazySingleton.getInstance();


        System.out.println(EagerSingleton.getInstance().getSth());
    }
}
