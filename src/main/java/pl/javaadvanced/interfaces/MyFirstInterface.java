package pl.javaadvanced.interfaces;

public interface MyFirstInterface {

    default void firstInterfaceDemoMethod() {
        System.out.println("First Interface Method called");
    }
}
