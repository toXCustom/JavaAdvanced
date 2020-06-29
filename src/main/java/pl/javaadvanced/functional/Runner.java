package pl.javaadvanced.functional;

//interfejsy które mają jedną metodę abstrakcyjną
//nazywane są SAM - Single Abstract Method
//od Javy 8 można je oznaczać adnotacją
@FunctionalInterface
public interface Runner {
    void run();
}
