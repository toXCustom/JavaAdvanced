package pl.javaadvanced.functional;

@FunctionalInterface
public interface HumanMovable {
    void move();

    default void walk() {
        System.out.println("Człowiek chodzi");
    }
}
