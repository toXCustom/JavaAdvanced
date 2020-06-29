package pl.javaadvanced.functional;

@FunctionalInterface
public interface Swim<T> {
    String swim(T t);
}
