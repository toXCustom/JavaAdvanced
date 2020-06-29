package pl.javaadvanced.interfaces;

public class MultiInterfaceUser implements MyFirstInterface, DifferentInterface {

    @Override
    public void doSomethingStrange() {
        System.out.println("Do something strange!");
    }
}
